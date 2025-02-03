# \DatabootstrapperServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DatabootstrapperServiceLoadData**](DatabootstrapperServiceAPI.md#DatabootstrapperServiceLoadData) | **Post** /api/v3/databootstrapper/data | Summary: Load data Description: Load data for a tenant.



## DatabootstrapperServiceLoadData

> Databootstrapperv3LoadDataResponse DatabootstrapperServiceLoadData(ctx).Databootstrapperv3LoadDataRequest(databootstrapperv3LoadDataRequest).Execute()

Summary: Load data Description: Load data for a tenant.

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
	databootstrapperv3LoadDataRequest := *openapiclient.NewDatabootstrapperv3LoadDataRequest() // Databootstrapperv3LoadDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DatabootstrapperServiceAPI.DatabootstrapperServiceLoadData(context.Background()).Databootstrapperv3LoadDataRequest(databootstrapperv3LoadDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatabootstrapperServiceAPI.DatabootstrapperServiceLoadData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DatabootstrapperServiceLoadData`: Databootstrapperv3LoadDataResponse
	fmt.Fprintf(os.Stdout, "Response from `DatabootstrapperServiceAPI.DatabootstrapperServiceLoadData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDatabootstrapperServiceLoadDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **databootstrapperv3LoadDataRequest** | [**Databootstrapperv3LoadDataRequest**](Databootstrapperv3LoadDataRequest.md) |  | 

### Return type

[**Databootstrapperv3LoadDataResponse**](Databootstrapperv3LoadDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

