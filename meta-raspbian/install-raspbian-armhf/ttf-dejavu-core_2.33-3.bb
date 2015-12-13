PACKAGES = "ttf-dejavu-core"
DESCRIPTION = "\
Vera font family derivate with additional characters\
DejaVu provides an expanded version of the Vera font family aiming for\
quality and broader Unicode coverage while retaining the original Vera\
style. DejaVu currently works towards conformance with the Multilingual\
European Standards (MES-1 and MES-2) for Unicode coverage. The DejaVu\
fonts provide serif, sans and monospaced variants.\
\
This package only contains the sans, sans-bold, serif, serif-bold,\
mono and mono-bold variants. For additional variants, see the\
ttf-dejavu-extra package.\
\
DejaVu fonts are intended for use on low-resolution devices (mainly\
computer screens) but can be used in printing as well."
HOMEPAGE = "http://dejavu-fonts.org/"
SECTION = "fonts"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "ttf-dejavu-core_2.33-3_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/t/ttf-dejavu/ttf-dejavu-core_2.33-3_all.deb;unpack=0"
SRC_URI[md5sum] = "e904b91d2704e687b465d81f4f501d01"
SRC_URI[sha256sum] = "ed1bb07632def25dfae88826b34b9c75b8f6862b885bb7e3c89fefca129152bf"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"