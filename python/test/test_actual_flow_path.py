# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.actual_flow_path import ActualFlowPath

class TestActualFlowPath(unittest.TestCase):
    """ActualFlowPath unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ActualFlowPath:
        """Test ActualFlowPath
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ActualFlowPath`
        """
        model = ActualFlowPath()
        if include_optional:
            return ActualFlowPath(
                id = '',
                flow_id = '',
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
                    resource = ibm_gdsc_sdk_software.models.flow_node_resource.FlowNode_resource(
                        name = 'polar-corplex', ), 
                    vendor_id = 'abcd1234-ab12-ab12-ab12-1234123abcabc', ),
                access_type = 'READ',
                username = '',
                trustee_id = '',
                last_seen = 1.337,
                first_seen = 1.337,
                path = [
                    ibm_gdsc_sdk_software.models.flow_node.FlowNode(
                        id = 'arn:aws:ec2:us-east-1:1511931112324:instance/i-097079e7b15331234', 
                        name = 'instance/i-097079e7b15331234', 
                        type = 'ec2-instance', 
                        cloud_account_id = '151193111234', 
                        cloud_region = 'us-east-1', 
                        cloud_provider = 'aws', 
                        resource = ibm_gdsc_sdk_software.models.flow_node_resource.FlowNode_resource(
                            name = 'polar-corplex', ), 
                        vendor_id = 'abcd1234-ab12-ab12-ab12-1234123abcabc', )
                    ]
            )
        else:
            return ActualFlowPath(
                id = '',
                flow_id = '',
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
                    resource = ibm_gdsc_sdk_software.models.flow_node_resource.FlowNode_resource(
                        name = 'polar-corplex', ), 
                    vendor_id = 'abcd1234-ab12-ab12-ab12-1234123abcabc', ),
                access_type = 'READ',
                last_seen = 1.337,
                first_seen = 1.337,
                path = [
                    ibm_gdsc_sdk_software.models.flow_node.FlowNode(
                        id = 'arn:aws:ec2:us-east-1:1511931112324:instance/i-097079e7b15331234', 
                        name = 'instance/i-097079e7b15331234', 
                        type = 'ec2-instance', 
                        cloud_account_id = '151193111234', 
                        cloud_region = 'us-east-1', 
                        cloud_provider = 'aws', 
                        resource = ibm_gdsc_sdk_software.models.flow_node_resource.FlowNode_resource(
                            name = 'polar-corplex', ), 
                        vendor_id = 'abcd1234-ab12-ab12-ab12-1234123abcabc', )
                    ],
        )
        """

    def testActualFlowPath(self):
        """Test ActualFlowPath"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
