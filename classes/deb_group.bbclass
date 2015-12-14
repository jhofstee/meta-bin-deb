do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"
do_package[noexec] = "1"
do_package_qa[noexec] = "1"
do_package_write_deb[noexec] = "1"
do_perform_packagecopy[noexec] = "1"

python deb_group_do_install () {
	import subprocess
	import os

	packages = d.get("PACKAGES", True)
	pkgdest = d.getVar('PKGDEST', True)
	workdir = d.getVar('WORKDIR', True)
	D = d.getVar('D', True)

	for pkg in packages.split():
		deb = d.get("DEBFILENAME_" + pkg, None)
		if deb:
			bb.plain("EXTRACT: " + deb)
			os.makedirs(pkgdest + "/" + pkg)
			out = subprocess.check_output(["dpkg-deb", "--extract", workdir + "/" + deb, D])
			print(out)
}

EXPORT_FUNCTIONS do_install

