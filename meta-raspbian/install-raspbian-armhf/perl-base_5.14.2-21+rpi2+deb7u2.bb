PACKAGES = "perl-base"
DESCRIPTION = "\
minimal Perl system\
Perl is a scripting language used in many system scripts and utilities.\
\
This package provides a Perl interpreter and the small subset of the\
standard run-time library required to perform basic tasks. For a full\
Perl installation, install "perl" (and its dependencies, "perl-modules"\
and "perl-doc")."
HOMEPAGE = "http://dev.perl.org/perl5/"
SECTION = "perl"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "perl-base_5.14.2-21+rpi2+deb7u2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/p/perl/perl-base_5.14.2-21+rpi2+deb7u2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "950e6a192e1d53a95cb6df29a13df3e0"
SRC_URI[sha256sum] = "877a64c3579bb8bf209d246ce907fa0f7d7f8476c550b0073878684f23df7a2d"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"