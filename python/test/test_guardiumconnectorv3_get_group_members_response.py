# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_group_members_response import Guardiumconnectorv3GetGroupMembersResponse

class TestGuardiumconnectorv3GetGroupMembersResponse(unittest.TestCase):
    """Guardiumconnectorv3GetGroupMembersResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3GetGroupMembersResponse:
        """Test Guardiumconnectorv3GetGroupMembersResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3GetGroupMembersResponse`
        """
        model = Guardiumconnectorv3GetGroupMembersResponse()
        if include_optional:
            return Guardiumconnectorv3GetGroupMembersResponse(
                groups = [
                    ibm_gdsc_sdk_software.models.guardiumconnectorv3_group.guardiumconnectorv3Group(
                        application = '', 
                        description = '', 
                        group_id = 56, 
                        group_type_id = 56, 
                        hierarchical = True, 
                        member_count = 56, 
                        members = [
                            ibm_gdsc_sdk_software.models.guardiumconnectorv3_group_member.guardiumconnectorv3GroupMember(
                                description = '', 
                                member_id = 56, )
                            ], 
                        nested_group_members = [
                            ibm_gdsc_sdk_software.models.guardiumconnectorv3_nested_group_member.guardiumconnectorv3NestedGroupMember(
                                description = '', 
                                group_id = 56, 
                                member_id = 56, )
                            ], 
                        tuple_count = 56, 
                        tuples = '', 
                        type = 56, )
                    ],
                status = ibm_gdsc_sdk_software.models.guardiumconnectorv3_status_response_base.guardiumconnectorv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Guardiumconnectorv3GetGroupMembersResponse(
        )
        """

    def testGuardiumconnectorv3GetGroupMembersResponse(self):
        """Test Guardiumconnectorv3GetGroupMembersResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
