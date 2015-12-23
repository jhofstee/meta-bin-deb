PACKAGES = "libustr-1.0-1"
PROVIDES = "libustr-1.0-1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/u/ustr/libustr-1.0-1_1.0.4-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libustr-1.0-1 = "libustr-1.0-1_1.0.4-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "d47453aa7e02e87fbae0053967d12cc717d51cdc58aaa690400f2ca8e44798c4"
SRC_URI[deb0.md5sum] = "194ac504b3c2c4e5c6ec3ac71cdc1ab0"

RDEPENDS_lib${PN}-1.0-1 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libustr-1.0-1 = " \
	./usr/share/doc/libustr-1.0-1/README \
	./usr/share/doc/libustr-1.0-1/AUTHORS \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/share/doc/libustr-1.0-1/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libustr-1.0-1/changelog.gz \
	./usr/share/doc/libustr-1.0-1/changelog.Debian.gz \
	./usr/share/doc/libustr-1.0-1/NEWS.gz \
	./usr/share/doc/libustr-1.0-1/THANKS \
	./usr/share/doc/libustr-1.0-1/TODO \
	./usr/share/ \
	./usr/share/doc/libustr-1.0-1/copyright \
	./usr/lib/arm-linux-gnueabihf/libustr-1.0.so.1.0.4 \
	./usr/share/doc/ \
	./usr/lib/arm-linux-gnueabihf/libustr-1.0.so.1\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
