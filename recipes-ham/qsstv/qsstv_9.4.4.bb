SUMMARY = "SSTV"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=57baf3d8c07efa88a6a07754076c97d7"

SRC_URI = "http://users.telenet.be/on4qz/qsstv/downloads/qsstv_9.4.4.tar.gz \
          "

SRC_URI[md5sum] = "43207adb835ffe1dec8b267ee4823402"
SRC_URI[sha256sum] = "f1a3c2f5e97b2efc36893b36dda9a0852d7c51129436e586580c05e2b5e93039"

S = "${WORKDIR}/qsstv_9.4.4"

inherit qmake5

DEPENDS = "openjpeg alsa-lib pulseaudio hamlib fftw v4l-utils qtbase"
