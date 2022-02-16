# only needed for package deployment, but annoying for image builds,
# since it will be repackaged all the time, without any need.
RDEPENDS:${PN} += "venus-version"
