PACKAGES = "liblcms1"
PROVIDES = "liblcms1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lcms/liblcms1_1.19.dfsg2-1.2+deb7u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblcms1 = "liblcms1_1.19.dfsg2-1.2+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "2c8153d4cec16f7211b74192e515d55c91d622c9d98a5a6f6db492dca8515945"
SRC_URI[deb0.md5sum] = "f82b70f9f1bd98747cfc484f81078f91"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_liblcms1 = " \
	./usr/share/doc/liblcms1/NEWS.gz \
	./usr/share/doc/liblcms1/README.1ST \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/liblcms.so.1.0.19 \
	./usr/lib/arm-linux-gnueabihf/liblcms.so.1 \
	./usr/share/doc/liblcms1/copyright \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/ \
	./usr/share/doc/liblcms1/ \
	./usr/share/doc/ \
	./usr/share/doc/liblcms1/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
