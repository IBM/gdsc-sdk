# UniversalConnectorManagerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**universalConnectorManagerGetCertificate**](UniversalConnectorManagerApi.md#universalConnectorManagerGetCertificate) | **GET** /api/v3/certificates | Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in GDSC. |
| [**universalConnectorManagerGetConnectors**](UniversalConnectorManagerApi.md#universalConnectorManagerGetConnectors) | **GET** /api/v3/connectors | Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms. |
| [**universalConnectorManagerGetUCSetup**](UniversalConnectorManagerApi.md#universalConnectorManagerGetUCSetup) | **GET** /api/v3/universal_connections/configurations/{plugin_id} | Gets information to setup the new Universal connection. |
| [**universalConnectorManagerListConnectionsSummary**](UniversalConnectorManagerApi.md#universalConnectorManagerListConnectionsSummary) | **GET** /api/v3/universal_connections | Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources). |
| [**universalConnectorManagerPluginsList**](UniversalConnectorManagerApi.md#universalConnectorManagerPluginsList) | **GET** /api/v3/plugins | Summary: Plugins list Description: List of all universal connector plugins. |
| [**universalConnectorManagerUploadPlugin**](UniversalConnectorManagerApi.md#universalConnectorManagerUploadPlugin) | **POST** /api/v3/plugins | Summary: Upload plugin Description: Upload a plugin-package for Universal Connector. |


<a id="universalConnectorManagerGetCertificate"></a>
# **universalConnectorManagerGetCertificate**
> Universalconnectormanagerv3FileResponse universalConnectorManagerGetCertificate()

Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in GDSC.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.UniversalConnectorManagerApi;

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

    UniversalConnectorManagerApi apiInstance = new UniversalConnectorManagerApi(defaultClient);
    try {
      Universalconnectormanagerv3FileResponse result = apiInstance.universalConnectorManagerGetCertificate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniversalConnectorManagerApi#universalConnectorManagerGetCertificate");
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

[**Universalconnectormanagerv3FileResponse**](Universalconnectormanagerv3FileResponse.md)

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

<a id="universalConnectorManagerGetConnectors"></a>
# **universalConnectorManagerGetConnectors**
> Universalconnectormanagerv3GetConnectorsResponse universalConnectorManagerGetConnectors()

Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.UniversalConnectorManagerApi;

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

    UniversalConnectorManagerApi apiInstance = new UniversalConnectorManagerApi(defaultClient);
    try {
      Universalconnectormanagerv3GetConnectorsResponse result = apiInstance.universalConnectorManagerGetConnectors();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniversalConnectorManagerApi#universalConnectorManagerGetConnectors");
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

[**Universalconnectormanagerv3GetConnectorsResponse**](Universalconnectormanagerv3GetConnectorsResponse.md)

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

<a id="universalConnectorManagerGetUCSetup"></a>
# **universalConnectorManagerGetUCSetup**
> Universalconnectormanagerv3GetUCSetupResponse universalConnectorManagerGetUCSetup(pluginId)

Gets information to setup the new Universal connection.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.UniversalConnectorManagerApi;

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

    UniversalConnectorManagerApi apiInstance = new UniversalConnectorManagerApi(defaultClient);
    Integer pluginId = 56; // Integer | UC plugin id.
    try {
      Universalconnectormanagerv3GetUCSetupResponse result = apiInstance.universalConnectorManagerGetUCSetup(pluginId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniversalConnectorManagerApi#universalConnectorManagerGetUCSetup");
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
| **pluginId** | **Integer**| UC plugin id. | |

### Return type

[**Universalconnectormanagerv3GetUCSetupResponse**](Universalconnectormanagerv3GetUCSetupResponse.md)

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

<a id="universalConnectorManagerListConnectionsSummary"></a>
# **universalConnectorManagerListConnectionsSummary**
> Universalconnectormanagerv3ListConnectionsResponse universalConnectorManagerListConnectionsSummary()

Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.UniversalConnectorManagerApi;

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

    UniversalConnectorManagerApi apiInstance = new UniversalConnectorManagerApi(defaultClient);
    try {
      Universalconnectormanagerv3ListConnectionsResponse result = apiInstance.universalConnectorManagerListConnectionsSummary();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniversalConnectorManagerApi#universalConnectorManagerListConnectionsSummary");
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

[**Universalconnectormanagerv3ListConnectionsResponse**](Universalconnectormanagerv3ListConnectionsResponse.md)

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

<a id="universalConnectorManagerPluginsList"></a>
# **universalConnectorManagerPluginsList**
> Universalconnectormanagerv3PluginsListResponse universalConnectorManagerPluginsList()

Summary: Plugins list Description: List of all universal connector plugins.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.UniversalConnectorManagerApi;

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

    UniversalConnectorManagerApi apiInstance = new UniversalConnectorManagerApi(defaultClient);
    try {
      Universalconnectormanagerv3PluginsListResponse result = apiInstance.universalConnectorManagerPluginsList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniversalConnectorManagerApi#universalConnectorManagerPluginsList");
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

[**Universalconnectormanagerv3PluginsListResponse**](Universalconnectormanagerv3PluginsListResponse.md)

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

<a id="universalConnectorManagerUploadPlugin"></a>
# **universalConnectorManagerUploadPlugin**
> RpcStatus universalConnectorManagerUploadPlugin(universalconnectormanagerv3UploadPluginRequest)

Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.UniversalConnectorManagerApi;

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

    UniversalConnectorManagerApi apiInstance = new UniversalConnectorManagerApi(defaultClient);
    Universalconnectormanagerv3UploadPluginRequest universalconnectormanagerv3UploadPluginRequest = new Universalconnectormanagerv3UploadPluginRequest(); // Universalconnectormanagerv3UploadPluginRequest | 
    try {
      RpcStatus result = apiInstance.universalConnectorManagerUploadPlugin(universalconnectormanagerv3UploadPluginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniversalConnectorManagerApi#universalConnectorManagerUploadPlugin");
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
| **universalconnectormanagerv3UploadPluginRequest** | [**Universalconnectormanagerv3UploadPluginRequest**](Universalconnectormanagerv3UploadPluginRequest.md)|  | |

### Return type

[**RpcStatus**](RpcStatus.md)

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

