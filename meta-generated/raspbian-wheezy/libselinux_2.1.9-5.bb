PACKAGES = "libselinux1"
PROVIDES = "libselinux1"
PACKAGE_EXCLUDE = "libselinux1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libselinux/libselinux1_2.1.9-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libselinux1 = "libselinux1_2.1.9-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "3c368324b1c01fac140f38c6061e756d60285bf4f7766e254ecd29a883024596"
SRC_URI[deb0.md5sum] = "75384aba9bdd4a75b5a2263e417de272"

RDEPENDS_${PN}1 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libselinux1 = " \
	./usr/share/doc/libselinux1/copyright \
	./usr/share/lintian/ \
	./usr/ \
	./ \
	./usr/share/lintian/overrides/ \
	./lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libselinux1/changelog.gz \
	./usr/share/doc/libselinux1/changelog.Debian.gz \
	./lib/arm-linux-gnueabihf/libselinux.so.1 \
	./usr/share/doc/libselinux1/ \
	./selinux/ \
	./usr/share/ \
	./usr/share/lintian/overrides/libselinux1 \
	./lib/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
