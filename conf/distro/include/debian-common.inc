PACKAGE_CLASSES ?= "package_deb"
DISTRO = "${DISTRO_NAME}-${DISTRO_VERSION}"

SANITY_TESTED_DISTROS = " \
	ubuntu-16.04 \n \
	ubuntu-18.04 \n \
"

WARN_QA = ""
ERROR_QA = "dev-so debug-deps dev-deps debug-files arch la2 pkgconfig la perms useless-rpaths rpaths staticdev"

# blacklist blacklist_src_packages
INHERIT += "deb_feed"

PKG_CONFIG_PATH_class-target .= ":${PKG_CONFIG_SYSROOT_DIR}/${libdir}/${EXTERNAL_TARGET_SYS}/pkgconfig"

CONNECTIVITY_CHECK_URIS ?= ""

# Debian doesn't split python like OE does, so point them to python itself..
DEBIANNAME_python-fcntl = "python"
DEBIANNAME_python-core = "python"
DEBIANNAME_python-datetime = "python"
DEBIANNAME_python-email = "python"
DEBIANNAME_python-compression = "python"
DEBIANNAME_python-io = "python"
DEBIANNAME_python-json = "python"
DEBIANNAME_python-multiprocessing = "python"
DEBIANNAME_python-netserver = "python"
DEBIANNAME_python-pprint = "python"
DEBIANNAME_python-pyserial = "python-serial"
DEBIANNAME_python-shell = "python"
DEBIANNAME_python-sqlite3 = "python"
DEBIANNAME_python-subprocess = "python"
DEBIANNAME_python-pygobject = "python-gobject"

DEBIANNAME_python3-core = "python3"
DEBIANNAME_python3-fcntl = "python3"
DEBIANNAME_python3-io = "python3"
DEBIANNAME_python3-json = "python3"
DEBIANNAME_python3-multiprocessing = "python3"
DEBIANNAME_python3-pprint = "python3"
DEBIANNAME_python3-pygobject = "python3-gi"
DEBIANNAME_python3-pyserial = "python3-serial"
DEBIANNAME_python3-shell = "python3"
DEBIANNAME_python3-sqlite3 = "python3"

DEBIANNAME_bluez5 = "bluez"

# runtime packages
DEBIANNAME_glibc-gconv-iso8859-1 = "libc6"

DEBIANNAME_glib-2.0 = "glib2.0"
DEBIANNAME_libsoup-2.4 = "libsoup2.4"

UPDATERCD = "sysv-rc"
PROVIDES_append_pn-sysvinit = " update-rc.d"

PREFERRED_PROVIDER_python-lxml = "lxml"
PREFERRED_PROVIDER_python-pymodbus = "pymodbus"
PREFERRED_PROVIDER_python-requests = "requests"

PREFERRED_VERSION_openssl_forcevariable = ""

DAEMONTOOLS = "daemontools-run"
RPROVIDES_daemontools_append_pn-daemontools = "daemontools-run-dev"
DAEMONTOOLS_SERVICES_DIR = "/etc/service"
PREFERRED_PROVIDER_daemontools-run = "daemontools-run"
