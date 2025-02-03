# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.reportsv3_chart_display_layout import Reportsv3ChartDisplayLayout

class TestReportsv3ChartDisplayLayout(unittest.TestCase):
    """Reportsv3ChartDisplayLayout unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3ChartDisplayLayout:
        """Test Reportsv3ChartDisplayLayout
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3ChartDisplayLayout`
        """
        model = Reportsv3ChartDisplayLayout()
        if include_optional:
            return Reportsv3ChartDisplayLayout(
                chart_headers = [
                    ibm_gdsc_sdk_software.models.reportsv3_display_header.reportsv3DisplayHeader(
                        field_name = ibm_gdsc_sdk_software.models.reportsv3_field_name.reportsv3FieldName(
                            customized_value = '', 
                            nls_key = '', 
                            nls_value = '', ), 
                        header_description = ibm_gdsc_sdk_software.models.reportsv3_header_description.reportsv3HeaderDescription(
                            nls_key = '', 
                            nls_value = '', ), 
                        header_id = '', 
                        header_name = '', 
                        sequence = 56, 
                        table_name = '', )
                    ],
                chart_id = '',
                report_id = '',
                results_limit = 56
            )
        else:
            return Reportsv3ChartDisplayLayout(
        )
        """

    def testReportsv3ChartDisplayLayout(self):
        """Test Reportsv3ChartDisplayLayout"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
