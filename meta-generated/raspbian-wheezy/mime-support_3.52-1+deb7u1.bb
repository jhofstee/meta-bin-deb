PACKAGES = "mime-support"
PROVIDES = "mime-support"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/m/mime-support/mime-support_3.52-1+deb7u1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_mime-support = "mime-support_3.52-1+deb7u1_all.deb"
SRC_URI[deb0.sha256sum] = "70d2354bc5eae8b7a3c65a047d0e387c64f7fcb86e0662f1c05d6275e0cbd2a4"
SRC_URI[deb0.md5sum] = "653a3b997e5412dec631da5a8f43cde5"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/bin/edit \
	./usr/share/doc/mime-support/rfc1523.txt.gz \
	./usr/share/man/man5/mailcap.5.gz \
	./usr/share/man/man1/edit.1.gz \
	./usr/share/man/man1/ \
	./usr/share/man/man1/run-mailcap.1.gz \
	./usr/share/ \
	./usr/lib/mime/packages/mime-support \
	./usr/share/man/man5/ \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/sbin/update-mime \
	./usr/sbin/ \
	./usr/lib/mime/packages/ \
	./usr/bin/run-mailcap \
	./usr/share/man/man8/update-mime.8.gz \
	./usr/share/man/man1/see.1.gz \
	./usr/share/man/man1/compose.1.gz \
	./etc/ \
	./usr/share/doc/mime-support/rfc1522.txt.gz \
	./usr/bin/print \
	./usr/share/doc/mime-support/changelog.Debian.gz \
	./usr/bin/ \
	./usr/share/doc/mime-support/ \
	./usr/share/doc/mime-support/copyright \
	./usr/bin/compose \
	./usr/share/man/man1/print.1.gz \
	./etc/mime.types \
	./usr/share/doc/mime-support/rfc1524.txt.gz \
	./usr/lib/mime/debian-view \
	./etc/mailcap.order \
	./usr/lib/mime/mailcap \
	./usr/share/man/man8/ \
	./usr/lib/mime/ \
	./usr/share/man/man5/mailcap.order.5.gz \
	./usr/bin/see \
	./usr/share/man/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
