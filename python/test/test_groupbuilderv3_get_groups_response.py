# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.groupbuilderv3_get_groups_response import Groupbuilderv3GetGroupsResponse

class TestGroupbuilderv3GetGroupsResponse(unittest.TestCase):
    """Groupbuilderv3GetGroupsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Groupbuilderv3GetGroupsResponse:
        """Test Groupbuilderv3GetGroupsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Groupbuilderv3GetGroupsResponse`
        """
        model = Groupbuilderv3GetGroupsResponse()
        if include_optional:
            return Groupbuilderv3GetGroupsResponse(
                groups = [
                    ibm_gdsc_sdk_software.models.groupbuilderv3_group.groupbuilderv3Group(
                        access_level = 56, 
                        description = '', 
                        flattened_member_count = 56, 
                        group_id = 56, 
                        group_type_id = 56, 
                        last_sync_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        ldap_config = ibm_gdsc_sdk_software.models.groupbuilderv3_ldap_config.groupbuilderv3LdapConfig(
                            attributes = [
                                ''
                                ], 
                            bind_group_id = 56, 
                            bind_password = '', 
                            clear_group = True, 
                            filter = '', 
                            filter_scope = 56, 
                            import_limit = 56, 
                            ldap_group_name = '', 
                            ldap_id = '', 
                            member_prefix = '', ), 
                        member_count = 56, 
                        members = [
                            ibm_gdsc_sdk_software.models.groupbuilderv3_group_member.groupbuilderv3GroupMember(
                                member_id = '', 
                                name = '', )
                            ], 
                        name = '', 
                        nested = True, 
                        nested_group_members = [
                            ibm_gdsc_sdk_software.models.groupbuilderv3_nested_group_member.groupbuilderv3NestedGroupMember(
                                group_id = 56, 
                                name = '', 
                                nested_member_id = 56, )
                            ], 
                        next_sync_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        sync_inactive_code = 56, 
                        sync_source = '', 
                        synced = True, 
                        tuple_count = 56, 
                        tuple_params = [
                            ''
                            ], )
                    ],
                status = ibm_gdsc_sdk_software.models.groupbuilderv3_status_response_base.groupbuilderv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Groupbuilderv3GetGroupsResponse(
        )
        """

    def testGroupbuilderv3GetGroupsResponse(self):
        """Test Groupbuilderv3GetGroupsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
