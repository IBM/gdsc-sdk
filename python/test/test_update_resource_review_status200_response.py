# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.update_resource_review_status200_response import UpdateResourceReviewStatus200Response

class TestUpdateResourceReviewStatus200Response(unittest.TestCase):
    """UpdateResourceReviewStatus200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateResourceReviewStatus200Response:
        """Test UpdateResourceReviewStatus200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateResourceReviewStatus200Response`
        """
        model = UpdateResourceReviewStatus200Response()
        if include_optional:
            return UpdateResourceReviewStatus200Response(
                is_reviewed = True
            )
        else:
            return UpdateResourceReviewStatus200Response(
        )
        """

    def testUpdateResourceReviewStatus200Response(self):
        """Test UpdateResourceReviewStatus200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
