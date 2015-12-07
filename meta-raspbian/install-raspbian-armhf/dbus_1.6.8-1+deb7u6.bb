PACKAGES = "dbus"
DESCRIPTION = "\
simple interprocess messaging system (daemon and utilities)\
D-Bus is a message bus, used for sending messages between applications.\
Conceptually, it fits somewhere in between raw sockets and CORBA in\
terms of complexity.\
\
D-Bus supports broadcast messages, asynchronous messages (thus\
decreasing latency), authentication, and more. It is designed to be\
low-overhead; messages are sent using a binary protocol, not using\
XML. D-Bus also supports a method call mapping for its messages, but\
it is not required; this makes using the system quite simple.\
\
It comes with several bindings, including GLib, Python, Qt and Java.\
\
This package contains the D-Bus daemon and related utilities.\
\
The client-side library can be found in the libdbus-1-3 package, as it is no\
longer contained in this package."
HOMEPAGE = "http://dbus.freedesktop.org/"
SECTION = "admin"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libdbus-1-3 (>= 1.0.2), libexpat1 (>= 2.0.1), libselinux1 (>= 1.32), libsystemd-login0 (>= 31), adduser, lsb-base (>= 3.2-14)
DEPENDS = "libc6 (>= 2.13-28) libdbus-1-3 (>= 1.0.2) libexpat1 (>= 2.0.1) libselinux1 (>= 1.32) libsystemd-login0 (>= 31) adduser lsb-base (>= 3.2-14)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libdbus-1-3 (>= 1.0.2) libexpat1 (>= 2.0.1) libselinux1 (>= 1.32) libsystemd-login0 (>= 31) adduser lsb-base (>= 3.2-14)"

DEB_FILE_NAME = "dbus_1.6.8-1+deb7u6_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/d/dbus/dbus_1.6.8-1+deb7u6_armhf.deb;unpack=0"
SRC_URI[md5sum] = "a610391d9fa72f53235db583fe3bc987"
SRC_URI[sha256sum] = "872b8c95ea14afd1b2da20dc04b6facf30afce117fd66c2129e076f74e84046f"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"