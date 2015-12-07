PACKAGES = "libgcc1"
DESCRIPTION = "\
GCC support library\
Shared version of the support library, a library of internal subroutines\
that GCC uses to overcome shortcomings of particular machines, or\
special needs for some languages."
HOMEPAGE = "http://gcc.gnu.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: gcc-4.7-base (= 4.7.2-5+rpi1)
DEPENDS = "gcc-4.7-base (= 4.7.2-5+rpi1)"

RDEPENDS_${PN} = "gcc-4.7-base (= 4.7.2-5+rpi1)"

DEB_FILE_NAME = "libgcc1_4.7.2-5+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.7/libgcc1_4.7.2-5+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "2f62340a14bf69e221b59f6f67972619"
SRC_URI[sha256sum] = "f68812a139ce05802ed13e067e982110bbb2b40ecb31ffd9086566516628bc1a"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"