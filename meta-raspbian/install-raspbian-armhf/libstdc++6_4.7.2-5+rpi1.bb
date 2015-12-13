PACKAGES = "libstdc++6"
DESCRIPTION = "\
GNU Standard C++ Library v3\
This package contains an additional runtime library for C++ programs\
built with the GNU compiler.\
\
libstdc++-v3 is a complete rewrite from the previous libstdc++-v2, which\
was included up to g++-2.95. The first version of libstdc++-v3 appeared\
in g++-3.0."
HOMEPAGE = "http://gcc.gnu.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: gcc-4.7-base (= 4.7.2-5+rpi1), libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0)
DEPENDS = "gcc-4.7-base (= 4.7.2-5+rpi1) libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

RDEPENDS_${PN} = "gcc-4.7-base (= 4.7.2-5+rpi1) libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

DEB_FILE_NAME = "libstdc++6_4.7.2-5+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.7/libstdc++6_4.7.2-5+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "69eea0ab025a59bd70db3a1d0bc0f73a"
SRC_URI[sha256sum] = "f70337f2e53f8bcee597f8dd699b27dc364d303bd1d90c40084438cb1cd634f9"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"