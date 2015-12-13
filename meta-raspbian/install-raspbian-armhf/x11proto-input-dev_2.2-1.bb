PACKAGES = "x11proto-input-dev"
DESCRIPTION = "\
X11 Input extension wire protocol\
This package provides development headers describing the wire protocol\
for the Input extension, used to control all manner of options related\
to input device handling.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This package is built from the X.org inputproto proto module."
SECTION = "x11"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: x11proto-core-dev
DEPENDS = "x11proto-core-dev"

RDEPENDS_${PN} = "x11proto-core-dev"

DEB_FILE_NAME = "x11proto-input-dev_2.2-1_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/x/x11proto-input/x11proto-input-dev_2.2-1_all.deb;unpack=0"
SRC_URI[md5sum] = "bf4228040086ffb6b222b830d1c83a76"
SRC_URI[sha256sum] = "f7cb888a1406c6fd861ebf4e069641f938ec7e889929e85373b35c3f04854952"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"