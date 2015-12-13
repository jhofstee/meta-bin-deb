PACKAGES = "libxml2"
DESCRIPTION = "\
GNOME XML library\
XML is a metalanguage to let you design your own markup language.\
A regular markup language defines a way to describe information in\
a certain class of documents (eg HTML). XML lets you define your\
own customized markup languages for many classes of document. It\
can do this because it's written in SGML, the international standard\
metalanguage for markup languages.\
\
This package provides a library providing an extensive API to handle\
such XML data files."
HOMEPAGE = "http://xmlsoft.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), liblzma5 (>= 5.1.1alpha+20120614), zlib1g (>= 1:1.2.3.3)
DEPENDS = "libc6 (>= 2.13-28) liblzma5 (>= 5.1.1alpha+20120614) zlib1g (>= 1:1.2.3.3)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) liblzma5 (>= 5.1.1alpha+20120614) zlib1g (>= 1:1.2.3.3)"

DEB_FILE_NAME = "libxml2_2.8.0+dfsg1-7+wheezy4_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2_2.8.0+dfsg1-7+wheezy4_armhf.deb;unpack=0"
SRC_URI[md5sum] = "e85befab97899be8b85736f75fda7b84"
SRC_URI[sha256sum] = "3d0a5f0d079772e5afc01fbda60272f32898740349273079d32cec4a710236ef"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"