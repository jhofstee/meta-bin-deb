PACKAGES = "x11-common"
PROVIDES = "x11-common"
PACKAGE_EXCLUDE = "x11-common"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/xorg/x11-common_7.7+3~deb7u1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_x11-common = "x11-common_7.7+3~deb7u1_all.deb"
SRC_URI[deb0.sha256sum] = "e3883aab23e2be4907c01bf06ae73d30bff2078bfe8e5366e077a652d39933d2"
SRC_URI[deb0.md5sum] = "0878bf26dfcd8c40980ca9123ca66023"

RDEPENDS_x11-common = "debconf (>= 0.5) lsb-base (>= 1.3-9ubuntu2)"
DEPENDS = "debconf lsb-base"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_x11-common = " \
	./etc/X11/Xsession.d/50x11-common_determine-startup \
	./etc/X11/Xreset.d/ \
	./etc/init.d/ \
	./usr/share/doc/x11-common/changelog.gz \
	./etc/X11/Xsession.d/90x11-common_ssh-agent \
	./usr/share/man/man5/Xsession.options.5.gz \
	./usr/lib/X11/ \
	./etc/X11/Xreset.d/README \
	./usr/share/ \
	./usr/share/man/man5/ \
	./usr/ \
	./ \
	./usr/share/doc/x11-common/changelog.Debian.old.gz \
	./usr/lib/ \
	./usr/share/doc/x11-common/ \
	./usr/include/ \
	./usr/share/X11/rgb.txt \
	./etc/X11/Xsession.d/30x11-common_xresources \
	./etc/ \
	./usr/share/doc/x11-common/TODO \
	./etc/X11/Xsession.d/35x11-common_xhost-local \
	./etc/X11/Xsession.d/ \
	./usr/bin/ \
	./usr/share/X11/ \
	./etc/X11/Xresources/x11-common \
	./etc/X11/rgb.txt \
	./etc/X11/ \
	./usr/share/doc/x11-common/NEWS.Debian.gz \
	./etc/X11/Xresources/ \
	./etc/X11/Xsession.d/99x11-common_start \
	./etc/X11/Xsession \
	./usr/share/man/man5/Xwrapper.config.5.gz \
	./usr/share/doc/x11-common/copyright \
	./usr/share/lintian/ \
	./usr/share/lintian/overrides/x11-common \
	./usr/bin/X11 \
	./usr/share/lintian/overrides/ \
	./etc/X11/Xreset \
	./usr/include/X11/ \
	./etc/init.d/x11-common \
	./etc/X11/Xsession.options \
	./etc/X11/Xsession.d/40x11-common_xsessionrc \
	./usr/share/man/man5/Xsession.5.gz \
	./usr/share/man/ \
	./etc/X11/Xsession.d/20x11-common_process-args \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
