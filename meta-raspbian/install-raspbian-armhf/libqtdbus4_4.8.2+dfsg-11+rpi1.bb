PACKAGES = "libqtdbus4"
DESCRIPTION = "\
Qt 4 D-Bus module library\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
The QtDBus module is a Unix-only library that you can use to make Inter-Process\
Communication using the D-Bus protocol.\
\
Applications using the QtDBus module can provide services to other, remote\
applications by exporting objects, as well as use services exported by those\
applications by placing calls and accessing properties."
HOMEPAGE = "http://qt-project.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libdbus-1-3 (>= 1.3.1), libgcc1 (>= 1:4.4.0), libqt4-xml (= 4:4.8.2+dfsg-11+rpi1), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libstdc++6 (>= 4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libdbus-1-3 (>= 1.3.1) libgcc1 (>= 1:4.4.0) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libdbus-1-3 (>= 1.3.1) libgcc1 (>= 1:4.4.0) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0)"

DEB_FILE_NAME = "libqtdbus4_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqtdbus4_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "32bbca5439ac6b32fa1e46b5985860af"
SRC_URI[sha256sum] = "957ec6c8ff062035f6721377b74034a79ff9b4f32f7eb9a94aaaf4690ca50a1a"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"