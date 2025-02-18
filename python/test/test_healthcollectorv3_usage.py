# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.healthcollectorv3_usage import Healthcollectorv3Usage

class TestHealthcollectorv3Usage(unittest.TestCase):
    """Healthcollectorv3Usage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Healthcollectorv3Usage:
        """Test Healthcollectorv3Usage
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Healthcollectorv3Usage`
        """
        model = Healthcollectorv3Usage()
        if include_optional:
            return Healthcollectorv3Usage(
                label = '',
                name = '',
                nls_key = '',
                timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                value = 1.337
            )
        else:
            return Healthcollectorv3Usage(
        )
        """

    def testHealthcollectorv3Usage(self):
        """Test Healthcollectorv3Usage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
