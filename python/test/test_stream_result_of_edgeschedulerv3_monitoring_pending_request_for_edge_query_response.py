# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.stream_result_of_edgeschedulerv3_monitoring_pending_request_for_edge_query_response import StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse

class TestStreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse(unittest.TestCase):
    """StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse:
        """Test StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse`
        """
        model = StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse()
        if include_optional:
            return StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse(
                error = ibm_gdsc_sdk_saas.models.runtime_stream_error.runtimeStreamError(
                    details = [
                        ibm_gdsc_sdk_saas.models.protobuf_any.protobufAny(
                            type_url = '', 
                            value = 'YQ==', )
                        ], 
                    grpc_code = 56, 
                    http_code = 56, 
                    http_status = '', 
                    message = '', ),
                result = ibm_gdsc_sdk_saas.models.edgeschedulerv3_monitoring_pending_request_for_edge_query_response.edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse(
                    edge_result_report_id = '', 
                    heartbeat = '', 
                    query = '', )
            )
        else:
            return StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse(
        )
        """

    def testStreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse(self):
        """Test StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
