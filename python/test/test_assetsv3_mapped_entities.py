# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.assetsv3_mapped_entities import Assetsv3MappedEntities

class TestAssetsv3MappedEntities(unittest.TestCase):
    """Assetsv3MappedEntities unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3MappedEntities:
        """Test Assetsv3MappedEntities
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3MappedEntities`
        """
        model = Assetsv3MappedEntities()
        if include_optional:
            return Assetsv3MappedEntities(
                attributes = ibm_gdsc_sdk_software.models.assetsv3_attributes.assetsv3Attributes(
                    critical_vulnerability_count = '', 
                    entity_id = '', 
                    entity_name = '', 
                    grouper_id = '', 
                    major_vulnerability_count = '', 
                    sensitive_data_count = '', 
                    status_type = 'NA', 
                    type = '', ),
                children = [
                    ibm_gdsc_sdk_software.models.assetsv3_mapped_entities.assetsv3MappedEntities(
                        attributes = ibm_gdsc_sdk_software.models.assetsv3_attributes.assetsv3Attributes(
                            critical_vulnerability_count = '', 
                            entity_id = '', 
                            entity_name = '', 
                            grouper_id = '', 
                            major_vulnerability_count = '', 
                            sensitive_data_count = '', 
                            status_type = 'NA', 
                            type = '', ), 
                        children = [
                            ibm_gdsc_sdk_software.models.assetsv3_mapped_entities.assetsv3MappedEntities(
                                children = , 
                                name = '', 
                                parent_child_count = '', 
                                search_term = '', )
                            ], 
                        name = '', 
                        parent_child_count = '', 
                        search_term = '', )
                    ],
                name = '',
                parent_child_count = '',
                search_term = ''
            )
        else:
            return Assetsv3MappedEntities(
        )
        """

    def testAssetsv3MappedEntities(self):
        """Test Assetsv3MappedEntities"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
