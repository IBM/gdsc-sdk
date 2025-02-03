# \DataVulnerabilitiesAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddVulnerabilityStatusComment**](DataVulnerabilitiesAPI.md#AddVulnerabilityStatusComment) | **Post** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments | Add vulnerability status comment
[**GetVulnerabilitiesSummary**](DataVulnerabilitiesAPI.md#GetVulnerabilitiesSummary) | **Get** /api/v1/dspm/vulnerabilities/summary | Get vulnerabilities summary
[**GetVulnerability**](DataVulnerabilitiesAPI.md#GetVulnerability) | **Get** /api/v1/dspm/vulnerabilities/{vulnerabilityId} | Get vulnerability details by ID
[**ListVulnerabilities**](DataVulnerabilitiesAPI.md#ListVulnerabilities) | **Get** /api/v1/dspm/vulnerabilities | List vulnerabilities based on an applied filter
[**ListVulnerabilitiesByDataStore**](DataVulnerabilitiesAPI.md#ListVulnerabilitiesByDataStore) | **Get** /api/v1/dspm/vulnerabilities/byDataStore | List vulnerabilities of data stores
[**RemoveVulnerabilityStatusComment**](DataVulnerabilitiesAPI.md#RemoveVulnerabilityStatusComment) | **Delete** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Delete vulnerability status comment
[**SetVulnerabilityStatus**](DataVulnerabilitiesAPI.md#SetVulnerabilityStatus) | **Post** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses | Set status of a vulnerability
[**UpdateVulnerabilityStatusComment**](DataVulnerabilitiesAPI.md#UpdateVulnerabilityStatusComment) | **Put** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Set vulnerability status



## AddVulnerabilityStatusComment

> VulnerabilityStatus AddVulnerabilityStatusComment(ctx, vulnerabilityId, statusId).AddCommentBody(addCommentBody).Execute()

Add vulnerability status comment



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
	vulnerabilityId := "384cd426-b187-438a-affc-e12b323f5890" // string | 
	statusId := "statusId_example" // string | 
	addCommentBody := *openapiclient.NewAddCommentBody("Comment_example") // AddCommentBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataVulnerabilitiesAPI.AddVulnerabilityStatusComment(context.Background(), vulnerabilityId, statusId).AddCommentBody(addCommentBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataVulnerabilitiesAPI.AddVulnerabilityStatusComment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AddVulnerabilityStatusComment`: VulnerabilityStatus
	fmt.Fprintf(os.Stdout, "Response from `DataVulnerabilitiesAPI.AddVulnerabilityStatusComment`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vulnerabilityId** | **string** |  | 
**statusId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiAddVulnerabilityStatusCommentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **addCommentBody** | [**AddCommentBody**](AddCommentBody.md) |  | 

### Return type

[**VulnerabilityStatus**](VulnerabilityStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetVulnerabilitiesSummary

> VulnerabilitiesSummary GetVulnerabilitiesSummary(ctx).Filter(filter).Execute()

Get vulnerabilities summary



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
	filter := *openapiclient.NewVulnerabilitiesFilterOptions() // VulnerabilitiesFilterOptions |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataVulnerabilitiesAPI.GetVulnerabilitiesSummary(context.Background()).Filter(filter).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataVulnerabilitiesAPI.GetVulnerabilitiesSummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetVulnerabilitiesSummary`: VulnerabilitiesSummary
	fmt.Fprintf(os.Stdout, "Response from `DataVulnerabilitiesAPI.GetVulnerabilitiesSummary`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetVulnerabilitiesSummaryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**VulnerabilitiesFilterOptions**](VulnerabilitiesFilterOptions.md) |  | 

### Return type

[**VulnerabilitiesSummary**](VulnerabilitiesSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetVulnerability

> Vulnerability GetVulnerability(ctx, vulnerabilityId).Execute()

Get vulnerability details by ID



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
	vulnerabilityId := "384cd426-b187-438a-affc-e12b323f5890" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataVulnerabilitiesAPI.GetVulnerability(context.Background(), vulnerabilityId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataVulnerabilitiesAPI.GetVulnerability``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetVulnerability`: Vulnerability
	fmt.Fprintf(os.Stdout, "Response from `DataVulnerabilitiesAPI.GetVulnerability`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vulnerabilityId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetVulnerabilityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Vulnerability**](Vulnerability.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListVulnerabilities

> ListVulnerabilities200Response ListVulnerabilities(ctx).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()

List vulnerabilities based on an applied filter



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
	filter := *openapiclient.NewVulnerabilitiesFilterOptions() // VulnerabilitiesFilterOptions |  (optional)
	sort := *openapiclient.NewListVulnerabilitiesSortParameter("SortBy_example") // ListVulnerabilitiesSortParameter |  (optional)
	pageSize := float32(8.14) // float32 |  (optional)
	nextToken := "nextToken_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataVulnerabilitiesAPI.ListVulnerabilities(context.Background()).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataVulnerabilitiesAPI.ListVulnerabilities``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListVulnerabilities`: ListVulnerabilities200Response
	fmt.Fprintf(os.Stdout, "Response from `DataVulnerabilitiesAPI.ListVulnerabilities`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListVulnerabilitiesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**VulnerabilitiesFilterOptions**](VulnerabilitiesFilterOptions.md) |  | 
 **sort** | [**ListVulnerabilitiesSortParameter**](ListVulnerabilitiesSortParameter.md) |  | 
 **pageSize** | **float32** |  | 
 **nextToken** | **string** |  | 

### Return type

[**ListVulnerabilities200Response**](ListVulnerabilities200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListVulnerabilitiesByDataStore

> ListVulnerabilitiesByDataStore200Response ListVulnerabilitiesByDataStore(ctx).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()

List vulnerabilities of data stores



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
	filter := *openapiclient.NewVulnerabilitiesByDataStoreFilterOptions() // VulnerabilitiesByDataStoreFilterOptions |  (optional)
	sort := *openapiclient.NewListVulnerabilitiesByDataStoreSortParameter("SortBy_example") // ListVulnerabilitiesByDataStoreSortParameter |  (optional)
	pageSize := float32(8.14) // float32 |  (optional)
	nextToken := "nextToken_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataVulnerabilitiesAPI.ListVulnerabilitiesByDataStore(context.Background()).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataVulnerabilitiesAPI.ListVulnerabilitiesByDataStore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListVulnerabilitiesByDataStore`: ListVulnerabilitiesByDataStore200Response
	fmt.Fprintf(os.Stdout, "Response from `DataVulnerabilitiesAPI.ListVulnerabilitiesByDataStore`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListVulnerabilitiesByDataStoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**VulnerabilitiesByDataStoreFilterOptions**](VulnerabilitiesByDataStoreFilterOptions.md) |  | 
 **sort** | [**ListVulnerabilitiesByDataStoreSortParameter**](ListVulnerabilitiesByDataStoreSortParameter.md) |  | 
 **pageSize** | **float32** |  | 
 **nextToken** | **string** |  | 

### Return type

[**ListVulnerabilitiesByDataStore200Response**](ListVulnerabilitiesByDataStore200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RemoveVulnerabilityStatusComment

> RemoveVulnerabilityStatusComment(ctx, vulnerabilityId, statusId, commentId).Execute()

Delete vulnerability status comment



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
	vulnerabilityId := "384cd426-b187-438a-affc-e12b323f5890" // string | 
	statusId := "statusId_example" // string | 
	commentId := "commentId_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.DataVulnerabilitiesAPI.RemoveVulnerabilityStatusComment(context.Background(), vulnerabilityId, statusId, commentId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataVulnerabilitiesAPI.RemoveVulnerabilityStatusComment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vulnerabilityId** | **string** |  | 
**statusId** | **string** |  | 
**commentId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRemoveVulnerabilityStatusCommentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




### Return type

 (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SetVulnerabilityStatus

> VulnerabilityStatus SetVulnerabilityStatus(ctx, vulnerabilityId).SetVulnerabilityStatusRequest(setVulnerabilityStatusRequest).Execute()

Set status of a vulnerability



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
	vulnerabilityId := "vulnerabilityId_example" // string | 
	setVulnerabilityStatusRequest := *openapiclient.NewSetVulnerabilityStatusRequest(openapiclient.VulnerabilityStatusType("review")) // SetVulnerabilityStatusRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataVulnerabilitiesAPI.SetVulnerabilityStatus(context.Background(), vulnerabilityId).SetVulnerabilityStatusRequest(setVulnerabilityStatusRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataVulnerabilitiesAPI.SetVulnerabilityStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SetVulnerabilityStatus`: VulnerabilityStatus
	fmt.Fprintf(os.Stdout, "Response from `DataVulnerabilitiesAPI.SetVulnerabilityStatus`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vulnerabilityId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiSetVulnerabilityStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **setVulnerabilityStatusRequest** | [**SetVulnerabilityStatusRequest**](SetVulnerabilityStatusRequest.md) |  | 

### Return type

[**VulnerabilityStatus**](VulnerabilityStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateVulnerabilityStatusComment

> VulnerabilityStatusComment UpdateVulnerabilityStatusComment(ctx, vulnerabilityId, statusId, commentId).UpdateCommentBody(updateCommentBody).Execute()

Set vulnerability status



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
	vulnerabilityId := "384cd426-b187-438a-affc-e12b323f5890" // string | 
	statusId := "statusId_example" // string | 
	commentId := "commentId_example" // string | 
	updateCommentBody := *openapiclient.NewUpdateCommentBody("Comment_example") // UpdateCommentBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataVulnerabilitiesAPI.UpdateVulnerabilityStatusComment(context.Background(), vulnerabilityId, statusId, commentId).UpdateCommentBody(updateCommentBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataVulnerabilitiesAPI.UpdateVulnerabilityStatusComment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateVulnerabilityStatusComment`: VulnerabilityStatusComment
	fmt.Fprintf(os.Stdout, "Response from `DataVulnerabilitiesAPI.UpdateVulnerabilityStatusComment`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vulnerabilityId** | **string** |  | 
**statusId** | **string** |  | 
**commentId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateVulnerabilityStatusCommentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **updateCommentBody** | [**UpdateCommentBody**](UpdateCommentBody.md) |  | 

### Return type

[**VulnerabilityStatusComment**](VulnerabilityStatusComment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

