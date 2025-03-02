# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.templatesv3_transform_template_request import Templatesv3TransformTemplateRequest

class TestTemplatesv3TransformTemplateRequest(unittest.TestCase):
    """Templatesv3TransformTemplateRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Templatesv3TransformTemplateRequest:
        """Test Templatesv3TransformTemplateRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Templatesv3TransformTemplateRequest`
        """
        model = Templatesv3TransformTemplateRequest()
        if include_optional:
            return Templatesv3TransformTemplateRequest(
                data = {
                    'key' : ''
                    },
                integration = 'UNDEFINED_INTEGRATION',
                mime_type = 'PLAIN_TEXT',
                origin = 'UNDEFINED_ORIGIN',
                template_id = ''
            )
        else:
            return Templatesv3TransformTemplateRequest(
        )
        """

    def testTemplatesv3TransformTemplateRequest(self):
        """Test Templatesv3TransformTemplateRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
