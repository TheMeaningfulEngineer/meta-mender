require mender-demo-minimal-non-ro.bb

IMAGE_FEATURES_append = " read-only-rootfs"
EXTRA_IMAGECMD_ext4_append = "${@bb.utils.contains('IMAGE_FEATURES', 'read-only-rootfs', ' -O ^64bit -O ^has_journal', '', d)}"
