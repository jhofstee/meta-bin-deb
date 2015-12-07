PACKAGES = "debianutils"
DESCRIPTION = "\
Miscellaneous utilities specific to Debian\
This package provides a number of small utilities which are used\
primarily by the installation scripts of Debian packages, although\
you may use them directly.\
\
The specific utilities included are:\
add-shell installkernel ischroot remove-shell run-parts savelog\
tempfile which"
SECTION = "utils"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: sensible-utils
DEPENDS = "sensible-utils"

RDEPENDS_${PN} = "sensible-utils"

DEB_FILE_NAME = "debianutils_4.3.2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/d/debianutils/debianutils_4.3.2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "e2e13e7983b76d622f000b92de2826e8"
SRC_URI[sha256sum] = "336a3ef6ba1b7cc95375a75e3e42d1435ccdf862f2b145f242157a10f41b59a2"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"