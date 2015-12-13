PACKAGES = "libqt4-dev-bin"
DESCRIPTION = "\
Qt 4 development programs\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
This package contains the development programs used for building Qt 4\
applications, such as moc, qdbuscpp2xml, qdbusxml2cpp, qt3to4, rcc, uic3,\
and uic."
HOMEPAGE = "http://qt-project.org/"
SECTION = "devel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libqt4-qt3support (= 4:4.8.2+dfsg-11+rpi1), libqt4-xml (= 4:4.8.2+dfsg-11+rpi1), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1), libqtgui4 (= 4:4.8.2+dfsg-11+rpi1), libstdc++6 (>= 4.4.0), zlib1g (>= 1:1.1.4)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-qt3support (= 4:4.8.2+dfsg-11+rpi1) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1) libqtgui4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0) zlib1g (>= 1:1.1.4)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-qt3support (= 4:4.8.2+dfsg-11+rpi1) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1) libqtgui4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0) zlib1g (>= 1:1.1.4)"

DEB_FILE_NAME = "libqt4-dev-bin_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqt4-dev-bin_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "73b44fa4ffe41220eeb75ec9883543a6"
SRC_URI[sha256sum] = "20d66ee4b0545b9515eee38b564e5df00eb3033eb6092cf38f0b23a1e336c53d"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"