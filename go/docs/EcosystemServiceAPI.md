# \EcosystemServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EcosystemServiceCreateDataset**](EcosystemServiceAPI.md#EcosystemServiceCreateDataset) | **Post** /api/v3/integrations/datasets | Summary: Create dataset Description: Save a definition in the database.
[**EcosystemServiceDataInsert**](EcosystemServiceAPI.md#EcosystemServiceDataInsert) | **Post** /api/v3/integrations/datasets/{dataset_name} | Summary: Data insert Description: Process Data received from webhook API and insert.
[**EcosystemServiceDeleteDatasets**](EcosystemServiceAPI.md#EcosystemServiceDeleteDatasets) | **Delete** /api/v3/integrations/datasets | Summary: Delete datasets Description: Delete an array of datasets.
[**EcosystemServiceGetDatasetData**](EcosystemServiceAPI.md#EcosystemServiceGetDatasetData) | **Get** /api/v3/integrations/datasets/{dataset_name}/data | Summary: Get dataset data Description: Return data report for a given dataset.
[**EcosystemServiceGetDatasetDetail**](EcosystemServiceAPI.md#EcosystemServiceGetDatasetDetail) | **Get** /api/v3/integrations/datasets/{dataset_name}/details | Summary: Get dataset detail Description: Return detail on a dataset definition.
[**EcosystemServiceGetDatasets**](EcosystemServiceAPI.md#EcosystemServiceGetDatasets) | **Get** /api/v3/integrations/datasets | Summary: Get datasets Description: Return dataset list that matches the specified filter.
[**EcosystemServiceGetPurgableRows**](EcosystemServiceAPI.md#EcosystemServiceGetPurgableRows) | **Post** /api/v3/integrations/purge | Summary: Get purgable rows Description: Check the number of rows that can be purged.
[**EcosystemServicePurgeData**](EcosystemServiceAPI.md#EcosystemServicePurgeData) | **Delete** /api/v3/integrations/datasets/data | Summary: Purge data Description: Purge data.



## EcosystemServiceCreateDataset

> Ecosystemv3CreateDatasetResponse EcosystemServiceCreateDataset(ctx).Ecosystemv3CreateDatasetRequest(ecosystemv3CreateDatasetRequest).Execute()

Summary: Create dataset Description: Save a definition in the database.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	ecosystemv3CreateDatasetRequest := *openapiclient.NewEcosystemv3CreateDatasetRequest() // Ecosystemv3CreateDatasetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EcosystemServiceAPI.EcosystemServiceCreateDataset(context.Background()).Ecosystemv3CreateDatasetRequest(ecosystemv3CreateDatasetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EcosystemServiceAPI.EcosystemServiceCreateDataset``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EcosystemServiceCreateDataset`: Ecosystemv3CreateDatasetResponse
	fmt.Fprintf(os.Stdout, "Response from `EcosystemServiceAPI.EcosystemServiceCreateDataset`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEcosystemServiceCreateDatasetRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EcosystemServiceDataInsert

> Ecosystemv3DataInsertResponse EcosystemServiceDataInsert(ctx, datasetName).Ecosystemv3DataInsertRequest(ecosystemv3DataInsertRequest).Execute()

Summary: Data insert Description: Process Data received from webhook API and insert.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	datasetName := "datasetName_example" // string | Data set target name.
	ecosystemv3DataInsertRequest := *openapiclient.NewEcosystemv3DataInsertRequest() // Ecosystemv3DataInsertRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EcosystemServiceAPI.EcosystemServiceDataInsert(context.Background(), datasetName).Ecosystemv3DataInsertRequest(ecosystemv3DataInsertRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EcosystemServiceAPI.EcosystemServiceDataInsert``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EcosystemServiceDataInsert`: Ecosystemv3DataInsertResponse
	fmt.Fprintf(os.Stdout, "Response from `EcosystemServiceAPI.EcosystemServiceDataInsert`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**datasetName** | **string** | Data set target name. | 

### Other Parameters

Other parameters are passed through a pointer to a apiEcosystemServiceDataInsertRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **ecosystemv3DataInsertRequest** | [**Ecosystemv3DataInsertRequest**](Ecosystemv3DataInsertRequest.md) |  | 

### Return type

[**Ecosystemv3DataInsertResponse**](Ecosystemv3DataInsertResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EcosystemServiceDeleteDatasets

> Ecosystemv3DeleteDatasetsResponse EcosystemServiceDeleteDatasets(ctx).DatasetNames(datasetNames).Execute()

Summary: Delete datasets Description: Delete an array of datasets.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	datasetNames := []string{"Inner_example"} // []string | Name of the dataset, required field. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EcosystemServiceAPI.EcosystemServiceDeleteDatasets(context.Background()).DatasetNames(datasetNames).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EcosystemServiceAPI.EcosystemServiceDeleteDatasets``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EcosystemServiceDeleteDatasets`: Ecosystemv3DeleteDatasetsResponse
	fmt.Fprintf(os.Stdout, "Response from `EcosystemServiceAPI.EcosystemServiceDeleteDatasets`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEcosystemServiceDeleteDatasetsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetNames** | **[]string** | Name of the dataset, required field. | 

### Return type

[**Ecosystemv3DeleteDatasetsResponse**](Ecosystemv3DeleteDatasetsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EcosystemServiceGetDatasetData

> Ecosystemv3GetDatasetDataResponse EcosystemServiceGetDatasetData(ctx, datasetName).Offset(offset).Limit(limit).ReturnHeader(returnHeader).Field(field).Value(value).SortField(sortField).SortOrder(sortOrder).Execute()

Summary: Get dataset data Description: Return data report for a given dataset.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	datasetName := "datasetName_example" // string | Name of the dataset.
	offset := int64(789) // int64 | The amount to offset the rows by for pagination. (optional)
	limit := int64(789) // int64 | The max amount of rows to return for pagination. (optional)
	returnHeader := true // bool | If needs to return header information. It is for pagination. The first page needs header, the rest doesn't need. (optional)
	field := "field_example" // string | Search field. (optional)
	value := "value_example" // string | Search value. (optional)
	sortField := "sortField_example" // string | Field to sort. (optional)
	sortOrder := "sortOrder_example" // string | Sort order. (optional) (default to "NONE")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EcosystemServiceAPI.EcosystemServiceGetDatasetData(context.Background(), datasetName).Offset(offset).Limit(limit).ReturnHeader(returnHeader).Field(field).Value(value).SortField(sortField).SortOrder(sortOrder).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EcosystemServiceAPI.EcosystemServiceGetDatasetData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EcosystemServiceGetDatasetData`: Ecosystemv3GetDatasetDataResponse
	fmt.Fprintf(os.Stdout, "Response from `EcosystemServiceAPI.EcosystemServiceGetDatasetData`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**datasetName** | **string** | Name of the dataset. | 

### Other Parameters

Other parameters are passed through a pointer to a apiEcosystemServiceGetDatasetDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **offset** | **int64** | The amount to offset the rows by for pagination. | 
 **limit** | **int64** | The max amount of rows to return for pagination. | 
 **returnHeader** | **bool** | If needs to return header information. It is for pagination. The first page needs header, the rest doesn&#39;t need. | 
 **field** | **string** | Search field. | 
 **value** | **string** | Search value. | 
 **sortField** | **string** | Field to sort. | 
 **sortOrder** | **string** | Sort order. | [default to &quot;NONE&quot;]

### Return type

[**Ecosystemv3GetDatasetDataResponse**](Ecosystemv3GetDatasetDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EcosystemServiceGetDatasetDetail

> Ecosystemv3GetDatasetDetailResponse EcosystemServiceGetDatasetDetail(ctx, datasetName).Execute()

Summary: Get dataset detail Description: Return detail on a dataset definition.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	datasetName := "datasetName_example" // string | Name of the dataset.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EcosystemServiceAPI.EcosystemServiceGetDatasetDetail(context.Background(), datasetName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EcosystemServiceAPI.EcosystemServiceGetDatasetDetail``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EcosystemServiceGetDatasetDetail`: Ecosystemv3GetDatasetDetailResponse
	fmt.Fprintf(os.Stdout, "Response from `EcosystemServiceAPI.EcosystemServiceGetDatasetDetail`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**datasetName** | **string** | Name of the dataset. | 

### Other Parameters

Other parameters are passed through a pointer to a apiEcosystemServiceGetDatasetDetailRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Ecosystemv3GetDatasetDetailResponse**](Ecosystemv3GetDatasetDetailResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EcosystemServiceGetDatasets

> Ecosystemv3GetDatasetsResponse EcosystemServiceGetDatasets(ctx).FilterStartTime(filterStartTime).FilterEndTime(filterEndTime).FilterDatasetNames(filterDatasetNames).Offset(offset).Limit(limit).IncludeFilterCounts(includeFilterCounts).Execute()

Summary: Get datasets Description: Return dataset list that matches the specified filter.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	filterStartTime := time.Now() // time.Time | Return datasets created at this time or later (>=). (optional)
	filterEndTime := time.Now() // time.Time | Return datasets created before this time (<). (optional)
	filterDatasetNames := []string{"Inner_example"} // []string | The state filter groups commonly paired states. Only returns records that include the specified names. (optional)
	offset := int64(789) // int64 | The amount to offset the rows by for pagination. (optional)
	limit := int64(789) // int64 | The max amount of rows to return for pagination. (optional)
	includeFilterCounts := true // bool | Computing the filter counts is relatively expensive, only compute when needed. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EcosystemServiceAPI.EcosystemServiceGetDatasets(context.Background()).FilterStartTime(filterStartTime).FilterEndTime(filterEndTime).FilterDatasetNames(filterDatasetNames).Offset(offset).Limit(limit).IncludeFilterCounts(includeFilterCounts).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EcosystemServiceAPI.EcosystemServiceGetDatasets``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EcosystemServiceGetDatasets`: Ecosystemv3GetDatasetsResponse
	fmt.Fprintf(os.Stdout, "Response from `EcosystemServiceAPI.EcosystemServiceGetDatasets`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEcosystemServiceGetDatasetsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStartTime** | **time.Time** | Return datasets created at this time or later (&gt;&#x3D;). | 
 **filterEndTime** | **time.Time** | Return datasets created before this time (&lt;). | 
 **filterDatasetNames** | **[]string** | The state filter groups commonly paired states. Only returns records that include the specified names. | 
 **offset** | **int64** | The amount to offset the rows by for pagination. | 
 **limit** | **int64** | The max amount of rows to return for pagination. | 
 **includeFilterCounts** | **bool** | Computing the filter counts is relatively expensive, only compute when needed. | 

### Return type

[**Ecosystemv3GetDatasetsResponse**](Ecosystemv3GetDatasetsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EcosystemServiceGetPurgableRows

> Ecosystemv3GetPurgableRowsResponse EcosystemServiceGetPurgableRows(ctx).Ecosystemv3GetPurgableRowsRequest(ecosystemv3GetPurgableRowsRequest).Execute()

Summary: Get purgable rows Description: Check the number of rows that can be purged.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	ecosystemv3GetPurgableRowsRequest := *openapiclient.NewEcosystemv3GetPurgableRowsRequest() // Ecosystemv3GetPurgableRowsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EcosystemServiceAPI.EcosystemServiceGetPurgableRows(context.Background()).Ecosystemv3GetPurgableRowsRequest(ecosystemv3GetPurgableRowsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EcosystemServiceAPI.EcosystemServiceGetPurgableRows``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EcosystemServiceGetPurgableRows`: Ecosystemv3GetPurgableRowsResponse
	fmt.Fprintf(os.Stdout, "Response from `EcosystemServiceAPI.EcosystemServiceGetPurgableRows`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEcosystemServiceGetPurgableRowsRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EcosystemServicePurgeData

> Ecosystemv3PurgeDataResponse EcosystemServicePurgeData(ctx).DatasetNames(datasetNames).Execute()

Summary: Purge data Description: Purge data.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	datasetNames := []string{"Inner_example"} // []string | Name of the datasets, required field. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EcosystemServiceAPI.EcosystemServicePurgeData(context.Background()).DatasetNames(datasetNames).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EcosystemServiceAPI.EcosystemServicePurgeData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EcosystemServicePurgeData`: Ecosystemv3PurgeDataResponse
	fmt.Fprintf(os.Stdout, "Response from `EcosystemServiceAPI.EcosystemServicePurgeData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEcosystemServicePurgeDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetNames** | **[]string** | Name of the datasets, required field. | 

### Return type

[**Ecosystemv3PurgeDataResponse**](Ecosystemv3PurgeDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

