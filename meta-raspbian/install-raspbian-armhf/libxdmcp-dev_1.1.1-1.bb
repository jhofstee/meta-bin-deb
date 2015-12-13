PACKAGES = "libxdmcp-dev"
DESCRIPTION = "\
X11 authorisation library (development headers)\
This package provides the main interface to the X11 display manager control\
protocol library, which allows for remote logins to display managers.\
\
This package contains the development headers for the library found in\
libxdmcp6. Non-developers likely have little use for this package.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libXdmcp"
SECTION = "libdevel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libxdmcp6 (= 1:1.1.1-1), x11proto-core-dev
DEPENDS = "libxdmcp6 (= 1:1.1.1-1) x11proto-core-dev"

RDEPENDS_${PN} = "libxdmcp6 (= 1:1.1.1-1) x11proto-core-dev"

DEB_FILE_NAME = "libxdmcp-dev_1.1.1-1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libxdmcp/libxdmcp-dev_1.1.1-1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "d8638f20276f1778302f1794e5465cc2"
SRC_URI[sha256sum] = "833e121e18446479c8b8bc3619d19b2c35646dd4be43dc28b8265dc3beabebf1"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"