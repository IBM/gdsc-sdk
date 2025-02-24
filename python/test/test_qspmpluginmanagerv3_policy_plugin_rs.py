# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_policy_plugin_rs import Qspmpluginmanagerv3PolicyPluginRS

class TestQspmpluginmanagerv3PolicyPluginRS(unittest.TestCase):
    """Qspmpluginmanagerv3PolicyPluginRS unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Qspmpluginmanagerv3PolicyPluginRS:
        """Test Qspmpluginmanagerv3PolicyPluginRS
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Qspmpluginmanagerv3PolicyPluginRS`
        """
        model = Qspmpluginmanagerv3PolicyPluginRS()
        if include_optional:
            return Qspmpluginmanagerv3PolicyPluginRS(
                org_id = '',
                plugin_id = '',
                scan_desc = '',
                scanned_ids = '',
                user_email = ''
            )
        else:
            return Qspmpluginmanagerv3PolicyPluginRS(
        )
        """

    def testQspmpluginmanagerv3PolicyPluginRS(self):
        """Test Qspmpluginmanagerv3PolicyPluginRS"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
