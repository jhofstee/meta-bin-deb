PACKAGES = "libqt4-designer"
DESCRIPTION = "\
Qt 4 designer module\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
The QtDesigner module provides classes that allow you to create your own\
custom widget plugins for Qt Designer, and classes that enable you to access\
Qt Designer's components."
HOMEPAGE = "http://qt-project.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libqt4-script (= 4:4.8.2+dfsg-11+rpi1), libqt4-xml (= 4:4.8.2+dfsg-11+rpi1), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libqtgui4 (= 4:4.8.2+dfsg-11+rpi1), libstdc++6 (>= 4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-script (= 4:4.8.2+dfsg-11+rpi1) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtgui4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-script (= 4:4.8.2+dfsg-11+rpi1) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtgui4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

DEB_FILE_NAME = "libqt4-designer_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqt4-designer_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "811c047d612fabca8802622b6ffc2d85"
SRC_URI[sha256sum] = "e722adadcc7a7c9667aa640646b2e0ba96f8f37f77df86da9f0deff3b8b551b5"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"