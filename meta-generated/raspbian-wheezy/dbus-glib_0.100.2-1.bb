PACKAGES = "libdbus-glib-1-2"
PROVIDES = "libdbus-glib-1-2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dbus-glib/libdbus-glib-1-2_0.100.2-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdbus-glib-1-2 = "libdbus-glib-1-2_0.100.2-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6e1a3418197298afcea23cbed566ac50290eee75285c55b2d4b68359a4dfed8f"
SRC_URI[deb0.md5sum] = "0d69f38ce9993fd6db9cd83466fd81d9"

RDEPENDS_lib${PN}-1-2 = "libc6 (>= 2.13-28) libdbus-1-3 (>= 1.2.16) libglib2.0-0 (>= 2.31.8)"
DEPENDS = "libglib2.0-0 libdbus-1-3 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libdbus-glib-1-2 = " \
	./usr/share/doc/libdbus-glib-1-2/ \
	./usr/share/doc/libdbus-glib-1-2/changelog.Debian.gz \
	./usr/share/lintian/ \
	./usr/ \
	./ \
	./usr/share/lintian/overrides/ \
	./usr/lib/ \
	./usr/share/doc/libdbus-glib-1-2/AUTHORS \
	./usr/lib/arm-linux-gnueabihf/libdbus-glib-1.so.2.2.2 \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/lib/arm-linux-gnueabihf/libdbus-glib-1.so.2 \
	./usr/share/doc/libdbus-glib-1-2/copyright \
	./usr/share/doc/libdbus-glib-1-2/changelog.gz \
	./usr/share/doc/libdbus-glib-1-2/NEWS.gz \
	./usr/share/ \
	./usr/share/doc/libdbus-glib-1-2/README \
	./usr/share/doc/ \
	./usr/share/lintian/overrides/libdbus-glib-1-2\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
