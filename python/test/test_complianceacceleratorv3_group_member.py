# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.complianceacceleratorv3_group_member import Complianceacceleratorv3GroupMember

class TestComplianceacceleratorv3GroupMember(unittest.TestCase):
    """Complianceacceleratorv3GroupMember unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Complianceacceleratorv3GroupMember:
        """Test Complianceacceleratorv3GroupMember
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Complianceacceleratorv3GroupMember`
        """
        model = Complianceacceleratorv3GroupMember()
        if include_optional:
            return Complianceacceleratorv3GroupMember(
                member_id = '',
                name = ''
            )
        else:
            return Complianceacceleratorv3GroupMember(
        )
        """

    def testComplianceacceleratorv3GroupMember(self):
        """Test Complianceacceleratorv3GroupMember"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
