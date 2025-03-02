# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsrunnerv3_run_audit_report_request import Reportsrunnerv3RunAuditReportRequest

class TestReportsrunnerv3RunAuditReportRequest(unittest.TestCase):
    """Reportsrunnerv3RunAuditReportRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsrunnerv3RunAuditReportRequest:
        """Test Reportsrunnerv3RunAuditReportRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsrunnerv3RunAuditReportRequest`
        """
        model = Reportsrunnerv3RunAuditReportRequest()
        if include_optional:
            return Reportsrunnerv3RunAuditReportRequest(
                fetch_size = 56,
                header_name = '',
                job_id = '',
                offset = 56,
                order_by = 'UNDEFINED_ORDER_BY',
                report_filters = ibm_gdsc_sdk_saas.models.reportsv3_report_filter_brackets.reportsv3ReportFilterBrackets(
                    brackets_id = 56, 
                    filter_name = '', 
                    filters_array = [
                        ibm_gdsc_sdk_saas.models.reportsv3_report_filter.reportsv3ReportFilter(
                            brackets = ibm_gdsc_sdk_saas.models.reportsv3_report_filter_brackets.reportsv3ReportFilterBrackets(
                                brackets_id = 56, 
                                filter_name = '', 
                                having_array = [
                                    ibm_gdsc_sdk_saas.models.report_agg_filter_represents_a_report_aggregate_filter.ReportAggFilter represents a report aggregate filter(
                                        condition = ibm_gdsc_sdk_saas.models.reportsv3_report_agg_filter_condition.reportsv3ReportAggFilterCondition(
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
                            condition = ibm_gdsc_sdk_saas.models.reportsv3_report_filter_condition.reportsv3ReportFilterCondition(
                                case_insensitive = True, 
                                field_nls_translation_key = '', 
                                filter_id = 56, 
                                group_type_id = 56, 
                                header_id = '', 
                                header_name = '', 
                                header_type = 'UNDEFINED_TYPE', 
                                in_report_date_range = ibm_gdsc_sdk_saas.models.reportsv3_date_range.reportsv3DateRange(
                                    end_date = '', 
                                    end_number = 56, 
                                    end_unit = 'UNDEFINED_UINT_TYPE', 
                                    start_date = '', 
                                    start_number = 56, 
                                    start_unit = 'UNDEFINED_UINT_TYPE', 
                                    type = 'UNDEFINED_DATE_RANGE_TYPE', ), 
                                in_report_field_nls_key = '', 
                                in_report_header_id = '', 
                                in_report_header_name = '', 
                                in_report_id = '', 
                                in_report_name = '', 
                                in_report_table_name = '', 
                                is_tuple = True, 
                                parameter_type = 'UNDEFINED_PARAM_TYPE', 
                                schema_name = '', 
                                sequence = 56, 
                                table_name = '', 
                                tuple_type = '', 
                                values = [
                                    ''
                                    ], ), )
                        ], 
                    having_array = [
                        ibm_gdsc_sdk_saas.models.report_agg_filter_represents_a_report_aggregate_filter.ReportAggFilter represents a report aggregate filter()
                        ], 
                    is_custom = True, 
                    option_type = 'UNDEFINED_OPTION_TYPE', 
                    sequence = 56, ),
                report_id = '',
                schema_name = '',
                table_name = '',
                without_limit = True
            )
        else:
            return Reportsrunnerv3RunAuditReportRequest(
        )
        """

    def testReportsrunnerv3RunAuditReportRequest(self):
        """Test Reportsrunnerv3RunAuditReportRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
