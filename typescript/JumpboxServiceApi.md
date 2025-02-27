# .JumpboxServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jumpboxServiceAuthorize**](JumpboxServiceApi.md#jumpboxServiceAuthorize) | **POST** /api/v3/authorization | Summary: Authorize Description: Authenticate a user and return a JWT.
[**jumpboxServiceDeleteTenant**](JumpboxServiceApi.md#jumpboxServiceDeleteTenant) | **DELETE** /api/v3/tenants/{tenant_id} | Summary: Delete tenant Description: Delete a tenant.
[**jumpboxServiceDeleteUser**](JumpboxServiceApi.md#jumpboxServiceDeleteUser) | **DELETE** /api/v3/users/{user_id} | Summary: Delete user Description: Delete the user.
[**jumpboxServiceGetTenant**](JumpboxServiceApi.md#jumpboxServiceGetTenant) | **GET** /api/v3/tenants/{tenant_id} | Summary: Get tenant Description: Get a tenant.
[**jumpboxServiceGetTenants**](JumpboxServiceApi.md#jumpboxServiceGetTenants) | **GET** /api/v3/tenants | Summary: Get tenants Description: Get all tenant base on UID.
[**jumpboxServiceGetUsers**](JumpboxServiceApi.md#jumpboxServiceGetUsers) | **GET** /api/v3/users | Summary: Get users Description: Get all users base on a tenantID.
[**jumpboxServicePostTenants**](JumpboxServiceApi.md#jumpboxServicePostTenants) | **POST** /api/v3/tenants | Summary: Post tenants Description: Create a tenant.
[**jumpboxServicePostUsers**](JumpboxServiceApi.md#jumpboxServicePostUsers) | **POST** /api/v3/users | Summary: Post users Description: Create users.
[**jumpboxServiceSearchUsers**](JumpboxServiceApi.md#jumpboxServiceSearchUsers) | **POST** /api/v3/users/search | Summary: Search users Description: Search for all users matching the provided string.
[**jumpboxServiceTestUser**](JumpboxServiceApi.md#jumpboxServiceTestUser) | **POST** /api/v3/users/test | Summary: Test user Description: Test a user lookup to a given LDAP.
[**jumpboxServiceUpdateTenant**](JumpboxServiceApi.md#jumpboxServiceUpdateTenant) | **PATCH** /api/v3/tenants/{tenant_id} | Summary: Update tenant Description: Update a tenant.
[**jumpboxServiceUpdateUsers**](JumpboxServiceApi.md#jumpboxServiceUpdateUsers) | **PATCH** /api/v3/users | Summary: Update users Description: Update an array of users.


# **jumpboxServiceAuthorize**
> Jumpboxv3AuthorizeResponse jumpboxServiceAuthorize(jumpboxv3AuthorizeRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceAuthorizeRequest = {
  // Jumpboxv3AuthorizeRequest
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

apiInstance.jumpboxServiceAuthorize(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

# **jumpboxServiceDeleteTenant**
> any jumpboxServiceDeleteTenant()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceDeleteTenantRequest = {
  // string | Tenant id.
  tenantId: "tenant_id_example",
  // boolean | Delete tenant permanently if true. (optional)
  isPermanentDelete: true,
  // boolean | Async. (optional)
  async: true,
};

apiInstance.jumpboxServiceDeleteTenant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceDeleteUserRequest = {
  // string | The user id.
  userId: "user_id_example",
};

apiInstance.jumpboxServiceDeleteUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

# **jumpboxServiceGetTenant**
> Jumpboxv3GetTenantResponse jumpboxServiceGetTenant()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceGetTenantRequest = {
  // string | Tenant id.
  tenantId: "tenant_id_example",
  // boolean | Include inactive. (optional)
  includeInactive: true,
  // boolean | Include tenants that are not ready(are in state of being created or deleted). (optional)
  includeNotReady: true,
};

apiInstance.jumpboxServiceGetTenant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceGetTenantsRequest = {
  // string | Email. (optional)
  uid: "uid_example",
  // string | External id. (optional)
  externalId: "external_id_example",
  // boolean | Include inactive. (optional)
  includeInactive: true,
  // boolean | Include tenants that are not ready(are in state of being created or deleted). (optional)
  includeNotReady: true,
};

apiInstance.jumpboxServiceGetTenants(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceGetUsersRequest = {
  // string | Email. (optional)
  uid: "uid_example",
};

apiInstance.jumpboxServiceGetUsers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

# **jumpboxServicePostTenants**
> Jumpboxv3PostTenantsResponse jumpboxServicePostTenants(jumpboxv3PostTenantsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServicePostTenantsRequest = {
  // Jumpboxv3PostTenantsRequest
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

apiInstance.jumpboxServicePostTenants(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServicePostUsersRequest = {
  // Jumpboxv3PostUsersBulkRequest
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

apiInstance.jumpboxServicePostUsers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

# **jumpboxServiceSearchUsers**
> Jumpboxv3SearchUsersResponse jumpboxServiceSearchUsers(jumpboxv3SearchUsersRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceSearchUsersRequest = {
  // Jumpboxv3SearchUsersRequest
  jumpboxv3SearchUsersRequest: {
    searchString: "searchString_example",
  },
};

apiInstance.jumpboxServiceSearchUsers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

# **jumpboxServiceTestUser**
> Jumpboxv3TestUserResponse jumpboxServiceTestUser(jumpboxv3TestUserRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceTestUserRequest = {
  // Jumpboxv3TestUserRequest
  jumpboxv3TestUserRequest: {
    ldapId: "ldapId_example",
    uid: "uid_example",
  },
};

apiInstance.jumpboxServiceTestUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

# **jumpboxServiceUpdateTenant**
> Jumpboxv3UpdateTenantResponse jumpboxServiceUpdateTenant(jumpboxv3UpdateTenantRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceUpdateTenantRequest = {
  // string | Tenant id.
  tenantId: "tenant_id_example",
  // Jumpboxv3UpdateTenantRequest
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

apiInstance.jumpboxServiceUpdateTenant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceUpdateUsersRequest = {
  // Jumpboxv3UpdateUsersBulkRequest
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

apiInstance.jumpboxServiceUpdateUsers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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


