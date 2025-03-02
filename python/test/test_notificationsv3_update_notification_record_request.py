# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.notificationsv3_update_notification_record_request import Notificationsv3UpdateNotificationRecordRequest

class TestNotificationsv3UpdateNotificationRecordRequest(unittest.TestCase):
    """Notificationsv3UpdateNotificationRecordRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Notificationsv3UpdateNotificationRecordRequest:
        """Test Notificationsv3UpdateNotificationRecordRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Notificationsv3UpdateNotificationRecordRequest`
        """
        model = Notificationsv3UpdateNotificationRecordRequest()
        if include_optional:
            return Notificationsv3UpdateNotificationRecordRequest(
                notification_id = [
                    ''
                    ],
                severity = 'UNDEFINED',
                state = 'UNREAD',
                template_data = [
                    ibm_gdsc_sdk_saas.models.notificationsv3_template_property.notificationsv3TemplateProperty(
                        name = '', 
                        value = '', )
                    ]
            )
        else:
            return Notificationsv3UpdateNotificationRecordRequest(
        )
        """

    def testNotificationsv3UpdateNotificationRecordRequest(self):
        """Test Notificationsv3UpdateNotificationRecordRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
