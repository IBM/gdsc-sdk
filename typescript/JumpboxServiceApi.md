# .JumpboxServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jumpboxServiceAuthorize**](JumpboxServiceApi.md#jumpboxServiceAuthorize) | **POST** /api/v3/authorization | Summary: Authorize Description: Authenticate a user and return a JWT.
[**jumpboxServiceDeleteAccount**](JumpboxServiceApi.md#jumpboxServiceDeleteAccount) | **DELETE** /api/v3/accounts/{account_id} | Summary: Delete account Description: Delete an account.
[**jumpboxServiceDeleteTenant**](JumpboxServiceApi.md#jumpboxServiceDeleteTenant) | **DELETE** /api/v3/tenants/{tenant_id} | Summary: Delete tenant Description: Delete a tenant.
[**jumpboxServiceDeleteUser**](JumpboxServiceApi.md#jumpboxServiceDeleteUser) | **DELETE** /api/v3/users/{user_id} | Summary: Delete user Description: Delete the user.
[**jumpboxServiceGetAccount**](JumpboxServiceApi.md#jumpboxServiceGetAccount) | **GET** /api/v3/accounts/{account_id} | Summary: Get account Description: Get an account.
[**jumpboxServiceGetAccounts**](JumpboxServiceApi.md#jumpboxServiceGetAccounts) | **GET** /api/v3/accounts | Summary: Get accounts Description: Get all accounts based on UID.
[**jumpboxServiceGetTenant**](JumpboxServiceApi.md#jumpboxServiceGetTenant) | **GET** /api/v3/tenants/{tenant_id} | Summary: Get tenant Description: Get a tenant.
[**jumpboxServiceGetTenants**](JumpboxServiceApi.md#jumpboxServiceGetTenants) | **GET** /api/v3/tenants | Summary: Get tenants Description: Get all tenant base on UID.
[**jumpboxServiceGetUsers**](JumpboxServiceApi.md#jumpboxServiceGetUsers) | **GET** /api/v3/users | Summary: Get users Description: Get all users base on a tenantID.
[**jumpboxServicePostAccount**](JumpboxServiceApi.md#jumpboxServicePostAccount) | **POST** /api/v3/accounts | Summary: Post account Description: Create an Account.
[**jumpboxServicePostTenants**](JumpboxServiceApi.md#jumpboxServicePostTenants) | **POST** /api/v3/tenants | Summary: Post tenants Description: Create a tenant.
[**jumpboxServicePostUsers**](JumpboxServiceApi.md#jumpboxServicePostUsers) | **POST** /api/v3/users | Summary: Post users Description: Create users.
[**jumpboxServiceResumeAccount**](JumpboxServiceApi.md#jumpboxServiceResumeAccount) | **PATCH** /api/v3/accounts/{account_id}/resume | Summary: Resume account Description: Resume an account.
[**jumpboxServiceSearchUsers**](JumpboxServiceApi.md#jumpboxServiceSearchUsers) | **POST** /api/v3/users/search | Summary: Search users Description: Search for all users matching the provided string.
[**jumpboxServiceSuspendAccount**](JumpboxServiceApi.md#jumpboxServiceSuspendAccount) | **PATCH** /api/v3/accounts/{account_id}/suspend | Summary: Suspend Account Description: Suspend an account
[**jumpboxServiceTestUser**](JumpboxServiceApi.md#jumpboxServiceTestUser) | **POST** /api/v3/users/test | Summary: Test user Description: Test a user lookup to a given LDAP.
[**jumpboxServiceUpdateAccount**](JumpboxServiceApi.md#jumpboxServiceUpdateAccount) | **PATCH** /api/v3/accounts/{account_id} | Summary: Update Account Description: Updates an account.
[**jumpboxServiceUpdateTenant**](JumpboxServiceApi.md#jumpboxServiceUpdateTenant) | **PATCH** /api/v3/tenants/{tenant_id} | Summary: Update tenant Description: Update a tenant.
[**jumpboxServiceUpdateUsers**](JumpboxServiceApi.md#jumpboxServiceUpdateUsers) | **PATCH** /api/v3/users | Summary: Update users Description: Update an array of users.


# **jumpboxServiceAuthorize**
> Jumpboxv3AuthorizeResponse jumpboxServiceAuthorize(jumpboxv3AuthorizeRequest)


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceAuthorizeRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceAuthorizeRequest = {
  
  jumpboxv3AuthorizeRequest: {
    displayName: "displayName_example",
    email: "email_example",
    externalId: "externalId_example",
    firstName: "firstName_example",
    isRenew: true,
    isUpdateUserInfo: true,
    lastName: "lastName_example",
    loginId: "loginId_example",
    tenantId: "tenantId_example",
  },
};

const data = await apiInstance.jumpboxServiceAuthorize(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3AuthorizeRequest** | **Jumpboxv3AuthorizeRequest**|  |


### Return type

**Jumpboxv3AuthorizeResponse**

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

# **jumpboxServiceDeleteAccount**
> Jumpboxv3DeleteAccountResponse jumpboxServiceDeleteAccount()


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceDeleteAccountRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceDeleteAccountRequest = {
    // Account id.
  accountId: "account_id_example",
};

const data = await apiInstance.jumpboxServiceDeleteAccount(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**string**] | Account id. | defaults to undefined


### Return type

**Jumpboxv3DeleteAccountResponse**

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

# **jumpboxServiceDeleteTenant**
> any jumpboxServiceDeleteTenant()


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceDeleteTenantRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceDeleteTenantRequest = {
    // Tenant id.
  tenantId: "tenant_id_example",
    // Delete tenant permanently if true. (optional)
  isPermanentDelete: true,
    // Async. (optional)
  async: true,
};

const data = await apiInstance.jumpboxServiceDeleteTenant(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Tenant id. | defaults to undefined
 **isPermanentDelete** | [**boolean**] | Delete tenant permanently if true. | (optional) defaults to undefined
 **async** | [**boolean**] | Async. | (optional) defaults to undefined


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

# **jumpboxServiceDeleteUser**
> any jumpboxServiceDeleteUser()


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceDeleteUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceDeleteUserRequest = {
    // The user id.
  userId: "user_id_example",
};

const data = await apiInstance.jumpboxServiceDeleteUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**string**] | The user id. | defaults to undefined


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

# **jumpboxServiceGetAccount**
> Jumpboxv3GetAccountResponse jumpboxServiceGetAccount()


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceGetAccountRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceGetAccountRequest = {
    // Account id.
  accountId: "account_id_example",
    // Include inactive. (optional)
  includeInactive: true,
    // Include tenants that are not ready(are in state of being created or deleted). (optional)
  includeNotReady: true,
};

const data = await apiInstance.jumpboxServiceGetAccount(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**string**] | Account id. | defaults to undefined
 **includeInactive** | [**boolean**] | Include inactive. | (optional) defaults to undefined
 **includeNotReady** | [**boolean**] | Include tenants that are not ready(are in state of being created or deleted). | (optional) defaults to undefined


### Return type

**Jumpboxv3GetAccountResponse**

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

# **jumpboxServiceGetAccounts**
> Jumpboxv3GetAccountsResponse jumpboxServiceGetAccounts()


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceGetAccountsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceGetAccountsRequest = {
    // Email. (optional)
  uid: "uid_example",
    // External id. (optional)
  externalId: "external_id_example",
    // Include inactive. (optional)
  includeInactive: true,
    // Include tenants that are not ready(are in state of being created or deleted). (optional)
  includeNotReady: true,
};

const data = await apiInstance.jumpboxServiceGetAccounts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | [**string**] | Email. | (optional) defaults to undefined
 **externalId** | [**string**] | External id. | (optional) defaults to undefined
 **includeInactive** | [**boolean**] | Include inactive. | (optional) defaults to undefined
 **includeNotReady** | [**boolean**] | Include tenants that are not ready(are in state of being created or deleted). | (optional) defaults to undefined


### Return type

**Jumpboxv3GetAccountsResponse**

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

# **jumpboxServiceGetTenant**
> Jumpboxv3GetTenantResponse jumpboxServiceGetTenant()


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceGetTenantRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceGetTenantRequest = {
    // Tenant id.
  tenantId: "tenant_id_example",
    // Include inactive. (optional)
  includeInactive: true,
    // Include tenants that are not ready(are in state of being created or deleted). (optional)
  includeNotReady: true,
};

const data = await apiInstance.jumpboxServiceGetTenant(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Tenant id. | defaults to undefined
 **includeInactive** | [**boolean**] | Include inactive. | (optional) defaults to undefined
 **includeNotReady** | [**boolean**] | Include tenants that are not ready(are in state of being created or deleted). | (optional) defaults to undefined


### Return type

**Jumpboxv3GetTenantResponse**

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

# **jumpboxServiceGetTenants**
> Jumpboxv3GetTenantsResponse jumpboxServiceGetTenants()


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceGetTenantsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceGetTenantsRequest = {
    // Email. (optional)
  uid: "uid_example",
    // External id. (optional)
  externalId: "external_id_example",
    // Include inactive. (optional)
  includeInactive: true,
    // Include tenants that are not ready(are in state of being created or deleted). (optional)
  includeNotReady: true,
};

const data = await apiInstance.jumpboxServiceGetTenants(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | [**string**] | Email. | (optional) defaults to undefined
 **externalId** | [**string**] | External id. | (optional) defaults to undefined
 **includeInactive** | [**boolean**] | Include inactive. | (optional) defaults to undefined
 **includeNotReady** | [**boolean**] | Include tenants that are not ready(are in state of being created or deleted). | (optional) defaults to undefined


### Return type

**Jumpboxv3GetTenantsResponse**

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

# **jumpboxServiceGetUsers**
> Tenantuserv3GetUsersResponse jumpboxServiceGetUsers()


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceGetUsersRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceGetUsersRequest = {
    // Email. (optional)
  uid: "uid_example",
};

const data = await apiInstance.jumpboxServiceGetUsers(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | [**string**] | Email. | (optional) defaults to undefined


### Return type

**Tenantuserv3GetUsersResponse**

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

# **jumpboxServicePostAccount**
> Jumpboxv3PostAccountResponse jumpboxServicePostAccount(jumpboxv3PostAccountRequest)


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServicePostAccountRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServicePostAccountRequest = {
  
  jumpboxv3PostAccountRequest: {
    externalId: "externalId_example",
    externalMetadata: {
      "key": {
        addOns: {
          "key": {
            unit: "unit_example",
            value: "value_example",
          },
        },
        crn: "crn_example",
        expirationDate: new Date('1970-01-01T00:00:00.00Z'),
        instanceId: "instanceId_example",
        partNumber: "partNumber_example",
        planId: "planId_example",
        serviceId: "serviceId_example",
        subscriptionId: "subscriptionId_example",
      },
    },
    name: "name_example",
    partNumber: "partNumber_example",
    uid: "uid_example",
  },
};

const data = await apiInstance.jumpboxServicePostAccount(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3PostAccountRequest** | **Jumpboxv3PostAccountRequest**|  |


### Return type

**Jumpboxv3PostAccountResponse**

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

# **jumpboxServicePostTenants**
> Jumpboxv3PostTenantsResponse jumpboxServicePostTenants(jumpboxv3PostTenantsRequest)


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServicePostTenantsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServicePostTenantsRequest = {
  
  jumpboxv3PostTenantsRequest: {
    async: true,
    externalId: "externalId_example",
    externalMetadata: {
      "key": {
        addOns: {
          "key": {
            unit: "unit_example",
            value: "value_example",
          },
        },
        crn: "crn_example",
        expirationDate: new Date('1970-01-01T00:00:00.00Z'),
        instanceId: "instanceId_example",
        partNumber: "partNumber_example",
        planId: "planId_example",
        serviceId: "serviceId_example",
        subscriptionId: "subscriptionId_example",
      },
    },
    name: "name_example",
    partNumber: "partNumber_example",
    uid: "uid_example",
  },
};

const data = await apiInstance.jumpboxServicePostTenants(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3PostTenantsRequest** | **Jumpboxv3PostTenantsRequest**|  |


### Return type

**Jumpboxv3PostTenantsResponse**

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

# **jumpboxServicePostUsers**
> Jumpboxv3PostUsersBulkResponse jumpboxServicePostUsers(jumpboxv3PostUsersBulkRequest)


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServicePostUsersRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServicePostUsersRequest = {
  
  jumpboxv3PostUsersBulkRequest: {
    users: [
      {
        activationDate: new Date('1970-01-01T00:00:00.00Z'),
        directoryId: "directoryId_example",
        disabled: true,
        displayName: "displayName_example",
        distinguishedName: "distinguishedName_example",
        email: "email_example",
        externalId: "externalId_example",
        metadata: {
          "key": "key_example",
        },
        roles: [
          "roles_example",
        ],
        state: "ACTIVE",
        uid: "uid_example",
        userId: "userId_example",
      },
    ],
  },
};

const data = await apiInstance.jumpboxServicePostUsers(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3PostUsersBulkRequest** | **Jumpboxv3PostUsersBulkRequest**|  |


### Return type

**Jumpboxv3PostUsersBulkResponse**

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

# **jumpboxServiceResumeAccount**
> Jumpboxv3ResumeAccountResponse jumpboxServiceResumeAccount()


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceResumeAccountRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceResumeAccountRequest = {
    // account_id represents the user\'s account ID
  accountId: "account_id_example",
};

const data = await apiInstance.jumpboxServiceResumeAccount(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**string**] | account_id represents the user\&#39;s account ID | defaults to undefined


### Return type

**Jumpboxv3ResumeAccountResponse**

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

# **jumpboxServiceSearchUsers**
> Jumpboxv3SearchUsersResponse jumpboxServiceSearchUsers(jumpboxv3SearchUsersRequest)


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceSearchUsersRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceSearchUsersRequest = {
  
  jumpboxv3SearchUsersRequest: {
    searchString: "searchString_example",
  },
};

const data = await apiInstance.jumpboxServiceSearchUsers(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3SearchUsersRequest** | **Jumpboxv3SearchUsersRequest**|  |


### Return type

**Jumpboxv3SearchUsersResponse**

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

# **jumpboxServiceSuspendAccount**
> Jumpboxv3SuspendAccountResponse jumpboxServiceSuspendAccount()


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceSuspendAccountRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceSuspendAccountRequest = {
    // account_id represents the user\'s account ID
  accountId: "account_id_example",
};

const data = await apiInstance.jumpboxServiceSuspendAccount(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**string**] | account_id represents the user\&#39;s account ID | defaults to undefined


### Return type

**Jumpboxv3SuspendAccountResponse**

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

# **jumpboxServiceTestUser**
> Jumpboxv3TestUserResponse jumpboxServiceTestUser(jumpboxv3TestUserRequest)


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceTestUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceTestUserRequest = {
  
  jumpboxv3TestUserRequest: {
    ldapId: "ldapId_example",
    uid: "uid_example",
  },
};

const data = await apiInstance.jumpboxServiceTestUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3TestUserRequest** | **Jumpboxv3TestUserRequest**|  |


### Return type

**Jumpboxv3TestUserResponse**

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

# **jumpboxServiceUpdateAccount**
> Jumpboxv3UpdateAccountResponse jumpboxServiceUpdateAccount(jumpboxv3UpdateAccountRequest)


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceUpdateAccountRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceUpdateAccountRequest = {
    // Account id.
  accountId: "account_id_example",
  
  jumpboxv3UpdateAccountRequest: {
    accountId: "accountId_example",
    externalMetadata: {
      "key": {
        addOns: {
          "key": {
            unit: "unit_example",
            value: "value_example",
          },
        },
        crn: "crn_example",
        expirationDate: new Date('1970-01-01T00:00:00.00Z'),
        instanceId: "instanceId_example",
        partNumber: "partNumber_example",
        planId: "planId_example",
        serviceId: "serviceId_example",
        subscriptionId: "subscriptionId_example",
      },
    },
    isInactive: true,
    isReady: true,
    name: "name_example",
    partNumber: "partNumber_example",
    uid: "uid_example",
  },
};

const data = await apiInstance.jumpboxServiceUpdateAccount(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3UpdateAccountRequest** | **Jumpboxv3UpdateAccountRequest**|  |
 **accountId** | [**string**] | Account id. | defaults to undefined


### Return type

**Jumpboxv3UpdateAccountResponse**

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

# **jumpboxServiceUpdateTenant**
> Jumpboxv3UpdateTenantResponse jumpboxServiceUpdateTenant(jumpboxv3UpdateTenantRequest)


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceUpdateTenantRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceUpdateTenantRequest = {
    // Tenant id.
  tenantId: "tenant_id_example",
  
  jumpboxv3UpdateTenantRequest: {
    externalMetadata: {
      "key": {
        addOns: {
          "key": {
            unit: "unit_example",
            value: "value_example",
          },
        },
        crn: "crn_example",
        expirationDate: new Date('1970-01-01T00:00:00.00Z'),
        instanceId: "instanceId_example",
        partNumber: "partNumber_example",
        planId: "planId_example",
        serviceId: "serviceId_example",
        subscriptionId: "subscriptionId_example",
      },
    },
    isInactive: true,
    isReady: true,
    name: "name_example",
    partNumber: "partNumber_example",
    tenantId: "tenantId_example",
    uid: "uid_example",
  },
};

const data = await apiInstance.jumpboxServiceUpdateTenant(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3UpdateTenantRequest** | **Jumpboxv3UpdateTenantRequest**|  |
 **tenantId** | [**string**] | Tenant id. | defaults to undefined


### Return type

**Jumpboxv3UpdateTenantResponse**

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

# **jumpboxServiceUpdateUsers**
> Jumpboxv3UpdateUsersBulkResponse jumpboxServiceUpdateUsers(jumpboxv3UpdateUsersBulkRequest)


### Example


```typescript
import { createConfiguration, JumpboxServiceApi } from '';
import type { JumpboxServiceApiJumpboxServiceUpdateUsersRequest } from '';

const configuration = createConfiguration();
const apiInstance = new JumpboxServiceApi(configuration);

const request: JumpboxServiceApiJumpboxServiceUpdateUsersRequest = {
  
  jumpboxv3UpdateUsersBulkRequest: {
    action: "action_example",
    metadataOnly: true,
    users: [
      {
        activationDate: new Date('1970-01-01T00:00:00.00Z'),
        directoryId: "directoryId_example",
        disabled: true,
        displayName: "displayName_example",
        distinguishedName: "distinguishedName_example",
        email: "email_example",
        externalId: "externalId_example",
        metadata: {
          "key": "key_example",
        },
        roles: [
          "roles_example",
        ],
        state: "ACTIVE",
        uid: "uid_example",
        userId: "userId_example",
      },
    ],
  },
};

const data = await apiInstance.jumpboxServiceUpdateUsers(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3UpdateUsersBulkRequest** | **Jumpboxv3UpdateUsersBulkRequest**|  |


### Return type

**Jumpboxv3UpdateUsersBulkResponse**

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


