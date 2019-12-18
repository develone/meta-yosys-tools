# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=3bb65c4bee625d497d43f50e6dacb4e2"

SRC_URI = "git://github.com/develone/arachne-pnr.git;protocol=https"

# Modify these as desired
PV = "0.1+git${SRCPV}"
SRCREV = "0901f6348223c1d5e88b82c1a112a7b7a2dbfad0"

S = "${WORKDIR}/git"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.
<<<<<<< HEAD
DEPENDS = " icestorm busybox"
inherit pkgconfig 

FILES_${PN} = '/opt/bin /opt/share'
=======
DEPENDS = "bash-native"

inherit pkgconfig

FILES_${PN} = '/usr/local/bin /usr/local/share'

>>>>>>> 9abdcacbd164a6ca108f6488eb10dd1a6b1e858d
do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# This is a guess; additional arguments may be required
	oe_runmake install 'DESTDIR=${D}'
}

