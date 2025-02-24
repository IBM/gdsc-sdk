# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.policybuilderv3_action_notification_object import Policybuilderv3ActionNotificationObject

class TestPolicybuilderv3ActionNotificationObject(unittest.TestCase):
    """Policybuilderv3ActionNotificationObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Policybuilderv3ActionNotificationObject:
        """Test Policybuilderv3ActionNotificationObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Policybuilderv3ActionNotificationObject`
        """
        model = Policybuilderv3ActionNotificationObject()
        if include_optional:
            return Policybuilderv3ActionNotificationObject(
                action_id = '',
                receivers = [
                    ibm_gdsc_sdk_saas.models.policybuilderv3_target_receiver.policybuilderv3TargetReceiver(
                        integration_id = '', 
                        template_id = '', 
                        type = 'UNDEFINED_RECTYPE', 
                        value = '', )
                    ]
            )
        else:
            return Policybuilderv3ActionNotificationObject(
        )
        """

    def testPolicybuilderv3ActionNotificationObject(self):
        """Test Policybuilderv3ActionNotificationObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
