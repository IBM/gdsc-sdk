# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.policybuilderv3_action_metadata import Policybuilderv3ActionMetadata

class TestPolicybuilderv3ActionMetadata(unittest.TestCase):
    """Policybuilderv3ActionMetadata unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Policybuilderv3ActionMetadata:
        """Test Policybuilderv3ActionMetadata
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Policybuilderv3ActionMetadata`
        """
        model = Policybuilderv3ActionMetadata()
        if include_optional:
            return Policybuilderv3ActionMetadata(
                action_name = '',
                label = '',
                parameters = [
                    ibm_gdsc_sdk_saas.models.policybuilderv3_action_parameter_metadata.policybuilderv3ActionParameterMetadata(
                        default_value = '', 
                        mandatory = True, 
                        name = '', 
                        possible_values = [
                            ''
                            ], 
                        sequence = 56, 
                        type = '', )
                    ],
                rule_type = [
                    'ACCESS'
                    ],
                type = 'UNDEFINED_ACTIONTYPE'
            )
        else:
            return Policybuilderv3ActionMetadata(
        )
        """

    def testPolicybuilderv3ActionMetadata(self):
        """Test Policybuilderv3ActionMetadata"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
