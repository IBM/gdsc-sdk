# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.reportsrunnerv3_run_report_request import Reportsrunnerv3RunReportRequest

class TestReportsrunnerv3RunReportRequest(unittest.TestCase):
    """Reportsrunnerv3RunReportRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsrunnerv3RunReportRequest:
        """Test Reportsrunnerv3RunReportRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsrunnerv3RunReportRequest`
        """
        model = Reportsrunnerv3RunReportRequest()
        if include_optional:
            return Reportsrunnerv3RunReportRequest(
                calculate_facets = True,
                date_range = ibm_gdsc_sdk_software.models.reportsv3_date_range.reportsv3DateRange(
                    end_date = '', 
                    end_number = 56, 
                    end_unit = 'UNDEFINED_UINT_TYPE', 
                    start_date = '', 
                    start_number = 56, 
                    start_unit = 'UNDEFINED_UINT_TYPE', 
                    type = 'UNDEFINED_DATE_RANGE_TYPE', ),
                default_chart_expanded = True,
                fetch_size = 56,
                job_type = 'UNDEFINED_JOB_TYPE',
                model_type = 'UNDEFINED_MODEL_TYPE',
                offset = 56,
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
                report_id = '',
                runtime_parameter_list = [
                    ibm_gdsc_sdk_software.models.reportsv3_run_time_parameter.reportsv3RunTimeParameter(
                        key = '', 
                        label = '', 
                        operator_type = 'UNDEFINED_OPERATOR_TYPE', 
                        runtime_parameter_type = 'UNDEFINED_TYPE', 
                        runtime_parameter_type_length = 56, 
                        value = '', )
                    ],
                time_zone = '',
                use_quick_facets = True,
                without_limit = True
            )
        else:
            return Reportsrunnerv3RunReportRequest(
        )
        """

    def testReportsrunnerv3RunReportRequest(self):
        """Test Reportsrunnerv3RunReportRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
