# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**JumpboxServiceAuthorize**](JumpboxServiceApi.md#JumpboxServiceAuthorize) | **Post** /api/v3/authorization | Summary: Authorize Description: Authenticate a user and return a JWT.
[**JumpboxServiceDeleteTenant**](JumpboxServiceApi.md#JumpboxServiceDeleteTenant) | **Delete** /api/v3/tenants/{tenant_id} | Summary: Delete tenant Description: Delete a tenant.
[**JumpboxServiceDeleteUser**](JumpboxServiceApi.md#JumpboxServiceDeleteUser) | **Delete** /api/v3/users/{user_id} | Summary: Delete user Description: Delete the user.
[**JumpboxServiceGetTenant**](JumpboxServiceApi.md#JumpboxServiceGetTenant) | **Get** /api/v3/tenants/{tenant_id} | Summary: Get tenant Description: Get a tenant.
[**JumpboxServiceGetTenants**](JumpboxServiceApi.md#JumpboxServiceGetTenants) | **Get** /api/v3/tenants | Summary: Get tenants Description: Get all tenant base on UID.
[**JumpboxServiceGetUsers**](JumpboxServiceApi.md#JumpboxServiceGetUsers) | **Get** /api/v3/users | Summary: Get users Description: Get all users base on a tenantID.
[**JumpboxServicePostTenants**](JumpboxServiceApi.md#JumpboxServicePostTenants) | **Post** /api/v3/tenants | Summary: Post tenants Description: Create a tenant.
[**JumpboxServicePostUsers**](JumpboxServiceApi.md#JumpboxServicePostUsers) | **Post** /api/v3/users | Summary: Post users Description: Create users.
[**JumpboxServiceSearchUsers**](JumpboxServiceApi.md#JumpboxServiceSearchUsers) | **Post** /api/v3/users/search | Summary: Search users Description: Search for all users matching the provided string.
[**JumpboxServiceTestUser**](JumpboxServiceApi.md#JumpboxServiceTestUser) | **Post** /api/v3/users/test | Summary: Test user Description: Test a user lookup to a given LDAP.
[**JumpboxServiceUpdateTenant**](JumpboxServiceApi.md#JumpboxServiceUpdateTenant) | **Patch** /api/v3/tenants/{tenant_id} | Summary: Update tenant Description: Update a tenant.
[**JumpboxServiceUpdateUsers**](JumpboxServiceApi.md#JumpboxServiceUpdateUsers) | **Patch** /api/v3/users | Summary: Update users Description: Update an array of users.

# **JumpboxServiceAuthorize**
> Jumpboxv3AuthorizeResponse JumpboxServiceAuthorize(ctx, body)
Summary: Authorize Description: Authenticate a user and return a JWT.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Jumpboxv3AuthorizeRequest**](Jumpboxv3AuthorizeRequest.md)|  | 

### Return type

[**Jumpboxv3AuthorizeResponse**](jumpboxv3AuthorizeResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **JumpboxServiceDeleteTenant**
> Jumpboxv3DeleteTenantResponse JumpboxServiceDeleteTenant(ctx, tenantId, optional)
Summary: Delete tenant Description: Delete a tenant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **tenantId** | **string**| Tenant id. | 
 **optional** | ***JumpboxServiceApiJumpboxServiceDeleteTenantOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a JumpboxServiceApiJumpboxServiceDeleteTenantOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **isPermanentDelete** | **optional.Bool**| Delete tenant permanently if true. | 
 **async** | **optional.Bool**| Async. | 

### Return type

[**Jumpboxv3DeleteTenantResponse**](jumpboxv3DeleteTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **JumpboxServiceDeleteUser**
> Jumpboxv3DeleteUserResponse JumpboxServiceDeleteUser(ctx, userId)
Summary: Delete user Description: Delete the user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **userId** | **string**| The user id. | 

### Return type

[**Jumpboxv3DeleteUserResponse**](jumpboxv3DeleteUserResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **JumpboxServiceGetTenant**
> Jumpboxv3GetTenantResponse JumpboxServiceGetTenant(ctx, tenantId, optional)
Summary: Get tenant Description: Get a tenant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **tenantId** | **string**| Tenant id. | 
 **optional** | ***JumpboxServiceApiJumpboxServiceGetTenantOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a JumpboxServiceApiJumpboxServiceGetTenantOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **includeInactive** | **optional.Bool**| Include inactive. | 
 **includeNotReady** | **optional.Bool**| Include tenants that are not ready(are in state of being created or deleted). | 

### Return type

[**Jumpboxv3GetTenantResponse**](jumpboxv3GetTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **JumpboxServiceGetTenants**
> Jumpboxv3GetTenantsResponse JumpboxServiceGetTenants(ctx, optional)
Summary: Get tenants Description: Get all tenant base on UID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***JumpboxServiceApiJumpboxServiceGetTenantsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a JumpboxServiceApiJumpboxServiceGetTenantsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **optional.String**| Email. | 
 **externalId** | **optional.String**| External id. | 
 **includeInactive** | **optional.Bool**| Include inactive. | 
 **includeNotReady** | **optional.Bool**| Include tenants that are not ready(are in state of being created or deleted). | 

### Return type

[**Jumpboxv3GetTenantsResponse**](jumpboxv3GetTenantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **JumpboxServiceGetUsers**
> Tenantuserv3GetUsersResponse JumpboxServiceGetUsers(ctx, optional)
Summary: Get users Description: Get all users base on a tenantID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***JumpboxServiceApiJumpboxServiceGetUsersOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a JumpboxServiceApiJumpboxServiceGetUsersOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **optional.String**| Email. | 

### Return type

[**Tenantuserv3GetUsersResponse**](tenantuserv3GetUsersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **JumpboxServicePostTenants**
> Jumpboxv3PostTenantsResponse JumpboxServicePostTenants(ctx, body)
Summary: Post tenants Description: Create a tenant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Jumpboxv3PostTenantsRequest**](Jumpboxv3PostTenantsRequest.md)|  | 

### Return type

[**Jumpboxv3PostTenantsResponse**](jumpboxv3PostTenantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **JumpboxServicePostUsers**
> Jumpboxv3PostUsersBulkResponse JumpboxServicePostUsers(ctx, body)
Summary: Post users Description: Create users.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Jumpboxv3PostUsersBulkRequest**](Jumpboxv3PostUsersBulkRequest.md)|  | 

### Return type

[**Jumpboxv3PostUsersBulkResponse**](jumpboxv3PostUsersBulkResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **JumpboxServiceSearchUsers**
> Jumpboxv3SearchUsersResponse JumpboxServiceSearchUsers(ctx, body)
Summary: Search users Description: Search for all users matching the provided string.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Jumpboxv3SearchUsersRequest**](Jumpboxv3SearchUsersRequest.md)|  | 

### Return type

[**Jumpboxv3SearchUsersResponse**](jumpboxv3SearchUsersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **JumpboxServiceTestUser**
> Jumpboxv3TestUserResponse JumpboxServiceTestUser(ctx, body)
Summary: Test user Description: Test a user lookup to a given LDAP.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Jumpboxv3TestUserRequest**](Jumpboxv3TestUserRequest.md)|  | 

### Return type

[**Jumpboxv3TestUserResponse**](jumpboxv3TestUserResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **JumpboxServiceUpdateTenant**
> Jumpboxv3UpdateTenantResponse JumpboxServiceUpdateTenant(ctx, body, tenantId)
Summary: Update tenant Description: Update a tenant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Jumpboxv3UpdateTenantRequest**](Jumpboxv3UpdateTenantRequest.md)|  | 
  **tenantId** | **string**| Tenant id. | 

### Return type

[**Jumpboxv3UpdateTenantResponse**](jumpboxv3UpdateTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **JumpboxServiceUpdateUsers**
> Jumpboxv3UpdateUsersBulkResponse JumpboxServiceUpdateUsers(ctx, body)
Summary: Update users Description: Update an array of users.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Jumpboxv3UpdateUsersBulkRequest**](Jumpboxv3UpdateUsersBulkRequest.md)|  | 

### Return type

[**Jumpboxv3UpdateUsersBulkResponse**](jumpboxv3UpdateUsersBulkResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

