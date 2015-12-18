PACKAGES = "ucf"
PROVIDES = "ucf"
PACKAGE_EXCLUDE = "ucf"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/u/ucf/ucf_3.0025+nmu3_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_ucf = "ucf_3.0025+nmu3_all.deb"
SRC_URI[deb0.sha256sum] = "afbb18edcc62a669e96b6908bb7915a40ff99221593f44f913e34932b6c1916e"
SRC_URI[deb0.md5sum] = "372ca017ea23c219c58274d61e7059d9"

RDEPENDS_${PN} = "debconf (>= 1.5.19) coreutils (>= 5.91)"
DEPENDS = "debconf coreutils"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/ucf/examples/postrm \
	./var/ \
	./usr/share/man/man1/ \
	./usr/share/ \
	./usr/share/man/man1/ucfr.1.gz \
	./usr/share/doc/ucf/copyright \
	./usr/bin/lcf \
	./usr/share/man/man5/ \
	./usr/ \
	./ \
	./usr/share/man/man1/ucf.1.gz \
	./usr/share/doc/ucf/examples/ \
	./usr/share/man/man5/ucf.conf.5.gz \
	./var/lib/ucf/ \
	./etc/ \
	./usr/bin/ \
	./usr/bin/ucfr \
	./usr/bin/ucfq \
	./etc/ucf.conf \
	./usr/share/doc/ucf/changelog.gz \
	./usr/share/doc/ucf/ \
	./usr/share/lintian/ \
	./usr/share/lintian/overrides/ \
	./usr/bin/ucf \
	./usr/share/doc/ucf/examples/postinst \
	./var/lib/ \
	./usr/share/man/man1/lcf.1.gz \
	./usr/share/lintian/overrides/ucf \
	./usr/share/man/ \
	./usr/share/man/man1/ucfq.1.gz \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
