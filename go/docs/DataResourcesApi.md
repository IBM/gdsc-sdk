# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDataResource**](DataResourcesApi.md#GetDataResource) | **Get** /api/v1/dspm/dataResources/{dataResourceId} | Get a specific data resource by its ID
[**GetDataResourcesSummary**](DataResourcesApi.md#GetDataResourcesSummary) | **Get** /api/v1/dspm/dataResources/summary | Data resources summary
[**ListDataResources**](DataResourcesApi.md#ListDataResources) | **Get** /api/v1/dspm/dataResources | List data resources that match a given filter
[**ListDataResourcesNames**](DataResourcesApi.md#ListDataResourcesNames) | **Get** /api/v1/dspm/dataResources/names | List names of data resources
[**RemoveResource**](DataResourcesApi.md#RemoveResource) | **Delete** /api/v1/dspm/dataResources/{dataResourceId}/removeResource | Remove resource from Guardium Insights SaaS DSPM
[**UpdateResourceReviewStatus**](DataResourcesApi.md#UpdateResourceReviewStatus) | **Put** /api/v1/dspm/dataResources/{dataResourceId}/reviewed | Set review status of a data resource

# **GetDataResource**
> DataResource GetDataResource(ctx, dataResourceId)
Get a specific data resource by its ID

Get additional details on a specific data resource by providing its ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **dataResourceId** | **string**| Data resource ID | 

### Return type

[**DataResource**](DataResource.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetDataResourcesSummary**
> DataResourcesSummary GetDataResourcesSummary(ctx, optional)
Data resources summary

Get a summary of all the data resource, that is, number of data resources, types of data resources, and other information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataResourcesApiGetDataResourcesSummaryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataResourcesApiGetDataResourcesSummaryOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | **optional.String**| Data store id | 
 **filter** | [**optional.Interface of ListDataResourcesFilterParameter**](.md)|  | 

### Return type

[**DataResourcesSummary**](DataResourcesSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListDataResources**
> ListDataResources200Response ListDataResources(ctx, optional)
List data resources that match a given filter

Get a list of data resources based on the filter applied. You can filter by data store ID, data resource ID, data resource name, and more.<BR><B>Note:</B> Filter needs to be HTML encoded.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataResourcesApiListDataResourcesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataResourcesApiListDataResourcesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | **optional.String**|  | 
 **filter** | [**optional.Interface of ListDataResourcesFilterParameter**](.md)|  | 
 **sort** | [**optional.Interface of ListDataResourcesSortParameter**](.md)|  | 
 **pageSize** | **optional.Float64**|  | 
 **nextToken** | [**optional.Interface of string**](.md)|  | 

### Return type

[**ListDataResources200Response**](listDataResources_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListDataResourcesNames**
> []string ListDataResourcesNames(ctx, prefix, optional)
List names of data resources

List and filter data resources by their names

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **prefix** | **string**| Prefix of data resource name | 
 **optional** | ***DataResourcesApiListDataResourcesNamesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataResourcesApiListDataResourcesNamesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **dataStoreId** | **optional.String**|  | 

### Return type

**[]string**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RemoveResource**
> RemoveResource200Response RemoveResource(ctx, dataResourceId, dataStoreId)
Remove resource from Guardium Insights SaaS DSPM

Removes a resource, with all its sensitivities, from Guardium Insights SaaS DSPM dashboard. This action does not remove the resource from the resource's source environment.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **dataResourceId** | **string**| Data resource ID | 
  **dataStoreId** | **string**| Data store ID | 

### Return type

[**RemoveResource200Response**](removeResource_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateResourceReviewStatus**
> UpdateResourceReviewStatus200Response UpdateResourceReviewStatus(ctx, body, dataResourceId)
Set review status of a data resource

Set the review status of a specific data resource in a specific data store.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**UpdateResourceReviewBody**](UpdateResourceReviewBody.md)|  | 
  **dataResourceId** | **string**| Data resource id | 

### Return type

[**UpdateResourceReviewStatus200Response**](updateResourceReviewStatus_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

