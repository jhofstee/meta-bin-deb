PACKAGES = "xorg-sgml-doctools"
PROVIDES = "xorg-sgml-doctools"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/xorg-sgml-doctools/xorg-sgml-doctools_1.10-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_xorg-sgml-doctools = "xorg-sgml-doctools_1.10-1_all.deb"
SRC_URI[deb0.sha256sum] = "9850f0d2a0d8654968608f0f8bf12c15f93511ab2a6dd05ac51b7a4d60027b06"
SRC_URI[deb0.md5sum] = "2c102317f35779aafbc2aa3734a8e9ce"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/sgml/ \
	./usr/share/sgml/X11/xorg.xsl \
	./usr/share/sgml/X11/ \
	./usr/ \
	./usr/share/doc/xorg-sgml-doctools/ \
	./usr/share/sgml/X11/xorg.css \
	./ \
	./usr/share/pkgconfig/ \
	./usr/share/sgml/X11/xorg-fo.xsl \
	./usr/share/doc/xorg-sgml-doctools/copyright \
	./usr/share/doc/xorg-sgml-doctools/changelog.gz \
	./usr/share/sgml/X11/defs.ent \
	./usr/share/doc/xorg-sgml-doctools/changelog.Debian.gz \
	./usr/share/sgml/X11/dbs/masterdb.pdf.xml \
	./usr/share/ \
	./usr/share/sgml/X11/dbs/ \
	./usr/share/sgml/X11/dbs/masterdb.html.xml \
	./usr/share/sgml/X11/xorg-chunk.xsl \
	./usr/share/pkgconfig/xorg-sgml-doctools.pc \
	./usr/share/doc/ \
	./usr/share/sgml/X11/xorg-xhtml.xsl\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
