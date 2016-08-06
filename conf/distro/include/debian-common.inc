PACKAGE_CLASSES ?= "package_deb"
DISTRO = "${DISTRO_NAME}-${DISTRO_VERSION}"

SANITY_TESTED_DISTROS ?= " \
	Ubuntu-14.04 \
"

WARN_QA = ""
ERROR_QA = "dev-so debug-deps dev-deps debug-files arch la2 pkgconfig la perms useless-rpaths rpaths staticdev"

# blacklist blacklist_src_packages
INHERIT += "deb_feed"

# since we are a multi distro builder, include the distro name in the staging area.
STAGING_DIR_HOST = "${STAGING_DIR}/${DISTRO}-${MACHINE}"
STAGING_DIR_TARGET = "${STAGING_DIR}/${DISTRO}-${MACHINE}"

PKG_CONFIG_PATH .= ":${STAGING_DIR_TARGET}/${libdir}/${TARGET_SYS}/pkgconfig"

# no idea...
LOCALCONF_VERSION = "1"
LAYER_CONF_VERSION ?= "6"
OELAYOUT_ABI = "8"

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
DEBIANNAME_python-shell = "python"
DEBIANNAME_python-sqlite3 = "python"
DEBIANNAME_python-subprocess = "python"
DEBIANNAME_python-pygobject = "python-gobject"

DEBIANNAME_glib-2.0 = "glib2.0"

UPDATERCD = "sysv-rc"
PROVIDES_append_pn-sysvinit = " update-rc.d"

PREFERRED_PROVIDER_python-lxml = "lxml"
PREFERRED_PROVIDER_python-requests = "requests"

DAEMONTOOLS = "daemontools-run"
RPROVIDES_daemontools_append_pn-daemontools = "daemontools-run-dev"
DAEMONTOOLS_SERVICES_DIR = "/etc/service"
PREFERRED_PROVIDER_daemontools-run = "daemontools-run"
