# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.data_resource_stats import DataResourceStats

class TestDataResourceStats(unittest.TestCase):
    """DataResourceStats unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DataResourceStats:
        """Test DataResourceStats
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DataResourceStats`
        """
        model = DataResourceStats()
        if include_optional:
            return DataResourceStats(
                sensitivities_count = 57,
                sensitivities_summary = [
                    ibm_gdsc_sdk_software.models.sensitivity_summary.SensitivitySummary(
                        tag = 'BUSINESS_EMAIL_ADDRESS', 
                        count = 230, 
                        category = 'Personal', )
                    ]
            )
        else:
            return DataResourceStats(
        )
        """

    def testDataResourceStats(self):
        """Test DataResourceStats"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
