# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.potential_flows_paths_filter_options import PotentialFlowsPathsFilterOptions

class TestPotentialFlowsPathsFilterOptions(unittest.TestCase):
    """PotentialFlowsPathsFilterOptions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PotentialFlowsPathsFilterOptions:
        """Test PotentialFlowsPathsFilterOptions
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PotentialFlowsPathsFilterOptions`
        """
        model = PotentialFlowsPathsFilterOptions()
        if include_optional:
            return PotentialFlowsPathsFilterOptions(
                ids = [12345,12344],
                potential_flows_ids = [12345,12344],
                types = ["s3","rds"],
                source_types = ["s3","rds"],
                cloud_accounts = [
                    ''
                    ],
                cloud_regions = [
                    ''
                    ],
                source_ids = [
                    ''
                    ],
                destination_ids = [1234,1233],
                access_types = [
                    'READ'
                    ]
            )
        else:
            return PotentialFlowsPathsFilterOptions(
        )
        """

    def testPotentialFlowsPathsFilterOptions(self):
        """Test PotentialFlowsPathsFilterOptions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
