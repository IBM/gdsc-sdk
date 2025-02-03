# ConnectionsServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**connectionsServiceCreateConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceCreateConnectionsAccounts) | **POST** /api/v3/connections/accounts | Summary: Create Connections accounts Description: Create Connections acccounts. |
| [**connectionsServiceCreateConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceCreateConnectionsConfigs) | **POST** /api/v3/connections/configs | Summary: Create connections configs Description: Create Connection config by connection type. |
| [**connectionsServiceCreatePlugin**](ConnectionsServiceApi.md#connectionsServiceCreatePlugin) | **POST** /api/v3/connections/plugins | Summary: Create plugin Description: Create UC generic plugin |
| [**connectionsServiceCreateSettings**](ConnectionsServiceApi.md#connectionsServiceCreateSettings) | **POST** /api/v3/connections/settings | Summary: Create settings Description: Create Settings. |
| [**connectionsServiceDeleteConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceDeleteConnectionsAccounts) | **DELETE** /api/v3/connections/accounts/{account_id} | Summary: Delete Connections accounts Description: Delete Connections acccounts. |
| [**connectionsServiceDeleteConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceDeleteConnectionsConfigs) | **DELETE** /api/v3/connections/configs/{connection_id} | Summary: Delete connections configs Description: Delete Connection config by connection id. |
| [**connectionsServiceDeleteConnector**](ConnectionsServiceApi.md#connectionsServiceDeleteConnector) | **DELETE** /api/v3/connections/{connection_id} | Summary: Delete connector Description: Delete a Connection. |
| [**connectionsServiceDeletePlugin**](ConnectionsServiceApi.md#connectionsServiceDeletePlugin) | **DELETE** /api/v3/connections/plugins/{id} | Summary: Delete plugin. Description: Delete plugin. |
| [**connectionsServiceGetBannerState**](ConnectionsServiceApi.md#connectionsServiceGetBannerState) | **GET** /api/v3/connections/banner | Summary: Get banner state for object verb page.  Description: Get banner state for object verb page. |
| [**connectionsServiceGetConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceGetConnectionsAccounts) | **GET** /api/v3/connections/accounts | Summary: Get Connections accounts Description: Get Connections acccounts. |
| [**connectionsServiceGetConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceGetConnectionsConfigs) | **GET** /api/v3/connections/configs | Summary: Get connections configs Description: Get Connection config by connection type. |
| [**connectionsServiceGetConnectionsWithFilters**](ConnectionsServiceApi.md#connectionsServiceGetConnectionsWithFilters) | **POST** /api/v3/connections | Summary: Get connections with filters Description: Get connections with filters. |
| [**connectionsServiceGetConnectorsSummary**](ConnectionsServiceApi.md#connectionsServiceGetConnectorsSummary) | **GET** /api/v3/connections/summary | Summary: Get connectors summary Description: Get a summary of Connectors. |
| [**connectionsServiceGetDataSources**](ConnectionsServiceApi.md#connectionsServiceGetDataSources) | **GET** /api/v3/connections/datasources | Summary: Get data sources Description: Get a list of data sources. |
| [**connectionsServiceGetGuardRecordFields**](ConnectionsServiceApi.md#connectionsServiceGetGuardRecordFields) | **GET** /api/v3/connections/fields | Summary: Get list of guard record fields.  Description: Get list of guard record fields. |
| [**connectionsServiceGetHeaders**](ConnectionsServiceApi.md#connectionsServiceGetHeaders) | **GET** /api/v3/connections/headers | Summary: Get headers Description: Get a list of Headers. |
| [**connectionsServiceGetPlugins**](ConnectionsServiceApi.md#connectionsServiceGetPlugins) | **GET** /api/v3/connections/plugins | Summary: Get plugins  Description: Get custom universal connector plugins |
| [**connectionsServiceGetSettings**](ConnectionsServiceApi.md#connectionsServiceGetSettings) | **GET** /api/v3/connections/settings | Summary: Get settings Description: Get a list of Settings. |
| [**connectionsServicePartialUpdateConnectors**](ConnectionsServiceApi.md#connectionsServicePartialUpdateConnectors) | **PATCH** /api/v3/connections | Summary: Partial update connectors Description: Partial update of Connectors. |
| [**connectionsServicePostStapCommand**](ConnectionsServiceApi.md#connectionsServicePostStapCommand) | **POST** /api/v3/stap/commands | Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist. |
| [**connectionsServiceUpdateBannerState**](ConnectionsServiceApi.md#connectionsServiceUpdateBannerState) | **PUT** /api/v3/connections/banner | Summary: Update banner state for object verb page.  Description: Update banner state for object verb page. |
| [**connectionsServiceUpdateConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceUpdateConnectionsAccounts) | **PUT** /api/v3/connections/accounts | Summary: Update Connections accounts Description: Update Connections acccounts. |
| [**connectionsServiceUpdateConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceUpdateConnectionsConfigs) | **PATCH** /api/v3/connections/configs | Summary: Update connections configs Description: Update Connection config by connection id. |
| [**connectionsServiceUpdateConnectors**](ConnectionsServiceApi.md#connectionsServiceUpdateConnectors) | **PUT** /api/v3/connections | Summary: Update connectors Description: Update a list of Connectors. |
| [**connectionsServiceUpdatePlugin**](ConnectionsServiceApi.md#connectionsServiceUpdatePlugin) | **PUT** /api/v3/connections/plugins/{id} | Summary: Update plugin. Description: Update plugin. |
| [**connectionsServiceUpdateSettings**](ConnectionsServiceApi.md#connectionsServiceUpdateSettings) | **PUT** /api/v3/connections/settings | Summary: Update settings Description: Update Settings. |


<a id="connectionsServiceCreateConnectionsAccounts"></a>
# **connectionsServiceCreateConnectionsAccounts**
> Connectionsv3CreateConnectionsAccountsResponse connectionsServiceCreateConnectionsAccounts(connectionsv3CreateConnectionsAccountsRequest)

Summary: Create Connections accounts Description: Create Connections acccounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3CreateConnectionsAccountsRequest connectionsv3CreateConnectionsAccountsRequest = new Connectionsv3CreateConnectionsAccountsRequest(); // Connectionsv3CreateConnectionsAccountsRequest | 
    try {
      Connectionsv3CreateConnectionsAccountsResponse result = apiInstance.connectionsServiceCreateConnectionsAccounts(connectionsv3CreateConnectionsAccountsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceCreateConnectionsAccounts");
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
| **connectionsv3CreateConnectionsAccountsRequest** | [**Connectionsv3CreateConnectionsAccountsRequest**](Connectionsv3CreateConnectionsAccountsRequest.md)|  | |

### Return type

[**Connectionsv3CreateConnectionsAccountsResponse**](Connectionsv3CreateConnectionsAccountsResponse.md)

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

<a id="connectionsServiceCreateConnectionsConfigs"></a>
# **connectionsServiceCreateConnectionsConfigs**
> Connectionsv3CreateConnectionsConfigsResponse connectionsServiceCreateConnectionsConfigs(connectionsv3CreateConnectionsConfigsRequest)

Summary: Create connections configs Description: Create Connection config by connection type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3CreateConnectionsConfigsRequest connectionsv3CreateConnectionsConfigsRequest = new Connectionsv3CreateConnectionsConfigsRequest(); // Connectionsv3CreateConnectionsConfigsRequest | 
    try {
      Connectionsv3CreateConnectionsConfigsResponse result = apiInstance.connectionsServiceCreateConnectionsConfigs(connectionsv3CreateConnectionsConfigsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceCreateConnectionsConfigs");
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
| **connectionsv3CreateConnectionsConfigsRequest** | [**Connectionsv3CreateConnectionsConfigsRequest**](Connectionsv3CreateConnectionsConfigsRequest.md)|  | |

### Return type

[**Connectionsv3CreateConnectionsConfigsResponse**](Connectionsv3CreateConnectionsConfigsResponse.md)

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

<a id="connectionsServiceCreatePlugin"></a>
# **connectionsServiceCreatePlugin**
> Connectionsv3CreatePluginResponse connectionsServiceCreatePlugin(connectionsv3CreatePluginRequest)

Summary: Create plugin Description: Create UC generic plugin

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3CreatePluginRequest connectionsv3CreatePluginRequest = new Connectionsv3CreatePluginRequest(); // Connectionsv3CreatePluginRequest | 
    try {
      Connectionsv3CreatePluginResponse result = apiInstance.connectionsServiceCreatePlugin(connectionsv3CreatePluginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceCreatePlugin");
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
| **connectionsv3CreatePluginRequest** | [**Connectionsv3CreatePluginRequest**](Connectionsv3CreatePluginRequest.md)|  | |

### Return type

[**Connectionsv3CreatePluginResponse**](Connectionsv3CreatePluginResponse.md)

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

<a id="connectionsServiceCreateSettings"></a>
# **connectionsServiceCreateSettings**
> Object connectionsServiceCreateSettings(connectionsv3CreateSettingsRequest)

Summary: Create settings Description: Create Settings.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3CreateSettingsRequest connectionsv3CreateSettingsRequest = new Connectionsv3CreateSettingsRequest(); // Connectionsv3CreateSettingsRequest | 
    try {
      Object result = apiInstance.connectionsServiceCreateSettings(connectionsv3CreateSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceCreateSettings");
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
| **connectionsv3CreateSettingsRequest** | [**Connectionsv3CreateSettingsRequest**](Connectionsv3CreateSettingsRequest.md)|  | |

### Return type

**Object**

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

<a id="connectionsServiceDeleteConnectionsAccounts"></a>
# **connectionsServiceDeleteConnectionsAccounts**
> Connectionsv3DeleteConnectionsAccountsResponse connectionsServiceDeleteConnectionsAccounts(accountId)

Summary: Delete Connections accounts Description: Delete Connections acccounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    String accountId = "accountId_example"; // String | Account id.
    try {
      Connectionsv3DeleteConnectionsAccountsResponse result = apiInstance.connectionsServiceDeleteConnectionsAccounts(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceDeleteConnectionsAccounts");
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
| **accountId** | **String**| Account id. | |

### Return type

[**Connectionsv3DeleteConnectionsAccountsResponse**](Connectionsv3DeleteConnectionsAccountsResponse.md)

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

<a id="connectionsServiceDeleteConnectionsConfigs"></a>
# **connectionsServiceDeleteConnectionsConfigs**
> Connectionsv3DeleteConnectionsConfigsResponse connectionsServiceDeleteConnectionsConfigs(connectionId)

Summary: Delete connections configs Description: Delete Connection config by connection id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection id.
    try {
      Connectionsv3DeleteConnectionsConfigsResponse result = apiInstance.connectionsServiceDeleteConnectionsConfigs(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceDeleteConnectionsConfigs");
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
| **connectionId** | **String**| Connection id. | |

### Return type

[**Connectionsv3DeleteConnectionsConfigsResponse**](Connectionsv3DeleteConnectionsConfigsResponse.md)

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

<a id="connectionsServiceDeleteConnector"></a>
# **connectionsServiceDeleteConnector**
> Object connectionsServiceDeleteConnector(connectionId)

Summary: Delete connector Description: Delete a Connection.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    String connectionId = "connectionId_example"; // String | The connection id
    try {
      Object result = apiInstance.connectionsServiceDeleteConnector(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceDeleteConnector");
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
| **connectionId** | **String**| The connection id | |

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

<a id="connectionsServiceDeletePlugin"></a>
# **connectionsServiceDeletePlugin**
> Connectionsv3DeletePluginResponse connectionsServiceDeletePlugin(id)

Summary: Delete plugin. Description: Delete plugin.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    String id = "id_example"; // String | plugin id
    try {
      Connectionsv3DeletePluginResponse result = apiInstance.connectionsServiceDeletePlugin(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceDeletePlugin");
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
| **id** | **String**| plugin id | |

### Return type

[**Connectionsv3DeletePluginResponse**](Connectionsv3DeletePluginResponse.md)

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

<a id="connectionsServiceGetBannerState"></a>
# **connectionsServiceGetBannerState**
> Connectionsv3GetBannerStateResponse connectionsServiceGetBannerState()

Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    try {
      Connectionsv3GetBannerStateResponse result = apiInstance.connectionsServiceGetBannerState();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceGetBannerState");
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

[**Connectionsv3GetBannerStateResponse**](Connectionsv3GetBannerStateResponse.md)

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

<a id="connectionsServiceGetConnectionsAccounts"></a>
# **connectionsServiceGetConnectionsAccounts**
> Connectionsv3GetConnectionsAccountsResponse connectionsServiceGetConnectionsAccounts(accountId, accessKey)

Summary: Get Connections accounts Description: Get Connections acccounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    String accountId = "accountId_example"; // String | Optional: account id.
    String accessKey = "accessKey_example"; // String | Optional: acccount access key.
    try {
      Connectionsv3GetConnectionsAccountsResponse result = apiInstance.connectionsServiceGetConnectionsAccounts(accountId, accessKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceGetConnectionsAccounts");
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
| **accountId** | **String**| Optional: account id. | [optional] |
| **accessKey** | **String**| Optional: acccount access key. | [optional] |

### Return type

[**Connectionsv3GetConnectionsAccountsResponse**](Connectionsv3GetConnectionsAccountsResponse.md)

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

<a id="connectionsServiceGetConnectionsConfigs"></a>
# **connectionsServiceGetConnectionsConfigs**
> Connectionsv3GetConnectionsConfigsResponse connectionsServiceGetConnectionsConfigs(type, connectionId)

Summary: Get connections configs Description: Get Connection config by connection type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    String type = "UNDEFINED_TYPE"; // String | The type of connector.
    String connectionId = "connectionId_example"; // String | Optional: if connection id did not provide then return all connections.
    try {
      Connectionsv3GetConnectionsConfigsResponse result = apiInstance.connectionsServiceGetConnectionsConfigs(type, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceGetConnectionsConfigs");
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
| **type** | **String**| The type of connector. | [optional] [default to UNDEFINED_TYPE] [enum: UNDEFINED_TYPE, AWS, AZURE, UC, STAP] |
| **connectionId** | **String**| Optional: if connection id did not provide then return all connections. | [optional] |

### Return type

[**Connectionsv3GetConnectionsConfigsResponse**](Connectionsv3GetConnectionsConfigsResponse.md)

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

<a id="connectionsServiceGetConnectionsWithFilters"></a>
# **connectionsServiceGetConnectionsWithFilters**
> Connectionsv3GetConnectionsWithFiltersResponse connectionsServiceGetConnectionsWithFilters(connectionsv3GetConnectionsWithFiltersRequest)

Summary: Get connections with filters Description: Get connections with filters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3GetConnectionsWithFiltersRequest connectionsv3GetConnectionsWithFiltersRequest = new Connectionsv3GetConnectionsWithFiltersRequest(); // Connectionsv3GetConnectionsWithFiltersRequest | 
    try {
      Connectionsv3GetConnectionsWithFiltersResponse result = apiInstance.connectionsServiceGetConnectionsWithFilters(connectionsv3GetConnectionsWithFiltersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceGetConnectionsWithFilters");
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
| **connectionsv3GetConnectionsWithFiltersRequest** | [**Connectionsv3GetConnectionsWithFiltersRequest**](Connectionsv3GetConnectionsWithFiltersRequest.md)|  | |

### Return type

[**Connectionsv3GetConnectionsWithFiltersResponse**](Connectionsv3GetConnectionsWithFiltersResponse.md)

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

<a id="connectionsServiceGetConnectorsSummary"></a>
# **connectionsServiceGetConnectorsSummary**
> Connectionsv3GetConnectorsSummaryResponse connectionsServiceGetConnectorsSummary()

Summary: Get connectors summary Description: Get a summary of Connectors.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    try {
      Connectionsv3GetConnectorsSummaryResponse result = apiInstance.connectionsServiceGetConnectorsSummary();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceGetConnectorsSummary");
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

[**Connectionsv3GetConnectorsSummaryResponse**](Connectionsv3GetConnectorsSummaryResponse.md)

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

<a id="connectionsServiceGetDataSources"></a>
# **connectionsServiceGetDataSources**
> Connectionsv3GetDataSourcesResponse connectionsServiceGetDataSources()

Summary: Get data sources Description: Get a list of data sources.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    try {
      Connectionsv3GetDataSourcesResponse result = apiInstance.connectionsServiceGetDataSources();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceGetDataSources");
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

[**Connectionsv3GetDataSourcesResponse**](Connectionsv3GetDataSourcesResponse.md)

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

<a id="connectionsServiceGetGuardRecordFields"></a>
# **connectionsServiceGetGuardRecordFields**
> Connectionsv3GetGuardRecordFieldsResponse connectionsServiceGetGuardRecordFields()

Summary: Get list of guard record fields.  Description: Get list of guard record fields.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    try {
      Connectionsv3GetGuardRecordFieldsResponse result = apiInstance.connectionsServiceGetGuardRecordFields();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceGetGuardRecordFields");
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

[**Connectionsv3GetGuardRecordFieldsResponse**](Connectionsv3GetGuardRecordFieldsResponse.md)

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

<a id="connectionsServiceGetHeaders"></a>
# **connectionsServiceGetHeaders**
> Connectionsv3GetHeadersResponse connectionsServiceGetHeaders()

Summary: Get headers Description: Get a list of Headers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    try {
      Connectionsv3GetHeadersResponse result = apiInstance.connectionsServiceGetHeaders();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceGetHeaders");
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

[**Connectionsv3GetHeadersResponse**](Connectionsv3GetHeadersResponse.md)

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

<a id="connectionsServiceGetPlugins"></a>
# **connectionsServiceGetPlugins**
> Connectionsv3GetPluginsResponse connectionsServiceGetPlugins(id)

Summary: Get plugins  Description: Get custom universal connector plugins

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    String id = "id_example"; // String | Optional: if no plug-in id is provided, returns list of all plug-ins.
    try {
      Connectionsv3GetPluginsResponse result = apiInstance.connectionsServiceGetPlugins(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceGetPlugins");
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
| **id** | **String**| Optional: if no plug-in id is provided, returns list of all plug-ins. | [optional] |

### Return type

[**Connectionsv3GetPluginsResponse**](Connectionsv3GetPluginsResponse.md)

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

<a id="connectionsServiceGetSettings"></a>
# **connectionsServiceGetSettings**
> Connectionsv3GetSettingsResponse connectionsServiceGetSettings()

Summary: Get settings Description: Get a list of Settings.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    try {
      Connectionsv3GetSettingsResponse result = apiInstance.connectionsServiceGetSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceGetSettings");
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

[**Connectionsv3GetSettingsResponse**](Connectionsv3GetSettingsResponse.md)

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

<a id="connectionsServicePartialUpdateConnectors"></a>
# **connectionsServicePartialUpdateConnectors**
> Connectionsv3PartialUpdateConnectorsResponse connectionsServicePartialUpdateConnectors(connectionsv3PartialUpdateConnectorsRequest)

Summary: Partial update connectors Description: Partial update of Connectors.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3PartialUpdateConnectorsRequest connectionsv3PartialUpdateConnectorsRequest = new Connectionsv3PartialUpdateConnectorsRequest(); // Connectionsv3PartialUpdateConnectorsRequest | 
    try {
      Connectionsv3PartialUpdateConnectorsResponse result = apiInstance.connectionsServicePartialUpdateConnectors(connectionsv3PartialUpdateConnectorsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServicePartialUpdateConnectors");
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
| **connectionsv3PartialUpdateConnectorsRequest** | [**Connectionsv3PartialUpdateConnectorsRequest**](Connectionsv3PartialUpdateConnectorsRequest.md)|  | |

### Return type

[**Connectionsv3PartialUpdateConnectorsResponse**](Connectionsv3PartialUpdateConnectorsResponse.md)

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

<a id="connectionsServicePostStapCommand"></a>
# **connectionsServicePostStapCommand**
> Connectionsv3StatusResponseBase connectionsServicePostStapCommand(connectionsv3StapCommandRequest)

Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3StapCommandRequest connectionsv3StapCommandRequest = new Connectionsv3StapCommandRequest(); // Connectionsv3StapCommandRequest | 
    try {
      Connectionsv3StatusResponseBase result = apiInstance.connectionsServicePostStapCommand(connectionsv3StapCommandRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServicePostStapCommand");
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
| **connectionsv3StapCommandRequest** | [**Connectionsv3StapCommandRequest**](Connectionsv3StapCommandRequest.md)|  | |

### Return type

[**Connectionsv3StatusResponseBase**](Connectionsv3StatusResponseBase.md)

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

<a id="connectionsServiceUpdateBannerState"></a>
# **connectionsServiceUpdateBannerState**
> Connectionsv3UpdateBannerStateResponse connectionsServiceUpdateBannerState(connectionsv3UpdateBannerStateRequest)

Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3UpdateBannerStateRequest connectionsv3UpdateBannerStateRequest = new Connectionsv3UpdateBannerStateRequest(); // Connectionsv3UpdateBannerStateRequest | 
    try {
      Connectionsv3UpdateBannerStateResponse result = apiInstance.connectionsServiceUpdateBannerState(connectionsv3UpdateBannerStateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceUpdateBannerState");
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
| **connectionsv3UpdateBannerStateRequest** | [**Connectionsv3UpdateBannerStateRequest**](Connectionsv3UpdateBannerStateRequest.md)|  | |

### Return type

[**Connectionsv3UpdateBannerStateResponse**](Connectionsv3UpdateBannerStateResponse.md)

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

<a id="connectionsServiceUpdateConnectionsAccounts"></a>
# **connectionsServiceUpdateConnectionsAccounts**
> Connectionsv3UpdateConnectionsAccountsResponse connectionsServiceUpdateConnectionsAccounts(connectionsv3UpdateConnectionsAccountsRequest)

Summary: Update Connections accounts Description: Update Connections acccounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3UpdateConnectionsAccountsRequest connectionsv3UpdateConnectionsAccountsRequest = new Connectionsv3UpdateConnectionsAccountsRequest(); // Connectionsv3UpdateConnectionsAccountsRequest | 
    try {
      Connectionsv3UpdateConnectionsAccountsResponse result = apiInstance.connectionsServiceUpdateConnectionsAccounts(connectionsv3UpdateConnectionsAccountsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceUpdateConnectionsAccounts");
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
| **connectionsv3UpdateConnectionsAccountsRequest** | [**Connectionsv3UpdateConnectionsAccountsRequest**](Connectionsv3UpdateConnectionsAccountsRequest.md)|  | |

### Return type

[**Connectionsv3UpdateConnectionsAccountsResponse**](Connectionsv3UpdateConnectionsAccountsResponse.md)

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

<a id="connectionsServiceUpdateConnectionsConfigs"></a>
# **connectionsServiceUpdateConnectionsConfigs**
> Connectionsv3UpdateConnectionsConfigsResponse connectionsServiceUpdateConnectionsConfigs(connectionsv3UpdateConnectionsConfigsRequest)

Summary: Update connections configs Description: Update Connection config by connection id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3UpdateConnectionsConfigsRequest connectionsv3UpdateConnectionsConfigsRequest = new Connectionsv3UpdateConnectionsConfigsRequest(); // Connectionsv3UpdateConnectionsConfigsRequest | 
    try {
      Connectionsv3UpdateConnectionsConfigsResponse result = apiInstance.connectionsServiceUpdateConnectionsConfigs(connectionsv3UpdateConnectionsConfigsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceUpdateConnectionsConfigs");
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
| **connectionsv3UpdateConnectionsConfigsRequest** | [**Connectionsv3UpdateConnectionsConfigsRequest**](Connectionsv3UpdateConnectionsConfigsRequest.md)|  | |

### Return type

[**Connectionsv3UpdateConnectionsConfigsResponse**](Connectionsv3UpdateConnectionsConfigsResponse.md)

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

<a id="connectionsServiceUpdateConnectors"></a>
# **connectionsServiceUpdateConnectors**
> Object connectionsServiceUpdateConnectors(connectionsv3UpdateConnectorsRequest)

Summary: Update connectors Description: Update a list of Connectors.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3UpdateConnectorsRequest connectionsv3UpdateConnectorsRequest = new Connectionsv3UpdateConnectorsRequest(); // Connectionsv3UpdateConnectorsRequest | 
    try {
      Object result = apiInstance.connectionsServiceUpdateConnectors(connectionsv3UpdateConnectorsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceUpdateConnectors");
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
| **connectionsv3UpdateConnectorsRequest** | [**Connectionsv3UpdateConnectorsRequest**](Connectionsv3UpdateConnectorsRequest.md)|  | |

### Return type

**Object**

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

<a id="connectionsServiceUpdatePlugin"></a>
# **connectionsServiceUpdatePlugin**
> Connectionsv3UpdatePluginResponse connectionsServiceUpdatePlugin(id, connectionsv3UpdatePluginRequest)

Summary: Update plugin. Description: Update plugin.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    String id = "id_example"; // String | id
    Connectionsv3UpdatePluginRequest connectionsv3UpdatePluginRequest = new Connectionsv3UpdatePluginRequest(); // Connectionsv3UpdatePluginRequest | 
    try {
      Connectionsv3UpdatePluginResponse result = apiInstance.connectionsServiceUpdatePlugin(id, connectionsv3UpdatePluginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceUpdatePlugin");
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
| **id** | **String**| id | |
| **connectionsv3UpdatePluginRequest** | [**Connectionsv3UpdatePluginRequest**](Connectionsv3UpdatePluginRequest.md)|  | |

### Return type

[**Connectionsv3UpdatePluginResponse**](Connectionsv3UpdatePluginResponse.md)

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

<a id="connectionsServiceUpdateSettings"></a>
# **connectionsServiceUpdateSettings**
> Object connectionsServiceUpdateSettings(connectionsv3UpdateSettingsRequest)

Summary: Update settings Description: Update Settings.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionsServiceApi;

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

    ConnectionsServiceApi apiInstance = new ConnectionsServiceApi(defaultClient);
    Connectionsv3UpdateSettingsRequest connectionsv3UpdateSettingsRequest = new Connectionsv3UpdateSettingsRequest(); // Connectionsv3UpdateSettingsRequest | 
    try {
      Object result = apiInstance.connectionsServiceUpdateSettings(connectionsv3UpdateSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsServiceApi#connectionsServiceUpdateSettings");
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
| **connectionsv3UpdateSettingsRequest** | [**Connectionsv3UpdateSettingsRequest**](Connectionsv3UpdateSettingsRequest.md)|  | |

### Return type

**Object**

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

