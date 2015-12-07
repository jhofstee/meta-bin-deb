PACKAGES = "libexpat1"
DESCRIPTION = "\
XML parsing C library - runtime library\
This package contains the runtime, shared library of expat, the C\
library for parsing XML. Expat is a stream-oriented parser in\
which an application registers handlers for things the parser\
might find in the XML document (like start tags)."
HOMEPAGE = "http://expat.sourceforge.net"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

DEB_FILE_NAME = "libexpat1_2.1.0-1+deb7u2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/e/expat/libexpat1_2.1.0-1+deb7u2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "ba0074284a7001a69a16de12f7037b5c"
SRC_URI[sha256sum] = "4f0541d464a26d6e3a427744d685d3dce5dd051e73a36d1595e5fca9e48e7801"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"