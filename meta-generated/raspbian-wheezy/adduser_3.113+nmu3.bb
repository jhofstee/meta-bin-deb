PACKAGES = "adduser"
PROVIDES = "adduser"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/a/adduser/adduser_3.113+nmu3_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_adduser = "adduser_3.113+nmu3_all.deb"
SRC_URI[deb0.sha256sum] = "ae69ab0da5c36e48ba38e27c5e0886d6a67988adead5e5324b9b90736d37c11e"
SRC_URI[deb0.md5sum] = "9b7a9665cd1a6290786478931aafa9bc"

RDEPENDS_${PN} = "perl-base (>= 5.6.0) passwd (>= 1:4.0.12) debconf"
DEPENDS = "passwd debconf perl-base"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/man/da/man8/ \
	./usr/share/locale/ja/LC_MESSAGES/ \
	./usr/share/locale/ca/LC_MESSAGES/adduser.mo \
	./usr/share/man/pt/man8/deluser.8.gz \
	./usr/share/man/it/man5/deluser.conf.5.gz \
	./usr/share/man/man8/delgroup.8.gz \
	./usr/share/locale/es/LC_MESSAGES/adduser.mo \
	./etc/deluser.conf \
	./usr/share/man/it/man8/addgroup.8.gz \
	./usr/share/locale/nb/LC_MESSAGES/ \
	./usr/share/man/sv/man8/delgroup.8.gz \
	./usr/share/locale/hu/LC_MESSAGES/ \
	./usr/share/doc/adduser/examples/adduser.local.conf.examples/skel/dot.bashrc \
	./usr/share/man/man5/ \
	./usr/share/man/da/man5/adduser.conf.5.gz \
	./usr/share/doc/adduser/examples/adduser.local.conf.examples/skel.other/index.html \
	./usr/share/man/pt/man8/ \
	./usr/share/locale/nl/ \
	./usr/share/doc/adduser/examples/adduser.local.conf.examples/ \
	./usr/share/man/de/man8/addgroup.8.gz \
	./usr/share/locale/da/LC_MESSAGES/ \
	./usr/sbin/deluser \
	./usr/share/man/da/man8/delgroup.8.gz \
	./usr/share/man/sv/man5/adduser.conf.5.gz \
	./usr/share/man/pl/man8/ \
	./usr/share/locale/de/ \
	./usr/share/locale/ca/LC_MESSAGES/ \
	./usr/share/doc/adduser/examples/adduser.local.conf.examples/skel/ \
	./usr/share/man/pl/man8/adduser.8.gz \
	./usr/share/doc/adduser/examples/adduser.local.conf.examples/skel.other/ \
	./usr/share/locale/cs/LC_MESSAGES/adduser.mo \
	./usr/share/doc/adduser/examples/adduser.local.conf \
	./usr/share/doc/adduser/examples/INSTALL \
	./usr/share/man/da/man8/addgroup.8.gz \
	./usr/sbin/adduser \
	./usr/share/locale/uk/LC_MESSAGES/ \
	./usr/share/man/it/ \
	./usr/share/locale/vi/LC_MESSAGES/adduser.mo \
	./usr/share/locale/vi/ \
	./usr/share/perl5/ \
	./usr/share/locale/fr/ \
	./usr/share/lintian/overrides/adduser \
	./usr/share/lintian/overrides/ \
	./usr/share/man/de/man5/ \
	./usr/share/man/it/man8/adduser.8.gz \
	./usr/share/locale/pt/ \
	./usr/share/locale/pl/LC_MESSAGES/adduser.mo \
	./usr/share/man/fr/man8/ \
	./usr/share/man/it/man8/deluser.8.gz \
	./usr/share/doc/adduser/examples/adduser.local.conf.examples/skel/dot.bash_logout \
	./usr/share/man/es/man5/ \
	./usr/share/locale/zh_CN/ \
	./usr/share/man/es/man8/deluser.8.gz \
	./usr/share/man/de/man5/deluser.conf.5.gz \
	./usr/share/man/fr/man8/deluser.8.gz \
	./usr/share/man/pt/man8/delgroup.8.gz \
	./usr/share/ \
	./usr/share/locale/ko/LC_MESSAGES/ \
	./usr/share/man/pl/man8/delgroup.8.gz \
	./usr/share/locale/nb/ \
	./usr/share/locale/sk/LC_MESSAGES/adduser.mo \
	./usr/share/man/es/man8/adduser.8.gz \
	./usr/share/doc/adduser/examples/ \
	./usr/share/locale/it/ \
	./usr/share/locale/eu/LC_MESSAGES/ \
	./usr/share/man/it/man8/ \
	./usr/share/locale/pl/ \
	./usr/share/locale/de/LC_MESSAGES/adduser.mo \
	./usr/share/man/man8/addgroup.8.gz \
	./usr/share/locale/ca/ \
	./usr/sbin/addgroup \
	./usr/share/man/es/ \
	./usr/sbin/ \
	./usr/share/locale/de/LC_MESSAGES/ \
	./usr/share/doc/ \
	./usr/share/locale/ru/LC_MESSAGES/adduser.mo \
	./usr/share/man/pt/man5/deluser.conf.5.gz \
	./usr/share/locale/eu/LC_MESSAGES/adduser.mo \
	./usr/share/man/pl/man8/addgroup.8.gz \
	./usr/share/man/sv/man8/adduser.8.gz \
	./usr/share/locale/fr/LC_MESSAGES/ \
	./usr/share/locale/fr/LC_MESSAGES/adduser.mo \
	./usr/share/locale/es/LC_MESSAGES/ \
	./usr/share/locale/nl/LC_MESSAGES/ \
	./usr/share/locale/cs/ \
	./usr/share/man/pl/man5/deluser.conf.5.gz \
	./usr/share/locale/sv/LC_MESSAGES/adduser.mo \
	./usr/share/man/sv/man8/ \
	./usr/share/man/da/man5/ \
	./usr/share/man/pt_BR/ \
	./usr/share/man/de/man8/adduser.8.gz \
	./usr/share/man/ru/man8/adduser.8.gz \
	./usr/share/man/man8/adduser.8.gz \
	./usr/share/man/de/ \
	./usr/share/man/ru/man8/deluser.8.gz \
	./usr/share/man/it/man5/ \
	./usr/share/locale/eu/ \
	./usr/share/man/fr/man8/addgroup.8.gz \
	./usr/share/locale/uk/ \
	./usr/share/locale/hu/LC_MESSAGES/adduser.mo \
	./usr/share/man/pt/man5/ \
	./usr/share/man/pt/man5/adduser.conf.5.gz \
	./usr/share/locale/zh_CN/LC_MESSAGES/ \
	./usr/share/locale/sv/ \
	./usr/share/man/pl/ \
	./usr/share/locale/ja/LC_MESSAGES/adduser.mo \
	./usr/share/locale/pt_BR/LC_MESSAGES/adduser.mo \
	./usr/share/doc/adduser/examples/adduser.local.conf.examples/adduser.conf \
	./usr/share/doc/adduser/examples/adduser.local \
	./usr/share/man/da/man5/deluser.conf.5.gz \
	./ \
	./usr/share/man/ru/man8/delgroup.8.gz \
	./usr/share/locale/da/LC_MESSAGES/adduser.mo \
	./usr/share/man/ru/man8/ \
	./usr/share/man/pl/man8/deluser.8.gz \
	./usr/share/locale/hu/ \
	./usr/share/man/pt/man8/adduser.8.gz \
	./usr/share/locale/sk/ \
	./usr/share/man/fr/man5/deluser.conf.5.gz \
	./usr/share/doc/adduser/examples/README \
	./usr/share/man/pt_BR/man8/ \
	./usr/sbin/delgroup \
	./usr/share/man/man5/deluser.conf.5.gz \
	./usr/share/locale/ru/LC_MESSAGES/ \
	./usr/share/locale/ \
	./usr/share/locale/pt_BR/LC_MESSAGES/ \
	./usr/share/man/pt/ \
	./usr/share/man/pt/man8/addgroup.8.gz \
	./usr/share/doc/adduser/examples/adduser.local.conf.examples/skel/dot.bash_profile \
	./usr/share/doc/adduser/ \
	./usr/share/man/de/man8/ \
	./usr/share/man/es/man8/ \
	./usr/share/doc/adduser/changelog.gz \
	./usr/share/man/fr/ \
	./usr/share/man/fr/man5/ \
	./usr/share/locale/pt/LC_MESSAGES/adduser.mo \
	./usr/share/adduser/adduser.conf \
	./usr/share/lintian/ \
	./usr/share/perl5/Debian/ \
	./usr/share/locale/ru/ \
	./usr/share/perl5/Debian/AdduserCommon.pm \
	./usr/share/man/man8/deluser.8.gz \
	./usr/share/man/man8/ \
	./usr/share/doc/adduser/examples/adduser.local.conf.examples/bash.bashrc \
	./usr/share/man/es/man5/adduser.conf.5.gz \
	./usr/share/man/ru/man5/adduser.conf.5.gz \
	./usr/share/locale/cs/LC_MESSAGES/ \
	./usr/share/man/fr/man5/adduser.conf.5.gz \
	./usr/share/man/ru/man5/ \
	./usr/share/man/da/man8/adduser.8.gz \
	./usr/share/locale/pt/LC_MESSAGES/ \
	./usr/share/locale/sv/LC_MESSAGES/ \
	./usr/share/man/ru/man5/deluser.conf.5.gz \
	./usr/share/locale/zh_CN/LC_MESSAGES/adduser.mo \
	./usr/share/man/da/ \
	./usr/share/man/da/man8/deluser.8.gz \
	./usr/share/man/ru/man8/addgroup.8.gz \
	./usr/share/man/sv/ \
	./usr/share/locale/es/ \
	./usr/share/locale/ko/LC_MESSAGES/adduser.mo \
	./usr/share/man/pl/man5/adduser.conf.5.gz \
	./usr/share/doc/adduser/TODO.gz \
	./usr/share/locale/nl/LC_MESSAGES/adduser.mo \
	./usr/share/locale/uk/LC_MESSAGES/adduser.mo \
	./usr/share/locale/vi/LC_MESSAGES/ \
	./usr/share/locale/it/LC_MESSAGES/adduser.mo \
	./usr/share/man/es/man8/addgroup.8.gz \
	./usr/share/doc/adduser/examples/adduser.local.conf.examples/profile \
	./usr/share/man/sv/man8/deluser.8.gz \
	./usr/share/locale/it/LC_MESSAGES/ \
	./usr/share/man/sv/man5/deluser.conf.5.gz \
	./usr/share/man/es/man8/delgroup.8.gz \
	./usr/share/man/es/man5/deluser.conf.5.gz \
	./usr/share/locale/pt_BR/ \
	./usr/share/locale/da/ \
	./usr/share/man/fr/man8/adduser.8.gz \
	./usr/share/man/fr/man8/delgroup.8.gz \
	./usr/share/man/de/man5/adduser.conf.5.gz \
	./usr/share/locale/ko/ \
	./usr/share/locale/sk/LC_MESSAGES/ \
	./etc/ \
	./usr/share/man/ru/ \
	./usr/share/man/man5/adduser.conf.5.gz \
	./usr/share/man/de/man8/delgroup.8.gz \
	./usr/ \
	./usr/share/man/pl/man5/ \
	./usr/share/locale/nb/LC_MESSAGES/adduser.mo \
	./usr/share/man/pt_BR/man5/deluser.conf.5.gz \
	./usr/share/man/pt_BR/man5/ \
	./usr/share/man/sv/man8/addgroup.8.gz \
	./usr/share/adduser/ \
	./usr/share/man/it/man8/delgroup.8.gz \
	./usr/share/man/ \
	./usr/share/man/de/man8/deluser.8.gz \
	./usr/share/man/it/man5/adduser.conf.5.gz \
	./usr/share/locale/pl/LC_MESSAGES/ \
	./usr/share/doc/adduser/copyright \
	./usr/share/man/sv/man5/ \
	./usr/share/locale/ja/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
