PACKAGES = "libsystemd-login0"
PROVIDES = "libsystemd-login0"
PACKAGE_EXCLUDE = "libsystemd-login0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd-login0_44-11+deb7u4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsystemd-login0 = "libsystemd-login0_44-11+deb7u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "bcd5c41f40512f55bb994596ca61b6690d9d714edf817abb013ecfa1d4c17321"
SRC_URI[deb0.md5sum] = "1aac10cfc34c56f53253d791b9fa6830"

RDEPENDS_lib${PN}-login0 = "libc6 (>= 2.13-28) libcap2 (>= 2.10) libgcc1 (>= 1:4.4.0) libselinux1 (>= 2.0.65)"
DEPENDS = "libcap2 libgcc1 libselinux1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsystemd-login0 = " \
	./usr/ \
	./usr/share/doc/libsystemd-login0/ \
	./ \
	./usr/share/doc/libsystemd-login0/copyright \
	./lib/arm-linux-gnueabihf/ \
	./lib/arm-linux-gnueabihf/libsystemd-login.so.0 \
	./lib/ \
	./usr/share/doc/libsystemd-login0/changelog.Debian.gz \
	./lib/arm-linux-gnueabihf/libsystemd-login.so.0.2.1 \
	./usr/share/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
