PACKAGES = "qt4-linguist-tools"
DESCRIPTION = "\
Qt 4 Linguist tools\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
This package contains lupdate and lrelease. lupdate is a command line tool\
that finds the translatable strings in the specified source, header and\
Qt Designer interface files, and produces or updates .ts translation files.\
lrelease is a command line tool that produces QM files out of TS files."
HOMEPAGE = "http://qt-project.org/"
SECTION = "devel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libqt4-xml (= 4:4.8.2+dfsg-11+rpi1), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libstdc++6 (>= 4.4.0), zlib1g (>= 1:1.1.4)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0) zlib1g (>= 1:1.1.4)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-xml (= 4:4.8.2+dfsg-11+rpi1) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libstdc++6 (>= 4.4.0) zlib1g (>= 1:1.1.4)"

DEB_FILE_NAME = "qt4-linguist-tools_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/qt4-linguist-tools_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "f171d026d617dc23c4c515379f652dff"
SRC_URI[sha256sum] = "4e4eb6a6006fa94ca8f3f6a5def4700330ba059e1288b4007a97c270a9e71bd5"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"