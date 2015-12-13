PACKAGES = "xtrans-dev"
DESCRIPTION = "\
X transport library (development files)\
xtrans includes a number of routines to make X implementations\
transport-independent; at time of writing, it includes support for UNIX\
sockets, IPv4, IPv6, and DECnet.\
\
xtrans is not actually a library in itself; it includes .c files which are\
then used in the compilation of X servers, libraries, et al.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libxtrans"
SECTION = "x11"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "xtrans-dev_1.2.7-1_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/x/xtrans/xtrans-dev_1.2.7-1_all.deb;unpack=0"
SRC_URI[md5sum] = "7b113fbb8d29827e3c5230a3f6e5bcc2"
SRC_URI[sha256sum] = "fd3c7faa859bedbdffe59f4b99e788981c9ba59515af1159e4826ce95428cdf5"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"