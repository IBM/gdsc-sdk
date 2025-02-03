# .SnifAssistServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**snifAssistServiceTestRegex**](SnifAssistServiceApi.md#snifAssistServiceTestRegex) | **POST** /api/v3/snif/test_regex | Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.


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


