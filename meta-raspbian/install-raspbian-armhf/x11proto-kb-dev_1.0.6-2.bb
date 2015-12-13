PACKAGES = "x11proto-kb-dev"
DESCRIPTION = "\
X11 XKB extension wire protocol\
This package provides development headers describing the wire protocol\
for the XKEYBOARD extension, used to control all manner of options\
related to keyboard handling and layout in particular.\
It does not control the addition/enabling/disabling of keyboards;\
this is done with the XINPUT extension.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This package is built from the X.org kbproto proto module."
SECTION = "x11"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "x11proto-kb-dev_1.0.6-2_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/x/x11proto-kb/x11proto-kb-dev_1.0.6-2_all.deb;unpack=0"
SRC_URI[md5sum] = "892865f3dc1b65a8a5c84413c2ce424b"
SRC_URI[sha256sum] = "b7ff8eceb9f05eb470700807c73fdae88f5f9f8b8fbef869029882264dbebd81"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"