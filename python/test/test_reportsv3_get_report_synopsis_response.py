# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsv3_get_report_synopsis_response import Reportsv3GetReportSynopsisResponse

class TestReportsv3GetReportSynopsisResponse(unittest.TestCase):
    """Reportsv3GetReportSynopsisResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3GetReportSynopsisResponse:
        """Test Reportsv3GetReportSynopsisResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3GetReportSynopsisResponse`
        """
        model = Reportsv3GetReportSynopsisResponse()
        if include_optional:
            return Reportsv3GetReportSynopsisResponse(
                report = ibm_gdsc_sdk_saas.models.reportsv3_brief_report.reportsv3BriefReport(
                    access_level = 56, 
                    category_id = '', 
                    creator_user_id = '', 
                    creator_user_name = '', 
                    group_ids_used_in_filter = [
                        ''
                        ], 
                    headers = [
                        ibm_gdsc_sdk_saas.models.reportsv3_display_header.reportsv3DisplayHeader(
                            field_name = ibm_gdsc_sdk_saas.models.reportsv3_field_name.reportsv3FieldName(
                                customized_value = '', 
                                nls_key = '', 
                                nls_value = '', ), 
                            header_description = ibm_gdsc_sdk_saas.models.reportsv3_header_description.reportsv3HeaderDescription(
                                nls_key = '', 
                                nls_value = '', ), 
                            header_id = '', 
                            header_name = '', 
                            sequence = 56, 
                            table_name = '', )
                        ], 
                    is_pinned = True, 
                    last_run_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    report_description = '', 
                    report_id = '', 
                    report_name = '', 
                    report_tags = [
                        ibm_gdsc_sdk_saas.models.reportsv3_report_tag.reportsv3ReportTag(
                            nls_key = '', 
                            nls_value = '', )
                        ], 
                    table_name = '', )
            )
        else:
            return Reportsv3GetReportSynopsisResponse(
        )
        """

    def testReportsv3GetReportSynopsisResponse(self):
        """Test Reportsv3GetReportSynopsisResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
