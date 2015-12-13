PACKAGES = "libuuid1"
DESCRIPTION = "\
Universally Unique ID library\
The libuuid library generates and parses 128-bit universally unique\
ids (UUIDs).  A UUID is an identifier that is unique across both\
space and time, with respect to the space of all UUIDs.  A UUID can\
be used for multiple purposes, from tagging objects with an extremely\
short lifetime, to reliably identifying very persistent objects\
across a network.\
\
See RFC 4122 for more information."
HOMEPAGE = "http://userweb.kernel.org/~kzak/util-linux/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: passwd, libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0)
DEPENDS = "passwd libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

RDEPENDS_${PN} = "passwd libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

DEB_FILE_NAME = "libuuid1_2.20.1-5.3_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/u/util-linux/libuuid1_2.20.1-5.3_armhf.deb;unpack=0"
SRC_URI[md5sum] = "29b5ffaddc5497ec7c69f214ffd9d497"
SRC_URI[sha256sum] = "15320a49f6a0b4f7c29249b1a715ac1f6f3b1de57daf9c9582c92fbf798c2946"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"