PACKAGES = "libglib2.0-0"
DESCRIPTION = "\
GLib library of C routines\
GLib is a library containing many useful C routines for things such\
as trees, hashes, lists, and strings.  It is a useful general-purpose\
C library used by projects such as GTK+, GIMP, and GNOME.\
\
This package contains the shared libraries."
HOMEPAGE = "http://www.gtk.org/"
SECTION = "libs"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libc6 (>= 2.13-28), libffi5 (>= 3.0.9), libgcc1 (>= 1:4.4.0), libpcre3 (>= 8.10), libselinux1 (>= 1.32), zlib1g (>= 1:1.2.2)
DEPENDS = "libc6 (>= 2.13-28) libffi5 (>= 3.0.9) libgcc1 (>= 1:4.4.0) libpcre3 (>= 8.10) libselinux1 (>= 1.32) zlib1g (>= 1:1.2.2)"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libffi5 (>= 3.0.9) libgcc1 (>= 1:4.4.0) libpcre3 (>= 8.10) libselinux1 (>= 1.32) zlib1g (>= 1:1.2.2)"

DEB_FILE_NAME = "libglib2.0-0_2.33.12+really2.32.4-5_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/g/glib2.0/libglib2.0-0_2.33.12+really2.32.4-5_armhf.deb;unpack=0"
SRC_URI[md5sum] = "a657767f6643b116a21d3bbfd28b05ce"
SRC_URI[sha256sum] = "57d37202645ef2992c74b2379c7735b8fca0162abd45d7b42f93f59ee0c30982"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"