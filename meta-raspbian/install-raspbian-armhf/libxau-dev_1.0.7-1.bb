PACKAGES = "libxau-dev"
DESCRIPTION = "\
X11 authorisation library (development headers)\
This package provides the main interface to the X11 authorisation handling,\
which controls authorisation for X connections, both client-side and\
server-side.\
\
This package contains the development headers for the library found in libxau6.\
Non-developers likely have little use for this package.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libXau"
SECTION = "libdevel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libxau6 (= 1:1.0.7-1), x11proto-core-dev
DEPENDS = "libxau6 (= 1:1.0.7-1) x11proto-core-dev"

RDEPENDS_${PN} = "libxau6 (= 1:1.0.7-1) x11proto-core-dev"

DEB_FILE_NAME = "libxau-dev_1.0.7-1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libxau/libxau-dev_1.0.7-1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "4a44e15e01a05493b9acff5969fee94a"
SRC_URI[sha256sum] = "496391ec448de84bfc4610d75e6de6818defb7e26ef2de5e6630e57de5bc59a4"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"