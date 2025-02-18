# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_tasks_response import Guardiumconnectorv3GetTasksResponse

class TestGuardiumconnectorv3GetTasksResponse(unittest.TestCase):
    """Guardiumconnectorv3GetTasksResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3GetTasksResponse:
        """Test Guardiumconnectorv3GetTasksResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3GetTasksResponse`
        """
        model = Guardiumconnectorv3GetTasksResponse()
        if include_optional:
            return Guardiumconnectorv3GetTasksResponse(
                status = ibm_gdsc_sdk_software.models.guardiumconnectorv3_status_response_base.guardiumconnectorv3StatusResponseBase(
                    message = '', 
                    status = '', ),
                tasks = [
                    ibm_gdsc_sdk_software.models.guardiumconnectorv3_task_object.guardiumconnectorv3TaskObject(
                        sub_tasks = [
                            ibm_gdsc_sdk_software.models.guardiumconnectorv3_sub_task_object.guardiumconnectorv3SubTaskObject(
                                id = '', 
                                interval = '', 
                                params = [
                                    ibm_gdsc_sdk_software.models.guardiumconnectorv3_task_params_object.guardiumconnectorv3TaskParamsObject(
                                        arg_name = '', 
                                        arg_value = '', )
                                    ], )
                            ], 
                        task_definition = ibm_gdsc_sdk_software.models.guardiumconnectorv3_task_definition_object.guardiumconnectorv3TaskDefinitionObject(
                            execution_trigger = 56, 
                            interval = '', 
                            is_blocker_task = 56, 
                            task_type = '', 
                            version = '', ), )
                    ]
            )
        else:
            return Guardiumconnectorv3GetTasksResponse(
        )
        """

    def testGuardiumconnectorv3GetTasksResponse(self):
        """Test Guardiumconnectorv3GetTasksResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
