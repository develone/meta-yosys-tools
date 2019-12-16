# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   3rdparty/googletest/googlemock/LICENSE
#   3rdparty/googletest/googlemock/scripts/generator/LICENSE
#   3rdparty/googletest/googletest/LICENSE
#   3rdparty/sanitizers-cmake/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "ISC & Unknown & MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=d6e454a24247f9ba6d2c656f97de17e9 \
                    file://3rdparty/googletest/googlemock/LICENSE;md5=cbbd27594afd089daa160d3a16dd515a \
                    file://3rdparty/googletest/googlemock/scripts/generator/LICENSE;md5=2c0b90db7465231447cf2dd2e8163333 \
                    file://3rdparty/googletest/googletest/LICENSE;md5=cbbd27594afd089daa160d3a16dd515a \
                    file://3rdparty/sanitizers-cmake/LICENSE;md5=aa2a60f1c9a6eedf1614f2441e641e90 \
                    file://3rdparty/python-console/LICENSE;md5=813b66e85f5483b2d00c29319dbd947a"

SRC_URI = "git://github.com/develone/nextpnr.git;protocol=https"

# Modify these as desired
PV = "0.1+git${SRCPV}"
SRCREV = "7d5dba3ad378563869657b4330c178ecd8c24931"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Qt5 Sanitizers
DEPENDS = "boost virtual/libgl cmake cmake-native"

inherit cmake python-dir pythonnative

FILES_${PN} = '/usr/local/bin /usr/local/share'

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
do_configure () {
}

do_compile() {
}
