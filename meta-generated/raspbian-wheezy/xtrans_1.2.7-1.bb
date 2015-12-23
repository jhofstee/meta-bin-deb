PACKAGES = "xtrans-dev"
PROVIDES = "xtrans-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/xtrans/xtrans-dev_1.2.7-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_xtrans-dev = "xtrans-dev_1.2.7-1_all.deb"
SRC_URI[deb0.sha256sum] = "fd3c7faa859bedbdffe59f4b99e788981c9ba59515af1159e4826ce95428cdf5"
SRC_URI[deb0.md5sum] = "7b113fbb8d29827e3c5230a3f6e5bcc2"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN}-dev = " \
	./usr/include/X11/Xtrans/Xtranstli.c \
	./usr/share/doc/xtrans-dev/xtrans.html \
	./usr/share/aclocal/xtrans.m4 \
	./usr/include/X11/Xtrans/ \
	./usr/share/doc/xtrans-dev/xtrans.txt.gz \
	./usr/share/ \
	./usr/include/X11/Xtrans/Xtransutil.c \
	./usr/ \
	./ \
	./usr/share/doc/xtrans-dev/xtrans.pdf.db.gz \
	./usr/share/aclocal/ \
	./usr/share/doc/xtrans-dev/changelog.Debian.gz \
	./usr/include/ \
	./usr/share/doc/xtrans-dev/README \
	./usr/share/pkgconfig/xtrans.pc \
	./usr/include/X11/Xtrans/Xtranssock.c \
	./usr/share/doc/xtrans-dev/xtrans.xml.gz \
	./usr/share/doc/xtrans-dev/changelog.gz \
	./usr/include/X11/Xtrans/Xtrans.h \
	./usr/include/X11/Xtrans/Xtrans.c \
	./usr/include/X11/Xtrans/Xtransint.h \
	./usr/include/X11/Xtrans/transport.c \
	./usr/share/doc/xtrans-dev/ \
	./usr/share/doc/xtrans-dev/copyright \
	./usr/include/X11/ \
	./usr/share/pkgconfig/ \
	./usr/include/X11/Xtrans/Xtranslcl.c \
	./usr/share/doc/ \
	./usr/share/doc/xtrans-dev/xtrans.html.db\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
