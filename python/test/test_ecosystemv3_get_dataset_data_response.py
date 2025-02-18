# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.ecosystemv3_get_dataset_data_response import Ecosystemv3GetDatasetDataResponse

class TestEcosystemv3GetDatasetDataResponse(unittest.TestCase):
    """Ecosystemv3GetDatasetDataResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Ecosystemv3GetDatasetDataResponse:
        """Test Ecosystemv3GetDatasetDataResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Ecosystemv3GetDatasetDataResponse`
        """
        model = Ecosystemv3GetDatasetDataResponse()
        if include_optional:
            return Ecosystemv3GetDatasetDataResponse(
                record_count = 56,
                report_result = ibm_gdsc_sdk_software.models.workflowv3_report_result.workflowv3ReportResult(
                    headers = [
                        ibm_gdsc_sdk_software.models.workflowv3_report_result_header.workflowv3ReportResultHeader(
                            header = '', 
                            key = '', )
                        ], 
                    rows = [
                        ibm_gdsc_sdk_software.models.workflowv3_report_result_row.workflowv3ReportResultRow(
                            row = {
                                'key' : ''
                                }, )
                        ], )
            )
        else:
            return Ecosystemv3GetDatasetDataResponse(
        )
        """

    def testEcosystemv3GetDatasetDataResponse(self):
        """Test Ecosystemv3GetDatasetDataResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
