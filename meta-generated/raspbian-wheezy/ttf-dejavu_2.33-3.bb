PACKAGES = "ttf-dejavu-core"
PROVIDES = "ttf-dejavu-core"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/ttf-dejavu/ttf-dejavu-core_2.33-3_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_ttf-dejavu-core = "ttf-dejavu-core_2.33-3_all.deb"
SRC_URI[deb0.sha256sum] = "ed1bb07632def25dfae88826b34b9c75b8f6862b885bb7e3c89fefca129152bf"
SRC_URI[deb0.md5sum] = "e904b91d2704e687b465d81f4f501d01"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_ttf-dejavu-core = " \
	./usr/share/fonts/truetype/ttf-dejavu/DejaVuSans-Bold.ttf \
	./usr/share/doc/ttf-dejavu-core/BUGS \
	./usr/share/fonts/truetype/ttf-dejavu/DejaVuSerif-Bold.ttf \
	./usr/share/ \
	./usr/share/doc/ttf-dejavu-core/unicover.txt.gz \
	./usr/share/doc/ttf-dejavu-core/ \
	./usr/share/doc/ttf-dejavu-core/copyright \
	./usr/share/fonts/truetype/ \
	./usr/ \
	./ \
	./usr/share/fonts/truetype/ttf-dejavu/DejaVuSerif.ttf \
	./usr/share/fonts/truetype/ttf-dejavu/ \
	./usr/share/doc/ttf-dejavu-core/langcover.txt.gz \
	./usr/share/doc/ttf-dejavu-core/status.txt.gz \
	./usr/share/fonts/truetype/ttf-dejavu/DejaVuSansMono-Bold.ttf \
	./usr/share/fonts/truetype/ttf-dejavu/DejaVuSansMono.ttf \
	./usr/share/doc/ttf-dejavu-core/NEWS.gz \
	./usr/share/fonts/ \
	./usr/share/doc/ttf-dejavu-core/AUTHORS \
	./usr/share/doc/ttf-dejavu-core/changelog.Debian.gz \
	./usr/share/fonts/truetype/ttf-dejavu/DejaVuSans.ttf \
	./usr/share/doc/ttf-dejavu-core/README \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
