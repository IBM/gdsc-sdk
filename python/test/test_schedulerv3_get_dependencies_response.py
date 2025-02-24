# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.schedulerv3_get_dependencies_response import Schedulerv3GetDependenciesResponse

class TestSchedulerv3GetDependenciesResponse(unittest.TestCase):
    """Schedulerv3GetDependenciesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Schedulerv3GetDependenciesResponse:
        """Test Schedulerv3GetDependenciesResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Schedulerv3GetDependenciesResponse`
        """
        model = Schedulerv3GetDependenciesResponse()
        if include_optional:
            return Schedulerv3GetDependenciesResponse(
                dependencies = [
                    ibm_gdsc_sdk_saas.models.dependency_shows_how_many_scheduled_tasks_are_using_the_requested_configuration_type.Dependency shows how many scheduled tasks are using the requested configuration type(
                        config_id = '', 
                        config_type = '', 
                        scheduled_task_count = 56, )
                    ]
            )
        else:
            return Schedulerv3GetDependenciesResponse(
        )
        """

    def testSchedulerv3GetDependenciesResponse(self):
        """Test Schedulerv3GetDependenciesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
