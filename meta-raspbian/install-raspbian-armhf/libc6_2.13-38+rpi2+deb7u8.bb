PACKAGES = "libc6"
DESCRIPTION = "\
Embedded GNU C Library: Shared libraries\
Contains the standard libraries that are used by nearly all programs on\
the system. This package includes shared versions of the standard C library\
and the standard math library, as well as many others."
HOMEPAGE = "http://www.eglibc.org"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc-bin (= 2.13-38+rpi2+deb7u8), libgcc1
DEPENDS = "libc-bin (= 2.13-38+rpi2+deb7u8) libgcc1"

RDEPENDS_${PN} = "libc-bin (= 2.13-38+rpi2+deb7u8) libgcc1"

DEB_FILE_NAME = "libc6_2.13-38+rpi2+deb7u8_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/e/eglibc/libc6_2.13-38+rpi2+deb7u8_armhf.deb;unpack=0"
SRC_URI[md5sum] = "83295851be83a40909b0cf2825e0f793"
SRC_URI[sha256sum] = "5a17ba8e3d24eebf15f284228b187f13b0556b0b6304f4538e9e279a8a88742c"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"