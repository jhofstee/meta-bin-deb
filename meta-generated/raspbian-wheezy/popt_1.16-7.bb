PACKAGES = "libpopt0"
PROVIDES = "libpopt0"
PACKAGE_EXCLUDE = "libpopt0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/popt/libpopt0_1.16-7_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpopt0 = "libpopt0_1.16-7_armhf.deb"
SRC_URI[deb0.sha256sum] = "644825ae413413419a85b1d592de03ce678f7b566d964fa15d4b2a415267562d"
SRC_URI[deb0.md5sum] = "81ac0d13f294b413231a91c2f9fa0647"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpopt0 = " \
	./usr/share/locale/ja/LC_MESSAGES/ \
	./usr/share/locale/hu/LC_MESSAGES/ \
	./usr/share/locale/ga/LC_MESSAGES/ \
	./usr/share/locale/nb/LC_MESSAGES/ \
	./usr/share/locale/fi/LC_MESSAGES/popt.mo \
	./usr/share/locale/is/LC_MESSAGES/popt.mo \
	./usr/share/locale/sv/ \
	./usr/share/locale/pl/LC_MESSAGES/popt.mo \
	./usr/share/locale/nl/ \
	./usr/share/locale/id/ \
	./usr/share/locale/de/ \
	./usr/share/locale/ca/LC_MESSAGES/ \
	./usr/share/locale/vi/LC_MESSAGES/ \
	./usr/share/doc/libpopt0/ \
	./usr/share/locale/ro/LC_MESSAGES/ \
	./usr/share/locale/ga/LC_MESSAGES/popt.mo \
	./usr/share/locale/lv/LC_MESSAGES/ \
	./usr/share/locale/eo/ \
	./usr/share/locale/th/LC_MESSAGES/ \
	./usr/share/locale/it/ \
	./usr/share/locale/hu/LC_MESSAGES/popt.mo \
	./usr/share/locale/vi/ \
	./usr/share/locale/fr/ \
	./usr/share/locale/pt/LC_MESSAGES/popt.mo \
	./usr/share/locale/pt/ \
	./usr/share/locale/fr/LC_MESSAGES/ \
	./usr/share/locale/gl/LC_MESSAGES/ \
	./usr/share/locale/cs/LC_MESSAGES/popt.mo \
	./usr/share/locale/gl/LC_MESSAGES/popt.mo \
	./usr/share/locale/wa/ \
	./usr/share/locale/zh_TW/LC_MESSAGES/ \
	./usr/share/locale/zh_CN/ \
	./usr/share/locale/sl/LC_MESSAGES/ \
	./usr/share/locale/it/LC_MESSAGES/popt.mo \
	./usr/share/ \
	./usr/share/locale/ko/LC_MESSAGES/ \
	./usr/share/locale/nb/ \
	./usr/ \
	./usr/share/locale/pt/LC_MESSAGES/ \
	./usr/share/locale/pl/ \
	./usr/share/locale/ca/ \
	./usr/share/locale/fi/ \
	./usr/share/locale/ro/ \
	./usr/share/locale/nl/LC_MESSAGES/popt.mo \
	./usr/share/locale/de/LC_MESSAGES/ \
	./usr/share/locale/fr/LC_MESSAGES/popt.mo \
	./usr/share/locale/id/LC_MESSAGES/ \
	./usr/share/locale/ko/LC_MESSAGES/popt.mo \
	./usr/share/locale/is/ \
	./usr/share/locale/tr/LC_MESSAGES/popt.mo \
	./usr/share/locale/da/LC_MESSAGES/popt.mo \
	./usr/share/locale/eo/LC_MESSAGES/popt.mo \
	./usr/share/locale/uk/LC_MESSAGES/popt.mo \
	./usr/share/locale/es/LC_MESSAGES/ \
	./usr/share/locale/nl/LC_MESSAGES/ \
	./usr/share/locale/ga/ \
	./usr/share/locale/cs/ \
	./usr/share/locale/vi/LC_MESSAGES/popt.mo \
	./lib/arm-linux-gnueabihf/libpopt.so.0.0.0 \
	./usr/share/doc/libpopt0/changelog.gz \
	./usr/share/locale/tr/ \
	./usr/share/locale/ja/ \
	./usr/share/doc/libpopt0/copyright \
	./usr/share/locale/sl/LC_MESSAGES/popt.mo \
	./lib/arm-linux-gnueabihf/ \
	./usr/share/locale/uk/ \
	./usr/share/locale/zh_CN/LC_MESSAGES/ \
	./usr/share/locale/zh_TW/ \
	./usr/share/locale/wa/LC_MESSAGES/ \
	./usr/share/doc/libpopt0/changelog.Debian.gz \
	./ \
	./usr/share/locale/hu/ \
	./usr/share/locale/sk/ \
	./usr/share/locale/lv/LC_MESSAGES/popt.mo \
	./usr/share/locale/de/LC_MESSAGES/popt.mo \
	./usr/share/locale/ro/LC_MESSAGES/popt.mo \
	./usr/share/locale/th/ \
	./usr/share/doc/libpopt0/README \
	./usr/share/locale/ \
	./usr/share/locale/uk/LC_MESSAGES/ \
	./usr/share/locale/ca/LC_MESSAGES/popt.mo \
	./usr/share/locale/ru/ \
	./lib/ \
	./usr/share/locale/zh_TW/LC_MESSAGES/popt.mo \
	./usr/share/locale/sl/ \
	./usr/share/locale/cs/LC_MESSAGES/ \
	./usr/share/locale/gl/ \
	./usr/share/locale/sv/LC_MESSAGES/ \
	./usr/share/locale/eo/LC_MESSAGES/ \
	./usr/share/locale/es/ \
	./usr/share/locale/tr/LC_MESSAGES/ \
	./usr/share/locale/th/LC_MESSAGES/popt.mo \
	./usr/share/locale/ja/LC_MESSAGES/popt.mo \
	./usr/share/locale/sv/LC_MESSAGES/popt.mo \
	./usr/share/locale/ru/LC_MESSAGES/ \
	./lib/arm-linux-gnueabihf/libpopt.so.0 \
	./usr/share/locale/lv/ \
	./usr/share/locale/it/LC_MESSAGES/ \
	./usr/share/locale/da/LC_MESSAGES/ \
	./usr/share/locale/sk/LC_MESSAGES/popt.mo \
	./usr/share/locale/es/LC_MESSAGES/popt.mo \
	./usr/share/locale/da/ \
	./usr/share/locale/ko/ \
	./usr/share/locale/sk/LC_MESSAGES/ \
	./usr/share/locale/is/LC_MESSAGES/ \
	./usr/share/locale/zh_CN/LC_MESSAGES/popt.mo \
	./usr/share/locale/wa/LC_MESSAGES/popt.mo \
	./usr/share/locale/id/LC_MESSAGES/popt.mo \
	./usr/share/locale/ru/LC_MESSAGES/popt.mo \
	./usr/share/locale/nb/LC_MESSAGES/popt.mo \
	./usr/share/locale/fi/LC_MESSAGES/ \
	./usr/share/locale/pl/LC_MESSAGES/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
