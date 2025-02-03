# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RiskAnalyticsEngineGetLeadGeneratorConfig**](RiskAnalyticsEngineApi.md#RiskAnalyticsEngineGetLeadGeneratorConfig) | **Get** /api/v3/risk/lead_generator | Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
[**RiskAnalyticsEngineUpdateLeadGeneratorConfig**](RiskAnalyticsEngineApi.md#RiskAnalyticsEngineUpdateLeadGeneratorConfig) | **Put** /api/v3/risk/lead_generator | Summary: Update lead generator config Description: Update the configuration of a leads generator.

# **RiskAnalyticsEngineGetLeadGeneratorConfig**
> Riskanalyticsenginev3GetLeadGeneratorConfigResponse RiskAnalyticsEngineGetLeadGeneratorConfig(ctx, )
Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Riskanalyticsenginev3GetLeadGeneratorConfigResponse**](riskanalyticsenginev3GetLeadGeneratorConfigResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsEngineUpdateLeadGeneratorConfig**
> Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse RiskAnalyticsEngineUpdateLeadGeneratorConfig(ctx, body)
Summary: Update lead generator config Description: Update the configuration of a leads generator.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest**](Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest.md)|  | 

### Return type

[**Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse**](riskanalyticsenginev3UpdateLeadGeneratorConfigResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

