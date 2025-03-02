# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsv3_get_report_query_response import Reportsv3GetReportQueryResponse

class TestReportsv3GetReportQueryResponse(unittest.TestCase):
    """Reportsv3GetReportQueryResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3GetReportQueryResponse:
        """Test Reportsv3GetReportQueryResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3GetReportQueryResponse`
        """
        model = Reportsv3GetReportQueryResponse()
        if include_optional:
            return Reportsv3GetReportQueryResponse(
                query = '',
                report_layout = ibm_gdsc_sdk_saas.models.reportsv3_report_display_layout.reportsv3ReportDisplayLayout(
                    default_timestamp_header_id = '', 
                    fetch_size = 56, 
                    in_report_additional_parameter = [
                        ibm_gdsc_sdk_saas.models.reportsv3_in_report_additional_parameter.reportsv3InReportAdditionalParameter(
                            date_range = ibm_gdsc_sdk_saas.models.reportsv3_date_range.reportsv3DateRange(
                                end_date = '', 
                                end_number = 56, 
                                end_unit = 'UNDEFINED_UINT_TYPE', 
                                start_date = '', 
                                start_number = 56, 
                                start_unit = 'UNDEFINED_UINT_TYPE', 
                                type = 'UNDEFINED_DATE_RANGE_TYPE', ), 
                            header_name = '', 
                            report_id = '', 
                            table_name = '', )
                        ], 
                    is_auditable = True, 
                    is_predefined = True, 
                    number_of_events = '', 
                    offset = 56, 
                    refresh_rate = 56, 
                    report_description = '', 
                    report_headers = [
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
                    report_id = '', 
                    report_name = '', 
                    report_tags = [
                        ibm_gdsc_sdk_saas.models.reportsv3_report_tag.reportsv3ReportTag(
                            nls_key = '', 
                            nls_value = '', )
                        ], 
                    runtime_param_list = [
                        ibm_gdsc_sdk_saas.models.reportsv3_run_time_parameter.reportsv3RunTimeParameter(
                            key = '', 
                            label = '', 
                            operator_type = 'UNDEFINED_OPERATOR_TYPE', 
                            runtime_parameter_type = 'UNDEFINED_TYPE', 
                            runtime_parameter_type_length = 56, 
                            value = '', )
                        ], 
                    selected_timestamp_header_id = '', )
            )
        else:
            return Reportsv3GetReportQueryResponse(
        )
        """

    def testReportsv3GetReportQueryResponse(self):
        """Test Reportsv3GetReportQueryResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
