PACKAGES = "libcap2"
DESCRIPTION = "\
support for getting/setting POSIX.1e capabilities\
This library implements the user-space interfaces to the POSIX\
1003.1e capabilities available in Linux kernels. These capabilities are\
a partitioning of the all powerful root privilege into a set of distinct\
privileges."
HOMEPAGE = "http://sites.google.com/site/fullycapable/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libattr1 (>= 1:2.4.46-8), libc6 (>= 2.13-28)
DEPENDS = "libattr1 (>= 1:2.4.46-8) libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libattr1 (>= 1:2.4.46-8) libc6 (>= 2.13-28)"

DEB_FILE_NAME = "libcap2_2.22-1.2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libc/libcap2/libcap2_2.22-1.2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "bb2ba20a51022848159f71ebcb28fa7a"
SRC_URI[sha256sum] = "fba9a7045abf13b0fb88ba82d3c8542d9eaff10de866a6a293066b5f3230a00a"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"