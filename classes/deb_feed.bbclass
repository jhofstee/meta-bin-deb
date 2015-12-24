inherit blacklist

DEBFEED_PN_WHITELIST ?= "package-index"

python check_deb_feed_provides_package () {
	import oe.deb_feed

	d = e.data
	pn = d.getVar("PN", True)

	oe_gen = oe.deb_feed.oe_get_meta_generator(d)
	suggests = oe_gen.can_provide_oe_pn(e._item)
	#oe_gen.add("libboost-regex-dev")
	#oe_gen.add("libboost-thread-dev")
	bb.note("The following binary packages are available:\n" + "\n".join(suggests))
	bb.warn("nothing provides: " + e._item)
}

check_deb_feed_provides_package[eventmask] = "bb.event.NoProvider"
addhandler check_deb_feed_provides_package

# setup and fetch the deb meta info early so it can be used to search for packages
python setup_deb_repo () {
	import oe.deb_feed
	oe_gen = oe.deb_feed.oe_get_meta_generator(d)
	oe_gen.check_setup()
}

setup_deb_repo[eventmask] = "bb.event.TreeDataPreparationStarted"
addhandler setup_deb_repo

python () {
	package_arch = (d.getVar("PACKAGE_ARCH", True) or "")
	host_arch = (d.getVar("HOST_ARCH", True) or "")

	if package_arch == host_arch:
		return

	file = (d.getVar("FILE", True) or "")
	if "/openembedded-core/" not in file:
		return

	PN = d.getVar("PN", True)
	whitelist = d.getVar("DEBFEED_PN_WHITELIST", False)
	if PN in whitelist:
		return

	deb = d.getVar("DEBIANNAME", True) or ""
	file = d.getVar("FILE", True)
	raise bb.parse.SkipPackage("blacklisted source build from openembedded core" + deb + " (" + file + ")")
}

