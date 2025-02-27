# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_chart_data_responsev2 import Reportsrunnerv3GetChartDataResponsev2

class TestReportsrunnerv3GetChartDataResponsev2(unittest.TestCase):
    """Reportsrunnerv3GetChartDataResponsev2 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsrunnerv3GetChartDataResponsev2:
        """Test Reportsrunnerv3GetChartDataResponsev2
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsrunnerv3GetChartDataResponsev2`
        """
        model = Reportsrunnerv3GetChartDataResponsev2()
        if include_optional:
            return Reportsrunnerv3GetChartDataResponsev2(
                chart_layout = ibm_gdsc_sdk_saas.models.reportsv3_chart_display_layout.reportsv3ChartDisplayLayout(
                    chart_headers = [
                        ibm_gdsc_sdk_saas.models.reportsv3_display_header.reportsv3DisplayHeader(
                            field_name = ibm_gdsc_sdk_saas.models.reportsv3_field_name.reportsv3FieldName(
                                customized_value = '', 
                                nls_key = '', 
                                nls_value = '', ), 
                            header_description = ibm_gdsc_sdk_saas.models.reportsv3_header_description.reportsv3HeaderDescription(
                                nls_key = '', 
                                nls_value = '', ), 
                            header_id = '', 
                            header_name = '', 
                            sequence = 56, 
                            table_name = '', )
                        ], 
                    chart_id = '', 
                    report_id = '', 
                    results_limit = 56, ),
                data = [
                    ibm_gdsc_sdk_saas.models.data_row_is_the_type_of_one_of_the_results.DataRow is the type of one of the results(
                        results = {
                            'key' : ''
                            }, )
                    ]
            )
        else:
            return Reportsrunnerv3GetChartDataResponsev2(
        )
        """

    def testReportsrunnerv3GetChartDataResponsev2(self):
        """Test Reportsrunnerv3GetChartDataResponsev2"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
