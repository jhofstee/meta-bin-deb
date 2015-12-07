PACKAGES = "gcc-4.7-base"
DESCRIPTION = "\
GCC, the GNU Compiler Collection (base package)\
This package contains files common to all languages and libraries\
contained in the GNU Compiler Collection (GCC)."
HOMEPAGE = "http://gcc.gnu.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "gcc-4.7-base_4.7.2-5+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.7/gcc-4.7-base_4.7.2-5+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "349055ea19358e532336f1b8696262c7"
SRC_URI[sha256sum] = "84f0b26274831608f4533f35ce37c12e1a3e4aca88009e737f7f2df1b1f2bdc8"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"