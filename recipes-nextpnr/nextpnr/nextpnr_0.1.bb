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
#   3rdparty/imgui/examples/libs/glfw/COPYING.txt
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
#LICENSE = "ISC & Unknown & MIT"
LICENSE = "ISC & MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=d6e454a24247f9ba6d2c656f97de17e9 "
#                    file://3rdparty/googletest/googlemock/LICENSE;md5=cbbd27594afd089daa160d3a16dd515a \
#                    file://3rdparty/googletest/googlemock/scripts/generator/LICENSE;md5=2c0b90db7465231447cf2dd2e8163333 \
#                    file://3rdparty/googletest/googletest/LICENSE;md5=cbbd27594afd089daa160d3a16dd515a \
#                    file://3rdparty/sanitizers-cmake/LICENSE;md5=aa2a60f1c9a6eedf1614f2441e641e90 \
#                    file://3rdparty/qtimgui/LICENSE;md5=d3331938603e9c47f49d20d793f7e226 \
#                    file://3rdparty/python-console/LICENSE;md5=813b66e85f5483b2d00c29319dbd947a \
#                    file://3rdparty/imgui/LICENSE.txt;md5=f3c4ae64ab2a23f1b8734609e1a2d48a \
#                    file://3rdparty/imgui/examples/libs/glfw/COPYING.txt;md5=f543d41f3829a608a406b713e4e72731 \
#                    file://tests/COPYING;md5=d6e454a24247f9ba6d2c656f97de17e9"

SRC_URI = "git://github.com/develone/nextpnr.git;protocol=https"

# Modify these as desired
PV = "0.1+git${SRCPV}"
SRCREV = "98cc243b5f7074ce4b49203ce06d7665d8c4a744"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Eigen3 Qt5 Sanitizers
DEPENDS = "expat boost zlib virtual/libgl icestorm libeigen "

inherit cmake python3native python3-dir pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
#EXTRA_OECMAKE = "-DARCH=ice40 -DBUILD_GUI=OFF -DBUILD_PYTHON=OFF ."
EXTRA_OECMAKE = "-DARCH=ice40 -DBUILD_GUI=OFF  ${S} "

