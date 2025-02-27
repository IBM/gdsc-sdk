# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.api.reports_runner_api import ReportsRunnerApi


class TestReportsRunnerApi(unittest.TestCase):
    """ReportsRunnerApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ReportsRunnerApi()

    def tearDown(self) -> None:
        pass

    def test_reports_runner_get_active_queries(self) -> None:
        """Test case for reports_runner_get_active_queries

        Summary: Get running queries Description: Get queries that are running more than certain time
        """
        pass

    def test_reports_runner_get_audit_data_count(self) -> None:
        """Test case for reports_runner_get_audit_data_count

        Summary: Get audit data count Description: Get audit data.
        """
        pass

    def test_reports_runner_get_chart_data(self) -> None:
        """Test case for reports_runner_get_chart_data

        Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
        """
        pass

    def test_reports_runner_get_chart_datav2(self) -> None:
        """Test case for reports_runner_get_chart_datav2

        """
        pass

    def test_reports_runner_get_report_column_facet(self) -> None:
        """Test case for reports_runner_get_report_column_facet

        Summary: Get report column facet Description: Get counts that is group by values for the selected column.
        """
        pass

    def test_reports_runner_get_report_data_count(self) -> None:
        """Test case for reports_runner_get_report_data_count

        Summary: Get report data count Description: Get report data.
        """
        pass

    def test_reports_runner_run_audit_report(self) -> None:
        """Test case for reports_runner_run_audit_report

        Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
        """
        pass

    def test_reports_runner_run_report(self) -> None:
        """Test case for reports_runner_run_report

        Summary: Run report Description: Run report by report ID or by specifying report definition.
        """
        pass

    def test_reports_runner_stop_query(self) -> None:
        """Test case for reports_runner_stop_query

        Summary: Stop query Description: Stop a query based on the id
        """
        pass


if __name__ == '__main__':
    unittest.main()
