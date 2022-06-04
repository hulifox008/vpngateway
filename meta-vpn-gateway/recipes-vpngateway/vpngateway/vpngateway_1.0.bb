SRC_URI="file://S50vpngateway"
LICENSE="CLOSED"

do_install() {

install -d -m 0755 ${D}/etc/rc5.d
install -m 0755 ${WORKDIR}/S50vpngateway ${D}/etc/rc5.d/

}
