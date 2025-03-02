# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsv3_get_variant_response import Reportsv3GetVariantResponse

class TestReportsv3GetVariantResponse(unittest.TestCase):
    """Reportsv3GetVariantResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3GetVariantResponse:
        """Test Reportsv3GetVariantResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3GetVariantResponse`
        """
        model = Reportsv3GetVariantResponse()
        if include_optional:
            return Reportsv3GetVariantResponse(
                variant = ibm_gdsc_sdk_saas.models.variant_details_is_the_object_that_fully_describes_a_variant.VariantDetails is the object that fully describes a variant(
                    header_id = '', 
                    last_run = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    last_run_error = '', 
                    rules = [
                        ibm_gdsc_sdk_saas.models.variant_rule_describes_a_given_variant_rule.VariantRule describes a given variant rule(
                            action_if_type = 'UNDEFINED_VARIANT_ACTION_IF', 
                            delimiter = '', 
                            extract_value = '', 
                            matcher = '', 
                            type = 'UNDEFINED_VARIANT_RULE_TYPE', )
                        ], 
                    total_count = 56, 
                    variant_id = '', 
                    variant_name = '', 
                    variant_table = '', )
            )
        else:
            return Reportsv3GetVariantResponse(
        )
        """

    def testReportsv3GetVariantResponse(self):
        """Test Reportsv3GetVariantResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
