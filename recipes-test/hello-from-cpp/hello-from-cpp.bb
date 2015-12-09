LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://main.cpp"

RDEPENDS_${PN} = "dbus"

do_compile() {
	${CXX} ${WORKDIR}/main.cpp -o ${B}/hello-from-cpp
}

do_install () {
	mkdir -p ${D}${bindir}
	cp ${B}/hello-from-cpp ${D}${bindir}
}
