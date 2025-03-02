# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.analyticseventsv3_post_qs_advisor_risk_request import Analyticseventsv3PostQSAdvisorRiskRequest

class TestAnalyticseventsv3PostQSAdvisorRiskRequest(unittest.TestCase):
    """Analyticseventsv3PostQSAdvisorRiskRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Analyticseventsv3PostQSAdvisorRiskRequest:
        """Test Analyticseventsv3PostQSAdvisorRiskRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Analyticseventsv3PostQSAdvisorRiskRequest`
        """
        model = Analyticseventsv3PostQSAdvisorRiskRequest()
        if include_optional:
            return Analyticseventsv3PostQSAdvisorRiskRequest(
                origin = 'UNDEFINED_ORIGIN',
                origin_data = '',
                target_receivers = [
                    ibm_gdsc_sdk_software.models.schedulerv3_recipient.schedulerv3Recipient(
                        integration_id = '', 
                        label = '', 
                        template_id = '', 
                        type = 'UNDEFINED_RECTYPE', 
                        value = '', )
                    ],
                template_data = {
                    'key' : ''
                    },
                title = ''
            )
        else:
            return Analyticseventsv3PostQSAdvisorRiskRequest(
        )
        """

    def testAnalyticseventsv3PostQSAdvisorRiskRequest(self):
        """Test Analyticseventsv3PostQSAdvisorRiskRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
