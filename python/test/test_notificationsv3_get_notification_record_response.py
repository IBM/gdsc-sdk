# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.notificationsv3_get_notification_record_response import Notificationsv3GetNotificationRecordResponse

class TestNotificationsv3GetNotificationRecordResponse(unittest.TestCase):
    """Notificationsv3GetNotificationRecordResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Notificationsv3GetNotificationRecordResponse:
        """Test Notificationsv3GetNotificationRecordResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Notificationsv3GetNotificationRecordResponse`
        """
        model = Notificationsv3GetNotificationRecordResponse()
        if include_optional:
            return Notificationsv3GetNotificationRecordResponse(
                record = ibm_gdsc_sdk_software.models.notificationsv3_notification_record.notificationsv3NotificationRecord(
                    creation_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    event_end_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    event_start_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    href = '', 
                    id = '', 
                    origin = '', 
                    origin_data = '', 
                    severity = 'UNDEFINED', 
                    state = 'UNREAD', 
                    style = '', 
                    tenant_id = '', 
                    text = '', 
                    title = '', 
                    transaction_id = '', 
                    type = '', 
                    user_id = '', ),
                result = '',
                status = ibm_gdsc_sdk_software.models.the_`status`_type_defines_a_logical_error_model_that_is_suitable_for_different
programming_environments,_including_rest_apis_and_rpc_apis/_it_is_used_by
[g_rpc](https://github/com/grpc)/_the_error_model_is_designed_to_be:.The `Status` type defines a logical error model that is suitable for different
programming environments, including REST APIs and RPC APIs. It is used by
[gRPC](https://github.com/grpc). The error model is designed to be:(
                    code = 56, 
                    details = [
                        ibm_gdsc_sdk_software.models.protobuf_any.protobufAny(
                            type_url = '', 
                            value = 'YQ==', )
                        ], 
                    message = '', )
            )
        else:
            return Notificationsv3GetNotificationRecordResponse(
        )
        """

    def testNotificationsv3GetNotificationRecordResponse(self):
        """Test Notificationsv3GetNotificationRecordResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
