PACKAGES = "passwd"
DESCRIPTION = "\
change and administer password and group data\
This package includes passwd, chsh, chfn, and many other programs to\
maintain password and group data.\
\
Shadow passwords are supported.  See /usr/share/doc/passwd/README.Debian"
HOMEPAGE = "http://pkg-shadow.alioth.debian.org/"
SECTION = "admin"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libpam0g (>= 0.99.7.1), libselinux1 (>= 1.32), libsemanage1 (>= 2.0.3), libpam-modules, debianutils (>= 2.15.2)
DEPENDS = "libc6 (>= 2.13-28) libpam0g (>= 0.99.7.1) libselinux1 (>= 1.32) libsemanage1 (>= 2.0.3) libpam-modules debianutils (>= 2.15.2)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libpam0g (>= 0.99.7.1) libselinux1 (>= 1.32) libsemanage1 (>= 2.0.3) libpam-modules debianutils (>= 2.15.2)"

DEB_FILE_NAME = "passwd_4.1.5.1-1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/s/shadow/passwd_4.1.5.1-1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "b146633c70c2c7b9931c5a9348a69733"
SRC_URI[sha256sum] = "80a3f811ff90bea6e91c0492310787038b657ad3121bc70520d29724ff908786"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"