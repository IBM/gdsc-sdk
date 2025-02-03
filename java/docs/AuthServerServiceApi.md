# AuthServerServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authServerServiceCreateOauthClient**](AuthServerServiceApi.md#authServerServiceCreateOauthClient) | **POST** /api/v3/oauth/clients | Summary: Create Oauth client Description: Create/register new Oauth client. |
| [**authServerServiceDeleteOauthClient**](AuthServerServiceApi.md#authServerServiceDeleteOauthClient) | **DELETE** /api/v3/oauth/clients/{client_id} | Summary: Delete Oauth client Description: Delete registered Oauth client by clientId. |
| [**authServerServiceGetAccessToken**](AuthServerServiceApi.md#authServerServiceGetAccessToken) | **GET** /api/v3/oauth/token | Summary: Get access token Description: Get access token from passed clientId and secret. |
| [**authServerServiceGetOauthClient**](AuthServerServiceApi.md#authServerServiceGetOauthClient) | **GET** /api/v3/oauth/clients/{client_id} | Summary: Get Oauth client Description: Get registered Oauth client by clientId. |
| [**authServerServiceGetUser**](AuthServerServiceApi.md#authServerServiceGetUser) | **GET** /api/v3/auth/user | Summary: Get user Description: Get user. |
| [**authServerServiceListOauthClient**](AuthServerServiceApi.md#authServerServiceListOauthClient) | **GET** /api/v3/oauth/clients | Summary: List Oauth client Description: List all registered Oauth client. |


<a id="authServerServiceCreateOauthClient"></a>
# **authServerServiceCreateOauthClient**
> AuthserverCreateOauthClientResponse authServerServiceCreateOauthClient(authserverCreateOauthClientRequest)

Summary: Create Oauth client Description: Create/register new Oauth client.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthServerServiceApi;

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

    AuthServerServiceApi apiInstance = new AuthServerServiceApi(defaultClient);
    AuthserverCreateOauthClientRequest authserverCreateOauthClientRequest = new AuthserverCreateOauthClientRequest(); // AuthserverCreateOauthClientRequest | 
    try {
      AuthserverCreateOauthClientResponse result = apiInstance.authServerServiceCreateOauthClient(authserverCreateOauthClientRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerServiceApi#authServerServiceCreateOauthClient");
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
| **authserverCreateOauthClientRequest** | [**AuthserverCreateOauthClientRequest**](AuthserverCreateOauthClientRequest.md)|  | |

### Return type

[**AuthserverCreateOauthClientResponse**](AuthserverCreateOauthClientResponse.md)

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

<a id="authServerServiceDeleteOauthClient"></a>
# **authServerServiceDeleteOauthClient**
> Object authServerServiceDeleteOauthClient(clientId)

Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthServerServiceApi;

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

    AuthServerServiceApi apiInstance = new AuthServerServiceApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientID of registered OAuth.
    try {
      Object result = apiInstance.authServerServiceDeleteOauthClient(clientId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerServiceApi#authServerServiceDeleteOauthClient");
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
| **clientId** | **String**| ClientID of registered OAuth. | |

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

<a id="authServerServiceGetAccessToken"></a>
# **authServerServiceGetAccessToken**
> AuthserverGetAccessTokenResponse authServerServiceGetAccessToken()

Summary: Get access token Description: Get access token from passed clientId and secret.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthServerServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    AuthServerServiceApi apiInstance = new AuthServerServiceApi(defaultClient);
    try {
      AuthserverGetAccessTokenResponse result = apiInstance.authServerServiceGetAccessToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerServiceApi#authServerServiceGetAccessToken");
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

[**AuthserverGetAccessTokenResponse**](AuthserverGetAccessTokenResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="authServerServiceGetOauthClient"></a>
# **authServerServiceGetOauthClient**
> AuthserverGetOauthClientResponse authServerServiceGetOauthClient(clientId)

Summary: Get Oauth client Description: Get registered Oauth client by clientId.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthServerServiceApi;

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

    AuthServerServiceApi apiInstance = new AuthServerServiceApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientID of registered OAuth.
    try {
      AuthserverGetOauthClientResponse result = apiInstance.authServerServiceGetOauthClient(clientId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerServiceApi#authServerServiceGetOauthClient");
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
| **clientId** | **String**| ClientID of registered OAuth. | |

### Return type

[**AuthserverGetOauthClientResponse**](AuthserverGetOauthClientResponse.md)

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

<a id="authServerServiceGetUser"></a>
# **authServerServiceGetUser**
> AuthserverGetUserResponse authServerServiceGetUser()

Summary: Get user Description: Get user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthServerServiceApi;

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

    AuthServerServiceApi apiInstance = new AuthServerServiceApi(defaultClient);
    try {
      AuthserverGetUserResponse result = apiInstance.authServerServiceGetUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerServiceApi#authServerServiceGetUser");
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

[**AuthserverGetUserResponse**](AuthserverGetUserResponse.md)

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

<a id="authServerServiceListOauthClient"></a>
# **authServerServiceListOauthClient**
> AuthserverListOauthClientResponse authServerServiceListOauthClient()

Summary: List Oauth client Description: List all registered Oauth client.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthServerServiceApi;

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

    AuthServerServiceApi apiInstance = new AuthServerServiceApi(defaultClient);
    try {
      AuthserverListOauthClientResponse result = apiInstance.authServerServiceListOauthClient();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerServiceApi#authServerServiceListOauthClient");
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

[**AuthserverListOauthClientResponse**](AuthserverListOauthClientResponse.md)

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

