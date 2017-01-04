FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
            file://udhcpd.conf \
           "

do_install_append () {
   install -m 0644 ${WORKDIR}/udhcpd.conf ${D}${sysconfdir}
}

