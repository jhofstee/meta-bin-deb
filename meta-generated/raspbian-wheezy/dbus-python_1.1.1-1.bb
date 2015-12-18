PACKAGES = "python-dbus python-dbus-dev"
PROVIDES = "python-dbus python-dbus-dev"
PACKAGE_EXCLUDE = "python-dbus python-dbus-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dbus-python/python-dbus_1.1.1-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus-python/python-dbus-dev_1.1.1-1_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-dbus = "python-dbus_1.1.1-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "2c8a6bd826e8ae60719efb2120ce837f2e3a85963657a5bf08ebf5fa5572cad0"
SRC_URI[deb0.md5sum] = "33117475a9fa1f900fcfb701a6285337"
DEBFILENAME_python-dbus-dev = "python-dbus-dev_1.1.1-1_all.deb"
SRC_URI[deb1.sha256sum] = "1e3309440dfc5a92518e6395ac82682244f10db4976a8cfe2811ff35850f472f"
SRC_URI[deb1.md5sum] = "e317a0d916d0a475d6d4b1248924c794"

RDEPENDS_python-dbus = "python2.7 python (>= 2.6.6-7~) python (<< 2.8) libc6 (>= 2.13-28) libdbus-1-3 (>= 1.5.12) libdbus-glib-1-2 (>= 0.78) libglib2.0-0 (>= 2.12.0) python-dbus-dev"
DEPENDS = "libglib2.0-0 python libdbus-1-3 libdbus-glib-1-2 python2.7 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-dbus = " \
	./usr/share/pyshared/dbus/service.py \
	./usr/share/pyshared/dbus/mainloop/ \
	./usr/lib/python2.7/dist-packages/dbus/mainloop/__init__.py \
	./usr/lib/python2.6/dist-packages/dbus/proxies.py \
	./usr/share/pyshared/dbus/bus.py \
	./usr/lib/python2.6/ \
	./usr/lib/python2.6/dist-packages/_dbus_glib_bindings.so \
	./usr/lib/pyshared/python2.7/ \
	./usr/lib/python2.6/dist-packages/dbus/exceptions.py \
	./usr/lib/python2.7/dist-packages/dbus/connection.py \
	./usr/lib/python2.7/dist-packages/_dbus_bindings.so \
	./usr/lib/python2.7/dist-packages/dbus/mainloop/ \
	./usr/share/pyshared/dbus/_compat.py \
	./usr/lib/python2.6/dist-packages/dbus/service.py \
	./usr/share/pyshared/dbus/mainloop/glib.py \
	./usr/share/doc/python-dbus/README \
	./usr/lib/python2.7/dist-packages/_dbus_glib_bindings.so \
	./usr/lib/python2.6/dist-packages/dbus/_compat.py \
	./usr/lib/python2.7/ \
	./usr/lib/python2.6/dist-packages/_dbus_bindings.so \
	./usr/share/pyshared/ \
	./usr/lib/pyshared/python2.6/ \
	./usr/share/pyshared/dbus/decorators.py \
	./usr/lib/python2.6/dist-packages/dbus/gi_service.py \
	./usr/lib/python2.7/dist-packages/dbus/glib.py \
	./usr/lib/python2.7/dist-packages/dbus/ \
	./usr/lib/python2.6/dist-packages/dbus/mainloop/ \
	./usr/lib/python2.6/dist-packages/dbus/connection.py \
	./usr/lib/python2.7/dist-packages/dbus/service.py \
	./usr/lib/python2.6/dist-packages/dbus/gobject_service.py \
	./usr/lib/python2.6/dist-packages/dbus/bus.py \
	./usr/share/ \
	./usr/lib/python2.7/dist-packages/dbus/__init__.py \
	./usr/lib/python2.7/dist-packages/dbus/bus.py \
	./usr/ \
	./usr/lib/python2.6/dist-packages/dbus/ \
	./usr/lib/python2.6/dist-packages/dbus/glib.py \
	./usr/lib/python2.7/dist-packages/dbus/decorators.py \
	./usr/share/pyshared/dbus/proxies.py \
	./usr/lib/python2.7/dist-packages/dbus/_version.py \
	./usr/lib/python2.7/dist-packages/dbus/gobject_service.py \
	./usr/lib/python2.7/dist-packages/dbus/mainloop/glib.py \
	./usr/lib/python2.6/dist-packages/dbus/mainloop/__init__.py \
	./usr/share/pyshared/dbus/types.py \
	./usr/share/doc/python-dbus/changelog.gz \
	./usr/lib/python2.7/dist-packages/dbus/_dbus.py \
	./usr/share/doc/python-dbus/ \
	./usr/lib/python2.6/dist-packages/dbus/__init__.py \
	./usr/lib/python2.6/dist-packages/dbus/_version.py \
	./usr/share/doc/python-dbus/NEWS.gz \
	./usr/lib/python2.7/dist-packages/dbus/exceptions.py \
	./usr/lib/pyshared/python2.6/_dbus_glib_bindings.so \
	./usr/share/pyshared/dbus/_version.py \
	./ \
	./usr/share/doc/python-dbus/changelog.Debian.gz \
	./usr/share/pyshared/dbus/mainloop/__init__.py \
	./usr/share/doc/python-dbus/copyright \
	./usr/lib/python2.6/dist-packages/dbus/_dbus.py \
	./usr/lib/python2.6/dist-packages/dbus/lowlevel.py \
	./usr/lib/python2.6/dist-packages/dbus/decorators.py \
	./usr/lib/python2.6/dist-packages/dbus/types.py \
	./usr/lib/python2.7/dist-packages/dbus/types.py \
	./usr/share/pyshared/dbus/gi_service.py \
	./usr/lib/pyshared/python2.7/_dbus_glib_bindings.so \
	./usr/lib/python2.6/dist-packages/dbus/server.py \
	./usr/lib/python2.7/dist-packages/dbus/lowlevel.py \
	./usr/lib/pyshared/python2.6/_dbus_bindings.so \
	./usr/lib/python2.6/dist-packages/dbus/_expat_introspect_parser.py \
	./usr/share/pyshared/dbus/connection.py \
	./usr/lib/pyshared/python2.7/_dbus_bindings.so \
	./usr/share/pyshared/dbus/lowlevel.py \
	./usr/lib/pyshared/ \
	./usr/share/pyshared/dbus/glib.py \
	./usr/lib/python2.6/dist-packages/ \
	./usr/share/pyshared/dbus/ \
	./usr/lib/python2.6/dist-packages/dbus/mainloop/glib.py \
	./usr/lib/python2.7/dist-packages/dbus/server.py \
	./usr/lib/python2.7/dist-packages/dbus/proxies.py \
	./usr/lib/python2.7/dist-packages/dbus/_expat_introspect_parser.py \
	./usr/lib/python2.7/dist-packages/ \
	./usr/share/pyshared/dbus/exceptions.py \
	./usr/lib/ \
	./usr/lib/python2.7/dist-packages/dbus/gi_service.py \
	./usr/share/pyshared/dbus/_dbus.py \
	./usr/share/pyshared/dbus/server.py \
	./usr/share/pyshared/dbus/__init__.py \
	./usr/share/pyshared/dbus/gobject_service.py \
	./usr/share/pyshared/dbus/_expat_introspect_parser.py \
	./usr/lib/python2.7/dist-packages/dbus/_compat.py \
	./usr/share/doc/\
"
FILES_python-dbus-dev = " \
	./usr/share/doc/python-dbus-dev/copyright \
	./usr/share/doc/python-dbus-dev/changelog.Debian.gz \
	./usr/ \
	./usr/lib/pkgconfig/dbus-python.pc \
	./usr/share/doc/python-dbus-dev/changelog.gz \
	./usr/lib/ \
	./ \
	./usr/include/dbus-1.0/dbus/ \
	./usr/share/doc/python-dbus-dev/ \
	./usr/include/dbus-1.0/dbus/dbus-python.h \
	./usr/include/ \
	./usr/lib/pkgconfig/ \
	./usr/share/ \
	./usr/include/dbus-1.0/ \
	./usr/share/doc/\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
