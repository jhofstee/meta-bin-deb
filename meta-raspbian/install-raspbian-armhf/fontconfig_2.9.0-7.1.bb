PACKAGES = "fontconfig"
DESCRIPTION = "\
generic font configuration library - support binaries\
Fontconfig is a font configuration and customization library, which\
does not depend on the X Window System. It is designed to locate\
fonts within the system and select them according to requirements\
specified by applications.\
\
Fontconfig is not a rasterization library, nor does it impose a\
particular rasterization library on the application. The X-specific\
library 'Xft' uses fontconfig along with freetype to specify and\
rasterize fonts.\
\
This package contains a program to maintain the fontconfig cache\
(fc-cache), a sample program to list installed fonts (fc-list), a program\
to test the matching rules (fc-match) and a program to dump the binary\
cache files in string form (fc-cat). It no longer makes fonts managed by defoma\
available to fontconfig applications."
SECTION = "fonts"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libfontconfig1 (>= 2.9.0), fontconfig-config
DEPENDS = "libc6 (>= 2.13-28) libfontconfig1 (>= 2.9.0) fontconfig-config"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libfontconfig1 (>= 2.9.0) fontconfig-config"

DEB_FILE_NAME = "fontconfig_2.9.0-7.1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig_2.9.0-7.1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "3343d6a51ea90257c7a9d9563606cb0a"
SRC_URI[sha256sum] = "169c31a98ea36ddba26e6a9f1d9c591bb42486306a7a56883ce3fd0a8457f450"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"