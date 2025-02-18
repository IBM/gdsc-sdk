# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request import Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest

class TestRiskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest(unittest.TestCase):
    """Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest:
        """Test Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest`
        """
        model = Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest()
        if include_optional:
            return Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest(
                action = 'UNDEFINED_ACTION_TYPE'
            )
        else:
            return Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest(
        )
        """

    def testRiskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest(self):
        """Test Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
