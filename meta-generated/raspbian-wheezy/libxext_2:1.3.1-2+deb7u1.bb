PACKAGES = "libxext6"
PROVIDES = "libxext6"
PACKAGE_EXCLUDE = "libxext6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxext/libxext6_1.3.1-2+deb7u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxext6 = "libxext6_1.3.1-2+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "f498dd7530213fcbec981398dc44c55f563b4c38fc9ac0a3176731e6bc6d3316"
SRC_URI[deb0.md5sum] = "528a62a8b523ce393d6ac08fedb776b8"

RDEPENDS_${PN}6 = "libc6 (>= 2.13-28) libx11-6 (>= 2:1.4.99.1)"
DEPENDS = "libx11-6 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxext6 = " \
	./usr/lib/arm-linux-gnueabihf/libXext.so.6.4.0 \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/ \
	./usr/share/doc/libxext6/changelog.Debian.gz \
	./ \
	./usr/lib/arm-linux-gnueabihf/libXext.so.6 \
	./usr/lib/ \
	./usr/share/doc/libxext6/copyright \
	./usr/share/doc/libxext6/changelog.gz \
	./usr/share/ \
	./usr/share/doc/libxext6/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
