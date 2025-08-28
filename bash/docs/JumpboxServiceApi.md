# JumpboxServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**jumpboxServiceAuthorize**](JumpboxServiceApi.md#jumpboxServiceAuthorize) | **POST** /api/v3/authorization | Summary: Authorize
Description: Authenticate a user and return a JWT.
[**jumpboxServiceDeleteAccount**](JumpboxServiceApi.md#jumpboxServiceDeleteAccount) | **DELETE** /api/v3/accounts/{account_id} | Summary: Delete account
Description: Delete an account.
[**jumpboxServiceDeleteTenant**](JumpboxServiceApi.md#jumpboxServiceDeleteTenant) | **DELETE** /api/v3/tenants/{tenant_id} | Summary: Delete tenant
Description: Delete a tenant.
[**jumpboxServiceDeleteUser**](JumpboxServiceApi.md#jumpboxServiceDeleteUser) | **DELETE** /api/v3/users/{user_id} | Summary: Delete user
Description: Delete the user.
[**jumpboxServiceGetAccount**](JumpboxServiceApi.md#jumpboxServiceGetAccount) | **GET** /api/v3/accounts/{account_id} | Summary: Get account
Description: Get an account.
[**jumpboxServiceGetAccounts**](JumpboxServiceApi.md#jumpboxServiceGetAccounts) | **GET** /api/v3/accounts | Summary: Get accounts
Description: Get all accounts based on UID.
[**jumpboxServiceGetTenant**](JumpboxServiceApi.md#jumpboxServiceGetTenant) | **GET** /api/v3/tenants/{tenant_id} | Summary: Get tenant
Description: Get a tenant.
[**jumpboxServiceGetTenants**](JumpboxServiceApi.md#jumpboxServiceGetTenants) | **GET** /api/v3/tenants | Summary: Get tenants
Description: Get all tenant base on UID.
[**jumpboxServiceGetUsers**](JumpboxServiceApi.md#jumpboxServiceGetUsers) | **GET** /api/v3/users | Summary: Get users
Description: Get all users base on a tenantID.
[**jumpboxServicePostAccount**](JumpboxServiceApi.md#jumpboxServicePostAccount) | **POST** /api/v3/accounts | Summary: Post account
Description: Create an Account.
[**jumpboxServicePostTenants**](JumpboxServiceApi.md#jumpboxServicePostTenants) | **POST** /api/v3/tenants | Summary: Post tenants
Description: Create a tenant.
[**jumpboxServicePostUsers**](JumpboxServiceApi.md#jumpboxServicePostUsers) | **POST** /api/v3/users | Summary: Post users
Description: Create users.
[**jumpboxServiceResumeAccount**](JumpboxServiceApi.md#jumpboxServiceResumeAccount) | **PATCH** /api/v3/accounts/{account_id}/resume | Summary: Resume account
Description: Resume an account.
[**jumpboxServiceSearchUsers**](JumpboxServiceApi.md#jumpboxServiceSearchUsers) | **POST** /api/v3/users/search | Summary: Search users
Description: Search for all users matching the provided string.
[**jumpboxServiceSuspendAccount**](JumpboxServiceApi.md#jumpboxServiceSuspendAccount) | **PATCH** /api/v3/accounts/{account_id}/suspend | Summary: Suspend Account
Description: Suspend an account
[**jumpboxServiceTestUser**](JumpboxServiceApi.md#jumpboxServiceTestUser) | **POST** /api/v3/users/test | Summary: Test user
Description: Test a user lookup to a given LDAP.
[**jumpboxServiceUpdateAccount**](JumpboxServiceApi.md#jumpboxServiceUpdateAccount) | **PATCH** /api/v3/accounts/{account_id} | Summary: Update Account
Description: Updates an account.
[**jumpboxServiceUpdateTenant**](JumpboxServiceApi.md#jumpboxServiceUpdateTenant) | **PATCH** /api/v3/tenants/{tenant_id} | Summary: Update tenant
Description: Update a tenant.
[**jumpboxServiceUpdateUsers**](JumpboxServiceApi.md#jumpboxServiceUpdateUsers) | **PATCH** /api/v3/users | Summary: Update users
Description: Update an array of users.



## jumpboxServiceAuthorize

Summary: Authorize
Description: Authenticate a user and return a JWT.

### Example

```bash
 jumpboxServiceAuthorize
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceDeleteAccount

Summary: Delete account
Description: Delete an account.

### Example

```bash
 jumpboxServiceDeleteAccount account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** | Account id. | [default to null]

### Return type

[**Jumpboxv3DeleteAccountResponse**](Jumpboxv3DeleteAccountResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceDeleteTenant

Summary: Delete tenant
Description: Delete a tenant.

### Example

```bash
 jumpboxServiceDeleteTenant tenant_id=value  is_permanent_delete=value  async=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Tenant id. | [default to null]
 **isPermanentDelete** | **boolean** | Delete tenant permanently if true. | [optional] [default to null]
 **async** | **boolean** | Async. | [optional] [default to null]

### Return type

**map**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceDeleteUser

Summary: Delete user
Description: Delete the user.

### Example

```bash
 jumpboxServiceDeleteUser user_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string** | The user id. | [default to null]

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceGetAccount

Summary: Get account
Description: Get an account.

### Example

```bash
 jumpboxServiceGetAccount account_id=value  include_inactive=value  include_not_ready=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** | Account id. | [default to null]
 **includeInactive** | **boolean** | Include inactive. | [optional] [default to null]
 **includeNotReady** | **boolean** | Include tenants that are not ready(are in state of being created or deleted). | [optional] [default to null]

### Return type

[**Jumpboxv3GetAccountResponse**](Jumpboxv3GetAccountResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceGetAccounts

Summary: Get accounts
Description: Get all accounts based on UID.

### Example

```bash
 jumpboxServiceGetAccounts  uid=value  external_id=value  include_inactive=value  include_not_ready=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **string** | Email. | [optional] [default to null]
 **externalId** | **string** | External id. | [optional] [default to null]
 **includeInactive** | **boolean** | Include inactive. | [optional] [default to null]
 **includeNotReady** | **boolean** | Include tenants that are not ready(are in state of being created or deleted). | [optional] [default to null]

### Return type

[**Jumpboxv3GetAccountsResponse**](Jumpboxv3GetAccountsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceGetTenant

Summary: Get tenant
Description: Get a tenant.

### Example

```bash
 jumpboxServiceGetTenant tenant_id=value  include_inactive=value  include_not_ready=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Tenant id. | [default to null]
 **includeInactive** | **boolean** | Include inactive. | [optional] [default to null]
 **includeNotReady** | **boolean** | Include tenants that are not ready(are in state of being created or deleted). | [optional] [default to null]

### Return type

[**Jumpboxv3GetTenantResponse**](Jumpboxv3GetTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceGetTenants

Summary: Get tenants
Description: Get all tenant base on UID.

### Example

```bash
 jumpboxServiceGetTenants  uid=value  external_id=value  include_inactive=value  include_not_ready=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **string** | Email. | [optional] [default to null]
 **externalId** | **string** | External id. | [optional] [default to null]
 **includeInactive** | **boolean** | Include inactive. | [optional] [default to null]
 **includeNotReady** | **boolean** | Include tenants that are not ready(are in state of being created or deleted). | [optional] [default to null]

### Return type

[**Jumpboxv3GetTenantsResponse**](Jumpboxv3GetTenantsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceGetUsers

Summary: Get users
Description: Get all users base on a tenantID.

### Example

```bash
 jumpboxServiceGetUsers  uid=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **string** | Email. | [optional] [default to null]

### Return type

[**Tenantuserv3GetUsersResponse**](Tenantuserv3GetUsersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServicePostAccount

Summary: Post account
Description: Create an Account.

### Example

```bash
 jumpboxServicePostAccount
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3PostAccountRequest** | [**Jumpboxv3PostAccountRequest**](Jumpboxv3PostAccountRequest.md) |  |

### Return type

[**Jumpboxv3PostAccountResponse**](Jumpboxv3PostAccountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServicePostTenants

Summary: Post tenants
Description: Create a tenant.

### Example

```bash
 jumpboxServicePostTenants
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServicePostUsers

Summary: Post users
Description: Create users.

### Example

```bash
 jumpboxServicePostUsers
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceResumeAccount

Summary: Resume account
Description: Resume an account.

### Example

```bash
 jumpboxServiceResumeAccount account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** | account_id represents the user's account ID | [default to null]

### Return type

[**Jumpboxv3ResumeAccountResponse**](Jumpboxv3ResumeAccountResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceSearchUsers

Summary: Search users
Description: Search for all users matching the provided string.

### Example

```bash
 jumpboxServiceSearchUsers
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceSuspendAccount

Summary: Suspend Account
Description: Suspend an account

### Example

```bash
 jumpboxServiceSuspendAccount account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** | account_id represents the user's account ID | [default to null]

### Return type

[**Jumpboxv3SuspendAccountResponse**](Jumpboxv3SuspendAccountResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceTestUser

Summary: Test user
Description: Test a user lookup to a given LDAP.

### Example

```bash
 jumpboxServiceTestUser
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceUpdateAccount

Summary: Update Account
Description: Updates an account.

### Example

```bash
 jumpboxServiceUpdateAccount account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** | Account id. | [default to null]
 **jumpboxv3UpdateAccountRequest** | [**Jumpboxv3UpdateAccountRequest**](Jumpboxv3UpdateAccountRequest.md) |  |

### Return type

[**Jumpboxv3UpdateAccountResponse**](Jumpboxv3UpdateAccountResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceUpdateTenant

Summary: Update tenant
Description: Update a tenant.

### Example

```bash
 jumpboxServiceUpdateTenant tenant_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Tenant id. | [default to null]
 **jumpboxv3UpdateTenantRequest** | [**Jumpboxv3UpdateTenantRequest**](Jumpboxv3UpdateTenantRequest.md) |  |

### Return type

[**Jumpboxv3UpdateTenantResponse**](Jumpboxv3UpdateTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## jumpboxServiceUpdateUsers

Summary: Update users
Description: Update an array of users.

### Example

```bash
 jumpboxServiceUpdateUsers
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

