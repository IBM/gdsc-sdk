# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.connectionsv3_update_connectors_request import Connectionsv3UpdateConnectorsRequest

class TestConnectionsv3UpdateConnectorsRequest(unittest.TestCase):
    """Connectionsv3UpdateConnectorsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Connectionsv3UpdateConnectorsRequest:
        """Test Connectionsv3UpdateConnectorsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Connectionsv3UpdateConnectorsRequest`
        """
        model = Connectionsv3UpdateConnectorsRequest()
        if include_optional:
            return Connectionsv3UpdateConnectorsRequest(
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
            return Connectionsv3UpdateConnectorsRequest(
        )
        """

    def testConnectionsv3UpdateConnectorsRequest(self):
        """Test Connectionsv3UpdateConnectorsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
