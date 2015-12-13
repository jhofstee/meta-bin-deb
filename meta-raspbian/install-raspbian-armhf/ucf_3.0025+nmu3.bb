PACKAGES = "ucf"
DESCRIPTION = "\
Update Configuration File: preserve user changes to config files.\
Debian policy mandates that user changes to configuration files must be\
preserved during package upgrades. The easy way to achieve this behavior\
is to make the configuration file a 'conffile', in which case dpkg\
handles the file specially during upgrades, prompting the user as\
needed.\
\
This is appropriate only if it is possible to distribute a default\
version that will work for most installations, although some system\
administrators may choose to modify it. This implies that the\
default version will be part of the package distribution, and must\
not be modified by the maintainer scripts during installation (or at\
any other time).\
\
This script attempts to provide conffile-like handling for files that\
may not be labelled conffiles, and are not shipped in a Debian package,\
but handled by the postinst instead. This script allows one to\
maintain files in /etc, preserving user changes and in general\
offering the same facilities while upgrading that dpkg normally\
provides for 'conffiles'.\
\
Additionally, this script provides facilities for transitioning a\
file that had not been provided with conffile-like protection to come\
under this schema, and attempts to minimize questions asked at\
installation time. Indeed, the transitioning facility is better than the\
one offered by dpkg while transitioning a file from a non-conffile to\
conffile status."
SECTION = "utils"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: debconf (>= 1.5.19), coreutils (>= 5.91)
DEPENDS = "debconf (>= 1.5.19) coreutils (>= 5.91)"

RDEPENDS_${PN} = "debconf (>= 1.5.19) coreutils (>= 5.91)"

DEB_FILE_NAME = "ucf_3.0025+nmu3_all.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/u/ucf/ucf_3.0025+nmu3_all.deb;unpack=0"
SRC_URI[md5sum] = "372ca017ea23c219c58274d61e7059d9"
SRC_URI[sha256sum] = "afbb18edcc62a669e96b6908bb7915a40ff99221593f44f913e34932b6c1916e"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"