LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://main.c"

do_compile() {
	${CC} ${WORKDIR}/main.c -o ${B}/hello-from-c
}

do_install () {
	mkdir -p ${D}${bindir}
	cp ${B}/hello-from-c ${D}${bindir}
}
