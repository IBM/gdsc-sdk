# RiskAnalyticsDataProcessorApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**riskAnalyticsDataProcessorGetRiskContext**](RiskAnalyticsDataProcessorApi.md#riskAnalyticsDataProcessorGetRiskContext) | **GET** /api/v3/risk_events/context/{risk_id} | Summary: Get Risk Event Context
Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
[**riskAnalyticsDataProcessorGetRiskPredefinedQuestions**](RiskAnalyticsDataProcessorApi.md#riskAnalyticsDataProcessorGetRiskPredefinedQuestions) | **GET** /api/v3/risk_events/{risk_id}/questions | Summary: Get Risk Event Predefined Questions
Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.



## riskAnalyticsDataProcessorGetRiskContext

Summary: Get Risk Event Context
Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.

### Example

```bash
 riskAnalyticsDataProcessorGetRiskContext risk_id=value  timezone=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | **integer** | Risk id. | [default to null]
 **timezone** | **string** | Timezone in IANA format. | [optional] [default to null]

### Return type

[**Riskanalyticsdataprocessorv3GetRiskContextResponse**](Riskanalyticsdataprocessorv3GetRiskContextResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsDataProcessorGetRiskPredefinedQuestions

Summary: Get Risk Event Predefined Questions
Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.

### Example

```bash
 riskAnalyticsDataProcessorGetRiskPredefinedQuestions risk_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | **integer** | Risk id. | [default to null]

### Return type

[**Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse**](Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

