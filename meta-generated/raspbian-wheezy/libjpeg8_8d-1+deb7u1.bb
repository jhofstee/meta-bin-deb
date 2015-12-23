PACKAGES = "libjpeg8"
PROVIDES = "libjpeg8"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libj/libjpeg8/libjpeg8_8d-1+deb7u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjpeg8 = "libjpeg8_8d-1+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "cb1569ec740992a7ad21529b83bece1be8f964f647d6cbbd71552f8fd7ecf209"
SRC_URI[deb0.md5sum] = "6ef335dfe9fbfffeb83e77d935c2087a"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libjpeg8/README.gz \
	./usr/lib/arm-linux-gnueabihf/libjpeg.so.8 \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/share/doc/libjpeg8/changelog.gz \
	./usr/share/doc/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/lib/arm-linux-gnueabihf/libjpeg.so.8.4.0 \
	./usr/share/doc/libjpeg8/copyright \
	./usr/share/ \
	./usr/share/doc/libjpeg8/ \
	./usr/share/doc/libjpeg8/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
