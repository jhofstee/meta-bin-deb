PACKAGES = "libaudio2"
PROVIDES = "libaudio2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/nas/libaudio2_1.9.3-5wheezy1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libaudio2 = "libaudio2_1.9.3-5wheezy1_armhf.deb"
SRC_URI[deb0.sha256sum] = "954aee398090380cda4c5b759a07cf04bc49f72aab7751e65f2254ba25f5d378"
SRC_URI[deb0.md5sum] = "c3d949746b6f022123973472e7481f84"

RDEPENDS_libaudio2 = "libc6 (>= 2.13-28) libxau6 libxt6"
DEPENDS = "libxau6 libxt6 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libaudio2 = " \
	./usr/share/doc/libaudio2/copyright \
	./usr/share/doc/libaudio2/TODO.gz \
	./usr/share/doc/libaudio2/FAQ.gz \
	./usr/share/libaudio2/ \
	./usr/ \
	./ \
	./usr/share/doc/libaudio2/changelog.gz \
	./usr/share/doc/libaudio2/changelog.Debian.gz \
	./usr/lib/ \
	./usr/share/doc/libaudio2/ \
	./usr/share/doc/libaudio2/README.gz \
	./usr/lib/arm-linux-gnueabihf/libaudio.so.2 \
	./usr/share/doc/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/ \
	./usr/lib/arm-linux-gnueabihf/libaudio.so.2.4 \
	./usr/share/libaudio2/AuErrorDB\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
