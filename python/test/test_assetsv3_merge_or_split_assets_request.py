# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.assetsv3_merge_or_split_assets_request import Assetsv3MergeOrSplitAssetsRequest

class TestAssetsv3MergeOrSplitAssetsRequest(unittest.TestCase):
    """Assetsv3MergeOrSplitAssetsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3MergeOrSplitAssetsRequest:
        """Test Assetsv3MergeOrSplitAssetsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3MergeOrSplitAssetsRequest`
        """
        model = Assetsv3MergeOrSplitAssetsRequest()
        if include_optional:
            return Assetsv3MergeOrSplitAssetsRequest(
                action = '',
                destination_assets = [
                    ibm_gdsc_sdk_software.models.assetsv3_asset_for_merge_split.assetsv3AssetForMergeSplit(
                        asset_id = '', 
                        asset_name = '', 
                        dsdef_key = [
                            ''
                            ], )
                    ],
                source_asset = ibm_gdsc_sdk_software.models.assetsv3_asset_for_merge_split.assetsv3AssetForMergeSplit(
                    asset_id = '', 
                    asset_name = '', 
                    dsdef_key = [
                        ''
                        ], )
            )
        else:
            return Assetsv3MergeOrSplitAssetsRequest(
        )
        """

    def testAssetsv3MergeOrSplitAssetsRequest(self):
        """Test Assetsv3MergeOrSplitAssetsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
