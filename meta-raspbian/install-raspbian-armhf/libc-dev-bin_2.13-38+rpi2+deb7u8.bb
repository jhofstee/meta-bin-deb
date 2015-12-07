PACKAGES = "libc-dev-bin"
DESCRIPTION = "\
Embedded GNU C Library: Development binaries\
This package contains utility programs related to the GNU C Library\
development package."
HOMEPAGE = "http://www.eglibc.org"
SECTION = "libdevel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libc6 (<< 2.14)
DEPENDS = "libc6 (>= 2.13-28) libc6 (<< 2.14)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libc6 (<< 2.14)"

DEB_FILE_NAME = "libc-dev-bin_2.13-38+rpi2+deb7u8_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/e/eglibc/libc-dev-bin_2.13-38+rpi2+deb7u8_armhf.deb;unpack=0"
SRC_URI[md5sum] = "86687fdbc41fbb8d07c602ab32add033"
SRC_URI[sha256sum] = "bdd7b61a594da2476a7ba3ceb0d1574530cd584838dc5a6da91c30a4fb348bab"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"