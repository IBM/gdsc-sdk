# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_additional_info import Riskanalyticsenginev3AdditionalInfo

class TestRiskanalyticsenginev3AdditionalInfo(unittest.TestCase):
    """Riskanalyticsenginev3AdditionalInfo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Riskanalyticsenginev3AdditionalInfo:
        """Test Riskanalyticsenginev3AdditionalInfo
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Riskanalyticsenginev3AdditionalInfo`
        """
        model = Riskanalyticsenginev3AdditionalInfo()
        if include_optional:
            return Riskanalyticsenginev3AdditionalInfo(
                key = '',
                type = 'UNDEFINED_TYPE',
                value = ''
            )
        else:
            return Riskanalyticsenginev3AdditionalInfo(
        )
        """

    def testRiskanalyticsenginev3AdditionalInfo(self):
        """Test Riskanalyticsenginev3AdditionalInfo"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
