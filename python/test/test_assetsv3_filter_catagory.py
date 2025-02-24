# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.assetsv3_filter_catagory import Assetsv3FilterCatagory

class TestAssetsv3FilterCatagory(unittest.TestCase):
    """Assetsv3FilterCatagory unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3FilterCatagory:
        """Test Assetsv3FilterCatagory
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3FilterCatagory`
        """
        model = Assetsv3FilterCatagory()
        if include_optional:
            return Assetsv3FilterCatagory(
                catagory_id = '',
                date_range = ibm_gdsc_sdk_saas.models.timeline_date_range___timel_line_data_range_object_for_ui_widget_for_appliying_on_assets_list.TimelineDateRange - Timel Line Data Range object for ui widget for appliying on assets list(
                    end = '', 
                    end_number = 56, 
                    end_unit = '', 
                    error = '', 
                    key = '', 
                    start = '', 
                    start_number = 56, 
                    start_unit = '', 
                    type = '', ),
                selected_sub_catagory_list = [
                    ibm_gdsc_sdk_saas.models.filter_sub_query___filter_sub_query_of_a_filter_query_saved_in_template.FilterSubQuery - Filter Sub Query of a Filter Query saved in template(
                        selected_children_list = [
                            ibm_gdsc_sdk_saas.models.filter_sub_catagory_child___child_values_under_filter_sub_category_of_a_filter_category_in_template.FilterSubCatagoryChild - child values under Filter Sub category of a Filter category in template(
                                child_id = '', 
                                child_name = '', )
                            ], 
                        sub_catagory_id = '', 
                        sub_category_value = '', )
                    ],
                sub_catagory_ids = [
                    ''
                    ],
                sub_category_values = [
                    ''
                    ],
                timeline_value_selected = ''
            )
        else:
            return Assetsv3FilterCatagory(
        )
        """

    def testAssetsv3FilterCatagory(self):
        """Test Assetsv3FilterCatagory"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
