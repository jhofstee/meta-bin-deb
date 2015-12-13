PACKAGES = "libjbig0"
DESCRIPTION = "\
JBIGkit libraries\
JBIG-KIT provides a portable library of compression and decompression functions\
with a documented interface that you can include very easily into your image or\
document processing software.\
\
This package contains the dynamically linked library."
HOMEPAGE = "http://www.cl.cam.ac.uk/~mgk25/jbigkit/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "libjbig0_2.0-2+deb7u1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/j/jbigkit/libjbig0_2.0-2+deb7u1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "59fba8651b725a34cbf13f26edad4071"
SRC_URI[sha256sum] = "d9303b7e96865c2b6980bf7dc3ea40bbe298a8c6bce13dc9beac7aeec9a678ae"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"