# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.vulnerabilities_filter_options import VulnerabilitiesFilterOptions

class TestVulnerabilitiesFilterOptions(unittest.TestCase):
    """VulnerabilitiesFilterOptions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> VulnerabilitiesFilterOptions:
        """Test VulnerabilitiesFilterOptions
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `VulnerabilitiesFilterOptions`
        """
        model = VulnerabilitiesFilterOptions()
        if include_optional:
            return VulnerabilitiesFilterOptions(
                vulnerability_types = [
                    'public-facing'
                    ],
                criticalities = [
                    'HIGH'
                    ],
                threats = [
                    'Data Leakage'
                    ],
                compliance = [
                    'CPRA'
                    ],
                threat_categories = [
                    'Security'
                    ],
                affected_data_store = ibm_gdsc_sdk_saas.models.vulnerability_affected_data_store_filter_options.VulnerabilityAffectedDataStoreFilterOptions(
                    data_store_ids = ["arn:aws:s3::123456789101:polar-bucket","arn:aws:s3::123456789101:polar-bucket2"], 
                    data_store_types = ["s3","s3"], 
                    cloud_providers = [
                        'aws'
                        ], 
                    cloud_regions = ["us-east-1","us-west-2"], 
                    geo_locations = [
                        ''
                        ], 
                    cloud_account_ids = [123456789101], ),
                status_types = [
                    'review'
                    ],
                status_type_families = [
                    'open'
                    ],
                discovered_since = 1.337
            )
        else:
            return VulnerabilitiesFilterOptions(
        )
        """

    def testVulnerabilitiesFilterOptions(self):
        """Test VulnerabilitiesFilterOptions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
