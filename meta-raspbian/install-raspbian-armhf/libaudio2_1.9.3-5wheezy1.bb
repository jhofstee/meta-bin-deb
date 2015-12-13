PACKAGES = "libaudio2"
DESCRIPTION = "\
Network Audio System - shared libraries\
The Network Audio System (NAS) was developed by NCD for playing,\
recording, and manipulating audio data over a network. Like the X\
Window System, it uses the client/server model to separate\
applications from the specific drivers that control audio input and\
output devices.\
\
This package contains the NAS library (libaudio), needed for both remote\
and local output."
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libxau6, libxt6
DEPENDS = "libc6 (>= 2.13-28) libxau6 libxt6"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libxau6 libxt6"

DEB_FILE_NAME = "libaudio2_1.9.3-5wheezy1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/n/nas/libaudio2_1.9.3-5wheezy1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "c3d949746b6f022123973472e7481f84"
SRC_URI[sha256sum] = "954aee398090380cda4c5b759a07cf04bc49f72aab7751e65f2254ba25f5d378"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"