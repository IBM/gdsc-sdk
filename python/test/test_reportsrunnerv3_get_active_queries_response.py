# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_active_queries_response import Reportsrunnerv3GetActiveQueriesResponse

class TestReportsrunnerv3GetActiveQueriesResponse(unittest.TestCase):
    """Reportsrunnerv3GetActiveQueriesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Reportsrunnerv3GetActiveQueriesResponse:
        """Test Reportsrunnerv3GetActiveQueriesResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Reportsrunnerv3GetActiveQueriesResponse`
        """
        model = Reportsrunnerv3GetActiveQueriesResponse()
        if include_optional:
            return Reportsrunnerv3GetActiveQueriesResponse(
                queries = [
                    ibm_gdsc_sdk_saas.models.active_query_is_the_detail_for_a_running_query.ActiveQuery is the detail for a running query(
                        can_stop = True, 
                        detail = '', 
                        elapsed_time = 56, 
                        name = '', 
                        query_id = '', 
                        start_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        status = '', 
                        type = '', 
                        user = '', )
                    ]
            )
        else:
            return Reportsrunnerv3GetActiveQueriesResponse(
        )
        """

    def testReportsrunnerv3GetActiveQueriesResponse(self):
        """Test Reportsrunnerv3GetActiveQueriesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
