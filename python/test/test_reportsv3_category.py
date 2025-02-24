# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsv3_category import Reportsv3Category

class TestReportsv3Category(unittest.TestCase):
    """Reportsv3Category unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3Category:
        """Test Reportsv3Category
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3Category`
        """
        model = Reportsv3Category()
        if include_optional:
            return Reportsv3Category(
                category_description = '',
                category_id = '',
                category_name = '',
                multi_version = True,
                versions = [
                    ibm_gdsc_sdk_saas.models.data_for_a_version_inside_a_category_that_is_a_multi_version_type.Data for a version inside a category that is a multi-version type(
                        header_map = {
                            'key' : ''
                            }, 
                        name = '', 
                        primary = True, 
                        skip_join_only = True, 
                        table_map = {
                            'key' : ibm_gdsc_sdk_saas.models.array_of_table_names.Array of table names(
                                table_names = [
                                    ''
                                    ], )
                            }, )
                    ]
            )
        else:
            return Reportsv3Category(
        )
        """

    def testReportsv3Category(self):
        """Test Reportsv3Category"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
