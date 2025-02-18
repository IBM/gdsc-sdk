# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501
import os
import sys
from codecs import open

from setuptools import setup, find_packages  # noqa: H301

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools
NAME = "ibm-gdsc-sdk-software"
VERSION = "3.6.1"
PYTHON_REQUIRES = ">=3.7"
REQUIRES = [
    "urllib3 >= 1.25.3, < 2.1.0",
    "python-dateutil",
    "pydantic >= 2",
    "typing-extensions >= 4.7.1",
]
with open("README.md", "r", "utf-8") as f:
    lines = []
    counter = 0
    for line in f:
        if counter >= 82:
            break
        lines.append(line)  # Or keep the original line without stripping
        counter += 1
    readme=''.join(lines)
setup(
    name=NAME,
    version=VERSION,
    description="IBM Guardium Data Security Center",
    author="IBM GDSC Team",
    author_email="c3cvp8ch@ca.ibm.com",
    url="",
    keywords=["OpenAPI", "IBM Guardium Data Security Center"],
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    long_description_content_type='text/markdown',
    long_description=readme,
    package_data={"ibm_gdsc_sdk_software": ["py.typed"]},
)
