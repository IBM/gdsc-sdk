# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.policybuilderv3_insert_gdp_policy_meta_data_request import Policybuilderv3InsertGdpPolicyMetaDataRequest

class TestPolicybuilderv3InsertGdpPolicyMetaDataRequest(unittest.TestCase):
    """Policybuilderv3InsertGdpPolicyMetaDataRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Policybuilderv3InsertGdpPolicyMetaDataRequest:
        """Test Policybuilderv3InsertGdpPolicyMetaDataRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Policybuilderv3InsertGdpPolicyMetaDataRequest`
        """
        model = Policybuilderv3InsertGdpPolicyMetaDataRequest()
        if include_optional:
            return Policybuilderv3InsertGdpPolicyMetaDataRequest(
                central_manager_id = '',
                data = [
                    ibm_gdsc_sdk_saas.models.gdp_policy_object_used_for_summaries_for_insertion.Gdp Policy Object used for summaries for insertion(
                        id = 56, 
                        policy_description = '', 
                        policy_rules_count = '', 
                        policy_sub_type = '', 
                        policy_type = '', )
                    ]
            )
        else:
            return Policybuilderv3InsertGdpPolicyMetaDataRequest(
        )
        """

    def testPolicybuilderv3InsertGdpPolicyMetaDataRequest(self):
        """Test Policybuilderv3InsertGdpPolicyMetaDataRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
