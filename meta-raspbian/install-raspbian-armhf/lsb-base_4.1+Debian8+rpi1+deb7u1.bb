PACKAGES = "lsb-base"
DESCRIPTION = "\
Linux Standard Base 4.1 init script functionality\
The Linux Standard Base (http://www.linuxbase.org/) is a standard\
core system that third-party applications written for Linux can\
depend upon.\
\
This package only includes the init-functions shell library, which\
may be used by other packages' initialization scripts for console\
logging and other purposes."
HOMEPAGE = "http://www.linuxfoundation.org/collaborate/workgroups/lsb"
SECTION = "misc"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "lsb-base_4.1+Debian8+rpi1+deb7u1_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/l/lsb/lsb-base_4.1+Debian8+rpi1+deb7u1_all.deb;unpack=0"
SRC_URI[md5sum] = "1c8a3962348a6217de159280bea52abb"
SRC_URI[sha256sum] = "825dd4ea89dce68b8a38585015062f89feca6969e1643982856c8bb51ec0c78b"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"