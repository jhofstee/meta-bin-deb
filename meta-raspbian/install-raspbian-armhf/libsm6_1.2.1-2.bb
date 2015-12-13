PACKAGES = "libsm6"
DESCRIPTION = "\
X11 Session Management library\
This package provides the main interface to the X11 Session Management\
library, which allows for applications to both manage sessions, and make use\
of session managers to save and restore their state for later use.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libSM"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.4), libice6 (>= 1:1.0.0), libuuid1 (>= 2.16)
DEPENDS = "libc6 (>= 2.4) libice6 (>= 1:1.0.0) libuuid1 (>= 2.16)"

RDEPENDS_${PN} = "libc6 (>= 2.4) libice6 (>= 1:1.0.0) libuuid1 (>= 2.16)"

DEB_FILE_NAME = "libsm6_1.2.1-2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libs/libsm/libsm6_1.2.1-2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "9f184562c9b7b6d726ebdaa3c6ae4a05"
SRC_URI[sha256sum] = "a78d46ab8a965a39517e3c7ade9a8c27ca7d8fd12d75de8611db536848471a86"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"