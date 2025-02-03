# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.reportsv3_report_header import Reportsv3ReportHeader

class TestReportsv3ReportHeader(unittest.TestCase):
    """Reportsv3ReportHeader unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3ReportHeader:
        """Test Reportsv3ReportHeader
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3ReportHeader`
        """
        model = Reportsv3ReportHeader()
        if include_optional:
            return Reportsv3ReportHeader(
                aggregation_type = 'UNDEFINED_AGG_TYPE',
                field_name = ibm_gdsc_sdk_software.models.reportsv3_field_name.reportsv3FieldName(
                    customized_value = '', 
                    nls_key = '', 
                    nls_value = '', ),
                group_type_id = 56,
                header_data_type = 'UNDEFINED_REPORT_HEADER_TYPE',
                header_description = ibm_gdsc_sdk_software.models.reportsv3_header_description.reportsv3HeaderDescription(
                    nls_key = '', 
                    nls_value = '', ),
                header_id = '',
                header_name = '',
                header_type = 'UNDEFINED_TYPE',
                header_type_length = 56,
                literal = ibm_gdsc_sdk_software.models.reportsv3_literal.reportsv3Literal(
                    customized_value = '', 
                    nls_key = '', 
                    nls_value = '', ),
                order_by = 'UNDEFINED_ORDER_BY',
                order_by_seq = 56,
                schema_name = '',
                sequence = 56,
                table_name = ''
            )
        else:
            return Reportsv3ReportHeader(
        )
        """

    def testReportsv3ReportHeader(self):
        """Test Reportsv3ReportHeader"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
