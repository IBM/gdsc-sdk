# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.connectionsv3_internal_search_connection_response import Connectionsv3InternalSearchConnectionResponse

class TestConnectionsv3InternalSearchConnectionResponse(unittest.TestCase):
    """Connectionsv3InternalSearchConnectionResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Connectionsv3InternalSearchConnectionResponse:
        """Test Connectionsv3InternalSearchConnectionResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Connectionsv3InternalSearchConnectionResponse`
        """
        model = Connectionsv3InternalSearchConnectionResponse()
        if include_optional:
            return Connectionsv3InternalSearchConnectionResponse(
                status = 56,
                connectors = [
                    ibm_gdsc_sdk_saas.models.connectionsv3_connector.connectionsv3Connector(
                        columns = [
                            ibm_gdsc_sdk_saas.models.connectionsv3_connector_column.connectionsv3ConnectorColumn(
                                id = '', 
                                values = [
                                    ''
                                    ], )
                            ], 
                        id = '', 
                        tags = [
                            ''
                            ], 
                        type = 'UNDEFINED_TYPE', )
                    ]
            )
        else:
            return Connectionsv3InternalSearchConnectionResponse(
        )
        """

    def testConnectionsv3InternalSearchConnectionResponse(self):
        """Test Connectionsv3InternalSearchConnectionResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
