PACKAGES = "dpkg"
DESCRIPTION = "\
Debian package management system\
This package provides the low-level infrastructure for handling the\
installation and removal of Debian software packages.\
\
For Debian package development tools, install dpkg-dev."
HOMEPAGE = "http://wiki.debian.org/Teams/Dpkg"
SECTION = "admin"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "dpkg_1.16.16+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/d/dpkg/dpkg_1.16.16+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "1b00c6bad2e15721d30b373031e58288"
SRC_URI[sha256sum] = "4f2b19fae64b0d5a7d6850540f28b2a7e231af7219f5cd5c97e01b4c1c785046"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"