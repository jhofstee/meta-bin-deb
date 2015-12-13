PACKAGES = "qtcreator"
DESCRIPTION = "\
lightweight integrated development environment (IDE) for Qt\
Qt Creator is a new, lightweight, cross-platform integrated development\
environment (IDE) designed to make development with the Qt application\
framework even faster and easier.\
\
It includes:\
 * An advanced C++ code editor\
 * Integrated GUI layout and forms designer\
 * Project and build management tools\
 * Integrated, context-sensitive help system\
 * Visual debugger\
 * Rapid code navigation tools\
 * Supports multiple platforms"
HOMEPAGE = "http://qt.nokia.com/products/developer-tools/"
SECTION = "devel"

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"
#Depends: libqt4-help (>= 4:4.8.1), libqt4-sql-sqlite, libc6 (>= 2.13-28), libgcc1 (>= 1:4.4.0), libqt4-declarative (>= 4:4.8.1), libqt4-designer (>= 4:4.8.1), libqt4-network (>= 4:4.8.1), libqt4-script (>= 4:4.8.1), libqt4-sql (>= 4:4.8.1), libqt4-svg (>= 4:4.8.1), libqt4-xml (>= 4:4.8.1), libqtcore4 (>= 4:4.8.1), libqtgui4 (>= 4:4.8.1), libqtwebkit4 (>= 2.1.0~2011week13-2), libstdc++6 (>= 4.4.0)
DEPENDS = "libqt4-help (>= 4:4.8.1) libqt4-sql-sqlite libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-declarative (>= 4:4.8.1) libqt4-designer (>= 4:4.8.1) libqt4-network (>= 4:4.8.1) libqt4-script (>= 4:4.8.1) libqt4-sql (>= 4:4.8.1) libqt4-svg (>= 4:4.8.1) libqt4-xml (>= 4:4.8.1) libqtcore4 (>= 4:4.8.1) libqtgui4 (>= 4:4.8.1) libqtwebkit4 (>= 2.1.0~2011week13-2) libstdc++6 (>= 4.4.0)"

RDEPENDS_${PN} = "libqt4-help (>= 4:4.8.1) libqt4-sql-sqlite libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libqt4-declarative (>= 4:4.8.1) libqt4-designer (>= 4:4.8.1) libqt4-network (>= 4:4.8.1) libqt4-script (>= 4:4.8.1) libqt4-sql (>= 4:4.8.1) libqt4-svg (>= 4:4.8.1) libqt4-xml (>= 4:4.8.1) libqtcore4 (>= 4:4.8.1) libqtgui4 (>= 4:4.8.1) libqtwebkit4 (>= 2.1.0~2011week13-2) libstdc++6 (>= 4.4.0)"

DEB_FILE_NAME = "qtcreator_2.5.0-2_armhf.deb"
SRC_URI = "http://archive.raspbian.org/raspbian/pool/main/q/qtcreator/qtcreator_2.5.0-2_armhf.deb;unpack=0"
SRC_URI[md5sum] = "2758f2b3178ae287683f23d9de6d7ff7"
SRC_URI[sha256sum] = "3450dcb6969fca3b92ab2e1f0a23a04ebf896537d16daa5d2e05c26a1811f153"

inherit deb

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILES_${PN} = "*"