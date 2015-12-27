LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

INHIBIT_DEFAULT_DEPS = "1"
inherit native

DEB_PKGS = "libc6-dev libx11-dev libqt4-dev libevent-dev dbus libdbus-1-dev qt4-qmake libboost-program-options-dev libboost-system-dev libboost-thread-dev libboost-regex-dev"
DEB_PKGS += "python-argparse python-dbus python-gobject python-requests python-lxml"

python do_compile () {
	import oe.deb_feed
	import re

	oe_gen = oe.deb_feed.oe_get_meta_generator(d)
	oe_gen.check_setup()

	deb_pkgs = d.getVar("DEB_PKGS", True)
	pkgs = set(re.findall("[a-zA-Z0-9_-]+", deb_pkgs))

	bb.note("adding packages")
	for pkg in pkgs:
		bb.plain("adding deb package for " + pkg)
		oe_gen.add_deb(pkg)

	bb.warn("fixing depedency loops")
	oe_gen.fix_dependency_loops()

	bb.warn("creating meta")
	oe_gen.create_meta_grouped()

	bb.error("done, need to be reloaded, error instead")
}

do_compile[nostamp] = "1"
