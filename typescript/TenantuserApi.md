# .TenantuserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tenantuserCreateAPIKey**](TenantuserApi.md#tenantuserCreateAPIKey) | **POST** /api/v3/apikeys | Summary: Create API key Description: Create API Key.
[**tenantuserDeleteAPIKey**](TenantuserApi.md#tenantuserDeleteAPIKey) | **DELETE** /api/v3/apikeys/{id} | Summary: Delete API key Description: Delete APIKey Document based on the document id.
[**tenantuserDeleteRole**](TenantuserApi.md#tenantuserDeleteRole) | **DELETE** /api/v3/roles/{role_id} | Summary: Delete role Description: Delete a role.
[**tenantuserGetAPIKeys**](TenantuserApi.md#tenantuserGetAPIKeys) | **GET** /api/v3/apikeys | Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
[**tenantuserGetCurrentUser**](TenantuserApi.md#tenantuserGetCurrentUser) | **GET** /api/v3/currentuser | Summary: Get current user Description: Return the currently authenticated user.
[**tenantuserGetPrivilege**](TenantuserApi.md#tenantuserGetPrivilege) | **GET** /api/v3/privileges/{privilege.privilege_id} | Summary: Get privilege Description: Return privilege.
[**tenantuserGetPrivileges**](TenantuserApi.md#tenantuserGetPrivileges) | **GET** /api/v3/privileges | Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
[**tenantuserGetRole**](TenantuserApi.md#tenantuserGetRole) | **GET** /api/v3/roles/{role_id} | Summary: Get role Description: Return single role.
[**tenantuserGetRoles**](TenantuserApi.md#tenantuserGetRoles) | **GET** /api/v3/roles | Summary: Get roles Description: Return all roles without privileges.
[**tenantuserGetUser**](TenantuserApi.md#tenantuserGetUser) | **GET** /api/v3/users/user/{user_id} | Summary: Get user Description: Return full user for specified user_id.
[**tenantuserGetUserNames**](TenantuserApi.md#tenantuserGetUserNames) | **POST** /api/v3/users/names | Summary: Get user names Description: Get user names.
[**tenantuserGetUserTenant**](TenantuserApi.md#tenantuserGetUserTenant) | **GET** /api/v3/users/tenant/{user_id} | Summary: Get user tenant Description: Return the user plus tenant information.
[**tenantuserPostPrivilegesBulk**](TenantuserApi.md#tenantuserPostPrivilegesBulk) | **POST** /api/v3/privileges | Summary: Post privileges bulk Description: Perform bulk user add preivilege.
[**tenantuserPostRole**](TenantuserApi.md#tenantuserPostRole) | **POST** /api/v3/roles | Summary: Post role Description: Create a new role.
[**tenantuserUpdatePrivilege**](TenantuserApi.md#tenantuserUpdatePrivilege) | **PATCH** /api/v3/privileges/{privilege_id} | Summary: Update privilege Description: Update privilege.
[**tenantuserUpdatePrivilegesRoleBulk**](TenantuserApi.md#tenantuserUpdatePrivilegesRoleBulk) | **PATCH** /api/v3/privileges | Summary: Update privileges role bulk Description: Perform bulk user update role.
[**tenantuserUpdateRole**](TenantuserApi.md#tenantuserUpdateRole) | **PATCH** /api/v3/roles/{role_id} | Summary: Update role Description: Update single role.
[**tenantuserUpdateUserRoleBulk**](TenantuserApi.md#tenantuserUpdateUserRoleBulk) | **PATCH** /api/v3/users/role | Summary: Update user role bulk Description: Perform bulk user add or remove role.


# **tenantuserCreateAPIKey**
> Tenantuserv3CreateApiKeyResponse tenantuserCreateAPIKey(tenantuserv3CreateApiKeyRequest)


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserCreateAPIKeyRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserCreateAPIKeyRequest = {
  
  tenantuserv3CreateApiKeyRequest: {
    name: "name_example",
    roles: [
      "roles_example",
    ],
  },
};

const data = await apiInstance.tenantuserCreateAPIKey(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3CreateApiKeyRequest** | **Tenantuserv3CreateApiKeyRequest**|  |


### Return type

**Tenantuserv3CreateApiKeyResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserDeleteAPIKey**
> any tenantuserDeleteAPIKey()


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserDeleteAPIKeyRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserDeleteAPIKeyRequest = {
    // Apikey id.
  id: "id_example",
};

const data = await apiInstance.tenantuserDeleteAPIKey(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | Apikey id. | defaults to undefined


### Return type

**any**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserDeleteRole**
> any tenantuserDeleteRole()


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserDeleteRoleRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserDeleteRoleRequest = {
    // ID or role deleted.
  roleId: "role_id_example",
};

const data = await apiInstance.tenantuserDeleteRole(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | [**string**] | ID or role deleted. | defaults to undefined


### Return type

**any**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserGetAPIKeys**
> Tenantuserv3GetApiKeysResponse tenantuserGetAPIKeys()


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request = {};

const data = await apiInstance.tenantuserGetAPIKeys(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Tenantuserv3GetApiKeysResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserGetCurrentUser**
> Tenantuserv3GetCurrentUserResponse tenantuserGetCurrentUser()


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request = {};

const data = await apiInstance.tenantuserGetCurrentUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Tenantuserv3GetCurrentUserResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserGetPrivilege**
> Tenantuserv3GetPrivilegeResponse tenantuserGetPrivilege()


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserGetPrivilegeRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserGetPrivilegeRequest = {
    // Privilege ID.
  privilegePrivilegeId: "privilege.privilege_id_example",
    // Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. (optional)
  privilegeType: "privilege.type_example",
};

const data = await apiInstance.tenantuserGetPrivilege(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegePrivilegeId** | [**string**] | Privilege ID. | defaults to undefined
 **privilegeType** | [**string**] | Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. | (optional) defaults to undefined


### Return type

**Tenantuserv3GetPrivilegeResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserGetPrivileges**
> Tenantuserv3GetPrivilegesResponse tenantuserGetPrivileges()


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserGetPrivilegesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserGetPrivilegesRequest = {
    // If empty, will return all privileges. (optional)
  roles: [
    "roles_example",
  ],
    // Type of privilege to return: group, page, permission, report, restapi, etc. (optional)
  type: "type_example",
};

const data = await apiInstance.tenantuserGetPrivileges(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roles** | **Array&lt;string&gt;** | If empty, will return all privileges. | (optional) defaults to undefined
 **type** | [**string**] | Type of privilege to return: group, page, permission, report, restapi, etc. | (optional) defaults to undefined


### Return type

**Tenantuserv3GetPrivilegesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserGetRole**
> Tenantuserv3Role tenantuserGetRole()


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserGetRoleRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserGetRoleRequest = {
    // ID of role to be returned.
  roleId: "role_id_example",
};

const data = await apiInstance.tenantuserGetRole(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | [**string**] | ID of role to be returned. | defaults to undefined


### Return type

**Tenantuserv3Role**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserGetRoles**
> Tenantuserv3GetRolesResponse tenantuserGetRoles()


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request = {};

const data = await apiInstance.tenantuserGetRoles(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Tenantuserv3GetRolesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserGetUser**
> Tenantuserv3GetUserResponse tenantuserGetUser()


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserGetUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserGetUserRequest = {
    // User id defaults to the current user or specify \"current\" or an actual user id.
  userId: "user_id_example",
};

const data = await apiInstance.tenantuserGetUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**string**] | User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | defaults to undefined


### Return type

**Tenantuserv3GetUserResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserGetUserNames**
> Tenantuserv3GetUserNamesResponse tenantuserGetUserNames(tenantuserv3GetUserNamesRequest)


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserGetUserNamesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserGetUserNamesRequest = {
  
  tenantuserv3GetUserNamesRequest: {
    userIds: [
      "userIds_example",
    ],
  },
};

const data = await apiInstance.tenantuserGetUserNames(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3GetUserNamesRequest** | **Tenantuserv3GetUserNamesRequest**|  |


### Return type

**Tenantuserv3GetUserNamesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserGetUserTenant**
> Tenantuserv3GetUserTenantResponse tenantuserGetUserTenant()


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserGetUserTenantRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserGetUserTenantRequest = {
    // User id defaults to the current user or specify \"current\" or an actual user id.
  userId: "user_id_example",
};

const data = await apiInstance.tenantuserGetUserTenant(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**string**] | User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | defaults to undefined


### Return type

**Tenantuserv3GetUserTenantResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserPostPrivilegesBulk**
> Tenantuserv3PostPrivilegesBulkResponse tenantuserPostPrivilegesBulk(tenantuserv3PostPrivilegesBulkRequest)


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserPostPrivilegesBulkRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserPostPrivilegesBulkRequest = {
  
  tenantuserv3PostPrivilegesBulkRequest: {
    privileges: [
      {
        authorId: "authorId_example",
        immutableRoles: [
          "immutableRoles_example",
        ],
        manageRoles: [
          "manageRoles_example",
        ],
        name: "name_example",
        nlsId: "nlsId_example",
        privilegeId: "privilegeId_example",
        removable: true,
        roles: [
          "roles_example",
        ],
        type: "type_example",
      },
    ],
  },
};

const data = await apiInstance.tenantuserPostPrivilegesBulk(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3PostPrivilegesBulkRequest** | **Tenantuserv3PostPrivilegesBulkRequest**|  |


### Return type

**Tenantuserv3PostPrivilegesBulkResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserPostRole**
> Tenantuserv3PostRoleResponse tenantuserPostRole(tenantuserv3PostRoleRequest)


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserPostRoleRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserPostRoleRequest = {
  
  tenantuserv3PostRoleRequest: {
    role: {
      description: "description_example",
      icpRoles: [
        "icpRoles_example",
      ],
      name: "name_example",
      removable: true,
      roleId: "roleId_example",
    },
  },
};

const data = await apiInstance.tenantuserPostRole(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3PostRoleRequest** | **Tenantuserv3PostRoleRequest**|  |


### Return type

**Tenantuserv3PostRoleResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserUpdatePrivilege**
> Tenantuserv3UpdatePrivilegeResponse tenantuserUpdatePrivilege(tenantuserv3UpdatePrivilegeRequest)


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserUpdatePrivilegeRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserUpdatePrivilegeRequest = {
    // Permanent id of the privilege to be updated or created.
  privilegeId: "privilege_id_example",
  
  tenantuserv3UpdatePrivilegeRequest: {
    manageRoles: [
      "manageRoles_example",
    ],
    name: "name_example",
    privilegeId: "privilegeId_example",
    removable: true,
    roles: [
      "roles_example",
    ],
    type: "type_example",
  },
};

const data = await apiInstance.tenantuserUpdatePrivilege(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3UpdatePrivilegeRequest** | **Tenantuserv3UpdatePrivilegeRequest**|  |
 **privilegeId** | [**string**] | Permanent id of the privilege to be updated or created. | defaults to undefined


### Return type

**Tenantuserv3UpdatePrivilegeResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserUpdatePrivilegesRoleBulk**
> Tenantuserv3UpdatePrivilegesBulkResponse tenantuserUpdatePrivilegesRoleBulk(tenantuserv3UpdatePrivilegesBulkRequest)


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserUpdatePrivilegesRoleBulkRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserUpdatePrivilegesRoleBulkRequest = {
  
  tenantuserv3UpdatePrivilegesBulkRequest: {
    privilege: [
      {
        privilegeId: "privilegeId_example",
        roles: [
          "roles_example",
        ],
        type: "type_example",
      },
    ],
    roleId: "roleId_example",
  },
};

const data = await apiInstance.tenantuserUpdatePrivilegesRoleBulk(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3UpdatePrivilegesBulkRequest** | **Tenantuserv3UpdatePrivilegesBulkRequest**|  |


### Return type

**Tenantuserv3UpdatePrivilegesBulkResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserUpdateRole**
> Tenantuserv3UpdateRoleResponse tenantuserUpdateRole(tenantuserv3UpdateRoleRequest)


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserUpdateRoleRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserUpdateRoleRequest = {
    // Permanent id of the role.
  roleId: "role_id_example",
  
  tenantuserv3UpdateRoleRequest: {
    description: "description_example",
    icpRoles: [
      "icpRoles_example",
    ],
    name: "name_example",
    removable: true,
    roleId: "roleId_example",
  },
};

const data = await apiInstance.tenantuserUpdateRole(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3UpdateRoleRequest** | **Tenantuserv3UpdateRoleRequest**|  |
 **roleId** | [**string**] | Permanent id of the role. | defaults to undefined


### Return type

**Tenantuserv3UpdateRoleResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserUpdateUserRoleBulk**
> Tenantuserv3UpdateUserRoleBulkResponse tenantuserUpdateUserRoleBulk(tenantuserv3UpdateUserRoleBulkRequest)


### Example


```typescript
import { createConfiguration, TenantuserApi } from '';
import type { TenantuserApiTenantuserUpdateUserRoleBulkRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TenantuserApi(configuration);

const request: TenantuserApiTenantuserUpdateUserRoleBulkRequest = {
  
  tenantuserv3UpdateUserRoleBulkRequest: {
    assignRoleId: [
      "assignRoleId_example",
    ],
    removeRoleId: [
      "removeRoleId_example",
    ],
    userId: [
      "userId_example",
    ],
  },
};

const data = await apiInstance.tenantuserUpdateUserRoleBulk(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3UpdateUserRoleBulkRequest** | **Tenantuserv3UpdateUserRoleBulkRequest**|  |


### Return type

**Tenantuserv3UpdateUserRoleBulkResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


