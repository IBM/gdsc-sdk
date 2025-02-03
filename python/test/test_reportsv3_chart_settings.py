# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.reportsv3_chart_settings import Reportsv3ChartSettings

class TestReportsv3ChartSettings(unittest.TestCase):
    """Reportsv3ChartSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3ChartSettings:
        """Test Reportsv3ChartSettings
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3ChartSettings`
        """
        model = Reportsv3ChartSettings()
        if include_optional:
            return Reportsv3ChartSettings(
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
                yaxis_header_id = ''
            )
        else:
            return Reportsv3ChartSettings(
        )
        """

    def testReportsv3ChartSettings(self):
        """Test Reportsv3ChartSettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
