# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.assetsv3_list_policy_response import Assetsv3ListPolicyResponse

class TestAssetsv3ListPolicyResponse(unittest.TestCase):
    """Assetsv3ListPolicyResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3ListPolicyResponse:
        """Test Assetsv3ListPolicyResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3ListPolicyResponse`
        """
        model = Assetsv3ListPolicyResponse()
        if include_optional:
            return Assetsv3ListPolicyResponse(
                policy_list = [
                    ibm_gdsc_sdk_saas.models.assetsv3_policy.assetsv3Policy(
                        activation_status = 56, 
                        installed_flag = True, 
                        installed_timestamp = '', 
                        is_delete = 56, 
                        last_edited_timestamp = '', 
                        no_of_rules = 56, 
                        policy_id = '', 
                        policy_name = '', 
                        policy_sequence = 56, )
                    ]
            )
        else:
            return Assetsv3ListPolicyResponse(
        )
        """

    def testAssetsv3ListPolicyResponse(self):
        """Test Assetsv3ListPolicyResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
