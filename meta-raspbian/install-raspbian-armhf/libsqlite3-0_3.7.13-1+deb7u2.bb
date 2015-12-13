PACKAGES = "libsqlite3-0"
DESCRIPTION = "\
SQLite 3 shared library\
SQLite is a C library that implements an SQL database engine.\
Programs that link with the SQLite library can have SQL database\
access without running a separate RDBMS process."
HOMEPAGE = "http://www.sqlite.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

DEB_FILE_NAME = "libsqlite3-0_3.7.13-1+deb7u2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/s/sqlite3/libsqlite3-0_3.7.13-1+deb7u2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "0c0e42bd68f8f926c2512b4ac2abddc1"
SRC_URI[sha256sum] = "20e0a15663d499fc91df2717ece69642f99fcbfd797722a7b037e410de2cc921"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"