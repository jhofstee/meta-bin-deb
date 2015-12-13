PACKAGES = "libgstreamer0.10-0"
DESCRIPTION = "\
Core GStreamer libraries and elements\
GStreamer is a streaming media framework, based on graphs of filters\
which operate on media data.  Applications using this library can do\
anything from real-time sound processing to playing videos, and just\
about anything else media-related.  Its plugin-based architecture means\
that new data types or processing capabilities can be added simply by\
installing new plug-ins.\
\
This package contains the core library and elements."
HOMEPAGE = "http://gstreamer.freedesktop.org"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libglib2.0-0 (>= 2.31.8), libxml2 (>= 2.7.4)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libglib2.0-0 (>= 2.31.8) libxml2 (>= 2.7.4)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libglib2.0-0 (>= 2.31.8) libxml2 (>= 2.7.4)"

DEB_FILE_NAME = "libgstreamer0.10-0_0.10.36-1.2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/g/gstreamer0.10/libgstreamer0.10-0_0.10.36-1.2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "e9f457f50ad6dc816112b2f1fa56d19d"
SRC_URI[sha256sum] = "9c3d67ccb8d16eea02a7f258f54047ff1a87ed1e48ea083f6b84b96a5b70b716"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"