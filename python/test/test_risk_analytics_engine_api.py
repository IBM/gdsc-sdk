# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.api.risk_analytics_engine_api import RiskAnalyticsEngineApi


class TestRiskAnalyticsEngineApi(unittest.TestCase):
    """RiskAnalyticsEngineApi unit test stubs"""

    def setUp(self) -> None:
        self.api = RiskAnalyticsEngineApi()

    def tearDown(self) -> None:
        pass

    def test_risk_analytics_engine_get_lead_generator_config(self) -> None:
        """Test case for risk_analytics_engine_get_lead_generator_config

        Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
        """
        pass

    def test_risk_analytics_engine_update_lead_generator_config(self) -> None:
        """Test case for risk_analytics_engine_update_lead_generator_config

        Summary: Update lead generator config Description: Update the configuration of a leads generator.
        """
        pass


if __name__ == '__main__':
    unittest.main()
