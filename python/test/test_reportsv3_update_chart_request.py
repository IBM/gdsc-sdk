# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.reportsv3_update_chart_request import Reportsv3UpdateChartRequest

class TestReportsv3UpdateChartRequest(unittest.TestCase):
    """Reportsv3UpdateChartRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3UpdateChartRequest:
        """Test Reportsv3UpdateChartRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3UpdateChartRequest`
        """
        model = Reportsv3UpdateChartRequest()
        if include_optional:
            return Reportsv3UpdateChartRequest(
                chart_id = '',
                chart_settings = ibm_gdsc_sdk_software.models.reportsv3_chart_settings.reportsv3ChartSettings(
                    chart_id = '', 
                    chart_title = '', 
                    chart_type = 'UNDEFINED_CHART_TYPE', 
                    creation_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    creator_user_id = '', 
                    dataset_header_id = '', 
                    dataset_max_values = 56, 
                    default_chart_expanded = True, 
                    is_default_chart = True, 
                    is_predefined = True, 
                    refresh_rate = 56, 
                    report_id = '', 
                    xaxis_header_id = '', 
                    xaxis_max_values = 56, 
                    yaxis_header_id = '', )
            )
        else:
            return Reportsv3UpdateChartRequest(
        )
        """

    def testReportsv3UpdateChartRequest(self):
        """Test Reportsv3UpdateChartRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
