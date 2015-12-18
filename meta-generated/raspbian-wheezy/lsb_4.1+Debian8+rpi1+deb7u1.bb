PACKAGES = "lsb-base"
PROVIDES = "lsb-base"
PACKAGE_EXCLUDE = "lsb-base"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lsb/lsb-base_4.1+Debian8+rpi1+deb7u1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_lsb-base = "lsb-base_4.1+Debian8+rpi1+deb7u1_all.deb"
SRC_URI[deb0.sha256sum] = "825dd4ea89dce68b8a38585015062f89feca6969e1643982856c8bb51ec0c78b"
SRC_URI[deb0.md5sum] = "1c8a3962348a6217de159280bea52abb"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_lsb-base = " \
	./lib/lsb/init-functions.d/ \
	./lib/lsb/init-functions \
	./usr/share/doc/lsb-base/NEWS.Debian.gz \
	./usr/ \
	./ \
	./usr/share/doc/lsb-base/ \
	./usr/share/doc/lsb-base/copyright \
	./usr/share/doc/lsb-base/changelog.gz \
	./lib/ \
	./lib/lsb/init-functions.d/20-left-info-blocks \
	./usr/share/ \
	./usr/share/doc/lsb-base/README.Debian.gz \
	./usr/share/doc/ \
	./lib/lsb/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
