PACKAGES = "debianutils"
PROVIDES = "debianutils"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/debianutils/debianutils_4.3.2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_debianutils = "debianutils_4.3.2_armhf.deb"
SRC_URI[deb0.sha256sum] = "336a3ef6ba1b7cc95375a75e3e42d1435ccdf862f2b145f242157a10f41b59a2"
SRC_URI[deb0.md5sum] = "e2e13e7983b76d622f000b92de2826e8"

RDEPENDS_${PN} = "sensible-utils"
DEPENDS = "sensible-utils"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/man/fr/man8/add-shell.8.gz \
	./usr/share/man/sl/man1/which.1.gz \
	./usr/share/doc/debianutils/changelog.gz \
	./usr/bin/ischroot \
	./usr/share/man/es/man1/which.1.gz \
	./usr/share/debianutils/shells \
	./usr/share/doc/debianutils/copyright \
	./usr/share/man/de/man1/ \
	./usr/share/man/man1/ \
	./bin/tempfile \
	./usr/share/man/sl/man8/run-parts.8.gz \
	./usr/bin/savelog \
	./usr/share/man/man1/ischroot.1.gz \
	./usr/share/ \
	./usr/share/debianutils/ \
	./usr/share/man/es/man8/remove-shell.8.gz \
	./usr/share/man/man8/ \
	./usr/share/man/fr/man8/installkernel.8.gz \
	./usr/share/man/sl/man1/tempfile.1.gz \
	./bin/ \
	./usr/ \
	./ \
	./usr/share/man/man1/which.1.gz \
	./usr/share/man/de/man8/remove-shell.8.gz \
	./usr/share/man/man8/remove-shell.8.gz \
	./usr/share/man/fr/man8/remove-shell.8.gz \
	./sbin/installkernel \
	./usr/share/man/es/ \
	./usr/sbin/ \
	./usr/share/man/de/man8/installkernel.8.gz \
	./usr/share/man/man8/installkernel.8.gz \
	./bin/which \
	./usr/share/doc/debianutils/README.shells.gz \
	./usr/share/man/fr/man1/tempfile.1.gz \
	./usr/share/man/es/man1/ \
	./usr/share/man/man1/tempfile.1.gz \
	./usr/share/doc/ \
	./usr/share/man/fr/man1/ \
	./sbin/ \
	./usr/share/man/sl/ \
	./usr/sbin/add-shell \
	./usr/share/man/es/man8/add-shell.8.gz \
	./usr/bin/ \
	./usr/bin/which \
	./usr/share/man/man8/run-parts.8.gz \
	./usr/share/man/de/man8/ \
	./usr/share/man/es/man8/ \
	./usr/share/man/fr/man8/run-parts.8.gz \
	./usr/share/man/man8/savelog.8.gz \
	./usr/sbin/remove-shell \
	./usr/share/man/sl/man8/ \
	./usr/share/man/fr/ \
	./usr/share/man/de/man8/savelog.8.gz \
	./usr/share/man/sl/man8/remove-shell.8.gz \
	./usr/share/man/sl/man8/add-shell.8.gz \
	./usr/share/man/man8/add-shell.8.gz \
	./usr/share/man/es/man1/tempfile.1.gz \
	./usr/share/man/es/man8/installkernel.8.gz \
	./usr/share/man/es/man8/savelog.8.gz \
	./usr/share/man/de/man8/add-shell.8.gz \
	./usr/share/man/sl/man1/ \
	./usr/share/man/de/man1/which.1.gz \
	./usr/share/man/sl/man8/savelog.8.gz \
	./usr/share/man/sl/man8/installkernel.8.gz \
	./usr/share/man/fr/man1/which.1.gz \
	./usr/share/man/fr/man8/savelog.8.gz \
	./bin/run-parts \
	./usr/share/man/es/man8/run-parts.8.gz \
	./usr/share/man/ \
	./usr/share/doc/debianutils/ \
	./usr/share/man/de/man8/run-parts.8.gz \
	./usr/share/man/de/man1/tempfile.1.gz \
	./usr/share/man/fr/man8/ \
	./usr/share/man/de/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
