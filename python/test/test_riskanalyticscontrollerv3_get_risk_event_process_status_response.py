# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_risk_event_process_status_response import Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse

class TestRiskanalyticscontrollerv3GetRiskEventProcessStatusResponse(unittest.TestCase):
    """Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse:
        """Test Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse`
        """
        model = Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse()
        if include_optional:
            return Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse(
                feedback_status = 'UNDEFINED_PROCESS_STATUS_TYPE',
                last_run_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                process_status = 'UNDEFINED_PROCESS_STATUS_TYPE'
            )
        else:
            return Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse(
        )
        """

    def testRiskanalyticscontrollerv3GetRiskEventProcessStatusResponse(self):
        """Test Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
