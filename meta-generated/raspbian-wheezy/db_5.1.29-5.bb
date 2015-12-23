PACKAGES = "libdb5.1"
PROVIDES = "libdb5.1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/db/libdb5.1_5.1.29-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdb5.1 = "libdb5.1_5.1.29-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "621f9d8cdd52b322c2bc551c8b3e00d569ce0896237b7b35cc028e4650d666a8"
SRC_URI[deb0.md5sum] = "e271bcb68c76510ca880fec2ba73b4db"

RDEPENDS_lib${PN}5.1 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libdb5.1 = " \
	./usr/share/lintian/ \
	./usr/share/doc/libdb5.1/copyright \
	./usr/ \
	./ \
	./usr/share/lintian/overrides/ \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libdb5.1/build_signature_armhf.txt \
	./usr/share/doc/libdb5.1/ \
	./usr/share/doc/libdb5.1/changelog.Debian.gz \
	./usr/share/ \
	./usr/lib/arm-linux-gnueabihf/libdb-5.1.so \
	./usr/share/doc/ \
	./usr/share/lintian/overrides/libdb5.1\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
