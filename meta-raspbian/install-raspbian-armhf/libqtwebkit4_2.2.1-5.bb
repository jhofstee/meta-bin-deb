PACKAGES = "libqtwebkit4"
DESCRIPTION = "\
Web content engine library for Qt\
QtWebKit provides a Web browser engine that makes it easy to embed content\
from the World Wide Web into your Qt application."
HOMEPAGE = "http://trac.webkit.org/wiki/QtWebKit"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libglib2.0-0 (>= 2.31.8), libgstreamer-plugins-base0.10-0 (>= 0.10.31), libgstreamer0.10-0 (>= 0.10.31), libqt4-network (>= 4:4.8.1), libqtcore4 (>= 4:4.8.1), libqtgui4 (>= 4:4.8.1), libsqlite3-0 (>= 3.5.9), libstdc++6 (>= 4.4.0), libx11-6, libxrender1
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libglib2.0-0 (>= 2.31.8) libgstreamer-plugins-base0.10-0 (>= 0.10.31) libgstreamer0.10-0 (>= 0.10.31) libqt4-network (>= 4:4.8.1) libqtcore4 (>= 4:4.8.1) libqtgui4 (>= 4:4.8.1) libsqlite3-0 (>= 3.5.9) libstdc++6 (>= 4.4.0) libx11-6 libxrender1"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libglib2.0-0 (>= 2.31.8) libgstreamer-plugins-base0.10-0 (>= 0.10.31) libgstreamer0.10-0 (>= 0.10.31) libqt4-network (>= 4:4.8.1) libqtcore4 (>= 4:4.8.1) libqtgui4 (>= 4:4.8.1) libsqlite3-0 (>= 3.5.9) libstdc++6 (>= 4.4.0) libx11-6 libxrender1"

DEB_FILE_NAME = "libqtwebkit4_2.2.1-5_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qtwebkit/libqtwebkit4_2.2.1-5_armhf.deb;unpack=0"
SRC_URI[md5sum] = "06187ff898d09c5004b33f1e2e9dd779"
SRC_URI[sha256sum] = "937e14414809f1d64dee5d43c90fc454bda7e12a201bdbdc6bd08bb120352e30"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"