# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.api.qs_plugin_manager_api import QSPluginManagerApi


class TestQSPluginManagerApi(unittest.TestCase):
    """QSPluginManagerApi unit test stubs"""

    def setUp(self) -> None:
        self.api = QSPluginManagerApi()

    def tearDown(self) -> None:
        pass

    def test_q_s_plugin_manager_invoke_app_prov(self) -> None:
        """Test case for q_s_plugin_manager_invoke_app_prov

        Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
        """
        pass

    def test_q_s_plugin_manager_invoke_explorer_v1(self) -> None:
        """Test case for q_s_plugin_manager_invoke_explorer_v1

        Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
        """
        pass

    def test_q_s_plugin_manager_invoke_explorer_v2(self) -> None:
        """Test case for q_s_plugin_manager_invoke_explorer_v2

        Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
        """
        pass

    def test_q_s_plugin_manager_invoke_plugin(self) -> None:
        """Test case for q_s_plugin_manager_invoke_plugin

        Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
        """
        pass

    def test_q_s_plugin_manager_invoke_policy(self) -> None:
        """Test case for q_s_plugin_manager_invoke_policy

        Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload
        """
        pass


if __name__ == '__main__':
    unittest.main()
