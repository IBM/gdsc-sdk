# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.assetsv3_asset_open_risk_event_list import Assetsv3AssetOpenRiskEventList

class TestAssetsv3AssetOpenRiskEventList(unittest.TestCase):
    """Assetsv3AssetOpenRiskEventList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3AssetOpenRiskEventList:
        """Test Assetsv3AssetOpenRiskEventList
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3AssetOpenRiskEventList`
        """
        model = Assetsv3AssetOpenRiskEventList()
        if include_optional:
            return Assetsv3AssetOpenRiskEventList(
                event_type = '',
                expandable = True,
                value = [
                    ibm_gdsc_sdk_saas.models.asset_open_risk_event___assets_open_risk_events_widget_data.AssetOpenRiskEvent - Assets Open risk events widget data(
                        criticallity = '', 
                        id = '', 
                        name = '', 
                        risk_id = '', 
                        type = '', )
                    ]
            )
        else:
            return Assetsv3AssetOpenRiskEventList(
        )
        """

    def testAssetsv3AssetOpenRiskEventList(self):
        """Test Assetsv3AssetOpenRiskEventList"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
