# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_configure_streaming_response import Guardiumconnectorv3ConfigureStreamingResponse

class TestGuardiumconnectorv3ConfigureStreamingResponse(unittest.TestCase):
    """Guardiumconnectorv3ConfigureStreamingResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3ConfigureStreamingResponse:
        """Test Guardiumconnectorv3ConfigureStreamingResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3ConfigureStreamingResponse`
        """
        model = Guardiumconnectorv3ConfigureStreamingResponse()
        if include_optional:
            return Guardiumconnectorv3ConfigureStreamingResponse(
                status = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_status_response_base.guardiumconnectorv3StatusResponseBase(
                    message = '', 
                    status = '', )
            )
        else:
            return Guardiumconnectorv3ConfigureStreamingResponse(
        )
        """

    def testGuardiumconnectorv3ConfigureStreamingResponse(self):
        """Test Guardiumconnectorv3ConfigureStreamingResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
