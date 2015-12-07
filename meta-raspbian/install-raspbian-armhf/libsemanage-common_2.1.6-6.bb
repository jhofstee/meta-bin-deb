PACKAGES = "libsemanage-common"
DESCRIPTION = "\
Common files for SELinux policy management libraries\
This package provides the common files used by the shared libraries\
for SELinux policy management.\
\
Security-enhanced Linux is a patch of the Linux kernel and a\
number of utilities with enhanced security functionality designed to\
add mandatory access controls to Linux.  The Security-enhanced Linux\
kernel contains new architectural components originally developed to\
improve the security of the Flask operating system. These\
architectural components provide general support for the enforcement\
of many kinds of mandatory access control policies, including those\
based on the concepts of Type Enforcement, Role-based Access\
Control, and Multi-level Security."
HOMEPAGE = "http://userspace.selinuxproject.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
DEB_FILE_NAME = "libsemanage-common_2.1.6-6_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libs/libsemanage/libsemanage-common_2.1.6-6_all.deb;unpack=0"
SRC_URI[md5sum] = "95cdc95215ba2b472ab4b15d7688526d"
SRC_URI[sha256sum] = "4608c2aae75256672d4fa4aa26eec4ef65a1db4f46c7188b1b005012da389040"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"