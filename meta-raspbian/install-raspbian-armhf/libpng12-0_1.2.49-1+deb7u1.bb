PACKAGES = "libpng12-0"
DESCRIPTION = "\
PNG library - runtime\
libpng is a library implementing an interface for reading and writing\
PNG (Portable Network Graphics) format files.\
\
This package contains the runtime library files needed to run software\
using libpng."
HOMEPAGE = "http://libpng.org/pub/png/libpng.html"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), zlib1g (>= 1:1.1.4)
DEPENDS = "libc6 (>= 2.13-28) zlib1g (>= 1:1.1.4)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) zlib1g (>= 1:1.1.4)"

DEB_FILE_NAME = "libpng12-0_1.2.49-1+deb7u1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libp/libpng/libpng12-0_1.2.49-1+deb7u1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "ae88cc89eb67ad067e62abd59881bdf1"
SRC_URI[sha256sum] = "1dcce0b29928299ec4b4b6287d525922c688da4b60f5e00edaf89e46aa809240"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"