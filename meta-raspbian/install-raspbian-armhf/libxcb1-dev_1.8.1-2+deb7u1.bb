PACKAGES = "libxcb1-dev"
DESCRIPTION = "\
X C Binding, development files\
This package contains the header and library files needed to build software\
using libxcb, the X C Binding.\
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
SECTION = "libdevel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libxcb1 (= 1.8.1-2+deb7u1), libpthread-stubs0-dev, libxau-dev (>= 1:1.0.0-1), libxdmcp-dev (>= 1:1.0.0-1)
DEPENDS = "libxcb1 (= 1.8.1-2+deb7u1) libpthread-stubs0-dev libxau-dev (>= 1:1.0.0-1) libxdmcp-dev (>= 1:1.0.0-1)"

RDEPENDS_${PN} = "libxcb1 (= 1.8.1-2+deb7u1) libpthread-stubs0-dev libxau-dev (>= 1:1.0.0-1) libxdmcp-dev (>= 1:1.0.0-1)"

DEB_FILE_NAME = "libxcb1-dev_1.8.1-2+deb7u1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb1-dev_1.8.1-2+deb7u1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "53128df5528372fd9fdbd196d7364686"
SRC_URI[sha256sum] = "929c234f1e78e2ad46a4fb9f3043cd9b19ecd91c8226f2a00031035eaf34075d"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"