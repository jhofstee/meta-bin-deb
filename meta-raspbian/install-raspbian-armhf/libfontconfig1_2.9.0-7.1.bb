PACKAGES = "libfontconfig1"
DESCRIPTION = "\
generic font configuration library - runtime\
Fontconfig is a font configuration and customization library, which\
does not depend on the X Window System. It is designed to locate\
fonts within the system and select them according to requirements\
specified by applications.\
\
This package contains the runtime library needed to launch applications\
using fontconfig."
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libexpat1 (>= 2.0.1), libfreetype6 (>= 2.2.1), zlib1g (>= 1:1.1.4), fontconfig-config (= 2.9.0-7.1)
DEPENDS = "libc6 (>= 2.13-28) libexpat1 (>= 2.0.1) libfreetype6 (>= 2.2.1) zlib1g (>= 1:1.1.4) fontconfig-config (= 2.9.0-7.1)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libexpat1 (>= 2.0.1) libfreetype6 (>= 2.2.1) zlib1g (>= 1:1.1.4) fontconfig-config (= 2.9.0-7.1)"

DEB_FILE_NAME = "libfontconfig1_2.9.0-7.1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/libfontconfig1_2.9.0-7.1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "061dbfeb167b6cb4ebc01be746c5cdf9"
SRC_URI[sha256sum] = "0b8c3bfcadb1830aec21669d1fec99628ac8765b6f7ee76f509953b1aab650ee"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"