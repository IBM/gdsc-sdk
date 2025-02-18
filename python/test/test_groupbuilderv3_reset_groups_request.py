# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.groupbuilderv3_reset_groups_request import Groupbuilderv3ResetGroupsRequest

class TestGroupbuilderv3ResetGroupsRequest(unittest.TestCase):
    """Groupbuilderv3ResetGroupsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Groupbuilderv3ResetGroupsRequest:
        """Test Groupbuilderv3ResetGroupsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Groupbuilderv3ResetGroupsRequest`
        """
        model = Groupbuilderv3ResetGroupsRequest()
        if include_optional:
            return Groupbuilderv3ResetGroupsRequest(
                group_ids = [
                    56
                    ]
            )
        else:
            return Groupbuilderv3ResetGroupsRequest(
        )
        """

    def testGroupbuilderv3ResetGroupsRequest(self):
        """Test Groupbuilderv3ResetGroupsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
