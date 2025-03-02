# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.connectionsv3_get_connections_with_filters_response import Connectionsv3GetConnectionsWithFiltersResponse

class TestConnectionsv3GetConnectionsWithFiltersResponse(unittest.TestCase):
    """Connectionsv3GetConnectionsWithFiltersResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Connectionsv3GetConnectionsWithFiltersResponse:
        """Test Connectionsv3GetConnectionsWithFiltersResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Connectionsv3GetConnectionsWithFiltersResponse`
        """
        model = Connectionsv3GetConnectionsWithFiltersResponse()
        if include_optional:
            return Connectionsv3GetConnectionsWithFiltersResponse(
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
                    ],
                facets = [
                    ibm_gdsc_sdk_saas.models.connectionsv3_connector_filter_header.connectionsv3ConnectorFilterHeader(
                        filters = [
                            ibm_gdsc_sdk_saas.models.connectionsv3_connector_filter.connectionsv3ConnectorFilter(
                                count = 56, 
                                value = '', )
                            ], 
                        header = '', )
                    ],
                preset_stats = [
                    ibm_gdsc_sdk_saas.models.connectionsv3_connector_setting_stat.connectionsv3ConnectorSettingStat(
                        count = 56, 
                        has_unhealthy = True, 
                        id = '', )
                    ],
                total_connectors = 56
            )
        else:
            return Connectionsv3GetConnectionsWithFiltersResponse(
        )
        """

    def testConnectionsv3GetConnectionsWithFiltersResponse(self):
        """Test Connectionsv3GetConnectionsWithFiltersResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
