# DataStoresApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataStore**](DataStoresApi.md#getDataStore) | **GET** /api/v2/dspm/dataStores/{dataStoreId} | Get a data store by its ID
[**getDataStoresSummary**](DataStoresApi.md#getDataStoresSummary) | **GET** /api/v2/dspm/dataStores/summary | Get summary of data stores
[**listAllDataStoresLabels**](DataStoresApi.md#listAllDataStoresLabels) | **GET** /api/v2/dspm/dataStores/labels | List labels of data stores.
[**listDataStores**](DataStoresApi.md#listDataStores) | **GET** /api/v2/dspm/dataStores | List data stores
[**listDataStoresCloudTagsKeys**](DataStoresApi.md#listDataStoresCloudTagsKeys) | **GET** /api/v2/dspm/dataStores/cloudTags/keys | List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
[**listDataStoresCloudTagsValues**](DataStoresApi.md#listDataStoresCloudTagsValues) | **GET** /api/v2/dspm/dataStores/cloudTags/values | List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
[**listDataStoresNames**](DataStoresApi.md#listDataStoresNames) | **GET** /api/v2/dspm/dataStores/filters/name | List name of filterable data stores
[**rescanDataStore**](DataStoresApi.md#rescanDataStore) | **POST** /api/v2/dspm/dataStores/rescan | Post data store rescan request
[**setDataStoreLabel**](DataStoresApi.md#setDataStoreLabel) | **PUT** /api/v2/dspm/dataStores/{dataStoreId}/labels | Label a data store with an existing or new label
[**updateDatastoreCustodian**](DataStoresApi.md#updateDatastoreCustodian) | **POST** /api/v2/dspm/dataStores/custodian | Update the name of a Data store custodian



## getDataStore

Get a data store by its ID

Get details of a specific data store by its ID.

### Example

```bash
 getDataStore dataStoreId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | **string** | ID of the data store | [default to null]

### Return type

[**DataStore**](DataStore.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getDataStoresSummary

Get summary of data stores

Get a summary of all the data stores, that is, name of data resources, types of data stores, and other information.

### Example

```bash
 getDataStoresSummary  filter=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListDataStoresFilterParameter**](.md) |  | [optional] [default to null]

### Return type

[**DataStoresSummary**](DataStoresSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listAllDataStoresLabels

List labels of data stores.

Get a list of all the labels of custom data stores.

### Example

```bash
 listAllDataStoresLabels  prefix=value  maxResults=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **string** | Prefix of data store label | [optional] [default to null]
 **maxResults** | **integer** |  | [optional] [default to null]

### Return type

**array[string]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listDataStores

List data stores

List all data stores discovered by Guardium DSPM.

### Example

```bash
 listDataStores  filter=value  sort=value  pageSize=value  nextToken=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListDataStoresFilterParameter**](.md) |  | [optional] [default to null]
 **sort** | [**ListDataStoresSortParameter**](.md) |  | [optional] [default to null]
 **pageSize** | **integer** |  | [optional] [default to null]
 **nextToken** | **string** |  | [optional] [default to null]

### Return type

[**ListDataStores200Response**](ListDataStores200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listDataStoresCloudTagsKeys

List the cloud tag keys of data stores that can be filtered on the basis of prefixes.

Get a list of the available cloud tag keys of data stores that can be filtered on the basis of prefixes.

### Example

```bash
 listDataStoresCloudTagsKeys  prefix=value  maxResults=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **string** | Prefix of cloud tag key | [default to null]
 **maxResults** | **integer** |  | [optional] [default to null]

### Return type

**array[string]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listDataStoresCloudTagsValues

List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.

Get a list of the available cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.

### Example

```bash
 listDataStoresCloudTagsValues  prefix=value  tagKey=value  maxResults=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **string** | Prefix of cloud tag value | [default to null]
 **tagKey** | **string** |  | [default to null]
 **maxResults** | **integer** |  | [optional] [default to null]

### Return type

**array[string]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listDataStoresNames

List name of filterable data stores

Lists the data stores that can be filtered or classified.

### Example

```bash
 listDataStoresNames  prefix=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **string** | Prefix of data store name | [default to null]

### Return type

**array[string]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## rescanDataStore

Post data store rescan request

Post the request for a data store rescan.

### Example

```bash
 rescanDataStore
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rescanDataStoreRequest** | [**RescanDataStoreRequest**](RescanDataStoreRequest.md) |  |

### Return type

(empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## setDataStoreLabel

Label a data store with an existing or new label

Add or update a custom label for a data store.

### Example

```bash
 setDataStoreLabel dataStoreId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | **string** | Data store ID | [default to null]
 **setDataStoreLabelRequest** | [**SetDataStoreLabelRequest**](SetDataStoreLabelRequest.md) |  |

### Return type

(empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateDatastoreCustodian

Update the name of a Data store custodian

Add or update the name of a specific data store.

### Example

```bash
 updateDatastoreCustodian
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCustodianBody** | [**UpdateCustodianBody**](UpdateCustodianBody.md) |  |

### Return type

[**UpdateDatastoreCustodian200Response**](UpdateDatastoreCustodian200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

