# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.schedulerv3_search_scheduled_task_runs_response import Schedulerv3SearchScheduledTaskRunsResponse

class TestSchedulerv3SearchScheduledTaskRunsResponse(unittest.TestCase):
    """Schedulerv3SearchScheduledTaskRunsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Schedulerv3SearchScheduledTaskRunsResponse:
        """Test Schedulerv3SearchScheduledTaskRunsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Schedulerv3SearchScheduledTaskRunsResponse`
        """
        model = Schedulerv3SearchScheduledTaskRunsResponse()
        if include_optional:
            return Schedulerv3SearchScheduledTaskRunsResponse(
                record_count = 56,
                runs = [
                    ibm_gdsc_sdk_saas.models.scheduled_job_run.ScheduledJobRun(
                        collection_id = '', 
                        end_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        job_id = '', 
                        previous_job_id = '', 
                        query_from = '', 
                        query_to = '', 
                        queue_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        result_size = 56, 
                        run_detail = '', 
                        schedule_id = '', 
                        start_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        status = 'UNDEFINED', 
                        task_id = '', 
                        task_name = '', 
                        task_type = 'UNDEFINED_JOBTYPE', )
                    ]
            )
        else:
            return Schedulerv3SearchScheduledTaskRunsResponse(
        )
        """

    def testSchedulerv3SearchScheduledTaskRunsResponse(self):
        """Test Schedulerv3SearchScheduledTaskRunsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
