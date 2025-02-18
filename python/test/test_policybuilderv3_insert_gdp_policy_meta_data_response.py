# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.policybuilderv3_insert_gdp_policy_meta_data_response import Policybuilderv3InsertGdpPolicyMetaDataResponse

class TestPolicybuilderv3InsertGdpPolicyMetaDataResponse(unittest.TestCase):
    """Policybuilderv3InsertGdpPolicyMetaDataResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Policybuilderv3InsertGdpPolicyMetaDataResponse:
        """Test Policybuilderv3InsertGdpPolicyMetaDataResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Policybuilderv3InsertGdpPolicyMetaDataResponse`
        """
        model = Policybuilderv3InsertGdpPolicyMetaDataResponse()
        if include_optional:
            return Policybuilderv3InsertGdpPolicyMetaDataResponse(
                status = ibm_gdsc_sdk_software.models.policybuilderv3_status_response_base.policybuilderv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Policybuilderv3InsertGdpPolicyMetaDataResponse(
        )
        """

    def testPolicybuilderv3InsertGdpPolicyMetaDataResponse(self):
        """Test Policybuilderv3InsertGdpPolicyMetaDataResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
