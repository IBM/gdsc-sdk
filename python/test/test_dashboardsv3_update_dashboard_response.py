# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.dashboardsv3_update_dashboard_response import Dashboardsv3UpdateDashboardResponse

class TestDashboardsv3UpdateDashboardResponse(unittest.TestCase):
    """Dashboardsv3UpdateDashboardResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Dashboardsv3UpdateDashboardResponse:
        """Test Dashboardsv3UpdateDashboardResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Dashboardsv3UpdateDashboardResponse`
        """
        model = Dashboardsv3UpdateDashboardResponse()
        if include_optional:
            return Dashboardsv3UpdateDashboardResponse(
                dashboard_id = ''
            )
        else:
            return Dashboardsv3UpdateDashboardResponse(
        )
        """

    def testDashboardsv3UpdateDashboardResponse(self):
        """Test Dashboardsv3UpdateDashboardResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
