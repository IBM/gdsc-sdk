# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.connectionsv3_create_connections_configs_request import Connectionsv3CreateConnectionsConfigsRequest

class TestConnectionsv3CreateConnectionsConfigsRequest(unittest.TestCase):
    """Connectionsv3CreateConnectionsConfigsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Connectionsv3CreateConnectionsConfigsRequest:
        """Test Connectionsv3CreateConnectionsConfigsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Connectionsv3CreateConnectionsConfigsRequest`
        """
        model = Connectionsv3CreateConnectionsConfigsRequest()
        if include_optional:
            return Connectionsv3CreateConnectionsConfigsRequest(
                connection_id = '',
                stream_connection = ibm_gdsc_sdk_saas.models.connectionsv3_stream_connection.connectionsv3StreamConnection(
                    account_id = '', 
                    account_name = '', 
                    cluster_resource_id = '', 
                    consumer_group_name = '', 
                    db_dns_endpoint = '', 
                    db_name = '', 
                    db_type = '', 
                    name = '', 
                    namespace = '', 
                    password = '', 
                    port = '', 
                    provider = '', 
                    region = '', 
                    start_monitor = '', 
                    status = 'UNDEFINED_STATUS', 
                    status_text = '', 
                    status_timestamp = '', 
                    storage_connection_string = '', 
                    username = '', ),
                type = 'UNDEFINED_TYPE',
                uc_connection = ibm_gdsc_sdk_saas.models.connectionsv3_uc_connection_summary.connectionsv3UCConnectionSummary(
                    alias = '', 
                    config_id = '', 
                    datasource_type = '', 
                    edge_deployment_server = ibm_gdsc_sdk_saas.models.edge_deployment_server_type.Edge deployment server type(
                        id = '', 
                        name = '', ), 
                    filter_alias = '', 
                    host = '', 
                    input_alias = '', 
                    last_response = '', 
                    port = '', 
                    status = 'UNDEFINED_STATUS', 
                    status_text = '', 
                    uc_connection_id = '', )
            )
        else:
            return Connectionsv3CreateConnectionsConfigsRequest(
        )
        """

    def testConnectionsv3CreateConnectionsConfigsRequest(self):
        """Test Connectionsv3CreateConnectionsConfigsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
