# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TenantuserCreateAPIKey**](TenantuserApi.md#TenantuserCreateAPIKey) | **Post** /api/v3/apikeys | Summary: Create API key Description: Create API Key.
[**TenantuserDeleteAPIKey**](TenantuserApi.md#TenantuserDeleteAPIKey) | **Delete** /api/v3/apikeys/{id} | Summary: Delete API key Description: Delete APIKey Document based on the document id.
[**TenantuserDeleteRole**](TenantuserApi.md#TenantuserDeleteRole) | **Delete** /api/v3/roles/{role_id} | Summary: Delete role Description: Delete a role.
[**TenantuserGetAPIKeys**](TenantuserApi.md#TenantuserGetAPIKeys) | **Get** /api/v3/apikeys | Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
[**TenantuserGetCurrentUser**](TenantuserApi.md#TenantuserGetCurrentUser) | **Get** /api/v3/currentuser | Summary: Get current user Description: Return the currently authenticated user.
[**TenantuserGetPrivilege**](TenantuserApi.md#TenantuserGetPrivilege) | **Get** /api/v3/privileges/{privilege.privilege_id} | Summary: Get privilege Description: Return privilege.
[**TenantuserGetPrivileges**](TenantuserApi.md#TenantuserGetPrivileges) | **Get** /api/v3/privileges | Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
[**TenantuserGetRole**](TenantuserApi.md#TenantuserGetRole) | **Get** /api/v3/roles/{role_id} | Summary: Get role Description: Return single role.
[**TenantuserGetRoles**](TenantuserApi.md#TenantuserGetRoles) | **Get** /api/v3/roles | Summary: Get roles Description: Return all roles without privileges.
[**TenantuserGetUser**](TenantuserApi.md#TenantuserGetUser) | **Get** /api/v3/users/user/{user_id} | Summary: Get user Description: Return full user for specified user_id.
[**TenantuserGetUserNames**](TenantuserApi.md#TenantuserGetUserNames) | **Post** /api/v3/users/names | Summary: Get user names Description: Get user names.
[**TenantuserGetUserTenant**](TenantuserApi.md#TenantuserGetUserTenant) | **Get** /api/v3/users/tenant/{user_id} | Summary: Get user tenant Description: Return the user plus tenant information.
[**TenantuserPostPrivilegesBulk**](TenantuserApi.md#TenantuserPostPrivilegesBulk) | **Post** /api/v3/privileges | Summary: Post privileges bulk Description: Perform bulk user add preivilege.
[**TenantuserPostRole**](TenantuserApi.md#TenantuserPostRole) | **Post** /api/v3/roles | Summary: Post role Description: Create a new role.
[**TenantuserUpdatePrivilege**](TenantuserApi.md#TenantuserUpdatePrivilege) | **Patch** /api/v3/privileges/{privilege_id} | Summary: Update privilege Description: Update privilege.
[**TenantuserUpdatePrivilegesRoleBulk**](TenantuserApi.md#TenantuserUpdatePrivilegesRoleBulk) | **Patch** /api/v3/privileges | Summary: Update privileges role bulk Description: Perform bulk user update role.
[**TenantuserUpdateRole**](TenantuserApi.md#TenantuserUpdateRole) | **Patch** /api/v3/roles/{role_id} | Summary: Update role Description: Update single role.
[**TenantuserUpdateUserRoleBulk**](TenantuserApi.md#TenantuserUpdateUserRoleBulk) | **Patch** /api/v3/users/role | Summary: Update user role bulk Description: Perform bulk user add or remove role.

# **TenantuserCreateAPIKey**
> Tenantuserv3CreateApiKeyResponse TenantuserCreateAPIKey(ctx, body)
Summary: Create API key Description: Create API Key.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Tenantuserv3CreateApiKeyRequest**](Tenantuserv3CreateApiKeyRequest.md)|  | 

### Return type

[**Tenantuserv3CreateApiKeyResponse**](tenantuserv3CreateApiKeyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserDeleteAPIKey**
> Tenantuserv3DeleteApiKeyResponse TenantuserDeleteAPIKey(ctx, id)
Summary: Delete API key Description: Delete APIKey Document based on the document id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **string**| Apikey id. | 

### Return type

[**Tenantuserv3DeleteApiKeyResponse**](tenantuserv3DeleteApiKeyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserDeleteRole**
> Tenantuserv3DeleteRoleResponse TenantuserDeleteRole(ctx, roleId)
Summary: Delete role Description: Delete a role.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **roleId** | **string**| ID or role deleted. | 

### Return type

[**Tenantuserv3DeleteRoleResponse**](tenantuserv3DeleteRoleResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserGetAPIKeys**
> Tenantuserv3GetApiKeysResponse TenantuserGetAPIKeys(ctx, )
Summary: Get API keys Description: Get all APIKeys base on a tenant ID.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetApiKeysResponse**](tenantuserv3GetApiKeysResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserGetCurrentUser**
> Tenantuserv3GetCurrentUserResponse TenantuserGetCurrentUser(ctx, )
Summary: Get current user Description: Return the currently authenticated user.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetCurrentUserResponse**](tenantuserv3GetCurrentUserResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserGetPrivilege**
> Tenantuserv3GetPrivilegeResponse TenantuserGetPrivilege(ctx, privilegePrivilegeId, optional)
Summary: Get privilege Description: Return privilege.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **privilegePrivilegeId** | **string**| Privilege ID. | 
 **optional** | ***TenantuserApiTenantuserGetPrivilegeOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a TenantuserApiTenantuserGetPrivilegeOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **privilegeType** | **optional.String**| Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. | 

### Return type

[**Tenantuserv3GetPrivilegeResponse**](tenantuserv3GetPrivilegeResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserGetPrivileges**
> Tenantuserv3GetPrivilegesResponse TenantuserGetPrivileges(ctx, optional)
Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***TenantuserApiTenantuserGetPrivilegesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a TenantuserApiTenantuserGetPrivilegesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roles** | [**optional.Interface of []string**](string.md)| If empty, will return all privileges. | 
 **type_** | **optional.String**| Type of privilege to return: group, page, permission, report, restapi, etc. | 

### Return type

[**Tenantuserv3GetPrivilegesResponse**](tenantuserv3GetPrivilegesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserGetRole**
> Tenantuserv3Role TenantuserGetRole(ctx, roleId)
Summary: Get role Description: Return single role.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **roleId** | **string**| ID of role to be returned. | 

### Return type

[**Tenantuserv3Role**](tenantuserv3Role.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserGetRoles**
> Tenantuserv3GetRolesResponse TenantuserGetRoles(ctx, )
Summary: Get roles Description: Return all roles without privileges.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetRolesResponse**](tenantuserv3GetRolesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserGetUser**
> Tenantuserv3GetUserResponse TenantuserGetUser(ctx, userId)
Summary: Get user Description: Return full user for specified user_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **userId** | **string**| User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | 

### Return type

[**Tenantuserv3GetUserResponse**](tenantuserv3GetUserResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserGetUserNames**
> Tenantuserv3GetUserNamesResponse TenantuserGetUserNames(ctx, body)
Summary: Get user names Description: Get user names.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Tenantuserv3GetUserNamesRequest**](Tenantuserv3GetUserNamesRequest.md)|  | 

### Return type

[**Tenantuserv3GetUserNamesResponse**](tenantuserv3GetUserNamesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserGetUserTenant**
> Tenantuserv3GetUserTenantResponse TenantuserGetUserTenant(ctx, userId)
Summary: Get user tenant Description: Return the user plus tenant information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **userId** | **string**| User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | 

### Return type

[**Tenantuserv3GetUserTenantResponse**](tenantuserv3GetUserTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserPostPrivilegesBulk**
> Tenantuserv3PostPrivilegesBulkResponse TenantuserPostPrivilegesBulk(ctx, body)
Summary: Post privileges bulk Description: Perform bulk user add preivilege.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Tenantuserv3PostPrivilegesBulkRequest**](Tenantuserv3PostPrivilegesBulkRequest.md)|  | 

### Return type

[**Tenantuserv3PostPrivilegesBulkResponse**](tenantuserv3PostPrivilegesBulkResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserPostRole**
> Tenantuserv3PostRoleResponse TenantuserPostRole(ctx, body)
Summary: Post role Description: Create a new role.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Tenantuserv3PostRoleRequest**](Tenantuserv3PostRoleRequest.md)|  | 

### Return type

[**Tenantuserv3PostRoleResponse**](tenantuserv3PostRoleResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserUpdatePrivilege**
> Tenantuserv3UpdatePrivilegeResponse TenantuserUpdatePrivilege(ctx, body, privilegeId)
Summary: Update privilege Description: Update privilege.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Tenantuserv3UpdatePrivilegeRequest**](Tenantuserv3UpdatePrivilegeRequest.md)|  | 
  **privilegeId** | **string**| Permanent id of the privilege to be updated or created. | 

### Return type

[**Tenantuserv3UpdatePrivilegeResponse**](tenantuserv3UpdatePrivilegeResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserUpdatePrivilegesRoleBulk**
> Tenantuserv3UpdatePrivilegesBulkResponse TenantuserUpdatePrivilegesRoleBulk(ctx, body)
Summary: Update privileges role bulk Description: Perform bulk user update role.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Tenantuserv3UpdatePrivilegesBulkRequest**](Tenantuserv3UpdatePrivilegesBulkRequest.md)|  | 

### Return type

[**Tenantuserv3UpdatePrivilegesBulkResponse**](tenantuserv3UpdatePrivilegesBulkResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserUpdateRole**
> Tenantuserv3UpdateRoleResponse TenantuserUpdateRole(ctx, body, roleId)
Summary: Update role Description: Update single role.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Tenantuserv3UpdateRoleRequest**](Tenantuserv3UpdateRoleRequest.md)|  | 
  **roleId** | **string**| Permanent id of the role. | 

### Return type

[**Tenantuserv3UpdateRoleResponse**](tenantuserv3UpdateRoleResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TenantuserUpdateUserRoleBulk**
> Tenantuserv3UpdateUserRoleBulkResponse TenantuserUpdateUserRoleBulk(ctx, body)
Summary: Update user role bulk Description: Perform bulk user add or remove role.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Tenantuserv3UpdateUserRoleBulkRequest**](Tenantuserv3UpdateUserRoleBulkRequest.md)|  | 

### Return type

[**Tenantuserv3UpdateUserRoleBulkResponse**](tenantuserv3UpdateUserRoleBulkResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

