PACKAGES = "linux-libc-dev"
DESCRIPTION = "\
Linux support headers for userspace development\
This package provides userspaces headers from the Linux kernel.  These\
headers are used by the installed headers for GNU libc and other system\
libraries."
SECTION = "devel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "linux-libc-dev_3.2.51-1+rpi1_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/l/linux/linux-libc-dev_3.2.51-1+rpi1_armhf.deb;unpack=0"
SRC_URI[md5sum] = "85b51d1d8561fe8a4125a2916a7afef4"
SRC_URI[sha256sum] = "6716474c746fa027e5f3fa55e5a1844e0218c8aa8f27d4d37c62d6a440060918"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"