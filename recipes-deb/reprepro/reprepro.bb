BBCLASSEXTEND = "native"

LICENSE = "GPLv2"

inherit autotools

DEPENDS += "gpgme virtual/db"
SRC_URI = "git://anonscm.debian.org/git/mirrorer/reprepro.git;tag=reprepro-5.1.1"
S = "${WORKDIR}/git"

