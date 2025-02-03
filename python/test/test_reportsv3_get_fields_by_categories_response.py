# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.reportsv3_get_fields_by_categories_response import Reportsv3GetFieldsByCategoriesResponse

class TestReportsv3GetFieldsByCategoriesResponse(unittest.TestCase):
    """Reportsv3GetFieldsByCategoriesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3GetFieldsByCategoriesResponse:
        """Test Reportsv3GetFieldsByCategoriesResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3GetFieldsByCategoriesResponse`
        """
        model = Reportsv3GetFieldsByCategoriesResponse()
        if include_optional:
            return Reportsv3GetFieldsByCategoriesResponse(
                headers = [
                    ibm_gdsc_sdk_software.models.header_that_has_the_header_id,_name_in_the_translated_value_and_field_type.Header that has the header ID, name in the translated value and field type(
                        can_be_used_in_chart = True, 
                        field_name = ibm_gdsc_sdk_software.models.reportsv3_field_name.reportsv3FieldName(
                            customized_value = '', 
                            nls_key = '', 
                            nls_value = '', ), 
                        group_type_id = 56, 
                        header_category = '', 
                        header_description = ibm_gdsc_sdk_software.models.reportsv3_header_description.reportsv3HeaderDescription(
                            nls_key = '', 
                            nls_value = '', ), 
                        header_id = '', 
                        header_name = '', 
                        is_recommended = True, 
                        table_name = '', 
                        type = 'UNDEFINED_TYPE', 
                        type_length = 56, )
                    ]
            )
        else:
            return Reportsv3GetFieldsByCategoriesResponse(
        )
        """

    def testReportsv3GetFieldsByCategoriesResponse(self):
        """Test Reportsv3GetFieldsByCategoriesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
