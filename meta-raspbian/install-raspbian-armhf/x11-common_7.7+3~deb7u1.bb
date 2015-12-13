PACKAGES = "x11-common"
DESCRIPTION = "\
X Window System (X.Org) infrastructure\
x11-common contains the filesystem infrastructure required for further\
installation of the X Window System in any configuration; it does not\
provide a full installation of clients, servers, libraries, and utilities\
required to run the X Window System.\
\
A number of terms are used to refer to the X Window System, including "X",\
"X Version 11", "X11", "X11R6", and "X11R7".  The version of X used in\
Debian is derived from the version released by the X.Org Foundation, and\
is thus often also referred to as "X.Org".  All of the preceding quoted\
terms are functionally interchangeable in an Debian system."
SECTION = "x11"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: debconf (>= 0.5) | debconf-2.0, lsb-base (>= 1.3-9ubuntu2)
DEPENDS = "debconf (>= 0.5) lsb-base (>= 1.3-9ubuntu2)"

RDEPENDS_${PN} = "debconf (>= 0.5) lsb-base (>= 1.3-9ubuntu2)"

DEB_FILE_NAME = "x11-common_7.7+3~deb7u1_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/x/xorg/x11-common_7.7+3~deb7u1_all.deb;unpack=0"
SRC_URI[md5sum] = "0878bf26dfcd8c40980ca9123ca66023"
SRC_URI[sha256sum] = "e3883aab23e2be4907c01bf06ae73d30bff2078bfe8e5366e077a652d39933d2"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"