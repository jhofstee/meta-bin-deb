PACKAGES = "x11proto-core-dev"
DESCRIPTION = "\
X11 core wire protocol and auxiliary headers\
This package provides development headers describing the wire protocol\
for the core X11 protocol, and also provides a number of utility headers,\
used to abstract OS-specific functions.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This package is built from the X.org xproto proto module."
SECTION = "x11"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: xorg-sgml-doctools (>= 1:1.5)
DEPENDS = "xorg-sgml-doctools (>= 1:1.5)"

RDEPENDS_${PN} = "xorg-sgml-doctools (>= 1:1.5)"

DEB_FILE_NAME = "x11proto-core-dev_7.0.23-1_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/x/x11proto-core/x11proto-core-dev_7.0.23-1_all.deb;unpack=0"
SRC_URI[md5sum] = "4c4f42b0ec94689f7d6ce3a7c914b54b"
SRC_URI[sha256sum] = "97b323494864640e36dbc9becb38df89a1202e4449a20dd38dc5b4dcea5746e9"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"