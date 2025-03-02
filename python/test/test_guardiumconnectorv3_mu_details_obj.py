# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_mu_details_obj import Guardiumconnectorv3MUDetailsObj

class TestGuardiumconnectorv3MUDetailsObj(unittest.TestCase):
    """Guardiumconnectorv3MUDetailsObj unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3MUDetailsObj:
        """Test Guardiumconnectorv3MUDetailsObj
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3MUDetailsObj`
        """
        model = Guardiumconnectorv3MUDetailsObj()
        if include_optional:
            return Guardiumconnectorv3MUDetailsObj(
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
                    system_cpu_load_value = 56, )
            )
        else:
            return Guardiumconnectorv3MUDetailsObj(
        )
        """

    def testGuardiumconnectorv3MUDetailsObj(self):
        """Test Guardiumconnectorv3MUDetailsObj"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
