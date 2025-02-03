# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.api.health_collector_api import HealthCollectorApi


class TestHealthCollectorApi(unittest.TestCase):
    """HealthCollectorApi unit test stubs"""

    def setUp(self) -> None:
        self.api = HealthCollectorApi()

    def tearDown(self) -> None:
        pass

    def test_health_collector_get_data_warehouse_usage(self) -> None:
        """Test case for health_collector_get_data_warehouse_usage

        Summary: Get data warehouse usage info Description: Get information from Db2 related to usage
        """
        pass

    def test_health_collector_get_gdp_health_info(self) -> None:
        """Test case for health_collector_get_gdp_health_info

        Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
        """
        pass

    def test_health_collector_get_historical_health_info(self) -> None:
        """Test case for health_collector_get_historical_health_info

        Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
        """
        pass

    def test_health_collector_get_object_storage_usage(self) -> None:
        """Test case for health_collector_get_object_storage_usage

        Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
        """
        pass

    def test_health_collector_get_pod_restarts(self) -> None:
        """Test case for health_collector_get_pod_restarts

        Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
        """
        pass

    def test_health_collector_get_pvc_usage(self) -> None:
        """Test case for health_collector_get_pvc_usage

        Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
        """
        pass

    def test_health_collector_get_streams_ingestion(self) -> None:
        """Test case for health_collector_get_streams_ingestion

        Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
        """
        pass

    def test_health_collector_get_top_gdp_collectors(self) -> None:
        """Test case for health_collector_get_top_gdp_collectors

        Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
        """
        pass

    def test_health_collector_store_health_info(self) -> None:
        """Test case for health_collector_store_health_info

        Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)
        """
        pass


if __name__ == '__main__':
    unittest.main()
