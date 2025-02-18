# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.reportsv3_create_chart_response import Reportsv3CreateChartResponse

class TestReportsv3CreateChartResponse(unittest.TestCase):
    """Reportsv3CreateChartResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3CreateChartResponse:
        """Test Reportsv3CreateChartResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3CreateChartResponse`
        """
        model = Reportsv3CreateChartResponse()
        if include_optional:
            return Reportsv3CreateChartResponse(
                chart_id = ''
            )
        else:
            return Reportsv3CreateChartResponse(
        )
        """

    def testReportsv3CreateChartResponse(self):
        """Test Reportsv3CreateChartResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
