PACKAGES = "libx11-dev"
DESCRIPTION = "\
X11 client-side library (development headers)\
This package provides a client interface to the X Window System, otherwise\
known as 'Xlib'.  It provides a complete API for the basic functions of the\
window system.\
\
This package contains the development headers for the library found in\
libx11-6. Non-developers likely have little use for this package.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libX11"
SECTION = "libdevel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libx11-6 (= 2:1.5.0-1+deb7u2), libxau-dev (>= 1:1.0.0-1), libxdmcp-dev (>= 1:1.0.0-1), x11proto-core-dev (>= 6.8.99.8-1), x11proto-input-dev, x11proto-kb-dev, xtrans-dev, libxcb1-dev
DEPENDS = "libx11-6 (= 2:1.5.0-1+deb7u2) libxau-dev (>= 1:1.0.0-1) libxdmcp-dev (>= 1:1.0.0-1) x11proto-core-dev (>= 6.8.99.8-1) x11proto-input-dev x11proto-kb-dev xtrans-dev libxcb1-dev"

RDEPENDS_${PN} = "libx11-6 (= 2:1.5.0-1+deb7u2) libxau-dev (>= 1:1.0.0-1) libxdmcp-dev (>= 1:1.0.0-1) x11proto-core-dev (>= 6.8.99.8-1) x11proto-input-dev x11proto-kb-dev xtrans-dev libxcb1-dev"

DEB_FILE_NAME = "libx11-dev_1.5.0-1+deb7u2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libx11/libx11-dev_1.5.0-1+deb7u2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "04a2621ea775f57bb80be0a63e5f53ff"
SRC_URI[sha256sum] = "1d47e9af76a0d9188bf9dbec81c7b23b523c9b7d26ce4400da3d3ddc686be542"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"