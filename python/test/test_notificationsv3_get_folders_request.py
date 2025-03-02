# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.notificationsv3_get_folders_request import Notificationsv3GetFoldersRequest

class TestNotificationsv3GetFoldersRequest(unittest.TestCase):
    """Notificationsv3GetFoldersRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Notificationsv3GetFoldersRequest:
        """Test Notificationsv3GetFoldersRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Notificationsv3GetFoldersRequest`
        """
        model = Notificationsv3GetFoldersRequest()
        if include_optional:
            return Notificationsv3GetFoldersRequest(
                folder_name = '',
                integration_id = ''
            )
        else:
            return Notificationsv3GetFoldersRequest(
        )
        """

    def testNotificationsv3GetFoldersRequest(self):
        """Test Notificationsv3GetFoldersRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
