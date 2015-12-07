PACKAGES = "libsepol1"
DESCRIPTION = "\
SELinux library for manipulating binary security policies\
Security-enhanced Linux is a patch of the Linux kernel and a number\
of utilities with enhanced security functionality designed to add\
mandatory access controls to Linux.  The Security-enhanced Linux\
kernel contains new architectural components originally developed to\
improve the security of the Flask operating system. These\
architectural components provide general support for the enforcement\
of many kinds of mandatory access control policies, including those\
based on the concepts of Type Enforcement®, Role-based Access\
Control, and Multi-level Security.\
\
libsepol provides an API for the manipulation of SELinux binary policies.\
It is used by checkpolicy (the policy compiler) and similar tools, as well\
as by programs like load_policy that need to perform specific transformations\
on binary policies such as customizing policy boolean settings."
HOMEPAGE = "http://userspace.selinuxproject.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "libsepol1_2.1.4-3_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libs/libsepol/libsepol1_2.1.4-3_armhf.deb;unpack=0"
SRC_URI[md5sum] = "526961da9d69615feab09752caacd686"
SRC_URI[sha256sum] = "e77e297176bc457700716314caa7411249a220be2824cbf72a930572fb4baf4d"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"