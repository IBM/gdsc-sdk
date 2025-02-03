# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.groupbuilderv3_refresh_groups_request import Groupbuilderv3RefreshGroupsRequest

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
