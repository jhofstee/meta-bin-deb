PACKAGES = "libfreetype6"
DESCRIPTION = "\
FreeType 2 font engine, shared library files\
The FreeType project is a team of volunteers who develop free,\
portable and high-quality software solutions for digital typography.\
They specifically target embedded systems and focus on bringing small,\
efficient and ubiquitous products.\
\
The FreeType 2 library is their new software font engine.  It has been\
designed to provide the following important features:\
 * A universal and simple API to manage font files\
 * Support for several font formats through loadable modules\
 * High-quality anti-aliasing\
 * High portability & performance\
\
Supported font formats include:\
 * TrueType files (.ttf) and collections (.ttc)\
 * Type 1 font files both in ASCII (.pfa) or binary (.pfb) format\
 * Type 1 Multiple Master fonts.  The FreeType 2 API also provides\
   routines to manage design instances easily\
 * Type 1 CID-keyed fonts\
 * OpenType/CFF (.otf) fonts\
 * CFF/Type 2 fonts\
 * Adobe CEF fonts (.cef), used to embed fonts in SVG documents with\
   the Adobe SVG viewer plugin.\
 * Windows FNT/FON bitmap fonts\
\
This package contains the files needed to run programs that use the\
FreeType 2 library.\
\
 Home Page: http://www.freetype.org/\
 Authors: David Turner   <david.turner@freetype.org>\
          Robert Wilhelm <robert.wilhelm@freetype.org>\
          Werner Lemberg <werner.lemberg@freetype.org>"
HOMEPAGE = "http://www.freetype.org"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), zlib1g (>= 1:1.1.4)
DEPENDS = "libc6 (>= 2.13-28) zlib1g (>= 1:1.1.4)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) zlib1g (>= 1:1.1.4)"

DEB_FILE_NAME = "libfreetype6_2.4.9-1.1+deb7u2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/f/freetype/libfreetype6_2.4.9-1.1+deb7u2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "523fcf44a0b5f48a38b21f903bc06ede"
SRC_URI[sha256sum] = "6c4ea76735fd066fbc1d20f3da7876947386c1a63c4fb643e947b28dc3665a43"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"