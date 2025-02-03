# \DataMovementsAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetActualFlow**](DataMovementsAPI.md#GetActualFlow) | **Get** /api/v1/dspm/dataMovements/actualFlows/{id} | Get actual flow by providing its ID
[**GetActualFlowsSummary**](DataMovementsAPI.md#GetActualFlowsSummary) | **Get** /api/v1/dspm/dataMovements/actualFlows/summary | Get summary of actual flows
[**GetPotentialFlow**](DataMovementsAPI.md#GetPotentialFlow) | **Get** /api/v1/dspm/dataMovements/potentialFlows/{flowId} | Get potential flow by providing its ID
[**GetPotentialFlowPath**](DataMovementsAPI.md#GetPotentialFlowPath) | **Get** /api/v1/dspm/dataMovements/potentialFlows/paths/{flowPathId} | Get potential flow path by providing its ID
[**GetPotentialFlowsSummary**](DataMovementsAPI.md#GetPotentialFlowsSummary) | **Get** /api/v1/dspm/dataMovements/potentialFlows/summary | Get summary of potential flows according to the filter applied
[**ListActualFlowPaths**](DataMovementsAPI.md#ListActualFlowPaths) | **Get** /api/v1/dspm/dataMovements/actualFlowPaths | Get summary of actual flows according to the filter applied
[**ListActualFlows**](DataMovementsAPI.md#ListActualFlows) | **Get** /api/v1/dspm/dataMovements/actualFlows | List actual flows
[**ListPotentialFlows**](DataMovementsAPI.md#ListPotentialFlows) | **Get** /api/v1/dspm/dataMovements/potentialFlows | List potential flows
[**ListPotentialFlowsPaths**](DataMovementsAPI.md#ListPotentialFlowsPaths) | **Get** /api/v1/dspm/dataMovements/potentialFlows/paths | List potential flow paths



## GetActualFlow

> ActualFlow GetActualFlow(ctx, id).Execute()

Get actual flow by providing its ID



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
	id := "id_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataMovementsAPI.GetActualFlow(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataMovementsAPI.GetActualFlow``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetActualFlow`: ActualFlow
	fmt.Fprintf(os.Stdout, "Response from `DataMovementsAPI.GetActualFlow`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetActualFlowRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**ActualFlow**](ActualFlow.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetActualFlowsSummary

> ActualFlowsSummary GetActualFlowsSummary(ctx).Filter(filter).Execute()

Get summary of actual flows



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
	filter := *openapiclient.NewListActualFlowsFilterParameter() // ListActualFlowsFilterParameter |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataMovementsAPI.GetActualFlowsSummary(context.Background()).Filter(filter).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataMovementsAPI.GetActualFlowsSummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetActualFlowsSummary`: ActualFlowsSummary
	fmt.Fprintf(os.Stdout, "Response from `DataMovementsAPI.GetActualFlowsSummary`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetActualFlowsSummaryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListActualFlowsFilterParameter**](ListActualFlowsFilterParameter.md) |  | 

### Return type

[**ActualFlowsSummary**](ActualFlowsSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPotentialFlow

> PotentialFlow GetPotentialFlow(ctx, flowId).Execute()

Get potential flow by providing its ID



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
	flowId := "ff2b4abe-89f4-62b8-061e-1232456789" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataMovementsAPI.GetPotentialFlow(context.Background(), flowId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataMovementsAPI.GetPotentialFlow``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPotentialFlow`: PotentialFlow
	fmt.Fprintf(os.Stdout, "Response from `DataMovementsAPI.GetPotentialFlow`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**flowId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPotentialFlowRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**PotentialFlow**](PotentialFlow.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPotentialFlowPath

> PotentialFlowPath GetPotentialFlowPath(ctx, flowPathId).Execute()

Get potential flow path by providing its ID



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
	flowPathId := "ff2b4abe-89f4-62b8-061e-12345678910" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataMovementsAPI.GetPotentialFlowPath(context.Background(), flowPathId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataMovementsAPI.GetPotentialFlowPath``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPotentialFlowPath`: PotentialFlowPath
	fmt.Fprintf(os.Stdout, "Response from `DataMovementsAPI.GetPotentialFlowPath`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**flowPathId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPotentialFlowPathRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**PotentialFlowPath**](PotentialFlowPath.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPotentialFlowsSummary

> PotentialFlowsSummary GetPotentialFlowsSummary(ctx).Filter(filter).Execute()

Get summary of potential flows according to the filter applied



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
	filter := *openapiclient.NewPotentialFlowsFilterOptions() // PotentialFlowsFilterOptions |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataMovementsAPI.GetPotentialFlowsSummary(context.Background()).Filter(filter).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataMovementsAPI.GetPotentialFlowsSummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPotentialFlowsSummary`: PotentialFlowsSummary
	fmt.Fprintf(os.Stdout, "Response from `DataMovementsAPI.GetPotentialFlowsSummary`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetPotentialFlowsSummaryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**PotentialFlowsFilterOptions**](PotentialFlowsFilterOptions.md) |  | 

### Return type

[**PotentialFlowsSummary**](PotentialFlowsSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListActualFlowPaths

> ListActualFlowPaths200Response ListActualFlowPaths(ctx).Sort(sort).Filter(filter).PageSize(pageSize).NextToken(nextToken).Execute()

Get summary of actual flows according to the filter applied



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
	sort := *openapiclient.NewListActualFlowPathsSortParameter("SortBy_example") // ListActualFlowPathsSortParameter |  (optional)
	filter := *openapiclient.NewListActualFlowPathsFilterParameter() // ListActualFlowPathsFilterParameter |  (optional)
	pageSize := float32(8.14) // float32 |  (optional)
	nextToken := "nextToken_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataMovementsAPI.ListActualFlowPaths(context.Background()).Sort(sort).Filter(filter).PageSize(pageSize).NextToken(nextToken).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataMovementsAPI.ListActualFlowPaths``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListActualFlowPaths`: ListActualFlowPaths200Response
	fmt.Fprintf(os.Stdout, "Response from `DataMovementsAPI.ListActualFlowPaths`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListActualFlowPathsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | [**ListActualFlowPathsSortParameter**](ListActualFlowPathsSortParameter.md) |  | 
 **filter** | [**ListActualFlowPathsFilterParameter**](ListActualFlowPathsFilterParameter.md) |  | 
 **pageSize** | **float32** |  | 
 **nextToken** | **string** |  | 

### Return type

[**ListActualFlowPaths200Response**](ListActualFlowPaths200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListActualFlows

> ListActualFlows200Response ListActualFlows(ctx).Sort(sort).Filter(filter).PageSize(pageSize).NextToken(nextToken).Execute()

List actual flows



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
	sort := *openapiclient.NewListActualFlowsSortParameter("SortBy_example") // ListActualFlowsSortParameter |  (optional)
	filter := *openapiclient.NewListActualFlowsFilterParameter() // ListActualFlowsFilterParameter |  (optional)
	pageSize := float32(8.14) // float32 |  (optional)
	nextToken := "nextToken_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataMovementsAPI.ListActualFlows(context.Background()).Sort(sort).Filter(filter).PageSize(pageSize).NextToken(nextToken).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataMovementsAPI.ListActualFlows``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListActualFlows`: ListActualFlows200Response
	fmt.Fprintf(os.Stdout, "Response from `DataMovementsAPI.ListActualFlows`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListActualFlowsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | [**ListActualFlowsSortParameter**](ListActualFlowsSortParameter.md) |  | 
 **filter** | [**ListActualFlowsFilterParameter**](ListActualFlowsFilterParameter.md) |  | 
 **pageSize** | **float32** |  | 
 **nextToken** | **string** |  | 

### Return type

[**ListActualFlows200Response**](ListActualFlows200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListPotentialFlows

> ListPotentialFlows200Response ListPotentialFlows(ctx).Filter(filter).PageSize(pageSize).NextToken(nextToken).Execute()

List potential flows



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
	filter := *openapiclient.NewPotentialFlowsFilterOptions() // PotentialFlowsFilterOptions |  (optional)
	pageSize := float32(8.14) // float32 |  (optional)
	nextToken := "nextToken_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataMovementsAPI.ListPotentialFlows(context.Background()).Filter(filter).PageSize(pageSize).NextToken(nextToken).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataMovementsAPI.ListPotentialFlows``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListPotentialFlows`: ListPotentialFlows200Response
	fmt.Fprintf(os.Stdout, "Response from `DataMovementsAPI.ListPotentialFlows`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListPotentialFlowsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**PotentialFlowsFilterOptions**](PotentialFlowsFilterOptions.md) |  | 
 **pageSize** | **float32** |  | 
 **nextToken** | **string** |  | 

### Return type

[**ListPotentialFlows200Response**](ListPotentialFlows200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListPotentialFlowsPaths

> ListPotentialFlowsPaths200Response ListPotentialFlowsPaths(ctx).Filter(filter).PageSize(pageSize).NextToken(nextToken).Execute()

List potential flow paths



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
	filter := *openapiclient.NewPotentialFlowsPathsFilterOptions() // PotentialFlowsPathsFilterOptions |  (optional)
	pageSize := float32(8.14) // float32 |  (optional)
	nextToken := "nextToken_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataMovementsAPI.ListPotentialFlowsPaths(context.Background()).Filter(filter).PageSize(pageSize).NextToken(nextToken).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataMovementsAPI.ListPotentialFlowsPaths``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListPotentialFlowsPaths`: ListPotentialFlowsPaths200Response
	fmt.Fprintf(os.Stdout, "Response from `DataMovementsAPI.ListPotentialFlowsPaths`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListPotentialFlowsPathsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**PotentialFlowsPathsFilterOptions**](PotentialFlowsPathsFilterOptions.md) |  | 
 **pageSize** | **float32** |  | 
 **nextToken** | **string** |  | 

### Return type

[**ListPotentialFlowsPaths200Response**](ListPotentialFlowsPaths200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

