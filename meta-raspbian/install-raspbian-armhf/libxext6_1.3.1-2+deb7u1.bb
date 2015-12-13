PACKAGES = "libxext6"
DESCRIPTION = "\
X11 miscellaneous extension library\
libXext provides an X Window System client interface to several extensions to\
the X protocol.\
\
The supported protocol extensions are:\
 - DOUBLE-BUFFER (DBE), the Double Buffer extension;\
 - DPMS, the VESA Display Power Management System extension;\
 - Extended-Visual-Information (EVI), an extension for gathering extra\
   information about the X server's visuals;\
 - LBX, the Low Bandwidth X extension;\
 - MIT-SHM, the MIT X client/server shared memory extension;\
 - MIT-SUNDRY-NONSTANDARD, a miscellaneous extension by MIT;\
 - Multi-Buffering, the multi-buffering and stereo display extension;\
 - SECURITY, the X security extension;\
 - SHAPE, the non-rectangular shaped window extension;\
 - SYNC, the X synchronization extension;\
 - TOG-CUP, the Open Group's Colormap Utilization extension;\
 - XC-APPGROUP, the X Consortium's Application Group extension;\
 - XC-MISC, the X Consortium's resource ID querying extension;\
 - XTEST, the X test extension (this is one of two client-side\
   implementations; the other is in the libXtst library, provided by the\
   libxtst6 package);\
\
libXext also provides a small set of utility functions to aid authors of\
client APIs for X protocol extensions.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libXext"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libx11-6 (>= 2:1.4.99.1)
DEPENDS = "libc6 (>= 2.13-28) libx11-6 (>= 2:1.4.99.1)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libx11-6 (>= 2:1.4.99.1)"

DEB_FILE_NAME = "libxext6_1.3.1-2+deb7u1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libxext/libxext6_1.3.1-2+deb7u1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "528a62a8b523ce393d6ac08fedb776b8"
SRC_URI[sha256sum] = "f498dd7530213fcbec981398dc44c55f563b4c38fc9ac0a3176731e6bc6d3316"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"