# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.complianceacceleratorv3_workspace import Complianceacceleratorv3Workspace

class TestComplianceacceleratorv3Workspace(unittest.TestCase):
    """Complianceacceleratorv3Workspace unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Complianceacceleratorv3Workspace:
        """Test Complianceacceleratorv3Workspace
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Complianceacceleratorv3Workspace`
        """
        model = Complianceacceleratorv3Workspace()
        if include_optional:
            return Complianceacceleratorv3Workspace(
                audit_info = ibm_gdsc_sdk_software.models.complianceacceleratorv3_audit_config.complianceacceleratorv3AuditConfig(
                    description = '', 
                    enabled = True, 
                    id = '', 
                    instructions = '', 
                    is_deletion = True, 
                    name = '', 
                    owner = ibm_gdsc_sdk_software.models.schedulerv3_recipient.schedulerv3Recipient(
                        integration_id = '', 
                        label = '', 
                        template_id = '', 
                        type = 'UNDEFINED_RECTYPE', 
                        value = '', ), 
                    recipients = [
                        ibm_gdsc_sdk_software.models.schedulerv3_recipient.schedulerv3Recipient(
                            integration_id = '', 
                            label = '', 
                            template_id = '', 
                            value = '', )
                        ], 
                    report_key = '', 
                    run_once_now = True, 
                    scheduler = ibm_gdsc_sdk_software.models.complianceacceleratorv3_audit_scheduler.complianceacceleratorv3AuditScheduler(
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
                        repeat_begin = ibm_gdsc_sdk_software.models.schedulerv3_repeat_begin.schedulerv3RepeatBegin(
                            hour = 56, 
                            minute = 56, 
                            timezone = '', ), 
                        repeat_end = ibm_gdsc_sdk_software.models.schedulerv3_repeat_end.schedulerv3RepeatEnd(
                            hour = 56, 
                            minute = 56, 
                            timezone = '', ), ), 
                    tasks = [
                        ibm_gdsc_sdk_software.models.schedulerv3_scheduled_task.schedulerv3ScheduledTask(
                            audit_type = 'UNDEFINED_TYPE', 
                            delivery_method = ibm_gdsc_sdk_software.models.schedulerv3_delivery_method.schedulerv3DeliveryMethod(
                                file_format = 'UNDEFINED_FORMAT', 
                                report_time_zone = '', ), 
                            distribution_rule_ids = [
                                ''
                                ], 
                            email_subject = '', 
                            instructions = '', 
                            name = '', 
                            parameter = ibm_gdsc_sdk_software.models.schedulerv3_task_parameter.schedulerv3TaskParameter(
                                data_import_parameter = ibm_gdsc_sdk_software.models.schedulerv3_integration_parameter.schedulerv3IntegrationParameter(
                                    extra_detail = '', 
                                    integration_id = '', 
                                    template_id = '', 
                                    value = '', ), 
                                report_parameter = ibm_gdsc_sdk_software.models.schedulerv3_report_parameter.schedulerv3ReportParameter(
                                    extra_detail = '', 
                                    report_id = '', 
                                    report_name = '', 
                                    runtime_parameters = [
                                        ibm_gdsc_sdk_software.models.reportsv3_run_time_parameter.reportsv3RunTimeParameter(
                                            key = '', 
                                            label = '', 
                                            operator_type = 'UNDEFINED_OPERATOR_TYPE', 
                                            runtime_parameter_type = 'UNDEFINED_TYPE', 
                                            runtime_parameter_type_length = 56, 
                                            value = '', )
                                        ], 
                                    sync_execution_date = True, ), ), 
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
                            scheduled_task_id = '', 
                            workflow_investigation_links = [
                                ibm_gdsc_sdk_software.models.generic_configuration_item_reference.Generic configuration item reference(
                                    display = '', 
                                    id = '', )
                                ], 
                            workflow_response_template = ibm_gdsc_sdk_software.models.generic_configuration_item_reference.Generic configuration item reference(
                                display = '', 
                                id = '', ), 
                            workflow_type = 'REVIEW_NONE', 
                            workflow_unique_fields = [
                                ''
                                ], )
                        ], ),
                dashboards = [
                    ibm_gdsc_sdk_software.models.complianceacceleratorv3_dashboard_object.complianceacceleratorv3DashboardObject(
                        id = '', 
                        type = 'UNDEFINED_DASH', )
                    ],
                groups = {
                    'key' : ibm_gdsc_sdk_software.models.complianceacceleratorv3_group.complianceacceleratorv3Group(
                        desc = '', 
                        group_type_id = 56, 
                        id = 56, 
                        members = [
                            ibm_gdsc_sdk_software.models.complianceacceleratorv3_group_member.complianceacceleratorv3GroupMember(
                                member_id = '', 
                                name = '', )
                            ], 
                        members_to_add = [
                            ''
                            ], 
                        members_to_delete = [
                            ibm_gdsc_sdk_software.models.complianceacceleratorv3_group_member.complianceacceleratorv3GroupMember(
                                member_id = '', 
                                name = '', )
                            ], 
                        name = '', 
                        parent = True, )
                    },
                reports_map = {
                    'key' : ibm_gdsc_sdk_software.models.complianceacceleratorv3_reports.complianceacceleratorv3Reports(
                        reports = [
                            ibm_gdsc_sdk_software.models.complianceacceleratorv3_report.complianceacceleratorv3Report(
                                description = '', 
                                groups_needed = [
                                    ibm_gdsc_sdk_software.models.complianceacceleratorv3_group.complianceacceleratorv3Group(
                                        desc = '', 
                                        group_type_id = 56, 
                                        id = 56, 
                                        members = [
                                            ibm_gdsc_sdk_software.models.complianceacceleratorv3_group_member.complianceacceleratorv3GroupMember(
                                                member_id = '', 
                                                name = '', )
                                            ], 
                                        members_to_add = [
                                            ''
                                            ], 
                                        members_to_delete = [
                                            ibm_gdsc_sdk_software.models.complianceacceleratorv3_group_member.complianceacceleratorv3GroupMember(
                                                member_id = '', 
                                                name = '', )
                                            ], 
                                        name = '', 
                                        parent = True, )
                                    ], 
                                groups_present = [
                                    ibm_gdsc_sdk_software.models.complianceacceleratorv3_group.complianceacceleratorv3Group(
                                        desc = '', 
                                        group_type_id = 56, 
                                        id = 56, 
                                        name = '', 
                                        parent = True, )
                                    ], 
                                report_id = '', 
                                report_tags = [
                                    ibm_gdsc_sdk_software.models.reportsv3_report_tag.reportsv3ReportTag(
                                        nls_key = '', 
                                        nls_value = '', )
                                    ], 
                                status = 'POPULATED', 
                                title = '', )
                            ], )
                    }
            )
        else:
            return Complianceacceleratorv3Workspace(
        )
        """

    def testComplianceacceleratorv3Workspace(self):
        """Test Complianceacceleratorv3Workspace"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
