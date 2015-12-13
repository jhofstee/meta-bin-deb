PACKAGES = "zlib1g"
DESCRIPTION = "\
compression library - runtime\
zlib is a library implementing the deflate compression method found\
in gzip and PKZIP.  This package includes the shared library."
HOMEPAGE = "http://zlib.net/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

DEB_FILE_NAME = "zlib1g_1.2.7.dfsg-13_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/z/zlib/zlib1g_1.2.7.dfsg-13_armhf.deb;unpack=0"
SRC_URI[md5sum] = "efcbf46d520b22c56f57fe0693ed9f69"
SRC_URI[sha256sum] = "0789b0eeb527054e6f834dc717689a470bd4d25f55548cdd890924dbc9379a46"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"