PACKAGES = "libjpeg8"
DESCRIPTION = "\
Independent JPEG Group's JPEG runtime library\
The Independent JPEG Group's JPEG library is a library for handling\
JPEG files.\
\
This package contains the shared library."
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "libjpeg8_8d-1+deb7u1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libj/libjpeg8/libjpeg8_8d-1+deb7u1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "6ef335dfe9fbfffeb83e77d935c2087a"
SRC_URI[sha256sum] = "cb1569ec740992a7ad21529b83bece1be8f964f647d6cbbd71552f8fd7ecf209"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"