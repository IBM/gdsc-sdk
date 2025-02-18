# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.guardiumconnectorv3_aggregation_view_list_object import Guardiumconnectorv3AggregationViewListObject

class TestGuardiumconnectorv3AggregationViewListObject(unittest.TestCase):
    """Guardiumconnectorv3AggregationViewListObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3AggregationViewListObject:
        """Test Guardiumconnectorv3AggregationViewListObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3AggregationViewListObject`
        """
        model = Guardiumconnectorv3AggregationViewListObject()
        if include_optional:
            return Guardiumconnectorv3AggregationViewListObject(
                agg_action_error = '',
                agg_action_health_status = 56,
                agg_type = '',
                error = 56,
                unit = ''
            )
        else:
            return Guardiumconnectorv3AggregationViewListObject(
        )
        """

    def testGuardiumconnectorv3AggregationViewListObject(self):
        """Test Guardiumconnectorv3AggregationViewListObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
