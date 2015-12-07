PACKAGES = "libc-bin"
DESCRIPTION = "\
Embedded GNU C Library: Binaries\
This package contains utility programs related to the GNU C Library.\
\
 * catchsegv: catch segmentation faults in programs\
 * getconf: query system configuration variables\
 * getent: get entries from administrative databases\
 * iconv, iconvconfig: convert between character encodings\
 * ldd, ldconfig: print/configure shared library dependencies\
 * locale, localedef: show/generate locale definitions\
 * rpcinfo: report RPC information\
 * tzselect, zdump, zic: select/dump/compile time zones"
HOMEPAGE = "http://www.eglibc.org"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "libc-bin_2.13-38+rpi2+deb7u8_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/e/eglibc/libc-bin_2.13-38+rpi2+deb7u8_armhf.deb;unpack=0"
SRC_URI[md5sum] = "82d9b53dde3825858808d3994d994610"
SRC_URI[sha256sum] = "9d12f77bb324e8b77f343c80dde7f6f3bc5ddf8d37d375baf8d203cebfcfe9ed"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"