# \ThirdPartyVendorsAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetLinkedVendor**](ThirdPartyVendorsAPI.md#GetLinkedVendor) | **Get** /api/v1/dspm/linkedVendors/{vendorId}/cloudAccounts | Get additional details of a specific third party vendor
[**GetSingleLinkedVendor**](ThirdPartyVendorsAPI.md#GetSingleLinkedVendor) | **Get** /api/v1/dspm/linkedVendors/{vendorId} | Get the third party vendors list
[**ListLinkedVendorDataStores**](ThirdPartyVendorsAPI.md#ListLinkedVendorDataStores) | **Get** /api/v1/dspm/linkedVendors/{vendorId}/dataStores | Get the data stores associated with a third party vendor
[**ListLinkedVendors**](ThirdPartyVendorsAPI.md#ListLinkedVendors) | **Get** /api/v1/dspm/linkedVendors | Get the summary of a third party vendor
[**ListTrustedAssets**](ThirdPartyVendorsAPI.md#ListTrustedAssets) | **Get** /api/v1/dspm/linkedVendors/trustedAssets | Get a list of all the actual trusted assets



## GetLinkedVendor

> []VendorSummary GetLinkedVendor(ctx, vendorId).Execute()

Get additional details of a specific third party vendor



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
	vendorId := "123456789101" // string | The third party vendor's account ID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ThirdPartyVendorsAPI.GetLinkedVendor(context.Background(), vendorId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ThirdPartyVendorsAPI.GetLinkedVendor``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetLinkedVendor`: []VendorSummary
	fmt.Fprintf(os.Stdout, "Response from `ThirdPartyVendorsAPI.GetLinkedVendor`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vendorId** | **string** | The third party vendor&#39;s account ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetLinkedVendorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**[]VendorSummary**](VendorSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSingleLinkedVendor

> LinkedVendor GetSingleLinkedVendor(ctx, vendorId).Execute()

Get the third party vendors list



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
	vendorId := "123456789101" // string | vendor id

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ThirdPartyVendorsAPI.GetSingleLinkedVendor(context.Background(), vendorId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ThirdPartyVendorsAPI.GetSingleLinkedVendor``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetSingleLinkedVendor`: LinkedVendor
	fmt.Fprintf(os.Stdout, "Response from `ThirdPartyVendorsAPI.GetSingleLinkedVendor`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vendorId** | **string** | vendor id | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetSingleLinkedVendorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**LinkedVendor**](LinkedVendor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListLinkedVendorDataStores

> ListLinkedVendorDataStores200Response ListLinkedVendorDataStores(ctx, vendorId).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()

Get the data stores associated with a third party vendor



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
	vendorId := "123456789101" // string | The third party vendor's account ID
	filter := *openapiclient.NewListVendorDataStoresFilterParameter() // ListVendorDataStoresFilterParameter |  (optional)
	sort := *openapiclient.NewListLinkedVendorDataStoresSortParameter("SortBy_example") // ListLinkedVendorDataStoresSortParameter |  (optional)
	pageSize := float32(8.14) // float32 |  (optional)
	nextToken := "nextToken_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ThirdPartyVendorsAPI.ListLinkedVendorDataStores(context.Background(), vendorId).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ThirdPartyVendorsAPI.ListLinkedVendorDataStores``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListLinkedVendorDataStores`: ListLinkedVendorDataStores200Response
	fmt.Fprintf(os.Stdout, "Response from `ThirdPartyVendorsAPI.ListLinkedVendorDataStores`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vendorId** | **string** | The third party vendor&#39;s account ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiListLinkedVendorDataStoresRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **filter** | [**ListVendorDataStoresFilterParameter**](ListVendorDataStoresFilterParameter.md) |  | 
 **sort** | [**ListLinkedVendorDataStoresSortParameter**](ListLinkedVendorDataStoresSortParameter.md) |  | 
 **pageSize** | **float32** |  | 
 **nextToken** | **string** |  | 

### Return type

[**ListLinkedVendorDataStores200Response**](ListLinkedVendorDataStores200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListLinkedVendors

> []LinkedVendor ListLinkedVendors(ctx).Execute()

Get the summary of a third party vendor



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
	resp, r, err := apiClient.ThirdPartyVendorsAPI.ListLinkedVendors(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ThirdPartyVendorsAPI.ListLinkedVendors``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListLinkedVendors`: []LinkedVendor
	fmt.Fprintf(os.Stdout, "Response from `ThirdPartyVendorsAPI.ListLinkedVendors`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiListLinkedVendorsRequest struct via the builder pattern


### Return type

[**[]LinkedVendor**](LinkedVendor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListTrustedAssets

> []Trustee ListTrustedAssets(ctx).Filter(filter).Execute()

Get a list of all the actual trusted assets



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
	filter := *openapiclient.NewListTrusteesFilterParameter() // ListTrusteesFilterParameter |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ThirdPartyVendorsAPI.ListTrustedAssets(context.Background()).Filter(filter).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ThirdPartyVendorsAPI.ListTrustedAssets``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListTrustedAssets`: []Trustee
	fmt.Fprintf(os.Stdout, "Response from `ThirdPartyVendorsAPI.ListTrustedAssets`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListTrustedAssetsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListTrusteesFilterParameter**](ListTrusteesFilterParameter.md) |  | 

### Return type

[**[]Trustee**](Trustee.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

