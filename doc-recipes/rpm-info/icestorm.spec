Summary: icestorm version 0.1+gitAUTOINC+041c075e4a-r0
Name: icestorm
Version: 0.1+git0+041c075e4a
Release: r0
License: ISC
Group: base
Packager: Poky <poky@yoctoproject.org>
BuildRequires: libftdi
BuildRequires: pkgconfig-native
BuildRequires: virtual/aarch64-poky-linux-compilerlibs
BuildRequires: virtual/aarch64-poky-linux-gcc
BuildRequires: virtual/libc
Requires: /usr/bin/env
Requires: ld-linux-aarch64.so.1()(64bit)
Requires: ld-linux-aarch64.so.1(GLIBC_2.17)(64bit)
Requires: libc.so.6()(64bit)
Requires: libc.so.6(GLIBC_2.17)(64bit)
Requires: libc6 >= 2.30
Requires: libftdi1-2 >= 1.4
Requires: libftdi1.so.2()(64bit)
Requires: libgcc1 >= 9.2.0
Requires: libgcc_s.so.1()(64bit)
Requires: libgcc_s.so.1(GCC_3.0)(64bit)
Requires: libm.so.6()(64bit)
Requires: libm.so.6(GLIBC_2.29)(64bit)
Requires: libstdc++.so.6()(64bit)
Requires: libstdc++.so.6(CXXABI_1.3)(64bit)
Requires: libstdc++.so.6(GLIBCXX_3.4)(64bit)
Requires: libstdc++.so.6(GLIBCXX_3.4.11)(64bit)
Requires: libstdc++.so.6(GLIBCXX_3.4.14)(64bit)
Requires: libstdc++.so.6(GLIBCXX_3.4.20)(64bit)
Requires: libstdc++.so.6(GLIBCXX_3.4.21)(64bit)
Requires: libstdc++.so.6(GLIBCXX_3.4.9)(64bit)
Requires: libstdc++6 >= 9.2.0
Requires: rtld(GNU_HASH)

%description
icestorm version 0.1+gitAUTOINC+041c075e4a-r0.

%package -n icestorm-src
Summary: icestorm version 0.1+gitAUTOINC+041c075e4a-r0 - Source files
License: ISC
Group: devel

%description -n icestorm-src
icestorm version 0.1+gitAUTOINC+041c075e4a-r0.  This package contains
sources for debugging purposes.

%package -n icestorm-dbg
Summary: icestorm version 0.1+gitAUTOINC+041c075e4a-r0 - Debugging files
License: ISC
Group: devel
Recommends: libc6-dbg
Recommends: libftdi1-dbg
Recommends: libgcc-s-dbg
Recommends: libstdc++-dbg

%description -n icestorm-dbg
icestorm version 0.1+gitAUTOINC+041c075e4a-r0.  This package contains ELF
symbols and related sources for debugging purposes.

%package -n icestorm-staticdev
Summary: icestorm version 0.1+gitAUTOINC+041c075e4a-r0 - Development files (Static Libraries)
License: ISC
Group: devel
Requires: icestorm-dev = 0.1+git0+041c075e4a-r0

%description -n icestorm-staticdev
icestorm version 0.1+gitAUTOINC+041c075e4a-r0.  This package contains
static libraries for software development.

%package -n icestorm-dev
Summary: icestorm version 0.1+gitAUTOINC+041c075e4a-r0 - Development files
License: ISC
Group: devel
Requires: icestorm = 0.1+git0+041c075e4a-r0
Recommends: libc6-dev
Recommends: libftdi1-dev
Recommends: libgcc-s-dev
Recommends: libstdc++-dev

%description -n icestorm-dev
icestorm version 0.1+gitAUTOINC+041c075e4a-r0.  This package contains
symbolic links, header files, and related items necessary for software
development.

%package -n icestorm-doc
Summary: icestorm version 0.1+gitAUTOINC+041c075e4a-r0 - Documentation files
License: ISC
Group: doc

%description -n icestorm-doc
icestorm version 0.1+gitAUTOINC+041c075e4a-r0.  This package contains
documentation.

%package -n icestorm-locale
Summary: icestorm version 0.1+gitAUTOINC+041c075e4a-r0
License: ISC
Group: base

%description -n icestorm-locale
icestorm version 0.1+gitAUTOINC+041c075e4a-r0.

%files
%defattr(-,-,-,-)
%dir "/opt"
%dir "/opt/bin"
%dir "/opt/share"
"/opt/bin/icetime"
"/opt/bin/icebram"
"/opt/bin/icebox.py"
"/opt/bin/icebox_html"
"/opt/bin/icebox_hlc2asc"
"/opt/bin/icebox_colbuf"
"/opt/bin/icebox_chipdb"
"/opt/bin/iceunpack"
"/opt/bin/icebox_stat"
"/opt/bin/icepack"
"/opt/bin/icebox_diff"
"/opt/bin/iceboxdb.py"
"/opt/bin/icebox_asc2hlc"
"/opt/bin/icepll"
"/opt/bin/icemulti"
"/opt/bin/iceprog"
"/opt/bin/icebox_explain"
"/opt/bin/icebox_vlog"
"/opt/bin/icebox_maps"
%dir "/opt/share/icebox"
"/opt/share/icebox/chipdb-384.txt"
"/opt/share/icebox/chipdb-u4k.txt"
"/opt/share/icebox/chipdb-5k.txt"
"/opt/share/icebox/chipdb-8k.txt"
"/opt/share/icebox/chipdb-1k.txt"
"/opt/share/icebox/chipdb-lm4k.txt"
"/opt/share/icebox/timings_u4k.txt"
"/opt/share/icebox/timings_lp1k.txt"
"/opt/share/icebox/timings_up5k.txt"
"/opt/share/icebox/timings_lp8k.txt"
"/opt/share/icebox/timings_lp384.txt"
"/opt/share/icebox/timings_hx8k.txt"
"/opt/share/icebox/timings_hx1k.txt"

%files -n icestorm-src
%defattr(-,-,-,-)
%dir "/usr"
%dir "/usr/src"
%dir "/usr/src/debug"
%dir "/usr/src/debug/icestorm"
%dir "/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0"
%dir "/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git"
%dir "/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icetime"
%dir "/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icebram"
%dir "/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icepack"
%dir "/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icepll"
%dir "/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icemulti"
%dir "/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/iceprog"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icetime/timings-up5k.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icetime/timings-lp1k.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icetime/iceutil.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icetime/timings-lp384.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icetime/timings-hx8k.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icetime/timings-lp8k.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icetime/icetime.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icetime/timings-hx1k.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icebram/icebram.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icepack/icepack.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icepll/icepll.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/icemulti/icemulti.cc"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/iceprog/mpsse.c"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/iceprog/iceprog.c"
"/usr/src/debug/icestorm/0.1+gitAUTOINC+041c075e4a-r0/git/iceprog/mpsse.h"

%files -n icestorm-dbg
%defattr(-,-,-,-)
%dir "/opt"
%dir "/opt/bin"
%dir "/opt/bin/.debug"
"/opt/bin/.debug/icetime"
"/opt/bin/.debug/icebram"
"/opt/bin/.debug/icepack"
"/opt/bin/.debug/icepll"
"/opt/bin/.debug/icemulti"
"/opt/bin/.debug/iceprog"

%files -n icestorm-dev
%defattr(-,-,-,-)

