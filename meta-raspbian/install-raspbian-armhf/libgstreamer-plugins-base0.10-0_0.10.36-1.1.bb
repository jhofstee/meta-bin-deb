PACKAGES = "libgstreamer-plugins-base0.10-0"
DESCRIPTION = "\
GStreamer libraries from the "base" set\
GStreamer is a streaming media framework, based on graphs of filters\
which operate on media data.  Applications using this library can do\
anything from real-time sound processing to playing videos, and just\
about anything else media-related.  Its plugin-based architecture means\
that new data types or processing capabilities can be added simply by\
installing new plug-ins.\
\
This package contains libraries from the "base" set, an essential\
exemplary set of elements."
HOMEPAGE = "http://gstreamer.freedesktop.org"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libglib2.0-0 (>= 2.31.8), libgstreamer0.10-0 (>= 0.10.36), liborc-0.4-0 (>= 1:0.4.16), zlib1g (>= 1:1.1.4), iso-codes
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libglib2.0-0 (>= 2.31.8) libgstreamer0.10-0 (>= 0.10.36) liborc-0.4-0 (>= 1:0.4.16) zlib1g (>= 1:1.1.4) iso-codes"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libglib2.0-0 (>= 2.31.8) libgstreamer0.10-0 (>= 0.10.36) liborc-0.4-0 (>= 1:0.4.16) zlib1g (>= 1:1.1.4) iso-codes"

DEB_FILE_NAME = "libgstreamer-plugins-base0.10-0_0.10.36-1.1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/g/gst-plugins-base0.10/libgstreamer-plugins-base0.10-0_0.10.36-1.1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "46051ce52f622265ebdf7616f5d51ece"
SRC_URI[sha256sum] = "47223d499cf75efc386bc16d1ee24341ac07858bd0f1ded344d0194285e33e43"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"