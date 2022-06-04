FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:prepend = " file://defconfig "

do_configure:prepend() {
    cp ${WORKDIR}/defconfig ${B}/.config
}

