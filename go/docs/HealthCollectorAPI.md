# \HealthCollectorAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**HealthCollectorGetDataWarehouseUsage**](HealthCollectorAPI.md#HealthCollectorGetDataWarehouseUsage) | **Get** /api/v3/metrics/warehouse/{type} | Summary: Get data warehouse usage info Description: Get information from Db2 related to usage
[**HealthCollectorGetGDPHealthInfo**](HealthCollectorAPI.md#HealthCollectorGetGDPHealthInfo) | **Get** /api/v3/health | Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
[**HealthCollectorGetHistoricalHealthInfo**](HealthCollectorAPI.md#HealthCollectorGetHistoricalHealthInfo) | **Get** /api/v3/health/history | Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
[**HealthCollectorGetObjectStorageUsage**](HealthCollectorAPI.md#HealthCollectorGetObjectStorageUsage) | **Get** /api/v3/metrics/object_storage/{type} | Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
[**HealthCollectorGetPVCUsage**](HealthCollectorAPI.md#HealthCollectorGetPVCUsage) | **Get** /api/v3/metrics/pvc/{type} | Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
[**HealthCollectorGetPodRestarts**](HealthCollectorAPI.md#HealthCollectorGetPodRestarts) | **Get** /api/v3/metrics/pods/{type} | Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
[**HealthCollectorGetStreamsIngestion**](HealthCollectorAPI.md#HealthCollectorGetStreamsIngestion) | **Get** /api/v3/metrics/streams/{type} | Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
[**HealthCollectorGetTopGDPCollectors**](HealthCollectorAPI.md#HealthCollectorGetTopGDPCollectors) | **Get** /api/v3/metrics/collectors/{type} | Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
[**HealthCollectorStoreHealthInfo**](HealthCollectorAPI.md#HealthCollectorStoreHealthInfo) | **Post** /api/v3/health/central_managers/{central_manager_id}/health_info | Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)



## HealthCollectorGetDataWarehouseUsage

> Healthcollectorv3GetDataWarehouseUsageResponse HealthCollectorGetDataWarehouseUsage(ctx, type_).StartTime(startTime).EndTime(endTime).Execute()

Summary: Get data warehouse usage info Description: Get information from Db2 related to usage

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
	type_ := "type__example" // string | The type of metric to retrieve
	startTime := time.Now() // time.Time | The start time from which the data needs to be calculated. (optional)
	endTime := time.Now() // time.Time | The end time from which the data needs to be calculated. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.HealthCollectorAPI.HealthCollectorGetDataWarehouseUsage(context.Background(), type_).StartTime(startTime).EndTime(endTime).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `HealthCollectorAPI.HealthCollectorGetDataWarehouseUsage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `HealthCollectorGetDataWarehouseUsage`: Healthcollectorv3GetDataWarehouseUsageResponse
	fmt.Fprintf(os.Stdout, "Response from `HealthCollectorAPI.HealthCollectorGetDataWarehouseUsage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**type_** | **string** | The type of metric to retrieve | 

### Other Parameters

Other parameters are passed through a pointer to a apiHealthCollectorGetDataWarehouseUsageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **time.Time** | The start time from which the data needs to be calculated. | 
 **endTime** | **time.Time** | The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetDataWarehouseUsageResponse**](Healthcollectorv3GetDataWarehouseUsageResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## HealthCollectorGetGDPHealthInfo

> Healthcollectorv3GetGDPHealthInfoResponse HealthCollectorGetGDPHealthInfo(ctx).Execute()

Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.HealthCollectorAPI.HealthCollectorGetGDPHealthInfo(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `HealthCollectorAPI.HealthCollectorGetGDPHealthInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `HealthCollectorGetGDPHealthInfo`: Healthcollectorv3GetGDPHealthInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `HealthCollectorAPI.HealthCollectorGetGDPHealthInfo`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiHealthCollectorGetGDPHealthInfoRequest struct via the builder pattern


### Return type

[**Healthcollectorv3GetGDPHealthInfoResponse**](Healthcollectorv3GetGDPHealthInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## HealthCollectorGetHistoricalHealthInfo

> Healthcollectorv3GetHistoricalHealthInfoResponse HealthCollectorGetHistoricalHealthInfo(ctx).Unit(unit).CmId(cmId).StartTime(startTime).EndTime(endTime).Execute()

Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.

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
	unit := "unit_example" // string | Type of unit for which data needs to be retrieved. (optional) (default to "UNKNOWN_UNIT")
	cmId := "cmId_example" // string | Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved. (optional)
	startTime := time.Now() // time.Time | The start time from which the data needs to be calculated. (optional)
	endTime := time.Now() // time.Time | The end time from which the data needs to be calculated. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.HealthCollectorAPI.HealthCollectorGetHistoricalHealthInfo(context.Background()).Unit(unit).CmId(cmId).StartTime(startTime).EndTime(endTime).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `HealthCollectorAPI.HealthCollectorGetHistoricalHealthInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `HealthCollectorGetHistoricalHealthInfo`: Healthcollectorv3GetHistoricalHealthInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `HealthCollectorAPI.HealthCollectorGetHistoricalHealthInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiHealthCollectorGetHistoricalHealthInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unit** | **string** | Type of unit for which data needs to be retrieved. | [default to &quot;UNKNOWN_UNIT&quot;]
 **cmId** | **string** | Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved. | 
 **startTime** | **time.Time** | The start time from which the data needs to be calculated. | 
 **endTime** | **time.Time** | The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetHistoricalHealthInfoResponse**](Healthcollectorv3GetHistoricalHealthInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## HealthCollectorGetObjectStorageUsage

> Healthcollectorv3GetObjectStorageUsageResponse HealthCollectorGetObjectStorageUsage(ctx, type_).StartTime(startTime).EndTime(endTime).Execute()

Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage

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
	type_ := "type__example" // string | The type of metric to retrieve
	startTime := time.Now() // time.Time | The start time from which the data needs to be calculated. (optional)
	endTime := time.Now() // time.Time | The end time from which the data needs to be calculated. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.HealthCollectorAPI.HealthCollectorGetObjectStorageUsage(context.Background(), type_).StartTime(startTime).EndTime(endTime).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `HealthCollectorAPI.HealthCollectorGetObjectStorageUsage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `HealthCollectorGetObjectStorageUsage`: Healthcollectorv3GetObjectStorageUsageResponse
	fmt.Fprintf(os.Stdout, "Response from `HealthCollectorAPI.HealthCollectorGetObjectStorageUsage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**type_** | **string** | The type of metric to retrieve | 

### Other Parameters

Other parameters are passed through a pointer to a apiHealthCollectorGetObjectStorageUsageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **time.Time** | The start time from which the data needs to be calculated. | 
 **endTime** | **time.Time** | The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetObjectStorageUsageResponse**](Healthcollectorv3GetObjectStorageUsageResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## HealthCollectorGetPVCUsage

> Healthcollectorv3GetPVCUsageResponse HealthCollectorGetPVCUsage(ctx, type_).StartTime(startTime).EndTime(endTime).Execute()

Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster

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
	type_ := "type__example" // string | The type of metric to retrieve
	startTime := time.Now() // time.Time | The start time from which the data needs to be calculated. (optional)
	endTime := time.Now() // time.Time | The end time from which the data needs to be calculated. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.HealthCollectorAPI.HealthCollectorGetPVCUsage(context.Background(), type_).StartTime(startTime).EndTime(endTime).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `HealthCollectorAPI.HealthCollectorGetPVCUsage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `HealthCollectorGetPVCUsage`: Healthcollectorv3GetPVCUsageResponse
	fmt.Fprintf(os.Stdout, "Response from `HealthCollectorAPI.HealthCollectorGetPVCUsage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**type_** | **string** | The type of metric to retrieve | 

### Other Parameters

Other parameters are passed through a pointer to a apiHealthCollectorGetPVCUsageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **time.Time** | The start time from which the data needs to be calculated. | 
 **endTime** | **time.Time** | The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetPVCUsageResponse**](Healthcollectorv3GetPVCUsageResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## HealthCollectorGetPodRestarts

> Healthcollectorv3GetPodRestartsResponse HealthCollectorGetPodRestarts(ctx, type_).StartTime(startTime).EndTime(endTime).Execute()

Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP

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
	type_ := "type__example" // string | The type of metric to retrieve
	startTime := time.Now() // time.Time | The start time from which the data needs to be calculated. (optional)
	endTime := time.Now() // time.Time | The end time from which the data needs to be calculated. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.HealthCollectorAPI.HealthCollectorGetPodRestarts(context.Background(), type_).StartTime(startTime).EndTime(endTime).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `HealthCollectorAPI.HealthCollectorGetPodRestarts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `HealthCollectorGetPodRestarts`: Healthcollectorv3GetPodRestartsResponse
	fmt.Fprintf(os.Stdout, "Response from `HealthCollectorAPI.HealthCollectorGetPodRestarts`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**type_** | **string** | The type of metric to retrieve | 

### Other Parameters

Other parameters are passed through a pointer to a apiHealthCollectorGetPodRestartsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **time.Time** | The start time from which the data needs to be calculated. | 
 **endTime** | **time.Time** | The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetPodRestartsResponse**](Healthcollectorv3GetPodRestartsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## HealthCollectorGetStreamsIngestion

> Healthcollectorv3GetStreamsIngestionResponse HealthCollectorGetStreamsIngestion(ctx, type_).StartTime(startTime).EndTime(endTime).Execute()

Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume

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
	type_ := "type__example" // string | The type of metric to retrieve
	startTime := time.Now() // time.Time | The start time from which the data needs to be calculated. (optional)
	endTime := time.Now() // time.Time | The end time from which the data needs to be calculated. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.HealthCollectorAPI.HealthCollectorGetStreamsIngestion(context.Background(), type_).StartTime(startTime).EndTime(endTime).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `HealthCollectorAPI.HealthCollectorGetStreamsIngestion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `HealthCollectorGetStreamsIngestion`: Healthcollectorv3GetStreamsIngestionResponse
	fmt.Fprintf(os.Stdout, "Response from `HealthCollectorAPI.HealthCollectorGetStreamsIngestion`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**type_** | **string** | The type of metric to retrieve | 

### Other Parameters

Other parameters are passed through a pointer to a apiHealthCollectorGetStreamsIngestionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **time.Time** | The start time from which the data needs to be calculated. | 
 **endTime** | **time.Time** | The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetStreamsIngestionResponse**](Healthcollectorv3GetStreamsIngestionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## HealthCollectorGetTopGDPCollectors

> Healthcollectorv3GetTopGDPCollectorsResponse HealthCollectorGetTopGDPCollectors(ctx, type_).StartTime(startTime).EndTime(endTime).Execute()

Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors

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
	type_ := "type__example" // string | The type of metric to retrieve
	startTime := time.Now() // time.Time | The start time from which the data needs to be calculated. (optional)
	endTime := time.Now() // time.Time | The end time from which the data needs to be calculated. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.HealthCollectorAPI.HealthCollectorGetTopGDPCollectors(context.Background(), type_).StartTime(startTime).EndTime(endTime).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `HealthCollectorAPI.HealthCollectorGetTopGDPCollectors``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `HealthCollectorGetTopGDPCollectors`: Healthcollectorv3GetTopGDPCollectorsResponse
	fmt.Fprintf(os.Stdout, "Response from `HealthCollectorAPI.HealthCollectorGetTopGDPCollectors`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**type_** | **string** | The type of metric to retrieve | 

### Other Parameters

Other parameters are passed through a pointer to a apiHealthCollectorGetTopGDPCollectorsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **time.Time** | The start time from which the data needs to be calculated. | 
 **endTime** | **time.Time** | The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetTopGDPCollectorsResponse**](Healthcollectorv3GetTopGDPCollectorsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## HealthCollectorStoreHealthInfo

> Healthcollectorv3StoreHealthInfoResponse HealthCollectorStoreHealthInfo(ctx, centralManagerId).Healthcollectorv3StoreHealthInfoRequest(healthcollectorv3StoreHealthInfoRequest).Execute()

Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)

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
	centralManagerId := "centralManagerId_example" // string | ID of central manager.
	healthcollectorv3StoreHealthInfoRequest := *openapiclient.NewHealthcollectorv3StoreHealthInfoRequest() // Healthcollectorv3StoreHealthInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.HealthCollectorAPI.HealthCollectorStoreHealthInfo(context.Background(), centralManagerId).Healthcollectorv3StoreHealthInfoRequest(healthcollectorv3StoreHealthInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `HealthCollectorAPI.HealthCollectorStoreHealthInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `HealthCollectorStoreHealthInfo`: Healthcollectorv3StoreHealthInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `HealthCollectorAPI.HealthCollectorStoreHealthInfo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 

### Other Parameters

Other parameters are passed through a pointer to a apiHealthCollectorStoreHealthInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **healthcollectorv3StoreHealthInfoRequest** | [**Healthcollectorv3StoreHealthInfoRequest**](Healthcollectorv3StoreHealthInfoRequest.md) |  | 

### Return type

[**Healthcollectorv3StoreHealthInfoResponse**](Healthcollectorv3StoreHealthInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

