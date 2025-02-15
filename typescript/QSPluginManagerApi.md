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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPluginManagerApi(configuration);

let body:.QSPluginManagerApiQSPluginManagerInvokeAppProvRequest = {
  // string | Unique identifier for the plugin
  pluginId: "plugin_id_example",
  // Qspmpluginmanagerv3PluginRQ
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
    scanType: "scanType_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSPluginManagerInvokeAppProv(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPluginManagerApi(configuration);

let body:.QSPluginManagerApiQSPluginManagerInvokeExplorerV1Request = {
  // string | Unique identifier for the plugin
  pluginId: "plugin_id_example",
  // Qspmpluginmanagerv3PluginRQ
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
    scanType: "scanType_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSPluginManagerInvokeExplorerV1(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPluginManagerApi(configuration);

let body:.QSPluginManagerApiQSPluginManagerInvokeExplorerV2Request = {
  // string | Unique identifier for the plugin
  pluginId: "plugin_id_example",
  // Qspmpluginmanagerv3PluginRQ
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
    scanType: "scanType_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSPluginManagerInvokeExplorerV2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPluginManagerApi(configuration);

let body:.QSPluginManagerApiQSPluginManagerInvokePluginRequest = {
  // string | Unique identifier for the plugin
  pluginId: "plugin_id_example",
  // Qspmpluginmanagerv3PluginRQ
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
    scanType: "scanType_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSPluginManagerInvokePlugin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPluginManagerApi(configuration);

let body:.QSPluginManagerApiQSPluginManagerInvokePolicyRequest = {
  // string | Unique identifier for the plugin
  pluginId: "plugin_id_example",
  // Qspmpluginmanagerv3PolicyPluginRQ
  qspmpluginmanagerv3PolicyPluginRQ: {
    externalParam: {
      "key": "key_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    scanType: "scanType_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSPluginManagerInvokePolicy(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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


