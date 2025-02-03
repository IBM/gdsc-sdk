# .AnalyticsEventsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyticsEventsServiceDeleteCacheKey**](AnalyticsEventsServiceApi.md#analyticsEventsServiceDeleteCacheKey) | **DELETE** /api/v3/eventscache/{cache_key} | Summary: Delete cache key Description: Return delete key result message.
[**analyticsEventsServicePostQSAdvisorRisk**](AnalyticsEventsServiceApi.md#analyticsEventsServicePostQSAdvisorRisk) | **POST** /api/v3/risk/qs_advisor | Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status


# **analyticsEventsServiceDeleteCacheKey**
> Analyticseventsv3DeleteCacheKeyResponse analyticsEventsServiceDeleteCacheKey(analyticseventsv3DeleteCacheKeyRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AnalyticsEventsServiceApi(configuration);

let body:.AnalyticsEventsServiceApiAnalyticsEventsServiceDeleteCacheKeyRequest = {
  // string | The cache key to delete.
  cacheKey: "cache_key_example",
  // Analyticseventsv3DeleteCacheKeyRequest
  analyticseventsv3DeleteCacheKeyRequest: {
    cacheKey: "cacheKey_example",
  },
};

apiInstance.analyticsEventsServiceDeleteCacheKey(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analyticseventsv3DeleteCacheKeyRequest** | **Analyticseventsv3DeleteCacheKeyRequest**|  |
 **cacheKey** | [**string**] | The cache key to delete. | defaults to undefined


### Return type

**Analyticseventsv3DeleteCacheKeyResponse**

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

# **analyticsEventsServicePostQSAdvisorRisk**
> Analyticseventsv3PostQSAdvisorRiskResponse analyticsEventsServicePostQSAdvisorRisk(analyticseventsv3PostQSAdvisorRiskRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AnalyticsEventsServiceApi(configuration);

let body:.AnalyticsEventsServiceApiAnalyticsEventsServicePostQSAdvisorRiskRequest = {
  // Analyticseventsv3PostQSAdvisorRiskRequest
  analyticseventsv3PostQSAdvisorRiskRequest: {
    origin: "UNDEFINED_ORIGIN",
    originData: "originData_example",
    targetReceivers: [
      {
        integrationId: "integrationId_example",
        label: "label_example",
        templateId: "templateId_example",
        type: "UNDEFINED_RECTYPE",
        value: "value_example",
      },
    ],
    templateData: {
      "key": "key_example",
    },
    title: "title_example",
  },
};

apiInstance.analyticsEventsServicePostQSAdvisorRisk(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analyticseventsv3PostQSAdvisorRiskRequest** | **Analyticseventsv3PostQSAdvisorRiskRequest**|  |


### Return type

**Analyticseventsv3PostQSAdvisorRiskResponse**

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


