# \DataResourcesAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDataResource**](DataResourcesAPI.md#GetDataResource) | **Get** /api/v1/dspm/dataResources/{dataResourceId} | Get a specific data resource by its ID
[**GetDataResourcesSummary**](DataResourcesAPI.md#GetDataResourcesSummary) | **Get** /api/v1/dspm/dataResources/summary | Data resources summary
[**ListDataResources**](DataResourcesAPI.md#ListDataResources) | **Get** /api/v1/dspm/dataResources | List data resources that match a given filter
[**ListDataResourcesNames**](DataResourcesAPI.md#ListDataResourcesNames) | **Get** /api/v1/dspm/dataResources/names | List names of data resources
[**RemoveResource**](DataResourcesAPI.md#RemoveResource) | **Delete** /api/v1/dspm/dataResources/{dataResourceId}/removeResource | Remove resource from Guardium Insights SaaS DSPM
[**UpdateResourceReviewStatus**](DataResourcesAPI.md#UpdateResourceReviewStatus) | **Put** /api/v1/dspm/dataResources/{dataResourceId}/reviewed | Set review status of a data resource



## GetDataResource

> DataResource GetDataResource(ctx, dataResourceId).Execute()

Get a specific data resource by its ID



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
	dataResourceId := "arn:aws:s3::12345678910:polar-security-corplex.xlsx" // string | Data resource ID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataResourcesAPI.GetDataResource(context.Background(), dataResourceId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataResourcesAPI.GetDataResource``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetDataResource`: DataResource
	fmt.Fprintf(os.Stdout, "Response from `DataResourcesAPI.GetDataResource`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dataResourceId** | **string** | Data resource ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetDataResourceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**DataResource**](DataResource.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetDataResourcesSummary

> DataResourcesSummary GetDataResourcesSummary(ctx).DataStoreId(dataStoreId).Filter(filter).Execute()

Data resources summary



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
	dataStoreId := "arn:aws:s3::123456789101:mys3-prod" // string | Data store id (optional)
	filter := *openapiclient.NewListDataResourcesFilterParameter() // ListDataResourcesFilterParameter |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataResourcesAPI.GetDataResourcesSummary(context.Background()).DataStoreId(dataStoreId).Filter(filter).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataResourcesAPI.GetDataResourcesSummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetDataResourcesSummary`: DataResourcesSummary
	fmt.Fprintf(os.Stdout, "Response from `DataResourcesAPI.GetDataResourcesSummary`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetDataResourcesSummaryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | **string** | Data store id | 
 **filter** | [**ListDataResourcesFilterParameter**](ListDataResourcesFilterParameter.md) |  | 

### Return type

[**DataResourcesSummary**](DataResourcesSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListDataResources

> ListDataResources200Response ListDataResources(ctx).DataStoreId(dataStoreId).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()

List data resources that match a given filter



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
	dataStoreId := "arn:aws:s3::123456789101:mys3-prod" // string |  (optional)
	filter := *openapiclient.NewListDataResourcesFilterParameter() // ListDataResourcesFilterParameter |  (optional)
	sort := *openapiclient.NewListDataResourcesSortParameter("SortBy_example") // ListDataResourcesSortParameter |  (optional)
	pageSize := float32(8.14) // float32 |  (optional)
	nextToken := "nextToken_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataResourcesAPI.ListDataResources(context.Background()).DataStoreId(dataStoreId).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataResourcesAPI.ListDataResources``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListDataResources`: ListDataResources200Response
	fmt.Fprintf(os.Stdout, "Response from `DataResourcesAPI.ListDataResources`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListDataResourcesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | **string** |  | 
 **filter** | [**ListDataResourcesFilterParameter**](ListDataResourcesFilterParameter.md) |  | 
 **sort** | [**ListDataResourcesSortParameter**](ListDataResourcesSortParameter.md) |  | 
 **pageSize** | **float32** |  | 
 **nextToken** | **string** |  | 

### Return type

[**ListDataResources200Response**](ListDataResources200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListDataResourcesNames

> []string ListDataResourcesNames(ctx).Prefix(prefix).DataStoreId(dataStoreId).Execute()

List names of data resources



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
	prefix := "check" // string | Prefix of data resource name
	dataStoreId := "arn:aws:s3::123456789101:mys3-prod" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataResourcesAPI.ListDataResourcesNames(context.Background()).Prefix(prefix).DataStoreId(dataStoreId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataResourcesAPI.ListDataResourcesNames``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListDataResourcesNames`: []string
	fmt.Fprintf(os.Stdout, "Response from `DataResourcesAPI.ListDataResourcesNames`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListDataResourcesNamesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **string** | Prefix of data resource name | 
 **dataStoreId** | **string** |  | 

### Return type

**[]string**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RemoveResource

> RemoveResource200Response RemoveResource(ctx, dataResourceId).DataStoreId(dataStoreId).Execute()

Remove resource from Guardium Insights SaaS DSPM



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
	dataResourceId := "arn:aws:s3::12345678910:polar-security-corplex.xlsx" // string | Data resource ID
	dataStoreId := "arn:aws:s3::123456789101:mys3-prod" // string | Data store ID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataResourcesAPI.RemoveResource(context.Background(), dataResourceId).DataStoreId(dataStoreId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataResourcesAPI.RemoveResource``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RemoveResource`: RemoveResource200Response
	fmt.Fprintf(os.Stdout, "Response from `DataResourcesAPI.RemoveResource`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dataResourceId** | **string** | Data resource ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiRemoveResourceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **dataStoreId** | **string** | Data store ID | 

### Return type

[**RemoveResource200Response**](RemoveResource200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateResourceReviewStatus

> UpdateResourceReviewStatus200Response UpdateResourceReviewStatus(ctx, dataResourceId).UpdateResourceReviewBody(updateResourceReviewBody).Execute()

Set review status of a data resource



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
	dataResourceId := "dataResourceId_example" // string | Data resource id
	updateResourceReviewBody := *openapiclient.NewUpdateResourceReviewBody(false) // UpdateResourceReviewBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataResourcesAPI.UpdateResourceReviewStatus(context.Background(), dataResourceId).UpdateResourceReviewBody(updateResourceReviewBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataResourcesAPI.UpdateResourceReviewStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateResourceReviewStatus`: UpdateResourceReviewStatus200Response
	fmt.Fprintf(os.Stdout, "Response from `DataResourcesAPI.UpdateResourceReviewStatus`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dataResourceId** | **string** | Data resource id | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateResourceReviewStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateResourceReviewBody** | [**UpdateResourceReviewBody**](UpdateResourceReviewBody.md) |  | 

### Return type

[**UpdateResourceReviewStatus200Response**](UpdateResourceReviewStatus200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

