#!/usr/bin/python

import re
import os
import subprocess
import sys
from urlparse import urlparse
from os.path import basename

""" Info about a deb file """
class DebPackage:

	depends_fullfilled = False
	url = ""

	""" init deb_file to get info about """
	def __init__(self, local_file_name):
		self.info = {}
		self.local_file_name = local_file_name

	""" call dpkg to act on the deb file """
	def call_dpkg(self, args):
		cmd = ["dpkg", "--admindir=debroot/var/lib/dpkg", "--instdir=rootfs", "--force-architecture"]
		cmd.extend(args)
		#print(cmd)
		out = subprocess.check_output(cmd).strip()
		#print(out)
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

	""" mmmm, deb support a-1 | a-2 syntax, hack around always choose the last """
	def get_chosen_depends(self):
		ret = []
		depends = self.get_depends()
		for depend in depends:
			last = depend.split("|")[0].strip()
			print("CHOSEN: " + last) 
			ret.append(last)
		return ret

	def write_bb(self, meta_path):
		bb_base_name = self.info['Package'] + "_" + self.info['Version'].split(':')[-1]  + ".bb"
		#bb_sub_dir = "install-" + self.info["Section"]
		bb_sub_dir = "install-raspbian-armhf"
		bb_path = meta_path + "/" + bb_sub_dir
		bb_file_name = bb_path + "/" + bb_base_name

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

		# NOT a good idea, urlencoded
		#deb_basename = os.path.basename(self.local_file_name)
		#f.write('DEB_FILE_NAME = "' + deb_basename + '"\n')

		# get the filename from the url instead
		url = self.url.replace("'", "")
		urlinfo = urlparse(url)
		f.write('DEB_FILE_NAME = "' + basename(urlinfo.path) + '"\n')

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
		f.write('FILES_${PN} = "*"')

		print(self.info)
		


""" Load deb files and create OE recipes from them """
class OeMetaGenerator:
	deb_download = "downloads" 
	meta_path = "/home/jeroen/software/venus-debian-bin/sources/meta-bin-deb/meta-raspbian"

	def __init__(self, apt_conf):
		self.packages = {}
		self.apt_conf = apt_conf

	def apt_get(self, args):
		cmd = ["apt-get", "-c", "debroot/etc/apt/apt.conf"]
		cmd.extend(args)
		#print(cmd)

		""" if not ok raise? """

		out = subprocess.check_output(cmd).strip()
		#print(out)
		return out

	""" info needed to lookup the name of the debfile for package_name """
	def apt_get_download_info(self, package_name):
		return self.apt_get(["--print-uris", "download", package_name])

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
		print("afdasfadsf" + apt_uri)
		parts = apt_uri.split(" ")
		info['uri'] = parts[0]
		#self.deb_file = parts[1]
		#self.size = parts[2]
		#self.hash = parts[3]
		#print(self.hash)
		return info
	

	def download_deb(self, package_name):
		print("downloading " + package_name)
		info_line = self.apt_get_download_info(package_name)
		info = info_line.split(" ")
		
		uri = info[0]
		deb_file_name = info[1]
		print("deb_file_name" + deb_file_name)
		size = info[2]
		hash = info[3]

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
		if "libgcc1" in self.packages:
			depends = self.packages["libgcc1"].info['Depends']
			depends = re.sub(r'[, ]*libc6 \(>= [0-9-.]*\)', r'', depends)
			self.packages["libgcc1"].info['Depends'] = depends

	def create_meta(self):
		if not os.path.exists(self.meta_path):
			os.makedirs(self.meta_path)
		for deb in self.packages.values():
			if deb.url == "":
				info = self.apt_get_info(deb.info['Package'])
				print(info)
				deb.url = info['uri']

			deb.write_bb(self.meta_path)

oe_gen = OeMetaGenerator("debroot/etc/apt/apt.conf")
oe_gen.scan_download_dir()
oe_gen.check_all_depends()
deb = oe_gen.add_deb("dbus")
deb = oe_gen.add_deb("libc6-dev")
#deb = oe_gen.add_deb("qtcreator")
#deb.write_bb("test.bb")
oe_gen.fix_dependency_loops()
oe_gen.create_meta()

