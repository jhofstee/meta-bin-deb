PACKAGES = "qdbus"
DESCRIPTION = "\
Qt 4 D-Bus tool\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
This package contains qdbus, a command-line tool interface to D-Bus that uses\
the QtDBus library."
HOMEPAGE = "http://qt-project.org/"
SECTION = "utils"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libqt4-xml (= 4:4.8.2+dfsg-11+rpi1), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1), libstdc++6 (>= 4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

DEB_FILE_NAME = "qdbus_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/qdbus_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "e5d5d144c9cc9e20db1c9e4761135e10"
SRC_URI[sha256sum] = "7b2d56339e98a85768d5c341d1d60f0b7b1e785ddcda719f0796e83ff7978ab2"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"