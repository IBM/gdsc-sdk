# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QSPluginManagerInvokeAppProv**](QSPluginManagerApi.md#QSPluginManagerInvokeAppProv) | **Post** /api/v3/plugins/{plugin_id}/application | Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
[**QSPluginManagerInvokeExplorerV1**](QSPluginManagerApi.md#QSPluginManagerInvokeExplorerV1) | **Post** /api/v3/plugins/{plugin_id}/explorer | Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
[**QSPluginManagerInvokeExplorerV2**](QSPluginManagerApi.md#QSPluginManagerInvokeExplorerV2) | **Post** /api/v3/plugins/{plugin_id}/explorer/analytics | Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
[**QSPluginManagerInvokePlugin**](QSPluginManagerApi.md#QSPluginManagerInvokePlugin) | **Post** /api/v3/plugins/{plugin_id}/network | Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
[**QSPluginManagerInvokePolicy**](QSPluginManagerApi.md#QSPluginManagerInvokePolicy) | **Post** /api/v3/plugins/{plugin_id}/policy | Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload

# **QSPluginManagerInvokeAppProv**
> Qspmpluginmanagerv3PluginRs QSPluginManagerInvokeAppProv(ctx, body, pluginId)
Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmpluginmanagerv3PluginRq**](Qspmpluginmanagerv3PluginRq.md)|  | 
  **pluginId** | **string**| Unique identifier for the plugin | 

### Return type

[**Qspmpluginmanagerv3PluginRs**](qspmpluginmanagerv3PluginRS.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSPluginManagerInvokeExplorerV1**
> Qspmpluginmanagerv3PluginRs QSPluginManagerInvokeExplorerV1(ctx, body, pluginId)
Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmpluginmanagerv3PluginRq**](Qspmpluginmanagerv3PluginRq.md)|  | 
  **pluginId** | **string**| Unique identifier for the plugin | 

### Return type

[**Qspmpluginmanagerv3PluginRs**](qspmpluginmanagerv3PluginRS.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSPluginManagerInvokeExplorerV2**
> Qspmpluginmanagerv3PluginRs QSPluginManagerInvokeExplorerV2(ctx, body, pluginId)
Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmpluginmanagerv3PluginRq**](Qspmpluginmanagerv3PluginRq.md)|  | 
  **pluginId** | **string**| Unique identifier for the plugin | 

### Return type

[**Qspmpluginmanagerv3PluginRs**](qspmpluginmanagerv3PluginRS.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSPluginManagerInvokePlugin**
> Qspmpluginmanagerv3PluginRs QSPluginManagerInvokePlugin(ctx, body, pluginId)
Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmpluginmanagerv3PluginRq**](Qspmpluginmanagerv3PluginRq.md)|  | 
  **pluginId** | **string**| Unique identifier for the plugin | 

### Return type

[**Qspmpluginmanagerv3PluginRs**](qspmpluginmanagerv3PluginRS.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSPluginManagerInvokePolicy**
> Qspmpluginmanagerv3PolicyPluginRs QSPluginManagerInvokePolicy(ctx, body, pluginId)
Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmpluginmanagerv3PolicyPluginRq**](Qspmpluginmanagerv3PolicyPluginRq.md)|  | 
  **pluginId** | **string**| Unique identifier for the plugin | 

### Return type

[**Qspmpluginmanagerv3PolicyPluginRs**](qspmpluginmanagerv3PolicyPluginRS.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

