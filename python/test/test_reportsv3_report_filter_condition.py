# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsv3_report_filter_condition import Reportsv3ReportFilterCondition

class TestReportsv3ReportFilterCondition(unittest.TestCase):
    """Reportsv3ReportFilterCondition unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3ReportFilterCondition:
        """Test Reportsv3ReportFilterCondition
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3ReportFilterCondition`
        """
        model = Reportsv3ReportFilterCondition()
        if include_optional:
            return Reportsv3ReportFilterCondition(
                case_insensitive = True,
                field_nls_translation_key = '',
                filter_id = 56,
                group_type_id = 56,
                header_id = '',
                header_name = '',
                header_type = 'UNDEFINED_TYPE',
                in_report_date_range = ibm_gdsc_sdk_saas.models.reportsv3_date_range.reportsv3DateRange(
                    end_date = '', 
                    end_number = 56, 
                    end_unit = 'UNDEFINED_UINT_TYPE', 
                    start_date = '', 
                    start_number = 56, 
                    start_unit = 'UNDEFINED_UINT_TYPE', 
                    type = 'UNDEFINED_DATE_RANGE_TYPE', ),
                in_report_field_nls_key = '',
                in_report_header_id = '',
                in_report_header_name = '',
                in_report_id = '',
                in_report_name = '',
                in_report_table_name = '',
                is_tuple = True,
                operator_type = 'UNDEFINED_OPERATOR_TYPE',
                parameter_type = 'UNDEFINED_PARAM_TYPE',
                schema_name = '',
                sequence = 56,
                table_name = '',
                tuple_type = '',
                values = [
                    ''
                    ]
            )
        else:
            return Reportsv3ReportFilterCondition(
        )
        """

    def testReportsv3ReportFilterCondition(self):
        """Test Reportsv3ReportFilterCondition"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
