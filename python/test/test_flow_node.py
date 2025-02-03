# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.flow_node import FlowNode

class TestFlowNode(unittest.TestCase):
    """FlowNode unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FlowNode:
        """Test FlowNode
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FlowNode`
        """
        model = FlowNode()
        if include_optional:
            return FlowNode(
                id = 'arn:aws:ec2:us-east-1:1511931112324:instance/i-097079e7b15331234',
                name = 'instance/i-097079e7b15331234',
                type = 'ec2-instance',
                cloud_account_id = '151193111234',
                cloud_region = 'us-east-1',
                cloud_provider = 'aws',
                resource = ibm_gdsc_sdk_software.models.flow_node_resource.FlowNode_resource(
                    name = 'polar-corplex', ),
                vendor_id = 'abcd1234-ab12-ab12-ab12-1234123abcabc'
            )
        else:
            return FlowNode(
                id = 'arn:aws:ec2:us-east-1:1511931112324:instance/i-097079e7b15331234',
                type = 'ec2-instance',
                cloud_account_id = '151193111234',
                cloud_provider = 'aws',
        )
        """

    def testFlowNode(self):
        """Test FlowNode"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
