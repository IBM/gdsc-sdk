# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.assetsv3_tags_assigned import Assetsv3TagsAssigned

class TestAssetsv3TagsAssigned(unittest.TestCase):
    """Assetsv3TagsAssigned unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3TagsAssigned:
        """Test Assetsv3TagsAssigned
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3TagsAssigned`
        """
        model = Assetsv3TagsAssigned()
        if include_optional:
            return Assetsv3TagsAssigned(
                asset_id = '',
                tag_id = [
                    ''
                    ]
            )
        else:
            return Assetsv3TagsAssigned(
        )
        """

    def testAssetsv3TagsAssigned(self):
        """Test Assetsv3TagsAssigned"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
