PACKAGES = "libncursesw5 libtinfo5"
PROVIDES = "libncursesw5 libtinfo5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libncursesw5_5.9-10_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libtinfo5_5.9-10_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw5 = "libncursesw5_5.9-10_armhf.deb"
SRC_URI[deb0.sha256sum] = "81ff9826baee28ee55904b22ef2afe255659f5dfc1287a537f5c5afe643da0cf"
SRC_URI[deb0.md5sum] = "ab51faebe29e30e9d82df1c12d687c8c"
DEBFILENAME_libtinfo5 = "libtinfo5_5.9-10_armhf.deb"
SRC_URI[deb1.sha256sum] = "d690ade92a6bf1bebbe3bc7e8d56fa4e627d8eee6860f3b103f5126fdfe90c01"
SRC_URI[deb1.md5sum] = "9513f89c04871105ac9884c5afd77cec"

RDEPENDS_lib${PN}w5 = "libtinfo5 (= 5.9-10) libc6 (>= 2.13-28)"
RDEPENDS_libtinfo5 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libncursesw5 = " \
	./usr/lib/arm-linux-gnueabihf/libpanelw.so.5 \
	./lib/arm-linux-gnueabihf/libncursesw.so.5.9 \
	./usr/lib/arm-linux-gnueabihf/libmenuw.so.5 \
	./usr/ \
	./ \
	./lib/arm-linux-gnueabihf/ \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/libpanelw.so.5.9 \
	./usr/lib/arm-linux-gnueabihf/libformw.so.5.9 \
	./lib/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/lib/arm-linux-gnueabihf/libformw.so.5 \
	./usr/share/doc/libncursesw5 \
	./usr/lib/arm-linux-gnueabihf/libmenuw.so.5.9 \
	./usr/share/ \
	./lib/arm-linux-gnueabihf/libncursesw.so.5 \
	./usr/share/doc/\
"
FILES_libtinfo5 = " \
	./usr/lib/arm-linux-gnueabihf/libtic.so.5.9 \
	./lib/arm-linux-gnueabihf/libtinfo.so.5 \
	./lib/arm-linux-gnueabihf/libtinfo.so.5.9 \
	./usr/ \
	./ \
	./lib/arm-linux-gnueabihf/ \
	./usr/lib/ \
	./usr/share/doc/libtinfo5/changelog.gz \
	./usr/share/doc/libtinfo5/copyright \
	./lib/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/lib/arm-linux-gnueabihf/libtic.so.5 \
	./usr/share/doc/libtinfo5/TODO.Debian \
	./usr/share/doc/libtinfo5/changelog.Debian.gz \
	./usr/share/doc/libtinfo5/ \
	./usr/share/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
