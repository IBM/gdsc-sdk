# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EcosystemServiceCreateDataset**](EcosystemServiceApi.md#EcosystemServiceCreateDataset) | **Post** /api/v3/integrations/datasets | Summary: Create dataset Description: Save a definition in the database.
[**EcosystemServiceDataInsert**](EcosystemServiceApi.md#EcosystemServiceDataInsert) | **Post** /api/v3/integrations/datasets/{dataset_name} | Summary: Data insert Description: Process Data received from webhook API and insert.
[**EcosystemServiceDeleteDatasets**](EcosystemServiceApi.md#EcosystemServiceDeleteDatasets) | **Delete** /api/v3/integrations/datasets | Summary: Delete datasets Description: Delete an array of datasets.
[**EcosystemServiceGetDatasetData**](EcosystemServiceApi.md#EcosystemServiceGetDatasetData) | **Get** /api/v3/integrations/datasets/{dataset_name}/data | Summary: Get dataset data Description: Return data report for a given dataset.
[**EcosystemServiceGetDatasetDetail**](EcosystemServiceApi.md#EcosystemServiceGetDatasetDetail) | **Get** /api/v3/integrations/datasets/{dataset_name}/details | Summary: Get dataset detail Description: Return detail on a dataset definition.
[**EcosystemServiceGetDatasets**](EcosystemServiceApi.md#EcosystemServiceGetDatasets) | **Get** /api/v3/integrations/datasets | Summary: Get datasets Description: Return dataset list that matches the specified filter.
[**EcosystemServiceGetPurgableRows**](EcosystemServiceApi.md#EcosystemServiceGetPurgableRows) | **Post** /api/v3/integrations/purge | Summary: Get purgable rows Description: Check the number of rows that can be purged.
[**EcosystemServicePurgeData**](EcosystemServiceApi.md#EcosystemServicePurgeData) | **Delete** /api/v3/integrations/datasets/data | Summary: Purge data Description: Purge data.

# **EcosystemServiceCreateDataset**
> Ecosystemv3CreateDatasetResponse EcosystemServiceCreateDataset(ctx, body)
Summary: Create dataset Description: Save a definition in the database.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Ecosystemv3CreateDatasetRequest**](Ecosystemv3CreateDatasetRequest.md)|  | 

### Return type

[**Ecosystemv3CreateDatasetResponse**](ecosystemv3CreateDatasetResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EcosystemServiceDataInsert**
> Ecosystemv3DataInsertResponse EcosystemServiceDataInsert(ctx, body, datasetName)
Summary: Data insert Description: Process Data received from webhook API and insert.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Ecosystemv3DataInsertRequest**](Ecosystemv3DataInsertRequest.md)|  | 
  **datasetName** | **string**| Data set target name. | 

### Return type

[**Ecosystemv3DataInsertResponse**](ecosystemv3DataInsertResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EcosystemServiceDeleteDatasets**
> Ecosystemv3DeleteDatasetsResponse EcosystemServiceDeleteDatasets(ctx, optional)
Summary: Delete datasets Description: Delete an array of datasets.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EcosystemServiceApiEcosystemServiceDeleteDatasetsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EcosystemServiceApiEcosystemServiceDeleteDatasetsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetNames** | [**optional.Interface of []string**](string.md)| Name of the dataset, required field. | 

### Return type

[**Ecosystemv3DeleteDatasetsResponse**](ecosystemv3DeleteDatasetsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EcosystemServiceGetDatasetData**
> Ecosystemv3GetDatasetDataResponse EcosystemServiceGetDatasetData(ctx, datasetName, optional)
Summary: Get dataset data Description: Return data report for a given dataset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **datasetName** | **string**| Name of the dataset. | 
 **optional** | ***EcosystemServiceApiEcosystemServiceGetDatasetDataOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EcosystemServiceApiEcosystemServiceGetDatasetDataOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **offset** | **optional.Int64**| The amount to offset the rows by for pagination. | 
 **limit** | **optional.Int64**| The max amount of rows to return for pagination. | 
 **returnHeader** | **optional.Bool**| If needs to return header information. It is for pagination. The first page needs header, the rest doesn&#x27;t need. | 
 **field** | **optional.String**| Search field. | 
 **value** | **optional.String**| Search value. | 
 **sortField** | **optional.String**| Field to sort. | 
 **sortOrder** | **optional.String**| Sort order. | [default to NONE]

### Return type

[**Ecosystemv3GetDatasetDataResponse**](ecosystemv3GetDatasetDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EcosystemServiceGetDatasetDetail**
> Ecosystemv3GetDatasetDetailResponse EcosystemServiceGetDatasetDetail(ctx, datasetName)
Summary: Get dataset detail Description: Return detail on a dataset definition.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **datasetName** | **string**| Name of the dataset. | 

### Return type

[**Ecosystemv3GetDatasetDetailResponse**](ecosystemv3GetDatasetDetailResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EcosystemServiceGetDatasets**
> Ecosystemv3GetDatasetsResponse EcosystemServiceGetDatasets(ctx, optional)
Summary: Get datasets Description: Return dataset list that matches the specified filter.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EcosystemServiceApiEcosystemServiceGetDatasetsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EcosystemServiceApiEcosystemServiceGetDatasetsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStartTime** | **optional.Time**| Return datasets created at this time or later (&gt;&#x3D;). | 
 **filterEndTime** | **optional.Time**| Return datasets created before this time (&lt;). | 
 **filterDatasetNames** | [**optional.Interface of []string**](string.md)| The state filter groups commonly paired states. Only returns records that include the specified names. | 
 **offset** | **optional.Int64**| The amount to offset the rows by for pagination. | 
 **limit** | **optional.Int64**| The max amount of rows to return for pagination. | 
 **includeFilterCounts** | **optional.Bool**| Computing the filter counts is relatively expensive, only compute when needed. | 

### Return type

[**Ecosystemv3GetDatasetsResponse**](ecosystemv3GetDatasetsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EcosystemServiceGetPurgableRows**
> Ecosystemv3GetPurgableRowsResponse EcosystemServiceGetPurgableRows(ctx, body)
Summary: Get purgable rows Description: Check the number of rows that can be purged.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Ecosystemv3GetPurgableRowsRequest**](Ecosystemv3GetPurgableRowsRequest.md)|  | 

### Return type

[**Ecosystemv3GetPurgableRowsResponse**](ecosystemv3GetPurgableRowsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EcosystemServicePurgeData**
> Ecosystemv3PurgeDataResponse EcosystemServicePurgeData(ctx, optional)
Summary: Purge data Description: Purge data.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EcosystemServiceApiEcosystemServicePurgeDataOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EcosystemServiceApiEcosystemServicePurgeDataOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetNames** | [**optional.Interface of []string**](string.md)| Name of the datasets, required field. | 

### Return type

[**Ecosystemv3PurgeDataResponse**](ecosystemv3PurgeDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

