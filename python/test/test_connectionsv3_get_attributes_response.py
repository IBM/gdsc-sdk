# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.connectionsv3_get_attributes_response import Connectionsv3GetAttributesResponse

class TestConnectionsv3GetAttributesResponse(unittest.TestCase):
    """Connectionsv3GetAttributesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Connectionsv3GetAttributesResponse:
        """Test Connectionsv3GetAttributesResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Connectionsv3GetAttributesResponse`
        """
        model = Connectionsv3GetAttributesResponse()
        if include_optional:
            return Connectionsv3GetAttributesResponse(
                attributes = [
                    ibm_gdsc_sdk_software.models.connectionsv3_connector_attribute.connectionsv3ConnectorAttribute(
                        id = '', 
                        tags = [
                            ''
                            ], )
                    ]
            )
        else:
            return Connectionsv3GetAttributesResponse(
        )
        """

    def testConnectionsv3GetAttributesResponse(self):
        """Test Connectionsv3GetAttributesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
