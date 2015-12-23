PACKAGES = "libmpfr4"
PROVIDES = "libmpfr4"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/m/mpfr4/libmpfr4_3.1.0-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libmpfr4 = "libmpfr4_3.1.0-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "173ffca98292709779b01b52ccc39d40dfcf1263c2a3df1649bb596316e94901"
SRC_URI[deb0.md5sum] = "208a3c06ae0fddd75671204bfc1c3cb8"

RDEPENDS_lib${PN} = "libc6 (>= 2.13-28) libgmp10"
DEPENDS = "libgmp10 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libmpfr4 = " \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libmpfr4/TODO.gz \
	./usr/share/doc/libmpfr4/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libmpfr.so.4.1.0 \
	./usr/ \
	./ \
	./usr/share/doc/libmpfr4/NEWS.gz \
	./usr/lib/ \
	./usr/share/doc/libmpfr4/ \
	./usr/share/doc/libmpfr4/BUGS \
	./usr/share/doc/libmpfr4/README.Debian \
	./usr/share/doc/libmpfr4/changelog.Debian.gz \
	./usr/share/doc/libmpfr4/copyright \
	./usr/lib/arm-linux-gnueabihf/libmpfr.so.4 \
	./usr/share/doc/libmpfr4/README \
	./usr/share/ \
	./usr/share/doc/ \
	./usr/share/doc/libmpfr4/AUTHORS\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
