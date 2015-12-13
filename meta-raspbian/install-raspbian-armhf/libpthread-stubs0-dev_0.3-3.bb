PACKAGES = "libpthread-stubs0-dev"
DESCRIPTION = "\
pthread stubs not provided by native libc, development files\
This library provides weak aliases for pthread functions not provided\
in libc or otherwise available by default.  Libraries like libxcb rely\
on pthread stubs to use pthreads optionally, becoming thread-safe when\
linked to libpthread, while avoiding any performance hit when running\
single-threaded. libpthread-stubs supports this behavior even on\
platforms which do not supply all the necessary pthread stubs.\
\
On platforms which already supply all the necessary pthread stubs, this\
package ships only the pkg-config file pthread-stubs.pc, to allow\
libraries to unconditionally express a dependency on pthread-stubs and\
still obtain correct behavior."
SECTION = "libdevel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libpthread-stubs0 (= 0.3-3)
DEPENDS = "libpthread-stubs0 (= 0.3-3)"

RDEPENDS_${PN} = "libpthread-stubs0 (= 0.3-3)"

DEB_FILE_NAME = "libpthread-stubs0-dev_0.3-3_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libp/libpthread-stubs/libpthread-stubs0-dev_0.3-3_armhf.deb;unpack=0"
SRC_URI[md5sum] = "b5e0be84721cb68c73fe119e1bf22215"
SRC_URI[sha256sum] = "2f3644d716aaf3e1a3640f84bce6ef322b8e44b2f0f0571870103e88fc555606"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"