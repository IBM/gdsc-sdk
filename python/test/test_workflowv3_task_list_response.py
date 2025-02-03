# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.workflowv3_task_list_response import Workflowv3TaskListResponse

class TestWorkflowv3TaskListResponse(unittest.TestCase):
    """Workflowv3TaskListResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Workflowv3TaskListResponse:
        """Test Workflowv3TaskListResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Workflowv3TaskListResponse`
        """
        model = Workflowv3TaskListResponse()
        if include_optional:
            return Workflowv3TaskListResponse(
                status = ibm_gdsc_sdk_software.models.the_`status`_type_defines_a_logical_error_model_that_is_suitable_for_different
programming_environments,_including_rest_apis_and_rpc_apis/_it_is_used_by
[g_rpc](https://github/com/grpc)/_the_error_model_is_designed_to_be:.The `Status` type defines a logical error model that is suitable for different
programming environments, including REST APIs and RPC APIs. It is used by
[gRPC](https://github.com/grpc). The error model is designed to be:(
                    code = 56, 
                    details = [
                        ibm_gdsc_sdk_software.models.protobuf_any.protobufAny(
                            type_url = '', 
                            value = 'YQ==', )
                        ], 
                    message = '', ),
                tasks = [
                    ibm_gdsc_sdk_software.models.workflowv3_task.workflowv3Task(
                        alt_id = '', 
                        assignments = [
                            ibm_gdsc_sdk_software.models.workflowv3_entity.workflowv3Entity(
                                label = '', 
                                template_id = '', 
                                type = 'UNDEFINED_ENTITY_TYPE', 
                                value = '', )
                            ], 
                        case_id = '', 
                        comments = [
                            ibm_gdsc_sdk_software.models.workflowv3_comment.workflowv3Comment(
                                what = '', 
                                when = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                                who = '', )
                            ], 
                        date_created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        date_due = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        date_modified = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        depends_on = [
                            ''
                            ], 
                        description = '', 
                        investigation_links = [
                            ibm_gdsc_sdk_software.models.generic_configuration_item_reference.Generic configuration item reference(
                                display = '', 
                                id = '', )
                            ], 
                        justification = '', 
                        number = '', 
                        priority = 'UNDEFINED_PRIORITY', 
                        report_result = ibm_gdsc_sdk_software.models.workflowv3_report_result.workflowv3ReportResult(
                            headers = [
                                ibm_gdsc_sdk_software.models.workflowv3_report_result_header.workflowv3ReportResultHeader(
                                    header = '', 
                                    key = '', )
                                ], 
                            rows = [
                                ibm_gdsc_sdk_software.models.workflowv3_report_result_row.workflowv3ReportResultRow(
                                    row = {
                                        'key' : ''
                                        }, )
                                ], ), 
                        response_template = ibm_gdsc_sdk_software.models.generic_configuration_item_reference.Generic configuration item reference(
                            display = '', 
                            id = '', ), 
                        review_action = '', 
                        run = ibm_gdsc_sdk_software.models.workflowv3_report_run.workflowv3ReportRun(
                            date_end = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            date_start = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            detail = '', 
                            query_from = '', 
                            query_to = '', 
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
                                                end_unit = 'UNDEFINED_UINT_TYPE', 
                                                start_date = '', 
                                                start_number = 56, 
                                                start_unit = 'UNDEFINED_UINT_TYPE', ), 
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
                            report_id = '', 
                            report_name = '', 
                            report_result_file_name = '', 
                            run_id = '', 
                            scheduled_job_id = '', 
                            scheduled_job_name = '', 
                            scheduled_task_id = '', 
                            scheduled_task_type = 'UNDEFINED_JOBTYPE', 
                            status = 56, ), 
                        status = 'UNDEFINED_STATUS', 
                        tags = [
                            ''
                            ], 
                        task_id = '', 
                        title = '', 
                        workflow_type = 'REVIEW_NONE', )
                    ]
            )
        else:
            return Workflowv3TaskListResponse(
        )
        """

    def testWorkflowv3TaskListResponse(self):
        """Test Workflowv3TaskListResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
