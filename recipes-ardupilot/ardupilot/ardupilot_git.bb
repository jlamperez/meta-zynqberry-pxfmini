DESCRIPTION = "Ardupilot for Linux User mode flight controller program"
HOMEPAGE = "https://ardupilot.org"
#SECTION = ""
SRCNAME = "ARDUPILOT"

LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "python-future"

# ArduPilot github
SRCREV = "c3e6db3a177188653cca2c5d594e4b68c0038cbd"
SRC_URI = "git://github.com/jlamperez/ardupilot;protocol=https"

S = "${WORKDIR}/git"

ardupilot_prefix = "${base_prefix}/opt/ardupilot"
ardupilot_examples = "${ardupilot_prefix}/examples"

board = "zynqberry_pxfmini"

inherit waf


FILES_${PN}-examples += "\
    ${ardupilot_examples}/ \
    "
PACKAGES += "${PN}-examples"


CONFIGUREOPTS = " --prefix=${prefix} \
                  --board=${board} \
                "

do_configure_append() {
        ${S}/waf configure ${CONFIGUREOPTS}
}

do_compile_append() {
        ${S}/waf examples ${@get_waf_parallel_make(d)}

}

do_install_append () {
   install -d ${D}/${ardupilot_examples}
   install -m 0755 ${S}/build/${board}/examples/* ${D}/${ardupilot_examples}
}

