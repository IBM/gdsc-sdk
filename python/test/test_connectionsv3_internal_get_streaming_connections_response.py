# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.connectionsv3_internal_get_streaming_connections_response import Connectionsv3InternalGetStreamingConnectionsResponse

class TestConnectionsv3InternalGetStreamingConnectionsResponse(unittest.TestCase):
    """Connectionsv3InternalGetStreamingConnectionsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Connectionsv3InternalGetStreamingConnectionsResponse:
        """Test Connectionsv3InternalGetStreamingConnectionsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Connectionsv3InternalGetStreamingConnectionsResponse`
        """
        model = Connectionsv3InternalGetStreamingConnectionsResponse()
        if include_optional:
            return Connectionsv3InternalGetStreamingConnectionsResponse(
                streaming_configs_by_tenants = [
                    ibm_gdsc_sdk_software.models.connectionsv3_streaming_configs_by_tenant.connectionsv3StreamingConfigsByTenant(
                        mini_snif_endpoint = '', 
                        streaming_configs = ibm_gdsc_sdk_software.models.connectionsv3_streaming_configs.connectionsv3StreamingConfigs(
                            account_configs = [
                                ibm_gdsc_sdk_software.models.connectionsv3_account_config.connectionsv3AccountConfig(
                                    account = ibm_gdsc_sdk_software.models.connectionsv3_account.connectionsv3Account(
                                        access_key = '', 
                                        authentication_type = '', 
                                        connection_type = '', 
                                        name = '', 
                                        role_arn = '', 
                                        secret_access_key = '', ), 
                                    account_id = '', )
                                ], 
                            instance_configs = [
                                ibm_gdsc_sdk_software.models.connectionsv3_stream_connection_config.connectionsv3StreamConnectionConfig(
                                    connection_id = '', 
                                    stream_connection = ibm_gdsc_sdk_software.models.connectionsv3_stream_connection.connectionsv3StreamConnection(
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
                                        username = '', ), )
                                ], ), 
                        tenant_id = '', )
                    ]
            )
        else:
            return Connectionsv3InternalGetStreamingConnectionsResponse(
        )
        """

    def testConnectionsv3InternalGetStreamingConnectionsResponse(self):
        """Test Connectionsv3InternalGetStreamingConnectionsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
