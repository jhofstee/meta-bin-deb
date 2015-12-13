PACKAGES = "libxau6"
DESCRIPTION = "\
X11 authorisation library\
This package provides the main interface to the X11 authorisation handling,\
which controls authorisation for X connections, both client-side and\
server-side.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libXau"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "libxau6_1.0.7-1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libxau/libxau6_1.0.7-1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "ac2474996478e530b421246905542f97"
SRC_URI[sha256sum] = "f4079f4a10dca6503f0946bb90126e8c52563dd3aec7ca0a8bce5e898c237006"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"