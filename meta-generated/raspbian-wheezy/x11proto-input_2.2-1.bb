PACKAGES = "x11proto-input-dev"
PROVIDES = "x11proto-input-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/x11proto-input/x11proto-input-dev_2.2-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_x11proto-input-dev = "x11proto-input-dev_2.2-1_all.deb"
SRC_URI[deb0.sha256sum] = "f7cb888a1406c6fd861ebf4e069641f938ec7e889929e85373b35c3f04854952"
SRC_URI[deb0.md5sum] = "bf4228040086ffb6b222b830d1c83a76"

RDEPENDS_${PN}-dev = "x11proto-core-dev"
DEPENDS = "x11proto-core-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN}-dev = " \
	./usr/include/X11/extensions/XI.h \
	./usr/include/X11/extensions/ \
	./usr/share/doc/x11proto-input-dev/ \
	./usr/share/doc/x11proto-input-dev/copyright \
	./usr/ \
	./usr/share/pkgconfig/inputproto.pc \
	./usr/include/X11/extensions/XIproto.h \
	./usr/include/X11/extensions/XI2.h \
	./ \
	./usr/include/X11/extensions/XI2proto.h \
	./usr/include/X11/ \
	./usr/share/pkgconfig/ \
	./usr/share/doc/x11proto-input-dev/XIproto.html \
	./usr/share/doc/x11proto-input-dev/changelog.gz \
	./usr/share/doc/x11proto-input-dev/XI2proto.txt.gz \
	./usr/share/doc/x11proto-input-dev/XI2proto.html \
	./usr/share/ \
	./usr/share/doc/x11proto-input-dev/XIproto.txt.gz \
	./usr/share/doc/x11proto-input-dev/changelog.Debian.gz \
	./usr/share/doc/ \
	./usr/include/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
