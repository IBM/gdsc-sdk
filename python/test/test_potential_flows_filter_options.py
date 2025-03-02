# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.potential_flows_filter_options import PotentialFlowsFilterOptions

class TestPotentialFlowsFilterOptions(unittest.TestCase):
    """PotentialFlowsFilterOptions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PotentialFlowsFilterOptions:
        """Test PotentialFlowsFilterOptions
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PotentialFlowsFilterOptions`
        """
        model = PotentialFlowsFilterOptions()
        if include_optional:
            return PotentialFlowsFilterOptions(
                ids = [
                    ''
                    ],
                types = [
                    ''
                    ],
                source_types = [
                    ''
                    ],
                cloud_accounts = [
                    ''
                    ],
                cloud_regions = [
                    ''
                    ],
                source_ids = [
                    ''
                    ],
                destination_ids = [
                    ''
                    ],
                access_types = [
                    'READ'
                    ]
            )
        else:
            return PotentialFlowsFilterOptions(
        )
        """

    def testPotentialFlowsFilterOptions(self):
        """Test PotentialFlowsFilterOptions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
