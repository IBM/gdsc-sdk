# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.reportsv3_update_report_request import Reportsv3UpdateReportRequest

class TestReportsv3UpdateReportRequest(unittest.TestCase):
    """Reportsv3UpdateReportRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3UpdateReportRequest:
        """Test Reportsv3UpdateReportRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3UpdateReportRequest`
        """
        model = Reportsv3UpdateReportRequest()
        if include_optional:
            return Reportsv3UpdateReportRequest(
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
                    yaxis_header_id = '', ),
                report_definition = ibm_gdsc_sdk_software.models.reportsv3_report_definition.reportsv3ReportDefinition(
                    category_id = '', 
                    creation_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    creator_user_id = '', 
                    date_range = ibm_gdsc_sdk_software.models.reportsv3_date_range.reportsv3DateRange(
                        end_date = '', 
                        end_number = 56, 
                        end_unit = 'UNDEFINED_UINT_TYPE', 
                        start_date = '', 
                        start_number = 56, 
                        start_unit = 'UNDEFINED_UINT_TYPE', 
                        type = 'UNDEFINED_DATE_RANGE_TYPE', ), 
                    default_timestamp_header_id = '', 
                    is_auditable = True, 
                    is_hidden = True, 
                    is_pinned = True, 
                    is_predefined = True, 
                    refresh_rate = 56, 
                    report_description = '', 
                    report_filters = ibm_gdsc_sdk_software.models.reportsv3_report_filter_brackets.reportsv3ReportFilterBrackets(
                        brackets_id = 56, 
                        filter_name = '', 
                        filters_array = [
                            ibm_gdsc_sdk_software.models.reportsv3_report_filter.reportsv3ReportFilter(
                                brackets = ibm_gdsc_sdk_software.models.reportsv3_report_filter_brackets.reportsv3ReportFilterBrackets(
                                    brackets_id = 56, 
                                    filter_name = '', 
                                    having_array = [
                                        ibm_gdsc_sdk_software.models.report_agg_filter_represents_a_report_aggregate_filter.ReportAggFilter represents a report aggregate filter(
                                            condition = ibm_gdsc_sdk_software.models.reportsv3_report_agg_filter_condition.reportsv3ReportAggFilterCondition(
                                                aggregation_type = 'UNDEFINED_AGG_TYPE', 
                                                header_id = '', 
                                                header_name = '', 
                                                operator_type = 'UNDEFINED_OPERATOR_TYPE', 
                                                table_name = '', 
                                                value = '', ), )
                                        ], 
                                    is_custom = True, 
                                    option_type = 'UNDEFINED_OPTION_TYPE', 
                                    sequence = 56, ), 
                                condition = ibm_gdsc_sdk_software.models.reportsv3_report_filter_condition.reportsv3ReportFilterCondition(
                                    case_insensitive = True, 
                                    field_nls_translation_key = '', 
                                    filter_id = 56, 
                                    header_id = '', 
                                    header_name = '', 
                                    header_type = 'UNDEFINED_TYPE', 
                                    in_report_date_range = ibm_gdsc_sdk_software.models.reportsv3_date_range.reportsv3DateRange(
                                        end_date = '', 
                                        end_number = 56, 
                                        start_date = '', 
                                        start_number = 56, ), 
                                    in_report_field_nls_key = '', 
                                    in_report_header_id = '', 
                                    in_report_header_name = '', 
                                    in_report_id = '', 
                                    in_report_name = '', 
                                    in_report_table_name = '', 
                                    parameter_type = 'UNDEFINED_PARAM_TYPE', 
                                    schema_name = '', 
                                    sequence = 56, 
                                    table_name = '', 
                                    values = [
                                        ''
                                        ], ), )
                            ], 
                        having_array = [
                            ibm_gdsc_sdk_software.models.report_agg_filter_represents_a_report_aggregate_filter.ReportAggFilter represents a report aggregate filter()
                            ], 
                        is_custom = True, 
                        option_type = 'UNDEFINED_OPTION_TYPE', 
                        sequence = 56, ), 
                    report_headers = [
                        ibm_gdsc_sdk_software.models.reportsv3_report_header.reportsv3ReportHeader(
                            field_name = ibm_gdsc_sdk_software.models.reportsv3_field_name.reportsv3FieldName(
                                customized_value = '', 
                                nls_key = '', 
                                nls_value = '', ), 
                            group_type_id = 56, 
                            header_data_type = 'UNDEFINED_REPORT_HEADER_TYPE', 
                            header_description = ibm_gdsc_sdk_software.models.reportsv3_header_description.reportsv3HeaderDescription(
                                nls_key = '', 
                                nls_value = '', ), 
                            header_id = '', 
                            header_name = '', 
                            header_type_length = 56, 
                            literal = ibm_gdsc_sdk_software.models.reportsv3_literal.reportsv3Literal(
                                customized_value = '', 
                                nls_key = '', 
                                nls_value = '', ), 
                            order_by = 'UNDEFINED_ORDER_BY', 
                            order_by_seq = 56, 
                            schema_name = '', 
                            sequence = 56, 
                            table_name = '', )
                        ], 
                    report_id = '', 
                    report_name = '', 
                    report_tags = [
                        ibm_gdsc_sdk_software.models.reportsv3_report_tag.reportsv3ReportTag(
                            nls_key = '', 
                            nls_value = '', )
                        ], 
                    runtime_parameters = [
                        ibm_gdsc_sdk_software.models.reportsv3_run_time_parameter.reportsv3RunTimeParameter(
                            key = '', 
                            label = '', 
                            runtime_parameter_type = 'UNDEFINED_TYPE', 
                            runtime_parameter_type_length = 56, 
                            value = '', )
                        ], 
                    selected_timestamp_header_id = '', 
                    should_add_count = True, 
                    should_add_distinct = True, 
                    sql_last_version = '', 
                    table_join_optimization = '', 
                    use_pipeline_queries = '', ),
                report_id = ''
            )
        else:
            return Reportsv3UpdateReportRequest(
        )
        """

    def testReportsv3UpdateReportRequest(self):
        """Test Reportsv3UpdateReportRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
