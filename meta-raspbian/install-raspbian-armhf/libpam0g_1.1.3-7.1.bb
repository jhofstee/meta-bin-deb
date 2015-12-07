PACKAGES = "libpam0g"
DESCRIPTION = "\
Pluggable Authentication Modules library\
Contains the shared library for Linux-PAM, a library that enables the\
local system administrator to choose how applications authenticate users.\
In other words, without rewriting or recompiling a PAM-aware application,\
it is possible to switch between the authentication mechanism(s) it uses.\
One may entirely upgrade the local authentication system without touching\
the applications themselves."
HOMEPAGE = "http://pam.sourceforge.net/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), debconf (>= 0.5) | debconf-2.0
DEPENDS = "libc6 (>= 2.13-28) debconf (>= 0.5)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) debconf (>= 0.5)"

DEB_FILE_NAME = "libpam0g_1.1.3-7.1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/p/pam/libpam0g_1.1.3-7.1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "242845c33ef2c0b994c07e8e98d7e7a0"
SRC_URI[sha256sum] = "5b808a890894b7e0a5a3878fa3b402f0c091636bc6fcdcc3718a669c715964a4"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"