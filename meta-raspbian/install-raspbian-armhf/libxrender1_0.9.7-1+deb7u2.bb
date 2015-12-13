PACKAGES = "libxrender1"
DESCRIPTION = "\
X Rendering Extension client library\
The X Rendering Extension (Render) introduces digital image composition as\
the foundation of a new rendering model within the X Window System.\
Rendering geometric figures is accomplished by client-side tessellation into\
either triangles or trapezoids.  Text is drawn by loading glyphs into the\
server and rendering sets of them.  The Xrender library exposes this\
extension to X clients.\
\
More information about X.Org can be found at:\
<URL:http://www.X.org>\
\
This module can be found at\
git://anongit.freedesktop.org/git/xorg/lib/libXrender"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libx11-6 (>= 2:1.4.99.1)
DEPENDS = "libc6 (>= 2.13-28) libx11-6 (>= 2:1.4.99.1)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libx11-6 (>= 2:1.4.99.1)"

DEB_FILE_NAME = "libxrender1_0.9.7-1+deb7u2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libxrender/libxrender1_0.9.7-1+deb7u2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "6e5d5a6b7f09474ed5664745d4ddf5a3"
SRC_URI[sha256sum] = "4794660c28e7223869e053ded38d721bf305a5d3950e12779270dd342c6c82f0"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"