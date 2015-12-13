PACKAGES = "libqtcore4"
DESCRIPTION = "\
Qt 4 core module\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
The QtCore module contains core non-GUI functionality."
HOMEPAGE = "http://qt-project.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libglib2.0-0 (>= 2.22.0), libstdc++6 (>= 4.6), zlib1g (>= 1:1.1.4)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libglib2.0-0 (>= 2.22.0) libstdc++6 (>= 4.6) zlib1g (>= 1:1.1.4)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libglib2.0-0 (>= 2.22.0) libstdc++6 (>= 4.6) zlib1g (>= 1:1.1.4)"

DEB_FILE_NAME = "libqtcore4_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqtcore4_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "974029fc3bcecaaefe4f3d0aac95c110"
SRC_URI[sha256sum] = "354eaa016ad15ffe0b4426a044769886b712a94533cad16a9f8f66a223dc3b60"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"