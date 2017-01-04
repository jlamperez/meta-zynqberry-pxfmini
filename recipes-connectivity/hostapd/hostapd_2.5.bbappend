
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += " file://hostapd.conf"

do_install_append () {
   install -m 0644 ${WORKDIR}/hostapd.conf ${D}${sysconfdir}
}
