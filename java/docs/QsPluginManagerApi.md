# QsPluginManagerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**qSPluginManagerInvokeAppProv**](QsPluginManagerApi.md#qSPluginManagerInvokeAppProv) | **POST** /api/v3/plugins/{plugin_id}/application | Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload |
| [**qSPluginManagerInvokeExplorerV1**](QsPluginManagerApi.md#qSPluginManagerInvokeExplorerV1) | **POST** /api/v3/plugins/{plugin_id}/explorer | Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload |
| [**qSPluginManagerInvokeExplorerV2**](QsPluginManagerApi.md#qSPluginManagerInvokeExplorerV2) | **POST** /api/v3/plugins/{plugin_id}/explorer/analytics | Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload |
| [**qSPluginManagerInvokePlugin**](QsPluginManagerApi.md#qSPluginManagerInvokePlugin) | **POST** /api/v3/plugins/{plugin_id}/network | Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload |
| [**qSPluginManagerInvokePolicy**](QsPluginManagerApi.md#qSPluginManagerInvokePolicy) | **POST** /api/v3/plugins/{plugin_id}/policy | Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload |


<a id="qSPluginManagerInvokeAppProv"></a>
# **qSPluginManagerInvokeAppProv**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokeAppProv(pluginId, qspmpluginmanagerv3PluginRQ)

Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.QsPluginManagerApi;

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

    QsPluginManagerApi apiInstance = new QsPluginManagerApi(defaultClient);
    String pluginId = "pluginId_example"; // String | Unique identifier for the plugin
    Qspmpluginmanagerv3PluginRQ qspmpluginmanagerv3PluginRQ = new Qspmpluginmanagerv3PluginRQ(); // Qspmpluginmanagerv3PluginRQ | 
    try {
      Qspmpluginmanagerv3PluginRS result = apiInstance.qSPluginManagerInvokeAppProv(pluginId, qspmpluginmanagerv3PluginRQ);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsPluginManagerApi#qSPluginManagerInvokeAppProv");
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
| **pluginId** | **String**| Unique identifier for the plugin | |
| **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md)|  | |

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

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

<a id="qSPluginManagerInvokeExplorerV1"></a>
# **qSPluginManagerInvokeExplorerV1**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokeExplorerV1(pluginId, qspmpluginmanagerv3PluginRQ)

Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.QsPluginManagerApi;

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

    QsPluginManagerApi apiInstance = new QsPluginManagerApi(defaultClient);
    String pluginId = "pluginId_example"; // String | Unique identifier for the plugin
    Qspmpluginmanagerv3PluginRQ qspmpluginmanagerv3PluginRQ = new Qspmpluginmanagerv3PluginRQ(); // Qspmpluginmanagerv3PluginRQ | 
    try {
      Qspmpluginmanagerv3PluginRS result = apiInstance.qSPluginManagerInvokeExplorerV1(pluginId, qspmpluginmanagerv3PluginRQ);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsPluginManagerApi#qSPluginManagerInvokeExplorerV1");
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
| **pluginId** | **String**| Unique identifier for the plugin | |
| **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md)|  | |

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

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

<a id="qSPluginManagerInvokeExplorerV2"></a>
# **qSPluginManagerInvokeExplorerV2**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokeExplorerV2(pluginId, qspmpluginmanagerv3PluginRQ)

Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.QsPluginManagerApi;

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

    QsPluginManagerApi apiInstance = new QsPluginManagerApi(defaultClient);
    String pluginId = "pluginId_example"; // String | Unique identifier for the plugin
    Qspmpluginmanagerv3PluginRQ qspmpluginmanagerv3PluginRQ = new Qspmpluginmanagerv3PluginRQ(); // Qspmpluginmanagerv3PluginRQ | 
    try {
      Qspmpluginmanagerv3PluginRS result = apiInstance.qSPluginManagerInvokeExplorerV2(pluginId, qspmpluginmanagerv3PluginRQ);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsPluginManagerApi#qSPluginManagerInvokeExplorerV2");
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
| **pluginId** | **String**| Unique identifier for the plugin | |
| **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md)|  | |

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

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

<a id="qSPluginManagerInvokePlugin"></a>
# **qSPluginManagerInvokePlugin**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokePlugin(pluginId, qspmpluginmanagerv3PluginRQ)

Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.QsPluginManagerApi;

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

    QsPluginManagerApi apiInstance = new QsPluginManagerApi(defaultClient);
    String pluginId = "pluginId_example"; // String | Unique identifier for the plugin
    Qspmpluginmanagerv3PluginRQ qspmpluginmanagerv3PluginRQ = new Qspmpluginmanagerv3PluginRQ(); // Qspmpluginmanagerv3PluginRQ | 
    try {
      Qspmpluginmanagerv3PluginRS result = apiInstance.qSPluginManagerInvokePlugin(pluginId, qspmpluginmanagerv3PluginRQ);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsPluginManagerApi#qSPluginManagerInvokePlugin");
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
| **pluginId** | **String**| Unique identifier for the plugin | |
| **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md)|  | |

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

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

<a id="qSPluginManagerInvokePolicy"></a>
# **qSPluginManagerInvokePolicy**
> Qspmpluginmanagerv3PolicyPluginRS qSPluginManagerInvokePolicy(pluginId, qspmpluginmanagerv3PolicyPluginRQ)

Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.QsPluginManagerApi;

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

    QsPluginManagerApi apiInstance = new QsPluginManagerApi(defaultClient);
    String pluginId = "pluginId_example"; // String | Unique identifier for the plugin
    Qspmpluginmanagerv3PolicyPluginRQ qspmpluginmanagerv3PolicyPluginRQ = new Qspmpluginmanagerv3PolicyPluginRQ(); // Qspmpluginmanagerv3PolicyPluginRQ | 
    try {
      Qspmpluginmanagerv3PolicyPluginRS result = apiInstance.qSPluginManagerInvokePolicy(pluginId, qspmpluginmanagerv3PolicyPluginRQ);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsPluginManagerApi#qSPluginManagerInvokePolicy");
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
| **pluginId** | **String**| Unique identifier for the plugin | |
| **qspmpluginmanagerv3PolicyPluginRQ** | [**Qspmpluginmanagerv3PolicyPluginRQ**](Qspmpluginmanagerv3PolicyPluginRQ.md)|  | |

### Return type

[**Qspmpluginmanagerv3PolicyPluginRS**](Qspmpluginmanagerv3PolicyPluginRS.md)

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

