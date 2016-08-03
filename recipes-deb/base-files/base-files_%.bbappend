DESCRIPTION = "group and passwd must be in the STAGING_DIR_TARGET for adduser to work"

SSTATEPOSTINSTFUNCS += "base_passwd_sstate_postinst"

# from OE-core
base_passwd_sstate_postinst() {
	if [ "${BB_CURRENTTASK}" = "populate_sysroot" -o "${BB_CURRENTTASK}" = "populate_sysroot_setscene" ]
	then
		# Staging does not copy ${sysconfdir} files into the
		# target sysroot, so we need to do so manually. We
		# put these files in the target sysroot so they can
		# be used by recipes which use custom user/group
		# permissions.
		install -d -m 755 ${STAGING_DIR_TARGET}${sysconfdir}
		echo 'root:x:0:' > ${STAGING_DIR_TARGET}${sysconfdir}/group
		echo 'root:x:0:0:root:/root:/bin/bash' > ${STAGING_DIR_TARGET}${sysconfdir}/passwd
	fi
}

