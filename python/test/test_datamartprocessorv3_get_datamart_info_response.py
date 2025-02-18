# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.datamartprocessorv3_get_datamart_info_response import Datamartprocessorv3GetDatamartInfoResponse

class TestDatamartprocessorv3GetDatamartInfoResponse(unittest.TestCase):
    """Datamartprocessorv3GetDatamartInfoResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Datamartprocessorv3GetDatamartInfoResponse:
        """Test Datamartprocessorv3GetDatamartInfoResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Datamartprocessorv3GetDatamartInfoResponse`
        """
        model = Datamartprocessorv3GetDatamartInfoResponse()
        if include_optional:
            return Datamartprocessorv3GetDatamartInfoResponse(
                datamart = ibm_gdsc_sdk_software.models.datamartprocessorv3_datamart_info.datamartprocessorv3DatamartInfo(
                    current_ts = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    data_type = '', 
                    error = '', 
                    export_record_count = 56, 
                    export_status = 56, 
                    failure_file_count = 56, 
                    files = [
                        ibm_gdsc_sdk_software.models.datamartprocessorv3_datamart_file_info.datamartprocessorv3DatamartFileInfo(
                            error = '', 
                            failed_state = True, 
                            file_name = '', 
                            file_status = 56, 
                            ingest_record_count = 56, 
                            retry_count = 56, 
                            retry_end_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            retry_start_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), )
                        ], 
                    gdp_hostname = '', 
                    ingest_record_count = 56, 
                    ingest_status = 56, 
                    ingestion_id = '', 
                    period_end = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    period_start = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    success_file_count = 56, 
                    total_file_count = 56, ),
                status = ibm_gdsc_sdk_software.models.datamartprocessorv3_status_response_base.datamartprocessorv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Datamartprocessorv3GetDatamartInfoResponse(
        )
        """

    def testDatamartprocessorv3GetDatamartInfoResponse(self):
        """Test Datamartprocessorv3GetDatamartInfoResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
