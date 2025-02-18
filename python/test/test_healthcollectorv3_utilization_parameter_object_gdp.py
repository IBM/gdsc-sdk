# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.healthcollectorv3_utilization_parameter_object_gdp import Healthcollectorv3UtilizationParameterObjectGdp

class TestHealthcollectorv3UtilizationParameterObjectGdp(unittest.TestCase):
    """Healthcollectorv3UtilizationParameterObjectGdp unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Healthcollectorv3UtilizationParameterObjectGdp:
        """Test Healthcollectorv3UtilizationParameterObjectGdp
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Healthcollectorv3UtilizationParameterObjectGdp`
        """
        model = Healthcollectorv3UtilizationParameterObjectGdp()
        if include_optional:
            return Healthcollectorv3UtilizationParameterObjectGdp(
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
                system_cpu_load_value = 56
            )
        else:
            return Healthcollectorv3UtilizationParameterObjectGdp(
        )
        """

    def testHealthcollectorv3UtilizationParameterObjectGdp(self):
        """Test Healthcollectorv3UtilizationParameterObjectGdp"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
