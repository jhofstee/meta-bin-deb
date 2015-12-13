PACKAGES = "libqt4-declarative"
DESCRIPTION = "\
Qt 4 Declarative module\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
The Qt Declarative module provides a declarative framework for building highly\
dynamic, custom user interfaces."
HOMEPAGE = "http://qt-project.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libqt4-network (= 4:4.8.2+dfsg-11+rpi1), libqt4-script (= 4:4.8.2+dfsg-11+rpi1), libqt4-sql (= 4:4.8.2+dfsg-11+rpi1), libqt4-xmlpatterns (= 4:4.8.2+dfsg-11+rpi1), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libqtgui4 (= 4:4.8.2+dfsg-11+rpi1), libstdc++6 (>= 4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-network (= 4:4.8.2+dfsg-11+rpi1) libqt4-script (= 4:4.8.2+dfsg-11+rpi1) libqt4-sql (= 4:4.8.2+dfsg-11+rpi1) libqt4-xmlpatterns (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtgui4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-network (= 4:4.8.2+dfsg-11+rpi1) libqt4-script (= 4:4.8.2+dfsg-11+rpi1) libqt4-sql (= 4:4.8.2+dfsg-11+rpi1) libqt4-xmlpatterns (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtgui4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

DEB_FILE_NAME = "libqt4-declarative_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqt4-declarative_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "7094a91171de141365077551210ad3f8"
SRC_URI[sha256sum] = "ed9e72750074fef98f1c2aca83718330336d90b66d5bf6d19f7d65117e28c432"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"