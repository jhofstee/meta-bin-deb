PACKAGES = "libdbus-1-3"
DESCRIPTION = "\
simple interprocess messaging system (library)\
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
The daemon can be found in the dbus package."
HOMEPAGE = "http://dbus.freedesktop.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "libdbus-1-3_1.6.8-1+deb7u6_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-3_1.6.8-1+deb7u6_armhf.deb;unpack=0"
SRC_URI[md5sum] = "106c62042dac3d1139bb0749914c28a2"
SRC_URI[sha256sum] = "ac1235afc53077a16e032bb8f467acd460c61a66fc3dd8f5e27a5421ab9c397e"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"