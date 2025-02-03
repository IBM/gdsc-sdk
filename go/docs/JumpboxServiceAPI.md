# \JumpboxServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**JumpboxServiceAuthorize**](JumpboxServiceAPI.md#JumpboxServiceAuthorize) | **Post** /api/v3/authorization | Summary: Authorize Description: Authenticate a user and return a JWT.
[**JumpboxServiceDeleteTenant**](JumpboxServiceAPI.md#JumpboxServiceDeleteTenant) | **Delete** /api/v3/tenants/{tenant_id} | Summary: Delete tenant Description: Delete a tenant.
[**JumpboxServiceDeleteUser**](JumpboxServiceAPI.md#JumpboxServiceDeleteUser) | **Delete** /api/v3/users/{user_id} | Summary: Delete user Description: Delete the user.
[**JumpboxServiceGetTenant**](JumpboxServiceAPI.md#JumpboxServiceGetTenant) | **Get** /api/v3/tenants/{tenant_id} | Summary: Get tenant Description: Get a tenant.
[**JumpboxServiceGetTenants**](JumpboxServiceAPI.md#JumpboxServiceGetTenants) | **Get** /api/v3/tenants | Summary: Get tenants Description: Get all tenant base on UID.
[**JumpboxServiceGetUsers**](JumpboxServiceAPI.md#JumpboxServiceGetUsers) | **Get** /api/v3/users | Summary: Get users Description: Get all users base on a tenantID.
[**JumpboxServicePostTenants**](JumpboxServiceAPI.md#JumpboxServicePostTenants) | **Post** /api/v3/tenants | Summary: Post tenants Description: Create a tenant.
[**JumpboxServicePostUsers**](JumpboxServiceAPI.md#JumpboxServicePostUsers) | **Post** /api/v3/users | Summary: Post users Description: Create users.
[**JumpboxServiceSearchUsers**](JumpboxServiceAPI.md#JumpboxServiceSearchUsers) | **Post** /api/v3/users/search | Summary: Search users Description: Search for all users matching the provided string.
[**JumpboxServiceTestUser**](JumpboxServiceAPI.md#JumpboxServiceTestUser) | **Post** /api/v3/users/test | Summary: Test user Description: Test a user lookup to a given LDAP.
[**JumpboxServiceUpdateTenant**](JumpboxServiceAPI.md#JumpboxServiceUpdateTenant) | **Patch** /api/v3/tenants/{tenant_id} | Summary: Update tenant Description: Update a tenant.
[**JumpboxServiceUpdateUsers**](JumpboxServiceAPI.md#JumpboxServiceUpdateUsers) | **Patch** /api/v3/users | Summary: Update users Description: Update an array of users.



## JumpboxServiceAuthorize

> Jumpboxv3AuthorizeResponse JumpboxServiceAuthorize(ctx).Jumpboxv3AuthorizeRequest(jumpboxv3AuthorizeRequest).Execute()

Summary: Authorize Description: Authenticate a user and return a JWT.

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
	jumpboxv3AuthorizeRequest := *openapiclient.NewJumpboxv3AuthorizeRequest() // Jumpboxv3AuthorizeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServiceAuthorize(context.Background()).Jumpboxv3AuthorizeRequest(jumpboxv3AuthorizeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServiceAuthorize``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServiceAuthorize`: Jumpboxv3AuthorizeResponse
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServiceAuthorize`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServiceAuthorizeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3AuthorizeRequest** | [**Jumpboxv3AuthorizeRequest**](Jumpboxv3AuthorizeRequest.md) |  | 

### Return type

[**Jumpboxv3AuthorizeResponse**](Jumpboxv3AuthorizeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## JumpboxServiceDeleteTenant

> map[string]interface{} JumpboxServiceDeleteTenant(ctx, tenantId).IsPermanentDelete(isPermanentDelete).Async(async).Execute()

Summary: Delete tenant Description: Delete a tenant.

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
	tenantId := "tenantId_example" // string | Tenant id.
	isPermanentDelete := true // bool | Delete tenant permanently if true. (optional)
	async := true // bool | Async. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServiceDeleteTenant(context.Background(), tenantId).IsPermanentDelete(isPermanentDelete).Async(async).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServiceDeleteTenant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServiceDeleteTenant`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServiceDeleteTenant`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**tenantId** | **string** | Tenant id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServiceDeleteTenantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **isPermanentDelete** | **bool** | Delete tenant permanently if true. | 
 **async** | **bool** | Async. | 

### Return type

**map[string]interface{}**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## JumpboxServiceDeleteUser

> map[string]interface{} JumpboxServiceDeleteUser(ctx, userId).Execute()

Summary: Delete user Description: Delete the user.

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
	userId := "userId_example" // string | The user id.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServiceDeleteUser(context.Background(), userId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServiceDeleteUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServiceDeleteUser`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServiceDeleteUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userId** | **string** | The user id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServiceDeleteUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## JumpboxServiceGetTenant

> Jumpboxv3GetTenantResponse JumpboxServiceGetTenant(ctx, tenantId).IncludeInactive(includeInactive).IncludeNotReady(includeNotReady).Execute()

Summary: Get tenant Description: Get a tenant.

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
	tenantId := "tenantId_example" // string | Tenant id.
	includeInactive := true // bool | Include inactive. (optional)
	includeNotReady := true // bool | Include tenants that are not ready(are in state of being created or deleted). (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServiceGetTenant(context.Background(), tenantId).IncludeInactive(includeInactive).IncludeNotReady(includeNotReady).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServiceGetTenant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServiceGetTenant`: Jumpboxv3GetTenantResponse
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServiceGetTenant`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**tenantId** | **string** | Tenant id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServiceGetTenantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **includeInactive** | **bool** | Include inactive. | 
 **includeNotReady** | **bool** | Include tenants that are not ready(are in state of being created or deleted). | 

### Return type

[**Jumpboxv3GetTenantResponse**](Jumpboxv3GetTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## JumpboxServiceGetTenants

> Jumpboxv3GetTenantsResponse JumpboxServiceGetTenants(ctx).Uid(uid).ExternalId(externalId).IncludeInactive(includeInactive).IncludeNotReady(includeNotReady).Execute()

Summary: Get tenants Description: Get all tenant base on UID.

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
	uid := "uid_example" // string | Email. (optional)
	externalId := "externalId_example" // string | External id. (optional)
	includeInactive := true // bool | Include inactive. (optional)
	includeNotReady := true // bool | Include tenants that are not ready(are in state of being created or deleted). (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServiceGetTenants(context.Background()).Uid(uid).ExternalId(externalId).IncludeInactive(includeInactive).IncludeNotReady(includeNotReady).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServiceGetTenants``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServiceGetTenants`: Jumpboxv3GetTenantsResponse
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServiceGetTenants`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServiceGetTenantsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **string** | Email. | 
 **externalId** | **string** | External id. | 
 **includeInactive** | **bool** | Include inactive. | 
 **includeNotReady** | **bool** | Include tenants that are not ready(are in state of being created or deleted). | 

### Return type

[**Jumpboxv3GetTenantsResponse**](Jumpboxv3GetTenantsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## JumpboxServiceGetUsers

> Tenantuserv3GetUsersResponse JumpboxServiceGetUsers(ctx).Uid(uid).Execute()

Summary: Get users Description: Get all users base on a tenantID.

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
	uid := "uid_example" // string | Email. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServiceGetUsers(context.Background()).Uid(uid).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServiceGetUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServiceGetUsers`: Tenantuserv3GetUsersResponse
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServiceGetUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServiceGetUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **string** | Email. | 

### Return type

[**Tenantuserv3GetUsersResponse**](Tenantuserv3GetUsersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## JumpboxServicePostTenants

> Jumpboxv3PostTenantsResponse JumpboxServicePostTenants(ctx).Jumpboxv3PostTenantsRequest(jumpboxv3PostTenantsRequest).Execute()

Summary: Post tenants Description: Create a tenant.

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
	jumpboxv3PostTenantsRequest := *openapiclient.NewJumpboxv3PostTenantsRequest() // Jumpboxv3PostTenantsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServicePostTenants(context.Background()).Jumpboxv3PostTenantsRequest(jumpboxv3PostTenantsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServicePostTenants``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServicePostTenants`: Jumpboxv3PostTenantsResponse
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServicePostTenants`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServicePostTenantsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3PostTenantsRequest** | [**Jumpboxv3PostTenantsRequest**](Jumpboxv3PostTenantsRequest.md) |  | 

### Return type

[**Jumpboxv3PostTenantsResponse**](Jumpboxv3PostTenantsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## JumpboxServicePostUsers

> Jumpboxv3PostUsersBulkResponse JumpboxServicePostUsers(ctx).Jumpboxv3PostUsersBulkRequest(jumpboxv3PostUsersBulkRequest).Execute()

Summary: Post users Description: Create users.

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
	jumpboxv3PostUsersBulkRequest := *openapiclient.NewJumpboxv3PostUsersBulkRequest() // Jumpboxv3PostUsersBulkRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServicePostUsers(context.Background()).Jumpboxv3PostUsersBulkRequest(jumpboxv3PostUsersBulkRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServicePostUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServicePostUsers`: Jumpboxv3PostUsersBulkResponse
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServicePostUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServicePostUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3PostUsersBulkRequest** | [**Jumpboxv3PostUsersBulkRequest**](Jumpboxv3PostUsersBulkRequest.md) |  | 

### Return type

[**Jumpboxv3PostUsersBulkResponse**](Jumpboxv3PostUsersBulkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## JumpboxServiceSearchUsers

> Jumpboxv3SearchUsersResponse JumpboxServiceSearchUsers(ctx).Jumpboxv3SearchUsersRequest(jumpboxv3SearchUsersRequest).Execute()

Summary: Search users Description: Search for all users matching the provided string.

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
	jumpboxv3SearchUsersRequest := *openapiclient.NewJumpboxv3SearchUsersRequest() // Jumpboxv3SearchUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServiceSearchUsers(context.Background()).Jumpboxv3SearchUsersRequest(jumpboxv3SearchUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServiceSearchUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServiceSearchUsers`: Jumpboxv3SearchUsersResponse
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServiceSearchUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServiceSearchUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3SearchUsersRequest** | [**Jumpboxv3SearchUsersRequest**](Jumpboxv3SearchUsersRequest.md) |  | 

### Return type

[**Jumpboxv3SearchUsersResponse**](Jumpboxv3SearchUsersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## JumpboxServiceTestUser

> Jumpboxv3TestUserResponse JumpboxServiceTestUser(ctx).Jumpboxv3TestUserRequest(jumpboxv3TestUserRequest).Execute()

Summary: Test user Description: Test a user lookup to a given LDAP.

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
	jumpboxv3TestUserRequest := *openapiclient.NewJumpboxv3TestUserRequest() // Jumpboxv3TestUserRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServiceTestUser(context.Background()).Jumpboxv3TestUserRequest(jumpboxv3TestUserRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServiceTestUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServiceTestUser`: Jumpboxv3TestUserResponse
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServiceTestUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServiceTestUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3TestUserRequest** | [**Jumpboxv3TestUserRequest**](Jumpboxv3TestUserRequest.md) |  | 

### Return type

[**Jumpboxv3TestUserResponse**](Jumpboxv3TestUserResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## JumpboxServiceUpdateTenant

> Jumpboxv3UpdateTenantResponse JumpboxServiceUpdateTenant(ctx, tenantId).Jumpboxv3UpdateTenantRequest(jumpboxv3UpdateTenantRequest).Execute()

Summary: Update tenant Description: Update a tenant.

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
	tenantId := "tenantId_example" // string | Tenant id.
	jumpboxv3UpdateTenantRequest := *openapiclient.NewJumpboxv3UpdateTenantRequest() // Jumpboxv3UpdateTenantRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServiceUpdateTenant(context.Background(), tenantId).Jumpboxv3UpdateTenantRequest(jumpboxv3UpdateTenantRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServiceUpdateTenant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServiceUpdateTenant`: Jumpboxv3UpdateTenantResponse
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServiceUpdateTenant`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**tenantId** | **string** | Tenant id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServiceUpdateTenantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **jumpboxv3UpdateTenantRequest** | [**Jumpboxv3UpdateTenantRequest**](Jumpboxv3UpdateTenantRequest.md) |  | 

### Return type

[**Jumpboxv3UpdateTenantResponse**](Jumpboxv3UpdateTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## JumpboxServiceUpdateUsers

> Jumpboxv3UpdateUsersBulkResponse JumpboxServiceUpdateUsers(ctx).Jumpboxv3UpdateUsersBulkRequest(jumpboxv3UpdateUsersBulkRequest).Execute()

Summary: Update users Description: Update an array of users.

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
	jumpboxv3UpdateUsersBulkRequest := *openapiclient.NewJumpboxv3UpdateUsersBulkRequest() // Jumpboxv3UpdateUsersBulkRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServiceUpdateUsers(context.Background()).Jumpboxv3UpdateUsersBulkRequest(jumpboxv3UpdateUsersBulkRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServiceUpdateUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServiceUpdateUsers`: Jumpboxv3UpdateUsersBulkResponse
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServiceUpdateUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiJumpboxServiceUpdateUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3UpdateUsersBulkRequest** | [**Jumpboxv3UpdateUsersBulkRequest**](Jumpboxv3UpdateUsersBulkRequest.md) |  | 

### Return type

[**Jumpboxv3UpdateUsersBulkResponse**](Jumpboxv3UpdateUsersBulkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

