# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnalyticsEventsServiceDeleteCacheKey**](AnalyticsEventsServiceApi.md#AnalyticsEventsServiceDeleteCacheKey) | **Delete** /api/v3/eventscache/{cache_key} | Summary: Delete cache key Description: Return delete key result message.
[**AnalyticsEventsServicePostQSAdvisorRisk**](AnalyticsEventsServiceApi.md#AnalyticsEventsServicePostQSAdvisorRisk) | **Post** /api/v3/risk/qs_advisor | Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status

# **AnalyticsEventsServiceDeleteCacheKey**
> Analyticseventsv3DeleteCacheKeyResponse AnalyticsEventsServiceDeleteCacheKey(ctx, body, cacheKey)
Summary: Delete cache key Description: Return delete key result message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Analyticseventsv3DeleteCacheKeyRequest**](Analyticseventsv3DeleteCacheKeyRequest.md)|  | 
  **cacheKey** | **string**| The cache key to delete. | 

### Return type

[**Analyticseventsv3DeleteCacheKeyResponse**](analyticseventsv3DeleteCacheKeyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AnalyticsEventsServicePostQSAdvisorRisk**
> Analyticseventsv3PostQsAdvisorRiskResponse AnalyticsEventsServicePostQSAdvisorRisk(ctx, body)
Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Analyticseventsv3PostQsAdvisorRiskRequest**](Analyticseventsv3PostQsAdvisorRiskRequest.md)|  | 

### Return type

[**Analyticseventsv3PostQsAdvisorRiskResponse**](analyticseventsv3PostQSAdvisorRiskResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

