# \ComplianceAcceleratorAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ComplianceAcceleratorCreateWorkspace**](ComplianceAcceleratorAPI.md#ComplianceAcceleratorCreateWorkspace) | **Post** /api/v3/compliance/workspace | Summary: Create workspace Description: Create a workspace.
[**ComplianceAcceleratorDeleteComplianceWorkspaces**](ComplianceAcceleratorAPI.md#ComplianceAcceleratorDeleteComplianceWorkspaces) | **Delete** /api/v3/compliance | Summary: Delete compliance workspaces Description: Delete workspaces.
[**ComplianceAcceleratorGetComplianceInfo**](ComplianceAcceleratorAPI.md#ComplianceAcceleratorGetComplianceInfo) | **Get** /api/v3/compliance | Summary: Get compliance info Description: Return stored compliance data.
[**ComplianceAcceleratorHydrateWorkspace**](ComplianceAcceleratorAPI.md#ComplianceAcceleratorHydrateWorkspace) | **Post** /api/v3/compliance/workspace/hydrate | HydrateWorkspace - Hydrates specified objects within a workspace
[**ComplianceAcceleratorStoreComplianceInfo**](ComplianceAcceleratorAPI.md#ComplianceAcceleratorStoreComplianceInfo) | **Post** /api/v3/compliance | Summary: Store compliance info Description: Store compliance data.



## ComplianceAcceleratorCreateWorkspace

> StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse ComplianceAcceleratorCreateWorkspace(ctx).Complianceacceleratorv3CreateWorkspaceRequest(complianceacceleratorv3CreateWorkspaceRequest).Execute()

Summary: Create workspace Description: Create a workspace.

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
	complianceacceleratorv3CreateWorkspaceRequest := *openapiclient.NewComplianceacceleratorv3CreateWorkspaceRequest() // Complianceacceleratorv3CreateWorkspaceRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ComplianceAcceleratorAPI.ComplianceAcceleratorCreateWorkspace(context.Background()).Complianceacceleratorv3CreateWorkspaceRequest(complianceacceleratorv3CreateWorkspaceRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ComplianceAcceleratorAPI.ComplianceAcceleratorCreateWorkspace``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ComplianceAcceleratorCreateWorkspace`: StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse
	fmt.Fprintf(os.Stdout, "Response from `ComplianceAcceleratorAPI.ComplianceAcceleratorCreateWorkspace`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiComplianceAcceleratorCreateWorkspaceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3CreateWorkspaceRequest** | [**Complianceacceleratorv3CreateWorkspaceRequest**](Complianceacceleratorv3CreateWorkspaceRequest.md) |  | 

### Return type

[**StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse**](StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ComplianceAcceleratorDeleteComplianceWorkspaces

> Complianceacceleratorv3DeleteComplianceWorkspacesResponse ComplianceAcceleratorDeleteComplianceWorkspaces(ctx).Regulations(regulations).DeleteAll(deleteAll).Execute()

Summary: Delete compliance workspaces Description: Delete workspaces.

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
	regulations := []string{"Inner_example"} // []string | Id to be deleted. (optional)
	deleteAll := true // bool | if you want to delete a whole configuration. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ComplianceAcceleratorAPI.ComplianceAcceleratorDeleteComplianceWorkspaces(context.Background()).Regulations(regulations).DeleteAll(deleteAll).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ComplianceAcceleratorAPI.ComplianceAcceleratorDeleteComplianceWorkspaces``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ComplianceAcceleratorDeleteComplianceWorkspaces`: Complianceacceleratorv3DeleteComplianceWorkspacesResponse
	fmt.Fprintf(os.Stdout, "Response from `ComplianceAcceleratorAPI.ComplianceAcceleratorDeleteComplianceWorkspaces`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiComplianceAcceleratorDeleteComplianceWorkspacesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regulations** | **[]string** | Id to be deleted. | 
 **deleteAll** | **bool** | if you want to delete a whole configuration. | 

### Return type

[**Complianceacceleratorv3DeleteComplianceWorkspacesResponse**](Complianceacceleratorv3DeleteComplianceWorkspacesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ComplianceAcceleratorGetComplianceInfo

> Complianceacceleratorv3GetComplianceInfoResponse ComplianceAcceleratorGetComplianceInfo(ctx).Execute()

Summary: Get compliance info Description: Return stored compliance data.

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
	resp, r, err := apiClient.ComplianceAcceleratorAPI.ComplianceAcceleratorGetComplianceInfo(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ComplianceAcceleratorAPI.ComplianceAcceleratorGetComplianceInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ComplianceAcceleratorGetComplianceInfo`: Complianceacceleratorv3GetComplianceInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `ComplianceAcceleratorAPI.ComplianceAcceleratorGetComplianceInfo`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiComplianceAcceleratorGetComplianceInfoRequest struct via the builder pattern


### Return type

[**Complianceacceleratorv3GetComplianceInfoResponse**](Complianceacceleratorv3GetComplianceInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ComplianceAcceleratorHydrateWorkspace

> Complianceacceleratorv3HydrateComplianceWorkspacesResponse ComplianceAcceleratorHydrateWorkspace(ctx).Complianceacceleratorv3HydrateComplianceWorkspacesRequest(complianceacceleratorv3HydrateComplianceWorkspacesRequest).Execute()

HydrateWorkspace - Hydrates specified objects within a workspace

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
	complianceacceleratorv3HydrateComplianceWorkspacesRequest := *openapiclient.NewComplianceacceleratorv3HydrateComplianceWorkspacesRequest() // Complianceacceleratorv3HydrateComplianceWorkspacesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ComplianceAcceleratorAPI.ComplianceAcceleratorHydrateWorkspace(context.Background()).Complianceacceleratorv3HydrateComplianceWorkspacesRequest(complianceacceleratorv3HydrateComplianceWorkspacesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ComplianceAcceleratorAPI.ComplianceAcceleratorHydrateWorkspace``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ComplianceAcceleratorHydrateWorkspace`: Complianceacceleratorv3HydrateComplianceWorkspacesResponse
	fmt.Fprintf(os.Stdout, "Response from `ComplianceAcceleratorAPI.ComplianceAcceleratorHydrateWorkspace`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiComplianceAcceleratorHydrateWorkspaceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3HydrateComplianceWorkspacesRequest** | [**Complianceacceleratorv3HydrateComplianceWorkspacesRequest**](Complianceacceleratorv3HydrateComplianceWorkspacesRequest.md) |  | 

### Return type

[**Complianceacceleratorv3HydrateComplianceWorkspacesResponse**](Complianceacceleratorv3HydrateComplianceWorkspacesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ComplianceAcceleratorStoreComplianceInfo

> Complianceacceleratorv3StoreComplianceInfoResponse ComplianceAcceleratorStoreComplianceInfo(ctx).Complianceacceleratorv3StoreComplianceInfoRequest(complianceacceleratorv3StoreComplianceInfoRequest).Execute()

Summary: Store compliance info Description: Store compliance data.

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
	complianceacceleratorv3StoreComplianceInfoRequest := *openapiclient.NewComplianceacceleratorv3StoreComplianceInfoRequest() // Complianceacceleratorv3StoreComplianceInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ComplianceAcceleratorAPI.ComplianceAcceleratorStoreComplianceInfo(context.Background()).Complianceacceleratorv3StoreComplianceInfoRequest(complianceacceleratorv3StoreComplianceInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ComplianceAcceleratorAPI.ComplianceAcceleratorStoreComplianceInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ComplianceAcceleratorStoreComplianceInfo`: Complianceacceleratorv3StoreComplianceInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `ComplianceAcceleratorAPI.ComplianceAcceleratorStoreComplianceInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiComplianceAcceleratorStoreComplianceInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3StoreComplianceInfoRequest** | [**Complianceacceleratorv3StoreComplianceInfoRequest**](Complianceacceleratorv3StoreComplianceInfoRequest.md) |  | 

### Return type

[**Complianceacceleratorv3StoreComplianceInfoResponse**](Complianceacceleratorv3StoreComplianceInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

