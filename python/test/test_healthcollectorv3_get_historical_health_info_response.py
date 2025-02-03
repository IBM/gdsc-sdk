# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.healthcollectorv3_get_historical_health_info_response import Healthcollectorv3GetHistoricalHealthInfoResponse

class TestHealthcollectorv3GetHistoricalHealthInfoResponse(unittest.TestCase):
    """Healthcollectorv3GetHistoricalHealthInfoResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Healthcollectorv3GetHistoricalHealthInfoResponse:
        """Test Healthcollectorv3GetHistoricalHealthInfoResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Healthcollectorv3GetHistoricalHealthInfoResponse`
        """
        model = Healthcollectorv3GetHistoricalHealthInfoResponse()
        if include_optional:
            return Healthcollectorv3GetHistoricalHealthInfoResponse(
                historical_data_nodes = [
                    ibm_gdsc_sdk_software.models.healthcollectorv3_historical_data_object.healthcollectorv3HistoricalDataObject(
                        cm_id = '', 
                        inspection_engine_counts = [
                            ibm_gdsc_sdk_software.models.healthcollectorv3_count_object.healthcollectorv3CountObject(
                                count = '', 
                                timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), )
                            ], 
                        nodes = [
                            ibm_gdsc_sdk_software.models.healthcollectorv3_stap_information_object.healthcollectorv3StapInformationObject(
                                inspection_engine_details = [
                                    ibm_gdsc_sdk_software.models.healthcollectorv3_inspection_engine_present_details.healthcollectorv3InspectionEnginePresentDetails(
                                        inspection_engine = '', 
                                        present_at_end = True, 
                                        present_at_start = True, 
                                        protocol = '', 
                                        version = '', )
                                    ], 
                                inspection_engine_details_change = 56, 
                                present_at_end = True, 
                                present_at_start = True, 
                                stap = ibm_gdsc_sdk_software.models.healthcollectorv3_stap_object.healthcollectorv3StapObject(
                                    collector_hostname = '', 
                                    connectivity = 56, 
                                    details = ibm_gdsc_sdk_software.models.healthcollectorv3_stap_details_object.healthcollectorv3StapDetailsObject(
                                        connectivity_details = ibm_gdsc_sdk_software.models.healthcollectorv3_general_details_object.healthcollectorv3GeneralDetailsObject(
                                            err_messages = '', ), 
                                        general_err_messages = [
                                            ''
                                            ], 
                                        ktap_details = ibm_gdsc_sdk_software.models.healthcollectorv3_general_details_object.healthcollectorv3GeneralDetailsObject(
                                            err_messages = '', ), 
                                        stap_liveliness_information = ibm_gdsc_sdk_software.models.healthcollectorv3_stap_live_info_object.healthcollectorv3StapLiveInfoObject(
                                            has_event = True, 
                                            health_status = 56, 
                                            liveliness_state = '', ), 
                                        traffic_details = , ), 
                                    ie_count = 56, 
                                    ie_details = [
                                        ibm_gdsc_sdk_software.models.healthcollectorv3_inspection_engine_details.healthcollectorv3InspectionEngineDetails(
                                            ie = '', 
                                            port = '', 
                                            protocol = '', 
                                            status = 56, 
                                            verification_result = '', 
                                            verification_state = '', 
                                            version = '', )
                                        ], 
                                    ktap = 56, 
                                    name = '', 
                                    os_type = '', 
                                    overall_ie_status = 56, 
                                    revision = '', 
                                    stap_ip = '', 
                                    status = 56, 
                                    traffic = 56, ), )
                            ], 
                        stap_counts = [
                            ibm_gdsc_sdk_software.models.healthcollectorv3_count_object.healthcollectorv3CountObject(
                                count = '', 
                                timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), )
                            ], 
                        staps_added = 56, 
                        staps_removed = 56, 
                        staps_with_ie_changes = 56, )
                    ],
                status = ibm_gdsc_sdk_software.models.healthcollectorv3_status_response_base.healthcollectorv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Healthcollectorv3GetHistoricalHealthInfoResponse(
        )
        """

    def testHealthcollectorv3GetHistoricalHealthInfoResponse(self):
        """Test Healthcollectorv3GetHistoricalHealthInfoResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
