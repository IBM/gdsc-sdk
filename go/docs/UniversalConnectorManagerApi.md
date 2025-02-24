# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UniversalConnectorManagerGetCertificate**](UniversalConnectorManagerApi.md#UniversalConnectorManagerGetCertificate) | **Get** /api/v3/certificates | Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in Guardium Insights.
[**UniversalConnectorManagerGetConnectors**](UniversalConnectorManagerApi.md#UniversalConnectorManagerGetConnectors) | **Get** /api/v3/connectors | Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
[**UniversalConnectorManagerGetUCSetup**](UniversalConnectorManagerApi.md#UniversalConnectorManagerGetUCSetup) | **Get** /api/v3/universal_connections/configurations/{plugin_id} | Gets information to setup the new Universal connection.
[**UniversalConnectorManagerListConnectionsSummary**](UniversalConnectorManagerApi.md#UniversalConnectorManagerListConnectionsSummary) | **Get** /api/v3/universal_connections | Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
[**UniversalConnectorManagerPluginsList**](UniversalConnectorManagerApi.md#UniversalConnectorManagerPluginsList) | **Get** /api/v3/plugins | Summary: Plugins list Description: List of all universal connector plugins.
[**UniversalConnectorManagerUploadPlugin**](UniversalConnectorManagerApi.md#UniversalConnectorManagerUploadPlugin) | **Post** /api/v3/plugins | Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.

# **UniversalConnectorManagerGetCertificate**
> Universalconnectormanagerv3FileResponse UniversalConnectorManagerGetCertificate(ctx, )
Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in Guardium Insights.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3FileResponse**](universalconnectormanagerv3FileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UniversalConnectorManagerGetConnectors**
> Universalconnectormanagerv3GetConnectorsResponse UniversalConnectorManagerGetConnectors(ctx, )
Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3GetConnectorsResponse**](universalconnectormanagerv3GetConnectorsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UniversalConnectorManagerGetUCSetup**
> Universalconnectormanagerv3GetUcSetupResponse UniversalConnectorManagerGetUCSetup(ctx, pluginId)
Gets information to setup the new Universal connection.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **pluginId** | **int32**| UC plugin id. | 

### Return type

[**Universalconnectormanagerv3GetUcSetupResponse**](universalconnectormanagerv3GetUCSetupResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UniversalConnectorManagerListConnectionsSummary**
> Universalconnectormanagerv3ListConnectionsResponse UniversalConnectorManagerListConnectionsSummary(ctx, )
Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3ListConnectionsResponse**](universalconnectormanagerv3ListConnectionsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UniversalConnectorManagerPluginsList**
> Universalconnectormanagerv3PluginsListResponse UniversalConnectorManagerPluginsList(ctx, )
Summary: Plugins list Description: List of all universal connector plugins.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3PluginsListResponse**](universalconnectormanagerv3PluginsListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UniversalConnectorManagerUploadPlugin**
> RpcStatus UniversalConnectorManagerUploadPlugin(ctx, body)
Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Universalconnectormanagerv3UploadPluginRequest**](Universalconnectormanagerv3UploadPluginRequest.md)|  | 

### Return type

[**RpcStatus**](rpcStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

