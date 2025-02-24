# JumpboxServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**jumpboxServiceAuthorize**](JumpboxServiceApi.md#jumpboxServiceAuthorize) | **POST** /api/v3/authorization | Summary: Authorize Description: Authenticate a user and return a JWT. |
| [**jumpboxServiceDeleteTenant**](JumpboxServiceApi.md#jumpboxServiceDeleteTenant) | **DELETE** /api/v3/tenants/{tenant_id} | Summary: Delete tenant Description: Delete a tenant. |
| [**jumpboxServiceDeleteUser**](JumpboxServiceApi.md#jumpboxServiceDeleteUser) | **DELETE** /api/v3/users/{user_id} | Summary: Delete user Description: Delete the user. |
| [**jumpboxServiceGetTenant**](JumpboxServiceApi.md#jumpboxServiceGetTenant) | **GET** /api/v3/tenants/{tenant_id} | Summary: Get tenant Description: Get a tenant. |
| [**jumpboxServiceGetTenants**](JumpboxServiceApi.md#jumpboxServiceGetTenants) | **GET** /api/v3/tenants | Summary: Get tenants Description: Get all tenant base on UID. |
| [**jumpboxServiceGetUsers**](JumpboxServiceApi.md#jumpboxServiceGetUsers) | **GET** /api/v3/users | Summary: Get users Description: Get all users base on a tenantID. |
| [**jumpboxServicePostTenants**](JumpboxServiceApi.md#jumpboxServicePostTenants) | **POST** /api/v3/tenants | Summary: Post tenants Description: Create a tenant. |
| [**jumpboxServicePostUsers**](JumpboxServiceApi.md#jumpboxServicePostUsers) | **POST** /api/v3/users | Summary: Post users Description: Create users. |
| [**jumpboxServiceSearchUsers**](JumpboxServiceApi.md#jumpboxServiceSearchUsers) | **POST** /api/v3/users/search | Summary: Search users Description: Search for all users matching the provided string. |
| [**jumpboxServiceTestUser**](JumpboxServiceApi.md#jumpboxServiceTestUser) | **POST** /api/v3/users/test | Summary: Test user Description: Test a user lookup to a given LDAP. |
| [**jumpboxServiceUpdateTenant**](JumpboxServiceApi.md#jumpboxServiceUpdateTenant) | **PATCH** /api/v3/tenants/{tenant_id} | Summary: Update tenant Description: Update a tenant. |
| [**jumpboxServiceUpdateUsers**](JumpboxServiceApi.md#jumpboxServiceUpdateUsers) | **PATCH** /api/v3/users | Summary: Update users Description: Update an array of users. |


<a id="jumpboxServiceAuthorize"></a>
# **jumpboxServiceAuthorize**
> Jumpboxv3AuthorizeResponse jumpboxServiceAuthorize(jumpboxv3AuthorizeRequest)

Summary: Authorize Description: Authenticate a user and return a JWT.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    Jumpboxv3AuthorizeRequest jumpboxv3AuthorizeRequest = new Jumpboxv3AuthorizeRequest(); // Jumpboxv3AuthorizeRequest | 
    try {
      Jumpboxv3AuthorizeResponse result = apiInstance.jumpboxServiceAuthorize(jumpboxv3AuthorizeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServiceAuthorize");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jumpboxv3AuthorizeRequest** | [**Jumpboxv3AuthorizeRequest**](Jumpboxv3AuthorizeRequest.md)|  | |

### Return type

[**Jumpboxv3AuthorizeResponse**](Jumpboxv3AuthorizeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="jumpboxServiceDeleteTenant"></a>
# **jumpboxServiceDeleteTenant**
> Object jumpboxServiceDeleteTenant(tenantId, isPermanentDelete, async)

Summary: Delete tenant Description: Delete a tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | Tenant id.
    Boolean isPermanentDelete = true; // Boolean | Delete tenant permanently if true.
    Boolean async = true; // Boolean | Async.
    try {
      Object result = apiInstance.jumpboxServiceDeleteTenant(tenantId, isPermanentDelete, async);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServiceDeleteTenant");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| Tenant id. | |
| **isPermanentDelete** | **Boolean**| Delete tenant permanently if true. | [optional] |
| **async** | **Boolean**| Async. | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="jumpboxServiceDeleteUser"></a>
# **jumpboxServiceDeleteUser**
> Object jumpboxServiceDeleteUser(userId)

Summary: Delete user Description: Delete the user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    String userId = "userId_example"; // String | The user id.
    try {
      Object result = apiInstance.jumpboxServiceDeleteUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServiceDeleteUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The user id. | |

### Return type

**Object**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="jumpboxServiceGetTenant"></a>
# **jumpboxServiceGetTenant**
> Jumpboxv3GetTenantResponse jumpboxServiceGetTenant(tenantId, includeInactive, includeNotReady)

Summary: Get tenant Description: Get a tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | Tenant id.
    Boolean includeInactive = true; // Boolean | Include inactive.
    Boolean includeNotReady = true; // Boolean | Include tenants that are not ready(are in state of being created or deleted).
    try {
      Jumpboxv3GetTenantResponse result = apiInstance.jumpboxServiceGetTenant(tenantId, includeInactive, includeNotReady);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServiceGetTenant");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| Tenant id. | |
| **includeInactive** | **Boolean**| Include inactive. | [optional] |
| **includeNotReady** | **Boolean**| Include tenants that are not ready(are in state of being created or deleted). | [optional] |

### Return type

[**Jumpboxv3GetTenantResponse**](Jumpboxv3GetTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="jumpboxServiceGetTenants"></a>
# **jumpboxServiceGetTenants**
> Jumpboxv3GetTenantsResponse jumpboxServiceGetTenants(uid, externalId, includeInactive, includeNotReady)

Summary: Get tenants Description: Get all tenant base on UID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    String uid = "uid_example"; // String | Email.
    String externalId = "externalId_example"; // String | External id.
    Boolean includeInactive = true; // Boolean | Include inactive.
    Boolean includeNotReady = true; // Boolean | Include tenants that are not ready(are in state of being created or deleted).
    try {
      Jumpboxv3GetTenantsResponse result = apiInstance.jumpboxServiceGetTenants(uid, externalId, includeInactive, includeNotReady);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServiceGetTenants");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uid** | **String**| Email. | [optional] |
| **externalId** | **String**| External id. | [optional] |
| **includeInactive** | **Boolean**| Include inactive. | [optional] |
| **includeNotReady** | **Boolean**| Include tenants that are not ready(are in state of being created or deleted). | [optional] |

### Return type

[**Jumpboxv3GetTenantsResponse**](Jumpboxv3GetTenantsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="jumpboxServiceGetUsers"></a>
# **jumpboxServiceGetUsers**
> Tenantuserv3GetUsersResponse jumpboxServiceGetUsers(uid)

Summary: Get users Description: Get all users base on a tenantID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    String uid = "uid_example"; // String | Email.
    try {
      Tenantuserv3GetUsersResponse result = apiInstance.jumpboxServiceGetUsers(uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServiceGetUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uid** | **String**| Email. | [optional] |

### Return type

[**Tenantuserv3GetUsersResponse**](Tenantuserv3GetUsersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="jumpboxServicePostTenants"></a>
# **jumpboxServicePostTenants**
> Jumpboxv3PostTenantsResponse jumpboxServicePostTenants(jumpboxv3PostTenantsRequest)

Summary: Post tenants Description: Create a tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    Jumpboxv3PostTenantsRequest jumpboxv3PostTenantsRequest = new Jumpboxv3PostTenantsRequest(); // Jumpboxv3PostTenantsRequest | 
    try {
      Jumpboxv3PostTenantsResponse result = apiInstance.jumpboxServicePostTenants(jumpboxv3PostTenantsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServicePostTenants");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jumpboxv3PostTenantsRequest** | [**Jumpboxv3PostTenantsRequest**](Jumpboxv3PostTenantsRequest.md)|  | |

### Return type

[**Jumpboxv3PostTenantsResponse**](Jumpboxv3PostTenantsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="jumpboxServicePostUsers"></a>
# **jumpboxServicePostUsers**
> Jumpboxv3PostUsersBulkResponse jumpboxServicePostUsers(jumpboxv3PostUsersBulkRequest)

Summary: Post users Description: Create users.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    Jumpboxv3PostUsersBulkRequest jumpboxv3PostUsersBulkRequest = new Jumpboxv3PostUsersBulkRequest(); // Jumpboxv3PostUsersBulkRequest | 
    try {
      Jumpboxv3PostUsersBulkResponse result = apiInstance.jumpboxServicePostUsers(jumpboxv3PostUsersBulkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServicePostUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jumpboxv3PostUsersBulkRequest** | [**Jumpboxv3PostUsersBulkRequest**](Jumpboxv3PostUsersBulkRequest.md)|  | |

### Return type

[**Jumpboxv3PostUsersBulkResponse**](Jumpboxv3PostUsersBulkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="jumpboxServiceSearchUsers"></a>
# **jumpboxServiceSearchUsers**
> Jumpboxv3SearchUsersResponse jumpboxServiceSearchUsers(jumpboxv3SearchUsersRequest)

Summary: Search users Description: Search for all users matching the provided string.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    Jumpboxv3SearchUsersRequest jumpboxv3SearchUsersRequest = new Jumpboxv3SearchUsersRequest(); // Jumpboxv3SearchUsersRequest | 
    try {
      Jumpboxv3SearchUsersResponse result = apiInstance.jumpboxServiceSearchUsers(jumpboxv3SearchUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServiceSearchUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jumpboxv3SearchUsersRequest** | [**Jumpboxv3SearchUsersRequest**](Jumpboxv3SearchUsersRequest.md)|  | |

### Return type

[**Jumpboxv3SearchUsersResponse**](Jumpboxv3SearchUsersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="jumpboxServiceTestUser"></a>
# **jumpboxServiceTestUser**
> Jumpboxv3TestUserResponse jumpboxServiceTestUser(jumpboxv3TestUserRequest)

Summary: Test user Description: Test a user lookup to a given LDAP.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    Jumpboxv3TestUserRequest jumpboxv3TestUserRequest = new Jumpboxv3TestUserRequest(); // Jumpboxv3TestUserRequest | 
    try {
      Jumpboxv3TestUserResponse result = apiInstance.jumpboxServiceTestUser(jumpboxv3TestUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServiceTestUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jumpboxv3TestUserRequest** | [**Jumpboxv3TestUserRequest**](Jumpboxv3TestUserRequest.md)|  | |

### Return type

[**Jumpboxv3TestUserResponse**](Jumpboxv3TestUserResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="jumpboxServiceUpdateTenant"></a>
# **jumpboxServiceUpdateTenant**
> Jumpboxv3UpdateTenantResponse jumpboxServiceUpdateTenant(tenantId, jumpboxv3UpdateTenantRequest)

Summary: Update tenant Description: Update a tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | Tenant id.
    Jumpboxv3UpdateTenantRequest jumpboxv3UpdateTenantRequest = new Jumpboxv3UpdateTenantRequest(); // Jumpboxv3UpdateTenantRequest | 
    try {
      Jumpboxv3UpdateTenantResponse result = apiInstance.jumpboxServiceUpdateTenant(tenantId, jumpboxv3UpdateTenantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServiceUpdateTenant");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| Tenant id. | |
| **jumpboxv3UpdateTenantRequest** | [**Jumpboxv3UpdateTenantRequest**](Jumpboxv3UpdateTenantRequest.md)|  | |

### Return type

[**Jumpboxv3UpdateTenantResponse**](Jumpboxv3UpdateTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="jumpboxServiceUpdateUsers"></a>
# **jumpboxServiceUpdateUsers**
> Jumpboxv3UpdateUsersBulkResponse jumpboxServiceUpdateUsers(jumpboxv3UpdateUsersBulkRequest)

Summary: Update users Description: Update an array of users.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JumpboxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);
    Jumpboxv3UpdateUsersBulkRequest jumpboxv3UpdateUsersBulkRequest = new Jumpboxv3UpdateUsersBulkRequest(); // Jumpboxv3UpdateUsersBulkRequest | 
    try {
      Jumpboxv3UpdateUsersBulkResponse result = apiInstance.jumpboxServiceUpdateUsers(jumpboxv3UpdateUsersBulkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JumpboxServiceApi#jumpboxServiceUpdateUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jumpboxv3UpdateUsersBulkRequest** | [**Jumpboxv3UpdateUsersBulkRequest**](Jumpboxv3UpdateUsersBulkRequest.md)|  | |

### Return type

[**Jumpboxv3UpdateUsersBulkResponse**](Jumpboxv3UpdateUsersBulkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

