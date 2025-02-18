# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.workflowv3_get_cases_count_response import Workflowv3GetCasesCountResponse

class TestWorkflowv3GetCasesCountResponse(unittest.TestCase):
    """Workflowv3GetCasesCountResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Workflowv3GetCasesCountResponse:
        """Test Workflowv3GetCasesCountResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Workflowv3GetCasesCountResponse`
        """
        model = Workflowv3GetCasesCountResponse()
        if include_optional:
            return Workflowv3GetCasesCountResponse(
                total_records = 56
            )
        else:
            return Workflowv3GetCasesCountResponse(
        )
        """

    def testWorkflowv3GetCasesCountResponse(self):
        """Test Workflowv3GetCasesCountResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
