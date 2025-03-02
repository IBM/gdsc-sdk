# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_lead_generator_config_param_value import Riskanalyticsenginev3LeadGeneratorConfigParamValue

class TestRiskanalyticsenginev3LeadGeneratorConfigParamValue(unittest.TestCase):
    """Riskanalyticsenginev3LeadGeneratorConfigParamValue unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Riskanalyticsenginev3LeadGeneratorConfigParamValue:
        """Test Riskanalyticsenginev3LeadGeneratorConfigParamValue
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Riskanalyticsenginev3LeadGeneratorConfigParamValue`
        """
        model = Riskanalyticsenginev3LeadGeneratorConfigParamValue()
        if include_optional:
            return Riskanalyticsenginev3LeadGeneratorConfigParamValue(
                name = '',
                value = ''
            )
        else:
            return Riskanalyticsenginev3LeadGeneratorConfigParamValue(
        )
        """

    def testRiskanalyticsenginev3LeadGeneratorConfigParamValue(self):
        """Test Riskanalyticsenginev3LeadGeneratorConfigParamValue"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
