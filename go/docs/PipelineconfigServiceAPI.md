# \PipelineconfigServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PipelineconfigServiceDeleteTenantResources**](PipelineconfigServiceAPI.md#PipelineconfigServiceDeleteTenantResources) | **Delete** /api/v3/resources/{tenant_id}/{resource} | Summary: Delete a tenant resource Description: Delete tenant specific resources such as db2, mongo, postgres and s3.



## PipelineconfigServiceDeleteTenantResources

> Pipelineconfigv3DeleteTenantResponse PipelineconfigServiceDeleteTenantResources(ctx, tenantId, resource).Execute()

Summary: Delete a tenant resource Description: Delete tenant specific resources such as db2, mongo, postgres and s3.

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
	tenantId := "tenantId_example" // string | unique tenant ID
	resource := "resource_example" // string | resource specifies the specific resource to delete

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PipelineconfigServiceAPI.PipelineconfigServiceDeleteTenantResources(context.Background(), tenantId, resource).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PipelineconfigServiceAPI.PipelineconfigServiceDeleteTenantResources``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PipelineconfigServiceDeleteTenantResources`: Pipelineconfigv3DeleteTenantResponse
	fmt.Fprintf(os.Stdout, "Response from `PipelineconfigServiceAPI.PipelineconfigServiceDeleteTenantResources`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**tenantId** | **string** | unique tenant ID | 
**resource** | **string** | resource specifies the specific resource to delete | 

### Other Parameters

Other parameters are passed through a pointer to a apiPipelineconfigServiceDeleteTenantResourcesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Pipelineconfigv3DeleteTenantResponse**](Pipelineconfigv3DeleteTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

