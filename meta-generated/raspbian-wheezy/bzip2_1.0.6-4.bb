PACKAGES = "libbz2-1.0"
PROVIDES = "libbz2-1.0"
PACKAGE_EXCLUDE = "libbz2-1.0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/bzip2/libbz2-1.0_1.0.6-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbz2-1.0 = "libbz2-1.0_1.0.6-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "a559216a6e77f0d221a94764f986d7ca48d84816bb3b7b3dc103a08e52b12101"
SRC_URI[deb0.md5sum] = "0813f76fd6447253d6ebe5b69875300e"

RDEPENDS_libbz2-1.0 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libbz2-1.0 = " \
	./usr/share/doc/libbz2-1.0/ \
	./lib/arm-linux-gnueabihf/libbz2.so.1.0 \
	./usr/ \
	./usr/share/doc/libbz2-1.0/changelog.Debian.gz \
	./usr/share/doc/libbz2-1.0/changelog.gz \
	./lib/arm-linux-gnueabihf/ \
	./ \
	./lib/arm-linux-gnueabihf/libbz2.so.1.0.4 \
	./lib/ \
	./lib/arm-linux-gnueabihf/libbz2.so.1 \
	./usr/share/ \
	./usr/share/doc/libbz2-1.0/copyright \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
