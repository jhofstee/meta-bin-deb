PACKAGES = "sensible-utils"
PROVIDES = "sensible-utils"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sensible-utils/sensible-utils_0.0.7_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_sensible-utils = "sensible-utils_0.0.7_all.deb"
SRC_URI[deb0.sha256sum] = "6e79af747541c98f0b46acc95fa7ca1be195960c9632162ed1645dea88696ab3"
SRC_URI[deb0.md5sum] = "ed7a3dc62ee82c05c5248bee6984464f"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/bin/sensible-browser \
	./usr/share/man/es/man1/sensible-editor.1.gz \
	./usr/share/man/es/man1/ \
	./usr/share/doc/sensible-utils/changelog.gz \
	./usr/lib/mime/packages/sensible-utils \
	./usr/share/man/de/man1/sensible-browser.1.gz \
	./usr/share/man/de/man1/ \
	./usr/share/man/man1/ \
	./usr/share/man/fr/man1/sensible-editor.1.gz \
	./usr/share/man/pl/ \
	./usr/share/ \
	./usr/share/man/fr/man1/sensible-browser.1.gz \
	./usr/share/man/ja/man1/sensible-browser.1.gz \
	./usr/share/man/man1/sensible-browser.1.gz \
	./usr/share/man/es/man1/sensible-pager.1.gz \
	./usr/ \
	./ \
	./usr/share/man/de/man1/sensible-editor.1.gz \
	./usr/share/man/pl/man1/sensible-editor.1.gz \
	./usr/lib/ \
	./usr/share/man/de/man1/sensible-pager.1.gz \
	./usr/share/man/ja/man1/ \
	./usr/share/man/es/ \
	./usr/share/doc/sensible-utils/copyright \
	./usr/lib/mime/packages/ \
	./usr/share/man/pl/man1/sensible-browser.1.gz \
	./usr/share/man/fr/man1/ \
	./usr/share/man/pl/man1/sensible-pager.1.gz \
	./usr/share/man/it/man1/sensible-editor.1.gz \
	./usr/share/man/ja/ \
	./usr/bin/sensible-editor \
	./usr/bin/ \
	./usr/share/man/ja/man1/sensible-pager.1.gz \
	./usr/share/man/es/man1/sensible-browser.1.gz \
	./usr/share/man/man1/sensible-editor.1.gz \
	./usr/share/man/it/ \
	./usr/share/man/fr/ \
	./usr/bin/sensible-pager \
	./usr/share/doc/sensible-utils/ \
	./usr/share/man/it/man1/sensible-pager.1.gz \
	./usr/share/man/pl/man1/ \
	./usr/share/man/it/man1/sensible-browser.1.gz \
	./usr/lib/mime/ \
	./usr/share/man/man1/sensible-pager.1.gz \
	./usr/share/man/it/man1/ \
	./usr/share/man/ \
	./usr/share/man/ja/man1/sensible-editor.1.gz \
	./usr/share/man/fr/man1/sensible-pager.1.gz \
	./usr/share/doc/ \
	./usr/share/man/de/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
