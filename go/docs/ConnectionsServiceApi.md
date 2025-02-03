# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConnectionsServiceCreateConnectionsAccounts**](ConnectionsServiceApi.md#ConnectionsServiceCreateConnectionsAccounts) | **Post** /api/v3/connections/accounts | Summary: Create Connections accounts Description: Create Connections acccounts.
[**ConnectionsServiceCreateConnectionsConfigs**](ConnectionsServiceApi.md#ConnectionsServiceCreateConnectionsConfigs) | **Post** /api/v3/connections/configs | Summary: Create connections configs Description: Create Connection config by connection type.
[**ConnectionsServiceCreatePlugin**](ConnectionsServiceApi.md#ConnectionsServiceCreatePlugin) | **Post** /api/v3/connections/plugins | Summary: Create plugin Description: Create UC generic plugin
[**ConnectionsServiceCreateSettings**](ConnectionsServiceApi.md#ConnectionsServiceCreateSettings) | **Post** /api/v3/connections/settings | Summary: Create settings Description: Create Settings.
[**ConnectionsServiceDeleteConnectionsAccounts**](ConnectionsServiceApi.md#ConnectionsServiceDeleteConnectionsAccounts) | **Delete** /api/v3/connections/accounts/{account_id} | Summary: Delete Connections accounts Description: Delete Connections acccounts.
[**ConnectionsServiceDeleteConnectionsConfigs**](ConnectionsServiceApi.md#ConnectionsServiceDeleteConnectionsConfigs) | **Delete** /api/v3/connections/configs/{connection_id} | Summary: Delete connections configs Description: Delete Connection config by connection id.
[**ConnectionsServiceDeleteConnector**](ConnectionsServiceApi.md#ConnectionsServiceDeleteConnector) | **Delete** /api/v3/connections/{connection_id} | Summary: Delete connector Description: Delete a Connection.
[**ConnectionsServiceDeletePlugin**](ConnectionsServiceApi.md#ConnectionsServiceDeletePlugin) | **Delete** /api/v3/connections/plugins/{id} | Summary: Delete plugin. Description: Delete plugin.
[**ConnectionsServiceGetBannerState**](ConnectionsServiceApi.md#ConnectionsServiceGetBannerState) | **Get** /api/v3/connections/banner | Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.
[**ConnectionsServiceGetConnectionsAccounts**](ConnectionsServiceApi.md#ConnectionsServiceGetConnectionsAccounts) | **Get** /api/v3/connections/accounts | Summary: Get Connections accounts Description: Get Connections acccounts.
[**ConnectionsServiceGetConnectionsConfigs**](ConnectionsServiceApi.md#ConnectionsServiceGetConnectionsConfigs) | **Get** /api/v3/connections/configs | Summary: Get connections configs Description: Get Connection config by connection type.
[**ConnectionsServiceGetConnectionsWithFilters**](ConnectionsServiceApi.md#ConnectionsServiceGetConnectionsWithFilters) | **Post** /api/v3/connections | Summary: Get connections with filters Description: Get connections with filters.
[**ConnectionsServiceGetConnectorsSummary**](ConnectionsServiceApi.md#ConnectionsServiceGetConnectorsSummary) | **Get** /api/v3/connections/summary | Summary: Get connectors summary Description: Get a summary of Connectors.
[**ConnectionsServiceGetDataSources**](ConnectionsServiceApi.md#ConnectionsServiceGetDataSources) | **Get** /api/v3/connections/datasources | Summary: Get data sources Description: Get a list of data sources.
[**ConnectionsServiceGetGuardRecordFields**](ConnectionsServiceApi.md#ConnectionsServiceGetGuardRecordFields) | **Get** /api/v3/connections/fields | Summary: Get list of guard record fields.  Description: Get list of guard record fields.
[**ConnectionsServiceGetHeaders**](ConnectionsServiceApi.md#ConnectionsServiceGetHeaders) | **Get** /api/v3/connections/headers | Summary: Get headers Description: Get a list of Headers.
[**ConnectionsServiceGetPlugins**](ConnectionsServiceApi.md#ConnectionsServiceGetPlugins) | **Get** /api/v3/connections/plugins | Summary: Get plugins  Description: Get custom universal connector plugins
[**ConnectionsServiceGetSettings**](ConnectionsServiceApi.md#ConnectionsServiceGetSettings) | **Get** /api/v3/connections/settings | Summary: Get settings Description: Get a list of Settings.
[**ConnectionsServicePartialUpdateConnectors**](ConnectionsServiceApi.md#ConnectionsServicePartialUpdateConnectors) | **Patch** /api/v3/connections | Summary: Partial update connectors Description: Partial update of Connectors.
[**ConnectionsServicePostStapCommand**](ConnectionsServiceApi.md#ConnectionsServicePostStapCommand) | **Post** /api/v3/stap/commands | Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.
[**ConnectionsServiceUpdateBannerState**](ConnectionsServiceApi.md#ConnectionsServiceUpdateBannerState) | **Put** /api/v3/connections/banner | Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.
[**ConnectionsServiceUpdateConnectionsAccounts**](ConnectionsServiceApi.md#ConnectionsServiceUpdateConnectionsAccounts) | **Put** /api/v3/connections/accounts | Summary: Update Connections accounts Description: Update Connections acccounts.
[**ConnectionsServiceUpdateConnectionsConfigs**](ConnectionsServiceApi.md#ConnectionsServiceUpdateConnectionsConfigs) | **Patch** /api/v3/connections/configs | Summary: Update connections configs Description: Update Connection config by connection id.
[**ConnectionsServiceUpdateConnectors**](ConnectionsServiceApi.md#ConnectionsServiceUpdateConnectors) | **Put** /api/v3/connections | Summary: Update connectors Description: Update a list of Connectors.
[**ConnectionsServiceUpdatePlugin**](ConnectionsServiceApi.md#ConnectionsServiceUpdatePlugin) | **Put** /api/v3/connections/plugins/{id} | Summary: Update plugin. Description: Update plugin.
[**ConnectionsServiceUpdateSettings**](ConnectionsServiceApi.md#ConnectionsServiceUpdateSettings) | **Put** /api/v3/connections/settings | Summary: Update settings Description: Update Settings.

# **ConnectionsServiceCreateConnectionsAccounts**
> Connectionsv3CreateConnectionsAccountsResponse ConnectionsServiceCreateConnectionsAccounts(ctx, body)
Summary: Create Connections accounts Description: Create Connections acccounts.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3CreateConnectionsAccountsRequest**](Connectionsv3CreateConnectionsAccountsRequest.md)|  | 

### Return type

[**Connectionsv3CreateConnectionsAccountsResponse**](connectionsv3CreateConnectionsAccountsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceCreateConnectionsConfigs**
> Connectionsv3CreateConnectionsConfigsResponse ConnectionsServiceCreateConnectionsConfigs(ctx, body)
Summary: Create connections configs Description: Create Connection config by connection type.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3CreateConnectionsConfigsRequest**](Connectionsv3CreateConnectionsConfigsRequest.md)|  | 

### Return type

[**Connectionsv3CreateConnectionsConfigsResponse**](connectionsv3CreateConnectionsConfigsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceCreatePlugin**
> Connectionsv3CreatePluginResponse ConnectionsServiceCreatePlugin(ctx, body)
Summary: Create plugin Description: Create UC generic plugin

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3CreatePluginRequest**](Connectionsv3CreatePluginRequest.md)|  | 

### Return type

[**Connectionsv3CreatePluginResponse**](connectionsv3CreatePluginResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceCreateSettings**
> Connectionsv3CreateSettingsResponse ConnectionsServiceCreateSettings(ctx, body)
Summary: Create settings Description: Create Settings.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3CreateSettingsRequest**](Connectionsv3CreateSettingsRequest.md)|  | 

### Return type

[**Connectionsv3CreateSettingsResponse**](connectionsv3CreateSettingsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceDeleteConnectionsAccounts**
> Connectionsv3DeleteConnectionsAccountsResponse ConnectionsServiceDeleteConnectionsAccounts(ctx, accountId)
Summary: Delete Connections accounts Description: Delete Connections acccounts.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accountId** | **string**| Account id. | 

### Return type

[**Connectionsv3DeleteConnectionsAccountsResponse**](connectionsv3DeleteConnectionsAccountsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceDeleteConnectionsConfigs**
> Connectionsv3DeleteConnectionsConfigsResponse ConnectionsServiceDeleteConnectionsConfigs(ctx, connectionId)
Summary: Delete connections configs Description: Delete Connection config by connection id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **connectionId** | **string**| Connection id. | 

### Return type

[**Connectionsv3DeleteConnectionsConfigsResponse**](connectionsv3DeleteConnectionsConfigsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceDeleteConnector**
> Connectionsv3DeleteConnectorResponse ConnectionsServiceDeleteConnector(ctx, connectionId)
Summary: Delete connector Description: Delete a Connection.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **connectionId** | **string**| The connection id | 

### Return type

[**Connectionsv3DeleteConnectorResponse**](connectionsv3DeleteConnectorResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceDeletePlugin**
> Connectionsv3DeletePluginResponse ConnectionsServiceDeletePlugin(ctx, id)
Summary: Delete plugin. Description: Delete plugin.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **string**| plugin id | 

### Return type

[**Connectionsv3DeletePluginResponse**](connectionsv3DeletePluginResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceGetBannerState**
> Connectionsv3GetBannerStateResponse ConnectionsServiceGetBannerState(ctx, )
Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetBannerStateResponse**](connectionsv3GetBannerStateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceGetConnectionsAccounts**
> Connectionsv3GetConnectionsAccountsResponse ConnectionsServiceGetConnectionsAccounts(ctx, optional)
Summary: Get Connections accounts Description: Get Connections acccounts.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConnectionsServiceApiConnectionsServiceGetConnectionsAccountsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ConnectionsServiceApiConnectionsServiceGetConnectionsAccountsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **optional.String**| Optional: account id. | 
 **accessKey** | **optional.String**| Optional: acccount access key. | 

### Return type

[**Connectionsv3GetConnectionsAccountsResponse**](connectionsv3GetConnectionsAccountsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceGetConnectionsConfigs**
> Connectionsv3GetConnectionsConfigsResponse ConnectionsServiceGetConnectionsConfigs(ctx, optional)
Summary: Get connections configs Description: Get Connection config by connection type.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConnectionsServiceApiConnectionsServiceGetConnectionsConfigsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ConnectionsServiceApiConnectionsServiceGetConnectionsConfigsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type_** | **optional.String**| The type of connector. | [default to UNDEFINED_TYPE]
 **connectionId** | **optional.String**| Optional: if connection id did not provide then return all connections. | 

### Return type

[**Connectionsv3GetConnectionsConfigsResponse**](connectionsv3GetConnectionsConfigsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceGetConnectionsWithFilters**
> Connectionsv3GetConnectionsWithFiltersResponse ConnectionsServiceGetConnectionsWithFilters(ctx, body)
Summary: Get connections with filters Description: Get connections with filters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3GetConnectionsWithFiltersRequest**](Connectionsv3GetConnectionsWithFiltersRequest.md)|  | 

### Return type

[**Connectionsv3GetConnectionsWithFiltersResponse**](connectionsv3GetConnectionsWithFiltersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceGetConnectorsSummary**
> Connectionsv3GetConnectorsSummaryResponse ConnectionsServiceGetConnectorsSummary(ctx, )
Summary: Get connectors summary Description: Get a summary of Connectors.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetConnectorsSummaryResponse**](connectionsv3GetConnectorsSummaryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceGetDataSources**
> Connectionsv3GetDataSourcesResponse ConnectionsServiceGetDataSources(ctx, )
Summary: Get data sources Description: Get a list of data sources.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetDataSourcesResponse**](connectionsv3GetDataSourcesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceGetGuardRecordFields**
> Connectionsv3GetGuardRecordFieldsResponse ConnectionsServiceGetGuardRecordFields(ctx, )
Summary: Get list of guard record fields.  Description: Get list of guard record fields.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetGuardRecordFieldsResponse**](connectionsv3GetGuardRecordFieldsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceGetHeaders**
> Connectionsv3GetHeadersResponse ConnectionsServiceGetHeaders(ctx, )
Summary: Get headers Description: Get a list of Headers.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetHeadersResponse**](connectionsv3GetHeadersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceGetPlugins**
> Connectionsv3GetPluginsResponse ConnectionsServiceGetPlugins(ctx, optional)
Summary: Get plugins  Description: Get custom universal connector plugins

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConnectionsServiceApiConnectionsServiceGetPluginsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ConnectionsServiceApiConnectionsServiceGetPluginsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **optional.String**| Optional: if no plug-in id is provided, returns list of all plug-ins. | 

### Return type

[**Connectionsv3GetPluginsResponse**](connectionsv3GetPluginsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceGetSettings**
> Connectionsv3GetSettingsResponse ConnectionsServiceGetSettings(ctx, )
Summary: Get settings Description: Get a list of Settings.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetSettingsResponse**](connectionsv3GetSettingsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServicePartialUpdateConnectors**
> Connectionsv3PartialUpdateConnectorsResponse ConnectionsServicePartialUpdateConnectors(ctx, body)
Summary: Partial update connectors Description: Partial update of Connectors.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3PartialUpdateConnectorsRequest**](Connectionsv3PartialUpdateConnectorsRequest.md)|  | 

### Return type

[**Connectionsv3PartialUpdateConnectorsResponse**](connectionsv3PartialUpdateConnectorsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServicePostStapCommand**
> Connectionsv3StatusResponseBase ConnectionsServicePostStapCommand(ctx, body)
Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3StapCommandRequest**](Connectionsv3StapCommandRequest.md)|  | 

### Return type

[**Connectionsv3StatusResponseBase**](connectionsv3StatusResponseBase.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceUpdateBannerState**
> Connectionsv3UpdateBannerStateResponse ConnectionsServiceUpdateBannerState(ctx, body)
Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3UpdateBannerStateRequest**](Connectionsv3UpdateBannerStateRequest.md)|  | 

### Return type

[**Connectionsv3UpdateBannerStateResponse**](connectionsv3UpdateBannerStateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceUpdateConnectionsAccounts**
> Connectionsv3UpdateConnectionsAccountsResponse ConnectionsServiceUpdateConnectionsAccounts(ctx, body)
Summary: Update Connections accounts Description: Update Connections acccounts.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3UpdateConnectionsAccountsRequest**](Connectionsv3UpdateConnectionsAccountsRequest.md)|  | 

### Return type

[**Connectionsv3UpdateConnectionsAccountsResponse**](connectionsv3UpdateConnectionsAccountsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceUpdateConnectionsConfigs**
> Connectionsv3UpdateConnectionsConfigsResponse ConnectionsServiceUpdateConnectionsConfigs(ctx, body)
Summary: Update connections configs Description: Update Connection config by connection id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3UpdateConnectionsConfigsRequest**](Connectionsv3UpdateConnectionsConfigsRequest.md)|  | 

### Return type

[**Connectionsv3UpdateConnectionsConfigsResponse**](connectionsv3UpdateConnectionsConfigsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceUpdateConnectors**
> Connectionsv3UpdateConnectorsResponse ConnectionsServiceUpdateConnectors(ctx, body)
Summary: Update connectors Description: Update a list of Connectors.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3UpdateConnectorsRequest**](Connectionsv3UpdateConnectorsRequest.md)|  | 

### Return type

[**Connectionsv3UpdateConnectorsResponse**](connectionsv3UpdateConnectorsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceUpdatePlugin**
> Connectionsv3UpdatePluginResponse ConnectionsServiceUpdatePlugin(ctx, body, id)
Summary: Update plugin. Description: Update plugin.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3UpdatePluginRequest**](Connectionsv3UpdatePluginRequest.md)|  | 
  **id** | **string**| id | 

### Return type

[**Connectionsv3UpdatePluginResponse**](connectionsv3UpdatePluginResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConnectionsServiceUpdateSettings**
> Connectionsv3UpdateSettingsResponse ConnectionsServiceUpdateSettings(ctx, body)
Summary: Update settings Description: Update Settings.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Connectionsv3UpdateSettingsRequest**](Connectionsv3UpdateSettingsRequest.md)|  | 

### Return type

[**Connectionsv3UpdateSettingsResponse**](connectionsv3UpdateSettingsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

