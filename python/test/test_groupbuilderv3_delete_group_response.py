# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.groupbuilderv3_delete_group_response import Groupbuilderv3DeleteGroupResponse

class TestGroupbuilderv3DeleteGroupResponse(unittest.TestCase):
    """Groupbuilderv3DeleteGroupResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Groupbuilderv3DeleteGroupResponse:
        """Test Groupbuilderv3DeleteGroupResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Groupbuilderv3DeleteGroupResponse`
        """
        model = Groupbuilderv3DeleteGroupResponse()
        if include_optional:
            return Groupbuilderv3DeleteGroupResponse(
                status = ibm_gdsc_sdk_software.models.groupbuilderv3_status_response_base.groupbuilderv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Groupbuilderv3DeleteGroupResponse(
        )
        """

    def testGroupbuilderv3DeleteGroupResponse(self):
        """Test Groupbuilderv3DeleteGroupResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
