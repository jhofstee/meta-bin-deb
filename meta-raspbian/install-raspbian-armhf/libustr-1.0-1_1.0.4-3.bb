PACKAGES = "libustr-1.0-1"
DESCRIPTION = "\
Micro string library: shared library\
ustr (Micro string library) is a string API for C. It has tiny overhead over\
just plain strdup(), is much safer, is easier to use, is faster for many\
operations, can be used with read-only or automatically allocated data. You\
don't even need to link to the library to use it (so there are no\
dependencies).\
\
This package contains the shared library for ustr."
HOMEPAGE = "http://www.and.org/ustr/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0)
DEPENDS = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"

DEB_FILE_NAME = "libustr-1.0-1_1.0.4-3_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/u/ustr/libustr-1.0-1_1.0.4-3_armhf.deb;unpack=0"
SRC_URI[md5sum] = "194ac504b3c2c4e5c6ec3ac71cdc1ab0"
SRC_URI[sha256sum] = "d47453aa7e02e87fbae0053967d12cc717d51cdc58aaa690400f2ca8e44798c4"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"