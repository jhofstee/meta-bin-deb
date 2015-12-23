PACKAGES = "libboost-regex-dev libboost-system-dev libboost-program-options-dev libboost-thread-dev"
PROVIDES = "libboost-regex-dev libboost-system-dev libboost-program-options-dev libboost-thread-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-regex-dev_1.49.0.1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-system-dev_1.49.0.1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-program-options-dev_1.49.0.1_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-thread-dev_1.49.0.1_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libboost-regex-dev = "libboost-regex-dev_1.49.0.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "a9e137ddf75294b8ead33e8b6ab84e15ab8d8265aef6a511169edfc2be52418c"
SRC_URI[deb0.md5sum] = "0f57a457a9db3e13d5420b812b61b464"
DEBFILENAME_libboost-system-dev = "libboost-system-dev_1.49.0.1_armhf.deb"
SRC_URI[deb1.sha256sum] = "d1d27c408afa2e31df1a721459f44b7128a70cc05e236e38bd6b653fdc174163"
SRC_URI[deb1.md5sum] = "3f969d6546f278755d7d5197c7e69798"
DEBFILENAME_libboost-program-options-dev = "libboost-program-options-dev_1.49.0.1_armhf.deb"
SRC_URI[deb2.sha256sum] = "dd406ef9a686d3e8c33d5726564124ea883229f9f381c7c9d8ca46328e5664ea"
SRC_URI[deb2.md5sum] = "06db7c962e03cb56d7a6d680f88f1ecb"
DEBFILENAME_libboost-thread-dev = "libboost-thread-dev_1.49.0.1_armhf.deb"
SRC_URI[deb3.sha256sum] = "5778fff278ffb35638d79c2d3740253ed5d0ca92d3aa3fa9fbce901e3775bae3"
SRC_URI[deb3.md5sum] = "88d316f93c47c5d6f091b2d374b92c41"

RDEPENDS_libboost-regex-dev = "libboost-regex1.49-dev"
RDEPENDS_libboost-system-dev = "libboost-system1.49-dev"
RDEPENDS_libboost-program-options-dev = "libboost-program-options1.49-dev"
RDEPENDS_libboost-thread-dev = "libboost-thread1.49-dev"
DEPENDS = "libboost-system1.49-dev libboost-regex1.49-dev libboost-thread1.49-dev libboost-program-options1.49-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libboost-regex-dev = " \
	./usr/share/doc/libboost-regex-dev/ \
	./usr/ \
	./ \
	./usr/share/doc/libboost-regex-dev/copyright \
	./usr/share/ \
	./usr/share/doc/libboost-regex-dev/changelog.gz \
	./usr/share/doc/\
"
FILES_libboost-system-dev = " \
	./usr/ \
	./ \
	./usr/share/doc/libboost-system-dev/ \
	./usr/share/ \
	./usr/share/doc/ \
	./usr/share/doc/libboost-system-dev/copyright \
	./usr/share/doc/libboost-system-dev/changelog.gz\
"
FILES_libboost-program-options-dev = " \
	./usr/ \
	./ \
	./usr/share/doc/libboost-program-options-dev/changelog.gz \
	./usr/share/doc/libboost-program-options-dev/ \
	./usr/share/ \
	./usr/share/doc/libboost-program-options-dev/copyright \
	./usr/share/doc/\
"
FILES_libboost-thread-dev = " \
	./usr/ \
	./ \
	./usr/share/doc/libboost-thread-dev/ \
	./usr/share/doc/ \
	./usr/share/doc/libboost-thread-dev/changelog.gz \
	./usr/share/ \
	./usr/share/doc/libboost-thread-dev/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
