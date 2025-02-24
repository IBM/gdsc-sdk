# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.outliersenginev3_datasources_coverage_stats import Outliersenginev3DatasourcesCoverageStats

class TestOutliersenginev3DatasourcesCoverageStats(unittest.TestCase):
    """Outliersenginev3DatasourcesCoverageStats unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Outliersenginev3DatasourcesCoverageStats:
        """Test Outliersenginev3DatasourcesCoverageStats
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Outliersenginev3DatasourcesCoverageStats`
        """
        model = Outliersenginev3DatasourcesCoverageStats()
        if include_optional:
            return Outliersenginev3DatasourcesCoverageStats(
                datasources_coverage = '',
                datasources_in_gi = 56,
                datasources_in_queue = 56
            )
        else:
            return Outliersenginev3DatasourcesCoverageStats(
        )
        """

    def testOutliersenginev3DatasourcesCoverageStats(self):
        """Test Outliersenginev3DatasourcesCoverageStats"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
