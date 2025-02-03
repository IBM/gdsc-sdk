# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.schedulerv3_search_scheduled_jobs_request import Schedulerv3SearchScheduledJobsRequest

class TestSchedulerv3SearchScheduledJobsRequest(unittest.TestCase):
    """Schedulerv3SearchScheduledJobsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Schedulerv3SearchScheduledJobsRequest:
        """Test Schedulerv3SearchScheduledJobsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Schedulerv3SearchScheduledJobsRequest`
        """
        model = Schedulerv3SearchScheduledJobsRequest()
        if include_optional:
            return Schedulerv3SearchScheduledJobsRequest(
                limit = 56,
                offset = 56,
                filter = ibm_gdsc_sdk_software.models.schedulerv3_scheduled_jobs_filter.schedulerv3ScheduledJobsFilter(
                    enabled = '', 
                    end_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    ignore_acl = True, 
                    name_filter = [
                        ''
                        ], 
                    start_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    status_filter = [
                        'UNDEFINED'
                        ], 
                    tag_filter = '', )
            )
        else:
            return Schedulerv3SearchScheduledJobsRequest(
        )
        """

    def testSchedulerv3SearchScheduledJobsRequest(self):
        """Test Schedulerv3SearchScheduledJobsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
