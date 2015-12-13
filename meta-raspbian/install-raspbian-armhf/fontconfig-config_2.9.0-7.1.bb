PACKAGES = "fontconfig-config"
DESCRIPTION = "\
generic font configuration library - configuration\
Fontconfig is a font configuration and customization library, which\
does not depend on the X Window System. It is designed to locate\
fonts within the system and select them according to requirements\
specified by applications.\
\
This package contains the configuration files and scripts for fontconfig."
SECTION = "fonts"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: debconf (>= 0.5) | debconf-2.0, ucf (>= 0.29), ttf-dejavu-core | ttf-bitstream-vera | ttf-freefont | gsfonts-x11
DEPENDS = "debconf (>= 0.5) ucf (>= 0.29) ttf-dejavu-core"

RDEPENDS_${PN} = "debconf (>= 0.5) ucf (>= 0.29) ttf-dejavu-core"

DEB_FILE_NAME = "fontconfig-config_2.9.0-7.1_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig-config_2.9.0-7.1_all.deb;unpack=0"
SRC_URI[md5sum] = "f0b93a62b462072299bdc3bd5e9eefbd"
SRC_URI[sha256sum] = "b1c25dbe5c7c676bb026798fa140e16f2b90588ac6180cf0642a57fc70f805eb"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"