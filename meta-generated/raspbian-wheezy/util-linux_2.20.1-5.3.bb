PACKAGES = "libuuid1"
PROVIDES = "libuuid1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/libuuid1_2.20.1-5.3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libuuid1 = "libuuid1_2.20.1-5.3_armhf.deb"
SRC_URI[deb0.sha256sum] = "15320a49f6a0b4f7c29249b1a715ac1f6f3b1de57daf9c9582c92fbf798c2946"
SRC_URI[deb0.md5sum] = "29b5ffaddc5497ec7c69f214ffd9d497"

RDEPENDS_libuuid1 = "passwd libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "passwd libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libuuid1 = " \
	./usr/share/doc/libuuid1/ \
	./usr/ \
	./ \
	./usr/share/doc/libuuid1/changelog.Debian.gz \
	./var/ \
	./usr/share/doc/ \
	./usr/share/doc/libuuid1/copyright \
	./usr/share/doc/libuuid1/changelog.gz \
	./lib/arm-linux-gnueabihf/libuuid.so.1 \
	./lib/arm-linux-gnueabihf/ \
	./usr/share/ \
	./lib/arm-linux-gnueabihf/libuuid.so.1.3.0 \
	./var/lib/libuuid/ \
	./lib/ \
	./var/lib/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
