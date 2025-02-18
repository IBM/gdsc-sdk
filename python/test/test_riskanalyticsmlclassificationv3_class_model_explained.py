# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.riskanalyticsmlclassificationv3_class_model_explained import Riskanalyticsmlclassificationv3ClassModelExplained

class TestRiskanalyticsmlclassificationv3ClassModelExplained(unittest.TestCase):
    """Riskanalyticsmlclassificationv3ClassModelExplained unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Riskanalyticsmlclassificationv3ClassModelExplained:
        """Test Riskanalyticsmlclassificationv3ClassModelExplained
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Riskanalyticsmlclassificationv3ClassModelExplained`
        """
        model = Riskanalyticsmlclassificationv3ClassModelExplained()
        if include_optional:
            return Riskanalyticsmlclassificationv3ClassModelExplained(
                class_confidence = 1.337,
                class_key = '',
                rule_sets = [
                    ibm_gdsc_sdk_software.models.riskanalyticsmlclassificationv3_rule_set_list.riskanalyticsmlclassificationv3RuleSetList(
                        rule_set_list = [
                            ibm_gdsc_sdk_software.models.a_rule_of_classification_model.A rule of classification model(
                                feature_name = '', 
                                operator = '', 
                                value = 1.337, )
                            ], )
                    ]
            )
        else:
            return Riskanalyticsmlclassificationv3ClassModelExplained(
        )
        """

    def testRiskanalyticsmlclassificationv3ClassModelExplained(self):
        """Test Riskanalyticsmlclassificationv3ClassModelExplained"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
