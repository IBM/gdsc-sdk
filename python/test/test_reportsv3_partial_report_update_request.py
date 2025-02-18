# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.reportsv3_partial_report_update_request import Reportsv3PartialReportUpdateRequest

class TestReportsv3PartialReportUpdateRequest(unittest.TestCase):
    """Reportsv3PartialReportUpdateRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3PartialReportUpdateRequest:
        """Test Reportsv3PartialReportUpdateRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3PartialReportUpdateRequest`
        """
        model = Reportsv3PartialReportUpdateRequest()
        if include_optional:
            return Reportsv3PartialReportUpdateRequest(
                default_chart_expanded = True,
                is_hidden = True,
                is_pinned = True,
                report_description = '',
                report_id = '',
                report_name = '',
                report_tags = [
                    ibm_gdsc_sdk_software.models.reportsv3_report_tag.reportsv3ReportTag(
                        nls_key = '', 
                        nls_value = '', )
                    ],
                update_mask = ibm_gdsc_sdk_software.models.`field_mask`_represents_a_set_of_symbolic_field_paths,_for_example:.`FieldMask` represents a set of symbolic field paths, for example:(
                    paths = [
                        ''
                        ], )
            )
        else:
            return Reportsv3PartialReportUpdateRequest(
        )
        """

    def testReportsv3PartialReportUpdateRequest(self):
        """Test Reportsv3PartialReportUpdateRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
