PACKAGES = "libtiff4"
DESCRIPTION = "\
Tag Image File Format (TIFF) library (old version)\
libtiff is a library providing support for the Tag Image File Format\
(TIFF), a widely used format for storing image data.  This package\
includes the shared library."
HOMEPAGE = "http://libtiff.maptools.org"
SECTION = "oldlibs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libjbig0, libjpeg8 (>= 8c), zlib1g (>= 1:1.1.4)
DEPENDS = "libc6 (>= 2.13-28) libjbig0 libjpeg8 (>= 8c) zlib1g (>= 1:1.1.4)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libjbig0 libjpeg8 (>= 8c) zlib1g (>= 1:1.1.4)"

DEB_FILE_NAME = "libtiff4_3.9.6-11_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/t/tiff3/libtiff4_3.9.6-11_armhf.deb;unpack=0"
SRC_URI[md5sum] = "ffe24f000022cf495b2b2ea692cb04ec"
SRC_URI[sha256sum] = "bc48adade4f0f2fbbb965a8902740921ac46c4f1f1b5a31ab91bdc3f2af124e6"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"