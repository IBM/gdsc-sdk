# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_status_attribute import Guardiumconnectorv3StatusAttribute

class TestGuardiumconnectorv3StatusAttribute(unittest.TestCase):
    """Guardiumconnectorv3StatusAttribute unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3StatusAttribute:
        """Test Guardiumconnectorv3StatusAttribute
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3StatusAttribute`
        """
        model = Guardiumconnectorv3StatusAttribute()
        if include_optional:
            return Guardiumconnectorv3StatusAttribute(
                key = '',
                value = ''
            )
        else:
            return Guardiumconnectorv3StatusAttribute(
        )
        """

    def testGuardiumconnectorv3StatusAttribute(self):
        """Test Guardiumconnectorv3StatusAttribute"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
