# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.policybuilderv3_policy_groups import Policybuilderv3PolicyGroups

class TestPolicybuilderv3PolicyGroups(unittest.TestCase):
    """Policybuilderv3PolicyGroups unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Policybuilderv3PolicyGroups:
        """Test Policybuilderv3PolicyGroups
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Policybuilderv3PolicyGroups`
        """
        model = Policybuilderv3PolicyGroups()
        if include_optional:
            return Policybuilderv3PolicyGroups(
                group_id = '',
                policies = [
                    ibm_gdsc_sdk_saas.models.policybuilderv3_policy_details_for_groups.policybuilderv3PolicyDetailsForGroups(
                        policy_id = '', 
                        policy_name = '', )
                    ]
            )
        else:
            return Policybuilderv3PolicyGroups(
        )
        """

    def testPolicybuilderv3PolicyGroups(self):
        """Test Policybuilderv3PolicyGroups"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
