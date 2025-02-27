# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsv3_contribution_pointers_info_object import Reportsv3ContributionPointersInfoObject

class TestReportsv3ContributionPointersInfoObject(unittest.TestCase):
    """Reportsv3ContributionPointersInfoObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3ContributionPointersInfoObject:
        """Test Reportsv3ContributionPointersInfoObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3ContributionPointersInfoObject`
        """
        model = Reportsv3ContributionPointersInfoObject()
        if include_optional:
            return Reportsv3ContributionPointersInfoObject(
                column = '',
                operator = '',
                value = ''
            )
        else:
            return Reportsv3ContributionPointersInfoObject(
        )
        """

    def testReportsv3ContributionPointersInfoObject(self):
        """Test Reportsv3ContributionPointersInfoObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
