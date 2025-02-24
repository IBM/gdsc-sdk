# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDataStore**](DataStoresApi.md#GetDataStore) | **Get** /api/v1/dspm/dataStores/{dataStoreId} | Get a data store by its ID
[**GetDataStoresSummary**](DataStoresApi.md#GetDataStoresSummary) | **Get** /api/v1/dspm/dataStores/summary | Get summary of data stores
[**ListAllDataStoresLabels**](DataStoresApi.md#ListAllDataStoresLabels) | **Get** /api/v1/dspm/dataStores/labels | List labels of data stores.
[**ListDataStores**](DataStoresApi.md#ListDataStores) | **Get** /api/v1/dspm/dataStores | List data stores
[**ListDataStoresCloudTagsKeys**](DataStoresApi.md#ListDataStoresCloudTagsKeys) | **Get** /api/v1/dspm/dataStores/cloudTags/keys | List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
[**ListDataStoresCloudTagsValues**](DataStoresApi.md#ListDataStoresCloudTagsValues) | **Get** /api/v1/dspm/dataStores/cloudTags/values | List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
[**ListDataStoresNames**](DataStoresApi.md#ListDataStoresNames) | **Get** /api/v1/dspm/dataStores/filters/name | List name of filterable data stores
[**RescanDataStore**](DataStoresApi.md#RescanDataStore) | **Post** /api/v1/dspm/dataStores/rescan | Post data store rescan request
[**SetDataStoreLabel**](DataStoresApi.md#SetDataStoreLabel) | **Put** /api/v1/dspm/dataStores/{dataStoreId}/labels | Label a data store with an existing or new label
[**UpdateDatastoreCustodian**](DataStoresApi.md#UpdateDatastoreCustodian) | **Post** /api/v1/dspm/dataStores/custodian | Update the name of a Data store custodian

# **GetDataStore**
> DataStore GetDataStore(ctx, dataStoreId)
Get a data store by its ID

Get details of a specific data store by its ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **dataStoreId** | **string**| ID of the data store | 

### Return type

[**DataStore**](DataStore.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetDataStoresSummary**
> DataStoresSummary GetDataStoresSummary(ctx, optional)
Get summary of data stores

Get a summary of all the data stores, that is, name of data resources, types of data stores, and other information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataStoresApiGetDataStoresSummaryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataStoresApiGetDataStoresSummaryOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of ListDataStoresFilterParameter**](.md)|  | 

### Return type

[**DataStoresSummary**](DataStoresSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListAllDataStoresLabels**
> []string ListAllDataStoresLabels(ctx, optional)
List labels of data stores.

Get a list of all the labels of custom data stores.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataStoresApiListAllDataStoresLabelsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataStoresApiListAllDataStoresLabelsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **optional.String**| Prefix of data store label | 
 **maxResults** | **optional.Float64**|  | 

### Return type

**[]string**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListDataStores**
> ListDataStores200Response ListDataStores(ctx, optional)
List data stores

List all data stores discovered by Guardium Insights SaaS DSPM.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataStoresApiListDataStoresOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataStoresApiListDataStoresOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of ListDataStoresFilterParameter**](.md)|  | 
 **sort** | [**optional.Interface of ListDataStoresSortParameter**](.md)|  | 
 **pageSize** | **optional.Float64**|  | 
 **nextToken** | [**optional.Interface of string**](.md)|  | 

### Return type

[**ListDataStores200Response**](listDataStores_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListDataStoresCloudTagsKeys**
> []string ListDataStoresCloudTagsKeys(ctx, prefix, optional)
List the cloud tag keys of data stores that can be filtered on the basis of prefixes.

Get a list of the available cloud tag keys of data stores that can be filtered on the basis of prefixes.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **prefix** | **string**| Prefix of cloud tag key | 
 **optional** | ***DataStoresApiListDataStoresCloudTagsKeysOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataStoresApiListDataStoresCloudTagsKeysOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **maxResults** | **optional.Float64**|  | 

### Return type

**[]string**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListDataStoresCloudTagsValues**
> []string ListDataStoresCloudTagsValues(ctx, prefix, tagKey, optional)
List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.

Get a list of the available cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **prefix** | **string**| Prefix of cloud tag value | 
  **tagKey** | **string**|  | 
 **optional** | ***DataStoresApiListDataStoresCloudTagsValuesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataStoresApiListDataStoresCloudTagsValuesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **maxResults** | **optional.Float64**|  | 

### Return type

**[]string**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListDataStoresNames**
> []string ListDataStoresNames(ctx, prefix)
List name of filterable data stores

Lists the data stores that can be filtered or classified.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **prefix** | **string**| Prefix of data store name | 

### Return type

**[]string**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RescanDataStore**
> RescanDataStore(ctx, body)
Post data store rescan request

Post the request for a data store rescan.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**RescanDataStoreRequest**](RescanDataStoreRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SetDataStoreLabel**
> SetDataStoreLabel(ctx, body, dataStoreId)
Label a data store with an existing or new label

Add or update a custom label for a data store.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**SetDataStoreLabelRequest**](SetDataStoreLabelRequest.md)|  | 
  **dataStoreId** | **string**| Data store ID | 

### Return type

 (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateDatastoreCustodian**
> UpdateDatastoreCustodian200Response UpdateDatastoreCustodian(ctx, body)
Update the name of a Data store custodian

Add or update the name of a specific data store.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**UpdateCustodianBody**](UpdateCustodianBody.md)|  | 

### Return type

[**UpdateDatastoreCustodian200Response**](updateDatastoreCustodian_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

