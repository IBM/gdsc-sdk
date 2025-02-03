# TenantuserApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tenantuserCreateAPIKey**](TenantuserApi.md#tenantuserCreateAPIKey) | **POST** /api/v3/apikeys | Summary: Create API key Description: Create API Key. |
| [**tenantuserDeleteAPIKey**](TenantuserApi.md#tenantuserDeleteAPIKey) | **DELETE** /api/v3/apikeys/{id} | Summary: Delete API key Description: Delete APIKey Document based on the document id. |
| [**tenantuserDeleteRole**](TenantuserApi.md#tenantuserDeleteRole) | **DELETE** /api/v3/roles/{role_id} | Summary: Delete role Description: Delete a role. |
| [**tenantuserGetAPIKeys**](TenantuserApi.md#tenantuserGetAPIKeys) | **GET** /api/v3/apikeys | Summary: Get API keys Description: Get all APIKeys base on a tenant ID. |
| [**tenantuserGetCurrentUser**](TenantuserApi.md#tenantuserGetCurrentUser) | **GET** /api/v3/currentuser | Summary: Get current user Description: Return the currently authenticated user. |
| [**tenantuserGetPrivilege**](TenantuserApi.md#tenantuserGetPrivilege) | **GET** /api/v3/privileges/{privilege.privilege_id} | Summary: Get privilege Description: Return privilege. |
| [**tenantuserGetPrivileges**](TenantuserApi.md#tenantuserGetPrivileges) | **GET** /api/v3/privileges | Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles. |
| [**tenantuserGetRole**](TenantuserApi.md#tenantuserGetRole) | **GET** /api/v3/roles/{role_id} | Summary: Get role Description: Return single role. |
| [**tenantuserGetRoles**](TenantuserApi.md#tenantuserGetRoles) | **GET** /api/v3/roles | Summary: Get roles Description: Return all roles without privileges. |
| [**tenantuserGetUser**](TenantuserApi.md#tenantuserGetUser) | **GET** /api/v3/users/user/{user_id} | Summary: Get user Description: Return full user for specified user_id. |
| [**tenantuserGetUserNames**](TenantuserApi.md#tenantuserGetUserNames) | **POST** /api/v3/users/names | Summary: Get user names Description: Get user names. |
| [**tenantuserGetUserTenant**](TenantuserApi.md#tenantuserGetUserTenant) | **GET** /api/v3/users/tenant/{user_id} | Summary: Get user tenant Description: Return the user plus tenant information. |
| [**tenantuserPostPrivilegesBulk**](TenantuserApi.md#tenantuserPostPrivilegesBulk) | **POST** /api/v3/privileges | Summary: Post privileges bulk Description: Perform bulk user add preivilege. |
| [**tenantuserPostRole**](TenantuserApi.md#tenantuserPostRole) | **POST** /api/v3/roles | Summary: Post role Description: Create a new role. |
| [**tenantuserUpdatePrivilege**](TenantuserApi.md#tenantuserUpdatePrivilege) | **PATCH** /api/v3/privileges/{privilege_id} | Summary: Update privilege Description: Update privilege. |
| [**tenantuserUpdatePrivilegesRoleBulk**](TenantuserApi.md#tenantuserUpdatePrivilegesRoleBulk) | **PATCH** /api/v3/privileges | Summary: Update privileges role bulk Description: Perform bulk user update role. |
| [**tenantuserUpdateRole**](TenantuserApi.md#tenantuserUpdateRole) | **PATCH** /api/v3/roles/{role_id} | Summary: Update role Description: Update single role. |
| [**tenantuserUpdateUserRoleBulk**](TenantuserApi.md#tenantuserUpdateUserRoleBulk) | **PATCH** /api/v3/users/role | Summary: Update user role bulk Description: Perform bulk user add or remove role. |


<a id="tenantuserCreateAPIKey"></a>
# **tenantuserCreateAPIKey**
> Tenantuserv3CreateApiKeyResponse tenantuserCreateAPIKey(tenantuserv3CreateApiKeyRequest)

Summary: Create API key Description: Create API Key.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    Tenantuserv3CreateApiKeyRequest tenantuserv3CreateApiKeyRequest = new Tenantuserv3CreateApiKeyRequest(); // Tenantuserv3CreateApiKeyRequest | 
    try {
      Tenantuserv3CreateApiKeyResponse result = apiInstance.tenantuserCreateAPIKey(tenantuserv3CreateApiKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserCreateAPIKey");
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
| **tenantuserv3CreateApiKeyRequest** | [**Tenantuserv3CreateApiKeyRequest**](Tenantuserv3CreateApiKeyRequest.md)|  | |

### Return type

[**Tenantuserv3CreateApiKeyResponse**](Tenantuserv3CreateApiKeyResponse.md)

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

<a id="tenantuserDeleteAPIKey"></a>
# **tenantuserDeleteAPIKey**
> Object tenantuserDeleteAPIKey(id)

Summary: Delete API key Description: Delete APIKey Document based on the document id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    String id = "id_example"; // String | Apikey id.
    try {
      Object result = apiInstance.tenantuserDeleteAPIKey(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserDeleteAPIKey");
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
| **id** | **String**| Apikey id. | |

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

<a id="tenantuserDeleteRole"></a>
# **tenantuserDeleteRole**
> Object tenantuserDeleteRole(roleId)

Summary: Delete role Description: Delete a role.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    String roleId = "roleId_example"; // String | ID or role deleted.
    try {
      Object result = apiInstance.tenantuserDeleteRole(roleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserDeleteRole");
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
| **roleId** | **String**| ID or role deleted. | |

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

<a id="tenantuserGetAPIKeys"></a>
# **tenantuserGetAPIKeys**
> Tenantuserv3GetApiKeysResponse tenantuserGetAPIKeys()

Summary: Get API keys Description: Get all APIKeys base on a tenant ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    try {
      Tenantuserv3GetApiKeysResponse result = apiInstance.tenantuserGetAPIKeys();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserGetAPIKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetApiKeysResponse**](Tenantuserv3GetApiKeysResponse.md)

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

<a id="tenantuserGetCurrentUser"></a>
# **tenantuserGetCurrentUser**
> Tenantuserv3GetCurrentUserResponse tenantuserGetCurrentUser()

Summary: Get current user Description: Return the currently authenticated user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    try {
      Tenantuserv3GetCurrentUserResponse result = apiInstance.tenantuserGetCurrentUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserGetCurrentUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetCurrentUserResponse**](Tenantuserv3GetCurrentUserResponse.md)

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

<a id="tenantuserGetPrivilege"></a>
# **tenantuserGetPrivilege**
> Tenantuserv3GetPrivilegeResponse tenantuserGetPrivilege(privilegePrivilegeId, privilegeType)

Summary: Get privilege Description: Return privilege.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    String privilegePrivilegeId = "privilegePrivilegeId_example"; // String | Privilege ID.
    String privilegeType = "privilegeType_example"; // String | Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined.
    try {
      Tenantuserv3GetPrivilegeResponse result = apiInstance.tenantuserGetPrivilege(privilegePrivilegeId, privilegeType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserGetPrivilege");
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
| **privilegePrivilegeId** | **String**| Privilege ID. | |
| **privilegeType** | **String**| Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. | [optional] |

### Return type

[**Tenantuserv3GetPrivilegeResponse**](Tenantuserv3GetPrivilegeResponse.md)

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

<a id="tenantuserGetPrivileges"></a>
# **tenantuserGetPrivileges**
> Tenantuserv3GetPrivilegesResponse tenantuserGetPrivileges(roles, type)

Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    List<String> roles = Arrays.asList(); // List<String> | If empty, will return all privileges.
    String type = "type_example"; // String | Type of privilege to return: group, page, permission, report, restapi, etc.
    try {
      Tenantuserv3GetPrivilegesResponse result = apiInstance.tenantuserGetPrivileges(roles, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserGetPrivileges");
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
| **roles** | [**List&lt;String&gt;**](String.md)| If empty, will return all privileges. | [optional] |
| **type** | **String**| Type of privilege to return: group, page, permission, report, restapi, etc. | [optional] |

### Return type

[**Tenantuserv3GetPrivilegesResponse**](Tenantuserv3GetPrivilegesResponse.md)

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

<a id="tenantuserGetRole"></a>
# **tenantuserGetRole**
> Tenantuserv3Role tenantuserGetRole(roleId)

Summary: Get role Description: Return single role.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    String roleId = "roleId_example"; // String | ID of role to be returned.
    try {
      Tenantuserv3Role result = apiInstance.tenantuserGetRole(roleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserGetRole");
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
| **roleId** | **String**| ID of role to be returned. | |

### Return type

[**Tenantuserv3Role**](Tenantuserv3Role.md)

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

<a id="tenantuserGetRoles"></a>
# **tenantuserGetRoles**
> Tenantuserv3GetRolesResponse tenantuserGetRoles()

Summary: Get roles Description: Return all roles without privileges.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    try {
      Tenantuserv3GetRolesResponse result = apiInstance.tenantuserGetRoles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserGetRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetRolesResponse**](Tenantuserv3GetRolesResponse.md)

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

<a id="tenantuserGetUser"></a>
# **tenantuserGetUser**
> Tenantuserv3GetUserResponse tenantuserGetUser(userId)

Summary: Get user Description: Return full user for specified user_id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    String userId = "userId_example"; // String | User id defaults to the current user or specify \"current\" or an actual user id.
    try {
      Tenantuserv3GetUserResponse result = apiInstance.tenantuserGetUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserGetUser");
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
| **userId** | **String**| User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | |

### Return type

[**Tenantuserv3GetUserResponse**](Tenantuserv3GetUserResponse.md)

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

<a id="tenantuserGetUserNames"></a>
# **tenantuserGetUserNames**
> Tenantuserv3GetUserNamesResponse tenantuserGetUserNames(tenantuserv3GetUserNamesRequest)

Summary: Get user names Description: Get user names.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    Tenantuserv3GetUserNamesRequest tenantuserv3GetUserNamesRequest = new Tenantuserv3GetUserNamesRequest(); // Tenantuserv3GetUserNamesRequest | 
    try {
      Tenantuserv3GetUserNamesResponse result = apiInstance.tenantuserGetUserNames(tenantuserv3GetUserNamesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserGetUserNames");
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
| **tenantuserv3GetUserNamesRequest** | [**Tenantuserv3GetUserNamesRequest**](Tenantuserv3GetUserNamesRequest.md)|  | |

### Return type

[**Tenantuserv3GetUserNamesResponse**](Tenantuserv3GetUserNamesResponse.md)

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

<a id="tenantuserGetUserTenant"></a>
# **tenantuserGetUserTenant**
> Tenantuserv3GetUserTenantResponse tenantuserGetUserTenant(userId)

Summary: Get user tenant Description: Return the user plus tenant information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    String userId = "userId_example"; // String | User id defaults to the current user or specify \"current\" or an actual user id.
    try {
      Tenantuserv3GetUserTenantResponse result = apiInstance.tenantuserGetUserTenant(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserGetUserTenant");
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
| **userId** | **String**| User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | |

### Return type

[**Tenantuserv3GetUserTenantResponse**](Tenantuserv3GetUserTenantResponse.md)

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

<a id="tenantuserPostPrivilegesBulk"></a>
# **tenantuserPostPrivilegesBulk**
> Tenantuserv3PostPrivilegesBulkResponse tenantuserPostPrivilegesBulk(tenantuserv3PostPrivilegesBulkRequest)

Summary: Post privileges bulk Description: Perform bulk user add preivilege.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    Tenantuserv3PostPrivilegesBulkRequest tenantuserv3PostPrivilegesBulkRequest = new Tenantuserv3PostPrivilegesBulkRequest(); // Tenantuserv3PostPrivilegesBulkRequest | 
    try {
      Tenantuserv3PostPrivilegesBulkResponse result = apiInstance.tenantuserPostPrivilegesBulk(tenantuserv3PostPrivilegesBulkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserPostPrivilegesBulk");
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
| **tenantuserv3PostPrivilegesBulkRequest** | [**Tenantuserv3PostPrivilegesBulkRequest**](Tenantuserv3PostPrivilegesBulkRequest.md)|  | |

### Return type

[**Tenantuserv3PostPrivilegesBulkResponse**](Tenantuserv3PostPrivilegesBulkResponse.md)

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

<a id="tenantuserPostRole"></a>
# **tenantuserPostRole**
> Tenantuserv3PostRoleResponse tenantuserPostRole(tenantuserv3PostRoleRequest)

Summary: Post role Description: Create a new role.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    Tenantuserv3PostRoleRequest tenantuserv3PostRoleRequest = new Tenantuserv3PostRoleRequest(); // Tenantuserv3PostRoleRequest | 
    try {
      Tenantuserv3PostRoleResponse result = apiInstance.tenantuserPostRole(tenantuserv3PostRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserPostRole");
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
| **tenantuserv3PostRoleRequest** | [**Tenantuserv3PostRoleRequest**](Tenantuserv3PostRoleRequest.md)|  | |

### Return type

[**Tenantuserv3PostRoleResponse**](Tenantuserv3PostRoleResponse.md)

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

<a id="tenantuserUpdatePrivilege"></a>
# **tenantuserUpdatePrivilege**
> Tenantuserv3UpdatePrivilegeResponse tenantuserUpdatePrivilege(privilegeId, tenantuserv3UpdatePrivilegeRequest)

Summary: Update privilege Description: Update privilege.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    String privilegeId = "privilegeId_example"; // String | Permanent id of the privilege to be updated or created.
    Tenantuserv3UpdatePrivilegeRequest tenantuserv3UpdatePrivilegeRequest = new Tenantuserv3UpdatePrivilegeRequest(); // Tenantuserv3UpdatePrivilegeRequest | 
    try {
      Tenantuserv3UpdatePrivilegeResponse result = apiInstance.tenantuserUpdatePrivilege(privilegeId, tenantuserv3UpdatePrivilegeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserUpdatePrivilege");
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
| **privilegeId** | **String**| Permanent id of the privilege to be updated or created. | |
| **tenantuserv3UpdatePrivilegeRequest** | [**Tenantuserv3UpdatePrivilegeRequest**](Tenantuserv3UpdatePrivilegeRequest.md)|  | |

### Return type

[**Tenantuserv3UpdatePrivilegeResponse**](Tenantuserv3UpdatePrivilegeResponse.md)

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

<a id="tenantuserUpdatePrivilegesRoleBulk"></a>
# **tenantuserUpdatePrivilegesRoleBulk**
> Tenantuserv3UpdatePrivilegesBulkResponse tenantuserUpdatePrivilegesRoleBulk(tenantuserv3UpdatePrivilegesBulkRequest)

Summary: Update privileges role bulk Description: Perform bulk user update role.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    Tenantuserv3UpdatePrivilegesBulkRequest tenantuserv3UpdatePrivilegesBulkRequest = new Tenantuserv3UpdatePrivilegesBulkRequest(); // Tenantuserv3UpdatePrivilegesBulkRequest | 
    try {
      Tenantuserv3UpdatePrivilegesBulkResponse result = apiInstance.tenantuserUpdatePrivilegesRoleBulk(tenantuserv3UpdatePrivilegesBulkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserUpdatePrivilegesRoleBulk");
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
| **tenantuserv3UpdatePrivilegesBulkRequest** | [**Tenantuserv3UpdatePrivilegesBulkRequest**](Tenantuserv3UpdatePrivilegesBulkRequest.md)|  | |

### Return type

[**Tenantuserv3UpdatePrivilegesBulkResponse**](Tenantuserv3UpdatePrivilegesBulkResponse.md)

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

<a id="tenantuserUpdateRole"></a>
# **tenantuserUpdateRole**
> Tenantuserv3UpdateRoleResponse tenantuserUpdateRole(roleId, tenantuserv3UpdateRoleRequest)

Summary: Update role Description: Update single role.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    String roleId = "roleId_example"; // String | Permanent id of the role.
    Tenantuserv3UpdateRoleRequest tenantuserv3UpdateRoleRequest = new Tenantuserv3UpdateRoleRequest(); // Tenantuserv3UpdateRoleRequest | 
    try {
      Tenantuserv3UpdateRoleResponse result = apiInstance.tenantuserUpdateRole(roleId, tenantuserv3UpdateRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserUpdateRole");
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
| **roleId** | **String**| Permanent id of the role. | |
| **tenantuserv3UpdateRoleRequest** | [**Tenantuserv3UpdateRoleRequest**](Tenantuserv3UpdateRoleRequest.md)|  | |

### Return type

[**Tenantuserv3UpdateRoleResponse**](Tenantuserv3UpdateRoleResponse.md)

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

<a id="tenantuserUpdateUserRoleBulk"></a>
# **tenantuserUpdateUserRoleBulk**
> Tenantuserv3UpdateUserRoleBulkResponse tenantuserUpdateUserRoleBulk(tenantuserv3UpdateUserRoleBulkRequest)

Summary: Update user role bulk Description: Perform bulk user add or remove role.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantuserApi;

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

    TenantuserApi apiInstance = new TenantuserApi(defaultClient);
    Tenantuserv3UpdateUserRoleBulkRequest tenantuserv3UpdateUserRoleBulkRequest = new Tenantuserv3UpdateUserRoleBulkRequest(); // Tenantuserv3UpdateUserRoleBulkRequest | 
    try {
      Tenantuserv3UpdateUserRoleBulkResponse result = apiInstance.tenantuserUpdateUserRoleBulk(tenantuserv3UpdateUserRoleBulkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantuserApi#tenantuserUpdateUserRoleBulk");
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
| **tenantuserv3UpdateUserRoleBulkRequest** | [**Tenantuserv3UpdateUserRoleBulkRequest**](Tenantuserv3UpdateUserRoleBulkRequest.md)|  | |

### Return type

[**Tenantuserv3UpdateUserRoleBulkResponse**](Tenantuserv3UpdateUserRoleBulkResponse.md)

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

