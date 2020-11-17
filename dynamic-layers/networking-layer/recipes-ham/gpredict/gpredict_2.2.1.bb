SUMMARY = "GPredict"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=892f569a555ba9c07a568a7c0c4fa63a"

SRC_URI = "https://github.com/csete/gpredict/releases/download/v2.2.1/gpredict-2.2.1.tar.bz2 \
          "

SRC_URI[md5sum] = "38a7bda79989c5921d1c0bcc6c238382"
SRC_URI[sha256sum] = "e759c4bae0b17b202a7c0f8281ff016f819b502780d3e77b46fe8767e7498e43"

inherit autotools-brokensep gettext

DEPENDS = "glib-2.0-native libtool-native intltool-native curl glib-2.0 goocanvas"

CFLAGS_append = " -Wl,--allow-multiple-definition"
RRECOMMENDS_${PN} = "ntpdate"
