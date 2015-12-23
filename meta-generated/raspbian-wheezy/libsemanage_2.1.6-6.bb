PACKAGES = "libsemanage1 libsemanage-common"
PROVIDES = "libsemanage1 libsemanage-common"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libsemanage/libsemanage1_2.1.6-6_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libs/libsemanage/libsemanage-common_2.1.6-6_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsemanage1 = "libsemanage1_2.1.6-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "ef77b24cea269a40a6af60c298041ea59ec74f958cde2dcf22ae19d06b23482f"
SRC_URI[deb0.md5sum] = "c49dca123e0d2d14b079c0af758688a2"
DEBFILENAME_libsemanage-common = "libsemanage-common_2.1.6-6_all.deb"
SRC_URI[deb1.sha256sum] = "4608c2aae75256672d4fa4aa26eec4ef65a1db4f46c7188b1b005012da389040"
SRC_URI[deb1.md5sum] = "95cdc95215ba2b472ab4b15d7688526d"

RDEPENDS_${PN}1 = "libsemanage-common (= 2.1.6-6) libbz2-1.0 libc6 (>= 2.13-28) libselinux1 (>= 1.32) libsepol1 (>= 2.1.4) libustr-1.0-1 (>= 1.0.4)"
DEPENDS = "libustr-1.0-1 libsepol1 libselinux1 libc6 libbz2-1.0"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsemanage1 = " \
	./usr/share/doc/libsemanage1/changelog.gz \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/libsemanage.so.1 \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libsemanage1/changelog.Debian.gz \
	./usr/share/ \
	./usr/share/doc/libsemanage1/copyright \
	./usr/share/doc/ \
	./usr/share/doc/libsemanage1/\
"
FILES_libsemanage-common = " \
	./etc/selinux/ \
	./usr/share/man/man5/ \
	./usr/ \
	./ \
	./etc/selinux/semanage.conf \
	./usr/share/man/man5/semanage.conf.5.gz \
	./usr/share/doc/libsemanage-common/copyright \
	./usr/share/doc/ \
	./usr/share/doc/libsemanage-common/changelog.Debian.gz \
	./etc/ \
	./usr/share/man/ \
	./usr/share/ \
	./usr/share/doc/libsemanage-common/ \
	./usr/share/doc/libsemanage-common/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
