PACKAGES = "x11proto-core-dev"
PROVIDES = "x11proto-core-dev"
PACKAGE_EXCLUDE = "x11proto-core-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/x11proto-core/x11proto-core-dev_7.0.23-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_x11proto-core-dev = "x11proto-core-dev_7.0.23-1_all.deb"
SRC_URI[deb0.sha256sum] = "97b323494864640e36dbc9becb38df89a1202e4449a20dd38dc5b4dcea5746e9"
SRC_URI[deb0.md5sum] = "4c4f42b0ec94689f7d6ce3a7c914b54b"

RDEPENDS_${PN}-dev = "xorg-sgml-doctools (>= 1:1.5)"
DEPENDS = "xorg-sgml-doctools"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN}-dev = " \
	./usr/include/X11/X.h \
	./usr/include/X11/Xwinsock.h \
	./usr/include/X11/Xalloca.h \
	./usr/include/X11/keysym.h \
	./usr/share/doc/x11proto-core-dev/x11protocol.txt.gz \
	./usr/include/X11/HPkeysym.h \
	./usr/share/doc/x11proto-core-dev/ \
	./usr/share/doc/x11proto-core-dev/copyright \
	./usr/include/X11/Xarch.h \
	./usr/share/ \
	./usr/include/X11/DECkeysym.h \
	./usr/share/doc/x11proto-core-dev/x11protocol.html \
	./usr/include/X11/Sunkeysym.h \
	./usr/share/doc/x11proto-core-dev/x11protocol.pdf.gz \
	./usr/include/X11/ap_keysym.h \
	./usr/ \
	./ \
	./usr/include/X11/XF86keysym.h \
	./usr/include/X11/Xosdefs.h \
	./usr/include/ \
	./usr/include/X11/Xwindows.h \
	./usr/include/X11/Xos_r.h \
	./usr/share/doc/x11proto-core-dev/changelog.gz \
	./usr/include/X11/Xproto.h \
	./usr/share/pkgconfig/xproto.pc \
	./usr/include/X11/Xatom.h \
	./usr/include/X11/Xfuncs.h \
	./usr/include/X11/XWDFile.h \
	./usr/include/X11/Xmd.h \
	./usr/include/X11/Xthreads.h \
	./usr/include/X11/Xos.h \
	./usr/include/X11/Xfuncproto.h \
	./usr/include/X11/Xpoll.h \
	./usr/include/X11/Xdefs.h \
	./usr/include/X11/keysymdef.h \
	./usr/share/doc/ \
	./usr/include/X11/ \
	./usr/share/pkgconfig/ \
	./usr/include/X11/Xprotostr.h \
	./usr/include/X11/Xw32defs.h \
	./usr/share/doc/x11proto-core-dev/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
