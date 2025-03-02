# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.datamartprocessorv3_get_earliest_start_time_response import Datamartprocessorv3GetEarliestStartTimeResponse

class TestDatamartprocessorv3GetEarliestStartTimeResponse(unittest.TestCase):
    """Datamartprocessorv3GetEarliestStartTimeResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Datamartprocessorv3GetEarliestStartTimeResponse:
        """Test Datamartprocessorv3GetEarliestStartTimeResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Datamartprocessorv3GetEarliestStartTimeResponse`
        """
        model = Datamartprocessorv3GetEarliestStartTimeResponse()
        if include_optional:
            return Datamartprocessorv3GetEarliestStartTimeResponse(
                status = ibm_gdsc_sdk_saas.models.datamartprocessorv3_status_response_base.datamartprocessorv3StatusResponseBase(
                    message = '', 
                    status = '', ),
                timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f')
            )
        else:
            return Datamartprocessorv3GetEarliestStartTimeResponse(
        )
        """

    def testDatamartprocessorv3GetEarliestStartTimeResponse(self):
        """Test Datamartprocessorv3GetEarliestStartTimeResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
