PACKAGES = "libjbig0"
PROVIDES = "libjbig0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/j/jbigkit/libjbig0_2.0-2+deb7u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjbig0 = "libjbig0_2.0-2+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "d9303b7e96865c2b6980bf7dc3ea40bbe298a8c6bce13dc9beac7aeec9a678ae"
SRC_URI[deb0.md5sum] = "59fba8651b725a34cbf13f26edad4071"

RDEPENDS_libjbig0 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libjbig0 = " \
	./usr/share/doc/libjbig0/changelog.gz \
	./usr/ \
	./ \
	./usr/lib/arm-linux-gnueabihf/libjbig.so.0.0.0 \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/libjbig.so.0 \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libjbig0/ \
	./usr/share/ \
	./usr/share/doc/libjbig0/copyright \
	./usr/share/doc/libjbig0/changelog.Debian.gz \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
