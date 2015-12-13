PACKAGES = "libpcre3"
DESCRIPTION = "\
Perl 5 Compatible Regular Expression Library - runtime files\
This is a library of functions to support regular expressions whose syntax\
and semantics are as close as possible to those of the Perl 5 language.\
\
This package contains the runtime libraries."
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "libpcre3_8.30-5_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcre3_8.30-5_armhf.deb;unpack=0"
SRC_URI[md5sum] = "2e853b7d7962fba41b6a399c41f28742"
SRC_URI[sha256sum] = "bcef150256687180b95e0b8eb489f910871bc6bd287e833a016062efb952cfd2"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"