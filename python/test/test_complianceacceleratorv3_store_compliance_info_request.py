# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.complianceacceleratorv3_store_compliance_info_request import Complianceacceleratorv3StoreComplianceInfoRequest

class TestComplianceacceleratorv3StoreComplianceInfoRequest(unittest.TestCase):
    """Complianceacceleratorv3StoreComplianceInfoRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Complianceacceleratorv3StoreComplianceInfoRequest:
        """Test Complianceacceleratorv3StoreComplianceInfoRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Complianceacceleratorv3StoreComplianceInfoRequest`
        """
        model = Complianceacceleratorv3StoreComplianceInfoRequest()
        if include_optional:
            return Complianceacceleratorv3StoreComplianceInfoRequest(
                compliance_info = ibm_gdsc_sdk_software.models.complianceacceleratorv3_compliance_info.complianceacceleratorv3ComplianceInfo(
                    options = ibm_gdsc_sdk_software.models.complianceacceleratorv3_options.complianceacceleratorv3Options(
                        email_config = ibm_gdsc_sdk_software.models.complianceacceleratorv3_email_config.complianceacceleratorv3EmailConfig(
                            integration_id = '', 
                            template_id = '', ), 
                        parent_groups = {
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
                        policy_id = '', 
                        rules = {
                            'key' : ibm_gdsc_sdk_software.models.complianceacceleratorv3_rule_and_action.complianceacceleratorv3RuleAndAction(
                                actions = {
                                    'key' : ibm_gdsc_sdk_software.models.complianceacceleratorv3_action.complianceacceleratorv3Action(
                                        notification_type = 'UNDEFINED_RECTYPE', 
                                        user_ids = [
                                            ''
                                            ], )
                                    }, 
                                rule_id = '', )
                            }, 
                        syslog_config = ibm_gdsc_sdk_software.models.complianceacceleratorv3_syslog_config.complianceacceleratorv3SyslogConfig(
                            host = '', 
                            include_q_radar = True, 
                            is_deletion = True, 
                            name = '', 
                            port = '', 
                            protocol = '', 
                            syslog_id = '', 
                            template_id = '', ), 
                        tasks = {
                            'key' : 'UNDEFINED'
                            }, ), 
                    workspaces = {
                        'key' : ibm_gdsc_sdk_software.models.complianceacceleratorv3_workspace.complianceacceleratorv3Workspace(
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
                                        timezone = '', ), ), ), 
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
                                    name = '', 
                                    parent = True, )
                                }, 
                            reports_map = {
                                'key' : ibm_gdsc_sdk_software.models.complianceacceleratorv3_reports.complianceacceleratorv3Reports(
                                    reports = [
                                        ibm_gdsc_sdk_software.models.complianceacceleratorv3_report.complianceacceleratorv3Report(
                                            description = '', 
                                            groups_needed = [
                                                
                                                ], 
                                            groups_present = [
                                                
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
                                }, )
                        }, )
            )
        else:
            return Complianceacceleratorv3StoreComplianceInfoRequest(
        )
        """

    def testComplianceacceleratorv3StoreComplianceInfoRequest(self):
        """Test Complianceacceleratorv3StoreComplianceInfoRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
