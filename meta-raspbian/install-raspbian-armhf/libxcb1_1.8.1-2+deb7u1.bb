PACKAGES = "libxcb1"
DESCRIPTION = "\
X C Binding\
This package contains the library files needed to run software using libxcb,\
the X C Binding.\
\
The XCB library provides an interface to the X Window System protocol,\
designed to replace the Xlib interface.  XCB provides several advantages over\
Xlib:\
\
 * Size: small library and lower memory footprint\
 * Latency hiding: batch several requests and wait for the replies later\
 * Direct protocol access: one-to-one mapping between interface and protocol\
 * Thread support: access XCB from multiple threads, with no explicit locking\
 * Easy creation of new extensions: automatically generates interface from\
   machine-parsable protocol descriptions"
HOMEPAGE = "http://xcb.freedesktop.org"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libxau6, libxdmcp6
DEPENDS = "libc6 (>= 2.13-28) libxau6 libxdmcp6"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libxau6 libxdmcp6"

DEB_FILE_NAME = "libxcb1_1.8.1-2+deb7u1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb1_1.8.1-2+deb7u1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "8dd6d8005c09ad8bb8a7c8317a5ac244"
SRC_URI[sha256sum] = "e4ca0f79043cf26653b745d9448a5b9e9a271112916393256b35235f042909c1"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"