# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.guardiumconnectorv3_inspection_engine_object import Guardiumconnectorv3InspectionEngineObject

class TestGuardiumconnectorv3InspectionEngineObject(unittest.TestCase):
    """Guardiumconnectorv3InspectionEngineObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3InspectionEngineObject:
        """Test Guardiumconnectorv3InspectionEngineObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3InspectionEngineObject`
        """
        model = Guardiumconnectorv3InspectionEngineObject()
        if include_optional:
            return Guardiumconnectorv3InspectionEngineObject(
                ie_status = 56,
                inspection_engine = ''
            )
        else:
            return Guardiumconnectorv3InspectionEngineObject(
        )
        """

    def testGuardiumconnectorv3InspectionEngineObject(self):
        """Test Guardiumconnectorv3InspectionEngineObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
