# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.api.outliers_engine_api import OutliersEngineApi


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
