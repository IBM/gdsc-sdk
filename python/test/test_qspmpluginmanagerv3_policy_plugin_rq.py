# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.qspmpluginmanagerv3_policy_plugin_rq import Qspmpluginmanagerv3PolicyPluginRQ

class TestQspmpluginmanagerv3PolicyPluginRQ(unittest.TestCase):
    """Qspmpluginmanagerv3PolicyPluginRQ unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Qspmpluginmanagerv3PolicyPluginRQ:
        """Test Qspmpluginmanagerv3PolicyPluginRQ
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Qspmpluginmanagerv3PolicyPluginRQ`
        """
        model = Qspmpluginmanagerv3PolicyPluginRQ()
        if include_optional:
            return Qspmpluginmanagerv3PolicyPluginRQ(
                external_param = {
                    'key' : ''
                    },
                org_id = '',
                plugin_id = '',
                run_for_all_scans = True,
                run_for_given_scan = True,
                scan_desc = '',
                scan_id = '',
                scan_type = '',
                user_email = ''
            )
        else:
            return Qspmpluginmanagerv3PolicyPluginRQ(
        )
        """

    def testQspmpluginmanagerv3PolicyPluginRQ(self):
        """Test Qspmpluginmanagerv3PolicyPluginRQ"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
