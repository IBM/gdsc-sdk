# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.schedulerv3_scheduled_job import Schedulerv3ScheduledJob

class TestSchedulerv3ScheduledJob(unittest.TestCase):
    """Schedulerv3ScheduledJob unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Schedulerv3ScheduledJob:
        """Test Schedulerv3ScheduledJob
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Schedulerv3ScheduledJob`
        """
        model = Schedulerv3ScheduledJob()
        if include_optional:
            return Schedulerv3ScheduledJob(
                creation_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                description = '',
                enabled = True,
                expired = True,
                instructions = '',
                internal_audit = 'UNDEFINED_TYPE',
                last_modified_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                name = '',
                next_run = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                notification = 'UNDEFINED_NOTIFICATION',
                origin = '',
                previous_run = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                recipient = ibm_gdsc_sdk_saas.models.schedulerv3_recipient.schedulerv3Recipient(
                    integration_id = '', 
                    label = '', 
                    template_id = '', 
                    type = 'UNDEFINED_RECTYPE', 
                    value = '', ),
                recipients = [
                    ibm_gdsc_sdk_saas.models.schedulerv3_recipient.schedulerv3Recipient(
                        integration_id = '', 
                        label = '', 
                        template_id = '', 
                        type = 'UNDEFINED_RECTYPE', 
                        value = '', )
                    ],
                retention = ibm_gdsc_sdk_saas.models.schedulerv3_retention.schedulerv3Retention(
                    archive = True, 
                    days = 56, ),
                schedule_id = '',
                scheduler = ibm_gdsc_sdk_saas.models.schedulerv3_scheduler.schedulerv3Scheduler(
                    begin_schedule = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    by_day_of_month = True, 
                    day_of_month = '', 
                    day_of_week = [
                        'UNDEFINED_DAY'
                        ], 
                    day_order = 'UNDEFINED_ORDER', 
                    day_order_day_of_week = 'UNDEFINED_DAY', 
                    end_schedule = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    frequency = 'UNDEFINED_FREQUENCY', 
                    months = [
                        'EVERYMONTH'
                        ], 
                    never_end = True, 
                    repeat = 56, 
                    repeat_begin = ibm_gdsc_sdk_saas.models.schedulerv3_repeat_begin.schedulerv3RepeatBegin(
                        hour = 56, 
                        minute = 56, 
                        timezone = '', ), 
                    repeat_end = ibm_gdsc_sdk_saas.models.schedulerv3_repeat_end.schedulerv3RepeatEnd(
                        hour = 56, 
                        minute = 56, 
                        timezone = '', ), 
                    repeat_minutes = 56, 
                    run_once_now = True, ),
                tags = [
                    ''
                    ],
                tasks = [
                    ibm_gdsc_sdk_saas.models.schedulerv3_scheduled_task.schedulerv3ScheduledTask(
                        audit_type = 'UNDEFINED_TYPE', 
                        delivery_method = ibm_gdsc_sdk_saas.models.schedulerv3_delivery_method.schedulerv3DeliveryMethod(
                            file_format = 'UNDEFINED_FORMAT', 
                            report_time_zone = '', ), 
                        distribution_rule_ids = [
                            ''
                            ], 
                        email_subject = '', 
                        instructions = '', 
                        name = '', 
                        parameter = ibm_gdsc_sdk_saas.models.schedulerv3_task_parameter.schedulerv3TaskParameter(
                            data_import_parameter = ibm_gdsc_sdk_saas.models.schedulerv3_integration_parameter.schedulerv3IntegrationParameter(
                                extra_detail = '', 
                                integration_id = '', 
                                template_id = '', 
                                value = '', ), 
                            report_parameter = ibm_gdsc_sdk_saas.models.schedulerv3_report_parameter.schedulerv3ReportParameter(
                                extra_detail = '', 
                                report_id = '', 
                                report_name = '', 
                                runtime_parameters = [
                                    ibm_gdsc_sdk_saas.models.reportsv3_run_time_parameter.reportsv3RunTimeParameter(
                                        key = '', 
                                        label = '', 
                                        operator_type = 'UNDEFINED_OPERATOR_TYPE', 
                                        runtime_parameter_type = 'UNDEFINED_TYPE', 
                                        runtime_parameter_type_length = 56, 
                                        value = '', )
                                    ], 
                                sync_execution_date = True, 
                                threshold = 56, ), ), 
                        recipients = [
                            ibm_gdsc_sdk_saas.models.schedulerv3_recipient.schedulerv3Recipient(
                                integration_id = '', 
                                label = '', 
                                template_id = '', 
                                type = 'UNDEFINED_RECTYPE', 
                                value = '', )
                            ], 
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
                                            start_unit = 'UNDEFINED_UINT_TYPE', ), 
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
                        scheduled_task_id = '', 
                        type = 'UNDEFINED_JOBTYPE', 
                        workflow_investigation_links = [
                            ibm_gdsc_sdk_saas.models.generic_configuration_item_reference.Generic configuration item reference(
                                display = '', 
                                id = '', )
                            ], 
                        workflow_response_template = ibm_gdsc_sdk_saas.models.generic_configuration_item_reference.Generic configuration item reference(
                            display = '', 
                            id = '', ), 
                        workflow_type = 'REVIEW_NONE', 
                        workflow_unique_fields = [
                            ''
                            ], )
                    ]
            )
        else:
            return Schedulerv3ScheduledJob(
        )
        """

    def testSchedulerv3ScheduledJob(self):
        """Test Schedulerv3ScheduledJob"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
