# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.api.third_party_vendors_api import ThirdPartyVendorsApi


class TestThirdPartyVendorsApi(unittest.TestCase):
    """ThirdPartyVendorsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ThirdPartyVendorsApi()

    def tearDown(self) -> None:
        pass

    def test_get_linked_vendor(self) -> None:
        """Test case for get_linked_vendor

        Get additional details of a specific third party vendor
        """
        pass

    def test_get_single_linked_vendor(self) -> None:
        """Test case for get_single_linked_vendor

        Get the third party vendors list
        """
        pass

    def test_list_linked_vendor_data_stores(self) -> None:
        """Test case for list_linked_vendor_data_stores

        Get the data stores associated with a third party vendor
        """
        pass

    def test_list_linked_vendors(self) -> None:
        """Test case for list_linked_vendors

        Get the summary of a third party vendor
        """
        pass

    def test_list_trusted_assets(self) -> None:
        """Test case for list_trusted_assets

        Get a list of all the actual trusted assets
        """
        pass


if __name__ == '__main__':
    unittest.main()
