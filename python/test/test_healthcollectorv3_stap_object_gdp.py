# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.healthcollectorv3_stap_object_gdp import Healthcollectorv3StapObjectGdp

class TestHealthcollectorv3StapObjectGdp(unittest.TestCase):
    """Healthcollectorv3StapObjectGdp unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Healthcollectorv3StapObjectGdp:
        """Test Healthcollectorv3StapObjectGdp
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Healthcollectorv3StapObjectGdp`
        """
        model = Healthcollectorv3StapObjectGdp()
        if include_optional:
            return Healthcollectorv3StapObjectGdp(
                children = [
                    ibm_gdsc_sdk_saas.models.healthcollectorv3_inspection_engine_object_gdp.healthcollectorv3InspectionEngineObjectGdp(
                        ie_status = 56, 
                        inspection_engine = '', )
                    ],
                collector_host_name = '',
                connectivity = 56,
                details = ibm_gdsc_sdk_saas.models.healthcollectorv3_stap_details_object_gdp.healthcollectorv3StapDetailsObjectGdp(
                    connectivity_details = ibm_gdsc_sdk_saas.models.healthcollectorv3_general_details_object.healthcollectorv3GeneralDetailsObject(
                        err_messages = '', ), 
                    general_err_messages = [
                        ''
                        ], 
                    ktap_details = ibm_gdsc_sdk_saas.models.healthcollectorv3_general_details_object.healthcollectorv3GeneralDetailsObject(
                        err_messages = '', ), 
                    stap_liveliness_info = ibm_gdsc_sdk_saas.models.healthcollectorv3_stap_live_info_object.healthcollectorv3StapLiveInfoObject(
                        has_event = True, 
                        health_status = 56, 
                        liveliness_state = '', 
                        stap = '', ), 
                    stap_ver_info_list = [
                        ibm_gdsc_sdk_saas.models.healthcollectorv3_inspection_engine_details_gdp.healthcollectorv3InspectionEngineDetailsGdp(
                            ie = '', 
                            port = '', 
                            protocol = '', 
                            stap = '', 
                            verification_health = 56, 
                            verification_result = '', 
                            verification_state = '', 
                            version = '', )
                        ], 
                    traffic_details = , ),
                ie_status = 56,
                inspection_engine = '',
                ktap = 56,
                name = '',
                os_type = '',
                revision = '',
                stap_ip = '',
                status = 56,
                traffic = 56
            )
        else:
            return Healthcollectorv3StapObjectGdp(
        )
        """

    def testHealthcollectorv3StapObjectGdp(self):
        """Test Healthcollectorv3StapObjectGdp"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
