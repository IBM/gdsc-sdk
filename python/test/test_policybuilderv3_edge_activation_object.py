# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.policybuilderv3_edge_activation_object import Policybuilderv3EdgeActivationObject

class TestPolicybuilderv3EdgeActivationObject(unittest.TestCase):
    """Policybuilderv3EdgeActivationObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Policybuilderv3EdgeActivationObject:
        """Test Policybuilderv3EdgeActivationObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Policybuilderv3EdgeActivationObject`
        """
        model = Policybuilderv3EdgeActivationObject()
        if include_optional:
            return Policybuilderv3EdgeActivationObject(
                activatation_timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                activation_order = 56,
                activation_status = 'NOT_ACTIVATED',
                edge_id = ''
            )
        else:
            return Policybuilderv3EdgeActivationObject(
        )
        """

    def testPolicybuilderv3EdgeActivationObject(self):
        """Test Policybuilderv3EdgeActivationObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
