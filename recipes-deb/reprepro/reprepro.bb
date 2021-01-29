BBCLASSEXTEND = "native"

LICENSE = "GPLv2"

inherit autotools

DEPENDS += "gpgme"
SRC_URI = "http://ftp.debian.org/debian/pool/main/r/reprepro/reprepro_5.3.0.orig.tar.gz"
S = "${WORKDIR}/reprepro-5.3.0"
SRC_URI[md5sum] = "adfbae84cc7d3d1d267ba20c597466a0"
SRC_URI[sha256sum] = "5a5404114b43a2d4ca1f8960228b1db32c41fb55de1996f62bc1b36001f3fab4"
