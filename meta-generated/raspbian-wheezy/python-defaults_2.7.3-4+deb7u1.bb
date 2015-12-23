PACKAGES = "python python-minimal"
PROVIDES = "python python-minimal"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/python-defaults/python_2.7.3-4+deb7u1_all.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/python-defaults/python-minimal_2.7.3-4+deb7u1_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python = "python_2.7.3-4+deb7u1_all.deb"
SRC_URI[deb0.sha256sum] = "c5a10bff34f1fa815587980d0fc093a8fa774ca5b0af5eb87148d3d3ef403e24"
SRC_URI[deb0.md5sum] = "1ac19577e8d570618f78d4f88bd48f5b"
DEBFILENAME_python-minimal = "python-minimal_2.7.3-4+deb7u1_all.deb"
SRC_URI[deb1.sha256sum] = "e1226fd51a7bd0e360084788e41c58d26135bf8d12dbcf9fcd960fc95e9570f8"
SRC_URI[deb1.md5sum] = "6e3755110df3bbd46c0a23f3cfb22198"

RDEPENDS_python = "python2.7 (>= 2.7.3-1~) python-minimal (= 2.7.3-4+deb7u1)"
RDEPENDS_python-minimal = "python2.7-minimal (>= 2.7.3-1~) dpkg (>= 1.13.20)"
DEPENDS = "python2.7-minimal python2.7 dpkg"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python = " \
	./usr/share/python/ \
	./usr/share/man/man1/pdb.1.gz \
	./usr/share/python/dist_fallback \
	./usr/share/doc/python2.7/python-policy.sgml.gz \
	./usr/share/doc-base/python-policy \
	./usr/share/doc/python/FAQ.html \
	./usr/share/pixmaps/python.xpm \
	./usr/share/doc/python/python-policy.html/ch-embed.html \
	./usr/share/ \
	./usr/share/doc/python/python-policy.txt.gz \
	./usr/share/doc/python/changelog.Debian.gz \
	./usr/share/apps/konsole/ \
	./usr/bin/2to3 \
	./usr/share/doc/python/python-policy.html/ap-packaging_tools.html \
	./usr/share/doc/python/faq/general.html \
	./usr/share/doc/python/faq/installed.html \
	./usr/share/python/runtime.d/ \
	./usr/bin/pydoc \
	./usr/bin/dh_python2 \
	./usr/share/perl5/Debian/Debhelper/Sequence/ \
	./usr/ \
	./ \
	./usr/share/perl5/Debian/ \
	./usr/share/apps/konsole/python.desktop \
	./usr/bin/pygettext \
	./usr/share/python/runtime.d/public_modules.rtinstall \
	./usr/share/doc/python/faq/gui.html \
	./usr/share/python/python.mk \
	./usr/share/perl5/Debian/Debhelper/Sequence/python2.pm \
	./usr/lib/valgrind/ \
	./usr/share/perl5/Debian/Debhelper/ \
	./usr/share/pixmaps/ \
	./usr/lib/valgrind/python.supp \
	./usr/share/doc/python/faq/extending.html \
	./usr/share/doc-base/ \
	./usr/share/doc/python/python-policy.html/ch-other.html \
	./usr/share/doc/python/python-policy.html/ap-build_dependencies.html \
	./usr/share/doc/python/python-policy.sgml.gz \
	./usr/share/doc/python/python-policy.html/ \
	./usr/share/man/man1/pygettext.1.gz \
	./usr/share/man/man1/dh_python2.1.gz \
	./usr/bin/ \
	./usr/share/apps/ \
	./usr/share/doc/python/README.Debian \
	./usr/share/doc/python/faq/library.html \
	./usr/share/doc/python/faq/ \
	./usr/share/doc/python/copyright \
	./usr/share/doc/python2.7/ \
	./usr/share/doc/python/ \
	./usr/share/doc/python/faq/programming.html \
	./usr/share/doc/python2.7/python-policy.html \
	./usr/share/debhelper/autoscripts/ \
	./usr/share/man/man1/ \
	./usr/share/debhelper/ \
	./usr/share/python/runtime.d/public_modules.rtremove \
	./usr/share/lintian/ \
	./usr/share/perl5/ \
	./usr/share/doc/python/faq/windows.html \
	./usr/share/man/ \
	./usr/share/lintian/overrides/ \
	./usr/bin/pdb \
	./usr/share/doc/python2.7/python-policy.txt.gz \
	./usr/share/man/man1/2to3.1.gz \
	./usr/share/debhelper/autoscripts/prerm-pyclean \
	./usr/share/doc/python/python-policy.html/ch-programs.html \
	./usr/share/lintian/overrides/python \
	./usr/share/debhelper/autoscripts/preinst-pycentral-clean \
	./usr/share/man/man1/pydoc.1.gz \
	./usr/share/doc/python/python-policy.html/ap-upgrade.html \
	./usr/share/doc/python/python-policy.html/index.html \
	./usr/share/debhelper/autoscripts/postinst-pycompile \
	./usr/share/doc/python/python-policy.html/ch-python.html \
	./usr/share/doc/python/python-policy.html/ch-module_packages.html \
	./usr/share/doc/ \
	./usr/lib/\
"
FILES_python-minimal = " \
	./usr/share/python/ \
	./usr/bin/pyclean \
	./usr/share/man/man1/pyversions.1.gz \
	./usr/share/man/man1/ \
	./usr/share/ \
	./usr/share/man/man1/pycompile.1.gz \
	./usr/share/python/debpython/pydist.py \
	./usr/share/python/debpython/option.py \
	./usr/share/python/pyversions.py \
	./usr/share/python/debpython/__init__.py \
	./usr/share/python/debian_defaults \
	./usr/ \
	./ \
	./usr/share/python/debpython/ \
	./usr/share/python/debpython/namespace.py \
	./usr/share/doc/python-minimal/ \
	./usr/share/python/debpython/depends.py \
	./usr/bin/python \
	./usr/bin/pyversions \
	./usr/share/man/ \
	./usr/bin/ \
	./usr/share/doc/python-minimal/changelog.Debian.gz \
	./usr/share/python/debpython/debhelper.py \
	./usr/bin/pycompile \
	./usr/share/doc/python-minimal/README.Debian \
	./usr/share/python/debpython/tools.py \
	./usr/bin/python2 \
	./usr/share/man/man1/pyclean.1.gz \
	./usr/share/doc/python-minimal/copyright \
	./usr/share/man/man1/python2.1.gz \
	./usr/share/python/debpython/version.py \
	./usr/share/man/man1/python.1.gz \
	./usr/share/python/debpython/files.py \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
