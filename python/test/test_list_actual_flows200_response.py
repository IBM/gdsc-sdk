# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.list_actual_flows200_response import ListActualFlows200Response

class TestListActualFlows200Response(unittest.TestCase):
    """ListActualFlows200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListActualFlows200Response:
        """Test ListActualFlows200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListActualFlows200Response`
        """
        model = ListActualFlows200Response()
        if include_optional:
            return ListActualFlows200Response(
                results = [
                    ibm_gdsc_sdk_software.models.actual_flow.ActualFlow(
                        id = 'aaede660-6090-479a-b54f-12345678910', 
                        source = ibm_gdsc_sdk_software.models.flow_node.FlowNode(
                            id = 'arn:aws:ec2:us-east-1:1511931112324:instance/i-097079e7b15331234', 
                            name = 'instance/i-097079e7b15331234', 
                            type = 'ec2-instance', 
                            cloud_account_id = '151193111234', 
                            cloud_region = 'us-east-1', 
                            cloud_provider = 'aws', 
                            resource = ibm_gdsc_sdk_software.models.flow_node_resource.FlowNode_resource(
                                name = 'polar-corplex', ), 
                            vendor_id = 'abcd1234-ab12-ab12-ab12-1234123abcabc', ), 
                        destination = ibm_gdsc_sdk_software.models.flow_node.FlowNode(
                            id = 'arn:aws:ec2:us-east-1:1511931112324:instance/i-097079e7b15331234', 
                            name = 'instance/i-097079e7b15331234', 
                            type = 'ec2-instance', 
                            cloud_account_id = '151193111234', 
                            cloud_region = 'us-east-1', 
                            cloud_provider = 'aws', 
                            vendor_id = 'abcd1234-ab12-ab12-ab12-1234123abcabc', ), 
                        access_types = [
                            'READ'
                            ], 
                        last_seen = 1.337, 
                        first_seen = 1.337, )
                    ],
                next_token = ''
            )
        else:
            return ListActualFlows200Response(
                results = [
                    ibm_gdsc_sdk_software.models.actual_flow.ActualFlow(
                        id = 'aaede660-6090-479a-b54f-12345678910', 
                        source = ibm_gdsc_sdk_software.models.flow_node.FlowNode(
                            id = 'arn:aws:ec2:us-east-1:1511931112324:instance/i-097079e7b15331234', 
                            name = 'instance/i-097079e7b15331234', 
                            type = 'ec2-instance', 
                            cloud_account_id = '151193111234', 
                            cloud_region = 'us-east-1', 
                            cloud_provider = 'aws', 
                            resource = ibm_gdsc_sdk_software.models.flow_node_resource.FlowNode_resource(
                                name = 'polar-corplex', ), 
                            vendor_id = 'abcd1234-ab12-ab12-ab12-1234123abcabc', ), 
                        destination = ibm_gdsc_sdk_software.models.flow_node.FlowNode(
                            id = 'arn:aws:ec2:us-east-1:1511931112324:instance/i-097079e7b15331234', 
                            name = 'instance/i-097079e7b15331234', 
                            type = 'ec2-instance', 
                            cloud_account_id = '151193111234', 
                            cloud_region = 'us-east-1', 
                            cloud_provider = 'aws', 
                            vendor_id = 'abcd1234-ab12-ab12-ab12-1234123abcabc', ), 
                        access_types = [
                            'READ'
                            ], 
                        last_seen = 1.337, 
                        first_seen = 1.337, )
                    ],
                next_token = '',
        )
        """

    def testListActualFlows200Response(self):
        """Test ListActualFlows200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
