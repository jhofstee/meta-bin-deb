PACKAGES = "libexpat1"
PROVIDES = "libexpat1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/e/expat/libexpat1_2.1.0-1+deb7u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libexpat1 = "libexpat1_2.1.0-1+deb7u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "4f0541d464a26d6e3a427744d685d3dce5dd051e73a36d1595e5fca9e48e7801"
SRC_URI[deb0.md5sum] = "ba0074284a7001a69a16de12f7037b5c"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libexpat1 = " \
	./usr/share/doc/libexpat1/ \
	./usr/lib/arm-linux-gnueabihf/libexpatw.so.1 \
	./usr/ \
	./ \
	./lib/arm-linux-gnueabihf/ \
	./usr/lib/ \
	./usr/share/doc/libexpat1/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libexpat1/copyright \
	./usr/share/doc/libexpat1/changelog.gz \
	./usr/share/ \
	./lib/arm-linux-gnueabihf/libexpat.so.1.6.0 \
	./lib/ \
	./usr/share/doc/ \
	./lib/arm-linux-gnueabihf/libexpat.so.1 \
	./usr/lib/arm-linux-gnueabihf/libexpatw.so.1.6.0\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
