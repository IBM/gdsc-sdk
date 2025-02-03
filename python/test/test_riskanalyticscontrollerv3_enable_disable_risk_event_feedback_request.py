# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

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
