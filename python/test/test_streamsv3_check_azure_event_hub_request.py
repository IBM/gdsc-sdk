# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.streamsv3_check_azure_event_hub_request import Streamsv3CheckAzureEventHubRequest

class TestStreamsv3CheckAzureEventHubRequest(unittest.TestCase):
    """Streamsv3CheckAzureEventHubRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Streamsv3CheckAzureEventHubRequest:
        """Test Streamsv3CheckAzureEventHubRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Streamsv3CheckAzureEventHubRequest`
        """
        model = Streamsv3CheckAzureEventHubRequest()
        if include_optional:
            return Streamsv3CheckAzureEventHubRequest(
                access_key_id = '',
                id = '',
                namespace = '',
                secret_key_id = '',
                stream_name = '',
                stream_type = 'AWS_KINESIS'
            )
        else:
            return Streamsv3CheckAzureEventHubRequest(
        )
        """

    def testStreamsv3CheckAzureEventHubRequest(self):
        """Test Streamsv3CheckAzureEventHubRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
