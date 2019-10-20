SUMMARY = "SDR"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=76c8dd204c0791e9a30c30d0406b75da"

SRCREV = "5c5d9503337c6d1c34b496dec6f908aab9478b0f"
SRC_URI = "git://github.com/pothosware/SoapyRTLSDR.git;protocol=git;branch=master \
          "

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = "rtlsdr soapysdr"
RDEPENDS_${PN} = "rtlsdr soapysdr"
FILES_${PN} += "${libdir}/*"
