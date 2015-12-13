PACKAGES = "libqt4-dbus"
DESCRIPTION = "\
Qt 4 D-Bus module\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
The QtDBus module is a Unix-only library that you can use to make Inter-Process\
Communication using the D-Bus protocol.\
\
Applications using the QtDBus module can provide services to other, remote\
applications by exporting objects, as well as use services exported by those\
applications by placing calls and accessing properties.\
\
This package depends on qdbus and libqtdbus4 to break their circular dependency\
and allow easy updates from Squeeze to Wheezy."
HOMEPAGE = "http://qt-project.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: qdbus (= 4:4.8.2+dfsg-11+rpi1), libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1)
DEPENDS = "qdbus (= 4:4.8.2+dfsg-11+rpi1) libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1)"

RDEPENDS_${PN} = "qdbus (= 4:4.8.2+dfsg-11+rpi1) libqtdbus4 (= 4:4.8.2+dfsg-11+rpi1)"

DEB_FILE_NAME = "libqt4-dbus_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqt4-dbus_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "7fb3d81084cba35d7087fbc98328483c"
SRC_URI[sha256sum] = "dc6001e07a6d239a3bcf8a0505f0a7775a3235a7f47fc737b067d72b78b665de"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"