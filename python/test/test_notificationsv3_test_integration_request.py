# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.notificationsv3_test_integration_request import Notificationsv3TestIntegrationRequest

class TestNotificationsv3TestIntegrationRequest(unittest.TestCase):
    """Notificationsv3TestIntegrationRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Notificationsv3TestIntegrationRequest:
        """Test Notificationsv3TestIntegrationRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Notificationsv3TestIntegrationRequest`
        """
        model = Notificationsv3TestIntegrationRequest()
        if include_optional:
            return Notificationsv3TestIntegrationRequest(
                integration_type = '',
                options = {
                    'key' : ''
                    }
            )
        else:
            return Notificationsv3TestIntegrationRequest(
        )
        """

    def testNotificationsv3TestIntegrationRequest(self):
        """Test Notificationsv3TestIntegrationRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
