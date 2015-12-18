PACKAGES = "readline-common libreadline6"
PROVIDES = "readline-common libreadline6"
PACKAGE_EXCLUDE = "readline-common libreadline6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/r/readline6/readline-common_6.2+dfsg-0.1_all.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/r/readline6/libreadline6_6.2+dfsg-0.1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_readline-common = "readline-common_6.2+dfsg-0.1_all.deb"
SRC_URI[deb0.sha256sum] = "6adeb7f5e5c28bf641755c2397c1fa229f0816437b897fd5df1f2d064ae239e9"
SRC_URI[deb0.md5sum] = "9d8e65682781bc2768d829764452feef"
DEBFILENAME_libreadline6 = "libreadline6_6.2+dfsg-0.1_armhf.deb"
SRC_URI[deb1.sha256sum] = "57094752b997b0c41a9647d87f999978f0b397ae27621b6e7d5fb6c7f3394426"
SRC_URI[deb1.md5sum] = "95402ba046fcfabdd0dd9f0a0a0b0236"

RDEPENDS_readline-common = "dpkg (>= 1.15.4)"
RDEPENDS_lib${PN} = "readline-common libc6 (>= 2.13-28) libtinfo5"
DEPENDS = "libc6 libtinfo5 dpkg"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_readline-common = " \
	./usr/share/readline/ \
	./usr/share/doc/readline-common/changelog.Debian.gz \
	./usr/share/man/man3/history.3readline.gz \
	./usr/share/lintian/ \
	./usr/ \
	./ \
	./usr/share/lintian/overrides/ \
	./usr/share/doc/readline-common/ \
	./usr/share/readline/inputrc \
	./usr/share/lintian/overrides/readline-common \
	./usr/share/doc/readline-common/copyright \
	./usr/share/man/man3/ \
	./usr/share/man/ \
	./usr/share/ \
	./usr/share/man/man3/readline.3readline.gz \
	./usr/share/doc/readline-common/inputrc.arrows \
	./usr/share/doc/ \
	./etc/\
"
FILES_libreadline6 = " \
	./lib/arm-linux-gnueabihf/libreadline.so.6 \
	./lib/arm-linux-gnueabihf/libhistory.so.6 \
	./usr/share/doc/libreadline6/examples/ \
	./usr/share/doc/libreadline6/USAGE \
	./usr/ \
	./ \
	./lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libreadline6/changelog.gz \
	./usr/share/doc/libreadline6/ \
	./usr/share/doc/libreadline6/examples/Inputrc \
	./lib/arm-linux-gnueabihf/libreadline.so.6.2 \
	./lib/ \
	./usr/share/doc/libreadline6/inputrc.arrows \
	./usr/share/doc/libreadline6/copyright \
	./usr/share/doc/libreadline6/README.Debian \
	./usr/share/doc/libreadline6/changelog.Debian.gz \
	./usr/share/ \
	./lib/arm-linux-gnueabihf/libhistory.so.6.2 \
	./usr/share/doc/ \
	./etc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
