PACKAGES = "libice6"
DESCRIPTION = "\
X11 Inter-Client Exchange library\
This package provides the main interface to the X11 Inter-Client Exchange\
library, which allows for communication of data between X clients.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libICE"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.4), x11-common
DEPENDS = "libc6 (>= 2.4) x11-common"

RDEPENDS_${PN} = "libc6 (>= 2.4) x11-common"

DEB_FILE_NAME = "libice6_1.0.8-2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libi/libice/libice6_1.0.8-2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "23312ea013fe4bb04ce490a89589f486"
SRC_URI[sha256sum] = "051fa9113ac863eaeb85020ae93ec1d8b7e87cb7c3bf1ffab66c230fd391d755"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"