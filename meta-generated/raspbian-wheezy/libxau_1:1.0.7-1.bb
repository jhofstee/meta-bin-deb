PACKAGES = "libxau6 libxau-dev"
PROVIDES = "libxau6 libxau-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxau/libxau6_1.0.7-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxau/libxau-dev_1.0.7-1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxau6 = "libxau6_1.0.7-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "f4079f4a10dca6503f0946bb90126e8c52563dd3aec7ca0a8bce5e898c237006"
SRC_URI[deb0.md5sum] = "ac2474996478e530b421246905542f97"
DEBFILENAME_libxau-dev = "libxau-dev_1.0.7-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "496391ec448de84bfc4610d75e6de6818defb7e26ef2de5e6630e57de5bc59a4"
SRC_URI[deb1.md5sum] = "4a44e15e01a05493b9acff5969fee94a"

RDEPENDS_${PN}6 = "libc6 (>= 2.13-28)"
RDEPENDS_${PN}-dev = "libxau6 (= 1:1.0.7-1) x11proto-core-dev"
DEPENDS = "x11proto-core-dev libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxau6 = " \
	./usr/lib/arm-linux-gnueabihf/libXau.so.6.0.0 \
	./usr/share/doc/libxau6/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libXau.so.6 \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libxau6/ \
	./usr/share/doc/libxau6/changelog.Debian.gz \
	./usr/share/doc/libxau6/copyright \
	./usr/share/ \
	./usr/share/doc/\
"
FILES_${PN}-dev = " \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/man/man3/XauWriteAuth.3.gz \
	./usr/share/ \
	./usr/share/man/man3/ \
	./usr/share/man/man3/XauDisposeAuth.3.gz \
	./usr/share/doc/libxau-dev/changelog.gz \
	./usr/ \
	./ \
	./usr/share/doc/libxau-dev/copyright \
	./usr/lib/ \
	./usr/share/man/man3/XauFileName.3.gz \
	./usr/include/ \
	./usr/share/man/man3/XauUnlockAuth.3.gz \
	./usr/share/man/man3/XauGetAuthByAddr.3.gz \
	./usr/lib/arm-linux-gnueabihf/libXau.so \
	./usr/share/man/man3/XauGetBestAuthByAddr.3.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/ \
	./usr/include/X11/Xauth.h \
	./usr/share/doc/libxau-dev/changelog.Debian.gz \
	./usr/share/doc/libxau-dev/ \
	./usr/lib/arm-linux-gnueabihf/libXau.a \
	./usr/share/man/man3/XauReadAuth.3.gz \
	./usr/include/X11/ \
	./usr/share/man/man3/Xau.3.gz \
	./usr/share/man/ \
	./usr/share/man/man3/XauLockAuth.3.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/xau.pc \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
