PACKAGES = "libgcc1 gcc-4.7-base libgomp1 libstdc++6"
PROVIDES = "libgcc1 gcc-4.7-base libgomp1 libstdc++6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.7/libgcc1_4.7.2-5+rpi1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.7/gcc-4.7-base_4.7.2-5+rpi1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.7/libgomp1_4.7.2-5+rpi1_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.7/libstdc++6_4.7.2-5+rpi1_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libgcc1 = "libgcc1_4.7.2-5+rpi1_armhf.deb"
SRC_URI[deb0.sha256sum] = "f68812a139ce05802ed13e067e982110bbb2b40ecb31ffd9086566516628bc1a"
SRC_URI[deb0.md5sum] = "2f62340a14bf69e221b59f6f67972619"
DEBFILENAME_gcc-4.7-base = "gcc-4.7-base_4.7.2-5+rpi1_armhf.deb"
SRC_URI[deb1.sha256sum] = "84f0b26274831608f4533f35ce37c12e1a3e4aca88009e737f7f2df1b1f2bdc8"
SRC_URI[deb1.md5sum] = "349055ea19358e532336f1b8696262c7"
DEBFILENAME_libgomp1 = "libgomp1_4.7.2-5+rpi1_armhf.deb"
SRC_URI[deb2.sha256sum] = "2c1d80da3aef2463ee02df5eb437efd52afb26901b0a71b3f1efc39667953a39"
SRC_URI[deb2.md5sum] = "5be98d7f1feb4c2d2fe04512b7c891c4"
DEBFILENAME_libstdc++6 = "libstdc++6_4.7.2-5+rpi1_armhf.deb"
SRC_URI[deb3.sha256sum] = "f70337f2e53f8bcee597f8dd699b27dc364d303bd1d90c40084438cb1cd634f9"
SRC_URI[deb3.md5sum] = "69eea0ab025a59bd70db3a1d0bc0f73a"

RDEPENDS_libgcc1 = "gcc-4.7-base (= 4.7.2-5+rpi1) libc6 (>= 2.13-28)"
RDEPENDS_libgomp1 = "gcc-4.7-base (= 4.7.2-5+rpi1) libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
RDEPENDS_libstdc++6 = "gcc-4.7-base (= 4.7.2-5+rpi1) libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libgcc1 = " \
	./usr/share/lintian/ \
	./usr/ \
	./ \
	./usr/share/lintian/overrides/ \
	./lib/arm-linux-gnueabihf/libgcc_s.so.1 \
	./usr/share/doc/libgcc1 \
	./lib/ \
	./lib/arm-linux-gnueabihf/ \
	./usr/share/ \
	./usr/share/lintian/overrides/libgcc1 \
	./usr/share/doc/\
"
FILES_gcc-4.7-base = " \
	./usr/lib/gcc/ \
	./usr/ \
	./ \
	./usr/share/doc/gcc-4.7-base/README.Debian.armhf.gz \
	./usr/lib/ \
	./usr/lib/gcc/arm-linux-gnueabihf/4.7/ \
	./usr/share/doc/gcc-4.7-base/TODO.Debian \
	./usr/share/doc/gcc-4.7-base/changelog.Debian.gz \
	./usr/share/ \
	./usr/share/doc/gcc-4.7-base/ \
	./usr/share/doc/gcc-4.7-base/copyright \
	./usr/lib/gcc/arm-linux-gnueabihf/ \
	./usr/lib/gcc/arm-linux-gnueabihf/4.7.2 \
	./usr/share/doc/\
"
FILES_libgomp1 = " \
	./usr/share/doc/libgomp1 \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/libgomp.so.1.0.0 \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/ \
	./usr/lib/arm-linux-gnueabihf/libgomp.so.1 \
	./usr/share/doc/\
"
FILES_libstdc++6 = " \
	./usr/ \
	./usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.17 \
	./ \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/libstdc++.so.6 \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libstdc++6 \
	./usr/share/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
