# .RiskAnalyticsMlClassificationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**riskAnalyticsMlClassificationResetModelToDefaults**](RiskAnalyticsMlClassificationApi.md#riskAnalyticsMlClassificationResetModelToDefaults) | **POST** /api/v3/classification/ml/models/reset | Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.


# **riskAnalyticsMlClassificationResetModelToDefaults**
> Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse riskAnalyticsMlClassificationResetModelToDefaults()


### Example


```typescript
import { createConfiguration, RiskAnalyticsMlClassificationApi } from '';

const configuration = createConfiguration();
const apiInstance = new RiskAnalyticsMlClassificationApi(configuration);

const request = {};

const data = await apiInstance.riskAnalyticsMlClassificationResetModelToDefaults(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse**

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


