# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=3894bff8746d28aca6650d596b65b37a"

SRC_URI = "git://github.com/develone/icestorm.git;protocol=https"

# Modify these as desired
PV = "0.1+git${SRCPV}"
SRCREV = "8cac6c584044034210fe0ba1e6b930ff1cc59465"

S = "${WORKDIR}/git"

DEPENDS = "libftdi"

inherit pkgconfig

FILES =  "/usr/local/share \
  /usr/local/bin/icetime \
  /usr/local/bin/icebram \
  /usr/local/bin/icebox.py \
  /usr/local/bin/icebox_html \
  /usr/local/bin/icebox_hlc2asc \
  /usr/local/bin/icebox_colbuf \
  /usr/local/bin/icebox_chipdb \
  /usr/local/bin/iceunpack \
  /usr/local/bin/icebox_stat \
  /usr/local/bin/icepack \
  /usr/local/bin/icebox_diff \
  /usr/local/bin/iceboxdb.py \
  /usr/local/bin/icebox_asc2hlc \
  /usr/local/bin/icepll \
  /usr/local/bin/icemulti \
  /usr/local/bin/iceprog \
  /usr/local/bin/icebox_explain \
  /usr/local/bin/icebox_vlog \
  /usr/local/bin/icebox_maps \
  /usr/local/share/icebox \
  /usr/local/share/icebox/chipdb-384.txt \
  /usr/local/share/icebox/chipdb-5k.txt \
  /usr/local/share/icebox/chipdb-8k.txt \
  /usr/local/share/icebox/chipdb-1k.txt \
  /usr/local/share/icebox/chipdb-lm4k.txt \
  /usr/local/share/icebox/timings_lp1k.txt \
  /usr/local/share/icebox/timings_up5k.txt \
  /usr/local/share/icebox/timings_lp8k.txt \
  /usr/local/share/icebox/timings_lp384.txt \
  /usr/local/share/icebox/timings_hx8k.txt \
  /usr/local/share/icebox/timings_hx1k.txt "
# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

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

