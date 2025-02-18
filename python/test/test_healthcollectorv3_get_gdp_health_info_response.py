# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.healthcollectorv3_get_gdp_health_info_response import Healthcollectorv3GetGDPHealthInfoResponse

class TestHealthcollectorv3GetGDPHealthInfoResponse(unittest.TestCase):
    """Healthcollectorv3GetGDPHealthInfoResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Healthcollectorv3GetGDPHealthInfoResponse:
        """Test Healthcollectorv3GetGDPHealthInfoResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Healthcollectorv3GetGDPHealthInfoResponse`
        """
        model = Healthcollectorv3GetGDPHealthInfoResponse()
        if include_optional:
            return Healthcollectorv3GetGDPHealthInfoResponse(
                all_nodes = [
                    ibm_gdsc_sdk_software.models.healthcollectorv3_cm_node_object.healthcollectorv3CMNodeObject(
                        cm = '', 
                        last_health_info_collected_timestamp = '', 
                        nodes = [
                            ibm_gdsc_sdk_software.models.healthcollectorv3_managed_unit_object.healthcollectorv3ManagedUnitObject(
                                aggregation_health_status = 56, 
                                connectivity = 56, 
                                details = ibm_gdsc_sdk_software.models.healthcollectorv3_mu_details_obj.healthcollectorv3MUDetailsObj(
                                    aggregation_details_list = [
                                        ibm_gdsc_sdk_software.models.healthcollectorv3_aggregation_details_object.healthcollectorv3AggregationDetailsObject(
                                            aggregation_action_error = '', 
                                            aggregation_action_health_status = 56, 
                                            aggregation_type = '', 
                                            error = 56, 
                                            unit = '', )
                                        ], 
                                    connectivity_details = ibm_gdsc_sdk_software.models.healthcollectorv3_general_details_object.healthcollectorv3GeneralDetailsObject(
                                        err_messages = '', ), 
                                    general_err_messages = [
                                        ''
                                        ], 
                                    utilization_parameters_values = ibm_gdsc_sdk_software.models.healthcollectorv3_utilization_parameter_object.healthcollectorv3UtilizationParameterObject(
                                        analyzer_queue_value = 56, 
                                        detailed_err_message = '', 
                                        error = 56, 
                                        free_buffer_space_value = 56, 
                                        logger_queue_value = 56, 
                                        mysql_disk_usage_value = 56, 
                                        no_of_exceptions_value = 56, 
                                        no_of_flat_log_requests_value = 56, 
                                        no_of_policy_violations_value = 56, 
                                        no_of_requests_value = 56, 
                                        no_of_restarts_value = 56, 
                                        prec_mysql_memory_value = 56, 
                                        sniffer_memory_value = 56, 
                                        system_cpu_load_value = 56, 
                                        system_var_disk_usage_value = 56, ), ), 
                                exports_to = [
                                    ''
                                    ], 
                                imports_from = [
                                    ''
                                    ], 
                                os_version = '', 
                                overall_stap_status_for_mu = 56, 
                                overall_status = 56, 
                                patch = '', 
                                staps = [
                                    ibm_gdsc_sdk_software.models.healthcollectorv3_stap_object.healthcollectorv3StapObject(
                                        collector_hostname = '', 
                                        connectivity = 56, 
                                        ie_count = 56, 
                                        ie_details = [
                                            ibm_gdsc_sdk_software.models.healthcollectorv3_inspection_engine_details.healthcollectorv3InspectionEngineDetails(
                                                ie = '', 
                                                port = '', 
                                                protocol = '', 
                                                stap = '', 
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
                                        traffic = 56, )
                                    ], 
                                type = '', 
                                unit_hostname = '', 
                                unit_ip = '', 
                                unit_utilization_health_status = 56, 
                                version = '', )
                            ], )
                    ],
                status = ibm_gdsc_sdk_software.models.healthcollectorv3_status_response_base.healthcollectorv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Healthcollectorv3GetGDPHealthInfoResponse(
        )
        """

    def testHealthcollectorv3GetGDPHealthInfoResponse(self):
        """Test Healthcollectorv3GetGDPHealthInfoResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
