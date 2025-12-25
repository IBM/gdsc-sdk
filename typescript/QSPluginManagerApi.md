# .QSPluginManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSPluginManagerInvokeAppProv**](QSPluginManagerApi.md#qSPluginManagerInvokeAppProv) | **POST** /api/v3/plugins/{plugin_id}/application | Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
[**qSPluginManagerInvokeExplorerV1**](QSPluginManagerApi.md#qSPluginManagerInvokeExplorerV1) | **POST** /api/v3/plugins/{plugin_id}/explorer | Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
[**qSPluginManagerInvokeExplorerV2**](QSPluginManagerApi.md#qSPluginManagerInvokeExplorerV2) | **POST** /api/v3/plugins/{plugin_id}/explorer/analytics | Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
[**qSPluginManagerInvokePlugin**](QSPluginManagerApi.md#qSPluginManagerInvokePlugin) | **POST** /api/v3/plugins/{plugin_id}/network | Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
[**qSPluginManagerInvokePolicy**](QSPluginManagerApi.md#qSPluginManagerInvokePolicy) | **POST** /api/v3/plugins/{plugin_id}/policy | Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload


# **qSPluginManagerInvokeAppProv**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokeAppProv(qspmpluginmanagerv3PluginRQ)


### Example


```typescript
import { createConfiguration, QSPluginManagerApi } from '';
import type { QSPluginManagerApiQSPluginManagerInvokeAppProvRequest } from '';

const configuration = createConfiguration();
const apiInstance = new QSPluginManagerApi(configuration);

const request: QSPluginManagerApiQSPluginManagerInvokeAppProvRequest = {
    // Unique identifier for the plugin
  pluginId: "plugin_id_example",
  
  qspmpluginmanagerv3PluginRQ: {
    externalParam: {
      "key": "key_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    provisionId: "provisionId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    userEmail: "userEmail_example",
  },
};

const data = await apiInstance.qSPluginManagerInvokeAppProv(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpluginmanagerv3PluginRQ** | **Qspmpluginmanagerv3PluginRQ**|  |
 **pluginId** | [**string**] | Unique identifier for the plugin | defaults to undefined


### Return type

**Qspmpluginmanagerv3PluginRS**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **qSPluginManagerInvokeExplorerV1**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokeExplorerV1(qspmpluginmanagerv3PluginRQ)


### Example


```typescript
import { createConfiguration, QSPluginManagerApi } from '';
import type { QSPluginManagerApiQSPluginManagerInvokeExplorerV1Request } from '';

const configuration = createConfiguration();
const apiInstance = new QSPluginManagerApi(configuration);

const request: QSPluginManagerApiQSPluginManagerInvokeExplorerV1Request = {
    // Unique identifier for the plugin
  pluginId: "plugin_id_example",
  
  qspmpluginmanagerv3PluginRQ: {
    externalParam: {
      "key": "key_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    provisionId: "provisionId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    userEmail: "userEmail_example",
  },
};

const data = await apiInstance.qSPluginManagerInvokeExplorerV1(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpluginmanagerv3PluginRQ** | **Qspmpluginmanagerv3PluginRQ**|  |
 **pluginId** | [**string**] | Unique identifier for the plugin | defaults to undefined


### Return type

**Qspmpluginmanagerv3PluginRS**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **qSPluginManagerInvokeExplorerV2**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokeExplorerV2(qspmpluginmanagerv3PluginRQ)


### Example


```typescript
import { createConfiguration, QSPluginManagerApi } from '';
import type { QSPluginManagerApiQSPluginManagerInvokeExplorerV2Request } from '';

const configuration = createConfiguration();
const apiInstance = new QSPluginManagerApi(configuration);

const request: QSPluginManagerApiQSPluginManagerInvokeExplorerV2Request = {
    // Unique identifier for the plugin
  pluginId: "plugin_id_example",
  
  qspmpluginmanagerv3PluginRQ: {
    externalParam: {
      "key": "key_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    provisionId: "provisionId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    userEmail: "userEmail_example",
  },
};

const data = await apiInstance.qSPluginManagerInvokeExplorerV2(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpluginmanagerv3PluginRQ** | **Qspmpluginmanagerv3PluginRQ**|  |
 **pluginId** | [**string**] | Unique identifier for the plugin | defaults to undefined


### Return type

**Qspmpluginmanagerv3PluginRS**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **qSPluginManagerInvokePlugin**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokePlugin(qspmpluginmanagerv3PluginRQ)


### Example


```typescript
import { createConfiguration, QSPluginManagerApi } from '';
import type { QSPluginManagerApiQSPluginManagerInvokePluginRequest } from '';

const configuration = createConfiguration();
const apiInstance = new QSPluginManagerApi(configuration);

const request: QSPluginManagerApiQSPluginManagerInvokePluginRequest = {
    // Unique identifier for the plugin
  pluginId: "plugin_id_example",
  
  qspmpluginmanagerv3PluginRQ: {
    externalParam: {
      "key": "key_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    provisionId: "provisionId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    userEmail: "userEmail_example",
  },
};

const data = await apiInstance.qSPluginManagerInvokePlugin(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpluginmanagerv3PluginRQ** | **Qspmpluginmanagerv3PluginRQ**|  |
 **pluginId** | [**string**] | Unique identifier for the plugin | defaults to undefined


### Return type

**Qspmpluginmanagerv3PluginRS**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **qSPluginManagerInvokePolicy**
> Qspmpluginmanagerv3PolicyPluginRS qSPluginManagerInvokePolicy(qspmpluginmanagerv3PolicyPluginRQ)


### Example


```typescript
import { createConfiguration, QSPluginManagerApi } from '';
import type { QSPluginManagerApiQSPluginManagerInvokePolicyRequest } from '';

const configuration = createConfiguration();
const apiInstance = new QSPluginManagerApi(configuration);

const request: QSPluginManagerApiQSPluginManagerInvokePolicyRequest = {
    // Unique identifier for the plugin
  pluginId: "plugin_id_example",
  
  qspmpluginmanagerv3PolicyPluginRQ: {
    externalParam: {
      "key": "key_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    userEmail: "userEmail_example",
  },
};

const data = await apiInstance.qSPluginManagerInvokePolicy(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpluginmanagerv3PolicyPluginRQ** | **Qspmpluginmanagerv3PolicyPluginRQ**|  |
 **pluginId** | [**string**] | Unique identifier for the plugin | defaults to undefined


### Return type

**Qspmpluginmanagerv3PolicyPluginRS**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


