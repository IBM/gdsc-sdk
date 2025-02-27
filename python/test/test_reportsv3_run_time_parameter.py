# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsv3_run_time_parameter import Reportsv3RunTimeParameter

class TestReportsv3RunTimeParameter(unittest.TestCase):
    """Reportsv3RunTimeParameter unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsv3RunTimeParameter:
        """Test Reportsv3RunTimeParameter
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsv3RunTimeParameter`
        """
        model = Reportsv3RunTimeParameter()
        if include_optional:
            return Reportsv3RunTimeParameter(
                key = '',
                label = '',
                operator_type = 'UNDEFINED_OPERATOR_TYPE',
                runtime_parameter_type = 'UNDEFINED_TYPE',
                runtime_parameter_type_length = 56,
                value = ''
            )
        else:
            return Reportsv3RunTimeParameter(
        )
        """

    def testReportsv3RunTimeParameter(self):
        """Test Reportsv3RunTimeParameter"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
