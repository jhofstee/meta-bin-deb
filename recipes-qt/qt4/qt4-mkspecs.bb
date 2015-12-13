# In order to cross build qt projects the target mkspec is needed.
# This extracts the default mkspecs from the target and makes in available
# for the (assumed to be provided) host qmake and sets CC and friends to the
# cross building setup.
#
# No idea if this is a good idea, qmake could make assumumption about its own
# qt build config to mess up cross build...

# TODO: add qmake4-native
DEPENDS += "qt4-qmake"

inherit qt4-info

# Inherit native will overwrite the target CC, AR etc, and we need them...
# Force this to be a cross packages instead.
TARGET_OS = "${BUILD_OS}"
PACKAGE_ARCH = "${BUILD_ARCH}"

S = "${WORKDIR}"

do_install () {
	mkdir -p `dirname ${QT_MKSPEC_CROSS}`
	echo "include(${STAGING_DATADIR}/qt4/mkspecs/default/qmake.conf)" > ${QT_MKSPEC_CROSS}
	echo "QMAKE_AR=${AR}" >> ${QT_MKSPEC_CROSS}
	echo "QMAKE_CC=${CC}" >> ${QT_MKSPEC_CROSS}
	echo "QMAKE_CXX=${CXX}" >> ${QT_MKSPEC_CROSS}
	echo 'QMAKE_LINK=${CXX}' >> ${QT_MKSPEC_CROSS}
	echo 'QMAKE_LIBDIR_QT=${STAGING_LIBDIR}' >> ${QT_MKSPEC_CROSS}
}

#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

