# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.templatesv3_create_template_request import Templatesv3CreateTemplateRequest

class TestTemplatesv3CreateTemplateRequest(unittest.TestCase):
    """Templatesv3CreateTemplateRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Templatesv3CreateTemplateRequest:
        """Test Templatesv3CreateTemplateRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Templatesv3CreateTemplateRequest`
        """
        model = Templatesv3CreateTemplateRequest()
        if include_optional:
            return Templatesv3CreateTemplateRequest(
                template = ibm_gdsc_sdk_software.models.templatesv3_template.templatesv3Template(
                    content = '', 
                    default_recipient = ibm_gdsc_sdk_software.models.templatesv3_simple_recipient.templatesv3SimpleRecipient(
                        recipient_type = 'USER', 
                        value = '', ), 
                    integration = 'UNDEFINED_INTEGRATION', 
                    integration_id = '', 
                    integration_name = '', 
                    is_default = True, 
                    is_enabled = True, 
                    mime_type = 'PLAIN_TEXT', 
                    name = '', 
                    order = 56, 
                    origin = 'UNDEFINED_ORIGIN', 
                    tags = [
                        ''
                        ], 
                    template_id = '', 
                    title = '', )
            )
        else:
            return Templatesv3CreateTemplateRequest(
        )
        """

    def testTemplatesv3CreateTemplateRequest(self):
        """Test Templatesv3CreateTemplateRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
