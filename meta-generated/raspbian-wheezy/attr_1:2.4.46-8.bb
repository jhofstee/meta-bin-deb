PACKAGES = "libattr1"
PROVIDES = "libattr1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/a/attr/libattr1_2.4.46-8_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libattr1 = "libattr1_2.4.46-8_armhf.deb"
SRC_URI[deb0.sha256sum] = "d1c611d054fc4007416974ae473fcf0e8681103d7afcbfc56ec50a5d85ba3db7"
SRC_URI[deb0.md5sum] = "a9dd77ef75615006931a2e6d6622ed08"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libattr1 = " \
	./usr/share/doc/libattr1/ \
	./usr/share/doc/libattr1/changelog.gz \
	./usr/ \
	./ \
	./lib/arm-linux-gnueabihf/ \
	./lib/arm-linux-gnueabihf/libattr.so.1.1.0 \
	./lib/ \
	./lib/arm-linux-gnueabihf/libattr.so.1 \
	./usr/share/ \
	./usr/share/doc/libattr1/copyright \
	./usr/share/doc/ \
	./usr/share/doc/libattr1/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
