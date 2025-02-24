# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.dashboardsv3_report_parameters import Dashboardsv3ReportParameters

class TestDashboardsv3ReportParameters(unittest.TestCase):
    """Dashboardsv3ReportParameters unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Dashboardsv3ReportParameters:
        """Test Dashboardsv3ReportParameters
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Dashboardsv3ReportParameters`
        """
        model = Dashboardsv3ReportParameters()
        if include_optional:
            return Dashboardsv3ReportParameters(
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
                title = ''
            )
        else:
            return Dashboardsv3ReportParameters(
        )
        """

    def testDashboardsv3ReportParameters(self):
        """Test Dashboardsv3ReportParameters"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
