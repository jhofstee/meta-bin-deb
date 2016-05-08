#!/usr/bin/python

import re
import os
import subprocess
import sys
from urlparse import urlparse
from os.path import basename
import shutil
from collections import OrderedDict

""" Info about a deb file """
class DebPackage:

	""" init deb_file to get info about """
	def __init__(self, local_file_name):
		self.info = {}
		self.local_file_name = local_file_name
		self.depends_fullfilled = False
		self.url = ""

	""" call dpkg to act on the deb file """
	def call_dpkg(self, args):
		cmd = ["dpkg", "--admindir=debroot/var/lib/dpkg", "--instdir=rootfs", "--force-architecture"]
		cmd.extend(args)
		#print(cmd)
		out = subprocess.check_output(cmd).strip()
		print(out)
		return out

	""" get and parse the info of the debfile """
	def get_dpk_info(self):

		""" only call dpkg once """
		if len(self.info) > 0:
			return

		info = self.call_dpkg(["-I", self.local_file_name])
		""" XXX: check failure.... """

		lines = info.split('\n')
		label = ""

		""" mind the spaces... """
		for line in lines:
			labelLine = re.match(r'^ ([a-zA-Z\-]*): (.*)', line)
			if labelLine:
				label = labelLine.group(1)
				self.info[label] = labelLine.group(2)
			else:
				if label != "":
					self.info[label] += "\n" + line[1:]

	""" get the dependencies, note this returns a array with min version as well """
	def get_depends(self):
		self.get_dpk_info()
		if not "Depends" in self.info:
			return [];
		depends = self.info["Depends"].split(",")
		return [line.strip() for line in depends]

	"""
	mmmm, deb support a-1 | a-2 syntax, hack around always choose the last
	"""
	def get_chosen_depends(self):
		ret = []
		depends = self.get_depends()
		for depend in depends:
			last = depend.split("|")[0].strip()
			last = re.sub(r':any', r'', last)
			print("CHOSEN: " + last)
			ret.append(last)
		return ret

	def get_chosen_depends_no_version(self):
		depends = self.get_chosen_depends()
		for i in range(len(depends)):
			depends[i] = re.sub(r'\([A-Za-z0-9+-.<>=: ~]*\)', r'', depends[i]).strip()
		return depends

	def shipped_files(self):
		contents = {}
		text = self.call_dpkg(['-c', self.local_file_name])
		# mind it, date takes two fields
		lines = text.split("\n")
		print(lines)
		for line in lines:
			parts = line.split()
			if 'd' in parts[0]:
				continue
			contents[parts[5]] = 1
		print(contents)
		return contents

	def deb_url(self):
		return self.url.replace("'", "")

	""" Get the filename from the url """
	def deb_file_name(self):
		url = self.url.replace("'", "")
		urlinfo = urlparse(url)
		return basename(urlinfo.path)

	def oe_hashes(self):
		ret = {}
		ret["md5sum"] = subprocess.check_output(["md5sum", self.local_file_name]).split(" ")[0]
		ret["sha256sum"] = subprocess.check_output(["sha256sum", self.local_file_name]).split(" ")[0]
		return ret

	"""
	Write bitbake file to install the deb and its dependencies.
	This provide a single recipe per package.
	"""
	def write_bb(self, meta_path):
		bb_base_name = self.info['Package'] + "_" + self.info['Version'].split(':')[-1]  + ".bb"
		#bb_sub_dir = "install-" + self.info["Section"]
		bb_sub_dir = ""
		bb_path = os.path.join(meta_path, bb_sub_dir)
		bb_file_name = os.path.join(bb_path, bb_base_name)

		if not os.path.exists(bb_path):
			os.makedirs(bb_path)

		print("writing bb recipe " + bb_file_name)
		f = open(bb_file_name, 'w')
		f.write('PACKAGES = "' + self.info['Package'] + '"\n')
		f.write('DESCRIPTION = "\\\n')
		f.write(self.info['Description'].replace("\n ", "\n").replace("\n.", "\n").replace("\n", "\\\n"))
		f.write('"\n')
		if 'Homepage' in self.info:
			f.write('HOMEPAGE = "' + self.info['Homepage'] + '"\n');
		f.write('SECTION = "' + self.info["Section"] + '"\n');
		f.write('\n')

		f.write('# Prebuilt binaries, no need for any default dependencies\n')
		f.write('INHIBIT_DEFAULT_DEPS = "1"\n')
		f.write('INHIBIT_PACKAGE_STRIP = "1"\n')
		f.write('INSANE_SKIP_${PN} += "already-stripped"\n')

		if 'Depends' in self.info:
			f.write('#Depends: ' + self.info['Depends'] + '\n')
			depends = self.get_chosen_depends()
			f.write('DEPENDS = "' + ' '.join(depends) + '"\n\n')
			f.write('RDEPENDS_${PN} = "' + ' '.join(depends) + '"\n\n')


		f.write('DEB_FILE_NAME = "' + deb.deb_file_name() + '"\n')
		f.write('SRC_URI = "' + url + ';unpack=0"\n')

		md5sum = subprocess.check_output(["md5sum", self.local_file_name]).split(" ")[0]
		f.write('SRC_URI[md5sum] = "' + md5sum + '"\n')

		sha256sum = subprocess.check_output(["sha256sum", self.local_file_name]).split(" ")[0]
		f.write('SRC_URI[sha256sum] = "' + sha256sum + '"\n')

		f.write('\n')
		f.write('inherit deb\n')

		f.write('\n')
		f.write("#FAKE LICENSE FOR TESTING!!!\n")
		f.write('LICENSE = "MIT"\n')
		f.write('LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"\n')

		f.write('\n')
		f.write('FILES_${PN} = "/"')

		print(self.info)

	def oe_recipe(self):
		if "Source" in self.info:
			ret = self.info['Source']
			ret = re.sub(r'\([A-Za-z0-9+-.():]*\)', r'', ret).strip()
			ret = re.sub(r'-defaults$', r'', ret)
		else:
			ret = self.info['Package']
		return ret

""" alternative oe recipes, with one recipe providing multi packages, like -dev etc """
class OeDebRecipe:

	def __init__(self, recipe_name):
		self.recipe_name = recipe_name
		self.deb_packages = []

	def add_deb(self, deb):
		self.deb_packages.append(deb)

	def write_bb(self, meta_path):
		# TODO: sanity check versions (all should be the same)
		bb_base_name = self.recipe_name + "_" + self.deb_packages[0].info['Version'] + ".bb"

		#bb_sub_dir = "install-" + self.info["Section"]
		bb_sub_dir = ""
		bb_path = os.path.join(meta_path, bb_sub_dir)
		bb_file_name = os.path.join(bb_path, bb_base_name)

		if not os.path.exists(bb_path):
			os.makedirs(bb_path)

		print("writing bb recipe " + bb_file_name)
		f = open(bb_file_name, 'w')
		packages = ""
		deb_urls = []
		deb_files = []
		for deb in self.deb_packages:
			packages += deb.info['Package'] + " "
			deb_urls.append(deb.deb_url())
			deb_files.append(deb.deb_file_name())

		f.write('PACKAGES = "' + packages.strip() + '"\n');
		f.write('PROVIDES = "' + packages.strip() + '"\n');

		f.write('SRC_URI = " \\\n')
		n = 0
		for url in deb_urls:
			f.write('	' + url + ';unpack=0;name=deb' + str(n) + '\\\n')
			n = n + 1

		f.write('"\n')

		n = 0
		for deb in self.deb_packages:
			f.write('DEBFILENAME_' + deb.info['Package'] + ' = "' + deb.deb_file_name() + '"\n')
			hashes = deb.oe_hashes()
			f.write('SRC_URI[deb' + str(n) + '.sha256sum] = "' + hashes["sha256sum"] + '"\n')
			f.write('SRC_URI[deb' + str(n) + '.md5sum] = "' + hashes["md5sum"] + '"\n')
			n = n + 1

		f.write('\n')

		all_depends = []
		for deb in self.deb_packages:
			if 'Depends' in deb.info:
				depends = deb.get_chosen_depends()
				f.write('RDEPENDS_' + deb.info['Package'].replace(self.recipe_name, "${PN}") + ' = "' + ' '.join(depends) + '"\n')
				all_depends.extend(deb.get_chosen_depends_no_version())

		if len(all_depends):
			all_depends = set(all_depends)
			for deb in self.deb_packages:
				if deb.info['Package'] in all_depends:
					all_depends.remove(deb.info['Package'])
			print(all_depends)
			if len(all_depends):
				f.write('DEPENDS = "' + ' '.join(all_depends) + '"\n\n')

		f.write('\n')
		f.write('inherit deb_group\n')

		f.write('\n')
		f.write('# Prebuilt binaries, no need for any default dependencies\n')
		f.write('INHIBIT_DEFAULT_DEPS = "1"\n')
		f.write('INHIBIT_PACKAGE_STRIP = "1"\n')
		f.write('INSANE_SKIP_${PN} += "already-stripped"\n')
		f.write('\n')

		for deb in self.deb_packages:
			contents = deb.shipped_files()
			package = deb.info['Package']
			if package == self.recipe_name:
				package = "${PN}"
			elif package == self.recipe_name + "-dev":
				package = "${PN}-dev"
			f.write('FILES_' + package + ' = " \\\n\t')
			f.write(" \\\n\t".join(contents.keys()))
			f.write('\\\n"\n')

		f.write("#FAKE LICENSE FOR TESTING!!!\n")
		f.write('LICENSE = "MIT"\n')
		f.write('LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"\n')
		f.close()


""" Load deb files and create OE recipes from them """
class OeMetaGenerator:

	def __init__(self, apt_conf, deb_path, deb_download, meta_generated, deb_sources):
		self.packages = {}
		self.apt_conf = apt_conf
		self.deb_path = deb_path
		self.deb_download = deb_download
		self.meta_path = meta_generated
		self.deb_sources = deb_sources

	def check_setup(self):

		if os.path.exists(self.deb_path):
			bb.plain("using existing deb feed")
			return

		bb.plain("setting up deb feed")
		shutil.rmtree(self.deb_path, True)

		os.makedirs(os.path.join(self.deb_path, "debroot/etc/var/lib/dpkg"))
		os.mknod(os.path.join(self.deb_path, "debroot/etc/var/lib/dpkg/status"))

		os.makedirs(os.path.join(self.deb_path, "debroot/var/lib/dpkg/available"))
		os.makedirs(os.path.join(self.deb_path, "debroot/var/lib/dpkg/info"))
		os.makedirs(os.path.join(self.deb_path, "debroot/var/lib/dpkg/updates"))

		os.makedirs(os.path.join(self.deb_path, "debroot/etc/apt/preferences.d"))
		os.makedirs(os.path.join(self.deb_path, "debroot/var/lib/apt/etc/apt/lists/partial"))
		os.makedirs(os.path.join(self.deb_path, "debroot/var/cache/apt/archives/partial"))

		self.write_apt_conf(self.deb_path + "/debroot/etc/apt/apt.conf")

		f = open(self.deb_path + "/debroot/etc/apt/sources.list", 'w')
		f.write(self.deb_sources)
		f.close()
		self.apt_get(["update"])

		# workaround for bitbake package-index, normally done by apt-native, but using host tools..
		etc = d.getVar("STAGING_ETCDIR_NATIVE", True)
		apt_conf = os.path.join(etc, "apt", "apt.conf.sample")
		if os.path.isfile(apt_conf):
			return
		core_base = d.getVar("COREBASE", True)
		os.makedirs(os.path.abspath(apt_conf + "/.."))
		shutil.copyfile(core_base + "/meta/recipes-devtools/apt/files/apt.conf", apt_conf)
		os.remove(apt_conf)

	def write_apt_conf(self, apt_conf):
		f = open(apt_conf, 'w')

		deb_rootfs = os.path.join(self.deb_path, "debroot")
		f.write('Dir "' + deb_rootfs + '/"\n')
		f.write('{\n')
		f.write('   State "var/lib/apt/"\n')
		f.write('   {\n')
		f.write('      Lists "etc/apt/lists/";\n')
		f.write('      status "' + deb_rootfs + '/etc/var/lib/dpkg/status";\n')
		f.write('   };\n')
		f.write('   Cache "var/cache/apt/"\n')
		f.write('   {\n')
		f.write('      Archives "archives/";\n')
		f.write('   };\n')
		f.write('   Bin "/usr/bin/"\n')
		f.write('   {\n')
		f.write('      methods "/usr/lib/apt/methods/";\n')
		f.write('      gzip "/bin/gzip";\n')
		f.write('      dpkg "dpkg";\n')
		f.write('      apt-get "apt-get";\n')
		f.write('      apt-cache "apt-cache";\n')
		f.write('   };\n')
		f.write('   Etc "etc/apt"\n')
		f.write('   {\n')
		f.write('      Preferences "preferences";\n')
		f.write('   };\n')
		f.write('};\n')
		f.write('\n')
		f.write('APT\n')
		f.write('{\n')
		f.write('  Install-Recommends "true";\n')
		f.write('  Immediate-Configure "false";\n')
		f.write('  Architecture "armhf";\n')
		f.write('  Get\n')
		f.write('  {\n')
		f.write('     Assume-Yes "true";\n')
		f.write('     Force-Yes "true"\n')
		f.write('  };\n')
		f.write('};\n')
		f.write('\n')
		f.write('DPkg::Options {"-admindir=' + deb_rootfs + '/etc/var/lib/dpkg";"--force-all";"--no-debsig"};\n')

	def apt_get(self, args):
		cmd = ["apt-get", "-c", self.deb_path + "/debroot/etc/apt/apt.conf"]
		cmd.extend(args)
		#print(cmd)

		""" if not ok raise? """

		out = subprocess.check_output(cmd).strip()
		#print(out)
		return out

	def apt_cache(self, args):
		cmd = ["apt-cache", "-c", self.deb_path + "/debroot/etc/apt/apt.conf"]
		cmd.extend(args)
		#print(cmd)

		""" if not ok raise? """

		out = subprocess.check_output(cmd).strip()
		#print(out)
		return out

	""" info needed to lookup the name of the debfile for package_name """
	def apt_get_download_info(self, package_name):
		try:
			ret = self.apt_get(["--print-uris", "download", package_name])
		except subprocess.CalledProcessError:
			bb.error("print-uris failed for " + package_name + " (no such package?)")
			exit()

		return ret

	""" do actually download the deb file """
	def apt_get_download(self, package_name):
		self.apt_get(["download", "--allow-unauthenticated", package_name])

	def register_deb(self, deb_file_name):
		deb = DebPackage(deb_file_name)
		#print(deb_file_name)
		deb.get_dpk_info()
		self.packages[deb.info['Package']] = deb
		#print(deb.info)
		return deb

	def apt_get_info(self, package_name):
		info = {}
		apt_uri = self.apt_get_download_info(package_name)
		parts = apt_uri.split(" ")
		info['uri'] = parts[0]
		#self.deb_file = parts[1]
		#self.size = parts[2]
		#self.hash = parts[3]
		#print(self.hash)
		return info

	def download_deb(self, package_name):
		if not os.path.isdir(self.deb_download):
			bb.error("apparently the download dir '" + self.deb_download + "' does not exist, giving up")
			exit();

		info_line = self.apt_get_download_info(package_name)
		info = info_line.split(" ")

		uri = info[0]
		deb_file_name = info[1]
		print("deb_file_name: " + deb_file_name)
		size = info[2]
		hash = info[3]

		if os.path.isfile(self.deb_download + "/" + deb_file_name):
			print("deb file cached " + deb_file_name)
			return self.register_deb(self.deb_download + "/" + deb_file_name)

		print("downloading " + package_name)
		self.apt_get_download(package_name)
		os.rename(deb_file_name, self.deb_download + "/" + deb_file_name)
		return self.register_deb(self.deb_download + "/" + deb_file_name)

	def add_deb(self, package_name, and_depends = True):
		if package_name in self.packages:
			return self.packages[package_name]
		deb = self.download_deb(package_name)
		if and_depends:
			self.check_depends_of_deb(deb)
		return deb

	def scan_download_dir(self):
		print("=== loading obtained packages ===")
		deb_files = os.listdir(self.deb_download)

		for deb_file in deb_files:
			self.register_deb(self.deb_download + "/" + deb_file)

	def check_depends_of_deb(self, deb):

		if deb.depends_fullfilled:
			return

		depends_version = deb.get_chosen_depends()
		print(depends_version)
		for depend_version in depends_version:
			depend = depend_version.split(' ', 1)[0]
			print(depend_version + " -> " + depend)
			if depend not in self.packages:
				print(depend + " is missing")
				deb = self.download_deb(depend)

				""" owowow, recurse to get depends of the depends... """
				self.check_depends_of_deb(deb)

		print("package " + deb.info['Package'] + " is complete")
		deb.depends_fullfilled = True

	def check_all_depends(self):
		# print(self.packages)
		for key in self.packages.keys():
			self.check_depends_of_deb(self.packages[key])

	def fix_dependency_loops(self):
		#if "libgcc1" in self.packages:
		#	depends = self.packages["libgcc1"].info['Depends']
		#	depends = re.sub(r'[, ]*libc6 \(>= [0-9-.]*\)', r'', depends)
		#	self.packages["libgcc1"].info['Depends'] = depends
		if "libc6" in self.packages:
			depends = self.packages["libc6"].info['Depends']
			depends = re.sub(r'libgcc1', r'', depends)
			self.packages["libc6"].info['Depends'] = depends.strip()

	def create_meta(self):
		if os.path.exists(self.meta_path):
			shutil.rmtree(self.meta_path)

		if not os.path.exists(self.meta_path):
			os.makedirs(self.meta_path)
		for deb in self.packages.values():
			if deb.url == "":
				info = self.apt_get_info(deb.info['Package'])
				print(info)
				deb.url = info['uri']

			deb.write_bb(self.meta_path)

	""" creates oe-recipes grouped by Source """
	def create_meta_grouped(self):
		recipes = {}

		self.packages = OrderedDict(sorted(self.packages.items(), key=lambda t: t[0]))

		""" create dict with recipe_name to provided packages """
		for deb in self.packages.values():
			if deb.url == "":
				info = self.apt_get_info(deb.info['Package'])
				print(info)
				deb.url = info['uri']

			recipe_name = deb.oe_recipe()
			if not recipe_name:
				continue

			if recipe_name in recipes:
				recipe = recipes[recipe_name]
			else:
				recipes[recipe_name] = OeDebRecipe(recipe_name)
				recipe = recipes[recipe_name]
			recipe.add_deb(deb)

		print(recipes.values())

		for recipe in recipes.values():
			bb.warn(recipe.recipe_name)
			recipe.write_bb(self.meta_path)

	""" returns """
	def can_provide_oe_pn(self, pn):
		return self.apt_cache(["search", pn]).split("\n")


oe_gen = None
""" singleton like access to the meta-generator from OE itself """
""" deb-repo.bbclass creates it at the moment """
def oe_get_meta_generator(d):
	global oe_gen

	if oe_gen:
		return oe_gen

	distro = d.getVar("DISTRO", True)
	tmp_dir = d.getVar("TMPDIR", True)
	core_base = d.getVar("COREBASE", True)
	bindeb_base = d.getVar("BINDEBBASE", True)
	download_path = os.path.abspath(d.getVar("DL_DIR", True))
	deb_path = os.path.abspath(os.path.join(tmp_dir, "deb", distro))
	meta_generated = os.path.join(bindeb_base, "meta-generated", distro)
	# todo: complain when not set
	deb_sources = d.getVar("DEB_SOURCES", True)

	oe_gen = OeMetaGenerator("debroot/etc/apt/apt.conf", deb_path, download_path, meta_generated, deb_sources)
	return oe_gen

""" main """
if __name__ == "__main__":
	if len(sys.argv) < 2:
		print("usage: " + sys.argv[0] + " distro")
		exit(1)

	distro = sys.argv[1]

	meta_bin_deb_path = os.path.abspath(os.path.join(os.path.dirname(__file__), ".."))

	# mmm, this makes assumptions about the setup
	deb_path = os.path.abspath(os.path.join(meta_bin_deb_path, "../../build/tmp-glibc/deb", distro))
	meta_generated = os.path.join(meta_bin_deb_path, "meta-generated", distro)
	download_path = os.path.abspath(os.path.join(meta_bin_deb_path, "../../../oe-downloads", distro))

	if not os.path.isdir(deb_path):
		print("apparently the deb root is not at '" + deb_path + "', giving up")
		exit();

	if not os.path.isdir(download_path):
		print("apparently the download dir '" + download_path + "' does not exist, giving up")
		exit();

	print("meta-bin-deb: " + meta_bin_deb_path)
	print("deb: " + deb_path)
	print("meta-generated: " + meta_generated)
	print("download: " + download_path)

	oe_gen = OeMetaGenerator("debroot/etc/apt/apt.conf", deb_path, download_path, meta_generated)
	oe_gen.scan_download_dir()
	oe_gen.check_all_depends()
	deb = oe_gen.add_deb("libc6-dev")
	deb = oe_gen.add_deb("libx11-dev")
	deb = oe_gen.add_deb("libqt4-dev")
	deb = oe_gen.add_deb("libevent-dev")
	deb = oe_gen.add_deb("dbus")
	deb = oe_gen.add_deb("libdbus-1-dev")
	deb = oe_gen.add_deb("qt4-qmake")
	oe_gen.fix_dependency_loops()
	oe_gen.create_meta()
