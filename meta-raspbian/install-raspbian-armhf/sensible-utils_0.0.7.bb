PACKAGES = "sensible-utils"
DESCRIPTION = "\
Utilities for sensible alternative selection\
This package provides a number of small utilities which are used\
by programs to sensibly select and spawn an appropriate browser,\
editor, or pager.\
\
The specific utilities included are: sensible-browser sensible-editor\
sensible-pager"
SECTION = "utils"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "sensible-utils_0.0.7_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/s/sensible-utils/sensible-utils_0.0.7_all.deb;unpack=0"
SRC_URI[md5sum] = "ed7a3dc62ee82c05c5248bee6984464f"
SRC_URI[sha256sum] = "6e79af747541c98f0b46acc95fa7ca1be195960c9632162ed1645dea88696ab3"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"