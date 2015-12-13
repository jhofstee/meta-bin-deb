PACKAGES = "libqt4-dev"
DESCRIPTION = "\
Qt 4 development files\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
This package contains the header development files used for building Qt 4\
applications."
HOMEPAGE = "http://qt-project.org/"
SECTION = "libdevel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libqt4-dbus (= 4:4.8.2+dfsg-11+rpi1), libqt4-declarative (= 4:4.8.2+dfsg-11+rpi1), libqt4-designer (= 4:4.8.2+dfsg-11+rpi1), libqt4-dev-bin (= 4:4.8.2+dfsg-11+rpi1), libqt4-help (= 4:4.8.2+dfsg-11+rpi1), libqt4-network (= 4:4.8.2+dfsg-11+rpi1), libqt4-qt3support (= 4:4.8.2+dfsg-11+rpi1), libqt4-script (= 4:4.8.2+dfsg-11+rpi1), libqt4-scripttools (= 4:4.8.2+dfsg-11+rpi1), libqt4-sql (= 4:4.8.2+dfsg-11+rpi1), libqt4-svg (= 4:4.8.2+dfsg-11+rpi1), libqt4-test (= 4:4.8.2+dfsg-11+rpi1), libqt4-xml (= 4:4.8.2+dfsg-11+rpi1), libqt4-xmlpatterns (= 4:4.8.2+dfsg-11+rpi1), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libqtgui4 (= 4:4.8.2+dfsg-11+rpi1), qt4-linguist-tools (= 4:4.8.2+dfsg-11+rpi1), qt4-qmake (= 4:4.8.2+dfsg-11+rpi1)
DEPENDS = "libqt4-dbus (= 4:4.8.2+dfsg-11+rpi1) libqt4-declarative (= 4:4.8.2+dfsg-11+rpi1) libqt4-designer (= 4:4.8.2+dfsg-11+rpi1) libqt4-dev-bin (= 4:4.8.2+dfsg-11+rpi1) libqt4-help (= 4:4.8.2+dfsg-11+rpi1) libqt4-network (= 4:4.8.2+dfsg-11+rpi1) libqt4-qt3support (= 4:4.8.2+dfsg-11+rpi1) libqt4-script (= 4:4.8.2+dfsg-11+rpi1) libqt4-scripttools (= 4:4.8.2+dfsg-11+rpi1) libqt4-sql (= 4:4.8.2+dfsg-11+rpi1) libqt4-svg (= 4:4.8.2+dfsg-11+rpi1) libqt4-test (= 4:4.8.2+dfsg-11+rpi1) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqt4-xmlpatterns (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtgui4 (= 4:4.8.2+dfsg-11+rpi1) qt4-linguist-tools (= 4:4.8.2+dfsg-11+rpi1) qt4-qmake (= 4:4.8.2+dfsg-11+rpi1)"

RDEPENDS_${PN} = "libqt4-dbus (= 4:4.8.2+dfsg-11+rpi1) libqt4-declarative (= 4:4.8.2+dfsg-11+rpi1) libqt4-designer (= 4:4.8.2+dfsg-11+rpi1) libqt4-dev-bin (= 4:4.8.2+dfsg-11+rpi1) libqt4-help (= 4:4.8.2+dfsg-11+rpi1) libqt4-network (= 4:4.8.2+dfsg-11+rpi1) libqt4-qt3support (= 4:4.8.2+dfsg-11+rpi1) libqt4-script (= 4:4.8.2+dfsg-11+rpi1) libqt4-scripttools (= 4:4.8.2+dfsg-11+rpi1) libqt4-sql (= 4:4.8.2+dfsg-11+rpi1) libqt4-svg (= 4:4.8.2+dfsg-11+rpi1) libqt4-test (= 4:4.8.2+dfsg-11+rpi1) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqt4-xmlpatterns (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtgui4 (= 4:4.8.2+dfsg-11+rpi1) qt4-linguist-tools (= 4:4.8.2+dfsg-11+rpi1) qt4-qmake (= 4:4.8.2+dfsg-11+rpi1)"

DEB_FILE_NAME = "libqt4-dev_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqt4-dev_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "9a890f23f6411925553decc66ea6567b"
SRC_URI[sha256sum] = "819f4d162c8f53d30801b3056b5aee403f2c80e1be8d9cb9922167b56c55e517"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"