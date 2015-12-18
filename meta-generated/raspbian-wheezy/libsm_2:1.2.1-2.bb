PACKAGES = "libsm6"
PROVIDES = "libsm6"
PACKAGE_EXCLUDE = "libsm6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libsm/libsm6_1.2.1-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsm6 = "libsm6_1.2.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "a78d46ab8a965a39517e3c7ade9a8c27ca7d8fd12d75de8611db536848471a86"
SRC_URI[deb0.md5sum] = "9f184562c9b7b6d726ebdaa3c6ae4a05"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) libice6 (>= 1:1.0.0) libuuid1 (>= 2.16)"
DEPENDS = "libice6 libuuid1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsm6 = " \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/lib/arm-linux-gnueabihf/libSM.so.6 \
	./usr/ \
	./usr/share/doc/libsm6/changelog.Debian.gz \
	./usr/share/doc/libsm6/copyright \
	./ \
	./usr/share/doc/libsm6/ \
	./usr/lib/ \
	./usr/share/ \
	./usr/lib/arm-linux-gnueabihf/libSM.so.6.0.1 \
	./usr/share/doc/ \
	./usr/share/doc/libsm6/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
