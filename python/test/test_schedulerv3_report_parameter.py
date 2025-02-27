# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.schedulerv3_report_parameter import Schedulerv3ReportParameter

class TestSchedulerv3ReportParameter(unittest.TestCase):
    """Schedulerv3ReportParameter unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Schedulerv3ReportParameter:
        """Test Schedulerv3ReportParameter
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Schedulerv3ReportParameter`
        """
        model = Schedulerv3ReportParameter()
        if include_optional:
            return Schedulerv3ReportParameter(
                extra_detail = '',
                report_id = '',
                report_name = '',
                runtime_parameters = [
                    ibm_gdsc_sdk_saas.models.reportsv3_run_time_parameter.reportsv3RunTimeParameter(
                        key = '', 
                        label = '', 
                        operator_type = 'UNDEFINED_OPERATOR_TYPE', 
                        runtime_parameter_type = 'UNDEFINED_TYPE', 
                        runtime_parameter_type_length = 56, 
                        value = '', )
                    ],
                sync_execution_date = True,
                threshold = 56
            )
        else:
            return Schedulerv3ReportParameter(
        )
        """

    def testSchedulerv3ReportParameter(self):
        """Test Schedulerv3ReportParameter"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
