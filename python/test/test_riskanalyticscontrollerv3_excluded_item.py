# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_excluded_item import Riskanalyticscontrollerv3ExcludedItem

class TestRiskanalyticscontrollerv3ExcludedItem(unittest.TestCase):
    """Riskanalyticscontrollerv3ExcludedItem unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Riskanalyticscontrollerv3ExcludedItem:
        """Test Riskanalyticscontrollerv3ExcludedItem
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Riskanalyticscontrollerv3ExcludedItem`
        """
        model = Riskanalyticscontrollerv3ExcludedItem()
        if include_optional:
            return Riskanalyticscontrollerv3ExcludedItem(
                excluded_item_type = 'UNDEFINED_EXCLUDED_ITEM_TYPE',
                key = ''
            )
        else:
            return Riskanalyticscontrollerv3ExcludedItem(
        )
        """

    def testRiskanalyticscontrollerv3ExcludedItem(self):
        """Test Riskanalyticscontrollerv3ExcludedItem"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
