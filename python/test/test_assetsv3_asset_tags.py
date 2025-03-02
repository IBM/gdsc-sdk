# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.assetsv3_asset_tags import Assetsv3AssetTags

class TestAssetsv3AssetTags(unittest.TestCase):
    """Assetsv3AssetTags unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3AssetTags:
        """Test Assetsv3AssetTags
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3AssetTags`
        """
        model = Assetsv3AssetTags()
        if include_optional:
            return Assetsv3AssetTags(
                asset_id = '',
                concept = '',
                concept_id = '',
                domain_id = '',
                domain_name = ''
            )
        else:
            return Assetsv3AssetTags(
        )
        """

    def testAssetsv3AssetTags(self):
        """Test Assetsv3AssetTags"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
