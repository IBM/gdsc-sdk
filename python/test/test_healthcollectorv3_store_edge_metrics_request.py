# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.healthcollectorv3_store_edge_metrics_request import Healthcollectorv3StoreEdgeMetricsRequest

class TestHealthcollectorv3StoreEdgeMetricsRequest(unittest.TestCase):
    """Healthcollectorv3StoreEdgeMetricsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Healthcollectorv3StoreEdgeMetricsRequest:
        """Test Healthcollectorv3StoreEdgeMetricsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Healthcollectorv3StoreEdgeMetricsRequest`
        """
        model = Healthcollectorv3StoreEdgeMetricsRequest()
        if include_optional:
            return Healthcollectorv3StoreEdgeMetricsRequest(
                data = ibm_gdsc_sdk_software.models.metrics_information_in_the_form_of_a_json_string_from_the_edge_node.metrics information in the form of a json string from the edge node()
            )
        else:
            return Healthcollectorv3StoreEdgeMetricsRequest(
        )
        """

    def testHealthcollectorv3StoreEdgeMetricsRequest(self):
        """Test Healthcollectorv3StoreEdgeMetricsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
