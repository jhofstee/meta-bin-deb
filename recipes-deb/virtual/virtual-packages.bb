LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PROVIDES = " \
	awk \
	default-dbus-session-bus \
"

RPROVIDES_${PN} = "${PROVIDES}"

ALLOW_EMPTY = "1"
