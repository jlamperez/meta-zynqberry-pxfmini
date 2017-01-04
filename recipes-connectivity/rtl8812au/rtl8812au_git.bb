SUMMARY = "Realtek 802.11n WLAN Adapter Linux driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = " \
        git://github.com/jlamperez/rtl8812AU_8821AU_linux;protocols=https \
        file://COPYING \
        file://0001-Use-modules_install-as-wanted-by-yocto.patch"

SRCREV = "dadb2cbde23c7c3515cca7a3fa1cf7af3a683001"

S = "${WORKDIR}/git"

export KSRC = "${STAGING_KERNEL_DIR}"        
