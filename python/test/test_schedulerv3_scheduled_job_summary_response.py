# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.schedulerv3_scheduled_job_summary_response import Schedulerv3ScheduledJobSummaryResponse

class TestSchedulerv3ScheduledJobSummaryResponse(unittest.TestCase):
    """Schedulerv3ScheduledJobSummaryResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Schedulerv3ScheduledJobSummaryResponse:
        """Test Schedulerv3ScheduledJobSummaryResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Schedulerv3ScheduledJobSummaryResponse`
        """
        model = Schedulerv3ScheduledJobSummaryResponse()
        if include_optional:
            return Schedulerv3ScheduledJobSummaryResponse(
                record_count = 56,
                report_names = [
                    ibm_gdsc_sdk_saas.models.schedulerv3_report_array.schedulerv3ReportArray(
                        report_name = [
                            ''
                            ], )
                    ],
                scheduled_job = [
                    ibm_gdsc_sdk_saas.models.schedulerv3_scheduled_job_summary.schedulerv3ScheduledJobSummary(
                        creation_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        description = '', 
                        enabled = True, 
                        expired = True, 
                        frequency = 'UNDEFINED_FREQUENCY', 
                        last_modified_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        last_run_duration = 56, 
                        last_run_start = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        name = '', 
                        next_run = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        recipient = ibm_gdsc_sdk_saas.models.schedulerv3_recipient.schedulerv3Recipient(
                            integration_id = '', 
                            label = '', 
                            template_id = '', 
                            type = 'UNDEFINED_RECTYPE', 
                            value = '', ), 
                        recipients = [
                            ibm_gdsc_sdk_saas.models.schedulerv3_recipient.schedulerv3Recipient(
                                integration_id = '', 
                                label = '', 
                                template_id = '', 
                                value = '', )
                            ], 
                        report_names = [
                            ''
                            ], 
                        schedule_id = '', 
                        tags = [
                            ''
                            ], 
                        tasks = [
                            ibm_gdsc_sdk_saas.models.schedulerv3_scheduled_task_summary.schedulerv3ScheduledTaskSummary(
                                audit_type = 'UNDEFINED_TYPE', 
                                name = '', 
                                report_id = '', 
                                report_name = '', 
                                scheduled_task_id = '', )
                            ], )
                    ]
            )
        else:
            return Schedulerv3ScheduledJobSummaryResponse(
        )
        """

    def testSchedulerv3ScheduledJobSummaryResponse(self):
        """Test Schedulerv3ScheduledJobSummaryResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
