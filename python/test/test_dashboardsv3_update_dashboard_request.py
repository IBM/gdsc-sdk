# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.dashboardsv3_update_dashboard_request import Dashboardsv3UpdateDashboardRequest

class TestDashboardsv3UpdateDashboardRequest(unittest.TestCase):
    """Dashboardsv3UpdateDashboardRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Dashboardsv3UpdateDashboardRequest:
        """Test Dashboardsv3UpdateDashboardRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Dashboardsv3UpdateDashboardRequest`
        """
        model = Dashboardsv3UpdateDashboardRequest()
        if include_optional:
            return Dashboardsv3UpdateDashboardRequest(
                dashboard = ibm_gdsc_sdk_software.models.dashboardsv3_dashboard.dashboardsv3Dashboard(
                    cards = [
                        ibm_gdsc_sdk_software.models.dashboardsv3_card.dashboardsv3Card(
                            card_id = '', 
                            card_position = ibm_gdsc_sdk_software.models.dashboardsv3_card_position.dashboardsv3CardPosition(
                                height = 1.337, 
                                width = 1.337, 
                                x_position = 1.337, 
                                y_position = 1.337, ), 
                            card_type = 'UNDEFINED_CARD_TYPE', 
                            excluded_global_filter_ids = [
                                ''
                                ], 
                            report_parameters = ibm_gdsc_sdk_software.models.dashboardsv3_report_parameters.dashboardsv3ReportParameters(
                                end = '', 
                                id = '', 
                                local_time_filter = ibm_gdsc_sdk_software.models.dashboardsv3_time_range.dashboardsv3TimeRange(
                                    end = '', 
                                    range = '', 
                                    start = '', ), 
                                menu_item = '', 
                                override = True, 
                                range = '', 
                                regulation = '', 
                                start = '', 
                                tags = [
                                    ibm_gdsc_sdk_software.models.reportsv3_report_tag.reportsv3ReportTag(
                                        nls_key = '', 
                                        nls_value = '', )
                                    ], 
                                title = '', ), )
                        ], 
                    dashboard_description = '', 
                    dashboard_id = '', 
                    dashboard_title = '', 
                    global_time_filter = ibm_gdsc_sdk_software.models.dashboardsv3_time_range.dashboardsv3TimeRange(
                        end = '', 
                        range = '', 
                        start = '', ), 
                    report_global_filter_list = [
                        ibm_gdsc_sdk_software.models.report_global_filter.ReportGlobalFilter(
                            case_insensitive = True, 
                            filter_item_type = '', 
                            group_name = '', 
                            header_id = '', 
                            header_type = '', 
                            id = '', 
                            name = '', 
                            operator = '', 
                            operator_key = '', 
                            report_operator = [
                                ibm_gdsc_sdk_software.models.report_global_filter_operator_types.Report global filter operator types(
                                    key = '', 
                                    label = '', 
                                    value = '', )
                                ], )
                        ], ),
                dashboard_id = '',
                update_hint = '',
                update_type = 'UNDEFINED_UPDATE_TYPE'
            )
        else:
            return Dashboardsv3UpdateDashboardRequest(
        )
        """

    def testDashboardsv3UpdateDashboardRequest(self):
        """Test Dashboardsv3UpdateDashboardRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
