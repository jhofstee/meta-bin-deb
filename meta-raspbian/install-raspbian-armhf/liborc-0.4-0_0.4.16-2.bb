PACKAGES = "liborc-0.4-0"
DESCRIPTION = "\
Library of Optimized Inner Loops Runtime Compiler\
Orc is a library and set of tools for compiling and executing\
very simple programs that operate on arrays of data.  The "language"\
is a generic assembly language that represents many of the features\
available in SIMD architectures, including saturated addition and\
subtraction, and many arithmetic operations.\
\
This package contains the orc shared libraries.  It is typically\
installed automatically when an application or library requires it."
HOMEPAGE = "http://code.entropywave.com/projects/orc/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

DEB_FILE_NAME = "liborc-0.4-0_0.4.16-2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/o/orc/liborc-0.4-0_0.4.16-2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "cc8140dfc8fbb7d3dc7e42e19897ec26"
SRC_URI[sha256sum] = "b1927c7a209e4243fcc085df5290f4c40a3b6414d0393047c676aaba5b3212f2"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"