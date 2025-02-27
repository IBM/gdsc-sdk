# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsv3_get_chart_settings_response import Reportsv3GetChartSettingsResponse

class TestReportsv3GetChartSettingsResponse(unittest.TestCase):
    """Reportsv3GetChartSettingsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3GetChartSettingsResponse:
        """Test Reportsv3GetChartSettingsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3GetChartSettingsResponse`
        """
        model = Reportsv3GetChartSettingsResponse()
        if include_optional:
            return Reportsv3GetChartSettingsResponse(
                chart_settings = [
                    ibm_gdsc_sdk_saas.models.reportsv3_chart_settings.reportsv3ChartSettings(
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
                    ]
            )
        else:
            return Reportsv3GetChartSettingsResponse(
        )
        """

    def testReportsv3GetChartSettingsResponse(self):
        """Test Reportsv3GetChartSettingsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
