# QSPluginManagerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSPluginManagerInvokeAppProv**](QSPluginManagerApi.md#qSPluginManagerInvokeAppProv) | **POST** /api/v3/plugins/{plugin_id}/application | Summary: Invoke only application provisioning data plugin
Description:Parses app input file and triggers dataload
[**qSPluginManagerInvokeExplorerV1**](QSPluginManagerApi.md#qSPluginManagerInvokeExplorerV1) | **POST** /api/v3/plugins/{plugin_id}/explorer | Summary: Invoke only explorer inventory data plugin
Description:Parses explorer input file and triggers dataload
[**qSPluginManagerInvokeExplorerV2**](QSPluginManagerApi.md#qSPluginManagerInvokeExplorerV2) | **POST** /api/v3/plugins/{plugin_id}/explorer/analytics | Summary: Invoke only explorer analytics data plugin
Description:Parses explorer input file and triggers dataload
[**qSPluginManagerInvokePlugin**](QSPluginManagerApi.md#qSPluginManagerInvokePlugin) | **POST** /api/v3/plugins/{plugin_id}/network | Summary: Invoke consolidated or only network data plugin
Description:Parses input files and triggers dataload
[**qSPluginManagerInvokePolicy**](QSPluginManagerApi.md#qSPluginManagerInvokePolicy) | **POST** /api/v3/plugins/{plugin_id}/policy | Summary: Invoke only policy data plugin
Description:Parses policy input file and triggers dataload



## qSPluginManagerInvokeAppProv

Summary: Invoke only application provisioning data plugin
Description:Parses app input file and triggers dataload

### Example

```bash
 qSPluginManagerInvokeAppProv plugin_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **string** | Unique identifier for the plugin | [default to null]
 **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md) |  |

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSPluginManagerInvokeExplorerV1

Summary: Invoke only explorer inventory data plugin
Description:Parses explorer input file and triggers dataload

### Example

```bash
 qSPluginManagerInvokeExplorerV1 plugin_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **string** | Unique identifier for the plugin | [default to null]
 **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md) |  |

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSPluginManagerInvokeExplorerV2

Summary: Invoke only explorer analytics data plugin
Description:Parses explorer input file and triggers dataload

### Example

```bash
 qSPluginManagerInvokeExplorerV2 plugin_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **string** | Unique identifier for the plugin | [default to null]
 **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md) |  |

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSPluginManagerInvokePlugin

Summary: Invoke consolidated or only network data plugin
Description:Parses input files and triggers dataload

### Example

```bash
 qSPluginManagerInvokePlugin plugin_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **string** | Unique identifier for the plugin | [default to null]
 **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md) |  |

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSPluginManagerInvokePolicy

Summary: Invoke only policy data plugin
Description:Parses policy input file and triggers dataload

### Example

```bash
 qSPluginManagerInvokePolicy plugin_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **string** | Unique identifier for the plugin | [default to null]
 **qspmpluginmanagerv3PolicyPluginRQ** | [**Qspmpluginmanagerv3PolicyPluginRQ**](Qspmpluginmanagerv3PolicyPluginRQ.md) |  |

### Return type

[**Qspmpluginmanagerv3PolicyPluginRS**](Qspmpluginmanagerv3PolicyPluginRS.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

