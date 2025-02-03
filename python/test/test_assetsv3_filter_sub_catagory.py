# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.assetsv3_filter_sub_catagory import Assetsv3FilterSubCatagory

class TestAssetsv3FilterSubCatagory(unittest.TestCase):
    """Assetsv3FilterSubCatagory unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3FilterSubCatagory:
        """Test Assetsv3FilterSubCatagory
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3FilterSubCatagory`
        """
        model = Assetsv3FilterSubCatagory()
        if include_optional:
            return Assetsv3FilterSubCatagory(
                selected_children_list = [
                    ibm_gdsc_sdk_software.models.filter_sub_catagory_child___child_values_under_filter_sub_category_of_a_filter_category_in_template.FilterSubCatagoryChild - child values under Filter Sub category of a Filter category in template(
                        child_id = '', 
                        child_name = '', )
                    ],
                sub_catagory_id = '',
                sub_category_value = ''
            )
        else:
            return Assetsv3FilterSubCatagory(
        )
        """

    def testAssetsv3FilterSubCatagory(self):
        """Test Assetsv3FilterSubCatagory"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
