SRC_URI += "file://defconfig"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

LINUX_KERNEL_TYPE = "preempt-rt"
