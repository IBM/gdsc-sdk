# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_get_user_ui_settings_response import Riskanalyticscontrollerv3GetUserUISettingsResponse

class TestRiskanalyticscontrollerv3GetUserUISettingsResponse(unittest.TestCase):
    """Riskanalyticscontrollerv3GetUserUISettingsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Riskanalyticscontrollerv3GetUserUISettingsResponse:
        """Test Riskanalyticscontrollerv3GetUserUISettingsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Riskanalyticscontrollerv3GetUserUISettingsResponse`
        """
        model = Riskanalyticscontrollerv3GetUserUISettingsResponse()
        if include_optional:
            return Riskanalyticscontrollerv3GetUserUISettingsResponse(
                user_ui_settings = ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_user_ui_settings.riskanalyticscontrollerv3UserUISettings(
                    card_settings = [
                        ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_card_settings.riskanalyticscontrollerv3CardSettings(
                            filters = [
                                ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_filter.riskanalyticscontrollerv3Filter(
                                    header_id = '', 
                                    values = [
                                        ''
                                        ], )
                                ], 
                            headers = [
                                ''
                                ], 
                            id = '', 
                            name = '', 
                            order_by = 'UNDEFINED_ORDER_BY', 
                            sequence_order = 56, 
                            sorted_by = '', )
                        ], 
                    show_banner = True, )
            )
        else:
            return Riskanalyticscontrollerv3GetUserUISettingsResponse(
        )
        """

    def testRiskanalyticscontrollerv3GetUserUISettingsResponse(self):
        """Test Riskanalyticscontrollerv3GetUserUISettingsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
