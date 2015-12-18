PACKAGES = "fontconfig libfontconfig1 fontconfig-config"
PROVIDES = "fontconfig libfontconfig1 fontconfig-config"
PACKAGE_EXCLUDE = "fontconfig libfontconfig1 fontconfig-config"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig_2.9.0-7.1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/libfontconfig1_2.9.0-7.1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig-config_2.9.0-7.1_all.deb;unpack=0;name=deb2\
"
DEBFILENAME_fontconfig = "fontconfig_2.9.0-7.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "169c31a98ea36ddba26e6a9f1d9c591bb42486306a7a56883ce3fd0a8457f450"
SRC_URI[deb0.md5sum] = "3343d6a51ea90257c7a9d9563606cb0a"
DEBFILENAME_libfontconfig1 = "libfontconfig1_2.9.0-7.1_armhf.deb"
SRC_URI[deb1.sha256sum] = "0b8c3bfcadb1830aec21669d1fec99628ac8765b6f7ee76f509953b1aab650ee"
SRC_URI[deb1.md5sum] = "061dbfeb167b6cb4ebc01be746c5cdf9"
DEBFILENAME_fontconfig-config = "fontconfig-config_2.9.0-7.1_all.deb"
SRC_URI[deb2.sha256sum] = "b1c25dbe5c7c676bb026798fa140e16f2b90588ac6180cf0642a57fc70f805eb"
SRC_URI[deb2.md5sum] = "f0b93a62b462072299bdc3bd5e9eefbd"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libfontconfig1 (>= 2.9.0) fontconfig-config"
RDEPENDS_lib${PN}1 = "libc6 (>= 2.13-28) libexpat1 (>= 2.0.1) libfreetype6 (>= 2.2.1) zlib1g (>= 1:1.1.4) fontconfig-config (= 2.9.0-7.1)"
RDEPENDS_${PN}-config = "debconf (>= 0.5) ucf (>= 0.29) ttf-dejavu-core"
DEPENDS = "debconf ttf-dejavu-core ucf libfreetype6 zlib1g libc6 libexpat1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/lintian/overrides/fontconfig \
	./usr/share/doc/fontconfig/AUTHORS \
	./usr/bin/fc-pattern \
	./usr/bin/fc-cache \
	./usr/share/man/man1/ \
	./usr/share/man/man1/fc-cat.1.gz \
	./usr/share/doc/fontconfig/copyright \
	./usr/share/ \
	./usr/bin/fc-match \
	./usr/share/doc/fontconfig/changelog.gz \
	./usr/share/doc/fontconfig/fontconfig-user.txt.gz \
	./usr/share/man/man1/fc-list.1.gz \
	./usr/bin/fc-scan \
	./usr/ \
	./ \
	./usr/share/doc/fontconfig/ \
	./usr/bin/fc-list \
	./usr/share/doc-base/fontconfig-user \
	./usr/share/man/man1/fc-cache.1.gz \
	./usr/share/man/man1/fc-pattern.1.gz \
	./usr/share/doc/fontconfig/fontconfig-user.pdf.gz \
	./usr/share/doc-base/ \
	./usr/share/man/man1/fc-query.1.gz \
	./usr/share/doc/fontconfig/changelog.Debian.gz \
	./usr/bin/ \
	./usr/share/doc/fontconfig/fontconfig-user.html \
	./usr/share/man/man1/fc-scan.1.gz \
	./usr/share/doc/fontconfig/README.gz \
	./usr/bin/fc-query \
	./usr/share/lintian/ \
	./usr/share/lintian/overrides/ \
	./usr/bin/fc-cat \
	./usr/share/man/ \
	./usr/share/doc/fontconfig/README.Debian \
	./usr/share/doc/ \
	./usr/share/man/man1/fc-match.1.gz\
"
FILES_libfontconfig1 = " \
	./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1 \
	./usr/share/doc/libfontconfig1/ \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/share/doc/libfontconfig1/changelog.gz \
	./usr/share/doc/libfontconfig1/AUTHORS \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libfontconfig1/README.gz \
	./usr/share/doc/libfontconfig1/copyright \
	./usr/share/ \
	./usr/share/doc/libfontconfig1/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1.5.0 \
	./usr/share/doc/\
"
FILES_fontconfig-config = " \
	./etc/fonts/conf.d/50-user.conf \
	./etc/fonts/ \
	./etc/fonts/conf.avail/30-metric-aliases.conf \
	./etc/fonts/conf.avail/60-latin.conf \
	./etc/fonts/conf.d/20-fix-globaladvance.conf \
	./etc/fonts/fonts.dtd \
	./etc/fonts/conf.avail/49-sansserif.conf \
	./etc/fonts/conf.d/65-fonts-persian.conf \
	./etc/fonts/conf.d/30-metric-aliases.conf \
	./usr/share/man/man5/ \
	./etc/fonts/conf.avail/10-sub-pixel-bgr.conf \
	./etc/fonts/conf.avail/90-synthetic.conf \
	./etc/fonts/conf.d/README \
	./usr/share/ \
	./etc/fonts/conf.avail/10-no-sub-pixel.conf \
	./usr/share/doc/fontconfig-config/changelog.Debian.gz \
	./etc/fonts/conf.avail/65-fonts-persian.conf \
	./etc/fonts/conf.avail/69-unifont.conf \
	./etc/fonts/conf.avail/70-force-bitmaps.conf \
	./etc/fonts/conf.d/51-local.conf \
	./etc/fonts/conf.avail/40-nonlatin.conf \
	./usr/ \
	./ \
	./etc/fonts/conf.d/65-nonlatin.conf \
	./etc/fonts/conf.avail/20-unhint-small-vera.conf \
	./etc/fonts/conf.avail/70-yes-bitmaps.conf \
	./usr/share/man/man5/fonts-conf.5.gz \
	./etc/fonts/conf.avail/45-latin.conf \
	./etc/fonts/conf.avail/65-nonlatin.conf \
	./etc/fonts/conf.avail/51-local.conf \
	./etc/fonts/conf.d/49-sansserif.conf \
	./etc/fonts/conf.avail/30-urw-aliases.conf \
	./etc/fonts/conf.d/69-unifont.conf \
	./etc/ \
	./etc/fonts/conf.d/ \
	./etc/fonts/conf.d/30-urw-aliases.conf \
	./etc/fonts/conf.avail/20-fix-globaladvance.conf \
	./etc/fonts/conf.avail/70-no-bitmaps.conf \
	./etc/fonts/fonts.conf \
	./etc/fonts/conf.avail/65-khmer.conf \
	./etc/fonts/conf.avail/80-delicious.conf \
	./usr/share/doc/fontconfig-config/AUTHORS \
	./etc/fonts/conf.avail/50-user.conf \
	./usr/share/doc/fontconfig-config/ \
	./etc/fonts/conf.d/20-unhint-small-vera.conf \
	./etc/fonts/conf.avail/25-unhint-nonlatin.conf \
	./etc/fonts/conf.avail/ \
	./etc/fonts/conf.avail/11-lcdfilter-light.conf \
	./etc/fonts/conf.avail/11-lcdfilter-default.conf \
	./etc/fonts/conf.avail/10-sub-pixel-vrgb.conf \
	./etc/fonts/conf.d/80-delicious.conf \
	./etc/fonts/conf.avail/10-unhinted.conf \
	./etc/fonts/conf.d/90-synthetic.conf \
	./usr/share/doc/fontconfig-config/README.gz \
	./usr/share/doc/fontconfig-config/changelog.gz \
	./etc/fonts/conf.avail/11-lcdfilter-legacy.conf \
	./usr/share/doc/ \
	./etc/fonts/conf.avail/10-sub-pixel-rgb.conf \
	./etc/fonts/conf.d/45-latin.conf \
	./etc/fonts/conf.avail/10-autohint.conf \
	./usr/share/doc/fontconfig-config/copyright \
	./usr/share/man/ \
	./etc/fonts/conf.d/60-latin.conf \
	./etc/fonts/conf.d/40-nonlatin.conf \
	./etc/fonts/conf.avail/10-sub-pixel-vbgr.conf\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
