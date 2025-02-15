# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.api.risk_analytics_controller_api import RiskAnalyticsControllerApi


class TestRiskAnalyticsControllerApi(unittest.TestCase):
    """RiskAnalyticsControllerApi unit test stubs"""

    def setUp(self) -> None:
        self.api = RiskAnalyticsControllerApi()

    def tearDown(self) -> None:
        pass

    def test_risk_analytics_controller_enable_disable_risk_event_feedback(self) -> None:
        """Test case for risk_analytics_controller_enable_disable_risk_event_feedback

        Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
        """
        pass

    def test_risk_analytics_controller_enable_disable_risk_event_process(self) -> None:
        """Test case for risk_analytics_controller_enable_disable_risk_event_process

        Summary: Enable disable risk event process Description: Enable or disable the risk event process.
        """
        pass

    def test_risk_analytics_controller_get_all_classifications_list(self) -> None:
        """Test case for risk_analytics_controller_get_all_classifications_list

        Summary: Get all classifications Description: Get all possible classifications for a risk event.
        """
        pass

    def test_risk_analytics_controller_get_risk_event_classifications_list(self) -> None:
        """Test case for risk_analytics_controller_get_risk_event_classifications_list

        Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.
        """
        pass

    def test_risk_analytics_controller_get_risk_event_data_for_summarization(self) -> None:
        """Test case for risk_analytics_controller_get_risk_event_data_for_summarization

        Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
        """
        pass

    def test_risk_analytics_controller_get_risk_event_details(self) -> None:
        """Test case for risk_analytics_controller_get_risk_event_details

        Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
        """
        pass

    def test_risk_analytics_controller_get_risk_event_process_status(self) -> None:
        """Test case for risk_analytics_controller_get_risk_event_process_status

        Summary: Get risk event process status Description: Get the risk event process status.
        """
        pass

    def test_risk_analytics_controller_get_risk_event_row(self) -> None:
        """Test case for risk_analytics_controller_get_risk_event_row

        Summary: Get risk event row Description: Return a list of risk events.
        """
        pass

    def test_risk_analytics_controller_get_risk_event_vulnerability_assessment_details(self) -> None:
        """Test case for risk_analytics_controller_get_risk_event_vulnerability_assessment_details

        Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
        """
        pass

    def test_risk_analytics_controller_get_risk_feedback(self) -> None:
        """Test case for risk_analytics_controller_get_risk_feedback

        Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
        """
        pass

    def test_risk_analytics_controller_get_risk_observation_details(self) -> None:
        """Test case for risk_analytics_controller_get_risk_observation_details

        Summary: Get risk observation details Description: Return details of a single risk observation.
        """
        pass

    def test_risk_analytics_controller_get_user_ui_settings(self) -> None:
        """Test case for risk_analytics_controller_get_user_ui_settings

        Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
        """
        pass

    def test_risk_analytics_controller_risk_event_tuning(self) -> None:
        """Test case for risk_analytics_controller_risk_event_tuning

        Summary: Risk event tuning Description: Perform tuning risk event actions.
        """
        pass

    def test_risk_analytics_controller_set_risk_event_status(self) -> None:
        """Test case for risk_analytics_controller_set_risk_event_status

        Summary: Set risk event status Description: Update the risk status and justification.
        """
        pass

    def test_risk_analytics_controller_set_user_ui_settings(self) -> None:
        """Test case for risk_analytics_controller_set_user_ui_settings

        Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium.
        """
        pass

    def test_risk_analytics_controller_update_risk_feedback(self) -> None:
        """Test case for risk_analytics_controller_update_risk_feedback

        Summary: Update risk feedback Description: Provide feedback for one or more risk events
        """
        pass


if __name__ == '__main__':
    unittest.main()
