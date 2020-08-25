# Workaround for qt on Debian. OE rocko no longer allows using host tools
# by default. This is exactly what is done for qt packages though, since
# only qmake is needed to generate a Makefile this is exactly what was being
# done.
#
# For now just disable these packages until there is some time to look into it

RRECOMMENDS_${PN}_remove += " \
	dbus-cgwacs \
	dbus-fronius \
	dbus-modbus-client \
	dbus-qwacs \
	dbus-redflow \
"
