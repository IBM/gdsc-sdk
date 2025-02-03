# \ReportsRunnerAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReportsRunnerGetActiveQueries**](ReportsRunnerAPI.md#ReportsRunnerGetActiveQueries) | **Post** /api/v3/queries/search | Summary: Get running queries Description: Get queries that are running more than certain time
[**ReportsRunnerGetAuditDataCount**](ReportsRunnerAPI.md#ReportsRunnerGetAuditDataCount) | **Post** /api/v3/reports/{report_id}/audit_count | Summary: Get audit data count Description: Get audit data.
[**ReportsRunnerGetChartData**](ReportsRunnerAPI.md#ReportsRunnerGetChartData) | **Post** /api/v3/charts/run | Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
[**ReportsRunnerGetChartDatav2**](ReportsRunnerAPI.md#ReportsRunnerGetChartDatav2) | **Post** /api/v3/flex-charts/run | 
[**ReportsRunnerGetReportColumnFacet**](ReportsRunnerAPI.md#ReportsRunnerGetReportColumnFacet) | **Post** /api/v3/reports/facet | Summary: Get report column facet Description: Get counts that is group by values for the selected column.
[**ReportsRunnerGetReportDataCount**](ReportsRunnerAPI.md#ReportsRunnerGetReportDataCount) | **Post** /api/v3/reports/count | Summary: Get report data count Description: Get report data.
[**ReportsRunnerRunAuditReport**](ReportsRunnerAPI.md#ReportsRunnerRunAuditReport) | **Post** /api/v3/audit/{report_id}/run | Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
[**ReportsRunnerRunReport**](ReportsRunnerAPI.md#ReportsRunnerRunReport) | **Post** /api/v3/reports/run | Summary: Run report Description: Run report by report ID or by specifying report definition.
[**ReportsRunnerStopQuery**](ReportsRunnerAPI.md#ReportsRunnerStopQuery) | **Post** /api/v3/queries/stop | Summary: Stop query Description: Stop a query based on the id



## ReportsRunnerGetActiveQueries

> Reportsrunnerv3GetActiveQueriesResponse ReportsRunnerGetActiveQueries(ctx).Reportsrunnerv3GetActiveQueriesRequest(reportsrunnerv3GetActiveQueriesRequest).Execute()

Summary: Get running queries Description: Get queries that are running more than certain time

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
	reportsrunnerv3GetActiveQueriesRequest := *openapiclient.NewReportsrunnerv3GetActiveQueriesRequest() // Reportsrunnerv3GetActiveQueriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsRunnerAPI.ReportsRunnerGetActiveQueries(context.Background()).Reportsrunnerv3GetActiveQueriesRequest(reportsrunnerv3GetActiveQueriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsRunnerAPI.ReportsRunnerGetActiveQueries``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsRunnerGetActiveQueries`: Reportsrunnerv3GetActiveQueriesResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsRunnerAPI.ReportsRunnerGetActiveQueries`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsRunnerGetActiveQueriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetActiveQueriesRequest** | [**Reportsrunnerv3GetActiveQueriesRequest**](Reportsrunnerv3GetActiveQueriesRequest.md) |  | 

### Return type

[**Reportsrunnerv3GetActiveQueriesResponse**](Reportsrunnerv3GetActiveQueriesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsRunnerGetAuditDataCount

> Reportsrunnerv3GetReportDataCountResponse ReportsRunnerGetAuditDataCount(ctx, reportId).Reportsrunnerv3GetAuditDataCountRequest(reportsrunnerv3GetAuditDataCountRequest).Execute()

Summary: Get audit data count Description: Get audit data.

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
	reportId := "reportId_example" // string | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905).
	reportsrunnerv3GetAuditDataCountRequest := *openapiclient.NewReportsrunnerv3GetAuditDataCountRequest() // Reportsrunnerv3GetAuditDataCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsRunnerAPI.ReportsRunnerGetAuditDataCount(context.Background(), reportId).Reportsrunnerv3GetAuditDataCountRequest(reportsrunnerv3GetAuditDataCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsRunnerAPI.ReportsRunnerGetAuditDataCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsRunnerGetAuditDataCount`: Reportsrunnerv3GetReportDataCountResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsRunnerAPI.ReportsRunnerGetAuditDataCount`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reportId** | **string** | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsRunnerGetAuditDataCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **reportsrunnerv3GetAuditDataCountRequest** | [**Reportsrunnerv3GetAuditDataCountRequest**](Reportsrunnerv3GetAuditDataCountRequest.md) |  | 

### Return type

[**Reportsrunnerv3GetReportDataCountResponse**](Reportsrunnerv3GetReportDataCountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsRunnerGetChartData

> Reportsrunnerv3GetChartDataResponse ReportsRunnerGetChartData(ctx).Reportsrunnerv3GetChartDataRequest(reportsrunnerv3GetChartDataRequest).Execute()

Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.

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
	reportsrunnerv3GetChartDataRequest := *openapiclient.NewReportsrunnerv3GetChartDataRequest() // Reportsrunnerv3GetChartDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsRunnerAPI.ReportsRunnerGetChartData(context.Background()).Reportsrunnerv3GetChartDataRequest(reportsrunnerv3GetChartDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsRunnerAPI.ReportsRunnerGetChartData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsRunnerGetChartData`: Reportsrunnerv3GetChartDataResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsRunnerAPI.ReportsRunnerGetChartData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsRunnerGetChartDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetChartDataRequest** | [**Reportsrunnerv3GetChartDataRequest**](Reportsrunnerv3GetChartDataRequest.md) |  | 

### Return type

[**Reportsrunnerv3GetChartDataResponse**](Reportsrunnerv3GetChartDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsRunnerGetChartDatav2

> Reportsrunnerv3GetChartDataResponsev2 ReportsRunnerGetChartDatav2(ctx).Reportsrunnerv3GetChartDataRequestv2(reportsrunnerv3GetChartDataRequestv2).Execute()



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
	reportsrunnerv3GetChartDataRequestv2 := *openapiclient.NewReportsrunnerv3GetChartDataRequestv2() // Reportsrunnerv3GetChartDataRequestv2 | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsRunnerAPI.ReportsRunnerGetChartDatav2(context.Background()).Reportsrunnerv3GetChartDataRequestv2(reportsrunnerv3GetChartDataRequestv2).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsRunnerAPI.ReportsRunnerGetChartDatav2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsRunnerGetChartDatav2`: Reportsrunnerv3GetChartDataResponsev2
	fmt.Fprintf(os.Stdout, "Response from `ReportsRunnerAPI.ReportsRunnerGetChartDatav2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsRunnerGetChartDatav2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetChartDataRequestv2** | [**Reportsrunnerv3GetChartDataRequestv2**](Reportsrunnerv3GetChartDataRequestv2.md) |  | 

### Return type

[**Reportsrunnerv3GetChartDataResponsev2**](Reportsrunnerv3GetChartDataResponsev2.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsRunnerGetReportColumnFacet

> Reportsrunnerv3GetReportColumnFacetResponse ReportsRunnerGetReportColumnFacet(ctx).Reportsrunnerv3GetReportColumnFacetRequest(reportsrunnerv3GetReportColumnFacetRequest).Execute()

Summary: Get report column facet Description: Get counts that is group by values for the selected column.

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
	reportsrunnerv3GetReportColumnFacetRequest := *openapiclient.NewReportsrunnerv3GetReportColumnFacetRequest() // Reportsrunnerv3GetReportColumnFacetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsRunnerAPI.ReportsRunnerGetReportColumnFacet(context.Background()).Reportsrunnerv3GetReportColumnFacetRequest(reportsrunnerv3GetReportColumnFacetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsRunnerAPI.ReportsRunnerGetReportColumnFacet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsRunnerGetReportColumnFacet`: Reportsrunnerv3GetReportColumnFacetResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsRunnerAPI.ReportsRunnerGetReportColumnFacet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsRunnerGetReportColumnFacetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetReportColumnFacetRequest** | [**Reportsrunnerv3GetReportColumnFacetRequest**](Reportsrunnerv3GetReportColumnFacetRequest.md) |  | 

### Return type

[**Reportsrunnerv3GetReportColumnFacetResponse**](Reportsrunnerv3GetReportColumnFacetResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsRunnerGetReportDataCount

> Reportsrunnerv3GetReportDataCountResponse ReportsRunnerGetReportDataCount(ctx).Reportsrunnerv3GetReportDataCountRequest(reportsrunnerv3GetReportDataCountRequest).Execute()

Summary: Get report data count Description: Get report data.

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
	reportsrunnerv3GetReportDataCountRequest := *openapiclient.NewReportsrunnerv3GetReportDataCountRequest() // Reportsrunnerv3GetReportDataCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsRunnerAPI.ReportsRunnerGetReportDataCount(context.Background()).Reportsrunnerv3GetReportDataCountRequest(reportsrunnerv3GetReportDataCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsRunnerAPI.ReportsRunnerGetReportDataCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsRunnerGetReportDataCount`: Reportsrunnerv3GetReportDataCountResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsRunnerAPI.ReportsRunnerGetReportDataCount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsRunnerGetReportDataCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetReportDataCountRequest** | [**Reportsrunnerv3GetReportDataCountRequest**](Reportsrunnerv3GetReportDataCountRequest.md) |  | 

### Return type

[**Reportsrunnerv3GetReportDataCountResponse**](Reportsrunnerv3GetReportDataCountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsRunnerRunAuditReport

> StreamResultOfReportsrunnerv3RunReportResponse ReportsRunnerRunAuditReport(ctx, reportId).Reportsrunnerv3RunAuditReportRequest(reportsrunnerv3RunAuditReportRequest).Execute()

Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.

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
	reportId := "reportId_example" // string | The ID of the Report we wish to run (e.g. 000000000000000000000905).
	reportsrunnerv3RunAuditReportRequest := *openapiclient.NewReportsrunnerv3RunAuditReportRequest() // Reportsrunnerv3RunAuditReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsRunnerAPI.ReportsRunnerRunAuditReport(context.Background(), reportId).Reportsrunnerv3RunAuditReportRequest(reportsrunnerv3RunAuditReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsRunnerAPI.ReportsRunnerRunAuditReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsRunnerRunAuditReport`: StreamResultOfReportsrunnerv3RunReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsRunnerAPI.ReportsRunnerRunAuditReport`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reportId** | **string** | The ID of the Report we wish to run (e.g. 000000000000000000000905). | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsRunnerRunAuditReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **reportsrunnerv3RunAuditReportRequest** | [**Reportsrunnerv3RunAuditReportRequest**](Reportsrunnerv3RunAuditReportRequest.md) |  | 

### Return type

[**StreamResultOfReportsrunnerv3RunReportResponse**](StreamResultOfReportsrunnerv3RunReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsRunnerRunReport

> StreamResultOfReportsrunnerv3RunReportResponse ReportsRunnerRunReport(ctx).Reportsrunnerv3RunReportRequest(reportsrunnerv3RunReportRequest).Execute()

Summary: Run report Description: Run report by report ID or by specifying report definition.

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
	reportsrunnerv3RunReportRequest := *openapiclient.NewReportsrunnerv3RunReportRequest() // Reportsrunnerv3RunReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsRunnerAPI.ReportsRunnerRunReport(context.Background()).Reportsrunnerv3RunReportRequest(reportsrunnerv3RunReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsRunnerAPI.ReportsRunnerRunReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsRunnerRunReport`: StreamResultOfReportsrunnerv3RunReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsRunnerAPI.ReportsRunnerRunReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsRunnerRunReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3RunReportRequest** | [**Reportsrunnerv3RunReportRequest**](Reportsrunnerv3RunReportRequest.md) |  | 

### Return type

[**StreamResultOfReportsrunnerv3RunReportResponse**](StreamResultOfReportsrunnerv3RunReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsRunnerStopQuery

> Reportsrunnerv3StopQueryResponse ReportsRunnerStopQuery(ctx).Reportsrunnerv3StopQueryRequest(reportsrunnerv3StopQueryRequest).Execute()

Summary: Stop query Description: Stop a query based on the id

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
	reportsrunnerv3StopQueryRequest := *openapiclient.NewReportsrunnerv3StopQueryRequest() // Reportsrunnerv3StopQueryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsRunnerAPI.ReportsRunnerStopQuery(context.Background()).Reportsrunnerv3StopQueryRequest(reportsrunnerv3StopQueryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsRunnerAPI.ReportsRunnerStopQuery``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsRunnerStopQuery`: Reportsrunnerv3StopQueryResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsRunnerAPI.ReportsRunnerStopQuery`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsRunnerStopQueryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3StopQueryRequest** | [**Reportsrunnerv3StopQueryRequest**](Reportsrunnerv3StopQueryRequest.md) |  | 

### Return type

[**Reportsrunnerv3StopQueryResponse**](Reportsrunnerv3StopQueryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

