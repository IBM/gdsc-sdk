# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.policybuilderv3_policy import Policybuilderv3Policy

class TestPolicybuilderv3Policy(unittest.TestCase):
    """Policybuilderv3Policy unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Policybuilderv3Policy:
        """Test Policybuilderv3Policy
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Policybuilderv3Policy`
        """
        model = Policybuilderv3Policy()
        if include_optional:
            return Policybuilderv3Policy(
                activation_status = 56,
                contains_rule_types = [
                    'ACCESS'
                    ],
                control_flow = 'STANDARD',
                edge_activation_info = [
                    ibm_gdsc_sdk_saas.models.information_about_policy_activated_on_edge.Information about policy activated on edge(
                        activation_order = 56, 
                        activation_status = 'NOT_ACTIVATED', 
                        activation_timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        edge_id = '', )
                    ],
                installed_flag = True,
                installed_order = 56,
                installed_timestamp = '',
                last_edited_timestamp = '',
                log_flat = True,
                no_of_rules = 56,
                policy_id = '',
                policy_import_issue = 'NO_IMPORT_ISSUE',
                policy_import_state = 'NO_IMPORT_STATUS',
                policy_name = '',
                policy_type = 'DATA_POLICY',
                rules_on_flat = True,
                template = True,
                ui_sequence = 56,
                version = 56
            )
        else:
            return Policybuilderv3Policy(
        )
        """

    def testPolicybuilderv3Policy(self):
        """Test Policybuilderv3Policy"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
