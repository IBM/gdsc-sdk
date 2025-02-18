# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_streaming_status_response import Guardiumconnectorv3GetStreamingStatusResponse

class TestGuardiumconnectorv3GetStreamingStatusResponse(unittest.TestCase):
    """Guardiumconnectorv3GetStreamingStatusResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3GetStreamingStatusResponse:
        """Test Guardiumconnectorv3GetStreamingStatusResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3GetStreamingStatusResponse`
        """
        model = Guardiumconnectorv3GetStreamingStatusResponse()
        if include_optional:
            return Guardiumconnectorv3GetStreamingStatusResponse(
                records = [
                    ibm_gdsc_sdk_software.models.guardiumconnectorv3_streaming_status_record.guardiumconnectorv3StreamingStatusRecord(
                        attributes = [
                            ibm_gdsc_sdk_software.models.guardiumconnectorv3_attribute.guardiumconnectorv3Attribute(
                                name = '', 
                                value = '', )
                            ], 
                        message = '', 
                        mu = '', 
                        state = '', 
                        status = '', 
                        unit_type = '', )
                    ],
                status = ibm_gdsc_sdk_software.models.guardiumconnectorv3_status_response_base.guardiumconnectorv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Guardiumconnectorv3GetStreamingStatusResponse(
        )
        """

    def testGuardiumconnectorv3GetStreamingStatusResponse(self):
        """Test Guardiumconnectorv3GetStreamingStatusResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
