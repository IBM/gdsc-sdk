# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_add_task_request import Guardiumconnectorv3AddTaskRequest

class TestGuardiumconnectorv3AddTaskRequest(unittest.TestCase):
    """Guardiumconnectorv3AddTaskRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3AddTaskRequest:
        """Test Guardiumconnectorv3AddTaskRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3AddTaskRequest`
        """
        model = Guardiumconnectorv3AddTaskRequest()
        if include_optional:
            return Guardiumconnectorv3AddTaskRequest(
                central_manager_id = '',
                interval = '',
                key_object = '',
                params = [
                    ibm_gdsc_sdk_saas.models.guardiumconnectorv3_task_params_object.guardiumconnectorv3TaskParamsObject(
                        arg_name = '', 
                        arg_value = '', )
                    ],
                task_type = ''
            )
        else:
            return Guardiumconnectorv3AddTaskRequest(
        )
        """

    def testGuardiumconnectorv3AddTaskRequest(self):
        """Test Guardiumconnectorv3AddTaskRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
