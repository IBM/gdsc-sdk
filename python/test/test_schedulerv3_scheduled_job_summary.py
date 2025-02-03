# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.schedulerv3_scheduled_job_summary import Schedulerv3ScheduledJobSummary

class TestSchedulerv3ScheduledJobSummary(unittest.TestCase):
    """Schedulerv3ScheduledJobSummary unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Schedulerv3ScheduledJobSummary:
        """Test Schedulerv3ScheduledJobSummary
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Schedulerv3ScheduledJobSummary`
        """
        model = Schedulerv3ScheduledJobSummary()
        if include_optional:
            return Schedulerv3ScheduledJobSummary(
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
                recipient = ibm_gdsc_sdk_software.models.schedulerv3_recipient.schedulerv3Recipient(
                    integration_id = '', 
                    label = '', 
                    template_id = '', 
                    type = 'UNDEFINED_RECTYPE', 
                    value = '', ),
                recipients = [
                    ibm_gdsc_sdk_software.models.schedulerv3_recipient.schedulerv3Recipient(
                        integration_id = '', 
                        label = '', 
                        template_id = '', 
                        type = 'UNDEFINED_RECTYPE', 
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
                    ibm_gdsc_sdk_software.models.schedulerv3_scheduled_task_summary.schedulerv3ScheduledTaskSummary(
                        audit_type = 'UNDEFINED_TYPE', 
                        name = '', 
                        report_id = '', 
                        report_name = '', 
                        scheduled_task_id = '', 
                        type = 'UNDEFINED_JOBTYPE', )
                    ]
            )
        else:
            return Schedulerv3ScheduledJobSummary(
        )
        """

    def testSchedulerv3ScheduledJobSummary(self):
        """Test Schedulerv3ScheduledJobSummary"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
