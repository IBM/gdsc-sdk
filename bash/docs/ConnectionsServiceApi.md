# ConnectionsServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectionsServiceCreateConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceCreateConnectionsAccounts) | **POST** /api/v3/connections/accounts | Summary: Create Connections accounts
Description: Create Connections acccounts.
[**connectionsServiceCreateConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceCreateConnectionsConfigs) | **POST** /api/v3/connections/configs | Summary: Create connections configs
Description: Create Connection config by connection type.
[**connectionsServiceCreatePlugin**](ConnectionsServiceApi.md#connectionsServiceCreatePlugin) | **POST** /api/v3/connections/plugins | Summary: Create plugin
Description: Create UC generic plugin
[**connectionsServiceCreateSettings**](ConnectionsServiceApi.md#connectionsServiceCreateSettings) | **POST** /api/v3/connections/settings | Summary: Create settings
Description: Create Settings.
[**connectionsServiceDeleteConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceDeleteConnectionsAccounts) | **DELETE** /api/v3/connections/accounts/{account_id} | Summary: Delete Connections accounts
Description: Delete Connections acccounts.
[**connectionsServiceDeleteConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceDeleteConnectionsConfigs) | **DELETE** /api/v3/connections/configs/{connection_id} | Summary: Delete connections configs
Description: Delete Connection config by connection id.
[**connectionsServiceDeleteConnector**](ConnectionsServiceApi.md#connectionsServiceDeleteConnector) | **DELETE** /api/v3/connections/{connection_id} | Summary: Delete connector
Description: Delete a Connection.
[**connectionsServiceDeletePlugin**](ConnectionsServiceApi.md#connectionsServiceDeletePlugin) | **DELETE** /api/v3/connections/plugins/{id} | Summary: Delete plugin.
Description: Delete plugin.
[**connectionsServiceGeneratePackage**](ConnectionsServiceApi.md#connectionsServiceGeneratePackage) | **PUT** /api/v3/connections/plugins/{id}/package | Summary: Generate package.
Description: Generate package.
[**connectionsServiceGetBannerState**](ConnectionsServiceApi.md#connectionsServiceGetBannerState) | **GET** /api/v3/connections/banner | Summary: Get banner state for object verb page. 
Description: Get banner state for object verb page.
[**connectionsServiceGetConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceGetConnectionsAccounts) | **GET** /api/v3/connections/accounts | Summary: Get Connections accounts
Description: Get Connections acccounts.
[**connectionsServiceGetConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceGetConnectionsConfigs) | **GET** /api/v3/connections/configs | Summary: Get connections configs
Description: Get Connection config by connection type.
[**connectionsServiceGetConnectionsWithFilters**](ConnectionsServiceApi.md#connectionsServiceGetConnectionsWithFilters) | **POST** /api/v3/connections | Summary: Get connections with filters
Description: Get connections with filters.
[**connectionsServiceGetConnectorsSummary**](ConnectionsServiceApi.md#connectionsServiceGetConnectorsSummary) | **GET** /api/v3/connections/summary | Summary: Get connectors summary
Description: Get a summary of Connectors.
[**connectionsServiceGetDataSources**](ConnectionsServiceApi.md#connectionsServiceGetDataSources) | **GET** /api/v3/connections/datasources | Summary: Get data sources
Description: Get a list of data sources.
[**connectionsServiceGetGuardRecordFields**](ConnectionsServiceApi.md#connectionsServiceGetGuardRecordFields) | **GET** /api/v3/connections/fields | Summary: Get list of guard record fields. 
Description: Get list of guard record fields.
[**connectionsServiceGetHeaders**](ConnectionsServiceApi.md#connectionsServiceGetHeaders) | **GET** /api/v3/connections/headers | Summary: Get headers
Description: Get a list of Headers.
[**connectionsServiceGetPlugins**](ConnectionsServiceApi.md#connectionsServiceGetPlugins) | **GET** /api/v3/connections/plugins | Summary: Get plugins 
Description: Get custom universal connector plugins
[**connectionsServiceGetSettings**](ConnectionsServiceApi.md#connectionsServiceGetSettings) | **GET** /api/v3/connections/settings | Summary: Get settings
Description: Get a list of Settings.
[**connectionsServicePartialUpdateConnectors**](ConnectionsServiceApi.md#connectionsServicePartialUpdateConnectors) | **PATCH** /api/v3/connections | Summary: Partial update connectors
Description: Partial update of Connectors.
[**connectionsServicePostStapCommand**](ConnectionsServiceApi.md#connectionsServicePostStapCommand) | **POST** /api/v3/stap/commands | Summary: Post stap command
Description: Send a STAP command down to kafka for snif-assist.
[**connectionsServiceUpdateBannerState**](ConnectionsServiceApi.md#connectionsServiceUpdateBannerState) | **PUT** /api/v3/connections/banner | Summary: Update banner state for object verb page. 
Description: Update banner state for object verb page.
[**connectionsServiceUpdateConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceUpdateConnectionsAccounts) | **PUT** /api/v3/connections/accounts | Summary: Update Connections accounts
Description: Update Connections acccounts.
[**connectionsServiceUpdateConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceUpdateConnectionsConfigs) | **PATCH** /api/v3/connections/configs | Summary: Update connections configs
Description: Update Connection config by connection id.
[**connectionsServiceUpdateConnectors**](ConnectionsServiceApi.md#connectionsServiceUpdateConnectors) | **PUT** /api/v3/connections | Summary: Update connectors
Description: Update a list of Connectors.
[**connectionsServiceUpdatePlugin**](ConnectionsServiceApi.md#connectionsServiceUpdatePlugin) | **PUT** /api/v3/connections/plugins/{id} | Summary: Update plugin.
Description: Update plugin.
[**connectionsServiceUpdateSettings**](ConnectionsServiceApi.md#connectionsServiceUpdateSettings) | **PUT** /api/v3/connections/settings | Summary: Update settings
Description: Update Settings.
[**connectionsServiceValidateAwsConnection**](ConnectionsServiceApi.md#connectionsServiceValidateAwsConnection) | **POST** /api/v3/connections/validate/aws | Summary: Validate an AWS connection.
Description: Validate an AWS connection.



## connectionsServiceCreateConnectionsAccounts

Summary: Create Connections accounts
Description: Create Connections acccounts.

### Example

```bash
 connectionsServiceCreateConnectionsAccounts
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreateConnectionsAccountsRequest** | [**Connectionsv3CreateConnectionsAccountsRequest**](Connectionsv3CreateConnectionsAccountsRequest.md) |  |

### Return type

[**Connectionsv3CreateConnectionsAccountsResponse**](Connectionsv3CreateConnectionsAccountsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceCreateConnectionsConfigs

Summary: Create connections configs
Description: Create Connection config by connection type.

### Example

```bash
 connectionsServiceCreateConnectionsConfigs
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreateConnectionsConfigsRequest** | [**Connectionsv3CreateConnectionsConfigsRequest**](Connectionsv3CreateConnectionsConfigsRequest.md) |  |

### Return type

[**Connectionsv3CreateConnectionsConfigsResponse**](Connectionsv3CreateConnectionsConfigsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceCreatePlugin

Summary: Create plugin
Description: Create UC generic plugin

### Example

```bash
 connectionsServiceCreatePlugin
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreatePluginRequest** | [**Connectionsv3CreatePluginRequest**](Connectionsv3CreatePluginRequest.md) |  |

### Return type

[**Connectionsv3CreatePluginResponse**](Connectionsv3CreatePluginResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceCreateSettings

Summary: Create settings
Description: Create Settings.

### Example

```bash
 connectionsServiceCreateSettings
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreateSettingsRequest** | [**Connectionsv3CreateSettingsRequest**](Connectionsv3CreateSettingsRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceDeleteConnectionsAccounts

Summary: Delete Connections accounts
Description: Delete Connections acccounts.

### Example

```bash
 connectionsServiceDeleteConnectionsAccounts account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** | Account id. | [default to null]

### Return type

[**Connectionsv3DeleteConnectionsAccountsResponse**](Connectionsv3DeleteConnectionsAccountsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceDeleteConnectionsConfigs

Summary: Delete connections configs
Description: Delete Connection config by connection id.

### Example

```bash
 connectionsServiceDeleteConnectionsConfigs connection_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | **string** | Connection id. | [default to null]

### Return type

[**Connectionsv3DeleteConnectionsConfigsResponse**](Connectionsv3DeleteConnectionsConfigsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceDeleteConnector

Summary: Delete connector
Description: Delete a Connection.

### Example

```bash
 connectionsServiceDeleteConnector connection_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | **string** | The connection id | [default to null]

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceDeletePlugin

Summary: Delete plugin.
Description: Delete plugin.

### Example

```bash
 connectionsServiceDeletePlugin id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | plugin id | [default to null]

### Return type

[**Connectionsv3DeletePluginResponse**](Connectionsv3DeletePluginResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceGeneratePackage

Summary: Generate package.
Description: Generate package.

### Example

```bash
 connectionsServiceGeneratePackage id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | id | [default to null]
 **connectionsv3GeneratePackageRequest** | [**Connectionsv3GeneratePackageRequest**](Connectionsv3GeneratePackageRequest.md) |  |

### Return type

[**Connectionsv3GeneratePackageResponse**](Connectionsv3GeneratePackageResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceGetBannerState

Summary: Get banner state for object verb page. 
Description: Get banner state for object verb page.

### Example

```bash
 connectionsServiceGetBannerState
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetBannerStateResponse**](Connectionsv3GetBannerStateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceGetConnectionsAccounts

Summary: Get Connections accounts
Description: Get Connections acccounts.

### Example

```bash
 connectionsServiceGetConnectionsAccounts  account_id=value  access_key=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** | Optional: account id. | [optional] [default to null]
 **accessKey** | **string** | Optional: acccount access key. | [optional] [default to null]

### Return type

[**Connectionsv3GetConnectionsAccountsResponse**](Connectionsv3GetConnectionsAccountsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceGetConnectionsConfigs

Summary: Get connections configs
Description: Get Connection config by connection type.

### Example

```bash
 connectionsServiceGetConnectionsConfigs  type=value  connection_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The type of connector. | [optional] [default to UNDEFINED_TYPE]
 **connectionId** | **string** | Optional: if connection id did not provide then return all connections. | [optional] [default to null]

### Return type

[**Connectionsv3GetConnectionsConfigsResponse**](Connectionsv3GetConnectionsConfigsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceGetConnectionsWithFilters

Summary: Get connections with filters
Description: Get connections with filters.

### Example

```bash
 connectionsServiceGetConnectionsWithFilters
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3GetConnectionsWithFiltersRequest** | [**Connectionsv3GetConnectionsWithFiltersRequest**](Connectionsv3GetConnectionsWithFiltersRequest.md) |  |

### Return type

[**Connectionsv3GetConnectionsWithFiltersResponse**](Connectionsv3GetConnectionsWithFiltersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceGetConnectorsSummary

Summary: Get connectors summary
Description: Get a summary of Connectors.

### Example

```bash
 connectionsServiceGetConnectorsSummary
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetConnectorsSummaryResponse**](Connectionsv3GetConnectorsSummaryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceGetDataSources

Summary: Get data sources
Description: Get a list of data sources.

### Example

```bash
 connectionsServiceGetDataSources
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetDataSourcesResponse**](Connectionsv3GetDataSourcesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceGetGuardRecordFields

Summary: Get list of guard record fields. 
Description: Get list of guard record fields.

### Example

```bash
 connectionsServiceGetGuardRecordFields
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetGuardRecordFieldsResponse**](Connectionsv3GetGuardRecordFieldsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceGetHeaders

Summary: Get headers
Description: Get a list of Headers.

### Example

```bash
 connectionsServiceGetHeaders
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetHeadersResponse**](Connectionsv3GetHeadersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceGetPlugins

Summary: Get plugins 
Description: Get custom universal connector plugins

### Example

```bash
 connectionsServiceGetPlugins  id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | Optional: if no plug-in id is provided, returns list of all plug-ins. | [optional] [default to null]

### Return type

[**Connectionsv3GetPluginsResponse**](Connectionsv3GetPluginsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceGetSettings

Summary: Get settings
Description: Get a list of Settings.

### Example

```bash
 connectionsServiceGetSettings
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetSettingsResponse**](Connectionsv3GetSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServicePartialUpdateConnectors

Summary: Partial update connectors
Description: Partial update of Connectors.

### Example

```bash
 connectionsServicePartialUpdateConnectors
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3PartialUpdateConnectorsRequest** | [**Connectionsv3PartialUpdateConnectorsRequest**](Connectionsv3PartialUpdateConnectorsRequest.md) |  |

### Return type

[**Connectionsv3PartialUpdateConnectorsResponse**](Connectionsv3PartialUpdateConnectorsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServicePostStapCommand

Summary: Post stap command
Description: Send a STAP command down to kafka for snif-assist.

### Example

```bash
 connectionsServicePostStapCommand
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3StapCommandRequest** | [**Connectionsv3StapCommandRequest**](Connectionsv3StapCommandRequest.md) |  |

### Return type

[**Connectionsv3StatusResponseBase**](Connectionsv3StatusResponseBase.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceUpdateBannerState

Summary: Update banner state for object verb page. 
Description: Update banner state for object verb page.

### Example

```bash
 connectionsServiceUpdateBannerState
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateBannerStateRequest** | [**Connectionsv3UpdateBannerStateRequest**](Connectionsv3UpdateBannerStateRequest.md) |  |

### Return type

[**Connectionsv3UpdateBannerStateResponse**](Connectionsv3UpdateBannerStateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceUpdateConnectionsAccounts

Summary: Update Connections accounts
Description: Update Connections acccounts.

### Example

```bash
 connectionsServiceUpdateConnectionsAccounts
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateConnectionsAccountsRequest** | [**Connectionsv3UpdateConnectionsAccountsRequest**](Connectionsv3UpdateConnectionsAccountsRequest.md) |  |

### Return type

[**Connectionsv3UpdateConnectionsAccountsResponse**](Connectionsv3UpdateConnectionsAccountsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceUpdateConnectionsConfigs

Summary: Update connections configs
Description: Update Connection config by connection id.

### Example

```bash
 connectionsServiceUpdateConnectionsConfigs
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateConnectionsConfigsRequest** | [**Connectionsv3UpdateConnectionsConfigsRequest**](Connectionsv3UpdateConnectionsConfigsRequest.md) |  |

### Return type

[**Connectionsv3UpdateConnectionsConfigsResponse**](Connectionsv3UpdateConnectionsConfigsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceUpdateConnectors

Summary: Update connectors
Description: Update a list of Connectors.

### Example

```bash
 connectionsServiceUpdateConnectors
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateConnectorsRequest** | [**Connectionsv3UpdateConnectorsRequest**](Connectionsv3UpdateConnectorsRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceUpdatePlugin

Summary: Update plugin.
Description: Update plugin.

### Example

```bash
 connectionsServiceUpdatePlugin id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | id | [default to null]
 **connectionsv3UpdatePluginRequest** | [**Connectionsv3UpdatePluginRequest**](Connectionsv3UpdatePluginRequest.md) |  |

### Return type

[**Connectionsv3UpdatePluginResponse**](Connectionsv3UpdatePluginResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceUpdateSettings

Summary: Update settings
Description: Update Settings.

### Example

```bash
 connectionsServiceUpdateSettings
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateSettingsRequest** | [**Connectionsv3UpdateSettingsRequest**](Connectionsv3UpdateSettingsRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## connectionsServiceValidateAwsConnection

Summary: Validate an AWS connection.
Description: Validate an AWS connection.

### Example

```bash
 connectionsServiceValidateAwsConnection
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3ValidateAwsConnectionRequest** | [**Connectionsv3ValidateAwsConnectionRequest**](Connectionsv3ValidateAwsConnectionRequest.md) |  |

### Return type

[**Connectionsv3ValidateConnectionResponse**](Connectionsv3ValidateConnectionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

