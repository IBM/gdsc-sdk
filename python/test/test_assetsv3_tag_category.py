# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.assetsv3_tag_category import Assetsv3TagCategory

class TestAssetsv3TagCategory(unittest.TestCase):
    """Assetsv3TagCategory unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3TagCategory:
        """Test Assetsv3TagCategory
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3TagCategory`
        """
        model = Assetsv3TagCategory()
        if include_optional:
            return Assetsv3TagCategory(
                creation_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                creation_time_utc = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                description = '',
                grouper = '',
                id = '',
                is_delete = True,
                mapped_entity_name = '',
                name = '',
                properties = '',
                purpose = '',
                tags = [
                    ibm_gdsc_sdk_software.models.base_tag_concept_object.Base Tag concept object(
                        creation_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        creation_time_utc = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        description = '', 
                        domain_id = '', 
                        id = '', 
                        is_delete = True, 
                        name = '', 
                        properties = '', 
                        source = '', 
                        updated_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        utc_offset = 56, )
                    ],
                updated_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                utc_offset = 56
            )
        else:
            return Assetsv3TagCategory(
        )
        """

    def testAssetsv3TagCategory(self):
        """Test Assetsv3TagCategory"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
