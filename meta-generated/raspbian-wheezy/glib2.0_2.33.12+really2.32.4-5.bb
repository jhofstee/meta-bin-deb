PACKAGES = "libglib2.0-0"
PROVIDES = "libglib2.0-0"
PACKAGE_EXCLUDE = "libglib2.0-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/glib2.0/libglib2.0-0_2.33.12+really2.32.4-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libglib2.0-0 = "libglib2.0-0_2.33.12+really2.32.4-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "57d37202645ef2992c74b2379c7735b8fca0162abd45d7b42f93f59ee0c30982"
SRC_URI[deb0.md5sum] = "a657767f6643b116a21d3bbfd28b05ce"

RDEPENDS_lib${PN}-0 = "libc6 (>= 2.13-28) libffi5 (>= 3.0.9) libgcc1 (>= 1:4.4.0) libpcre3 (>= 8.10) libselinux1 (>= 1.32) zlib1g (>= 1:1.2.2)"
DEPENDS = "libgcc1 libffi5 libselinux1 libpcre3 zlib1g libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libglib2.0-0 = " \
	./usr/share/doc/libglib2.0-0/AUTHORS \
	./usr/lib/arm-linux-gnueabihf/libgthread-2.0.so.0 \
	./usr/lib/arm-linux-gnueabihf/libgobject-2.0.so.0 \
	./lib/arm-linux-gnueabihf/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libglib2.0-0/changelog.Debian.gz \
	./usr/share/ \
	./usr/lib/arm-linux-gnueabihf/libgthread-2.0.so.0.3200.4 \
	./usr/lib/arm-linux-gnueabihf/libgio-2.0.so.0 \
	./usr/lib/arm-linux-gnueabihf/gio/modules/ \
	./usr/share/doc/libglib2.0-0/copyright \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/libgmodule-2.0.so.0 \
	./usr/share/doc/libglib2.0-0/NEWS.pre-1-3.gz \
	./usr/share/glib-2.0/schemas/ \
	./usr/lib/arm-linux-gnueabihf/gio/ \
	./usr/lib/arm-linux-gnueabihf/glib-2.0/glib-compile-resources \
	./usr/share/doc/libglib2.0-0/ChangeLog.pre-2-0.gz \
	./usr/share/doc/libglib2.0-0/ChangeLog.pre-2-2.gz \
	./usr/share/glib-2.0/ \
	./usr/lib/arm-linux-gnueabihf/glib-2.0/ \
	./usr/lib/arm-linux-gnueabihf/libgmodule-2.0.so.0.3200.4 \
	./usr/lib/arm-linux-gnueabihf/glib-2.0/gio-querymodules \
	./usr/share/doc/libglib2.0-0/changelog.gz \
	./usr/share/doc/libglib2.0-0/ \
	./lib/arm-linux-gnueabihf/libglib-2.0.so.0 \
	./usr/share/doc/libglib2.0-0/ChangeLog.pre-1-2.gz \
	./usr/share/lintian/ \
	./usr/share/lintian/overrides/ \
	./lib/arm-linux-gnueabihf/libglib-2.0.so.0.3200.4 \
	./lib/ \
	./usr/lib/arm-linux-gnueabihf/libgio-2.0.so.0.3200.4 \
	./usr/share/doc/libglib2.0-0/README.gz \
	./usr/share/doc/libglib2.0-0/NEWS.gz \
	./usr/lib/arm-linux-gnueabihf/glib-2.0/glib-compile-schemas \
	./usr/lib/arm-linux-gnueabihf/libgobject-2.0.so.0.3200.4 \
	./usr/share/lintian/overrides/libglib2.0-0 \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
