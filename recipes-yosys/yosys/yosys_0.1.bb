# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   libs/minisat/LICENSE
#   abc/copyright.txt
#   abc/src/sat/satoko/LICENSE
#   abc/src/sat/bsat2/LICENSE
#   abc/src/sat/xsat/license
#   abc/src/sat/bsat/license
#   abc/src/bdd/cudd/license
#   abc/src/misc/zlib/license
#   abc/src/misc/bzlib/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "ISC & Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=3894bff8746d28aca6650d596b65b37a \
                    file://libs/minisat/LICENSE;md5=878eeefb2214c36db1f068609e7ce90a \
                    file://abc/copyright.txt;md5=bddcabf9df6d33e12310a00780d3a87c \
                    file://abc/src/sat/satoko/LICENSE;md5=cc01bb341364c7e6659b097fb5f223fc \
                    file://abc/src/sat/bsat2/LICENSE;md5=878eeefb2214c36db1f068609e7ce90a \
                    file://abc/src/sat/xsat/license;md5=3f7ef0a90acb921bb7462e57c3659ee0 \
                    file://abc/src/sat/bsat/license;md5=7baa08bf9c4d2131e54bda335061b936 \
                    file://abc/src/bdd/cudd/license;md5=7a04343d712b78151fc48c0233a28ed9 \
                    file://abc/src/misc/zlib/license;md5=46d36f758dcfbe5385119b572449abed \
                    file://abc/src/misc/bzlib/LICENSE;md5=7023994919680c533b77301b306ea1c9"

SRC_URI = "git://github.com/develone/yosys.git;protocol=https"

# Modify these as desired
PV = "0.1+git${SRCPV}"
SRCREV = "e275692e84c935d0cdf42c2a4adf7ac949a88132"

S = "${WORKDIR}/git"

# NOTE: the following library dependencies are unknown, ignoring: bsd curses gtest netapi32 termcap gtest_main edit ws2_32 yosys wsock32 tcl86
#       (this is based on recipes that have previously been built and packaged)
# NOTE: some of these dependencies may be optional, check the Makefile and/or upstream documentation
DEPENDS = "bison-native ncurses readline zlib"
inherit pkgconfig
# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake config-gcc
	oe_runmake
}

do_install () {
	# This is a guess; additional arguments may be required
	oe_runmake install 'DESTDIR=${D}'
}

