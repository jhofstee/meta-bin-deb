PACKAGES = "libpcre3"
PROVIDES = "libpcre3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcre3_8.30-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpcre3 = "libpcre3_8.30-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "bcef150256687180b95e0b8eb489f910871bc6bd287e833a016062efb952cfd2"
SRC_URI[deb0.md5sum] = "2e853b7d7962fba41b6a399c41f28742"

RDEPENDS_lib${PN} = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpcre3 = " \
	./usr/share/doc/libpcre3/copyright \
	./usr/share/man/man3/pcrepattern.3.gz \
	./lib/arm-linux-gnueabihf/ \
	./lib/arm-linux-gnueabihf/libpcre.so.3 \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/ \
	./usr/share/man/man3/ \
	./usr/share/doc/libpcre3/AUTHORS \
	./usr/ \
	./ \
	./usr/share/doc/libpcre3/changelog.Debian.gz \
	./usr/lib/ \
	./usr/share/doc/libpcre3/README.Debian \
	./usr/sbin/ \
	./usr/share/doc/libpcre3/changelog.gz \
	./usr/bin/ \
	./usr/share/doc/libpcre3/NEWS.gz \
	./usr/share/doc/libpcre3/README.gz \
	./usr/lib/arm-linux-gnueabihf/libpcreposix.so.3 \
	./usr/lib/arm-linux-gnueabihf/libpcreposix.so.3.13.1 \
	./usr/share/doc/ \
	./lib/ \
	./lib/arm-linux-gnueabihf/libpcre.so.3.13.1 \
	./usr/share/man/ \
	./usr/share/doc/libpcre3/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
