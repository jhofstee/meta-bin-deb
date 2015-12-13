PACKAGES = "libpthread-stubs0"
DESCRIPTION = "\
pthread stubs not provided by native libc\
This library provides weak aliases for pthread functions not provided\
in libc or otherwise available by default.  Libraries like libxcb rely\
on pthread stubs to use pthreads optionally, becoming thread-safe when\
linked to libpthread, while avoiding any performance hit when running\
single-threaded. libpthread-stubs supports this behavior even on\
platforms which do not supply all the necessary pthread stubs.  On\
platforms which already supply all the necessary pthread stubs, this\
package has no content."
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "libpthread-stubs0_0.3-3_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libp/libpthread-stubs/libpthread-stubs0_0.3-3_armhf.deb;unpack=0"
SRC_URI[md5sum] = "5cfeafd53afb45fae54f119421fcf4e6"
SRC_URI[sha256sum] = "b4e285fde918fb8aef7824e2dad5fd9f82fc8c6625b53d07fe3043f9b3c9d700"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"