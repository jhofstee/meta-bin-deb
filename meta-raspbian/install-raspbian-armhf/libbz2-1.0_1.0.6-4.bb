PACKAGES = "libbz2-1.0"
DESCRIPTION = "\
high-quality block-sorting file compressor library - runtime\
This package contains libbzip2 which is used by the bzip2 compressor.\
\
bzip2 is a freely available, patent free, high-quality data compressor.\
It typically compresses files to within 10% to 15% of the best available\
techniques, whilst being around twice as fast at compression and six\
times faster at decompression.\
\
bzip2 compresses files using the Burrows-Wheeler block-sorting text\
compression algorithm, and Huffman coding. Compression is generally\
considerably better than that achieved by more conventional\
LZ77/LZ78-based compressors, and approaches the performance of the PPM\
family of statistical compressors.\
\
The archive file format of bzip2 (.bz2) is incompatible with that of its\
predecessor, bzip (.bz)."
HOMEPAGE = "http://www.bzip.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "libbz2-1.0_1.0.6-4_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/b/bzip2/libbz2-1.0_1.0.6-4_armhf.deb;unpack=0"
SRC_URI[md5sum] = "0813f76fd6447253d6ebe5b69875300e"
SRC_URI[sha256sum] = "a559216a6e77f0d221a94764f986d7ca48d84816bb3b7b3dc103a08e52b12101"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"