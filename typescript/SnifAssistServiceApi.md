# .SnifAssistServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**snifAssistServiceGetSnifConfig**](SnifAssistServiceApi.md#snifAssistServiceGetSnifConfig) | **GET** /api/v3/snif/config | Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership.
[**snifAssistServiceGetSnifPolicy**](SnifAssistServiceApi.md#snifAssistServiceGetSnifPolicy) | **GET** /api/v3/snif/policy | Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership.
[**snifAssistServicePostSnifFeedback**](SnifAssistServiceApi.md#snifAssistServicePostSnifFeedback) | **POST** /api/v3/snif/feedback | Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service.
[**snifAssistServiceTestRegex**](SnifAssistServiceApi.md#snifAssistServiceTestRegex) | **POST** /api/v3/snif/test_regex | Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.


# **snifAssistServiceGetSnifConfig**
> Snifassistv3GetSnifConfigResponse snifAssistServiceGetSnifConfig()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SnifAssistServiceApi(configuration);

let body:.SnifAssistServiceApiSnifAssistServiceGetSnifConfigRequest = {
  // string | Provide tenant_id. (optional)
  tenantId: "tenant_id_example",
  // string | Provide edge_id. (optional)
  edgeId: "edge_id_example",
  // string | Provide configuration type. (optional)
  configType: "config_type_example",
  // string | Specify config_id provided by configuration service. (optional)
  configId: "config_id_example",
  // number | Provide CRC value of configuration parameters that sniffer is currently using. (optional)
  configurationParametersCrc: 1,
};

apiInstance.snifAssistServiceGetSnifConfig(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Provide tenant_id. | (optional) defaults to undefined
 **edgeId** | [**string**] | Provide edge_id. | (optional) defaults to undefined
 **configType** | [**string**] | Provide configuration type. | (optional) defaults to undefined
 **configId** | [**string**] | Specify config_id provided by configuration service. | (optional) defaults to undefined
 **configurationParametersCrc** | [**number**] | Provide CRC value of configuration parameters that sniffer is currently using. | (optional) defaults to undefined


### Return type

**Snifassistv3GetSnifConfigResponse**

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

# **snifAssistServiceGetSnifPolicy**
> Snifassistv3StatusResponseBase snifAssistServiceGetSnifPolicy()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SnifAssistServiceApi(configuration);

let body:.SnifAssistServiceApiSnifAssistServiceGetSnifPolicyRequest = {
  // string | Specify tenant_id. (optional)
  tenantId: "tenant_id_example",
  // string | Specify edge_id if known. (optional)
  edgeId: "edge_id_example",
  // number | Provide CRC value of installed policy that sniffer is currently using. (optional)
  policyCrc: 1,
};

apiInstance.snifAssistServiceGetSnifPolicy(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Specify tenant_id. | (optional) defaults to undefined
 **edgeId** | [**string**] | Specify edge_id if known. | (optional) defaults to undefined
 **policyCrc** | [**number**] | Provide CRC value of installed policy that sniffer is currently using. | (optional) defaults to undefined


### Return type

**Snifassistv3StatusResponseBase**

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

# **snifAssistServicePostSnifFeedback**
> Snifassistv3StatusResponseBase snifAssistServicePostSnifFeedback(snifassistv3PostSnifFeedbackRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SnifAssistServiceApi(configuration);

let body:.SnifAssistServiceApiSnifAssistServicePostSnifFeedbackRequest = {
  // Snifassistv3PostSnifFeedbackRequest
  snifassistv3PostSnifFeedbackRequest: {
    edgeId: "edgeId_example",
    snifFeedback: {
      batchNum: "batchNum_example",
      message: "message_example",
      status: "SUCCEEDED",
    },
    tenantId: "tenantId_example",
  },
};

apiInstance.snifAssistServicePostSnifFeedback(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snifassistv3PostSnifFeedbackRequest** | **Snifassistv3PostSnifFeedbackRequest**|  |


### Return type

**Snifassistv3StatusResponseBase**

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

# **snifAssistServiceTestRegex**
> Snifassistv3StatusResponseBase snifAssistServiceTestRegex(snifassistv3TestRegexRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SnifAssistServiceApi(configuration);

let body:.SnifAssistServiceApiSnifAssistServiceTestRegexRequest = {
  // Snifassistv3TestRegexRequest
  snifassistv3TestRegexRequest: {
    regex: "regex_example",
    tenantId: "tenantId_example",
    text: "text_example",
  },
};

apiInstance.snifAssistServiceTestRegex(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snifassistv3TestRegexRequest** | **Snifassistv3TestRegexRequest**|  |


### Return type

**Snifassistv3StatusResponseBase**

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


