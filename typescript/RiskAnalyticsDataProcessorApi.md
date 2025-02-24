# .RiskAnalyticsDataProcessorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**riskAnalyticsDataProcessorGetRiskContext**](RiskAnalyticsDataProcessorApi.md#riskAnalyticsDataProcessorGetRiskContext) | **GET** /api/v3/risk_events/{risk_id}/context | Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
[**riskAnalyticsDataProcessorGetRiskPredefinedQuestions**](RiskAnalyticsDataProcessorApi.md#riskAnalyticsDataProcessorGetRiskPredefinedQuestions) | **GET** /api/v3/risk_events/{risk_id}/questions | Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.


# **riskAnalyticsDataProcessorGetRiskContext**
> Riskanalyticsdataprocessorv3GetRiskContextResponse riskAnalyticsDataProcessorGetRiskContext()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsDataProcessorApi(configuration);

let body:.RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskContextRequest = {
  // number | Risk id.
  riskId: 1,
  // string | Timezone in IANA format. (optional)
  timezone: "timezone_example",
};

apiInstance.riskAnalyticsDataProcessorGetRiskContext(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk id. | defaults to undefined
 **timezone** | [**string**] | Timezone in IANA format. | (optional) defaults to undefined


### Return type

**Riskanalyticsdataprocessorv3GetRiskContextResponse**

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

# **riskAnalyticsDataProcessorGetRiskPredefinedQuestions**
> Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse riskAnalyticsDataProcessorGetRiskPredefinedQuestions()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsDataProcessorApi(configuration);

let body:.RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskPredefinedQuestionsRequest = {
  // number | Risk id.
  riskId: 1,
};

apiInstance.riskAnalyticsDataProcessorGetRiskPredefinedQuestions(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk id. | defaults to undefined


### Return type

**Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse**

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


