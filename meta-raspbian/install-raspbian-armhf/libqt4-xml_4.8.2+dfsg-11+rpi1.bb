PACKAGES = "libqt4-xml"
DESCRIPTION = "\
Qt 4 XML module\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
The QtXml module provides a stream reader and writer for XML documents,\
and C++ implementations of SAX and DOM."
HOMEPAGE = "http://qt-project.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libstdc++6 (>= 4.3.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.3.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.3.0)"

DEB_FILE_NAME = "libqt4-xml_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqt4-xml_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "58c7712ab612e56ef9e07ed7d3d68eb8"
SRC_URI[sha256sum] = "ba2d9c47a1c50bb62fe66210e76281212a0d2cebb1995d42113c6fa6c9d7b37b"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"