include conf/distro/include/tcmode-external.inc

PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}libc-for-gcc = "glibc-deb"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}libc-initial = "glibc-deb"
PREFERRED_PROVIDER_glibc = "glibc-deb"
PREFERRED_PROVIDER_virtual/libc = "glibc-deb"
PREFERRED_PROVIDER_virtual/libintl = "glibc-deb"
PREFERRED_PROVIDER_virtual/libiconv = "glibc-deb"

PROVIDES_append_pn-glibc-deb = " virtual/libc virtual/${TARGET_PREFIX}libc-for-gcc"
PROVIDES_append_pn-glibc = " virtual/libc virtual/${TARGET_PREFIX}libc-for-gcc"
