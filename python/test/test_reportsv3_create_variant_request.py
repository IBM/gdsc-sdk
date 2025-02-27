# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsv3_create_variant_request import Reportsv3CreateVariantRequest

class TestReportsv3CreateVariantRequest(unittest.TestCase):
    """Reportsv3CreateVariantRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3CreateVariantRequest:
        """Test Reportsv3CreateVariantRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3CreateVariantRequest`
        """
        model = Reportsv3CreateVariantRequest()
        if include_optional:
            return Reportsv3CreateVariantRequest(
                header_id = '',
                rules = [
                    ibm_gdsc_sdk_saas.models.variant_rule_describes_a_given_variant_rule.VariantRule describes a given variant rule(
                        action_if_type = 'UNDEFINED_VARIANT_ACTION_IF', 
                        delimiter = '', 
                        extract_value = '', 
                        matcher = '', 
                        type = 'UNDEFINED_VARIANT_RULE_TYPE', )
                    ],
                variant_name = ''
            )
        else:
            return Reportsv3CreateVariantRequest(
        )
        """

    def testReportsv3CreateVariantRequest(self):
        """Test Reportsv3CreateVariantRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
