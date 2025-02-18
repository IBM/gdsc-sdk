# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_risk_event_classifications_list_response import Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse

class TestRiskanalyticscontrollerv3GetRiskEventClassificationsListResponse(unittest.TestCase):
    """Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse:
        """Test Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse`
        """
        model = Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse()
        if include_optional:
            return Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse(
                classification_match_details = [
                    ibm_gdsc_sdk_software.models.riskanalyticsenginev3_classification_match_details.riskanalyticsenginev3ClassificationMatchDetails(
                        class_key = '', 
                        class_value = 1.337, 
                        classification_confidence = 1.337, 
                        classification_nls = '', 
                        model_probability = 1.337, )
                    ]
            )
        else:
            return Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse(
        )
        """

    def testRiskanalyticscontrollerv3GetRiskEventClassificationsListResponse(self):
        """Test Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
