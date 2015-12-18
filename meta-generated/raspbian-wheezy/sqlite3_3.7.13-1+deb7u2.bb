PACKAGES = "libsqlite3-0"
PROVIDES = "libsqlite3-0"
PACKAGE_EXCLUDE = "libsqlite3-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sqlite3/libsqlite3-0_3.7.13-1+deb7u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsqlite3-0 = "libsqlite3-0_3.7.13-1+deb7u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "20e0a15663d499fc91df2717ece69642f99fcbfd797722a7b037e410de2cc921"
SRC_URI[deb0.md5sum] = "0c0e42bd68f8f926c2512b4ac2abddc1"

RDEPENDS_lib${PN}-0 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsqlite3-0 = " \
	./usr/share/doc/libsqlite3-0/ \
	./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0.8.6 \
	./usr/share/doc/libsqlite3-0/README.Debian \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0 \
	./usr/share/doc/libsqlite3-0/copyright \
	./usr/share/doc/libsqlite3-0/changelog.gz \
	./usr/share/ \
	./usr/share/doc/libsqlite3-0/changelog.Debian.gz \
	./usr/share/doc/ \
	./usr/share/doc/libsqlite3-0/changelog.html.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
