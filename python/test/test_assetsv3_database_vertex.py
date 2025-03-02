# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.assetsv3_database_vertex import Assetsv3DatabaseVertex

class TestAssetsv3DatabaseVertex(unittest.TestCase):
    """Assetsv3DatabaseVertex unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3DatabaseVertex:
        """Test Assetsv3DatabaseVertex
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3DatabaseVertex`
        """
        model = Assetsv3DatabaseVertex()
        if include_optional:
            return Assetsv3DatabaseVertex(
                catalog = '',
                criticality = 'LEVEL_UNKNOWN',
                database_host = [
                    ibm_gdsc_sdk_saas.models.connection_edge___connection_edge_defined_from_one_vertex_to_another/_from_source_to_target_with_identifier_as_unqiue_identification.ConnectionEdge - Connection edge defined from one vertex to another. from source to target with identifier as unqiue identification(
                        identifier = '', )
                    ],
                database_ip = [
                    ibm_gdsc_sdk_saas.models.connection_edge___connection_edge_defined_from_one_vertex_to_another/_from_source_to_target_with_identifier_as_unqiue_identification.ConnectionEdge - Connection edge defined from one vertex to another. from source to target with identifier as unqiue identification(
                        identifier = '', )
                    ],
                database_name = '',
                database_sub_type = '',
                database_subscription = [
                    ibm_gdsc_sdk_saas.models.connection_edge___connection_edge_defined_from_one_vertex_to_another/_from_source_to_target_with_identifier_as_unqiue_identification.ConnectionEdge - Connection edge defined from one vertex to another. from source to target with identifier as unqiue identification(
                        identifier = '', )
                    ],
                database_type = '',
                description = '',
                extended_properties = [
                    ibm_gdsc_sdk_saas.models.custom_property___custom_property_of_a_vertex_to_be_represnted_as_key_value_pairs.CustomProperty - Custom property of a vertex to be represnted as key value pairs(
                        data_type = '', 
                        key = '', 
                        value = '', )
                    ],
                owner = [
                    ''
                    ],
                resolution_key = '',
                risk_level = 'LEVEL_UNKNOWN',
                schema_name = '',
                service_name = ''
            )
        else:
            return Assetsv3DatabaseVertex(
        )
        """

    def testAssetsv3DatabaseVertex(self):
        """Test Assetsv3DatabaseVertex"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
