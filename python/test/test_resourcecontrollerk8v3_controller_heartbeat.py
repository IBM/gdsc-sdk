# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_controller_heartbeat import Resourcecontrollerk8v3ControllerHeartbeat

class TestResourcecontrollerk8v3ControllerHeartbeat(unittest.TestCase):
    """Resourcecontrollerk8v3ControllerHeartbeat unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Resourcecontrollerk8v3ControllerHeartbeat:
        """Test Resourcecontrollerk8v3ControllerHeartbeat
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Resourcecontrollerk8v3ControllerHeartbeat`
        """
        model = Resourcecontrollerk8v3ControllerHeartbeat()
        if include_optional:
            return Resourcecontrollerk8v3ControllerHeartbeat(
                capability = {
                    'key' : True
                    },
                controller_id = '',
                controller_version = ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_version.resourcecontrollerk8v3Version(
                    build = '', 
                    major = '', 
                    micro = '', 
                    minor = '', 
                    version = '', ),
                resources = ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_controller_resources.resourcecontrollerk8v3ControllerResources(
                    allocatable = {
                        'key' : ''
                        }, 
                    node = '', 
                    timestamp = '', 
                    usage = {
                        'key' : ''
                        }, 
                    window = '', )
            )
        else:
            return Resourcecontrollerk8v3ControllerHeartbeat(
        )
        """

    def testResourcecontrollerk8v3ControllerHeartbeat(self):
        """Test Resourcecontrollerk8v3ControllerHeartbeat"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
