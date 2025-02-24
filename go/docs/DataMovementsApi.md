# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetActualFlow**](DataMovementsApi.md#GetActualFlow) | **Get** /api/v1/dspm/dataMovements/actualFlows/{id} | Get actual flow by providing its ID
[**GetActualFlowsSummary**](DataMovementsApi.md#GetActualFlowsSummary) | **Get** /api/v1/dspm/dataMovements/actualFlows/summary | Get summary of actual flows
[**GetPotentialFlow**](DataMovementsApi.md#GetPotentialFlow) | **Get** /api/v1/dspm/dataMovements/potentialFlows/{flowId} | Get potential flow by providing its ID
[**GetPotentialFlowPath**](DataMovementsApi.md#GetPotentialFlowPath) | **Get** /api/v1/dspm/dataMovements/potentialFlows/paths/{flowPathId} | Get potential flow path by providing its ID
[**GetPotentialFlowsSummary**](DataMovementsApi.md#GetPotentialFlowsSummary) | **Get** /api/v1/dspm/dataMovements/potentialFlows/summary | Get summary of potential flows according to the filter applied
[**ListActualFlowPaths**](DataMovementsApi.md#ListActualFlowPaths) | **Get** /api/v1/dspm/dataMovements/actualFlowPaths | Get summary of actual flows according to the filter applied
[**ListActualFlows**](DataMovementsApi.md#ListActualFlows) | **Get** /api/v1/dspm/dataMovements/actualFlows | List actual flows
[**ListPotentialFlows**](DataMovementsApi.md#ListPotentialFlows) | **Get** /api/v1/dspm/dataMovements/potentialFlows | List potential flows
[**ListPotentialFlowsPaths**](DataMovementsApi.md#ListPotentialFlowsPaths) | **Get** /api/v1/dspm/dataMovements/potentialFlows/paths | List potential flow paths

# **GetActualFlow**
> ActualFlow GetActualFlow(ctx, id)
Get actual flow by providing its ID

Get a detailed information about an actual flow by providing its ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **string**|  | 

### Return type

[**ActualFlow**](ActualFlow.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetActualFlowsSummary**
> ActualFlowsSummary GetActualFlowsSummary(ctx, optional)
Get summary of actual flows

Get a summary of all the actual flows discovered by Guardium Insights SaaS DSPM, that is, details about source and destination, and other information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataMovementsApiGetActualFlowsSummaryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataMovementsApiGetActualFlowsSummaryOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of ListActualFlowsFilterParameter**](.md)|  | 

### Return type

[**ActualFlowsSummary**](ActualFlowsSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetPotentialFlow**
> PotentialFlow GetPotentialFlow(ctx, flowId)
Get potential flow by providing its ID

Get a detailed information about a potential flow by providing the flow ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **flowId** | **string**|  | 

### Return type

[**PotentialFlow**](PotentialFlow.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetPotentialFlowPath**
> PotentialFlowPath GetPotentialFlowPath(ctx, flowPathId)
Get potential flow path by providing its ID

Get details of a specific potential flow of data by providing its ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **flowPathId** | **string**|  | 

### Return type

[**PotentialFlowPath**](PotentialFlowPath.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetPotentialFlowsSummary**
> PotentialFlowsSummary GetPotentialFlowsSummary(ctx, optional)
Get summary of potential flows according to the filter applied

Get a summary of all the potential flows based on a filter applied.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataMovementsApiGetPotentialFlowsSummaryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataMovementsApiGetPotentialFlowsSummaryOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of PotentialFlowsFilterOptions**](.md)|  | 

### Return type

[**PotentialFlowsSummary**](PotentialFlowsSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListActualFlowPaths**
> ListActualFlowPaths200Response ListActualFlowPaths(ctx, optional)
Get summary of actual flows according to the filter applied

Get detailed information about the actual flows according to the filter applied.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataMovementsApiListActualFlowPathsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataMovementsApiListActualFlowPathsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | [**optional.Interface of ListActualFlowPathsSortParameter**](.md)|  | 
 **filter** | [**optional.Interface of ListActualFlowPathsFilterParameter**](.md)|  | 
 **pageSize** | **optional.Float64**|  | 
 **nextToken** | [**optional.Interface of string**](.md)|  | 

### Return type

[**ListActualFlowPaths200Response**](listActualFlowPaths_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListActualFlows**
> ListActualFlows200Response ListActualFlows(ctx, optional)
List actual flows

List all the actual flows (based on logs) of users and services across your entire cloud accounts and SasS applications.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataMovementsApiListActualFlowsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataMovementsApiListActualFlowsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | [**optional.Interface of ListActualFlowsSortParameter**](.md)|  | 
 **filter** | [**optional.Interface of ListActualFlowsFilterParameter**](.md)|  | 
 **pageSize** | **optional.Float64**|  | 
 **nextToken** | [**optional.Interface of string**](.md)|  | 

### Return type

[**ListActualFlows200Response**](listActualFlows_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListPotentialFlows**
> ListPotentialFlows200Response ListPotentialFlows(ctx, optional)
List potential flows

List all the potential flows of users and services across your entire cloud accounts and SaaS applications.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataMovementsApiListPotentialFlowsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataMovementsApiListPotentialFlowsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of PotentialFlowsFilterOptions**](.md)|  | 
 **pageSize** | **optional.Float64**|  | 
 **nextToken** | [**optional.Interface of string**](.md)|  | 

### Return type

[**ListPotentialFlows200Response**](listPotentialFlows_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListPotentialFlowsPaths**
> ListPotentialFlowsPaths200Response ListPotentialFlowsPaths(ctx, optional)
List potential flow paths

List all the potential flow paths based on an applied filter.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataMovementsApiListPotentialFlowsPathsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataMovementsApiListPotentialFlowsPathsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of PotentialFlowsPathsFilterOptions**](.md)|  | 
 **pageSize** | **optional.Float64**|  | 
 **nextToken** | [**optional.Interface of string**](.md)|  | 

### Return type

[**ListPotentialFlowsPaths200Response**](listPotentialFlowsPaths_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

