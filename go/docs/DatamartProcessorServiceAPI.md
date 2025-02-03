# \DatamartProcessorServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DatamartProcessorServiceGetDatamartInfo**](DatamartProcessorServiceAPI.md#DatamartProcessorServiceGetDatamartInfo) | **Get** /api/v3/datamarts/info | Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
[**DatamartProcessorServiceGetDatamarts**](DatamartProcessorServiceAPI.md#DatamartProcessorServiceGetDatamarts) | **Get** /api/v3/datamarts | Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
[**DatamartProcessorServiceGetEarliestStartTime**](DatamartProcessorServiceAPI.md#DatamartProcessorServiceGetEarliestStartTime) | **Get** /api/v3/datamarts/earliest_start_time | Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
[**DatamartProcessorServiceSendAllCompleteFilesToQueue**](DatamartProcessorServiceAPI.md#DatamartProcessorServiceSendAllCompleteFilesToQueue) | **Post** /api/v3/datamarts/repush_files | 
[**DatamartProcessorServiceStoreExtractionLogs**](DatamartProcessorServiceAPI.md#DatamartProcessorServiceStoreExtractionLogs) | **Post** /api/v3/datamarts/{request_id}/dm_extraction_logs | Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
[**UploadDatamart**](DatamartProcessorServiceAPI.md#UploadDatamart) | **Post** /api/v3/datamarts/upload | Summary: Upload datamart Description: Upload datamart file for ingestion.



## DatamartProcessorServiceGetDatamartInfo

> Datamartprocessorv3GetDatamartInfoResponse DatamartProcessorServiceGetDatamartInfo(ctx).IngestionId(ingestionId).Execute()

Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.

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
	ingestionId := "ingestionId_example" // string | Ingestion id. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DatamartProcessorServiceAPI.DatamartProcessorServiceGetDatamartInfo(context.Background()).IngestionId(ingestionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatamartProcessorServiceAPI.DatamartProcessorServiceGetDatamartInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DatamartProcessorServiceGetDatamartInfo`: Datamartprocessorv3GetDatamartInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `DatamartProcessorServiceAPI.DatamartProcessorServiceGetDatamartInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDatamartProcessorServiceGetDatamartInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingestionId** | **string** | Ingestion id. | 

### Return type

[**Datamartprocessorv3GetDatamartInfoResponse**](Datamartprocessorv3GetDatamartInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DatamartProcessorServiceGetDatamarts

> Datamartprocessorv3GetDatamartResponse DatamartProcessorServiceGetDatamarts(ctx).PeriodStart(periodStart).PeriodEnd(periodEnd).Execute()

Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.

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
	periodStart := time.Now() // time.Time | Data starting time period in UTC. (optional)
	periodEnd := time.Now() // time.Time | Data ending time period in UTC. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DatamartProcessorServiceAPI.DatamartProcessorServiceGetDatamarts(context.Background()).PeriodStart(periodStart).PeriodEnd(periodEnd).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatamartProcessorServiceAPI.DatamartProcessorServiceGetDatamarts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DatamartProcessorServiceGetDatamarts`: Datamartprocessorv3GetDatamartResponse
	fmt.Fprintf(os.Stdout, "Response from `DatamartProcessorServiceAPI.DatamartProcessorServiceGetDatamarts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDatamartProcessorServiceGetDatamartsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **periodStart** | **time.Time** | Data starting time period in UTC. | 
 **periodEnd** | **time.Time** | Data ending time period in UTC. | 

### Return type

[**Datamartprocessorv3GetDatamartResponse**](Datamartprocessorv3GetDatamartResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DatamartProcessorServiceGetEarliestStartTime

> Datamartprocessorv3GetEarliestStartTimeResponse DatamartProcessorServiceGetEarliestStartTime(ctx).Execute()

Summary: Get rarliest start time Description: Return the earliest time period of data available in database.

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
	resp, r, err := apiClient.DatamartProcessorServiceAPI.DatamartProcessorServiceGetEarliestStartTime(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatamartProcessorServiceAPI.DatamartProcessorServiceGetEarliestStartTime``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DatamartProcessorServiceGetEarliestStartTime`: Datamartprocessorv3GetEarliestStartTimeResponse
	fmt.Fprintf(os.Stdout, "Response from `DatamartProcessorServiceAPI.DatamartProcessorServiceGetEarliestStartTime`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDatamartProcessorServiceGetEarliestStartTimeRequest struct via the builder pattern


### Return type

[**Datamartprocessorv3GetEarliestStartTimeResponse**](Datamartprocessorv3GetEarliestStartTimeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DatamartProcessorServiceSendAllCompleteFilesToQueue

> Datamartprocessorv3StatusResponseBase DatamartProcessorServiceSendAllCompleteFilesToQueue(ctx).Body(body).Execute()



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
	body := map[string]interface{}{ ... } // map[string]interface{} | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DatamartProcessorServiceAPI.DatamartProcessorServiceSendAllCompleteFilesToQueue(context.Background()).Body(body).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatamartProcessorServiceAPI.DatamartProcessorServiceSendAllCompleteFilesToQueue``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DatamartProcessorServiceSendAllCompleteFilesToQueue`: Datamartprocessorv3StatusResponseBase
	fmt.Fprintf(os.Stdout, "Response from `DatamartProcessorServiceAPI.DatamartProcessorServiceSendAllCompleteFilesToQueue`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDatamartProcessorServiceSendAllCompleteFilesToQueueRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map[string]interface{}** |  | 

### Return type

[**Datamartprocessorv3StatusResponseBase**](Datamartprocessorv3StatusResponseBase.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DatamartProcessorServiceStoreExtractionLogs

> Datamartprocessorv3DMExtractionLogsResponse DatamartProcessorServiceStoreExtractionLogs(ctx, requestId).Datamartprocessorv3DMExtractionLogsRequest(datamartprocessorv3DMExtractionLogsRequest).Execute()

Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.

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
	requestId := "requestId_example" // string | Request id which co-relates to request.
	datamartprocessorv3DMExtractionLogsRequest := *openapiclient.NewDatamartprocessorv3DMExtractionLogsRequest() // Datamartprocessorv3DMExtractionLogsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DatamartProcessorServiceAPI.DatamartProcessorServiceStoreExtractionLogs(context.Background(), requestId).Datamartprocessorv3DMExtractionLogsRequest(datamartprocessorv3DMExtractionLogsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatamartProcessorServiceAPI.DatamartProcessorServiceStoreExtractionLogs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DatamartProcessorServiceStoreExtractionLogs`: Datamartprocessorv3DMExtractionLogsResponse
	fmt.Fprintf(os.Stdout, "Response from `DatamartProcessorServiceAPI.DatamartProcessorServiceStoreExtractionLogs`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**requestId** | **string** | Request id which co-relates to request. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDatamartProcessorServiceStoreExtractionLogsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **datamartprocessorv3DMExtractionLogsRequest** | [**Datamartprocessorv3DMExtractionLogsRequest**](Datamartprocessorv3DMExtractionLogsRequest.md) |  | 

### Return type

[**Datamartprocessorv3DMExtractionLogsResponse**](Datamartprocessorv3DMExtractionLogsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UploadDatamart

> UploadDatamart(ctx).File(file).Execute()

Summary: Upload datamart Description: Upload datamart file for ingestion.

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
	file := os.NewFile(1234, "some_file") // *os.File | The file to upload.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.DatamartProcessorServiceAPI.UploadDatamart(context.Background()).File(file).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatamartProcessorServiceAPI.UploadDatamart``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUploadDatamartRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | ***os.File** | The file to upload. | 

### Return type

 (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

