# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.guardiumconnectorv3_task_params_object import Guardiumconnectorv3TaskParamsObject

class TestGuardiumconnectorv3TaskParamsObject(unittest.TestCase):
    """Guardiumconnectorv3TaskParamsObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3TaskParamsObject:
        """Test Guardiumconnectorv3TaskParamsObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3TaskParamsObject`
        """
        model = Guardiumconnectorv3TaskParamsObject()
        if include_optional:
            return Guardiumconnectorv3TaskParamsObject(
                arg_name = '',
                arg_value = ''
            )
        else:
            return Guardiumconnectorv3TaskParamsObject(
        )
        """

    def testGuardiumconnectorv3TaskParamsObject(self):
        """Test Guardiumconnectorv3TaskParamsObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
