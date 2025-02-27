# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.outliersenginev3_get_source_statistics_response import Outliersenginev3GetSourceStatisticsResponse

class TestOutliersenginev3GetSourceStatisticsResponse(unittest.TestCase):
    """Outliersenginev3GetSourceStatisticsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Outliersenginev3GetSourceStatisticsResponse:
        """Test Outliersenginev3GetSourceStatisticsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Outliersenginev3GetSourceStatisticsResponse`
        """
        model = Outliersenginev3GetSourceStatisticsResponse()
        if include_optional:
            return Outliersenginev3GetSourceStatisticsResponse(
                source_statistics = [
                    ibm_gdsc_sdk_saas.models.outliersenginev3_source_attributes_statistics.outliersenginev3SourceAttributesStatistics(
                        statistics = [
                            ibm_gdsc_sdk_saas.models.outliersenginev3_attribute_statistics.outliersenginev3AttributeStatistics(
                                attribute = '', 
                                hourly_average_activity = 1.337, 
                                seen_since = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), )
                            ], 
                        total_number_of_attributes = 56, 
                        type = 'UNDEFINED_SOURCE_STATISTICS_TYPE', )
                    ]
            )
        else:
            return Outliersenginev3GetSourceStatisticsResponse(
        )
        """

    def testOutliersenginev3GetSourceStatisticsResponse(self):
        """Test Outliersenginev3GetSourceStatisticsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
