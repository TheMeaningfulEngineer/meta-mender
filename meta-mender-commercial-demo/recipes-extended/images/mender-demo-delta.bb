require recipes-extended/images/mender-demo-minimal-rw.bb

IMAGE_INSTALL_append = " mender-binary-delta"
LICENSE_FLAGS_WHITELIST_append = " commercial_mender-binary-delta"
FILESEXTRAPATHS_prepend_pn-mender-binary-delta := "${HOME}/mender-binary-delta-1.2.0/:"

IMAGE_FEATURES_append = " read-only-rootfs"
EXTRA_IMAGECMD_ext4_append = "${@bb.utils.contains('IMAGE_FEATURES', 'read-only-rootfs', ' -O ^64bit -O ^has_journal', '', d)}"
