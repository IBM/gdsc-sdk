# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.streamsv3_check_azure_storage_string_request import Streamsv3CheckAzureStorageStringRequest

class TestStreamsv3CheckAzureStorageStringRequest(unittest.TestCase):
    """Streamsv3CheckAzureStorageStringRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Streamsv3CheckAzureStorageStringRequest:
        """Test Streamsv3CheckAzureStorageStringRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Streamsv3CheckAzureStorageStringRequest`
        """
        model = Streamsv3CheckAzureStorageStringRequest()
        if include_optional:
            return Streamsv3CheckAzureStorageStringRequest(
                connection_string = ''
            )
        else:
            return Streamsv3CheckAzureStorageStringRequest(
        )
        """

    def testStreamsv3CheckAzureStorageStringRequest(self):
        """Test Streamsv3CheckAzureStorageStringRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
