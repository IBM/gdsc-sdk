# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.assetsv3_asset_classification import Assetsv3AssetClassification

class TestAssetsv3AssetClassification(unittest.TestCase):
    """Assetsv3AssetClassification unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3AssetClassification:
        """Test Assetsv3AssetClassification
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3AssetClassification`
        """
        model = Assetsv3AssetClassification()
        if include_optional:
            return Assetsv3AssetClassification(
                classification = [
                    ibm_gdsc_sdk_saas.models.asset_classification___assets_classification_widget_data.AssetClassification - Assets classification widget data(
                        availability = '', 
                        rule_name = '', 
                        sensitive_data_count = '', )
                    ],
                last_activity = '',
                total_count = 56
            )
        else:
            return Assetsv3AssetClassification(
        )
        """

    def testAssetsv3AssetClassification(self):
        """Test Assetsv3AssetClassification"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
