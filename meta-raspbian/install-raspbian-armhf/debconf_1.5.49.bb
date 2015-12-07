PACKAGES = "debconf"
DESCRIPTION = "\
Debian configuration management system\
Debconf is a configuration management system for debian packages. Packages\
use Debconf to ask questions when they are installed."
SECTION = "admin"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "debconf_1.5.49_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/d/debconf/debconf_1.5.49_all.deb;unpack=0"
SRC_URI[md5sum] = "e8ca20ff0aac63c8ab555ba8fe85ff44"
SRC_URI[sha256sum] = "a6ce96ef5805f2e273c4e74f56eb3213db93551d0fa077ee4ed16b36b4e11a18"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"