# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.guardiumconnectorv3_block_user_request import Guardiumconnectorv3BlockUserRequest

class TestGuardiumconnectorv3BlockUserRequest(unittest.TestCase):
    """Guardiumconnectorv3BlockUserRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3BlockUserRequest:
        """Test Guardiumconnectorv3BlockUserRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3BlockUserRequest`
        """
        model = Guardiumconnectorv3BlockUserRequest()
        if include_optional:
            return Guardiumconnectorv3BlockUserRequest(
                destination = ibm_gdsc_sdk_software.models.guardiumconnectorv3_block_where.guardiumconnectorv3BlockWhere(
                    config_id = '', 
                    guardium_id = '', ),
                details = ibm_gdsc_sdk_software.models.guardiumconnectorv3_block_what.guardiumconnectorv3BlockWhat(
                    bdbname = '', 
                    bip = '', 
                    bport = '', 
                    buser = '', )
            )
        else:
            return Guardiumconnectorv3BlockUserRequest(
        )
        """

    def testGuardiumconnectorv3BlockUserRequest(self):
        """Test Guardiumconnectorv3BlockUserRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
