PACKAGES = "libice6"
PROVIDES = "libice6"
PACKAGE_EXCLUDE = "libice6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libi/libice/libice6_1.0.8-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libice6 = "libice6_1.0.8-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "051fa9113ac863eaeb85020ae93ec1d8b7e87cb7c3bf1ffab66c230fd391d755"
SRC_URI[deb0.md5sum] = "23312ea013fe4bb04ce490a89589f486"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) x11-common"
DEPENDS = "x11-common libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libice6 = " \
	./usr/ \
	./ \
	./usr/share/doc/libice6/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libICE.so.6 \
	./usr/lib/arm-linux-gnueabihf/libICE.so.6.3.0 \
	./usr/share/doc/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libice6/copyright \
	./usr/share/ \
	./usr/share/doc/libice6/changelog.Debian.gz \
	./usr/share/doc/libice6/ \
	./usr/lib/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
