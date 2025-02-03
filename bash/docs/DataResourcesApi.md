# DataResourcesApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataResource**](DataResourcesApi.md#getDataResource) | **GET** /api/v1/dspm/dataResources/{dataResourceId} | Get a specific data resource by its ID
[**getDataResourcesSummary**](DataResourcesApi.md#getDataResourcesSummary) | **GET** /api/v1/dspm/dataResources/summary | Data resources summary
[**listDataResources**](DataResourcesApi.md#listDataResources) | **GET** /api/v1/dspm/dataResources | List data resources that match a given filter
[**listDataResourcesNames**](DataResourcesApi.md#listDataResourcesNames) | **GET** /api/v1/dspm/dataResources/names | List names of data resources
[**removeResource**](DataResourcesApi.md#removeResource) | **DELETE** /api/v1/dspm/dataResources/{dataResourceId}/removeResource | Remove resource from Guardium Insights SaaS DSPM
[**updateResourceReviewStatus**](DataResourcesApi.md#updateResourceReviewStatus) | **PUT** /api/v1/dspm/dataResources/{dataResourceId}/reviewed | Set review status of a data resource



## getDataResource

Get a specific data resource by its ID

Get additional details on a specific data resource by providing its ID.

### Example

```bash
 getDataResource dataResourceId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataResourceId** | **string** | Data resource ID | [default to null]

### Return type

[**DataResource**](DataResource.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getDataResourcesSummary

Data resources summary

Get a summary of all the data resource, that is, number of data resources, types of data resources, and other information.

### Example

```bash
 getDataResourcesSummary  dataStoreId=value  filter=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | **string** | Data store id | [optional] [default to null]
 **filter** | [**ListDataResourcesFilterParameter**](.md) |  | [optional] [default to null]

### Return type

[**DataResourcesSummary**](DataResourcesSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listDataResources

List data resources that match a given filter

Get a list of data resources based on the filter applied. You can filter by data store ID, data resource ID, data resource name, and more.<BR><B>Note:</B> Filter needs to be HTML encoded.

### Example

```bash
 listDataResources  dataStoreId=value  filter=value  sort=value  pageSize=value  nextToken=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | **string** |  | [optional] [default to null]
 **filter** | [**ListDataResourcesFilterParameter**](.md) |  | [optional] [default to null]
 **sort** | [**ListDataResourcesSortParameter**](.md) |  | [optional] [default to null]
 **pageSize** | **integer** |  | [optional] [default to null]
 **nextToken** | **string** |  | [optional] [default to null]

### Return type

[**ListDataResources200Response**](ListDataResources200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listDataResourcesNames

List names of data resources

List and filter data resources by their names

### Example

```bash
 listDataResourcesNames  prefix=value  dataStoreId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **string** | Prefix of data resource name | [default to null]
 **dataStoreId** | **string** |  | [optional] [default to null]

### Return type

**array[string]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## removeResource

Remove resource from Guardium Insights SaaS DSPM

Removes a resource, with all its sensitivities, from Guardium Insights SaaS DSPM dashboard. This action does not remove the resource from the resource's source environment.

### Example

```bash
 removeResource dataResourceId=value  dataStoreId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataResourceId** | **string** | Data resource ID | [default to null]
 **dataStoreId** | **string** | Data store ID | [default to null]

### Return type

[**RemoveResource200Response**](RemoveResource200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateResourceReviewStatus

Set review status of a data resource

Set the review status of a specific data resource in a specific data store.

### Example

```bash
 updateResourceReviewStatus dataResourceId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataResourceId** | **string** | Data resource id | [default to null]
 **updateResourceReviewBody** | [**UpdateResourceReviewBody**](UpdateResourceReviewBody.md) |  |

### Return type

[**UpdateResourceReviewStatus200Response**](UpdateResourceReviewStatus200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

