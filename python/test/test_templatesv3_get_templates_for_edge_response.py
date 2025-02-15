# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.templatesv3_get_templates_for_edge_response import Templatesv3GetTemplatesForEdgeResponse

class TestTemplatesv3GetTemplatesForEdgeResponse(unittest.TestCase):
    """Templatesv3GetTemplatesForEdgeResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Templatesv3GetTemplatesForEdgeResponse:
        """Test Templatesv3GetTemplatesForEdgeResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Templatesv3GetTemplatesForEdgeResponse`
        """
        model = Templatesv3GetTemplatesForEdgeResponse()
        if include_optional:
            return Templatesv3GetTemplatesForEdgeResponse(
                status = ibm_gdsc_sdk_software.models.the_`status`_type_defines_a_logical_error_model_that_is_suitable_for_different
programming_environments,_including_rest_apis_and_rpc_apis/_it_is_used_by
[g_rpc](https://github/com/grpc)/_the_error_model_is_designed_to_be:.The `Status` type defines a logical error model that is suitable for different
programming environments, including REST APIs and RPC APIs. It is used by
[gRPC](https://github.com/grpc). The error model is designed to be:(
                    code = 56, 
                    details = [
                        ibm_gdsc_sdk_software.models.protobuf_any.protobufAny(
                            type_url = '', 
                            value = 'YQ==', )
                        ], 
                    message = '', ),
                template = [
                    ibm_gdsc_sdk_software.models.templatesv3_template.templatesv3Template(
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
                    ]
            )
        else:
            return Templatesv3GetTemplatesForEdgeResponse(
        )
        """

    def testTemplatesv3GetTemplatesForEdgeResponse(self):
        """Test Templatesv3GetTemplatesForEdgeResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
