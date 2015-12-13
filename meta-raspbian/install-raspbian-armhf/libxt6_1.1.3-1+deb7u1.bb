PACKAGES = "libxt6"
DESCRIPTION = "\
X11 toolkit intrinsics library\
libXt provides the X Toolkit Intrinsics, an abstract widget library upon\
which other toolkits are based.  Xt is the basis for many toolkits, including\
the Athena widgets (Xaw), and LessTif (a Motif implementation).\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libXt"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libice6 (>= 1:1.0.0), libsm6, libx11-6
DEPENDS = "libc6 (>= 2.13-28) libice6 (>= 1:1.0.0) libsm6 libx11-6"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libice6 (>= 1:1.0.0) libsm6 libx11-6"

DEB_FILE_NAME = "libxt6_1.1.3-1+deb7u1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libxt/libxt6_1.1.3-1+deb7u1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "0fabbdf5d4668908556738d4b7025c46"
SRC_URI[sha256sum] = "68c8380095bdb061df130b6278b1e7e628d0b8a6c87faa7218d0a83af424f577"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"