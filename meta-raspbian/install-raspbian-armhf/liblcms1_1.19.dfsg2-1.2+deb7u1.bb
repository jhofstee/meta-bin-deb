PACKAGES = "liblcms1"
DESCRIPTION = "\
Little CMS color management library\
lcms is a standalone CMM engine, which deals with the color management.\
LittleCMS implements a fast transformation between ICC profiles. The\
intention of it is to be portable across several platforms."
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "liblcms1_1.19.dfsg2-1.2+deb7u1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/l/lcms/liblcms1_1.19.dfsg2-1.2+deb7u1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "f82b70f9f1bd98747cfc484f81078f91"
SRC_URI[sha256sum] = "2c8153d4cec16f7211b74192e515d55c91d622c9d98a5a6f6db492dca8515945"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"