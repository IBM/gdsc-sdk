# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.connectionsv3_get_settings_response import Connectionsv3GetSettingsResponse

class TestConnectionsv3GetSettingsResponse(unittest.TestCase):
    """Connectionsv3GetSettingsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Connectionsv3GetSettingsResponse:
        """Test Connectionsv3GetSettingsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Connectionsv3GetSettingsResponse`
        """
        model = Connectionsv3GetSettingsResponse()
        if include_optional:
            return Connectionsv3GetSettingsResponse(
                settings = [
                    ibm_gdsc_sdk_software.models.connectionsv3_connector_setting.connectionsv3ConnectorSetting(
                        description = '', 
                        filters = [
                            ibm_gdsc_sdk_software.models.connectionsv3_header_filter.connectionsv3HeaderFilter(
                                id = '', 
                                values = [
                                    ''
                                    ], )
                            ], 
                        headers = [
                            ''
                            ], 
                        id = '', 
                        name = '', 
                        order = 'NONE', 
                        sorted_by = '', )
                    ]
            )
        else:
            return Connectionsv3GetSettingsResponse(
        )
        """

    def testConnectionsv3GetSettingsResponse(self):
        """Test Connectionsv3GetSettingsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
