PACKAGES = "libc6-dev"
DESCRIPTION = "\
Embedded GNU C Library: Development Libraries and Header Files\
Contains the symlinks, headers, and object files needed to compile\
and link programs which use the standard C library."
HOMEPAGE = "http://www.eglibc.org"
SECTION = "libdevel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (= 2.13-38+rpi2+deb7u8), libc-dev-bin (= 2.13-38+rpi2+deb7u8), linux-libc-dev
DEPENDS = "libc6 (= 2.13-38+rpi2+deb7u8) libc-dev-bin (= 2.13-38+rpi2+deb7u8) linux-libc-dev"

RDEPENDS_${PN} = "libc6 (= 2.13-38+rpi2+deb7u8) libc-dev-bin (= 2.13-38+rpi2+deb7u8) linux-libc-dev"

DEB_FILE_NAME = "libc6-dev_2.13-38+rpi2+deb7u8_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/e/eglibc/libc6-dev_2.13-38+rpi2+deb7u8_armhf.deb;unpack=0"
SRC_URI[md5sum] = "1457f0a72d73095238cdb861f3d191f6"
SRC_URI[sha256sum] = "d974b767c40bd14e3a5adc873e02d5b6e1490f1c0f8da6b123f20e9037b0203a"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"