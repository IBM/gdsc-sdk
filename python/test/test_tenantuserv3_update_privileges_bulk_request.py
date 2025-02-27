# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.tenantuserv3_update_privileges_bulk_request import Tenantuserv3UpdatePrivilegesBulkRequest

class TestTenantuserv3UpdatePrivilegesBulkRequest(unittest.TestCase):
    """Tenantuserv3UpdatePrivilegesBulkRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Tenantuserv3UpdatePrivilegesBulkRequest:
        """Test Tenantuserv3UpdatePrivilegesBulkRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Tenantuserv3UpdatePrivilegesBulkRequest`
        """
        model = Tenantuserv3UpdatePrivilegesBulkRequest()
        if include_optional:
            return Tenantuserv3UpdatePrivilegesBulkRequest(
                privilege = [
                    ibm_gdsc_sdk_saas.models.tenantuserv3_basic_privilege.tenantuserv3BasicPrivilege(
                        privilege_id = '', 
                        roles = [
                            ''
                            ], 
                        type = '', )
                    ],
                role_id = ''
            )
        else:
            return Tenantuserv3UpdatePrivilegesBulkRequest(
        )
        """

    def testTenantuserv3UpdatePrivilegesBulkRequest(self):
        """Test Tenantuserv3UpdatePrivilegesBulkRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
