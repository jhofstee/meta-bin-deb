PACKAGES = "libffi5"
DESCRIPTION = "\
Foreign Function Interface library runtime\
A foreign function interface is the popular name for the interface that\
allows code written in one language to call code written in another\
language."
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.4), libgcc1 (>= 1:4.1.1)
DEPENDS = "libc6 (>= 2.4) libgcc1 (>= 1:4.1.1)"

RDEPENDS_${PN} = "libc6 (>= 2.4) libgcc1 (>= 1:4.1.1)"

DEB_FILE_NAME = "libffi5_3.0.10-3+b3_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libf/libffi/libffi5_3.0.10-3+b3_armhf.deb;unpack=0"
SRC_URI[md5sum] = "09df30f1365f75c0b2b307151823463a"
SRC_URI[sha256sum] = "fbcaad888cbb491755461eea219b81792fe03f50317438af81c8510b44b9867c"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"