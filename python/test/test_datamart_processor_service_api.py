# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.api.datamart_processor_service_api import DatamartProcessorServiceApi


class TestDatamartProcessorServiceApi(unittest.TestCase):
    """DatamartProcessorServiceApi unit test stubs"""

    def setUp(self) -> None:
        self.api = DatamartProcessorServiceApi()

    def tearDown(self) -> None:
        pass

    def test_datamart_processor_service_get_datamart_info(self) -> None:
        """Test case for datamart_processor_service_get_datamart_info

        Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
        """
        pass

    def test_datamart_processor_service_get_datamarts(self) -> None:
        """Test case for datamart_processor_service_get_datamarts

        Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
        """
        pass

    def test_datamart_processor_service_get_earliest_start_time(self) -> None:
        """Test case for datamart_processor_service_get_earliest_start_time

        Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
        """
        pass

    def test_datamart_processor_service_send_all_complete_files_to_queue(self) -> None:
        """Test case for datamart_processor_service_send_all_complete_files_to_queue

        """
        pass

    def test_datamart_processor_service_store_extraction_logs(self) -> None:
        """Test case for datamart_processor_service_store_extraction_logs

        Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
        """
        pass

    def test_upload_datamart(self) -> None:
        """Test case for upload_datamart

        Summary: Upload datamart Description: Upload datamart file for ingestion.
        """
        pass


if __name__ == '__main__':
    unittest.main()
