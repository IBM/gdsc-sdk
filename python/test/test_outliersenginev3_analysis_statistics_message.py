# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.outliersenginev3_analysis_statistics_message import Outliersenginev3AnalysisStatisticsMessage

class TestOutliersenginev3AnalysisStatisticsMessage(unittest.TestCase):
    """Outliersenginev3AnalysisStatisticsMessage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Outliersenginev3AnalysisStatisticsMessage:
        """Test Outliersenginev3AnalysisStatisticsMessage
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Outliersenginev3AnalysisStatisticsMessage`
        """
        model = Outliersenginev3AnalysisStatisticsMessage()
        if include_optional:
            return Outliersenginev3AnalysisStatisticsMessage(
                datasources_1h = 56,
                datasources_24h = 56,
                datasources_72h = 56,
                errors_1h = 56,
                errors_24h = 56,
                errors_72h = 56,
                performance_1h = ibm_gdsc_sdk_software.models.outliersenginev3_analysis_performance_stats.outliersenginev3AnalysisPerformanceStats(
                    duration_seconds = 56, 
                    events_analyzed = 56, 
                    events_per_second = 1.337, ),
                performance_24h = ibm_gdsc_sdk_software.models.outliersenginev3_analysis_performance_stats.outliersenginev3AnalysisPerformanceStats(
                    duration_seconds = 56, 
                    events_analyzed = 56, 
                    events_per_second = 1.337, ),
                performance_3h = ibm_gdsc_sdk_software.models.outliersenginev3_analysis_performance_stats.outliersenginev3AnalysisPerformanceStats(
                    duration_seconds = 56, 
                    events_analyzed = 56, 
                    events_per_second = 1.337, ),
                performance_72h = ibm_gdsc_sdk_software.models.outliersenginev3_analysis_performance_stats.outliersenginev3AnalysisPerformanceStats(
                    duration_seconds = 56, 
                    events_analyzed = 56, 
                    events_per_second = 1.337, )
            )
        else:
            return Outliersenginev3AnalysisStatisticsMessage(
        )
        """

    def testOutliersenginev3AnalysisStatisticsMessage(self):
        """Test Outliersenginev3AnalysisStatisticsMessage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
