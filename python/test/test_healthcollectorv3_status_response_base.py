# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.healthcollectorv3_status_response_base import Healthcollectorv3StatusResponseBase

class TestHealthcollectorv3StatusResponseBase(unittest.TestCase):
    """Healthcollectorv3StatusResponseBase unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Healthcollectorv3StatusResponseBase:
        """Test Healthcollectorv3StatusResponseBase
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Healthcollectorv3StatusResponseBase`
        """
        model = Healthcollectorv3StatusResponseBase()
        if include_optional:
            return Healthcollectorv3StatusResponseBase(
                message = '',
                status = ''
            )
        else:
            return Healthcollectorv3StatusResponseBase(
        )
        """

    def testHealthcollectorv3StatusResponseBase(self):
        """Test Healthcollectorv3StatusResponseBase"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
