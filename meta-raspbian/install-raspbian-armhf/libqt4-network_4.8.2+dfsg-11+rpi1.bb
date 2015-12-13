PACKAGES = "libqt4-network"
DESCRIPTION = "\
Qt 4 network module\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
The QtNetwork module offers classes that allow you to write TCP/IP clients and\
servers. It provides classes to make network programming easier and portable."
HOMEPAGE = "http://qt-project.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1), libstdc++6 (>= 4.4.0), zlib1g (>= 1:1.1.4)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0) zlib1g (>= 1:1.1.4)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0) zlib1g (>= 1:1.1.4)"

DEB_FILE_NAME = "libqt4-network_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqt4-network_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "ef0de6e271fc2b29bdb2f6955ed30aeb"
SRC_URI[sha256sum] = "95c793796a47a1a91df7f2123890c198305654592ba56a1b145deab2817a7d54"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"