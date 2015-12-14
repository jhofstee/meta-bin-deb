LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit cross

PACKAGES = "${PN}-${DISTRO}"

DEB_ROOTFS = "${TMPDIR}/deb/${DISTRO}/debroot"

SRC_URI = "file://apt.conf"
S = "${WORKDIR}"

do_install () {
	# hack
	rm -rf ${DEB_ROOTFS}

	if [ "${DEB_SOURCES}" = "" ]; then
		bberror DEB_SOURCES is not set
		exit 1
	fi

	mkdir -p ${DEB_ROOTFS}
	mkdir -p ${DEB_ROOTFS}/var/lib/dpkg
	touch ${DEB_ROOTFS}/var/lib/dpkg/status
	mkdir -p ${DEB_ROOTFS}/var/lib/dpkg/updates/
	mkdir ${DEB_ROOTFS}/var/lib/dpkg/available
	mkdir -p ${DEB_ROOTFS}/var/lib/dpkg/info
	mkdir -p ${DEB_ROOTFS}/var/lib/apt/etc/apt/lists/partial/
	mkdir -p ${DEB_ROOTFS}/var/cache/apt/archives/partial/
	mkdir -p ${DEB_ROOTFS}/etc/var/lib/dpkg/
	touch ${DEB_ROOTFS}/etc/var/lib/dpkg/status

	mkdir -p ${DEB_ROOTFS}/etc/apt
	mkdir -p ${DEB_ROOTFS}/etc/apt/preferences.d
	install apt.conf ${DEB_ROOTFS}/etc/apt
	sed -i \
		-e 's#[$]{DEB_ROOTFS}#${DEB_ROOTFS}#' \
		-e 's#[$]{STAGING_DIR_NATIVE}#${STAGING_DIR_NATIVE}#' \
		${DEB_ROOTFS}/etc/apt/apt.conf

	mkdir -p ${DEB_ROOTFS}/etc/apt/sources.list.d/
	echo ${DEB_SOURCES} > ${DEB_ROOTFS}/etc/apt/sources.list

	apt-get --allow-unauthenticated -c ${DEB_ROOTFS}/etc/apt/apt.conf update
}

