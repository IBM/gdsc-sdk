# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_delete_edge_tenant_request_apphost import Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost

class TestResourcecontrollerk8v3DeleteEdgeTenantRequestApphost(unittest.TestCase):
    """Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost:
        """Test Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost`
        """
        model = Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost()
        if include_optional:
            return Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost(
                tenant_id = ''
            )
        else:
            return Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost(
        )
        """

    def testResourcecontrollerk8v3DeleteEdgeTenantRequestApphost(self):
        """Test Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
