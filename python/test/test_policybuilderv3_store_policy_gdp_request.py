# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.policybuilderv3_store_policy_gdp_request import Policybuilderv3StorePolicyGdpRequest

class TestPolicybuilderv3StorePolicyGdpRequest(unittest.TestCase):
    """Policybuilderv3StorePolicyGdpRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Policybuilderv3StorePolicyGdpRequest:
        """Test Policybuilderv3StorePolicyGdpRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Policybuilderv3StorePolicyGdpRequest`
        """
        model = Policybuilderv3StorePolicyGdpRequest()
        if include_optional:
            return Policybuilderv3StorePolicyGdpRequest(
                central_manager_id = '',
                data = ''
            )
        else:
            return Policybuilderv3StorePolicyGdpRequest(
        )
        """

    def testPolicybuilderv3StorePolicyGdpRequest(self):
        """Test Policybuilderv3StorePolicyGdpRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
