PACKAGES = "binutils"
PROVIDES = "binutils"
PACKAGE_EXCLUDE = "binutils"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/binutils/binutils_2.22-8+deb7u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_binutils = "binutils_2.22-8+deb7u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "8a528387c897e4934468f32157d8ea69d2e0e715aeace55392d07e8f2543b003"
SRC_URI[deb0.md5sum] = "cf3b121de22eaa2423e2a61893f0cd32"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libstdc++6 (>= 4.6) zlib1g (>= 1:1.2.0)"
DEPENDS = "libgcc1 libstdc++6 zlib1g libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/locale/bg/LC_MESSAGES/gprof.mo \
	./usr/share/locale/ja/LC_MESSAGES/ \
	./usr/lib/ldscripts/armelf_linux_eabi.xdc \
	./usr/share/locale/ga/LC_MESSAGES/ \
	./usr/share/doc/binutils/bfd/ \
	./usr/share/locale/tr/LC_MESSAGES/gprof.mo \
	./usr/bin/ranlib \
	./usr/share/doc/binutils/README.cross.gz \
	./usr/share/locale/ro/LC_MESSAGES/opcodes.mo \
	./usr/lib/ldscripts/armelf_linux_eabi.xdw \
	./usr/share/locale/nl/LC_MESSAGES/gprof.mo \
	./usr/share/doc/binutils/gprof/TODO.gz \
	./usr/share/locale/ru/LC_MESSAGES/gprof.mo \
	./usr/share/locale/vi/LC_MESSAGES/gold.mo \
	./usr/share/locale/tr/LC_MESSAGES/binutils.mo \
	./usr/share/man/man1/elfedit.1.gz \
	./usr/share/man/man1/nm.1.gz \
	./usr/share/locale/es/LC_MESSAGES/ \
	./usr/share/locale/id/LC_MESSAGES/gprof.mo \
	./usr/bin/size \
	./usr/share/locale/nl/LC_MESSAGES/opcodes.mo \
	./usr/share/locale/nl/ \
	./usr/share/locale/rw/LC_MESSAGES/gas.mo \
	./usr/share/doc/binutils/changelog.Debian.gz \
	./usr/share/locale/fi/ \
	./usr/lib/libopcodes-2.22-system.so \
	./usr/lib/gold-ld/ \
	./usr/share/locale/pt_BR/LC_MESSAGES/gprof.mo \
	./usr/share/locale/sv/LC_MESSAGES/opcodes.mo \
	./usr/share/locale/id/ \
	./usr/share/locale/rw/LC_MESSAGES/gprof.mo \
	./usr/share/locale/de/ \
	./usr/lib/ldscripts/ \
	./usr/share/doc/binutils/gprof/bbconv.pl \
	./usr/share/locale/es/LC_MESSAGES/gold.mo \
	./usr/share/locale/zh_CN/LC_MESSAGES/ld.mo \
	./usr/share/locale/ro/LC_MESSAGES/ \
	./usr/bin/objdump \
	./usr/share/doc/binutils/gprof/ \
	./usr/share/doc/binutils/bfd/TODO.gz \
	./usr/share/locale/eo/ \
	./usr/share/locale/ro/LC_MESSAGES/binutils.mo \
	./usr/share/locale/da/LC_MESSAGES/binutils.mo \
	./usr/share/locale/da/LC_MESSAGES/opcodes.mo \
	./usr/lib/ldscripts/armelfb_linux_eabi.xdc \
	./usr/share/locale/zh_CN/LC_MESSAGES/ \
	./usr/lib/ldscripts/armelfb_linux_eabi.xsc \
	./usr/share/locale/vi/ \
	./usr/share/man/man1/windmc.1.gz \
	./usr/share/locale/fr/ \
	./usr/share/lintian/overrides/ \
	./usr/lib/libbfd-2.22-system.so \
	./usr/share/locale/id/LC_MESSAGES/ld.mo \
	./usr/lib/ldscripts/armelf_linux_eabi.xn \
	./usr/share/bug/binutils/presubj \
	./usr/share/locale/es/LC_MESSAGES/opcodes.mo \
	./usr/share/doc/binutils/ \
	./usr/share/locale/ja/LC_MESSAGES/binutils.mo \
	./usr/share/locale/vi/LC_MESSAGES/opcodes.mo \
	./usr/share/locale/es/LC_MESSAGES/ld.mo \
	./usr/share/locale/ga/LC_MESSAGES/gprof.mo \
	./usr/share/bug/ \
	./usr/share/locale/bg/LC_MESSAGES/ \
	./usr/share/locale/es/LC_MESSAGES/gas.mo \
	./usr/lib/ldscripts/armelfb_linux_eabi.xsw \
	./usr/share/man/man1/ld.gold.1.gz \
	./usr/share/locale/zh_CN/ \
	./usr/share/doc/binutils/ld/NEWS.gz \
	./usr/share/locale/es/LC_MESSAGES/gprof.mo \
	./usr/share/locale/id/LC_MESSAGES/ \
	./usr/lib/gold-ld/ld \
	./usr/share/locale/sv/LC_MESSAGES/gprof.mo \
	./usr/lib/compat-ld/ld \
	./usr/share/man/man1/addr2line.1.gz \
	./usr/share/locale/ru/LC_MESSAGES/binutils.mo \
	./usr/share/ \
	./usr/share/locale/tr/LC_MESSAGES/ \
	./usr/share/locale/fi/LC_MESSAGES/gas.mo \
	./usr/share/locale/vi/LC_MESSAGES/gprof.mo \
	./usr/bin/gold \
	./usr/share/locale/ru/LC_MESSAGES/gas.mo \
	./usr/share/locale/tr/LC_MESSAGES/gas.mo \
	./usr/lib/ldscripts/armelfb_linux_eabi.xd \
	./usr/ \
	./usr/share/locale/es/LC_MESSAGES/bfd.mo \
	./usr/share/locale/de/LC_MESSAGES/opcodes.mo \
	./usr/share/locale/ru/LC_MESSAGES/bfd.mo \
	./usr/share/doc/binutils/gas/ChangeLog.gz \
	./usr/share/locale/sk/ \
	./usr/share/locale/fi/LC_MESSAGES/ld.mo \
	./usr/share/man/man1/nlmconv.1.gz \
	./usr/share/locale/ro/ \
	./usr/share/man/man1/ld.1.gz \
	./usr/share/locale/de/LC_MESSAGES/ \
	./usr/share/locale/ro/LC_MESSAGES/bfd.mo \
	./usr/bin/ld.bfd \
	./usr/share/doc/binutils/ld/ChangeLog.gz \
	./usr/share/locale/id/LC_MESSAGES/gas.mo \
	./usr/lib/ldscripts/armelf_linux_eabi.xr \
	./usr/share/locale/ga/LC_MESSAGES/ld.mo \
	./usr/share/locale/fr/LC_MESSAGES/ \
	./usr/share/locale/sv/ \
	./usr/bin/readelf \
	./usr/share/locale/nl/LC_MESSAGES/ \
	./usr/share/locale/ga/ \
	./usr/share/locale/fr/LC_MESSAGES/opcodes.mo \
	./usr/share/locale/id/LC_MESSAGES/opcodes.mo \
	./usr/share/locale/fr/LC_MESSAGES/gas.mo \
	./usr/lib/ldscripts/armelfb_linux_eabi.xbn \
	./usr/share/locale/rw/LC_MESSAGES/bfd.mo \
	./usr/share/locale/rw/ \
	./usr/share/lintian/overrides/binutils \
	./usr/share/doc/binutils/ld/ \
	./usr/share/locale/sk/LC_MESSAGES/binutils.mo \
	./usr/share/locale/ja/LC_MESSAGES/bfd.mo \
	./usr/share/man/man1/as.1.gz \
	./usr/bin/elfedit \
	./usr/share/locale/ms/ \
	./usr/share/bug/binutils/ \
	./usr/share/locale/es/LC_MESSAGES/binutils.mo \
	./usr/share/locale/ja/ \
	./usr/lib/ldscripts/armelfb_linux_eabi.xn \
	./usr/bin/objcopy \
	./usr/bin/strings \
	./usr/share/locale/uk/ \
	./usr/share/locale/zh_CN/LC_MESSAGES/opcodes.mo \
	./usr/share/locale/pt_BR/LC_MESSAGES/opcodes.mo \
	./usr/lib/ldscripts/armelfb_linux_eabi.xc \
	./usr/lib/ldscripts/armelf_linux_eabi.xd \
	./usr/share/man/man1/ \
	./usr/share/locale/zh_TW/ \
	./usr/share/man/man1/objdump.1.gz \
	./usr/lib/ldscripts/armelfb_linux_eabi.xw \
	./usr/share/locale/fr/LC_MESSAGES/ld.mo \
	./usr/lib/ldscripts/armelfb_linux_eabi.xu \
	./usr/lib/ldscripts/armelfb_linux_eabi.xr \
	./usr/share/locale/fr/LC_MESSAGES/binutils.mo \
	./usr/share/locale/fi/LC_MESSAGES/binutils.mo \
	./usr/share/man/man1/strip.1.gz \
	./usr/share/locale/tr/LC_MESSAGES/bfd.mo \
	./usr/bin/strip \
	./usr/bin/c++filt \
	./ \
	./usr/lib/ldscripts/armelf_linux_eabi.xc \
	./usr/share/locale/ms/LC_MESSAGES/ \
	./usr/bin/addr2line \
	./usr/share/locale/da/LC_MESSAGES/gprof.mo \
	./usr/share/locale/zh_TW/LC_MESSAGES/ \
	./usr/share/locale/sv/LC_MESSAGES/bfd.mo \
	./usr/share/locale/vi/LC_MESSAGES/ld.mo \
	./usr/share/man/man1/gprof.1.gz \
	./usr/lib/ldscripts/armelf_linux_eabi.xs \
	./usr/bin/gprof \
	./usr/lib/ldscripts/armelf_linux_eabi.xu \
	./usr/lib/ldscripts/armelf_linux_eabi.xw \
	./usr/share/locale/rw/LC_MESSAGES/ \
	./usr/share/locale/ru/LC_MESSAGES/ \
	./usr/share/locale/sv/LC_MESSAGES/ld.mo \
	./usr/share/locale/ \
	./usr/share/locale/pt_BR/LC_MESSAGES/ \
	./usr/share/locale/tr/LC_MESSAGES/ld.mo \
	./usr/share/locale/uk/LC_MESSAGES/ \
	./usr/lib/ldscripts/armelfb_linux_eabi.xs \
	./usr/share/locale/sv/LC_MESSAGES/binutils.mo \
	./usr/share/locale/ro/LC_MESSAGES/gprof.mo \
	./usr/share/locale/id/LC_MESSAGES/gold.mo \
	./usr/share/man/man1/c++filt.1.gz \
	./usr/share/man/man1/readelf.1.gz \
	./usr/share/locale/fi/LC_MESSAGES/bfd.mo \
	./usr/share/locale/ru/ \
	./usr/share/lintian/ \
	./usr/share/locale/uk/LC_MESSAGES/binutils.mo \
	./usr/share/locale/zh_CN/LC_MESSAGES/binutils.mo \
	./usr/share/man/man1/size.1.gz \
	./usr/share/locale/fi/LC_MESSAGES/gold.mo \
	./usr/share/locale/vi/LC_MESSAGES/bfd.mo \
	./usr/bin/nm \
	./usr/share/locale/ja/LC_MESSAGES/ld.mo \
	./usr/lib/compat-ld/ \
	./usr/share/locale/sv/LC_MESSAGES/ \
	./usr/share/locale/eo/LC_MESSAGES/ \
	./usr/share/doc/binutils/NEWS.gz \
	./usr/share/locale/ms/LC_MESSAGES/gprof.mo \
	./usr/lib/ldscripts/armelf_linux_eabi.xbn \
	./usr/share/locale/fi/LC_MESSAGES/opcodes.mo \
	./usr/share/locale/es/ \
	./usr/share/locale/vi/LC_MESSAGES/binutils.mo \
	./usr/bin/ld.gold \
	./usr/share/locale/da/LC_MESSAGES/bfd.mo \
	./usr/share/locale/bg/LC_MESSAGES/binutils.mo \
	./usr/share/locale/fr/LC_MESSAGES/bfd.mo \
	./usr/share/doc/binutils/changelog.gz \
	./usr/share/locale/vi/LC_MESSAGES/ \
	./usr/share/locale/id/LC_MESSAGES/bfd.mo \
	./usr/lib/ \
	./usr/lib/ldscripts/armelf_linux_eabi.x \
	./usr/share/locale/bg/ \
	./usr/share/locale/fr/LC_MESSAGES/gprof.mo \
	./usr/share/man/man1/ar.1.gz \
	./usr/share/doc/binutils/copyright \
	./usr/share/locale/da/LC_MESSAGES/ \
	./usr/share/doc/binutils/gprof/ChangeLog.gz \
	./usr/share/locale/id/LC_MESSAGES/binutils.mo \
	./usr/share/locale/pt_BR/ \
	./usr/share/man/man1/gold.1.gz \
	./usr/share/locale/da/ \
	./usr/share/doc/binutils/gas/NEWS.gz \
	./usr/share/locale/zh_TW/LC_MESSAGES/binutils.mo \
	./usr/share/locale/zh_CN/LC_MESSAGES/bfd.mo \
	./usr/share/man/man1/dlltool.1.gz \
	./usr/share/man/man1/ranlib.1.gz \
	./usr/share/locale/de/LC_MESSAGES/gprof.mo \
	./usr/share/locale/tr/LC_MESSAGES/opcodes.mo \
	./usr/share/locale/fi/LC_MESSAGES/gprof.mo \
	./usr/share/locale/da/LC_MESSAGES/ld.mo \
	./usr/bin/ \
	./usr/share/doc/binutils/gprof/TEST.gz \
	./usr/share/locale/zh_TW/LC_MESSAGES/ld.mo \
	./usr/lib/ldscripts/armelfb_linux_eabi.xdw \
	./usr/bin/ld \
	./usr/share/locale/ga/LC_MESSAGES/opcodes.mo \
	./usr/share/locale/tr/ \
	./usr/share/locale/sk/LC_MESSAGES/ \
	./usr/share/man/man1/objcopy.1.gz \
	./usr/share/man/man1/ld.bfd.1.gz \
	./usr/share/man/man1/strings.1.gz \
	./usr/share/doc/binutils/bfd/ChangeLog.gz \
	./usr/share/doc/binutils/ld/TODO.gz \
	./usr/share/locale/rw/LC_MESSAGES/binutils.mo \
	./usr/bin/as \
	./usr/lib/ldscripts/armelf_linux_eabi.xsw \
	./usr/share/doc/binutils/bfd/PORTING.gz \
	./usr/bin/ar \
	./usr/share/doc/binutils/gas/ \
	./usr/share/doc/binutils/test-summary.gz \
	./usr/lib/ldscripts/armelfb_linux_eabi.x \
	./usr/share/locale/fi/LC_MESSAGES/ \
	./usr/share/man/ \
	./usr/share/locale/bg/LC_MESSAGES/ld.mo \
	./usr/lib/ldscripts/armelf_linux_eabi.xsc \
	./usr/share/doc/ \
	./usr/share/locale/eo/LC_MESSAGES/gprof.mo\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
