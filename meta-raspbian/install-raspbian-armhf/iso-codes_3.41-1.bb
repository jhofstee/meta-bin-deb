PACKAGES = "iso-codes"
DESCRIPTION = "\
ISO language, territory, currency, script codes and their translations\
This package provides the ISO 639 and ISO 639-3 language code lists,\
the ISO 4217 currency code list, the ISO 3166 territory code list,\
the ISO 3166-2 sub-territory list, and the ISO 15924 script code\
list as XML files.\
\
More importantly, it also provides their translations to be used by\
other programs."
HOMEPAGE = "http://pkg-isocodes.alioth.debian.org/"
SECTION = "misc"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "iso-codes_3.41-1_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/i/iso-codes/iso-codes_3.41-1_all.deb;unpack=0"
SRC_URI[md5sum] = "ab5b93bde13549079948aca7224eb494"
SRC_URI[sha256sum] = "aa25a4e07024fe6b62be2682f9e6b1f9536ecf171ba363e1552168033b489443"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"