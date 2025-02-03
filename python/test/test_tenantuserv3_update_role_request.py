# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.tenantuserv3_update_role_request import Tenantuserv3UpdateRoleRequest

class TestTenantuserv3UpdateRoleRequest(unittest.TestCase):
    """Tenantuserv3UpdateRoleRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Tenantuserv3UpdateRoleRequest:
        """Test Tenantuserv3UpdateRoleRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Tenantuserv3UpdateRoleRequest`
        """
        model = Tenantuserv3UpdateRoleRequest()
        if include_optional:
            return Tenantuserv3UpdateRoleRequest(
                description = '',
                icp_roles = [
                    ''
                    ],
                name = '',
                removable = True,
                role_id = ''
            )
        else:
            return Tenantuserv3UpdateRoleRequest(
        )
        """

    def testTenantuserv3UpdateRoleRequest(self):
        """Test Tenantuserv3UpdateRoleRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
