# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.assetsv3_list_tags_response import Assetsv3ListTagsResponse

class TestAssetsv3ListTagsResponse(unittest.TestCase):
    """Assetsv3ListTagsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3ListTagsResponse:
        """Test Assetsv3ListTagsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3ListTagsResponse`
        """
        model = Assetsv3ListTagsResponse()
        if include_optional:
            return Assetsv3ListTagsResponse(
                assigned = [
                    ibm_gdsc_sdk_saas.models.assigned_tags.Assigned tags(
                        asset_id = [
                            ''
                            ], 
                        domain_id = '', 
                        grouper_count = '', 
                        tag_category = '', 
                        tag_id = '', 
                        tag_names = '', )
                    ],
                suggestions = [
                    ibm_gdsc_sdk_saas.models.suggested_tags.Suggested tags(
                        domain_id = '', 
                        tag_category = '', 
                        tag_id = '', 
                        tag_names = '', )
                    ],
                unassigned = [
                    ibm_gdsc_sdk_saas.models.unassigned_tags.Unassigned tags(
                        domain_id = '', 
                        tag_category = '', 
                        tag_id = '', 
                        tag_names = '', )
                    ]
            )
        else:
            return Assetsv3ListTagsResponse(
        )
        """

    def testAssetsv3ListTagsResponse(self):
        """Test Assetsv3ListTagsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
