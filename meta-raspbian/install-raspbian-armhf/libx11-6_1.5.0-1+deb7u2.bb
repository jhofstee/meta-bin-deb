PACKAGES = "libx11-6"
DESCRIPTION = "\
X11 client-side library\
This package provides a client interface to the X Window System, otherwise\
known as 'Xlib'.  It provides a complete API for the basic functions of the\
window system.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libX11"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libxcb1 (>= 1.2), libx11-data
DEPENDS = "libc6 (>= 2.13-28) libxcb1 (>= 1.2) libx11-data"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libxcb1 (>= 1.2) libx11-data"

DEB_FILE_NAME = "libx11-6_1.5.0-1+deb7u2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libx11/libx11-6_1.5.0-1+deb7u2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "b7f7b82b745ba95e95bdf8baf58ca967"
SRC_URI[sha256sum] = "00f9d24bfcb184614da272315f9a7d51518439be651f6442bc2f5833fe9c13c4"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"