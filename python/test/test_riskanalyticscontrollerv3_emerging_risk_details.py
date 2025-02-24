# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_emerging_risk_details import Riskanalyticscontrollerv3EmergingRiskDetails

class TestRiskanalyticscontrollerv3EmergingRiskDetails(unittest.TestCase):
    """Riskanalyticscontrollerv3EmergingRiskDetails unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Riskanalyticscontrollerv3EmergingRiskDetails:
        """Test Riskanalyticscontrollerv3EmergingRiskDetails
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Riskanalyticscontrollerv3EmergingRiskDetails`
        """
        model = Riskanalyticscontrollerv3EmergingRiskDetails()
        if include_optional:
            return Riskanalyticscontrollerv3EmergingRiskDetails(
                end_max_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                end_max_value = 56,
                peak_max_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                peak_max_value = 56,
                previous_max_value = 56,
                risk_features = '',
                start_max_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                start_max_value = 56
            )
        else:
            return Riskanalyticscontrollerv3EmergingRiskDetails(
        )
        """

    def testRiskanalyticscontrollerv3EmergingRiskDetails(self):
        """Test Riskanalyticscontrollerv3EmergingRiskDetails"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
