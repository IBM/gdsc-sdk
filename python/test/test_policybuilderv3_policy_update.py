# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.policybuilderv3_policy_update import Policybuilderv3PolicyUpdate

class TestPolicybuilderv3PolicyUpdate(unittest.TestCase):
    """Policybuilderv3PolicyUpdate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Policybuilderv3PolicyUpdate:
        """Test Policybuilderv3PolicyUpdate
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Policybuilderv3PolicyUpdate`
        """
        model = Policybuilderv3PolicyUpdate()
        if include_optional:
            return Policybuilderv3PolicyUpdate(
                activation_status = 56,
                control_flow = 'STANDARD',
                deleted_rule_ids = [
                    ''
                    ],
                installed_flag = True,
                installed_order = 56,
                installed_timestamp = '',
                last_edited_timestamp = '',
                log_flat = True,
                policy_id = '',
                policy_name = '',
                policy_type = 'DATA_POLICY',
                rules = [
                    ibm_gdsc_sdk_software.models.policybuilderv3_rule.policybuilderv3Rule(
                        actions = [
                            ibm_gdsc_sdk_software.models.policybuilderv3_action.policybuilderv3Action(
                                action_name = '', 
                                notifications = [
                                    ibm_gdsc_sdk_software.models.policybuilderv3_target_receiver.policybuilderv3TargetReceiver(
                                        integration_id = '', 
                                        template_id = '', 
                                        type = 'UNDEFINED_RECTYPE', 
                                        value = '', )
                                    ], 
                                order = 56, 
                                parameters = [
                                    ibm_gdsc_sdk_software.models.policybuilderv3_action_parameter.policybuilderv3ActionParameter(
                                        parameter_name = '', 
                                        parameter_value = '', )
                                    ], 
                                qr_defintion_id = 56, 
                                type = 'UNDEFINED_ACTIONTYPE', 
                                ui_label = '', )
                            ], 
                        continue_to_next_rule = True, 
                        empty_groups = [
                            56
                            ], 
                        invalid_actions = [
                            ibm_gdsc_sdk_software.models.policybuilderv3_action.policybuilderv3Action(
                                action_name = '', 
                                order = 56, 
                                qr_defintion_id = 56, 
                                ui_label = '', )
                            ], 
                        invalid_parameters = [
                            ibm_gdsc_sdk_software.models.policybuilderv3_rule_parameter.policybuilderv3RuleParameter(
                                parameter_name = '', 
                                parameter_operator = 'UNKNOWN_OPERATOR', 
                                parameter_type = '', 
                                parameter_value = '', 
                                parameter_value_label = '', 
                                ui_label = '', )
                            ], 
                        parameters = [
                            ibm_gdsc_sdk_software.models.policybuilderv3_rule_parameter.policybuilderv3RuleParameter(
                                parameter_name = '', 
                                parameter_type = '', 
                                parameter_value = '', 
                                parameter_value_label = '', 
                                ui_label = '', )
                            ], 
                        policy_id = '', 
                        rule_id = '', 
                        rule_key = '', 
                        rule_name = '', 
                        rule_order = 56, 
                        rule_type = 'ACCESS', 
                        severity = 'INFO', 
                        tags = [
                            ''
                            ], 
                        template = True, )
                    ],
                rules_on_flat = True,
                template = True,
                version = 56
            )
        else:
            return Policybuilderv3PolicyUpdate(
        )
        """

    def testPolicybuilderv3PolicyUpdate(self):
        """Test Policybuilderv3PolicyUpdate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
