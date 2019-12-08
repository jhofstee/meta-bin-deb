DESCRIPTION = " \
update-meta has two approaches \
  - a one-n-one match of deb-file and recipe name \
  - recipes name by the sources name providing multiple deb packages \
\
This class extract the files for the second approach (as in a group of them) \
"

DEPENDS += "dpkg-native"

deltask do_compile
deltask do_package_qa
deltask do_package_write_deb
deltask do_perform_packagecopy
deltask do_packagedata
deltask do_package

# note: this assumes the DLDIR is something like download/openembedded, so by default
# the OE downloads get reused, and the deb files cannot overlap them by placing them
# next to them...
DL_DIR_append = "/../${DISTRO}"

python deb_group_do_extract_deb () {
    import subprocess
    import os

    packages = d.get("PACKAGES", True)
    workdir = d.getVar('WORKDIR', True)
    D = d.getVar('D', True)

    for pkg in packages.split():
        deb = d.get("DEBFILENAME_" + pkg, None)
        if deb:
            print("extract deb contents to " + D)
            bb.plain("EXTRACT: " + deb)
            out = subprocess.check_output(["dpkg-deb", "--extract", workdir + "/" + deb, D])
            print(out)

            # make absolute symlinks relative ones
            symlinks = subprocess.check_output(["find", D, "-type", "l"])
            for symlink in symlinks.split():
                tg = os.readlink(symlink).decode()
                if tg.startswith("/"):
                    abs = os.path.join(D, tg[1:])
                    rel = os.path.relpath(abs, os.path.dirname(symlink).decode())
                    print(str(symlink) + " : " + str(abs) + " -> " + rel)
                    os.remove(symlink)
                    print(str(rel) + " -> " + str(symlink))
                    os.symlink(rel, symlink)
}

addtask extract_deb after do_configure before do_populate_sysroot do_package

EXPORT_FUNCTIONS do_extract_deb

