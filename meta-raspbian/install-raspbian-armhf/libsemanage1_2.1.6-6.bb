PACKAGES = "libsemanage1"
DESCRIPTION = "\
SELinux policy management library\
This package provides the shared libraries for SELinux policy management.\
It uses libsepol for binary policy manipulation and libselinux for\
interacting with the SELinux system.  It also exec's helper programs\
for loading policy and for checking whether the file_contexts\
configuration is valid (load_policy and setfiles from\
policycoreutils) presently, although this may change at least for the\
bootstrapping case\
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
#Depends: libsemanage-common (= 2.1.6-6), libbz2-1.0, libc6 (>= 2.13-28), libselinux1 (>= 1.32), libsepol1 (>= 2.1.4), libustr-1.0-1 (>= 1.0.4)
DEPENDS = "libsemanage-common (= 2.1.6-6) libbz2-1.0 libc6 (>= 2.13-28) libselinux1 (>= 1.32) libsepol1 (>= 2.1.4) libustr-1.0-1 (>= 1.0.4)"

RDEPENDS_${PN} = "libsemanage-common (= 2.1.6-6) libbz2-1.0 libc6 (>= 2.13-28) libselinux1 (>= 1.32) libsepol1 (>= 2.1.4) libustr-1.0-1 (>= 1.0.4)"

DEB_FILE_NAME = "libsemanage1_2.1.6-6_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libs/libsemanage/libsemanage1_2.1.6-6_armhf.deb;unpack=0"
SRC_URI[md5sum] = "c49dca123e0d2d14b079c0af758688a2"
SRC_URI[sha256sum] = "ef77b24cea269a40a6af60c298041ea59ec74f958cde2dcf22ae19d06b23482f"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"