# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.assetsv3_subscription_vertex import Assetsv3SubscriptionVertex

class TestAssetsv3SubscriptionVertex(unittest.TestCase):
    """Assetsv3SubscriptionVertex unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3SubscriptionVertex:
        """Test Assetsv3SubscriptionVertex
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3SubscriptionVertex`
        """
        model = Assetsv3SubscriptionVertex()
        if include_optional:
            return Assetsv3SubscriptionVertex(
                duration = '',
                end_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                extended_properties = [
                    ibm_gdsc_sdk_saas.models.custom_property___custom_property_of_a_vertex_to_be_represnted_as_key_value_pairs.CustomProperty - Custom property of a vertex to be represnted as key value pairs(
                        data_type = '', 
                        key = '', 
                        value = '', )
                    ],
                name = '',
                resolution_key = '',
                start_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                subscription_account = [
                    ibm_gdsc_sdk_saas.models.connection_edge___connection_edge_defined_from_one_vertex_to_another/_from_source_to_target_with_identifier_as_unqiue_identification.ConnectionEdge - Connection edge defined from one vertex to another. from source to target with identifier as unqiue identification(
                        identifier = '', )
                    ],
                subscription_id = '',
                type = ''
            )
        else:
            return Assetsv3SubscriptionVertex(
        )
        """

    def testAssetsv3SubscriptionVertex(self):
        """Test Assetsv3SubscriptionVertex"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
