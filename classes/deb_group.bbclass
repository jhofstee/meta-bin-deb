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
			out = subprocess.check_output(["dpkg-deb", "--extract", workdir + "/" + deb, D])
			print(out)

			symlinks = subprocess.check_output(["find", D, "-type", "l"])
			for symlink in symlinks.split():
				tg = os.readlink(symlink)
				if tg.startswith("/"):
					abs = os.path.join(D, tg[1:])
					rel = os.path.relpath(abs, os.path.dirname(symlink))
					print(symlink + " : " + abs + " -> " + rel)
					os.remove(symlink)
					os.symlink(rel, symlink)
}

EXPORT_FUNCTIONS do_install

