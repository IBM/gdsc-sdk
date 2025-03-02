# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.get_sso_details200_response import GetSSODetails200Response

class TestGetSSODetails200Response(unittest.TestCase):
    """GetSSODetails200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetSSODetails200Response:
        """Test GetSSODetails200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetSSODetails200Response`
        """
        model = GetSSODetails200Response()
        if include_optional:
            return GetSSODetails200Response(
                authorization_endpoint = 'https://polar-appsync-prod.auth.us-east-1.amazoncognito.com/authorize?response_type=token&identity_provider=XXXXX&client_id=XXXX&redirect_uri=https://dashboard.polar-security.com/'
            )
        else:
            return GetSSODetails200Response(
        )
        """

    def testGetSSODetails200Response(self):
        """Test GetSSODetails200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
