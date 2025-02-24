# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.vulnerabilities_summary_affected_data_store_summary_cloud_regions_count_inner import VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner

class TestVulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner(unittest.TestCase):
    """VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner:
        """Test VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner`
        """
        model = VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner()
        if include_optional:
            return VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner(
                cloud_region = '',
                count = 1.337
            )
        else:
            return VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner(
                cloud_region = '',
                count = 1.337,
        )
        """

    def testVulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner(self):
        """Test VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
