# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RiskAnalyticsDataProcessorGetRiskContext**](RiskAnalyticsDataProcessorApi.md#RiskAnalyticsDataProcessorGetRiskContext) | **Get** /api/v3/risk_events/context/{risk_id} | Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
[**RiskAnalyticsDataProcessorGetRiskPredefinedQuestions**](RiskAnalyticsDataProcessorApi.md#RiskAnalyticsDataProcessorGetRiskPredefinedQuestions) | **Get** /api/v3/risk_events/{risk_id}/questions | Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.

# **RiskAnalyticsDataProcessorGetRiskContext**
> Riskanalyticsdataprocessorv3GetRiskContextResponse RiskAnalyticsDataProcessorGetRiskContext(ctx, riskId, optional)
Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **riskId** | **int32**| Risk id. | 
 **optional** | ***RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskContextOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskContextOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **timezone** | **optional.String**| Timezone in IANA format. | 

### Return type

[**Riskanalyticsdataprocessorv3GetRiskContextResponse**](riskanalyticsdataprocessorv3GetRiskContextResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsDataProcessorGetRiskPredefinedQuestions**
> Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse RiskAnalyticsDataProcessorGetRiskPredefinedQuestions(ctx, riskId)
Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **riskId** | **int32**| Risk id. | 

### Return type

[**Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse**](riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

