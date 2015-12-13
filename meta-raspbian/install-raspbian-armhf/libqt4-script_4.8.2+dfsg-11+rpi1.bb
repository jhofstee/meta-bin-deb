PACKAGES = "libqt4-script"
DESCRIPTION = "\
Qt 4 script module\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
The QtScript module provides classes for making Qt applications scriptable."
HOMEPAGE = "http://qt-project.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1), libstdc++6 (>= 4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

DEB_FILE_NAME = "libqt4-script_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqt4-script_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "113977a591c2273178363c704d827a35"
SRC_URI[sha256sum] = "3ce2e76ccab8e2964207a6dce2204544a7f0f59b7017444fa6afb2d0b4542b92"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"