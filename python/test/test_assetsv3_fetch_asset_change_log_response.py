# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.assetsv3_fetch_asset_change_log_response import Assetsv3FetchAssetChangeLogResponse

class TestAssetsv3FetchAssetChangeLogResponse(unittest.TestCase):
    """Assetsv3FetchAssetChangeLogResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3FetchAssetChangeLogResponse:
        """Test Assetsv3FetchAssetChangeLogResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3FetchAssetChangeLogResponse`
        """
        model = Assetsv3FetchAssetChangeLogResponse()
        if include_optional:
            return Assetsv3FetchAssetChangeLogResponse(
                asset_change_log = [
                    ibm_gdsc_sdk_software.models.asset_change_log.Asset Change Log(
                        action_taken = '', 
                        activity = '', 
                        after = [
                            ibm_gdsc_sdk_software.models.assetsv3_before_after.assetsv3BeforeAfter(
                                asset_id = '', 
                                asset_name = '', 
                                rule_id = '', 
                                rule_name = '', 
                                tag_category = '', 
                                tag_name = '', )
                            ], 
                        before = [
                            ibm_gdsc_sdk_software.models.assetsv3_before_after.assetsv3BeforeAfter(
                                asset_id = '', 
                                asset_name = '', 
                                rule_id = '', 
                                rule_name = '', 
                                tag_category = '', 
                                tag_name = '', )
                            ], 
                        date = '', 
                        performed_by = '', 
                        rule = [
                            ibm_gdsc_sdk_software.models.rule_logged.Rule logged(
                                rule_id = '', 
                                rule_name = '', )
                            ], )
                    ],
                total_count = ''
            )
        else:
            return Assetsv3FetchAssetChangeLogResponse(
        )
        """

    def testAssetsv3FetchAssetChangeLogResponse(self):
        """Test Assetsv3FetchAssetChangeLogResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
