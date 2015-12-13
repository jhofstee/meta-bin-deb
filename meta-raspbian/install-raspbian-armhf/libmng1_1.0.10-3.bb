PACKAGES = "libmng1"
DESCRIPTION = "\
Multiple-image Network Graphics library\
The libmng library supports decoding, displaying, encoding, and various other\
manipulations of the Multiple-image Network Graphics (MNG) format image files.\
It uses the zlib compression library, and optionally the JPEG library by the\
Independent JPEG Group (IJG) and/or lcms (little cms), a color-management\
library by Marti Maria Saguar."
HOMEPAGE = "http://www.libmng.com"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libjpeg8 (>= 8c), liblcms1 (>= 1.15-1), zlib1g (>= 1:1.1.4)
DEPENDS = "libc6 (>= 2.13-28) libjpeg8 (>= 8c) liblcms1 (>= 1.15-1) zlib1g (>= 1:1.1.4)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libjpeg8 (>= 8c) liblcms1 (>= 1.15-1) zlib1g (>= 1:1.1.4)"

DEB_FILE_NAME = "libmng1_1.0.10-3_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libm/libmng/libmng1_1.0.10-3_armhf.deb;unpack=0"
SRC_URI[md5sum] = "b88ee5b6f3dfe053cfded22c04804b9a"
SRC_URI[sha256sum] = "e38118cf220f9bd4dff90bc474d79226d5467fbcba9884832d2f90023d807f3d"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"