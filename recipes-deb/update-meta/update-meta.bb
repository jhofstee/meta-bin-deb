LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

INHIBIT_DEFAULT_DEPS = "1"
inherit native

DEPENDS += "apt-native"

OVERRIDES .= ":${DISTRO_VERSION}"
DEB_PKGS = "libc6-dev libx11-dev libqt4-dev libevent-dev dbus libdbus-1-dev qt4-qmake"
DEB_PKGS += "libboost-program-options-dev libboost-system-dev libboost-thread-dev libboost-regex-dev"
DEB_PKGS += "python-dbus python-gobject python-requests python-lxml python-serial python-pymodbus python-enum34"
DEB_PKGS += "python3-dbus python3-gi python3-requests python3-lxml python3-serial python3-pymodbus python3-paho-mqtt"

DEB_PKGS += "base-files base-passwd"
DEB_PKGS += "sysv-rc"
DEB_PKGS += "daemontools-run"
DEB_PKGS += "initscripts"
DEB_PKGS += "mosquitto"
DEB_PKGS += "libgupnp-1.0-dev glib-2.0"
DEB_PKGS += "bash"
DEB_PKGS += "libbluetooth-dev"

python do_compile () {
    import oe.deb_feed
    import re

    oe_gen = oe.deb_feed.oe_get_meta_generator(d)
    oe_gen.check_setup()

    deb_pkgs = d.getVar("DEB_PKGS", True)
    pkgs = set(re.findall("[.a-zA-Z0-9_-]+", deb_pkgs))

    bb.note("adding packages")
    for pkg in pkgs:
        bb.plain("adding deb package for " + pkg)
        oe_gen.add_deb(pkg)

    bb.warn("fixing depedency loops")
    oe_gen.fix_dependency_loops()

    bb.warn("creating meta")
    oe_gen.create_meta_grouped()
}

do_compile[nostamp] = "1"
