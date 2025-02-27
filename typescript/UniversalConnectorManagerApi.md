# .UniversalConnectorManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**universalConnectorManagerGetCertificate**](UniversalConnectorManagerApi.md#universalConnectorManagerGetCertificate) | **GET** /api/v3/certificates | Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in GDSC.
[**universalConnectorManagerGetConnectors**](UniversalConnectorManagerApi.md#universalConnectorManagerGetConnectors) | **GET** /api/v3/connectors | Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
[**universalConnectorManagerGetUCSetup**](UniversalConnectorManagerApi.md#universalConnectorManagerGetUCSetup) | **GET** /api/v3/universal_connections/configurations/{plugin_id} | Gets information to setup the new Universal connection.
[**universalConnectorManagerListConnectionsSummary**](UniversalConnectorManagerApi.md#universalConnectorManagerListConnectionsSummary) | **GET** /api/v3/universal_connections | Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
[**universalConnectorManagerPluginsList**](UniversalConnectorManagerApi.md#universalConnectorManagerPluginsList) | **GET** /api/v3/plugins | Summary: Plugins list Description: List of all universal connector plugins.
[**universalConnectorManagerUploadPlugin**](UniversalConnectorManagerApi.md#universalConnectorManagerUploadPlugin) | **POST** /api/v3/plugins | Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.


# **universalConnectorManagerGetCertificate**
> Universalconnectormanagerv3FileResponse universalConnectorManagerGetCertificate()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UniversalConnectorManagerApi(configuration);

let body:any = {};

apiInstance.universalConnectorManagerGetCertificate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Universalconnectormanagerv3FileResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **universalConnectorManagerGetConnectors**
> Universalconnectormanagerv3GetConnectorsResponse universalConnectorManagerGetConnectors()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UniversalConnectorManagerApi(configuration);

let body:any = {};

apiInstance.universalConnectorManagerGetConnectors(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Universalconnectormanagerv3GetConnectorsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **universalConnectorManagerGetUCSetup**
> Universalconnectormanagerv3GetUCSetupResponse universalConnectorManagerGetUCSetup()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UniversalConnectorManagerApi(configuration);

let body:.UniversalConnectorManagerApiUniversalConnectorManagerGetUCSetupRequest = {
  // number | UC plugin id.
  pluginId: 1,
};

apiInstance.universalConnectorManagerGetUCSetup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | [**number**] | UC plugin id. | defaults to undefined


### Return type

**Universalconnectormanagerv3GetUCSetupResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **universalConnectorManagerListConnectionsSummary**
> Universalconnectormanagerv3ListConnectionsResponse universalConnectorManagerListConnectionsSummary()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UniversalConnectorManagerApi(configuration);

let body:any = {};

apiInstance.universalConnectorManagerListConnectionsSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Universalconnectormanagerv3ListConnectionsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **universalConnectorManagerPluginsList**
> Universalconnectormanagerv3PluginsListResponse universalConnectorManagerPluginsList()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UniversalConnectorManagerApi(configuration);

let body:any = {};

apiInstance.universalConnectorManagerPluginsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Universalconnectormanagerv3PluginsListResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **universalConnectorManagerUploadPlugin**
> RpcStatus universalConnectorManagerUploadPlugin(universalconnectormanagerv3UploadPluginRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UniversalConnectorManagerApi(configuration);

let body:.UniversalConnectorManagerApiUniversalConnectorManagerUploadPluginRequest = {
  // Universalconnectormanagerv3UploadPluginRequest
  universalconnectormanagerv3UploadPluginRequest: {
    pluginId: "pluginId_example",
  },
};

apiInstance.universalConnectorManagerUploadPlugin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **universalconnectormanagerv3UploadPluginRequest** | **Universalconnectormanagerv3UploadPluginRequest**|  |


### Return type

**RpcStatus**

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


