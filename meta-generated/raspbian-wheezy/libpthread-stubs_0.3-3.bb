PACKAGES = "libpthread-stubs0-dev libpthread-stubs0"
PROVIDES = "libpthread-stubs0-dev libpthread-stubs0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libp/libpthread-stubs/libpthread-stubs0-dev_0.3-3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libp/libpthread-stubs/libpthread-stubs0_0.3-3_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libpthread-stubs0-dev = "libpthread-stubs0-dev_0.3-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "2f3644d716aaf3e1a3640f84bce6ef322b8e44b2f0f0571870103e88fc555606"
SRC_URI[deb0.md5sum] = "b5e0be84721cb68c73fe119e1bf22215"
DEBFILENAME_libpthread-stubs0 = "libpthread-stubs0_0.3-3_armhf.deb"
SRC_URI[deb1.sha256sum] = "b4e285fde918fb8aef7824e2dad5fd9f82fc8c6625b53d07fe3043f9b3c9d700"
SRC_URI[deb1.md5sum] = "5cfeafd53afb45fae54f119421fcf4e6"

RDEPENDS_${PN}0-dev = "libpthread-stubs0 (= 0.3-3)"

inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpthread-stubs0-dev = " \
	./usr/share/doc/libpthread-stubs0-dev/README \
	./usr/ \
	./ \
	./usr/share/doc/libpthread-stubs0-dev/copyright \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/pthread-stubs.pc \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libpthread-stubs0-dev/changelog.Debian.gz \
	./usr/share/doc/libpthread-stubs0-dev/ \
	./usr/share/ \
	./usr/share/doc/\
"
FILES_libpthread-stubs0 = " \
	./usr/share/doc/libpthread-stubs0/copyright \
	./usr/ \
	./usr/share/doc/libpthread-stubs0/changelog.Debian.gz \
	./usr/share/doc/libpthread-stubs0/ \
	./ \
	./usr/share/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
