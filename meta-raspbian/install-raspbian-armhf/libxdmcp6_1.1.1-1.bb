PACKAGES = "libxdmcp6"
DESCRIPTION = "\
X11 Display Manager Control Protocol library\
This package provides the main interface to the X11 display manager control\
protocol library, which allows for remote logins to display managers.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libXdmcp"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "libxdmcp6_1.1.1-1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libxdmcp/libxdmcp6_1.1.1-1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "27db6b19be74ae9bca26d65a0a1403f5"
SRC_URI[sha256sum] = "4f5ad0fc9fd5b37f35905d8f0a7907a090e63253e6c486f58c01a92f05bfadba"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"