PACKAGES = "libffi5"
PROVIDES = "libffi5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libf/libffi/libffi5_3.0.10-3+b3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libffi5 = "libffi5_3.0.10-3+b3_armhf.deb"
SRC_URI[deb0.sha256sum] = "fbcaad888cbb491755461eea219b81792fe03f50317438af81c8510b44b9867c"
SRC_URI[deb0.md5sum] = "09df30f1365f75c0b2b307151823463a"

RDEPENDS_${PN}5 = "libc6 (>= 2.4) libgcc1 (>= 1:4.1.1)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libffi5 = " \
	./usr/lib/arm-linux-gnueabihf/libffi.so.5.0.10 \
	./usr/lib/arm-linux-gnueabihf/libffi.so.5 \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/share/doc/libffi5/copyright \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libffi5/changelog.Debian.gz \
	./usr/share/doc/libffi5/ \
	./usr/share/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
