PACKAGES = "libpam-modules libpam0g"
PROVIDES = "libpam-modules libpam0g"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pam/libpam-modules_1.1.3-7.1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/pam/libpam0g_1.1.3-7.1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libpam-modules = "libpam-modules_1.1.3-7.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "9b584d6e4535b046e00df9bd8dba12e98e0d4356f86d84a5e4a403a0604b8120"
SRC_URI[deb0.md5sum] = "b847b44d797f8b846a027989069dc249"
DEBFILENAME_libpam0g = "libpam0g_1.1.3-7.1_armhf.deb"
SRC_URI[deb1.sha256sum] = "5b808a890894b7e0a5a3878fa3b402f0c091636bc6fcdcc3718a669c715964a4"
SRC_URI[deb1.md5sum] = "242845c33ef2c0b994c07e8e98d7e7a0"

RDEPENDS_lib${PN}0g = "libc6 (>= 2.13-28) debconf (>= 0.5)"
DEPENDS = "debconf libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpam-modules = " \
	./usr/share/man/man8/pam_issue.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_umask.so \
	./usr/share/man/man8/pam_timestamp.8.gz \
	./usr/share/doc/libpam-modules/NEWS.Debian.gz \
	./etc/security/namespace.conf \
	./usr/share/man/man8/pam_rhosts.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_filter.so \
	./lib/arm-linux-gnueabihf/security/pam_sepermit.so \
	./etc/security/namespace.d/ \
	./usr/share/man/man8/pam_tally.8.gz \
	./usr/share/man/man5/access.conf.5.gz \
	./usr/share/man/man5/ \
	./usr/share/man/man8/pam_env.8.gz \
	./usr/share/man/man8/pam_userdb.8.gz \
	./usr/share/man/man8/pam_debug.8.gz \
	./lib/arm-linux-gnueabihf/security/ \
	./usr/share/man/man8/pam_pwhistory.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_debug.so \
	./lib/arm-linux-gnueabihf/ \
	./etc/security/limits.d/ \
	./usr/share/doc/libpam-modules/changelog.gz \
	./etc/security/time.conf \
	./usr/share/man/man8/pam_succeed_if.8.gz \
	./usr/share/man/man8/pam_exec.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_listfile.so \
	./usr/share/man/man5/time.conf.5.gz \
	./etc/ \
	./usr/share/man/man8/pam_unix.8.gz \
	./usr/share/man/man8/pam_selinux.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_exec.so \
	./usr/share/doc/libpam-modules/examples/ \
	./etc/security/access.conf \
	./usr/share/ \
	./usr/share/man/man8/ \
	./usr/share/man/man8/pam_mkhomedir.8.gz \
	./usr/share/doc/libpam-modules/examples/upperLOWER.c \
	./usr/share/doc/libpam-modules/changelog.Debian.gz \
	./etc/security/pam_env.conf \
	./lib/arm-linux-gnueabihf/security/pam_pwhistory.so \
	./usr/ \
	./lib/arm-linux-gnueabihf/security/pam_rootok.so \
	./usr/share/man/man8/pam_keyinit.8.gz \
	./usr/share/man/man8/pam_shells.8.gz \
	./usr/share/man/man5/sepermit.conf.5.gz \
	./usr/share/man/man8/pam_nologin.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_echo.so \
	./etc/security/limits.conf \
	./lib/arm-linux-gnueabihf/security/pam_namespace.so \
	./usr/share/man/man8/pam_umask.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_unix.so \
	./usr/share/man/man8/pam_timestamp_check.8.gz \
	./usr/share/man/man8/pam_lastlog.8.gz \
	./usr/share/man/man5/limits.conf.5.gz \
	./usr/share/man/man8/pam_tally2.8.gz \
	./usr/share/man/man8/pam_sepermit.8.gz \
	./usr/share/man/man8/pam_permit.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_permit.so \
	./usr/share/man/man8/pam_echo.8.gz \
	./usr/share/man/man5/namespace.conf.5.gz \
	./usr/share/man/man8/pam_warn.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_timestamp.so \
	./usr/share/man/man8/pam_rootok.8.gz \
	./usr/share/doc/libpam-modules/copyright \
	./lib/arm-linux-gnueabihf/security/pam_tally2.so \
	./lib/arm-linux-gnueabihf/security/pam_keyinit.so \
	./etc/security/ \
	./ \
	./usr/share/man/man8/pam_time.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_loginuid.so \
	./usr/share/man/man8/pam_faildelay.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_stress.so \
	./etc/security/sepermit.conf \
	./lib/arm-linux-gnueabihf/security/pam_succeed_if.so \
	./usr/share/man/man8/pam_filter.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_mkhomedir.so \
	./lib/arm-linux-gnueabihf/security/pam_access.so \
	./etc/security/group.conf \
	./lib/arm-linux-gnueabihf/security/pam_tally.so \
	./lib/arm-linux-gnueabihf/security/pam_mail.so \
	./usr/share/man/man8/pam_listfile.8.gz \
	./usr/share/man/man8/pam_ftp.8.gz \
	./usr/share/man/man8/pam_access.8.gz \
	./usr/share/man/man8/pam_xauth.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_ftp.so \
	./lib/ \
	./lib/arm-linux-gnueabihf/security/pam_time.so \
	./lib/arm-linux-gnueabihf/security/pam_issue.so \
	./lib/arm-linux-gnueabihf/security/pam_limits.so \
	./lib/arm-linux-gnueabihf/security/pam_warn.so \
	./lib/arm-linux-gnueabihf/security/pam_faildelay.so \
	./lib/arm-linux-gnueabihf/security/pam_motd.so \
	./lib/arm-linux-gnueabihf/security/pam_localuser.so \
	./lib/arm-linux-gnueabihf/security/pam_nologin.so \
	./usr/share/man/man5/pam_env.conf.5.gz \
	./lib/arm-linux-gnueabihf/security/pam_selinux.so \
	./usr/share/doc/libpam-modules/ \
	./lib/arm-linux-gnueabihf/security/pam_env.so \
	./usr/share/man/man8/pam_namespace.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_lastlog.so \
	./lib/arm-linux-gnueabihf/security/pam_deny.so \
	./usr/share/man/man8/pam_group.8.gz \
	./etc/security/namespace.init \
	./usr/share/man/man8/pam_loginuid.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_wheel.so \
	./usr/share/man/man8/pam_limits.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_userdb.so \
	./usr/share/man/man8/pam_securetty.8.gz \
	./usr/share/man/man8/pam_wheel.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_securetty.so \
	./usr/share/man/man8/pam_localuser.8.gz \
	./usr/share/man/man8/pam_motd.8.gz \
	./lib/arm-linux-gnueabihf/security/pam_rhosts.so \
	./lib/arm-linux-gnueabihf/security/pam_xauth.so \
	./lib/arm-linux-gnueabihf/security/pam_shells.so \
	./usr/share/man/man5/group.conf.5.gz \
	./lib/arm-linux-gnueabihf/security/pam_group.so \
	./usr/share/man/ \
	./usr/share/man/man8/pam_deny.8.gz \
	./usr/share/man/man8/pam_mail.8.gz \
	./usr/share/doc/\
"
FILES_libpam0g = " \
	./lib/arm-linux-gnueabihf/ \
	./lib/arm-linux-gnueabihf/libpam.so.0 \
	./usr/share/doc/libpam0g/README.Debian \
	./usr/share/ \
	./usr/share/doc/libpam0g/changelog.gz \
	./usr/ \
	./ \
	./lib/arm-linux-gnueabihf/libpamc.so.0 \
	./usr/share/doc/libpam0g/changelog.Debian.gz \
	./usr/share/doc/libpam0g/copyright \
	./usr/share/lintian/overrides/libpam0g \
	./usr/share/doc/libpam0g/README \
	./lib/arm-linux-gnueabihf/libpam_misc.so.0.82.0 \
	./usr/share/lintian/ \
	./usr/share/doc/libpam0g/TODO.Debian \
	./lib/arm-linux-gnueabihf/libpamc.so.0.82.1 \
	./usr/share/lintian/overrides/ \
	./usr/share/doc/libpam0g/Debian-PAM-MiniPolicy.gz \
	./lib/arm-linux-gnueabihf/libpam_misc.so.0 \
	./lib/ \
	./lib/arm-linux-gnueabihf/libpam.so.0.83.0 \
	./usr/share/doc/libpam0g/NEWS.Debian.gz \
	./usr/share/doc/libpam0g/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
