# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.api.dashboards_service_api import DashboardsServiceApi


class TestDashboardsServiceApi(unittest.TestCase):
    """DashboardsServiceApi unit test stubs"""

    def setUp(self) -> None:
        self.api = DashboardsServiceApi()

    def tearDown(self) -> None:
        pass

    def test_dashboards_service_create_dashboard(self) -> None:
        """Test case for dashboards_service_create_dashboard

        Summary: Create dashboard Description: Create a unique dashboard.
        """
        pass

    def test_dashboards_service_delete_dashboard(self) -> None:
        """Test case for dashboards_service_delete_dashboard

        Summary: Delete dashboard Description: Delete a unique dashboard.
        """
        pass

    def test_dashboards_service_get_dashboards(self) -> None:
        """Test case for dashboards_service_get_dashboards

        Summary: Get dashboards Description: Get a list of dashboards with all data.
        """
        pass

    def test_dashboards_service_update_dashboard(self) -> None:
        """Test case for dashboards_service_update_dashboard

        Summary: Update dashboard Description: Update a dashboard.
        """
        pass


if __name__ == '__main__':
    unittest.main()
