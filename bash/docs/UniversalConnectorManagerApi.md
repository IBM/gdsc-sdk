# UniversalConnectorManagerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**universalConnectorManagerGetCertificate**](UniversalConnectorManagerApi.md#universalConnectorManagerGetCertificate) | **GET** /api/v3/certificates | Summary: Get certificate
Description: Get the certificate that allows secure communication between data sources and universal connections in GDSC.
[**universalConnectorManagerGetConnectors**](UniversalConnectorManagerApi.md#universalConnectorManagerGetConnectors) | **GET** /api/v3/connectors | Summary: Get connectors
Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
[**universalConnectorManagerGetUCSetup**](UniversalConnectorManagerApi.md#universalConnectorManagerGetUCSetup) | **GET** /api/v3/universal_connections/configurations/{plugin_id} | Gets information to setup the new Universal connection.
[**universalConnectorManagerListConnectionsSummary**](UniversalConnectorManagerApi.md#universalConnectorManagerListConnectionsSummary) | **GET** /api/v3/universal_connections | Summary: List connections summary
Description: List a summary of Universal Connector configured connections (AKA datasources).
[**universalConnectorManagerPluginsList**](UniversalConnectorManagerApi.md#universalConnectorManagerPluginsList) | **GET** /api/v3/plugins | Summary: Plugins list
Description: List of all universal connector plugins.
[**universalConnectorManagerUploadPlugin**](UniversalConnectorManagerApi.md#universalConnectorManagerUploadPlugin) | **POST** /api/v3/plugins | Summary: Upload plugin
Description: Upload a plugin-package for Universal Connector.



## universalConnectorManagerGetCertificate

Summary: Get certificate
Description: Get the certificate that allows secure communication between data sources and universal connections in GDSC.

### Example

```bash
 universalConnectorManagerGetCertificate
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3FileResponse**](Universalconnectormanagerv3FileResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## universalConnectorManagerGetConnectors

Summary: Get connectors
Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.

### Example

```bash
 universalConnectorManagerGetConnectors
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3GetConnectorsResponse**](Universalconnectormanagerv3GetConnectorsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## universalConnectorManagerGetUCSetup

Gets information to setup the new Universal connection.

### Example

```bash
 universalConnectorManagerGetUCSetup plugin_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **integer** | UC plugin id. | [default to null]

### Return type

[**Universalconnectormanagerv3GetUCSetupResponse**](Universalconnectormanagerv3GetUCSetupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## universalConnectorManagerListConnectionsSummary

Summary: List connections summary
Description: List a summary of Universal Connector configured connections (AKA datasources).

### Example

```bash
 universalConnectorManagerListConnectionsSummary
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3ListConnectionsResponse**](Universalconnectormanagerv3ListConnectionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## universalConnectorManagerPluginsList

Summary: Plugins list
Description: List of all universal connector plugins.

### Example

```bash
 universalConnectorManagerPluginsList
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3PluginsListResponse**](Universalconnectormanagerv3PluginsListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## universalConnectorManagerUploadPlugin

Summary: Upload plugin
Description: Upload a plugin-package for Universal Connector.

### Example

```bash
 universalConnectorManagerUploadPlugin
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **universalconnectormanagerv3UploadPluginRequest** | [**Universalconnectormanagerv3UploadPluginRequest**](Universalconnectormanagerv3UploadPluginRequest.md) |  |

### Return type

[**RpcStatus**](RpcStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

