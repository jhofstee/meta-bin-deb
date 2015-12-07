PACKAGES = "libselinux1"
DESCRIPTION = "\
SELinux runtime shared libraries\
This package provides the shared libraries for Security-enhanced\
Linux that provides interfaces (e.g. library functions for the\
SELinux kernel APIs like getcon(), other support functions like\
getseuserbyname()) to SELinux-aware applications. Security-enhanced\
Linux is a patch of the Linux kernel and a number of utilities with\
enhanced security functionality designed to add mandatory access\
controls to Linux.  The Security-enhanced Linux kernel contains new\
architectural components originally developed to improve the security\
of the Flask operating system. These architectural components provide\
general support for the enforcement of many kinds of mandatory access\
control policies, including those based on the concepts of Type\
Enforcement, Role-based Access Control, and Multi-level Security.\
\
libselinux1 provides an API for SELinux applications to get and set\
process and file security contexts and to obtain security policy\
decisions.  Required for any applications that use the SELinux\
API. libselinux may use the shared libsepol to manipulate the binary\
policy if necessary (e.g. to downgrade the policy format to an older\
version supported by the kernel) when loading policy."
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28)
DEPENDS = "libc6 (>= 2.13-28)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"

DEB_FILE_NAME = "libselinux1_2.1.9-5_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/libs/libselinux/libselinux1_2.1.9-5_armhf.deb;unpack=0"
SRC_URI[md5sum] = "75384aba9bdd4a75b5a2263e417de272"
SRC_URI[sha256sum] = "3c368324b1c01fac140f38c6061e756d60285bf4f7766e254ecd29a883024596"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"