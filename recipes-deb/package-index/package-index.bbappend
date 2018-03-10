DEPENDS += "reprepro-native"

do_package_index[depends] += "reprepro-native:do_populate_sysroot"
