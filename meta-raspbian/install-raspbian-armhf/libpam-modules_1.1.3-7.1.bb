PACKAGES = "libpam-modules"
DESCRIPTION = "\
Pluggable Authentication Modules for PAM\
This package completes the set of modules for PAM. It includes the\
 pam_unix.so module as well as some specialty modules."
HOMEPAGE = "http://pam.sourceforge.net/"
SECTION = "admin"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "libpam-modules_1.1.3-7.1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/p/pam/libpam-modules_1.1.3-7.1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "b847b44d797f8b846a027989069dc249"
SRC_URI[sha256sum] = "9b584d6e4535b046e00df9bd8dba12e98e0d4356f86d84a5e4a403a0604b8120"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"