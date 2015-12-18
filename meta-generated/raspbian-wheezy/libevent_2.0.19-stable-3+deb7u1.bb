PACKAGES = "libevent-2.0-5 libevent-dev libevent-openssl-2.0-5 libevent-core-2.0-5 libevent-extra-2.0-5 libevent-pthreads-2.0-5"
PROVIDES = "libevent-2.0-5 libevent-dev libevent-openssl-2.0-5 libevent-core-2.0-5 libevent-extra-2.0-5 libevent-pthreads-2.0-5"
PACKAGE_EXCLUDE = "libevent-2.0-5 libevent-dev libevent-openssl-2.0-5 libevent-core-2.0-5 libevent-extra-2.0-5 libevent-pthreads-2.0-5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-2.0-5_2.0.19-stable-3+deb7u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-dev_2.0.19-stable-3+deb7u1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-openssl-2.0-5_2.0.19-stable-3+deb7u1_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-core-2.0-5_2.0.19-stable-3+deb7u1_armhf.deb;unpack=0;name=deb3\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-extra-2.0-5_2.0.19-stable-3+deb7u1_armhf.deb;unpack=0;name=deb4\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-pthreads-2.0-5_2.0.19-stable-3+deb7u1_armhf.deb;unpack=0;name=deb5\
"
DEBFILENAME_libevent-2.0-5 = "libevent-2.0-5_2.0.19-stable-3+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "a7fa27ab75704db13a417a70eeb55cc34b2b30781ed368c939ca00145e3387fa"
SRC_URI[deb0.md5sum] = "0b9ae646ca9f586b92f8c648e6c5a783"
DEBFILENAME_libevent-dev = "libevent-dev_2.0.19-stable-3+deb7u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "59ca3da460034e5cd571d5ab86a52465b86727494901c711a2aa9968006c1e43"
SRC_URI[deb1.md5sum] = "26c7f1b425f8dac25dbf058737f88dc9"
DEBFILENAME_libevent-openssl-2.0-5 = "libevent-openssl-2.0-5_2.0.19-stable-3+deb7u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "6d12bdb77a3d8886d6b5fa442a2faa61fa2611562024e0d291acfb24c55c7c58"
SRC_URI[deb2.md5sum] = "99b4734801efb3ab9f88387dc0990cda"
DEBFILENAME_libevent-core-2.0-5 = "libevent-core-2.0-5_2.0.19-stable-3+deb7u1_armhf.deb"
SRC_URI[deb3.sha256sum] = "edf7afbe3f33b20eaf3886b2373166ff6a43cc11b3cdb2ff40c5f0c51e951280"
SRC_URI[deb3.md5sum] = "492ad1210ea93daabf170e6f7fb7c547"
DEBFILENAME_libevent-extra-2.0-5 = "libevent-extra-2.0-5_2.0.19-stable-3+deb7u1_armhf.deb"
SRC_URI[deb4.sha256sum] = "844fec4185f4737a8f7c58008958827779f1c0b0ae45f482b0f9390f6bafba10"
SRC_URI[deb4.md5sum] = "e0652a75994f02518ddf22e70c531d5a"
DEBFILENAME_libevent-pthreads-2.0-5 = "libevent-pthreads-2.0-5_2.0.19-stable-3+deb7u1_armhf.deb"
SRC_URI[deb5.sha256sum] = "45357da781c8f62913aa7d6330aa9c52427f3b1b748d2dacb192e98e79023e7a"
SRC_URI[deb5.md5sum] = "596cae45a45f065adaafe73b52748fc0"

RDEPENDS_${PN}-2.0-5 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
RDEPENDS_${PN}-dev = "libevent-2.0-5 (= 2.0.19-stable-3+deb7u1) libevent-core-2.0-5 (= 2.0.19-stable-3+deb7u1) libevent-extra-2.0-5 (= 2.0.19-stable-3+deb7u1) libevent-pthreads-2.0-5 (= 2.0.19-stable-3+deb7u1) libevent-openssl-2.0-5 (= 2.0.19-stable-3+deb7u1)"
RDEPENDS_${PN}-openssl-2.0-5 = "libc6 (>= 2.13-28) libevent-core-2.0-5 (= 2.0.19-stable-3+deb7u1) libssl1.0.0 (>= 1.0.0)"
RDEPENDS_${PN}-core-2.0-5 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
RDEPENDS_${PN}-extra-2.0-5 = "libc6 (>= 2.13-28) libevent-core-2.0-5 (= 2.0.19-stable-3+deb7u1)"
RDEPENDS_${PN}-pthreads-2.0-5 = "libc6 (>= 2.13-28) libevent-core-2.0-5 (= 2.0.19-stable-3+deb7u1)"
DEPENDS = "libgcc1 libssl1.0.0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libevent-2.0-5 = " \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/share/doc/libevent-2.0-5/copyright \
	./usr/share/doc/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libevent-2.0-5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5.1.7 \
	./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5 \
	./usr/share/ \
	./usr/share/doc/libevent-2.0-5/ \
	./usr/share/doc/libevent-2.0-5/changelog.gz\
"
FILES_${PN}-dev = " \
	./usr/share/doc/libevent-dev/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads.so \
	./usr/include/event2/event_struct.h \
	./usr/include/event2/bufferevent_ssl.h \
	./usr/include/event2/tag.h \
	./usr/lib/arm-linux-gnueabihf/libevent.a \
	./usr/share/doc/libevent-dev/examples/event-test.c \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/include/event2/dns_struct.h \
	./usr/include/event2/buffer.h \
	./usr/share/ \
	./usr/include/event2/bufferevent_struct.h \
	./usr/include/event2/event.h \
	./usr/lib/arm-linux-gnueabihf/libevent_extra.a \
	./usr/include/event2/http.h \
	./usr/include/event2/ \
	./usr/ \
	./ \
	./usr/include/event2/dns_compat.h \
	./usr/lib/ \
	./usr/share/doc/libevent-dev/examples/dns-example.c.gz \
	./usr/include/event2/tag_compat.h \
	./usr/share/doc/libevent-dev/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads.a \
	./usr/include/evutil.h \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl.so \
	./usr/share/doc/libevent-dev/examples/le-proxy.c.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl.a \
	./usr/share/doc/libevent-dev/examples/hello-world.c \
	./usr/share/doc/libevent-dev/examples/Makefile.sample \
	./usr/include/event2/keyvalq_struct.h \
	./usr/include/event2/bufferevent.h \
	./usr/include/ \
	./usr/share/doc/libevent-dev/TODO.Debian \
	./usr/include/event.h \
	./usr/share/doc/libevent-dev/examples/ \
	./usr/include/evrpc.h \
	./usr/include/evhttp.h \
	./usr/share/doc/libevent-dev/examples/signal-test.c \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_pthreads.pc \
	./usr/include/event2/event_compat.h \
	./usr/include/event2/event-config.h \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/ \
	./usr/include/event2/rpc_struct.h \
	./usr/include/event2/http_compat.h \
	./usr/include/evdns.h \
	./usr/include/event2/util.h \
	./usr/lib/arm-linux-gnueabihf/libevent.so \
	./usr/include/event2/http_struct.h \
	./usr/share/doc/libevent-dev/ \
	./usr/share/doc/libevent-dev/examples/time-test.c \
	./usr/share/doc/libevent-dev/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_extra.so \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_openssl.pc \
	./usr/lib/arm-linux-gnueabihf/libevent_core.a \
	./usr/include/event2/bufferevent_compat.h \
	./usr/share/doc/libevent-dev/examples/http-server.c.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_core.so \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent.pc \
	./usr/include/event2/listener.h \
	./usr/share/doc/libevent-dev/whatsnew-2.0.txt.gz \
	./usr/include/event2/buffer_compat.h \
	./usr/include/event2/rpc.h \
	./usr/include/event2/dns.h \
	./usr/include/event2/thread.h \
	./usr/share/doc/ \
	./usr/include/event2/rpc_compat.h\
"
FILES_libevent-openssl-2.0-5 = " \
	./usr/share/doc/libevent-openssl-2.0-5/changelog.Debian.gz \
	./usr/ \
	./ \
	./usr/share/doc/libevent-openssl-2.0-5/ \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5.1.7 \
	./usr/share/doc/libevent-openssl-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5 \
	./usr/share/ \
	./usr/share/doc/libevent-openssl-2.0-5/changelog.gz \
	./usr/share/doc/ \
	./usr/lib/\
"
FILES_libevent-core-2.0-5 = " \
	./usr/share/doc/libevent-core-2.0-5/changelog.gz \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/share/doc/libevent-core-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_core-2.0.so.5 \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/lib/arm-linux-gnueabihf/libevent_core-2.0.so.5.1.7 \
	./usr/share/ \
	./usr/share/doc/libevent-core-2.0-5/changelog.Debian.gz \
	./usr/share/doc/libevent-core-2.0-5/ \
	./usr/share/doc/\
"
FILES_libevent-extra-2.0-5 = " \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libevent-extra-2.0-5/changelog.gz \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/libevent_extra-2.0.so.5.1.7 \
	./usr/lib/arm-linux-gnueabihf/libevent_extra-2.0.so.5 \
	./usr/share/doc/libevent-extra-2.0-5/ \
	./usr/share/doc/libevent-extra-2.0-5/copyright \
	./usr/share/ \
	./usr/share/doc/libevent-extra-2.0-5/changelog.Debian.gz \
	./usr/share/doc/\
"
FILES_libevent-pthreads-2.0-5 = " \
	./usr/ \
	./ \
	./usr/lib/ \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5 \
	./usr/share/doc/libevent-pthreads-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5.1.7 \
	./usr/lib/arm-linux-gnueabihf/ \
	./usr/share/doc/libevent-pthreads-2.0-5/ \
	./usr/share/doc/libevent-pthreads-2.0-5/changelog.Debian.gz \
	./usr/share/ \
	./usr/share/doc/ \
	./usr/share/doc/libevent-pthreads-2.0-5/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
