# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.actual_flows_summary import ActualFlowsSummary

class TestActualFlowsSummary(unittest.TestCase):
    """ActualFlowsSummary unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ActualFlowsSummary:
        """Test ActualFlowsSummary
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ActualFlowsSummary`
        """
        model = ActualFlowsSummary()
        if include_optional:
            return ActualFlowsSummary(
                flows_count = 30,
                sources_summary = ibm_gdsc_sdk_software.models.flow_node_summary.FlowNodeSummary(
                    types_count = [
                        ibm_gdsc_sdk_software.models.types_count_inner.TypesCount_inner(
                            type = 'compute', 
                            count = 43, )
                        ], 
                    cloud_accounts_count = [
                        ibm_gdsc_sdk_software.models.cloud_account_count_inner.CloudAccountCount_inner(
                            cloud_account_id = '12345678910', 
                            count = 10, )
                        ], 
                    cloud_regions_count = [
                        ibm_gdsc_sdk_software.models.cloud_region_count_inner.CloudRegionCount_inner(
                            cloud_region = 'eu-west-3', 
                            count = 7, )
                        ], ),
                destinations_summary = ibm_gdsc_sdk_software.models.flow_node_summary.FlowNodeSummary(
                    types_count = [
                        ibm_gdsc_sdk_software.models.types_count_inner.TypesCount_inner(
                            type = 'compute', 
                            count = 43, )
                        ], 
                    cloud_accounts_count = [
                        ibm_gdsc_sdk_software.models.cloud_account_count_inner.CloudAccountCount_inner(
                            cloud_account_id = '12345678910', 
                            count = 10, )
                        ], 
                    cloud_regions_count = [
                        ibm_gdsc_sdk_software.models.cloud_region_count_inner.CloudRegionCount_inner(
                            cloud_region = 'eu-west-3', 
                            count = 7, )
                        ], ),
                access_types_count = [
                    ibm_gdsc_sdk_software.models.access_type_count_inner.AccessTypeCount_inner(
                        access_type = 'READ', 
                        count = 3, )
                    ]
            )
        else:
            return ActualFlowsSummary(
                flows_count = 30,
                sources_summary = ibm_gdsc_sdk_software.models.flow_node_summary.FlowNodeSummary(
                    types_count = [
                        ibm_gdsc_sdk_software.models.types_count_inner.TypesCount_inner(
                            type = 'compute', 
                            count = 43, )
                        ], 
                    cloud_accounts_count = [
                        ibm_gdsc_sdk_software.models.cloud_account_count_inner.CloudAccountCount_inner(
                            cloud_account_id = '12345678910', 
                            count = 10, )
                        ], 
                    cloud_regions_count = [
                        ibm_gdsc_sdk_software.models.cloud_region_count_inner.CloudRegionCount_inner(
                            cloud_region = 'eu-west-3', 
                            count = 7, )
                        ], ),
                destinations_summary = ibm_gdsc_sdk_software.models.flow_node_summary.FlowNodeSummary(
                    types_count = [
                        ibm_gdsc_sdk_software.models.types_count_inner.TypesCount_inner(
                            type = 'compute', 
                            count = 43, )
                        ], 
                    cloud_accounts_count = [
                        ibm_gdsc_sdk_software.models.cloud_account_count_inner.CloudAccountCount_inner(
                            cloud_account_id = '12345678910', 
                            count = 10, )
                        ], 
                    cloud_regions_count = [
                        ibm_gdsc_sdk_software.models.cloud_region_count_inner.CloudRegionCount_inner(
                            cloud_region = 'eu-west-3', 
                            count = 7, )
                        ], ),
                access_types_count = [
                    ibm_gdsc_sdk_software.models.access_type_count_inner.AccessTypeCount_inner(
                        access_type = 'READ', 
                        count = 3, )
                    ],
        )
        """

    def testActualFlowsSummary(self):
        """Test ActualFlowsSummary"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
