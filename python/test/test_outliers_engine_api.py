# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.api.outliers_engine_api import OutliersEngineApi


class TestOutliersEngineApi(unittest.TestCase):
    """OutliersEngineApi unit test stubs"""

    def setUp(self) -> None:
        self.api = OutliersEngineApi()

    def tearDown(self) -> None:
        pass

    def test_outliers_engine_get_source_statistics(self) -> None:
        """Test case for outliers_engine_get_source_statistics

        Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
        """
        pass

    def test_outliers_engine_get_statistics(self) -> None:
        """Test case for outliers_engine_get_statistics

        Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
        """
        pass

    def test_outliers_engine_get_working_hours_periods(self) -> None:
        """Test case for outliers_engine_get_working_hours_periods

        Summary: Get working hours periods Description: Get a list of the working hours periods.
        """
        pass

    def test_outliers_engine_run_simulator(self) -> None:
        """Test case for outliers_engine_run_simulator

        Summary: Run simulator Description: Run outlier simulator.
        """
        pass

    def test_outliers_engine_update_working_hours_periods(self) -> None:
        """Test case for outliers_engine_update_working_hours_periods

        Summary: Update working hours periods Description: Update the working hours periods values.
        """
        pass

    def test_outliers_engine_upload_and_analyze_period(self) -> None:
        """Test case for outliers_engine_upload_and_analyze_period

        Summary: Upload and analyze period Description: Run outliers detection on ready periods.
        """
        pass

    def test_outliers_engine_user_clustering(self) -> None:
        """Test case for outliers_engine_user_clustering

        Summary: User clustering Description: Run user-clustering on current sources.
        """
        pass


if __name__ == '__main__':
    unittest.main()
