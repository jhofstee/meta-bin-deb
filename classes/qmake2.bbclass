inherit qt4-info

QMAKE_CROSS = "qmake -spec ${QT_MKSPEC_CROSS_PATH}"

DEPENDS_prepend += "qt4-mkspecs libqt4-dev "

qmake2_do_configure() {
	if [ -z "${QMAKE_PROFILES}" ]; then
		PROFILES="`ls *.pro`"
	else
		PROFILES="${QMAKE_PROFILES}"
	fi

	if [ -z "$PROFILES" ]; then
		die "QMAKE_PROFILES not set and no profiles found in $PWD"
	fi

	if [ ! -z "${EXTRA_QMAKEVARS_POST}" ]; then
		AFTER="-after"
		QMAKE_VARSUBST_POST="${EXTRA_QMAKEVARS_POST}"
		bbnote "qmake postvar substitution: ${EXTRA_QMAKEVARS_POST}"
	fi

	${QMAKE_CROSS} $AFTER $PROFILES $QMAKE_VARSUBST_POST
}

EXPORT_FUNCTIONS do_configure
addtask configure after do_unpack do_patch before do_compile
