DESCRIPTION = "group and passwd must be in the STAGING_DIR_TARGET for adduser to work"

do_install_append() {
	install -d -m 755 ${D}${sysconfdir}
	echo 'root:x:0:' > ${D}${sysconfdir}/group
	echo 'mail:x:8:' >> ${D}${sysconfdir}/group
	echo 'root:x:0:0:root:/root:/bin/bash' > ${D}${sysconfdir}/passwd
	echo 'mail:x:8:8:mail:/var/mail:/bin/sh' >> ${D}${sysconfdir}/passwd
}


#addtask install_passwd after do_extract_deb before do_populate_sysroot do_package
