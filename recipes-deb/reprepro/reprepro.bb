BBCLASSEXTEND = "native"

LICENSE = "GPLv2"

inherit autotools

DEPENDS += "gpgme"
SRC_URI = "http://ftp.debian.org/debian/pool/main/r/reprepro/reprepro_5.1.1.orig.tar.gz"
S = "${WORKDIR}/reprepro-5.1.1"
SRC_URI[md5sum] = "554d69a426046798d650cc31a28566f1"
SRC_URI[sha256sum] = "fbf1b632e33096845febc6dcb278c4e946272cb6692e2d6c86ca35bb5b1758fc"
