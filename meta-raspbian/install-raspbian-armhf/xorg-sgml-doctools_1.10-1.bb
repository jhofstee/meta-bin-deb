PACKAGES = "xorg-sgml-doctools"
DESCRIPTION = "\
Common tools for building X.Org SGML documentation\
This package contains tools for building the X.Org SGML documentation.\
Currently it only includes various entity definitions for the current\
release."
SECTION = "x11"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "xorg-sgml-doctools_1.10-1_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/x/xorg-sgml-doctools/xorg-sgml-doctools_1.10-1_all.deb;unpack=0"
SRC_URI[md5sum] = "2c102317f35779aafbc2aa3734a8e9ce"
SRC_URI[sha256sum] = "9850f0d2a0d8654968608f0f8bf12c15f93511ab2a6dd05ac51b7a4d60027b06"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"