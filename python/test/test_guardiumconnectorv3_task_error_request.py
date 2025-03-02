# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_task_error_request import Guardiumconnectorv3TaskErrorRequest

class TestGuardiumconnectorv3TaskErrorRequest(unittest.TestCase):
    """Guardiumconnectorv3TaskErrorRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3TaskErrorRequest:
        """Test Guardiumconnectorv3TaskErrorRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3TaskErrorRequest`
        """
        model = Guardiumconnectorv3TaskErrorRequest()
        if include_optional:
            return Guardiumconnectorv3TaskErrorRequest(
                central_manager_id = '',
                error_code = '',
                error_description = '',
                task = ibm_gdsc_sdk_saas.models.guardiumconnectorv3_task_definition.guardiumconnectorv3TaskDefinition(
                    task_id = '', 
                    task_params = [
                        ibm_gdsc_sdk_saas.models.guardiumconnectorv3_task_params_object.guardiumconnectorv3TaskParamsObject(
                            arg_name = '', 
                            arg_value = '', )
                        ], 
                    task_type = '', )
            )
        else:
            return Guardiumconnectorv3TaskErrorRequest(
        )
        """

    def testGuardiumconnectorv3TaskErrorRequest(self):
        """Test Guardiumconnectorv3TaskErrorRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
