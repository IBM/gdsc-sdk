# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.assetsv3_list_rule_response import Assetsv3ListRuleResponse

class TestAssetsv3ListRuleResponse(unittest.TestCase):
    """Assetsv3ListRuleResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3ListRuleResponse:
        """Test Assetsv3ListRuleResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3ListRuleResponse`
        """
        model = Assetsv3ListRuleResponse()
        if include_optional:
            return Assetsv3ListRuleResponse(
                activation_status = 56,
                policy_id = '',
                policy_name = '',
                policy_sequence = 56,
                rule_list = [
                    ibm_gdsc_sdk_software.models.assetsv3_rule.assetsv3Rule(
                        actions = [
                            ibm_gdsc_sdk_software.models.action___action_associated_with_a_rule.Action - Action associated with a rule(
                                dest_category = '', 
                                dest_type = '', 
                                dest_value = '', )
                            ], 
                        is_delete = 56, 
                        parameters = [
                            ibm_gdsc_sdk_software.models.rule_parameter___parameters_for_a_rule.RuleParameter - Parameters for a rule(
                                asset_attribute = '', 
                                attribute_enum = '', 
                                condition = '', 
                                condition_category = '', 
                                condition_value = '', )
                            ], 
                        policy_id = '', 
                        rule_id = '', 
                        rule_name = '', 
                        rule_type = 'ACCESS', )
                    ]
            )
        else:
            return Assetsv3ListRuleResponse(
        )
        """

    def testAssetsv3ListRuleResponse(self):
        """Test Assetsv3ListRuleResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
