do_configure[noexec] = "1"
do_compile[noexec] = "1"

deb_do_install () {
	dpkg-deb --extract ${WORKDIR}/${DEB_FILE_NAME} ${D}
}

EXPORT_FUNCTIONS do_install
