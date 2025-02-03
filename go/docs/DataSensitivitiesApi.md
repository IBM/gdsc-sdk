# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSensitivitiesSummary**](DataSensitivitiesApi.md#GetSensitivitiesSummary) | **Get** /api/v1/dspm/sensitivities/summary | Get the summary of sensitivities
[**GetSensitivity**](DataSensitivitiesApi.md#GetSensitivity) | **Get** /api/v1/dspm/sensitivities/{sensitivityId} | Get sensitivity details by providing its ID
[**ListSensitivities**](DataSensitivitiesApi.md#ListSensitivities) | **Get** /api/v1/dspm/sensitivities | List sensitivities

# **GetSensitivitiesSummary**
> SensitivitiesSummary GetSensitivitiesSummary(ctx, optional)
Get the summary of sensitivities

Get a summarised information about all sensitivities classified by Guardium Insights SaaS DSPM.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataSensitivitiesApiGetSensitivitiesSummaryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataSensitivitiesApiGetSensitivitiesSummaryOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of ListSensitivitiesFilterParameter**](.md)|  | 

### Return type

[**SensitivitiesSummary**](SensitivitiesSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetSensitivity**
> Sensitivity GetSensitivity(ctx, sensitivityId)
Get sensitivity details by providing its ID

Get details of a sensitivity by providing its ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **sensitivityId** | **string**|  | 

### Return type

[**Sensitivity**](Sensitivity.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListSensitivities**
> ListSensitivities200Response ListSensitivities(ctx, optional)
List sensitivities

Get a list of all the sensitivities based on an applied filter.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataSensitivitiesApiListSensitivitiesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataSensitivitiesApiListSensitivitiesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of ListSensitivitiesFilterParameter**](.md)|  | 
 **sort** | [**optional.Interface of LastSeenSortSchema**](.md)|  | 
 **pageSize** | **optional.Float64**|  | 
 **nextToken** | [**optional.Interface of string**](.md)|  | 

### Return type

[**ListSensitivities200Response**](listSensitivities_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

