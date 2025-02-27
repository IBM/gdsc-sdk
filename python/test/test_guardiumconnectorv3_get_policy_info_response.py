# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_policy_info_response import Guardiumconnectorv3GetPolicyInfoResponse

class TestGuardiumconnectorv3GetPolicyInfoResponse(unittest.TestCase):
    """Guardiumconnectorv3GetPolicyInfoResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3GetPolicyInfoResponse:
        """Test Guardiumconnectorv3GetPolicyInfoResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3GetPolicyInfoResponse`
        """
        model = Guardiumconnectorv3GetPolicyInfoResponse()
        if include_optional:
            return Guardiumconnectorv3GetPolicyInfoResponse(
                policy_data = ibm_gdsc_sdk_saas.models.gdp_policy_definition_format.GDP policy definition format(
                    audit_pattern = '', 
                    category = '', 
                    installed = True, 
                    log_flat = True, 
                    policy_name = '', 
                    policy_type = '', 
                    rules = [
                        ibm_gdsc_sdk_saas.models.gdp_rule_definition_format.GDP rule definition format(
                            actions = [
                                ibm_gdsc_sdk_saas.models.gdp_action_definition_format.GDP action definition format(
                                    action_code = 56, 
                                    action_name = '', 
                                    notifications = [
                                        ibm_gdsc_sdk_saas.models.gdp_action_notification_format.GDP action notification format(
                                            integration_id = '', 
                                            receivers = '', 
                                            template_id = '', 
                                            type = '', )
                                        ], 
                                    parameters = [
                                        ibm_gdsc_sdk_saas.models.gdp_action_parameter_format.GDP ActionParameter format(
                                            id_value = 56, 
                                            parameter_name = '', 
                                            parameter_type = '', 
                                            parameter_value = '', )
                                        ], )
                                ], 
                            continue_to_next_rule = True, 
                            parameters = [
                                ibm_gdsc_sdk_saas.models.gdp_rule_parameter_definition_format.GDP rule parameter definition format(
                                    group_id = 56, 
                                    parameter_name = '', 
                                    parameter_operator = '', 
                                    parameter_value = '', )
                                ], 
                            rule_level = 56, 
                            rule_name = '', 
                            rule_type = '', 
                            severity = '', 
                            tags = [
                                ''
                                ], )
                        ], 
                    rules_on_flat = True, ),
                status = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_status_response_base.guardiumconnectorv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Guardiumconnectorv3GetPolicyInfoResponse(
        )
        """

    def testGuardiumconnectorv3GetPolicyInfoResponse(self):
        """Test Guardiumconnectorv3GetPolicyInfoResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
