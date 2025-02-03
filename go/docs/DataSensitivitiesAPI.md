# \DataSensitivitiesAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSensitivitiesSummary**](DataSensitivitiesAPI.md#GetSensitivitiesSummary) | **Get** /api/v1/dspm/sensitivities/summary | Get the summary of sensitivities
[**GetSensitivity**](DataSensitivitiesAPI.md#GetSensitivity) | **Get** /api/v1/dspm/sensitivities/{sensitivityId} | Get sensitivity details by providing its ID
[**ListSensitivities**](DataSensitivitiesAPI.md#ListSensitivities) | **Get** /api/v1/dspm/sensitivities | List sensitivities



## GetSensitivitiesSummary

> SensitivitiesSummary GetSensitivitiesSummary(ctx).Filter(filter).Execute()

Get the summary of sensitivities



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
	filter := *openapiclient.NewListSensitivitiesFilterParameter() // ListSensitivitiesFilterParameter |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataSensitivitiesAPI.GetSensitivitiesSummary(context.Background()).Filter(filter).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataSensitivitiesAPI.GetSensitivitiesSummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetSensitivitiesSummary`: SensitivitiesSummary
	fmt.Fprintf(os.Stdout, "Response from `DataSensitivitiesAPI.GetSensitivitiesSummary`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetSensitivitiesSummaryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListSensitivitiesFilterParameter**](ListSensitivitiesFilterParameter.md) |  | 

### Return type

[**SensitivitiesSummary**](SensitivitiesSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSensitivity

> Sensitivity GetSensitivity(ctx, sensitivityId).Execute()

Get sensitivity details by providing its ID



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
	sensitivityId := "sensitivityId_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataSensitivitiesAPI.GetSensitivity(context.Background(), sensitivityId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataSensitivitiesAPI.GetSensitivity``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetSensitivity`: Sensitivity
	fmt.Fprintf(os.Stdout, "Response from `DataSensitivitiesAPI.GetSensitivity`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**sensitivityId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetSensitivityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Sensitivity**](Sensitivity.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListSensitivities

> ListSensitivities200Response ListSensitivities(ctx).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()

List sensitivities



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
	filter := *openapiclient.NewListSensitivitiesFilterParameter() // ListSensitivitiesFilterParameter |  (optional)
	sort := *openapiclient.NewLastSeenSortSchema("SortBy_example") // LastSeenSortSchema |  (optional)
	pageSize := float32(8.14) // float32 |  (optional)
	nextToken := "nextToken_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataSensitivitiesAPI.ListSensitivities(context.Background()).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataSensitivitiesAPI.ListSensitivities``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListSensitivities`: ListSensitivities200Response
	fmt.Fprintf(os.Stdout, "Response from `DataSensitivitiesAPI.ListSensitivities`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListSensitivitiesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListSensitivitiesFilterParameter**](ListSensitivitiesFilterParameter.md) |  | 
 **sort** | [**LastSeenSortSchema**](LastSeenSortSchema.md) |  | 
 **pageSize** | **float32** |  | 
 **nextToken** | **string** |  | 

### Return type

[**ListSensitivities200Response**](ListSensitivities200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

