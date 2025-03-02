# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.workflowv3_entity import Workflowv3Entity

class TestWorkflowv3Entity(unittest.TestCase):
    """Workflowv3Entity unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Workflowv3Entity:
        """Test Workflowv3Entity
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Workflowv3Entity`
        """
        model = Workflowv3Entity()
        if include_optional:
            return Workflowv3Entity(
                label = '',
                template_id = '',
                type = 'UNDEFINED_ENTITY_TYPE',
                value = ''
            )
        else:
            return Workflowv3Entity(
        )
        """

    def testWorkflowv3Entity(self):
        """Test Workflowv3Entity"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
