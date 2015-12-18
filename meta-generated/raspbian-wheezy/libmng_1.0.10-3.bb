PACKAGES = "libmng1"
PROVIDES = "libmng1"
PACKAGE_EXCLUDE = "libmng1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libm/libmng/libmng1_1.0.10-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libmng1 = "libmng1_1.0.10-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "e38118cf220f9bd4dff90bc474d79226d5467fbcba9884832d2f90023d807f3d"
SRC_URI[deb0.md5sum] = "b88ee5b6f3dfe053cfded22c04804b9a"

RDEPENDS_${PN}1 = "libc6 (>= 2.13-28) libjpeg8 (>= 8c) liblcms1 (>= 1.15-1) zlib1g (>= 1:1.1.4)"
DEPENDS = "zlib1g liblcms1 libjpeg8 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libmng1 = " \
	./usr/share/doc/libmng1/ \
	./usr/ \
	./ \
	./usr/share/doc/libmng1/changelog.Debian.gz \
	./usr/share/doc/libmng1/README \
	./usr/share/doc/libmng1/copyright \
	./usr/lib/arm-linux-gnueabihf/libmng.so.1 \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/lib/arm-linux-gnueabihf/libmng.so.1.1.0.10 \
	./usr/share/doc/libmng1/changelog.gz \
	./usr/share/ \
	./usr/share/doc/ \
	./usr/lib/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
