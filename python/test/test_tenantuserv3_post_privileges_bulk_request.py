# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.tenantuserv3_post_privileges_bulk_request import Tenantuserv3PostPrivilegesBulkRequest

class TestTenantuserv3PostPrivilegesBulkRequest(unittest.TestCase):
    """Tenantuserv3PostPrivilegesBulkRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Tenantuserv3PostPrivilegesBulkRequest:
        """Test Tenantuserv3PostPrivilegesBulkRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Tenantuserv3PostPrivilegesBulkRequest`
        """
        model = Tenantuserv3PostPrivilegesBulkRequest()
        if include_optional:
            return Tenantuserv3PostPrivilegesBulkRequest(
                privileges = [
                    ibm_gdsc_sdk_software.models.tenantuserv3_privilege.tenantuserv3Privilege(
                        author_id = '', 
                        immutable_roles = [
                            ''
                            ], 
                        manage_roles = [
                            ''
                            ], 
                        name = '', 
                        nls_id = '', 
                        privilege_id = '', 
                        removable = True, 
                        roles = [
                            ''
                            ], 
                        type = '', )
                    ]
            )
        else:
            return Tenantuserv3PostPrivilegesBulkRequest(
        )
        """

    def testTenantuserv3PostPrivilegesBulkRequest(self):
        """Test Tenantuserv3PostPrivilegesBulkRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
