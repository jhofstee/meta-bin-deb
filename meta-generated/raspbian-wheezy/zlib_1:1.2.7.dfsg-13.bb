PACKAGES = "zlib1g"
PROVIDES = "zlib1g"
PACKAGE_EXCLUDE = "zlib1g"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/z/zlib/zlib1g_1.2.7.dfsg-13_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_zlib1g = "zlib1g_1.2.7.dfsg-13_armhf.deb"
SRC_URI[deb0.sha256sum] = "0789b0eeb527054e6f834dc717689a470bd4d25f55548cdd890924dbc9379a46"
SRC_URI[deb0.md5sum] = "efcbf46d520b22c56f57fe0693ed9f69"

RDEPENDS_${PN}1g = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_zlib1g = " \
	./usr/ \
	./usr/share/doc/zlib1g/ \
	./ \
	./usr/share/doc/zlib1g/copyright \
	./lib/arm-linux-gnueabihf/ \
	./usr/share/doc/zlib1g/changelog.Debian.gz \
	./usr/share/doc/zlib1g/changelog.gz \
	./lib/arm-linux-gnueabihf/libz.so.1 \
	./lib/arm-linux-gnueabihf/libz.so.1.2.7 \
	./usr/share/ \
	./lib/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
