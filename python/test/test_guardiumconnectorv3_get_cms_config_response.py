# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_cms_config_response import Guardiumconnectorv3GetCMsConfigResponse

class TestGuardiumconnectorv3GetCMsConfigResponse(unittest.TestCase):
    """Guardiumconnectorv3GetCMsConfigResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3GetCMsConfigResponse:
        """Test Guardiumconnectorv3GetCMsConfigResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3GetCMsConfigResponse`
        """
        model = Guardiumconnectorv3GetCMsConfigResponse()
        if include_optional:
            return Guardiumconnectorv3GetCMsConfigResponse(
                cms = [
                    ibm_gdsc_sdk_saas.models.guardiumconnectorv3_cm.guardiumconnectorv3CM(
                        attributes = [
                            ibm_gdsc_sdk_saas.models.guardiumconnectorv3_attribute.guardiumconnectorv3Attribute(
                                name = '', 
                                value = '', )
                            ], 
                        central_manager_id = '', 
                        cm_date_param_available = '', 
                        datamart_end_date_aggregator = '', 
                        datamart_start_date_aggregator = '', 
                        datamart_start_date_collector = '', 
                        max_supported_dm_version = '', 
                        mode = '', 
                        name = '', 
                        port = '', 
                        status = '', 
                        support_custom_dm_type_setup = '', )
                    ],
                status = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_status_response_base.guardiumconnectorv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Guardiumconnectorv3GetCMsConfigResponse(
        )
        """

    def testGuardiumconnectorv3GetCMsConfigResponse(self):
        """Test Guardiumconnectorv3GetCMsConfigResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
