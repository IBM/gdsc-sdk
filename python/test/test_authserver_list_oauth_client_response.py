# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.authserver_list_oauth_client_response import AuthserverListOauthClientResponse

class TestAuthserverListOauthClientResponse(unittest.TestCase):
    """AuthserverListOauthClientResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AuthserverListOauthClientResponse:
        """Test AuthserverListOauthClientResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AuthserverListOauthClientResponse`
        """
        model = AuthserverListOauthClientResponse()
        if include_optional:
            return AuthserverListOauthClientResponse(
                oauth_clients = [
                    ibm_gdsc_sdk_software.models.authserver_oauth_client.authserverOauthClient(
                        client_id = '', 
                        client_secret = '', 
                        description = '', 
                        name = '', )
                    ]
            )
        else:
            return AuthserverListOauthClientResponse(
        )
        """

    def testAuthserverListOauthClientResponse(self):
        """Test AuthserverListOauthClientResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
