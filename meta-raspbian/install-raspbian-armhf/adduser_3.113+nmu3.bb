PACKAGES = "adduser"
DESCRIPTION = "\
add and remove users and groups\
This package includes the 'adduser' and 'deluser' commands for creating\
and removing users.\
\
 - 'adduser' creates new users and groups and adds existing users to\
   existing groups;\
 - 'deluser' removes users and groups and removes users from a given\
   group.\
\
Adding users with 'adduser' is much easier than adding them manually.\
Adduser will choose appropriate UID and GID values, create a home\
directory, copy skeletal user configuration, and automate setting\
initial values for the user's password, real name and so on.\
\
Deluser can back up and remove users' home directories\
and mail spool or all the files they own on the system.\
\
A custom script can be executed after each of the commands.\
\
 Development mailing list:\
   http://lists.alioth.debian.org/mailman/listinfo/adduser-devel/"
HOMEPAGE = "http://alioth.debian.org/projects/adduser/"
SECTION = "admin"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: perl-base (>= 5.6.0), passwd (>= 1:4.0.12), debconf | debconf-2.0
DEPENDS = "perl-base (>= 5.6.0) passwd (>= 1:4.0.12) debconf"

RDEPENDS_${PN} = "perl-base (>= 5.6.0) passwd (>= 1:4.0.12) debconf"

DEB_FILE_NAME = "adduser_3.113+nmu3_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/a/adduser/adduser_3.113+nmu3_all.deb;unpack=0"
SRC_URI[md5sum] = "9b7a9665cd1a6290786478931aafa9bc"
SRC_URI[sha256sum] = "ae69ab0da5c36e48ba38e27c5e0886d6a67988adead5e5324b9b90736d37c11e"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"