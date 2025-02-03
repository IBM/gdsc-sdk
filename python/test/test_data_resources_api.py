# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.api.data_resources_api import DataResourcesApi


class TestDataResourcesApi(unittest.TestCase):
    """DataResourcesApi unit test stubs"""

    def setUp(self) -> None:
        self.api = DataResourcesApi()

    def tearDown(self) -> None:
        pass

    def test_get_data_resource(self) -> None:
        """Test case for get_data_resource

        Get a specific data resource by its ID
        """
        pass

    def test_get_data_resources_summary(self) -> None:
        """Test case for get_data_resources_summary

        Data resources summary
        """
        pass

    def test_list_data_resources(self) -> None:
        """Test case for list_data_resources

        List data resources that match a given filter
        """
        pass

    def test_list_data_resources_names(self) -> None:
        """Test case for list_data_resources_names

        List names of data resources
        """
        pass

    def test_remove_resource(self) -> None:
        """Test case for remove_resource

        Remove resource from Guardium Insights SaaS DSPM
        """
        pass

    def test_update_resource_review_status(self) -> None:
        """Test case for update_resource_review_status

        Set review status of a data resource
        """
        pass


if __name__ == '__main__':
    unittest.main()
