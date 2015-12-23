PACKAGES = "libtiff4"
PROVIDES = "libtiff4"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/tiff3/libtiff4_3.9.6-11_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtiff4 = "libtiff4_3.9.6-11_armhf.deb"
SRC_URI[deb0.sha256sum] = "bc48adade4f0f2fbbb965a8902740921ac46c4f1f1b5a31ab91bdc3f2af124e6"
SRC_URI[deb0.md5sum] = "ffe24f000022cf495b2b2ea692cb04ec"

RDEPENDS_libtiff4 = "libc6 (>= 2.13-28) libjbig0 libjpeg8 (>= 8c) zlib1g (>= 1:1.1.4)"
DEPENDS = "zlib1g libjbig0 libjpeg8 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libtiff4 = " \
	./usr/share/doc/libtiff4/copyright \
	./usr/share/lintian/ \
	./usr/share/doc/libtiff4/README.Debian \
	./usr/ \
	./ \
	./usr/share/lintian/overrides/ \
	./usr/share/doc/libtiff4/changelog.gz \
	./usr/share/lintian/overrides/libtiff4 \
	./usr/share/doc/libtiff4/ \
	./usr/share/doc/libtiff4/README \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libtiff4/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libtiff.so.4 \
	./usr/share/ \
	./usr/share/doc/libtiff4/TODO \
	./usr/lib/arm-linux-gnueabihf/libtiff.so.4.3.6 \
	./usr/share/doc/ \
	./usr/lib/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
