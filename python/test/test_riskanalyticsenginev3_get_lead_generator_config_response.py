# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_get_lead_generator_config_response import Riskanalyticsenginev3GetLeadGeneratorConfigResponse

class TestRiskanalyticsenginev3GetLeadGeneratorConfigResponse(unittest.TestCase):
    """Riskanalyticsenginev3GetLeadGeneratorConfigResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Riskanalyticsenginev3GetLeadGeneratorConfigResponse:
        """Test Riskanalyticsenginev3GetLeadGeneratorConfigResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Riskanalyticsenginev3GetLeadGeneratorConfigResponse`
        """
        model = Riskanalyticsenginev3GetLeadGeneratorConfigResponse()
        if include_optional:
            return Riskanalyticsenginev3GetLeadGeneratorConfigResponse(
                configs = [
                    ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_lead_generator_config.riskanalyticsenginev3LeadGeneratorConfig(
                        is_active = True, 
                        lead_generator_name = '', 
                        lead_generator_params = [
                            ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_lead_generator_config_param_value.riskanalyticsenginev3LeadGeneratorConfigParamValue(
                                name = '', 
                                value = '', )
                            ], )
                    ]
            )
        else:
            return Riskanalyticsenginev3GetLeadGeneratorConfigResponse(
        )
        """

    def testRiskanalyticsenginev3GetLeadGeneratorConfigResponse(self):
        """Test Riskanalyticsenginev3GetLeadGeneratorConfigResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
