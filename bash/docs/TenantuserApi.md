# TenantuserApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**tenantuserCreateAPIKey**](TenantuserApi.md#tenantuserCreateAPIKey) | **POST** /api/v3/apikeys | Summary: Create API key
Description: Create API Key.
[**tenantuserDeleteAPIKey**](TenantuserApi.md#tenantuserDeleteAPIKey) | **DELETE** /api/v3/apikeys/{id} | Summary: Delete API key
Description: Delete APIKey Document based on the document id.
[**tenantuserDeleteRole**](TenantuserApi.md#tenantuserDeleteRole) | **DELETE** /api/v3/roles/{role_id} | Summary: Delete role
Description: Delete a role.
[**tenantuserGetAPIKeys**](TenantuserApi.md#tenantuserGetAPIKeys) | **GET** /api/v3/apikeys | Summary: Get API keys
Description: Get all APIKeys base on a tenant ID.
[**tenantuserGetCurrentUser**](TenantuserApi.md#tenantuserGetCurrentUser) | **GET** /api/v3/currentuser | Summary: Get current user
Description: Return the currently authenticated user.
[**tenantuserGetPrivilege**](TenantuserApi.md#tenantuserGetPrivilege) | **GET** /api/v3/privileges/{privilege.privilege_id} | Summary: Get privilege
Description: Return privilege.
[**tenantuserGetPrivileges**](TenantuserApi.md#tenantuserGetPrivileges) | **GET** /api/v3/privileges | Summary: Get privileges
Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified
If roles are specified, returns cumulative privileges for the list of roles.
[**tenantuserGetRole**](TenantuserApi.md#tenantuserGetRole) | **GET** /api/v3/roles/{role_id} | Summary: Get role
Description: Return single role.
[**tenantuserGetRoles**](TenantuserApi.md#tenantuserGetRoles) | **GET** /api/v3/roles | Summary: Get roles
Description: Return all roles without privileges.
[**tenantuserGetUser**](TenantuserApi.md#tenantuserGetUser) | **GET** /api/v3/users/user/{user_id} | Summary: Get user
Description: Return full user for specified user_id.
[**tenantuserGetUserNames**](TenantuserApi.md#tenantuserGetUserNames) | **POST** /api/v3/users/names | Summary: Get user names
Description: Get user names.
[**tenantuserGetUserTenant**](TenantuserApi.md#tenantuserGetUserTenant) | **GET** /api/v3/users/tenant/{user_id} | Summary: Get user tenant
Description: Return the user plus tenant information.
[**tenantuserPostPrivilegesBulk**](TenantuserApi.md#tenantuserPostPrivilegesBulk) | **POST** /api/v3/privileges | Summary: Post privileges bulk
Description: Perform bulk user add preivilege.
[**tenantuserPostRole**](TenantuserApi.md#tenantuserPostRole) | **POST** /api/v3/roles | Summary: Post role
Description: Create a new role.
[**tenantuserUpdatePrivilege**](TenantuserApi.md#tenantuserUpdatePrivilege) | **PATCH** /api/v3/privileges/{privilege_id} | Summary: Update privilege
Description: Update privilege.
[**tenantuserUpdatePrivilegesRoleBulk**](TenantuserApi.md#tenantuserUpdatePrivilegesRoleBulk) | **PATCH** /api/v3/privileges | Summary: Update privileges role bulk
Description: Perform bulk user update role.
[**tenantuserUpdateRole**](TenantuserApi.md#tenantuserUpdateRole) | **PATCH** /api/v3/roles/{role_id} | Summary: Update role
Description: Update single role.
[**tenantuserUpdateUserRoleBulk**](TenantuserApi.md#tenantuserUpdateUserRoleBulk) | **PATCH** /api/v3/users/role | Summary: Update user role bulk
Description: Perform bulk user add or remove role.



## tenantuserCreateAPIKey

Summary: Create API key
Description: Create API Key.

### Example

```bash
 tenantuserCreateAPIKey
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserDeleteAPIKey

Summary: Delete API key
Description: Delete APIKey Document based on the document id.

### Example

```bash
 tenantuserDeleteAPIKey id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | Apikey id. | [default to null]

### Return type

**map**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserDeleteRole

Summary: Delete role
Description: Delete a role.

### Example

```bash
 tenantuserDeleteRole role_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **string** | ID or role deleted. | [default to null]

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserGetAPIKeys

Summary: Get API keys
Description: Get all APIKeys base on a tenant ID.

### Example

```bash
 tenantuserGetAPIKeys
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetApiKeysResponse**](Tenantuserv3GetApiKeysResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserGetCurrentUser

Summary: Get current user
Description: Return the currently authenticated user.

### Example

```bash
 tenantuserGetCurrentUser
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetCurrentUserResponse**](Tenantuserv3GetCurrentUserResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserGetPrivilege

Summary: Get privilege
Description: Return privilege.

### Example

```bash
 tenantuserGetPrivilege privilege.privilege_id=value  privilege.type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegePeriodprivilegeId** | **string** | Privilege ID. | [default to null]
 **privilegePeriodtype** | **string** | Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. | [optional] [default to null]

### Return type

[**Tenantuserv3GetPrivilegeResponse**](Tenantuserv3GetPrivilegeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserGetPrivileges

Summary: Get privileges
Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified
If roles are specified, returns cumulative privileges for the list of roles.

### Example

```bash
 tenantuserGetPrivileges  Specify as:  roles=value1 roles=value2 roles=...  type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roles** | [**array[string]**](string.md) | If empty, will return all privileges. | [optional] [default to null]
 **type** | **string** | Type of privilege to return: group, page, permission, report, restapi, etc. | [optional] [default to null]

### Return type

[**Tenantuserv3GetPrivilegesResponse**](Tenantuserv3GetPrivilegesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserGetRole

Summary: Get role
Description: Return single role.

### Example

```bash
 tenantuserGetRole role_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **string** | ID of role to be returned. | [default to null]

### Return type

[**Tenantuserv3Role**](Tenantuserv3Role.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserGetRoles

Summary: Get roles
Description: Return all roles without privileges.

### Example

```bash
 tenantuserGetRoles
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetRolesResponse**](Tenantuserv3GetRolesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserGetUser

Summary: Get user
Description: Return full user for specified user_id.

### Example

```bash
 tenantuserGetUser user_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string** | User id defaults to the current user or specify \"current\" or an actual user id. | [default to null]

### Return type

[**Tenantuserv3GetUserResponse**](Tenantuserv3GetUserResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserGetUserNames

Summary: Get user names
Description: Get user names.

### Example

```bash
 tenantuserGetUserNames
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserGetUserTenant

Summary: Get user tenant
Description: Return the user plus tenant information.

### Example

```bash
 tenantuserGetUserTenant user_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string** | User id defaults to the current user or specify \"current\" or an actual user id. | [default to null]

### Return type

[**Tenantuserv3GetUserTenantResponse**](Tenantuserv3GetUserTenantResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserPostPrivilegesBulk

Summary: Post privileges bulk
Description: Perform bulk user add preivilege.

### Example

```bash
 tenantuserPostPrivilegesBulk
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserPostRole

Summary: Post role
Description: Create a new role.

### Example

```bash
 tenantuserPostRole
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserUpdatePrivilege

Summary: Update privilege
Description: Update privilege.

### Example

```bash
 tenantuserUpdatePrivilege privilege_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegeId** | **string** | Permanent id of the privilege to be updated or created. | [default to null]
 **tenantuserv3UpdatePrivilegeRequest** | [**Tenantuserv3UpdatePrivilegeRequest**](Tenantuserv3UpdatePrivilegeRequest.md) |  |

### Return type

[**Tenantuserv3UpdatePrivilegeResponse**](Tenantuserv3UpdatePrivilegeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserUpdatePrivilegesRoleBulk

Summary: Update privileges role bulk
Description: Perform bulk user update role.

### Example

```bash
 tenantuserUpdatePrivilegesRoleBulk
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserUpdateRole

Summary: Update role
Description: Update single role.

### Example

```bash
 tenantuserUpdateRole role_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **string** | Permanent id of the role. | [default to null]
 **tenantuserv3UpdateRoleRequest** | [**Tenantuserv3UpdateRoleRequest**](Tenantuserv3UpdateRoleRequest.md) |  |

### Return type

[**Tenantuserv3UpdateRoleResponse**](Tenantuserv3UpdateRoleResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenantuserUpdateUserRoleBulk

Summary: Update user role bulk
Description: Perform bulk user add or remove role.

### Example

```bash
 tenantuserUpdateUserRoleBulk
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

