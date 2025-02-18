# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.assetsv3_application_vertex import Assetsv3ApplicationVertex

class TestAssetsv3ApplicationVertex(unittest.TestCase):
    """Assetsv3ApplicationVertex unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3ApplicationVertex:
        """Test Assetsv3ApplicationVertex
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3ApplicationVertex`
        """
        model = Assetsv3ApplicationVertex()
        if include_optional:
            return Assetsv3ApplicationVertex(
                app_id = '',
                application_database = [
                    ibm_gdsc_sdk_software.models.connection_edge___connection_edge_defined_from_one_vertex_to_another/_from_source_to_target_with_identifier_as_unqiue_identification.ConnectionEdge - Connection edge defined from one vertex to another. from source to target with identifier as unqiue identification(
                        identifier = '', )
                    ],
                application_endpoint = [
                    ibm_gdsc_sdk_software.models.connection_edge___connection_edge_defined_from_one_vertex_to_another/_from_source_to_target_with_identifier_as_unqiue_identification.ConnectionEdge - Connection edge defined from one vertex to another. from source to target with identifier as unqiue identification(
                        identifier = '', )
                    ],
                application_host = [
                    ibm_gdsc_sdk_software.models.connection_edge___connection_edge_defined_from_one_vertex_to_another/_from_source_to_target_with_identifier_as_unqiue_identification.ConnectionEdge - Connection edge defined from one vertex to another. from source to target with identifier as unqiue identification(
                        identifier = '', )
                    ],
                application_ip = [
                    ibm_gdsc_sdk_software.models.connection_edge___connection_edge_defined_from_one_vertex_to_another/_from_source_to_target_with_identifier_as_unqiue_identification.ConnectionEdge - Connection edge defined from one vertex to another. from source to target with identifier as unqiue identification(
                        identifier = '', )
                    ],
                application_name = '',
                application_storage = [
                    ibm_gdsc_sdk_software.models.connection_edge___connection_edge_defined_from_one_vertex_to_another/_from_source_to_target_with_identifier_as_unqiue_identification.ConnectionEdge - Connection edge defined from one vertex to another. from source to target with identifier as unqiue identification(
                        identifier = '', )
                    ],
                application_sub_type = '',
                application_subscription = [
                    ibm_gdsc_sdk_software.models.connection_edge___connection_edge_defined_from_one_vertex_to_another/_from_source_to_target_with_identifier_as_unqiue_identification.ConnectionEdge - Connection edge defined from one vertex to another. from source to target with identifier as unqiue identification(
                        identifier = '', )
                    ],
                application_type = '',
                category = '',
                criticality = 'LEVEL_UNKNOWN',
                extended_properties = [
                    ibm_gdsc_sdk_software.models.custom_property___custom_property_of_a_vertex_to_be_represnted_as_key_value_pairs.CustomProperty - Custom property of a vertex to be represnted as key value pairs(
                        data_type = '', 
                        key = '', 
                        value = '', )
                    ],
                last_used = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                owner = [
                    ''
                    ],
                parent_application = '',
                resolution_key = '',
                risk_level = 'LEVEL_UNKNOWN',
                service_type = '',
                version = ''
            )
        else:
            return Assetsv3ApplicationVertex(
        )
        """

    def testAssetsv3ApplicationVertex(self):
        """Test Assetsv3ApplicationVertex"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
