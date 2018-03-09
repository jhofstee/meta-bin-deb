inherit blacklist

DEBFEED_PN_WHITELIST ?= "package-index shadow-sysroot"

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

	PN = d.getVar("PN", True)
	rdepends = (d.getVar("RDEPENDS_" + PN, True) or "")
	changed = False
	new_depends = []
	for rdepend in rdepends.split():
		deb_name = (d.getVar("DEBIANNAME_" + rdepend, True) or "")
		if deb_name != "":
			rdepend = deb_name
			changed = True
		new_depends.append(rdepend)

	if changed:
		new_depends = list(sorted(set(new_depends)))
		rdepends = " ".join(new_depends)
		d.setVar("RDEPENDS_" + PN, rdepends)

	if package_arch == host_arch:
		return

	file = (d.getVar("FILE", True) or "")
	if "/openembedded-core/" not in file:
		depends = (d.getVar("DEPENDS", True) or "")
		changed = False
		new_depends = []
		for depend in depends.split():
			deb_name = (d.getVar("DEBIANNAME_" + depend, True) or "")
			if deb_name != "":
				depend = deb_name
				changed = True
			new_depends.append(depend)

		if changed:
			new_depends = list(sorted(set(new_depends)))
			depends = " ".join(new_depends)
			d.setVar("DEPENDS", depends)
		return

	PN = d.getVar("PN", True)
	whitelist = d.getVar("DEBFEED_PN_WHITELIST", False)
	if PN in whitelist:
		return

	deb = d.getVar("DEBIANNAME", True) or ""
	file = d.getVar("FILE", True)
	raise bb.parse.SkipPackage("blacklisted source build from openembedded core" + deb + " (" + file + ")")
}

