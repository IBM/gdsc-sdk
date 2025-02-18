# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.schedulerv3_task_parameter import Schedulerv3TaskParameter

class TestSchedulerv3TaskParameter(unittest.TestCase):
    """Schedulerv3TaskParameter unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Schedulerv3TaskParameter:
        """Test Schedulerv3TaskParameter
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Schedulerv3TaskParameter`
        """
        model = Schedulerv3TaskParameter()
        if include_optional:
            return Schedulerv3TaskParameter(
                data_import_parameter = ibm_gdsc_sdk_software.models.schedulerv3_integration_parameter.schedulerv3IntegrationParameter(
                    extra_detail = '', 
                    integration_id = '', 
                    template_id = '', 
                    value = '', ),
                report_parameter = ibm_gdsc_sdk_software.models.schedulerv3_report_parameter.schedulerv3ReportParameter(
                    extra_detail = '', 
                    report_id = '', 
                    report_name = '', 
                    runtime_parameters = [
                        ibm_gdsc_sdk_software.models.reportsv3_run_time_parameter.reportsv3RunTimeParameter(
                            key = '', 
                            label = '', 
                            operator_type = 'UNDEFINED_OPERATOR_TYPE', 
                            runtime_parameter_type = 'UNDEFINED_TYPE', 
                            runtime_parameter_type_length = 56, 
                            value = '', )
                        ], 
                    sync_execution_date = True, )
            )
        else:
            return Schedulerv3TaskParameter(
        )
        """

    def testSchedulerv3TaskParameter(self):
        """Test Schedulerv3TaskParameter"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
