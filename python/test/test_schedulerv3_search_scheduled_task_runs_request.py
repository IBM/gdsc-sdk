# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.schedulerv3_search_scheduled_task_runs_request import Schedulerv3SearchScheduledTaskRunsRequest

class TestSchedulerv3SearchScheduledTaskRunsRequest(unittest.TestCase):
    """Schedulerv3SearchScheduledTaskRunsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Schedulerv3SearchScheduledTaskRunsRequest:
        """Test Schedulerv3SearchScheduledTaskRunsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Schedulerv3SearchScheduledTaskRunsRequest`
        """
        model = Schedulerv3SearchScheduledTaskRunsRequest()
        if include_optional:
            return Schedulerv3SearchScheduledTaskRunsRequest(
                limit = 56,
                offset = 56,
                scheduled_job_id = [
                    ''
                    ],
                with_latest = True
            )
        else:
            return Schedulerv3SearchScheduledTaskRunsRequest(
        )
        """

    def testSchedulerv3SearchScheduledTaskRunsRequest(self):
        """Test Schedulerv3SearchScheduledTaskRunsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
