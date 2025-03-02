# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_finding_details import Riskanalyticscontrollerv3FindingDetails

class TestRiskanalyticscontrollerv3FindingDetails(unittest.TestCase):
    """Riskanalyticscontrollerv3FindingDetails unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Riskanalyticscontrollerv3FindingDetails:
        """Test Riskanalyticscontrollerv3FindingDetails
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Riskanalyticscontrollerv3FindingDetails`
        """
        model = Riskanalyticscontrollerv3FindingDetails()
        if include_optional:
            return Riskanalyticscontrollerv3FindingDetails(
                counts = [
                    ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_detail_to_count.riskanalyticscontrollerv3DetailToCount(
                        count = 56, 
                        desc = '', )
                    ],
                finding_examples = [
                    ''
                    ],
                finding_references = [
                    ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_finding_reference_link.riskanalyticscontrollerv3FindingReferenceLink(
                        report_filters = [
                            ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_observation_report_filter.riskanalyticscontrollerv3ObservationReportFilter(
                                header_id = '', 
                                header_value = '', 
                                operator_type = 'UNDEFINED_OPERATOR_TYPE', )
                            ], 
                        statistics = ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_statistics.riskanalyticscontrollerv3Statistics(
                            average = 1.337, 
                            total = 56, ), 
                        text = '', 
                        text_template = '', 
                        text_variables = [
                            ''
                            ], )
                    ]
            )
        else:
            return Riskanalyticscontrollerv3FindingDetails(
        )
        """

    def testRiskanalyticscontrollerv3FindingDetails(self):
        """Test Riskanalyticscontrollerv3FindingDetails"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
