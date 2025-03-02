# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.assetsv3_fetch_assets_for_merge_split_response import Assetsv3FetchAssetsForMergeSplitResponse

class TestAssetsv3FetchAssetsForMergeSplitResponse(unittest.TestCase):
    """Assetsv3FetchAssetsForMergeSplitResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3FetchAssetsForMergeSplitResponse:
        """Test Assetsv3FetchAssetsForMergeSplitResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3FetchAssetsForMergeSplitResponse`
        """
        model = Assetsv3FetchAssetsForMergeSplitResponse()
        if include_optional:
            return Assetsv3FetchAssetsForMergeSplitResponse(
                assets = [
                    ibm_gdsc_sdk_saas.models.asset_details_to_return_in_merge_and_split_response.Asset details to return in Merge and Split Response(
                        asset_id = 56, 
                        asset_name = '', 
                        database_name = '', 
                        dsdef_key = '', 
                        host_name = '', 
                        host_port = '', 
                        ip_address = '', 
                        ip_port = '', 
                        is_mergeable = True, 
                        is_splittable = True, )
                    ],
                assets_count = ''
            )
        else:
            return Assetsv3FetchAssetsForMergeSplitResponse(
        )
        """

    def testAssetsv3FetchAssetsForMergeSplitResponse(self):
        """Test Assetsv3FetchAssetsForMergeSplitResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
