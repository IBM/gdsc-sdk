# .RiskAnalyticsEngineApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**riskAnalyticsEngineGetLeadGeneratorConfig**](RiskAnalyticsEngineApi.md#riskAnalyticsEngineGetLeadGeneratorConfig) | **GET** /api/v3/risk/lead_generator | Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
[**riskAnalyticsEngineUpdateLeadGeneratorConfig**](RiskAnalyticsEngineApi.md#riskAnalyticsEngineUpdateLeadGeneratorConfig) | **PUT** /api/v3/risk/lead_generator | Summary: Update lead generator config Description: Update the configuration of a leads generator.


# **riskAnalyticsEngineGetLeadGeneratorConfig**
> Riskanalyticsenginev3GetLeadGeneratorConfigResponse riskAnalyticsEngineGetLeadGeneratorConfig()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsEngineApi(configuration);

let body:any = {};

apiInstance.riskAnalyticsEngineGetLeadGeneratorConfig(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticsenginev3GetLeadGeneratorConfigResponse**

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

# **riskAnalyticsEngineUpdateLeadGeneratorConfig**
> Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse riskAnalyticsEngineUpdateLeadGeneratorConfig(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsEngineApi(configuration);

let body:.RiskAnalyticsEngineApiRiskAnalyticsEngineUpdateLeadGeneratorConfigRequest = {
  // Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest
  riskanalyticsenginev3UpdateLeadGeneratorConfigRequest: {
    config: {
      isActive: true,
      leadGeneratorName: "leadGeneratorName_example",
      leadGeneratorParams: [
        {
          name: "name_example",
          value: "value_example",
        },
      ],
    },
  },
};

apiInstance.riskAnalyticsEngineUpdateLeadGeneratorConfig(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticsenginev3UpdateLeadGeneratorConfigRequest** | **Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest**|  |


### Return type

**Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse**

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


