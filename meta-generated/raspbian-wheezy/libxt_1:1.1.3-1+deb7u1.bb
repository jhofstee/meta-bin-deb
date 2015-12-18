PACKAGES = "libxt6"
PROVIDES = "libxt6"
PACKAGE_EXCLUDE = "libxt6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxt/libxt6_1.1.3-1+deb7u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxt6 = "libxt6_1.1.3-1+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "68c8380095bdb061df130b6278b1e7e628d0b8a6c87faa7218d0a83af424f577"
SRC_URI[deb0.md5sum] = "0fabbdf5d4668908556738d4b7025c46"

RDEPENDS_${PN}6 = "libc6 (>= 2.13-28) libice6 (>= 1:1.0.0) libsm6 libx11-6"
DEPENDS = "libx11-6 libice6 libsm6 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxt6 = " \
	./usr/share/doc/libxt6/copyright \
	./usr/share/doc/libxt6/ \
	./usr/lib/arm-linux-gnueabihf/libXt.so.6.0.0 \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/share/doc/libxt6/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/lib/arm-linux-gnueabihf/libXt.so.6 \
	./usr/share/ \
	./usr/share/doc/libxt6/changelog.gz \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
