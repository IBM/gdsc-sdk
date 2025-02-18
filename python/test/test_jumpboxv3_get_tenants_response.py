# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.jumpboxv3_get_tenants_response import Jumpboxv3GetTenantsResponse

class TestJumpboxv3GetTenantsResponse(unittest.TestCase):
    """Jumpboxv3GetTenantsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Jumpboxv3GetTenantsResponse:
        """Test Jumpboxv3GetTenantsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Jumpboxv3GetTenantsResponse`
        """
        model = Jumpboxv3GetTenantsResponse()
        if include_optional:
            return Jumpboxv3GetTenantsResponse(
                tenants = [
                    ibm_gdsc_sdk_software.models.jumpboxv3_tenant.jumpboxv3Tenant(
                        activation_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        external_id = '', 
                        external_metadata = {
                            'key' : ibm_gdsc_sdk_software.models.tenantuserv3_external_metadata.tenantuserv3ExternalMetadata(
                                add_ons = {
                                    'key' : ibm_gdsc_sdk_software.models.tenantuserv3_prometheus.tenantuserv3Prometheus(
                                        unit = '', 
                                        value = '', )
                                    }, 
                                crn = '', 
                                expiration_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                                instance_id = '', 
                                part_number = '', 
                                plan_id = '', 
                                service_id = '', 
                                subscription_id = '', )
                            }, 
                        is_inactive = True, 
                        is_ready = True, 
                        name = '', 
                        part_number = '', 
                        settings = {
                            'key' : ''
                            }, 
                        tenant_capabilities = {
                            'key' : True
                            }, 
                        tenant_id = '', 
                        uid = '', )
                    ]
            )
        else:
            return Jumpboxv3GetTenantsResponse(
        )
        """

    def testJumpboxv3GetTenantsResponse(self):
        """Test Jumpboxv3GetTenantsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
