# \DataStoresAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDataStore**](DataStoresAPI.md#GetDataStore) | **Get** /api/v1/dspm/dataStores/{dataStoreId} | Get a data store by its ID
[**GetDataStoresSummary**](DataStoresAPI.md#GetDataStoresSummary) | **Get** /api/v1/dspm/dataStores/summary | Get summary of data stores
[**ListAllDataStoresLabels**](DataStoresAPI.md#ListAllDataStoresLabels) | **Get** /api/v1/dspm/dataStores/labels | List labels of data stores.
[**ListDataStores**](DataStoresAPI.md#ListDataStores) | **Get** /api/v1/dspm/dataStores | List data stores
[**ListDataStoresCloudTagsKeys**](DataStoresAPI.md#ListDataStoresCloudTagsKeys) | **Get** /api/v1/dspm/dataStores/cloudTags/keys | List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
[**ListDataStoresCloudTagsValues**](DataStoresAPI.md#ListDataStoresCloudTagsValues) | **Get** /api/v1/dspm/dataStores/cloudTags/values | List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
[**ListDataStoresNames**](DataStoresAPI.md#ListDataStoresNames) | **Get** /api/v1/dspm/dataStores/filters/name | List name of filterable data stores
[**RescanDataStore**](DataStoresAPI.md#RescanDataStore) | **Post** /api/v1/dspm/dataStores/rescan | Post data store rescan request
[**SetDataStoreLabel**](DataStoresAPI.md#SetDataStoreLabel) | **Put** /api/v1/dspm/dataStores/{dataStoreId}/labels | Label a data store with an existing or new label
[**UpdateDatastoreCustodian**](DataStoresAPI.md#UpdateDatastoreCustodian) | **Post** /api/v1/dspm/dataStores/custodian | Update the name of a Data store custodian



## GetDataStore

> DataStore GetDataStore(ctx, dataStoreId).Execute()

Get a data store by its ID



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
	dataStoreId := "arn:aws:s3::123456789101:mys3-prod" // string | ID of the data store

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataStoresAPI.GetDataStore(context.Background(), dataStoreId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataStoresAPI.GetDataStore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetDataStore`: DataStore
	fmt.Fprintf(os.Stdout, "Response from `DataStoresAPI.GetDataStore`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dataStoreId** | **string** | ID of the data store | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetDataStoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**DataStore**](DataStore.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetDataStoresSummary

> DataStoresSummary GetDataStoresSummary(ctx).Filter(filter).Execute()

Get summary of data stores



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
	filter := *openapiclient.NewListDataStoresFilterParameter() // ListDataStoresFilterParameter |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataStoresAPI.GetDataStoresSummary(context.Background()).Filter(filter).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataStoresAPI.GetDataStoresSummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetDataStoresSummary`: DataStoresSummary
	fmt.Fprintf(os.Stdout, "Response from `DataStoresAPI.GetDataStoresSummary`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetDataStoresSummaryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListDataStoresFilterParameter**](ListDataStoresFilterParameter.md) |  | 

### Return type

[**DataStoresSummary**](DataStoresSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListAllDataStoresLabels

> []string ListAllDataStoresLabels(ctx).Prefix(prefix).MaxResults(maxResults).Execute()

List labels of data stores.



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
	prefix := "test" // string | Prefix of data store label (optional)
	maxResults := float32(10) // float32 |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataStoresAPI.ListAllDataStoresLabels(context.Background()).Prefix(prefix).MaxResults(maxResults).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataStoresAPI.ListAllDataStoresLabels``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListAllDataStoresLabels`: []string
	fmt.Fprintf(os.Stdout, "Response from `DataStoresAPI.ListAllDataStoresLabels`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListAllDataStoresLabelsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **string** | Prefix of data store label | 
 **maxResults** | **float32** |  | 

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


## ListDataStores

> ListDataStores200Response ListDataStores(ctx).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()

List data stores



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
	filter := *openapiclient.NewListDataStoresFilterParameter() // ListDataStoresFilterParameter |  (optional)
	sort := *openapiclient.NewListDataStoresSortParameter("SortBy_example") // ListDataStoresSortParameter |  (optional)
	pageSize := float32(8.14) // float32 |  (optional)
	nextToken := "nextToken_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataStoresAPI.ListDataStores(context.Background()).Filter(filter).Sort(sort).PageSize(pageSize).NextToken(nextToken).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataStoresAPI.ListDataStores``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListDataStores`: ListDataStores200Response
	fmt.Fprintf(os.Stdout, "Response from `DataStoresAPI.ListDataStores`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListDataStoresRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListDataStoresFilterParameter**](ListDataStoresFilterParameter.md) |  | 
 **sort** | [**ListDataStoresSortParameter**](ListDataStoresSortParameter.md) |  | 
 **pageSize** | **float32** |  | 
 **nextToken** | **string** |  | 

### Return type

[**ListDataStores200Response**](ListDataStores200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListDataStoresCloudTagsKeys

> []string ListDataStoresCloudTagsKeys(ctx).Prefix(prefix).MaxResults(maxResults).Execute()

List the cloud tag keys of data stores that can be filtered on the basis of prefixes.



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
	prefix := "environment" // string | Prefix of cloud tag key
	maxResults := float32(10) // float32 |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataStoresAPI.ListDataStoresCloudTagsKeys(context.Background()).Prefix(prefix).MaxResults(maxResults).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataStoresAPI.ListDataStoresCloudTagsKeys``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListDataStoresCloudTagsKeys`: []string
	fmt.Fprintf(os.Stdout, "Response from `DataStoresAPI.ListDataStoresCloudTagsKeys`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListDataStoresCloudTagsKeysRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **string** | Prefix of cloud tag key | 
 **maxResults** | **float32** |  | 

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


## ListDataStoresCloudTagsValues

> []string ListDataStoresCloudTagsValues(ctx).Prefix(prefix).TagKey(tagKey).MaxResults(maxResults).Execute()

List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.



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
	prefix := "comp" // string | Prefix of cloud tag value
	tagKey := "Production" // string | 
	maxResults := float32(10) // float32 |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataStoresAPI.ListDataStoresCloudTagsValues(context.Background()).Prefix(prefix).TagKey(tagKey).MaxResults(maxResults).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataStoresAPI.ListDataStoresCloudTagsValues``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListDataStoresCloudTagsValues`: []string
	fmt.Fprintf(os.Stdout, "Response from `DataStoresAPI.ListDataStoresCloudTagsValues`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListDataStoresCloudTagsValuesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **string** | Prefix of cloud tag value | 
 **tagKey** | **string** |  | 
 **maxResults** | **float32** |  | 

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


## ListDataStoresNames

> []string ListDataStoresNames(ctx).Prefix(prefix).Execute()

List name of filterable data stores



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
	prefix := "polar" // string | Prefix of data store name

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataStoresAPI.ListDataStoresNames(context.Background()).Prefix(prefix).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataStoresAPI.ListDataStoresNames``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListDataStoresNames`: []string
	fmt.Fprintf(os.Stdout, "Response from `DataStoresAPI.ListDataStoresNames`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListDataStoresNamesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **string** | Prefix of data store name | 

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


## RescanDataStore

> RescanDataStore(ctx).RescanDataStoreRequest(rescanDataStoreRequest).Execute()

Post data store rescan request



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
	rescanDataStoreRequest := *openapiclient.NewRescanDataStoreRequest("arn:aws:s3::123456789101:mys3-prod") // RescanDataStoreRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.DataStoresAPI.RescanDataStore(context.Background()).RescanDataStoreRequest(rescanDataStoreRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataStoresAPI.RescanDataStore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRescanDataStoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rescanDataStoreRequest** | [**RescanDataStoreRequest**](RescanDataStoreRequest.md) |  | 

### Return type

 (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SetDataStoreLabel

> SetDataStoreLabel(ctx, dataStoreId).SetDataStoreLabelRequest(setDataStoreLabelRequest).Execute()

Label a data store with an existing or new label



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
	dataStoreId := "arn:aws:s3::123456789101:mys3-prod" // string | Data store ID
	setDataStoreLabelRequest := *openapiclient.NewSetDataStoreLabelRequest("BI Team") // SetDataStoreLabelRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.DataStoresAPI.SetDataStoreLabel(context.Background(), dataStoreId).SetDataStoreLabelRequest(setDataStoreLabelRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataStoresAPI.SetDataStoreLabel``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dataStoreId** | **string** | Data store ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiSetDataStoreLabelRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **setDataStoreLabelRequest** | [**SetDataStoreLabelRequest**](SetDataStoreLabelRequest.md) |  | 

### Return type

 (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateDatastoreCustodian

> UpdateDatastoreCustodian200Response UpdateDatastoreCustodian(ctx).UpdateCustodianBody(updateCustodianBody).Execute()

Update the name of a Data store custodian



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
	updateCustodianBody := *openapiclient.NewUpdateCustodianBody("arn:aws:s3::123456789101:mys3-prod", "Avi") // UpdateCustodianBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataStoresAPI.UpdateDatastoreCustodian(context.Background()).UpdateCustodianBody(updateCustodianBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataStoresAPI.UpdateDatastoreCustodian``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateDatastoreCustodian`: UpdateDatastoreCustodian200Response
	fmt.Fprintf(os.Stdout, "Response from `DataStoresAPI.UpdateDatastoreCustodian`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUpdateDatastoreCustodianRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCustodianBody** | [**UpdateCustodianBody**](UpdateCustodianBody.md) |  | 

### Return type

[**UpdateDatastoreCustodian200Response**](UpdateDatastoreCustodian200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

