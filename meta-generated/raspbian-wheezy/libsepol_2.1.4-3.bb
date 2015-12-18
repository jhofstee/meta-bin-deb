PACKAGES = "libsepol1"
PROVIDES = "libsepol1"
PACKAGE_EXCLUDE = "libsepol1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libsepol/libsepol1_2.1.4-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsepol1 = "libsepol1_2.1.4-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "e77e297176bc457700716314caa7411249a220be2824cbf72a930572fb4baf4d"
SRC_URI[deb0.md5sum] = "526961da9d69615feab09752caacd686"

RDEPENDS_${PN}1 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsepol1 = " \
	./usr/share/doc/libsepol1/copyright \
	./usr/share/doc/libsepol1/changelog.gz \
	./usr/ \
	./ \
	./lib/arm-linux-gnueabihf/ \
	./lib/ \
	./usr/share/doc/libsepol1/changelog.Debian.gz \
	./usr/share/doc/libsepol1/ \
	./usr/share/ \
	./lib/arm-linux-gnueabihf/libsepol.so.1 \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
