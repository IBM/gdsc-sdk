# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.groupbuilderv3_refresh_groups_request import Groupbuilderv3RefreshGroupsRequest

class TestGroupbuilderv3RefreshGroupsRequest(unittest.TestCase):
    """Groupbuilderv3RefreshGroupsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Groupbuilderv3RefreshGroupsRequest:
        """Test Groupbuilderv3RefreshGroupsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Groupbuilderv3RefreshGroupsRequest`
        """
        model = Groupbuilderv3RefreshGroupsRequest()
        if include_optional:
            return Groupbuilderv3RefreshGroupsRequest(
                group_ids = [
                    56
                    ]
            )
        else:
            return Groupbuilderv3RefreshGroupsRequest(
        )
        """

    def testGroupbuilderv3RefreshGroupsRequest(self):
        """Test Groupbuilderv3RefreshGroupsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
