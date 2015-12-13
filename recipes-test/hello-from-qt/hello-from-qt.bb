LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}"
SRC_URI = " \
	file://hello-qt.pro \
	file://main.cpp \
"

inherit qmake2

do_install () {
	mkdir -p ${D}${bindir}
	cp ${B}/hello-from-qt ${D}${bindir}
}

