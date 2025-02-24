# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SnifAssistServiceGetSnifConfig**](SnifAssistServiceApi.md#SnifAssistServiceGetSnifConfig) | **Get** /api/v3/snif/config | Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership.
[**SnifAssistServiceGetSnifPolicy**](SnifAssistServiceApi.md#SnifAssistServiceGetSnifPolicy) | **Get** /api/v3/snif/policy | Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership.
[**SnifAssistServicePostSnifFeedback**](SnifAssistServiceApi.md#SnifAssistServicePostSnifFeedback) | **Post** /api/v3/snif/feedback | Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service.
[**SnifAssistServiceTestRegex**](SnifAssistServiceApi.md#SnifAssistServiceTestRegex) | **Post** /api/v3/snif/test_regex | Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.

# **SnifAssistServiceGetSnifConfig**
> Snifassistv3GetSnifConfigResponse SnifAssistServiceGetSnifConfig(ctx, optional)
Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***SnifAssistServiceApiSnifAssistServiceGetSnifConfigOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a SnifAssistServiceApiSnifAssistServiceGetSnifConfigOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **optional.String**| Provide tenant_id. | 
 **edgeId** | **optional.String**| Provide edge_id. | 
 **configType** | **optional.String**| Provide configuration type. | 
 **configId** | **optional.String**| Specify config_id provided by configuration service. | 
 **configurationParametersCrc** | **optional.Int64**| Provide CRC value of configuration parameters that sniffer is currently using. | 

### Return type

[**Snifassistv3GetSnifConfigResponse**](snifassistv3GetSnifConfigResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SnifAssistServiceGetSnifPolicy**
> Snifassistv3StatusResponseBase SnifAssistServiceGetSnifPolicy(ctx, optional)
Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***SnifAssistServiceApiSnifAssistServiceGetSnifPolicyOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a SnifAssistServiceApiSnifAssistServiceGetSnifPolicyOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **optional.String**| Specify tenant_id. | 
 **edgeId** | **optional.String**| Specify edge_id if known. | 
 **policyCrc** | **optional.Int64**| Provide CRC value of installed policy that sniffer is currently using. | 

### Return type

[**Snifassistv3StatusResponseBase**](snifassistv3StatusResponseBase.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SnifAssistServicePostSnifFeedback**
> Snifassistv3StatusResponseBase SnifAssistServicePostSnifFeedback(ctx, body)
Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Snifassistv3PostSnifFeedbackRequest**](Snifassistv3PostSnifFeedbackRequest.md)|  | 

### Return type

[**Snifassistv3StatusResponseBase**](snifassistv3StatusResponseBase.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SnifAssistServiceTestRegex**
> Snifassistv3StatusResponseBase SnifAssistServiceTestRegex(ctx, body)
Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Snifassistv3TestRegexRequest**](Snifassistv3TestRegexRequest.md)|  | 

### Return type

[**Snifassistv3StatusResponseBase**](snifassistv3StatusResponseBase.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

