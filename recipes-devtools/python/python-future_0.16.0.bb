DESCRIPTION = "future is the missing compatibility layer between Python 2 and Python 3"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=5ef8cd3d40c99f9ec13c41e558f23022"
HOMEPAGE = "https://pypi.python.org/pypi/future"
DEPENDS = "python"

SRC_URI = "https://pypi.python.org/packages/00/2b/8d082ddfed935f3608cc61140df6dcbf0edea1bc3ab52fb6c29ae3e81e85/future-${PV}.tar.gz"
SRC_URI[md5sum] = "3e8e88a2bda48d54b1da7634d04760d7"
SRC_URI[sha256sum] = "e39ced1ab767b5936646cedba8bcce582398233d6a627067d4c6a454c90cfedb"



S = "${WORKDIR}/future-${PV}"

inherit setuptools
