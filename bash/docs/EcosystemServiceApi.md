# EcosystemServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**ecosystemServiceCreateDataset**](EcosystemServiceApi.md#ecosystemServiceCreateDataset) | **POST** /api/v3/integrations/datasets | Summary: Create dataset
Description: Save a definition in the database.
[**ecosystemServiceDataInsert**](EcosystemServiceApi.md#ecosystemServiceDataInsert) | **POST** /api/v3/integrations/datasets/{dataset_name} | Summary: Data insert
Description: Process Data received from webhook API and insert.
[**ecosystemServiceDeleteDatasets**](EcosystemServiceApi.md#ecosystemServiceDeleteDatasets) | **DELETE** /api/v3/integrations/datasets | Summary: Delete datasets
Description: Delete an array of datasets.
[**ecosystemServiceGetDatasetData**](EcosystemServiceApi.md#ecosystemServiceGetDatasetData) | **GET** /api/v3/integrations/datasets/{dataset_name}/data | Summary: Get dataset data
Description: Return data report for a given dataset.
[**ecosystemServiceGetDatasetDetail**](EcosystemServiceApi.md#ecosystemServiceGetDatasetDetail) | **GET** /api/v3/integrations/datasets/{dataset_name}/details | Summary: Get dataset detail
Description: Return detail on a dataset definition.
[**ecosystemServiceGetDatasets**](EcosystemServiceApi.md#ecosystemServiceGetDatasets) | **GET** /api/v3/integrations/datasets | Summary: Get datasets
Description: Return dataset list that matches the specified filter.
[**ecosystemServiceGetPurgableRows**](EcosystemServiceApi.md#ecosystemServiceGetPurgableRows) | **POST** /api/v3/integrations/purge | Summary: Get purgable rows
Description: Check the number of rows that can be purged.
[**ecosystemServicePurgeData**](EcosystemServiceApi.md#ecosystemServicePurgeData) | **DELETE** /api/v3/integrations/datasets/data | Summary: Purge data
Description: Purge data.
[**ecosystemServiceTestIntegration**](EcosystemServiceApi.md#ecosystemServiceTestIntegration) | **POST** /api/v3/integrations/setup/test | Summary: Test integration
Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible
a test message is sent to the integration to ensure it is functional.
Currently this API only supports API_IMPORT type integrations



## ecosystemServiceCreateDataset

Summary: Create dataset
Description: Save a definition in the database.

### Example

```bash
 ecosystemServiceCreateDataset
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3CreateDatasetRequest** | [**Ecosystemv3CreateDatasetRequest**](Ecosystemv3CreateDatasetRequest.md) |  |

### Return type

[**Ecosystemv3CreateDatasetResponse**](Ecosystemv3CreateDatasetResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ecosystemServiceDataInsert

Summary: Data insert
Description: Process Data received from webhook API and insert.

### Example

```bash
 ecosystemServiceDataInsert dataset_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetName** | **string** | Data set target name. | [default to null]
 **ecosystemv3DataInsertRequest** | [**Ecosystemv3DataInsertRequest**](Ecosystemv3DataInsertRequest.md) |  |

### Return type

[**Ecosystemv3DataInsertResponse**](Ecosystemv3DataInsertResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ecosystemServiceDeleteDatasets

Summary: Delete datasets
Description: Delete an array of datasets.

### Example

```bash
 ecosystemServiceDeleteDatasets  Specify as:  dataset_names=value1 dataset_names=value2 dataset_names=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetNames** | [**array[string]**](string.md) | Name of the dataset, required field. | [optional] [default to null]

### Return type

[**Ecosystemv3DeleteDatasetsResponse**](Ecosystemv3DeleteDatasetsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ecosystemServiceGetDatasetData

Summary: Get dataset data
Description: Return data report for a given dataset.

### Example

```bash
 ecosystemServiceGetDatasetData dataset_name=value  offset=value  limit=value  return_header=value  field=value  value=value  sort_field=value  sort_order=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetName** | **string** | Name of the dataset. | [default to null]
 **offset** | **integer** | The amount to offset the rows by for pagination. | [optional] [default to null]
 **limit** | **integer** | The max amount of rows to return for pagination. | [optional] [default to null]
 **returnHeader** | **boolean** | If needs to return header information. It is for pagination. The first page needs header, the rest doesn't need. | [optional] [default to null]
 **field** | **string** | Search field. | [optional] [default to null]
 **value** | **string** | Search value. | [optional] [default to null]
 **sortField** | **string** | Field to sort. | [optional] [default to null]
 **sortOrder** | **string** | Sort order. | [optional] [default to NONE]

### Return type

[**Ecosystemv3GetDatasetDataResponse**](Ecosystemv3GetDatasetDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ecosystemServiceGetDatasetDetail

Summary: Get dataset detail
Description: Return detail on a dataset definition.

### Example

```bash
 ecosystemServiceGetDatasetDetail dataset_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetName** | **string** | Name of the dataset. | [default to null]

### Return type

[**Ecosystemv3GetDatasetDetailResponse**](Ecosystemv3GetDatasetDetailResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ecosystemServiceGetDatasets

Summary: Get datasets
Description: Return dataset list that matches the specified filter.

### Example

```bash
 ecosystemServiceGetDatasets  filter.start_time=value  filter.end_time=value  Specify as:  filter.dataset_names=value1 filter.dataset_names=value2 filter.dataset_names=...  offset=value  limit=value  include_filter_counts=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterPeriodstartTime** | **string** | Return datasets created at this time or later (>=). | [optional] [default to null]
 **filterPeriodendTime** | **string** | Return datasets created before this time (<). | [optional] [default to null]
 **filterPerioddatasetNames** | [**array[string]**](string.md) | The state filter groups commonly paired states.
Only returns records that include the specified names. | [optional] [default to null]
 **offset** | **integer** | The amount to offset the rows by for pagination. | [optional] [default to null]
 **limit** | **integer** | The max amount of rows to return for pagination. | [optional] [default to null]
 **includeFilterCounts** | **boolean** | Computing the filter counts is relatively expensive, only compute when needed. | [optional] [default to null]

### Return type

[**Ecosystemv3GetDatasetsResponse**](Ecosystemv3GetDatasetsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ecosystemServiceGetPurgableRows

Summary: Get purgable rows
Description: Check the number of rows that can be purged.

### Example

```bash
 ecosystemServiceGetPurgableRows
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3GetPurgableRowsRequest** | [**Ecosystemv3GetPurgableRowsRequest**](Ecosystemv3GetPurgableRowsRequest.md) |  |

### Return type

[**Ecosystemv3GetPurgableRowsResponse**](Ecosystemv3GetPurgableRowsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ecosystemServicePurgeData

Summary: Purge data
Description: Purge data.

### Example

```bash
 ecosystemServicePurgeData  Specify as:  dataset_names=value1 dataset_names=value2 dataset_names=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetNames** | [**array[string]**](string.md) | Name of the datasets, required field. | [optional] [default to null]

### Return type

[**Ecosystemv3PurgeDataResponse**](Ecosystemv3PurgeDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ecosystemServiceTestIntegration

Summary: Test integration
Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible
a test message is sent to the integration to ensure it is functional.
Currently this API only supports API_IMPORT type integrations

### Example

```bash
 ecosystemServiceTestIntegration
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3TestIntegrationRequest** | [**Ecosystemv3TestIntegrationRequest**](Ecosystemv3TestIntegrationRequest.md) |  |

### Return type

[**Ecosystemv3TestIntegrationResponse**](Ecosystemv3TestIntegrationResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

