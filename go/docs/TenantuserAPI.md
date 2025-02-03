# \TenantuserAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TenantuserCreateAPIKey**](TenantuserAPI.md#TenantuserCreateAPIKey) | **Post** /api/v3/apikeys | Summary: Create API key Description: Create API Key.
[**TenantuserDeleteAPIKey**](TenantuserAPI.md#TenantuserDeleteAPIKey) | **Delete** /api/v3/apikeys/{id} | Summary: Delete API key Description: Delete APIKey Document based on the document id.
[**TenantuserDeleteRole**](TenantuserAPI.md#TenantuserDeleteRole) | **Delete** /api/v3/roles/{role_id} | Summary: Delete role Description: Delete a role.
[**TenantuserGetAPIKeys**](TenantuserAPI.md#TenantuserGetAPIKeys) | **Get** /api/v3/apikeys | Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
[**TenantuserGetCurrentUser**](TenantuserAPI.md#TenantuserGetCurrentUser) | **Get** /api/v3/currentuser | Summary: Get current user Description: Return the currently authenticated user.
[**TenantuserGetPrivilege**](TenantuserAPI.md#TenantuserGetPrivilege) | **Get** /api/v3/privileges/{privilege.privilege_id} | Summary: Get privilege Description: Return privilege.
[**TenantuserGetPrivileges**](TenantuserAPI.md#TenantuserGetPrivileges) | **Get** /api/v3/privileges | Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
[**TenantuserGetRole**](TenantuserAPI.md#TenantuserGetRole) | **Get** /api/v3/roles/{role_id} | Summary: Get role Description: Return single role.
[**TenantuserGetRoles**](TenantuserAPI.md#TenantuserGetRoles) | **Get** /api/v3/roles | Summary: Get roles Description: Return all roles without privileges.
[**TenantuserGetUser**](TenantuserAPI.md#TenantuserGetUser) | **Get** /api/v3/users/user/{user_id} | Summary: Get user Description: Return full user for specified user_id.
[**TenantuserGetUserNames**](TenantuserAPI.md#TenantuserGetUserNames) | **Post** /api/v3/users/names | Summary: Get user names Description: Get user names.
[**TenantuserGetUserTenant**](TenantuserAPI.md#TenantuserGetUserTenant) | **Get** /api/v3/users/tenant/{user_id} | Summary: Get user tenant Description: Return the user plus tenant information.
[**TenantuserPostPrivilegesBulk**](TenantuserAPI.md#TenantuserPostPrivilegesBulk) | **Post** /api/v3/privileges | Summary: Post privileges bulk Description: Perform bulk user add preivilege.
[**TenantuserPostRole**](TenantuserAPI.md#TenantuserPostRole) | **Post** /api/v3/roles | Summary: Post role Description: Create a new role.
[**TenantuserUpdatePrivilege**](TenantuserAPI.md#TenantuserUpdatePrivilege) | **Patch** /api/v3/privileges/{privilege_id} | Summary: Update privilege Description: Update privilege.
[**TenantuserUpdatePrivilegesRoleBulk**](TenantuserAPI.md#TenantuserUpdatePrivilegesRoleBulk) | **Patch** /api/v3/privileges | Summary: Update privileges role bulk Description: Perform bulk user update role.
[**TenantuserUpdateRole**](TenantuserAPI.md#TenantuserUpdateRole) | **Patch** /api/v3/roles/{role_id} | Summary: Update role Description: Update single role.
[**TenantuserUpdateUserRoleBulk**](TenantuserAPI.md#TenantuserUpdateUserRoleBulk) | **Patch** /api/v3/users/role | Summary: Update user role bulk Description: Perform bulk user add or remove role.



## TenantuserCreateAPIKey

> Tenantuserv3CreateApiKeyResponse TenantuserCreateAPIKey(ctx).Tenantuserv3CreateApiKeyRequest(tenantuserv3CreateApiKeyRequest).Execute()

Summary: Create API key Description: Create API Key.

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
	tenantuserv3CreateApiKeyRequest := *openapiclient.NewTenantuserv3CreateApiKeyRequest() // Tenantuserv3CreateApiKeyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserCreateAPIKey(context.Background()).Tenantuserv3CreateApiKeyRequest(tenantuserv3CreateApiKeyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserCreateAPIKey``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserCreateAPIKey`: Tenantuserv3CreateApiKeyResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserCreateAPIKey`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserCreateAPIKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3CreateApiKeyRequest** | [**Tenantuserv3CreateApiKeyRequest**](Tenantuserv3CreateApiKeyRequest.md) |  | 

### Return type

[**Tenantuserv3CreateApiKeyResponse**](Tenantuserv3CreateApiKeyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserDeleteAPIKey

> map[string]interface{} TenantuserDeleteAPIKey(ctx, id).Execute()

Summary: Delete API key Description: Delete APIKey Document based on the document id.

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
	id := "id_example" // string | Apikey id.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserDeleteAPIKey(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserDeleteAPIKey``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserDeleteAPIKey`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserDeleteAPIKey`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | Apikey id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserDeleteAPIKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


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


## TenantuserDeleteRole

> map[string]interface{} TenantuserDeleteRole(ctx, roleId).Execute()

Summary: Delete role Description: Delete a role.

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
	roleId := "roleId_example" // string | ID or role deleted.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserDeleteRole(context.Background(), roleId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserDeleteRole``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserDeleteRole`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserDeleteRole`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**roleId** | **string** | ID or role deleted. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserDeleteRoleRequest struct via the builder pattern


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


## TenantuserGetAPIKeys

> Tenantuserv3GetApiKeysResponse TenantuserGetAPIKeys(ctx).Execute()

Summary: Get API keys Description: Get all APIKeys base on a tenant ID.

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
	resp, r, err := apiClient.TenantuserAPI.TenantuserGetAPIKeys(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserGetAPIKeys``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserGetAPIKeys`: Tenantuserv3GetApiKeysResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserGetAPIKeys`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserGetAPIKeysRequest struct via the builder pattern


### Return type

[**Tenantuserv3GetApiKeysResponse**](Tenantuserv3GetApiKeysResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserGetCurrentUser

> Tenantuserv3GetCurrentUserResponse TenantuserGetCurrentUser(ctx).Execute()

Summary: Get current user Description: Return the currently authenticated user.

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
	resp, r, err := apiClient.TenantuserAPI.TenantuserGetCurrentUser(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserGetCurrentUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserGetCurrentUser`: Tenantuserv3GetCurrentUserResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserGetCurrentUser`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserGetCurrentUserRequest struct via the builder pattern


### Return type

[**Tenantuserv3GetCurrentUserResponse**](Tenantuserv3GetCurrentUserResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserGetPrivilege

> Tenantuserv3GetPrivilegeResponse TenantuserGetPrivilege(ctx, privilegePrivilegeId).PrivilegeType(privilegeType).Execute()

Summary: Get privilege Description: Return privilege.

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
	privilegePrivilegeId := "privilegePrivilegeId_example" // string | Privilege ID.
	privilegeType := "privilegeType_example" // string | Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserGetPrivilege(context.Background(), privilegePrivilegeId).PrivilegeType(privilegeType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserGetPrivilege``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserGetPrivilege`: Tenantuserv3GetPrivilegeResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserGetPrivilege`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**privilegePrivilegeId** | **string** | Privilege ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserGetPrivilegeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **privilegeType** | **string** | Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. | 

### Return type

[**Tenantuserv3GetPrivilegeResponse**](Tenantuserv3GetPrivilegeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserGetPrivileges

> Tenantuserv3GetPrivilegesResponse TenantuserGetPrivileges(ctx).Roles(roles).Type_(type_).Execute()

Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.

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
	roles := []string{"Inner_example"} // []string | If empty, will return all privileges. (optional)
	type_ := "type__example" // string | Type of privilege to return: group, page, permission, report, restapi, etc. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserGetPrivileges(context.Background()).Roles(roles).Type_(type_).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserGetPrivileges``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserGetPrivileges`: Tenantuserv3GetPrivilegesResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserGetPrivileges`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserGetPrivilegesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roles** | **[]string** | If empty, will return all privileges. | 
 **type_** | **string** | Type of privilege to return: group, page, permission, report, restapi, etc. | 

### Return type

[**Tenantuserv3GetPrivilegesResponse**](Tenantuserv3GetPrivilegesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserGetRole

> Tenantuserv3Role TenantuserGetRole(ctx, roleId).Execute()

Summary: Get role Description: Return single role.

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
	roleId := "roleId_example" // string | ID of role to be returned.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserGetRole(context.Background(), roleId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserGetRole``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserGetRole`: Tenantuserv3Role
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserGetRole`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**roleId** | **string** | ID of role to be returned. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserGetRoleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Tenantuserv3Role**](Tenantuserv3Role.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserGetRoles

> Tenantuserv3GetRolesResponse TenantuserGetRoles(ctx).Execute()

Summary: Get roles Description: Return all roles without privileges.

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
	resp, r, err := apiClient.TenantuserAPI.TenantuserGetRoles(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserGetRoles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserGetRoles`: Tenantuserv3GetRolesResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserGetRoles`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserGetRolesRequest struct via the builder pattern


### Return type

[**Tenantuserv3GetRolesResponse**](Tenantuserv3GetRolesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserGetUser

> Tenantuserv3GetUserResponse TenantuserGetUser(ctx, userId).Execute()

Summary: Get user Description: Return full user for specified user_id.

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
	userId := "userId_example" // string | User id defaults to the current user or specify \"current\" or an actual user id.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserGetUser(context.Background(), userId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserGetUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserGetUser`: Tenantuserv3GetUserResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserGetUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userId** | **string** | User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserGetUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Tenantuserv3GetUserResponse**](Tenantuserv3GetUserResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserGetUserNames

> Tenantuserv3GetUserNamesResponse TenantuserGetUserNames(ctx).Tenantuserv3GetUserNamesRequest(tenantuserv3GetUserNamesRequest).Execute()

Summary: Get user names Description: Get user names.

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
	tenantuserv3GetUserNamesRequest := *openapiclient.NewTenantuserv3GetUserNamesRequest() // Tenantuserv3GetUserNamesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserGetUserNames(context.Background()).Tenantuserv3GetUserNamesRequest(tenantuserv3GetUserNamesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserGetUserNames``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserGetUserNames`: Tenantuserv3GetUserNamesResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserGetUserNames`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserGetUserNamesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3GetUserNamesRequest** | [**Tenantuserv3GetUserNamesRequest**](Tenantuserv3GetUserNamesRequest.md) |  | 

### Return type

[**Tenantuserv3GetUserNamesResponse**](Tenantuserv3GetUserNamesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserGetUserTenant

> Tenantuserv3GetUserTenantResponse TenantuserGetUserTenant(ctx, userId).Execute()

Summary: Get user tenant Description: Return the user plus tenant information.

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
	userId := "userId_example" // string | User id defaults to the current user or specify \"current\" or an actual user id.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserGetUserTenant(context.Background(), userId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserGetUserTenant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserGetUserTenant`: Tenantuserv3GetUserTenantResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserGetUserTenant`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userId** | **string** | User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserGetUserTenantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Tenantuserv3GetUserTenantResponse**](Tenantuserv3GetUserTenantResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserPostPrivilegesBulk

> Tenantuserv3PostPrivilegesBulkResponse TenantuserPostPrivilegesBulk(ctx).Tenantuserv3PostPrivilegesBulkRequest(tenantuserv3PostPrivilegesBulkRequest).Execute()

Summary: Post privileges bulk Description: Perform bulk user add preivilege.

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
	tenantuserv3PostPrivilegesBulkRequest := *openapiclient.NewTenantuserv3PostPrivilegesBulkRequest() // Tenantuserv3PostPrivilegesBulkRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserPostPrivilegesBulk(context.Background()).Tenantuserv3PostPrivilegesBulkRequest(tenantuserv3PostPrivilegesBulkRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserPostPrivilegesBulk``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserPostPrivilegesBulk`: Tenantuserv3PostPrivilegesBulkResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserPostPrivilegesBulk`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserPostPrivilegesBulkRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3PostPrivilegesBulkRequest** | [**Tenantuserv3PostPrivilegesBulkRequest**](Tenantuserv3PostPrivilegesBulkRequest.md) |  | 

### Return type

[**Tenantuserv3PostPrivilegesBulkResponse**](Tenantuserv3PostPrivilegesBulkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserPostRole

> Tenantuserv3PostRoleResponse TenantuserPostRole(ctx).Tenantuserv3PostRoleRequest(tenantuserv3PostRoleRequest).Execute()

Summary: Post role Description: Create a new role.

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
	tenantuserv3PostRoleRequest := *openapiclient.NewTenantuserv3PostRoleRequest() // Tenantuserv3PostRoleRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserPostRole(context.Background()).Tenantuserv3PostRoleRequest(tenantuserv3PostRoleRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserPostRole``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserPostRole`: Tenantuserv3PostRoleResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserPostRole`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserPostRoleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3PostRoleRequest** | [**Tenantuserv3PostRoleRequest**](Tenantuserv3PostRoleRequest.md) |  | 

### Return type

[**Tenantuserv3PostRoleResponse**](Tenantuserv3PostRoleResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserUpdatePrivilege

> Tenantuserv3UpdatePrivilegeResponse TenantuserUpdatePrivilege(ctx, privilegeId).Tenantuserv3UpdatePrivilegeRequest(tenantuserv3UpdatePrivilegeRequest).Execute()

Summary: Update privilege Description: Update privilege.

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
	privilegeId := "privilegeId_example" // string | Permanent id of the privilege to be updated or created.
	tenantuserv3UpdatePrivilegeRequest := *openapiclient.NewTenantuserv3UpdatePrivilegeRequest() // Tenantuserv3UpdatePrivilegeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserUpdatePrivilege(context.Background(), privilegeId).Tenantuserv3UpdatePrivilegeRequest(tenantuserv3UpdatePrivilegeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserUpdatePrivilege``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserUpdatePrivilege`: Tenantuserv3UpdatePrivilegeResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserUpdatePrivilege`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**privilegeId** | **string** | Permanent id of the privilege to be updated or created. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserUpdatePrivilegeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **tenantuserv3UpdatePrivilegeRequest** | [**Tenantuserv3UpdatePrivilegeRequest**](Tenantuserv3UpdatePrivilegeRequest.md) |  | 

### Return type

[**Tenantuserv3UpdatePrivilegeResponse**](Tenantuserv3UpdatePrivilegeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserUpdatePrivilegesRoleBulk

> Tenantuserv3UpdatePrivilegesBulkResponse TenantuserUpdatePrivilegesRoleBulk(ctx).Tenantuserv3UpdatePrivilegesBulkRequest(tenantuserv3UpdatePrivilegesBulkRequest).Execute()

Summary: Update privileges role bulk Description: Perform bulk user update role.

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
	tenantuserv3UpdatePrivilegesBulkRequest := *openapiclient.NewTenantuserv3UpdatePrivilegesBulkRequest() // Tenantuserv3UpdatePrivilegesBulkRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserUpdatePrivilegesRoleBulk(context.Background()).Tenantuserv3UpdatePrivilegesBulkRequest(tenantuserv3UpdatePrivilegesBulkRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserUpdatePrivilegesRoleBulk``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserUpdatePrivilegesRoleBulk`: Tenantuserv3UpdatePrivilegesBulkResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserUpdatePrivilegesRoleBulk`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserUpdatePrivilegesRoleBulkRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3UpdatePrivilegesBulkRequest** | [**Tenantuserv3UpdatePrivilegesBulkRequest**](Tenantuserv3UpdatePrivilegesBulkRequest.md) |  | 

### Return type

[**Tenantuserv3UpdatePrivilegesBulkResponse**](Tenantuserv3UpdatePrivilegesBulkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserUpdateRole

> Tenantuserv3UpdateRoleResponse TenantuserUpdateRole(ctx, roleId).Tenantuserv3UpdateRoleRequest(tenantuserv3UpdateRoleRequest).Execute()

Summary: Update role Description: Update single role.

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
	roleId := "roleId_example" // string | Permanent id of the role.
	tenantuserv3UpdateRoleRequest := *openapiclient.NewTenantuserv3UpdateRoleRequest() // Tenantuserv3UpdateRoleRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserUpdateRole(context.Background(), roleId).Tenantuserv3UpdateRoleRequest(tenantuserv3UpdateRoleRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserUpdateRole``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserUpdateRole`: Tenantuserv3UpdateRoleResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserUpdateRole`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**roleId** | **string** | Permanent id of the role. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserUpdateRoleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **tenantuserv3UpdateRoleRequest** | [**Tenantuserv3UpdateRoleRequest**](Tenantuserv3UpdateRoleRequest.md) |  | 

### Return type

[**Tenantuserv3UpdateRoleResponse**](Tenantuserv3UpdateRoleResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TenantuserUpdateUserRoleBulk

> Tenantuserv3UpdateUserRoleBulkResponse TenantuserUpdateUserRoleBulk(ctx).Tenantuserv3UpdateUserRoleBulkRequest(tenantuserv3UpdateUserRoleBulkRequest).Execute()

Summary: Update user role bulk Description: Perform bulk user add or remove role.

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
	tenantuserv3UpdateUserRoleBulkRequest := *openapiclient.NewTenantuserv3UpdateUserRoleBulkRequest() // Tenantuserv3UpdateUserRoleBulkRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TenantuserAPI.TenantuserUpdateUserRoleBulk(context.Background()).Tenantuserv3UpdateUserRoleBulkRequest(tenantuserv3UpdateUserRoleBulkRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TenantuserAPI.TenantuserUpdateUserRoleBulk``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TenantuserUpdateUserRoleBulk`: Tenantuserv3UpdateUserRoleBulkResponse
	fmt.Fprintf(os.Stdout, "Response from `TenantuserAPI.TenantuserUpdateUserRoleBulk`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTenantuserUpdateUserRoleBulkRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3UpdateUserRoleBulkRequest** | [**Tenantuserv3UpdateUserRoleBulkRequest**](Tenantuserv3UpdateUserRoleBulkRequest.md) |  | 

### Return type

[**Tenantuserv3UpdateUserRoleBulkResponse**](Tenantuserv3UpdateUserRoleBulkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

