PACKAGES = "libqtgui4"
DESCRIPTION = "\
Qt 4 GUI module\
Qt is a cross-platform C++ application framework. Qt's primary feature\
is its rich set of widgets that provide standard GUI functionality.\
\
The QtGui module extends QtCore with GUI functionality."
HOMEPAGE = "http://qt-project.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: fontconfig, libaudio2, libc6 (>= 2.13-28), libfontconfig1 (>= 2.9.0), libfreetype6 (>= 2.3.5), libgcc1 (>= 1:4.4.0), libglib2.0-0 (>= 2.12.0), libice6 (>= 1:1.0.0), libjpeg8 (>= 8c), libmng1 (>= 1.0.10), libpng12-0 (>= 1.2.13-4), libqtcore4 (= 4:4.8.2+dfsg-11+rpi1), libsm6, libstdc++6 (>= 4.4.0), libtiff4 (>> 3.9.5-3~), libx11-6, libxext6, libxrender1, zlib1g (>= 1:1.1.4)
DEPENDS = "fontconfig libaudio2 libc6 (>= 2.13-28) libfontconfig1 (>= 2.9.0) libfreetype6 (>= 2.3.5) libgcc1 (>= 1:4.4.0) libglib2.0-0 (>= 2.12.0) libice6 (>= 1:1.0.0) libjpeg8 (>= 8c) libmng1 (>= 1.0.10) libpng12-0 (>= 1.2.13-4) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libsm6 libstdc++6 (>= 4.4.0) libtiff4 (>> 3.9.5-3~) libx11-6 libxext6 libxrender1 zlib1g (>= 1:1.1.4)"

RDEPENDS_${PN} = "fontconfig libaudio2 libc6 (>= 2.13-28) libfontconfig1 (>= 2.9.0) libfreetype6 (>= 2.3.5) libgcc1 (>= 1:4.4.0) libglib2.0-0 (>= 2.12.0) libice6 (>= 1:1.0.0) libjpeg8 (>= 8c) libmng1 (>= 1.0.10) libpng12-0 (>= 1.2.13-4) libqtcore4 (= 4:4.8.2+dfsg-11+rpi1) libsm6 libstdc++6 (>= 4.4.0) libtiff4 (>> 3.9.5-3~) libx11-6 libxext6 libxrender1 zlib1g (>= 1:1.1.4)"

DEB_FILE_NAME = "libqtgui4_4.8.2+dfsg-11+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qt4-x11/libqtgui4_4.8.2+dfsg-11+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "b08778b8cb022cf695d9eb8411f0b586"
SRC_URI[sha256sum] = "2be1bb353435402b965e4279af2975f0bcdd7daa8f7a34d6438f98b2160b81bc"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"