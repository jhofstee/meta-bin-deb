PACKAGES = "libx11-data"
DESCRIPTION = "\
X11 client-side library\
This package provides the locale data files for libx11.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libX11"
SECTION = "x11"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "libx11-data_1.5.0-1+deb7u2_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libx11/libx11-data_1.5.0-1+deb7u2_all.deb;unpack=0"
SRC_URI[md5sum] = "8789e24f0336b5cbcdf4ed49d3429d0a"
SRC_URI[sha256sum] = "36c17294124414cdcc6234abf4ccbb5a94ef5e7848733dc43fcd98b082d0a716"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"