# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsrunnerv3_stop_query_request import Reportsrunnerv3StopQueryRequest

class TestReportsrunnerv3StopQueryRequest(unittest.TestCase):
    """Reportsrunnerv3StopQueryRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsrunnerv3StopQueryRequest:
        """Test Reportsrunnerv3StopQueryRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsrunnerv3StopQueryRequest`
        """
        model = Reportsrunnerv3StopQueryRequest()
        if include_optional:
            return Reportsrunnerv3StopQueryRequest(
                query_ids = [
                    ''
                    ]
            )
        else:
            return Reportsrunnerv3StopQueryRequest(
        )
        """

    def testReportsrunnerv3StopQueryRequest(self):
        """Test Reportsrunnerv3StopQueryRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
