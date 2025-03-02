# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.jumpboxv3_search_users_response import Jumpboxv3SearchUsersResponse

class TestJumpboxv3SearchUsersResponse(unittest.TestCase):
    """Jumpboxv3SearchUsersResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Jumpboxv3SearchUsersResponse:
        """Test Jumpboxv3SearchUsersResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Jumpboxv3SearchUsersResponse`
        """
        model = Jumpboxv3SearchUsersResponse()
        if include_optional:
            return Jumpboxv3SearchUsersResponse(
                message = '',
                users = [
                    ibm_gdsc_sdk_saas.models.jumpboxv3_directory_entry.jumpboxv3DirectoryEntry(
                        directory_id = '', 
                        display_name = '', 
                        distinguished_name = '', 
                        metadata = {
                            'key' : ''
                            }, )
                    ]
            )
        else:
            return Jumpboxv3SearchUsersResponse(
        )
        """

    def testJumpboxv3SearchUsersResponse(self):
        """Test Jumpboxv3SearchUsersResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
