PACKAGES = "libcap2"
PROVIDES = "libcap2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libc/libcap2/libcap2_2.22-1.2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libcap2 = "libcap2_2.22-1.2_armhf.deb"
SRC_URI[deb0.sha256sum] = "fba9a7045abf13b0fb88ba82d3c8542d9eaff10de866a6a293066b5f3230a00a"
SRC_URI[deb0.md5sum] = "bb2ba20a51022848159f71ebcb28fa7a"

RDEPENDS_${PN} = "libattr1 (>= 1:2.4.46-8) libc6 (>= 2.13-28)"
DEPENDS = "libattr1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/ \
	./ \
	./usr/share/doc/libcap2/copyright \
	./lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libcap2/changelog.Debian.gz \
	./usr/share/doc/libcap2/ \
	./lib/arm-linux-gnueabihf/libcap.so.2.22 \
	./lib/ \
	./usr/share/ \
	./lib/arm-linux-gnueabihf/libcap.so.2 \
	./usr/share/doc/libcap2/changelog.gz \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
