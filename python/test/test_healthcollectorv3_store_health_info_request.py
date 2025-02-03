# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.healthcollectorv3_store_health_info_request import Healthcollectorv3StoreHealthInfoRequest

class TestHealthcollectorv3StoreHealthInfoRequest(unittest.TestCase):
    """Healthcollectorv3StoreHealthInfoRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Healthcollectorv3StoreHealthInfoRequest:
        """Test Healthcollectorv3StoreHealthInfoRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Healthcollectorv3StoreHealthInfoRequest`
        """
        model = Healthcollectorv3StoreHealthInfoRequest()
        if include_optional:
            return Healthcollectorv3StoreHealthInfoRequest(
                central_manager_id = '',
                data = [
                    ibm_gdsc_sdk_software.models.healthcollectorv3_health_info_object.healthcollectorv3HealthInfoObject(
                        nodes = [
                            ibm_gdsc_sdk_software.models.healthcollectorv3_managed_unit_object_gdp.healthcollectorv3ManagedUnitObjectGdp(
                                agg_health_status = 56, 
                                connectivity = 56, 
                                details = ibm_gdsc_sdk_software.models.healthcollectorv3_mu_details_obj_gdp.healthcollectorv3MUDetailsObjGdp(
                                    agg_health_view_list = [
                                        ibm_gdsc_sdk_software.models.healthcollectorv3_aggregation_details_object_gdp.healthcollectorv3AggregationDetailsObjectGdp(
                                            agg_action_error = '', 
                                            agg_action_health_status = 56, 
                                            agg_type = '', 
                                            error_code = 56, 
                                            unit = '', )
                                        ], 
                                    connectivity_details = ibm_gdsc_sdk_software.models.healthcollectorv3_general_details_object.healthcollectorv3GeneralDetailsObject(
                                        err_messages = '', ), 
                                    general_err_messages = [
                                        ''
                                        ], 
                                    utilization_scheme = ibm_gdsc_sdk_software.models.healthcollectorv3_utilization_parameter_object_gdp.healthcollectorv3UtilizationParameterObjectGdp(
                                        analyzer_queue_value = 56, 
                                        error_messages_code = 56, 
                                        error_messages_value = '', 
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
                                name = '', 
                                os_version = '', 
                                patch = '', 
                                status = 56, 
                                type = '', 
                                unit_host_ip = '', 
                                unit_utilization_health_status = 56, 
                                version = '', )
                            ], 
                        staps = [
                            ibm_gdsc_sdk_software.models.healthcollectorv3_stap_object_gdp.healthcollectorv3StapObjectGdp(
                                children = [
                                    ibm_gdsc_sdk_software.models.healthcollectorv3_inspection_engine_object_gdp.healthcollectorv3InspectionEngineObjectGdp(
                                        ie_status = 56, 
                                        inspection_engine = '', )
                                    ], 
                                collector_host_name = '', 
                                connectivity = 56, 
                                ie_status = 56, 
                                inspection_engine = '', 
                                ktap = 56, 
                                name = '', 
                                os_type = '', 
                                revision = '', 
                                stap_ip = '', 
                                status = 56, 
                                traffic = 56, )
                            ], )
                    ]
            )
        else:
            return Healthcollectorv3StoreHealthInfoRequest(
        )
        """

    def testHealthcollectorv3StoreHealthInfoRequest(self):
        """Test Healthcollectorv3StoreHealthInfoRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
