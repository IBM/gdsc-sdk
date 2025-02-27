# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.workflowv3_task_create import Workflowv3TaskCreate

class TestWorkflowv3TaskCreate(unittest.TestCase):
    """Workflowv3TaskCreate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Workflowv3TaskCreate:
        """Test Workflowv3TaskCreate
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Workflowv3TaskCreate`
        """
        model = Workflowv3TaskCreate()
        if include_optional:
            return Workflowv3TaskCreate(
                alt_id = '',
                assignments = [
                    ibm_gdsc_sdk_saas.models.workflowv3_entity.workflowv3Entity(
                        label = '', 
                        template_id = '', 
                        type = 'UNDEFINED_ENTITY_TYPE', 
                        value = '', )
                    ],
                comment = '',
                date_due = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                depends_on = [
                    ''
                    ],
                description = '',
                investigation_links = [
                    ibm_gdsc_sdk_saas.models.generic_configuration_item_reference.Generic configuration item reference(
                        display = '', 
                        id = '', 
                        type = '', )
                    ],
                origin = ibm_gdsc_sdk_saas.models.origininating_job_identification.Origininating job identification(
                    date_next = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    date_start = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    description = '', 
                    frequency = '', 
                    name = '', 
                    scheduled_job_id = '', ),
                priority = 'UNDEFINED_PRIORITY',
                report_result = ibm_gdsc_sdk_saas.models.workflowv3_report_result.workflowv3ReportResult(
                    headers = [
                        ibm_gdsc_sdk_saas.models.workflowv3_report_result_header.workflowv3ReportResultHeader(
                            header = '', 
                            key = '', )
                        ], 
                    rows = [
                        ibm_gdsc_sdk_saas.models.workflowv3_report_result_row.workflowv3ReportResultRow(
                            row = {
                                'key' : ''
                                }, )
                        ], ),
                response_template = ibm_gdsc_sdk_saas.models.generic_configuration_item_reference.Generic configuration item reference(
                    display = '', 
                    id = '', 
                    type = '', ),
                status = 'UNDEFINED_STATUS',
                tags = [
                    ''
                    ],
                title = ''
            )
        else:
            return Workflowv3TaskCreate(
        )
        """

    def testWorkflowv3TaskCreate(self):
        """Test Workflowv3TaskCreate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
