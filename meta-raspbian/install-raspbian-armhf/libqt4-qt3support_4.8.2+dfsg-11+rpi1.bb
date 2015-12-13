PACKAGES = "libqt4-qt3support"
DESCRIPTION = "\
Qt 3 compatibility library for Qt 4\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
The Qt3Support module provides classes that ease porting from Qt 3 to Qt 4.\
\
It allows applications designed to use deprecated Qt 3 classes and functions\
to work with Qt 4, with help from the qt3to4 porting tool found in the\
libqt4-dev-bin package."
HOMEPAGE = "http://qt-project.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libqt4-designer (= 4:4.8.2+dfsg-11+rpi1), libqt4-network (= 4:4.8.2+dfsg-11+rpi1), libqt4-sql (= 4:4.8.2+dfsg-11+rpi1), libqt4-xml (= 4:4.8.2+dfsg-11+rpi1), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libqtgui4 (= 4:4.8.2+dfsg-11+rpi1), libstdc++6 (>= 4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-designer (= 4:4.8.2+dfsg-11+rpi1) libqt4-network (= 4:4.8.2+dfsg-11+rpi1) libqt4-sql (= 4:4.8.2+dfsg-11+rpi1) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtgui4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-designer (= 4:4.8.2+dfsg-11+rpi1) libqt4-network (= 4:4.8.2+dfsg-11+rpi1) libqt4-sql (= 4:4.8.2+dfsg-11+rpi1) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtgui4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

DEB_FILE_NAME = "libqt4-qt3support_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqt4-qt3support_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "be08a99b8e23e8551bb386d8c6afd42c"
SRC_URI[sha256sum] = "7584cf3b4656e7ee1eae8004cbe492b1419e3844495e04a34726e7b233ceb32a"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"