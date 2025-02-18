# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.notificationsv3_template_property import Notificationsv3TemplateProperty

class TestNotificationsv3TemplateProperty(unittest.TestCase):
    """Notificationsv3TemplateProperty unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Notificationsv3TemplateProperty:
        """Test Notificationsv3TemplateProperty
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Notificationsv3TemplateProperty`
        """
        model = Notificationsv3TemplateProperty()
        if include_optional:
            return Notificationsv3TemplateProperty(
                name = '',
                value = ''
            )
        else:
            return Notificationsv3TemplateProperty(
        )
        """

    def testNotificationsv3TemplateProperty(self):
        """Test Notificationsv3TemplateProperty"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
