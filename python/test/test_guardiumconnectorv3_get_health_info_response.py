# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_health_info_response import Guardiumconnectorv3GetHealthInfoResponse

class TestGuardiumconnectorv3GetHealthInfoResponse(unittest.TestCase):
    """Guardiumconnectorv3GetHealthInfoResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3GetHealthInfoResponse:
        """Test Guardiumconnectorv3GetHealthInfoResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3GetHealthInfoResponse`
        """
        model = Guardiumconnectorv3GetHealthInfoResponse()
        if include_optional:
            return Guardiumconnectorv3GetHealthInfoResponse(
                nodes = [
                    ibm_gdsc_sdk_saas.models.guardiumconnectorv3_managed_unit_object.guardiumconnectorv3ManagedUnitObject(
                        agg_health_status = 56, 
                        connectivity = 56, 
                        details = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_mu_details_obj.guardiumconnectorv3MUDetailsObj(
                            agg_health_view_list = [
                                ibm_gdsc_sdk_saas.models.guardiumconnectorv3_aggregation_view_list_object.guardiumconnectorv3AggregationViewListObject(
                                    agg_action_error = '', 
                                    agg_action_health_status = 56, 
                                    agg_type = '', 
                                    error = 56, 
                                    unit = '', )
                                ], 
                            connectivity_details = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_general_details_object.guardiumconnectorv3GeneralDetailsObject(
                                err_messages = '', ), 
                            general_err_messages = [
                                ''
                                ], 
                            utilization_scheme = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_utilization_parameter_object.guardiumconnectorv3UtilizationParameterObject(
                                analyzer_queue_value = 56, 
                                detailed_err_message = '', 
                                error = 56, 
                                free_buff_space_value = 56, 
                                logger_queue_value = 56, 
                                mysql_disk_usage_value = 56, 
                                no_of_restarts_value = 56, 
                                num_of_exceptions_value = 56, 
                                num_of_flat_log_requests_value = 56, 
                                num_of_policy_violations_value = 56, 
                                num_of_requests_value = 56, 
                                prec_mysql_mem_value = 56, 
                                snif_memory_value = 56, 
                                sys_var_disk_usage_value = 56, 
                                system_cpu_load_value = 56, ), ), 
                        exports_to = [
                            ''
                            ], 
                        id = 56, 
                        imports_from = [
                            ''
                            ], 
                        mus_staps_health_status = 56, 
                        os_version = '', 
                        patch = '', 
                        status = 56, 
                        type = '', 
                        unit_hostname = '', 
                        unit_ip = '', 
                        unit_utilization_health_status = 56, 
                        version = '', )
                    ],
                staps = [
                    ibm_gdsc_sdk_saas.models.guardiumconnectorv3_stap_object.guardiumconnectorv3StapObject(
                        collector_hostname = '', 
                        connectivity = 56, 
                        details = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_stap_details_object.guardiumconnectorv3StapDetailsObject(
                            connectivity_details = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_general_details_object.guardiumconnectorv3GeneralDetailsObject(
                                err_messages = '', ), 
                            general_err_messages = [
                                ''
                                ], 
                            ktap_details = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_general_details_object.guardiumconnectorv3GeneralDetailsObject(
                                err_messages = '', ), 
                            stap_liveliness_info = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_stap_live_info_object.guardiumconnectorv3StapLiveInfoObject(
                                has_event = True, 
                                health_status = 56, 
                                liveliness_state = '', 
                                stap = '', ), 
                            stap_ver_info_list = [
                                ibm_gdsc_sdk_saas.models.guardiumconnectorv3_inspection_engine_details.guardiumconnectorv3InspectionEngineDetails(
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
                        ie_list = [
                            ibm_gdsc_sdk_saas.models.guardiumconnectorv3_inspection_engine_object.guardiumconnectorv3InspectionEngineObject(
                                ie_status = 56, 
                                inspection_engine = '', )
                            ], 
                        inspectionengine = 56, 
                        ktap = 56, 
                        name = '', 
                        os_type = '', 
                        revision = '', 
                        stap_ip = '', 
                        status = 56, 
                        traffic = 56, )
                    ],
                status = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_status_response_base.guardiumconnectorv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Guardiumconnectorv3GetHealthInfoResponse(
        )
        """

    def testGuardiumconnectorv3GetHealthInfoResponse(self):
        """Test Guardiumconnectorv3GetHealthInfoResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
