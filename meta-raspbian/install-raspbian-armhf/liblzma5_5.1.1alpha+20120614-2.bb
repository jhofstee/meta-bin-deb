PACKAGES = "liblzma5"
DESCRIPTION = "\
XZ-format compression library\
XZ is the successor to the Lempel-Ziv/Markov-chain Algorithm\
compression format, which provides memory-hungry but powerful\
compression (often better than bzip2) and fast, easy decompression.\
\
The native format of liblzma is XZ; it also supports raw (headerless)\
streams and the older LZMA format used by lzma. (For 7-Zip's related\
format, use the p7zip package instead.)"
HOMEPAGE = "http://tukaani.org/xz/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "liblzma5_5.1.1alpha+20120614-2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/x/xz-utils/liblzma5_5.1.1alpha+20120614-2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "00a4e386011c00c30355b89f3b717ae4"
SRC_URI[sha256sum] = "21bf5b0232f618c7553520c8d8f59d164296c8079565fcfd9bee547b251c1349"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"