PACKAGES = "libgmp10"
PROVIDES = "libgmp10"
PACKAGE_EXCLUDE = "libgmp10"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gmp/libgmp10_5.0.5+dfsg-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgmp10 = "libgmp10_5.0.5+dfsg-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "7b9643e8cf78ce843f42093576e15c878a3a1c40fdb68c8c7c21d5cc0e5966ee"
SRC_URI[deb0.md5sum] = "f517016a32ce6020b88250f916ec462c"

RDEPENDS_lib${PN}10 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libgmp10 = " \
	./usr/lib/arm-linux-gnueabihf/libgmp.so.10.0.5 \
	./usr/share/doc/libgmp10/TODO.Debian \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/share/doc/libgmp10/copyright \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libgmp10/README.Debian \
	./usr/lib/arm-linux-gnueabihf/libgmp.so.10 \
	./usr/share/doc/libgmp10/changelog.Debian.gz \
	./usr/share/ \
	./usr/share/doc/libgmp10/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
