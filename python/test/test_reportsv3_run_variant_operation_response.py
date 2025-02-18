# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.reportsv3_run_variant_operation_response import Reportsv3RunVariantOperationResponse

class TestReportsv3RunVariantOperationResponse(unittest.TestCase):
    """Reportsv3RunVariantOperationResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3RunVariantOperationResponse:
        """Test Reportsv3RunVariantOperationResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3RunVariantOperationResponse`
        """
        model = Reportsv3RunVariantOperationResponse()
        if include_optional:
            return Reportsv3RunVariantOperationResponse(
                message = '',
                output = [
                    ''
                    ]
            )
        else:
            return Reportsv3RunVariantOperationResponse(
        )
        """

    def testReportsv3RunVariantOperationResponse(self):
        """Test Reportsv3RunVariantOperationResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
