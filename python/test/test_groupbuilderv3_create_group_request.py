# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.groupbuilderv3_create_group_request import Groupbuilderv3CreateGroupRequest

class TestGroupbuilderv3CreateGroupRequest(unittest.TestCase):
    """Groupbuilderv3CreateGroupRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Groupbuilderv3CreateGroupRequest:
        """Test Groupbuilderv3CreateGroupRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Groupbuilderv3CreateGroupRequest`
        """
        model = Groupbuilderv3CreateGroupRequest()
        if include_optional:
            return Groupbuilderv3CreateGroupRequest(
                copy_group_id = 56,
                description = '',
                group_type_id = 56,
                name = '',
                nested = True
            )
        else:
            return Groupbuilderv3CreateGroupRequest(
        )
        """

    def testGroupbuilderv3CreateGroupRequest(self):
        """Test Groupbuilderv3CreateGroupRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
