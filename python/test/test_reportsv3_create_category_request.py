# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsv3_create_category_request import Reportsv3CreateCategoryRequest

class TestReportsv3CreateCategoryRequest(unittest.TestCase):
    """Reportsv3CreateCategoryRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3CreateCategoryRequest:
        """Test Reportsv3CreateCategoryRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3CreateCategoryRequest`
        """
        model = Reportsv3CreateCategoryRequest()
        if include_optional:
            return Reportsv3CreateCategoryRequest(
                category = ibm_gdsc_sdk_saas.models.category_that_have_the_category_id,_the_category_name_translated_value,_tables_and_timestamp.Category that have the category ID, the category name translated value, tables and timestamp(
                    category_description = '', 
                    category_name = '', 
                    category_tables = [
                        ''
                        ], 
                    timestamp_mapping = [
                        ibm_gdsc_sdk_saas.models.reportsv3_timestamp_mapping.reportsv3TimestampMapping(
                            level = 56, 
                            table_name = '', 
                            timestamp_header_id = '', 
                            timestamp_header_name = '', )
                        ], )
            )
        else:
            return Reportsv3CreateCategoryRequest(
        )
        """

    def testReportsv3CreateCategoryRequest(self):
        """Test Reportsv3CreateCategoryRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
