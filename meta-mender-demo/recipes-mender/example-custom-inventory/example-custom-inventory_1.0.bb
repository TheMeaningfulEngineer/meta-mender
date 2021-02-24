FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "file://mender-inventory-demo"

FILES_${PN} += "                  \
    /data/mender                  \
    ${datadir}/mender/inventory   \
    "


do_install() {
    install -d ${D}/data/mender
    install -d ${D}${datadir}/mender/inventory
    install -m 755 ${WORKDIR}/mender-inventory-demo ${D}/data/mender/mender-inventory-demo
    ln -s -r ${D}/data/mender/mender-inventory-demo ${D}${datadir}/mender/inventory/mender-inventory-demo 
}

