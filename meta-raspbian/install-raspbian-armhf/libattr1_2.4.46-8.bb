PACKAGES = "libattr1"
DESCRIPTION = "\
Extended attribute shared library\
Contains the runtime environment required by programs that make use\
of extended attributes."
HOMEPAGE = "http://savannah.nongnu.org/projects/attr/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "libattr1_2.4.46-8_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/a/attr/libattr1_2.4.46-8_armhf.deb;unpack=0"
SRC_URI[md5sum] = "a9dd77ef75615006931a2e6d6622ed08"
SRC_URI[sha256sum] = "d1c611d054fc4007416974ae473fcf0e8681103d7afcbfc56ec50a5d85ba3db7"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"