PACKAGES = "libsystemd-login0"
DESCRIPTION = "\
systemd login utility library\
The libsystemd-login library provides an interface for the\
systemd-logind service which is used to track user sessions and seats."
HOMEPAGE = "http://www.freedesktop.org/wiki/Software/systemd"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libcap2 (>= 2.10), libgcc1 (>= 1:4.4.0), libselinux1 (>= 2.0.65)
DEPENDS = "libc6 (>= 2.13-28) libcap2 (>= 2.10) libgcc1 (>= 1:4.4.0) libselinux1 (>= 2.0.65)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libcap2 (>= 2.10) libgcc1 (>= 1:4.4.0) libselinux1 (>= 2.0.65)"

DEB_FILE_NAME = "libsystemd-login0_44-11+deb7u4_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd-login0_44-11+deb7u4_armhf.deb;unpack=0"
SRC_URI[md5sum] = "1aac10cfc34c56f53253d791b9fa6830"
SRC_URI[sha256sum] = "bcd5c41f40512f55bb994596ca61b6690d9d714edf817abb013ecfa1d4c17321"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"