# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsv3_delete_category_response import Reportsv3DeleteCategoryResponse

class TestReportsv3DeleteCategoryResponse(unittest.TestCase):
    """Reportsv3DeleteCategoryResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3DeleteCategoryResponse:
        """Test Reportsv3DeleteCategoryResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3DeleteCategoryResponse`
        """
        model = Reportsv3DeleteCategoryResponse()
        if include_optional:
            return Reportsv3DeleteCategoryResponse(
                message = ''
            )
        else:
            return Reportsv3DeleteCategoryResponse(
        )
        """

    def testReportsv3DeleteCategoryResponse(self):
        """Test Reportsv3DeleteCategoryResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
