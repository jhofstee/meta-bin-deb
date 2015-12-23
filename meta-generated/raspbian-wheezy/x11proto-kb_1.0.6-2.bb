PACKAGES = "x11proto-kb-dev"
PROVIDES = "x11proto-kb-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/x11proto-kb/x11proto-kb-dev_1.0.6-2_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_x11proto-kb-dev = "x11proto-kb-dev_1.0.6-2_all.deb"
SRC_URI[deb0.sha256sum] = "b7ff8eceb9f05eb470700807c73fdae88f5f9f8b8fbef869029882264dbebd81"
SRC_URI[deb0.md5sum] = "892865f3dc1b65a8a5c84413c2ce424b"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN}-dev = " \
	./usr/include/X11/extensions/XKB.h \
	./usr/share/doc/x11proto-kb-dev/XKBproto-6.svg \
	./usr/share/ \
	./usr/share/doc/x11proto-kb-dev/XKBproto-9.svg \
	./usr/share/doc/x11proto-kb-dev/XKBproto-4.svg \
	./usr/share/doc/x11proto-kb-dev/changelog.Debian.gz \
	./usr/ \
	./ \
	./usr/share/doc/x11proto-kb-dev/XKBproto-5.svg \
	./usr/share/doc/x11proto-kb-dev/xkbproto.html \
	./usr/include/ \
	./usr/share/doc/x11proto-kb-dev/XKBproto-2.svg \
	./usr/share/doc/x11proto-kb-dev/XKBproto-1.svg \
	./usr/share/doc/x11proto-kb-dev/xkbproto.txt.gz \
	./usr/include/X11/extensions/XKBproto.h \
	./usr/share/doc/x11proto-kb-dev/XKBproto-3.svg \
	./usr/share/doc/x11proto-kb-dev/copyright \
	./usr/share/doc/x11proto-kb-dev/XKBproto-7.svg \
	./usr/share/doc/x11proto-kb-dev/XKBproto-11.svg \
	./usr/share/pkgconfig/kbproto.pc \
	./usr/include/X11/extensions/ \
	./usr/share/doc/x11proto-kb-dev/ \
	./usr/include/X11/ \
	./usr/share/pkgconfig/ \
	./usr/share/doc/x11proto-kb-dev/XKBproto-10.svg \
	./usr/include/X11/extensions/XKBstr.h \
	./usr/include/X11/extensions/XKBsrv.h \
	./usr/share/doc/x11proto-kb-dev/XKBproto-8.svg \
	./usr/share/doc/ \
	./usr/include/X11/extensions/XKBgeom.h\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
