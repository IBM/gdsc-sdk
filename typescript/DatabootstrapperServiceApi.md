# .DatabootstrapperServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**databootstrapperServiceLoadData**](DatabootstrapperServiceApi.md#databootstrapperServiceLoadData) | **POST** /api/v3/databootstrapper/data | Summary: Load data Description: Load data for a tenant.


# **databootstrapperServiceLoadData**
> Databootstrapperv3LoadDataResponse databootstrapperServiceLoadData(databootstrapperv3LoadDataRequest)


### Example


```typescript
import { createConfiguration, DatabootstrapperServiceApi } from '';
import type { DatabootstrapperServiceApiDatabootstrapperServiceLoadDataRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DatabootstrapperServiceApi(configuration);

const request: DatabootstrapperServiceApiDatabootstrapperServiceLoadDataRequest = {
  
  databootstrapperv3LoadDataRequest: {
    partNumber: "partNumber_example",
  },
};

const data = await apiInstance.databootstrapperServiceLoadData(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **databootstrapperv3LoadDataRequest** | **Databootstrapperv3LoadDataRequest**|  |


### Return type

**Databootstrapperv3LoadDataResponse**

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


