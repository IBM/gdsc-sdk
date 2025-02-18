# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.workflowv3_update_cases_request import Workflowv3UpdateCasesRequest

class TestWorkflowv3UpdateCasesRequest(unittest.TestCase):
    """Workflowv3UpdateCasesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Workflowv3UpdateCasesRequest:
        """Test Workflowv3UpdateCasesRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Workflowv3UpdateCasesRequest`
        """
        model = Workflowv3UpdateCasesRequest()
        if include_optional:
            return Workflowv3UpdateCasesRequest(
                cases = [
                    ibm_gdsc_sdk_software.models.editiable_fields_of_a_case.Editiable fields of a case(
                        artifacts = [
                            ''
                            ], 
                        assignments = [
                            ibm_gdsc_sdk_software.models.workflowv3_entity.workflowv3Entity(
                                label = '', 
                                template_id = '', 
                                type = 'UNDEFINED_ENTITY_TYPE', 
                                value = '', )
                            ], 
                        case_id = '', 
                        comment = '', 
                        date_due = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        description = '', 
                        priority = 'UNDEFINED_PRIORITY', 
                        status = 'UNDEFINED_STATUS', 
                        title = '', )
                    ],
                update_fields = [
                    ''
                    ]
            )
        else:
            return Workflowv3UpdateCasesRequest(
        )
        """

    def testWorkflowv3UpdateCasesRequest(self):
        """Test Workflowv3UpdateCasesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
