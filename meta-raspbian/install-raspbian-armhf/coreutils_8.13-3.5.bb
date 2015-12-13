PACKAGES = "coreutils"
DESCRIPTION = "\
GNU core utilities\
This package contains the basic file, shell and text manipulation\
utilities which are expected to exist on every operating system.\
\
Specifically, this package includes:\
arch base64 basename cat chcon chgrp chmod chown chroot cksum comm cp\
csplit cut date dd df dir dircolors dirname du echo env expand expr\
factor false flock fmt fold groups head hostid id install join link ln\
logname ls md5sum mkdir mkfifo mknod mktemp mv nice nl nohup nproc od\
paste pathchk pinky pr printenv printf ptx pwd readlink rm rmdir runcon\
sha*sum seq shred sleep sort split stat stty sum sync tac tail tee test\
timeout touch tr true truncate tsort tty uname unexpand uniq unlink\
users vdir wc who whoami yes"
HOMEPAGE = "http://gnu.org/software/coreutils"
SECTION = "utils"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: dpkg (>= 1.15.4) | install-info
DEPENDS = "dpkg (>= 1.15.4)"

RDEPENDS_${PN} = "dpkg (>= 1.15.4)"

DEB_FILE_NAME = "coreutils_8.13-3.5_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/c/coreutils/coreutils_8.13-3.5_armhf.deb;unpack=0"
SRC_URI[md5sum] = "1ca191ed075aa9422bd97f581452a75a"
SRC_URI[sha256sum] = "c9b3a5f62f2d96a7b0ca0339f92cf9ed6adf499b7e527fe387509df5a6eef9f5"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"