# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.workflowv3_entity_header import Workflowv3EntityHeader

class TestWorkflowv3EntityHeader(unittest.TestCase):
    """Workflowv3EntityHeader unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Workflowv3EntityHeader:
        """Test Workflowv3EntityHeader
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Workflowv3EntityHeader`
        """
        model = Workflowv3EntityHeader()
        if include_optional:
            return Workflowv3EntityHeader(
                choices = [
                    ibm_gdsc_sdk_saas.models.workflowv3_entity_value_choice.workflowv3EntityValueChoice(
                        disabled = True, 
                        label = '', 
                        name = '', )
                    ],
                group_type_id = 56,
                hide_from_view = True,
                key = '',
                type = 'STRING',
                value = ''
            )
        else:
            return Workflowv3EntityHeader(
        )
        """

    def testWorkflowv3EntityHeader(self):
        """Test Workflowv3EntityHeader"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
