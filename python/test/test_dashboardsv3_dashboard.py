# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.dashboardsv3_dashboard import Dashboardsv3Dashboard

class TestDashboardsv3Dashboard(unittest.TestCase):
    """Dashboardsv3Dashboard unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Dashboardsv3Dashboard:
        """Test Dashboardsv3Dashboard
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Dashboardsv3Dashboard`
        """
        model = Dashboardsv3Dashboard()
        if include_optional:
            return Dashboardsv3Dashboard(
                cards = [
                    ibm_gdsc_sdk_saas.models.dashboardsv3_card.dashboardsv3Card(
                        card_id = '', 
                        card_position = ibm_gdsc_sdk_saas.models.dashboardsv3_card_position.dashboardsv3CardPosition(
                            height = 1.337, 
                            width = 1.337, 
                            x_position = 1.337, 
                            y_position = 1.337, ), 
                        card_type = 'UNDEFINED_CARD_TYPE', 
                        excluded_global_filter_ids = [
                            ''
                            ], 
                        report_parameters = ibm_gdsc_sdk_saas.models.dashboardsv3_report_parameters.dashboardsv3ReportParameters(
                            end = '', 
                            group_ids = [
                                56
                                ], 
                            id = '', 
                            local_time_filter = ibm_gdsc_sdk_saas.models.dashboardsv3_time_range.dashboardsv3TimeRange(
                                end = '', 
                                range = '', 
                                start = '', ), 
                            menu_item = '', 
                            override = True, 
                            range = '', 
                            regulation = '', 
                            start = '', 
                            tags = [
                                ibm_gdsc_sdk_saas.models.reportsv3_report_tag.reportsv3ReportTag(
                                    nls_key = '', 
                                    nls_value = '', )
                                ], 
                            title = '', ), )
                    ],
                dashboard_description = '',
                dashboard_id = '',
                dashboard_title = '',
                global_time_filter = ibm_gdsc_sdk_saas.models.dashboardsv3_time_range.dashboardsv3TimeRange(
                    end = '', 
                    range = '', 
                    start = '', ),
                report_global_filter_list = [
                    ibm_gdsc_sdk_saas.models.report_global_filter.ReportGlobalFilter(
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
                            ibm_gdsc_sdk_saas.models.report_global_filter_operator_types.Report global filter operator types(
                                key = '', 
                                label = '', 
                                value = '', )
                            ], )
                    ]
            )
        else:
            return Dashboardsv3Dashboard(
        )
        """

    def testDashboardsv3Dashboard(self):
        """Test Dashboardsv3Dashboard"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
