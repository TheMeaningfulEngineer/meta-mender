inherit core-image

IMAGE_FEATURES += "ssh-server-openssh allow-empty-password debug-tweaks"
IMAGE_INSTALL_append = " example-custom-inventory"
