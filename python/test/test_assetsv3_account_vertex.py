# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.assetsv3_account_vertex import Assetsv3AccountVertex

class TestAssetsv3AccountVertex(unittest.TestCase):
    """Assetsv3AccountVertex unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3AccountVertex:
        """Test Assetsv3AccountVertex
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3AccountVertex`
        """
        model = Assetsv3AccountVertex()
        if include_optional:
            return Assetsv3AccountVertex(
                account_type = '',
                description = '',
                extended_properties = [
                    ibm_gdsc_sdk_software.models.custom_property___custom_property_of_a_vertex_to_be_represnted_as_key_value_pairs.CustomProperty - Custom property of a vertex to be represnted as key value pairs(
                        data_type = '', 
                        key = '', 
                        value = '', )
                    ],
                name = '',
                resolution_key = ''
            )
        else:
            return Assetsv3AccountVertex(
        )
        """

    def testAssetsv3AccountVertex(self):
        """Test Assetsv3AccountVertex"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
