# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.assetsv3_get_filter_template_response import Assetsv3GetFilterTemplateResponse

class TestAssetsv3GetFilterTemplateResponse(unittest.TestCase):
    """Assetsv3GetFilterTemplateResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3GetFilterTemplateResponse:
        """Test Assetsv3GetFilterTemplateResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3GetFilterTemplateResponse`
        """
        model = Assetsv3GetFilterTemplateResponse()
        if include_optional:
            return Assetsv3GetFilterTemplateResponse(
                hide_assets_banner = True,
                templates = [
                    ibm_gdsc_sdk_saas.models.assetsv3_filter_template.assetsv3FilterTemplate(
                        colummns_list = [
                            ibm_gdsc_sdk_saas.models.table_column___table_column_details_for_manage_assets_screen_used_to_save_in_preset.TableColumn - Table column details for manage assets screen used to save in preset(
                                default = True, 
                                default_order = 56, 
                                fixed = True, 
                                header = '', 
                                id = '', 
                                nls_key = '', 
                                select = True, )
                            ], 
                        count = '', 
                        created_by = '', 
                        created_date = '', 
                        dashboard_template = True, 
                        description = '', 
                        id = '', 
                        selected_filters = [
                            ibm_gdsc_sdk_saas.models.filter_catagory___seleted_filter_catagory_details_for_appliying_on_assets_list_saved_in_template.FilterCatagory - Seleted Filter Catagory details for appliying on assets list saved in template(
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
                                timeline_value_selected = '', )
                            ], 
                        template_id = '', 
                        title = '', 
                        updated_date = '', )
                    ]
            )
        else:
            return Assetsv3GetFilterTemplateResponse(
        )
        """

    def testAssetsv3GetFilterTemplateResponse(self):
        """Test Assetsv3GetFilterTemplateResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
