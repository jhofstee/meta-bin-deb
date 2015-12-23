PACKAGES = "libxdmcp-dev libxdmcp6"
PROVIDES = "libxdmcp-dev libxdmcp6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxdmcp/libxdmcp-dev_1.1.1-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxdmcp/libxdmcp6_1.1.1-1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxdmcp-dev = "libxdmcp-dev_1.1.1-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "833e121e18446479c8b8bc3619d19b2c35646dd4be43dc28b8265dc3beabebf1"
SRC_URI[deb0.md5sum] = "d8638f20276f1778302f1794e5465cc2"
DEBFILENAME_libxdmcp6 = "libxdmcp6_1.1.1-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "4f5ad0fc9fd5b37f35905d8f0a7907a090e63253e6c486f58c01a92f05bfadba"
SRC_URI[deb1.md5sum] = "27db6b19be74ae9bca26d65a0a1403f5"

RDEPENDS_${PN}-dev = "libxdmcp6 (= 1:1.1.1-1) x11proto-core-dev"
RDEPENDS_${PN}6 = "libc6 (>= 2.13-28)"
DEPENDS = "x11proto-core-dev libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN}-dev = " \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/xdmcp.pc \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libxdmcp-dev/copyright \
	./usr/share/doc/libxdmcp-dev/changelog.Debian.gz \
	./usr/ \
	./ \
	./usr/include/X11/Xdmcp.h \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/libXdmcp.so \
	./usr/share/doc/libxdmcp-dev/changelog.gz \
	./usr/include/X11/ \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/ \
	./usr/share/doc/libxdmcp-dev/ \
	./usr/include/ \
	./usr/share/ \
	./usr/share/doc/ \
	./usr/lib/arm-linux-gnueabihf/libXdmcp.a \
	./usr/share/doc/libxdmcp-dev/xdmcp.txt.gz\
"
FILES_libxdmcp6 = " \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/ \
	./ \
	./usr/lib/arm-linux-gnueabihf/libXdmcp.so.6 \
	./usr/share/doc/libxdmcp6/changelog.gz \
	./usr/share/doc/libxdmcp6/ \
	./usr/share/doc/libxdmcp6/changelog.Debian.gz \
	./usr/share/ \
	./usr/share/doc/libxdmcp6/copyright \
	./usr/lib/arm-linux-gnueabihf/libXdmcp.so.6.0.0 \
	./usr/share/doc/ \
	./usr/lib/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
