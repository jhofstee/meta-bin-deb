PACKAGES = "qt4-qmake"
DESCRIPTION = "\
Qt 4 qmake Makefile generator tool\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
This package contains Qt 4 qmake (qmake-qt4), a tool that helps simplify\
the build process for development project across different platforms.\
qmake automates the generation of Makefiles so that only a few lines of\
information are needed to create each Makefile. qmake can be used for any\
software project, whether it is written using Qt or not.\
\
Qt 4 qmake requires a platform and compiler description file which contains\
many default values used to generate appropriate Makefiles.\
\
This package contains also these platform specifications."
HOMEPAGE = "http://qt-project.org/"
SECTION = "devel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libstdc++6 (>= 4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libstdc++6 (>= 4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libstdc++6 (>= 4.4.0)"

DEB_FILE_NAME = "qt4-qmake_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/qt4-qmake_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "1b36afaa855e02f8a1dca84aeeb73b30"
SRC_URI[sha256sum] = "392c189b384571b25dc99af9c6e9bc412e83f86a4afa6493be05490e78bed9fd"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"