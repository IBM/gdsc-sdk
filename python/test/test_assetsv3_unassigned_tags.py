# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.assetsv3_unassigned_tags import Assetsv3UnassignedTags

class TestAssetsv3UnassignedTags(unittest.TestCase):
    """Assetsv3UnassignedTags unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3UnassignedTags:
        """Test Assetsv3UnassignedTags
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3UnassignedTags`
        """
        model = Assetsv3UnassignedTags()
        if include_optional:
            return Assetsv3UnassignedTags(
                domain_id = '',
                tag_category = '',
                tag_id = '',
                tag_names = ''
            )
        else:
            return Assetsv3UnassignedTags(
        )
        """

    def testAssetsv3UnassignedTags(self):
        """Test Assetsv3UnassignedTags"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
