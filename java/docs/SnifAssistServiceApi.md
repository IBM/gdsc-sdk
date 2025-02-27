# SnifAssistServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**snifAssistServiceGetSnifConfig**](SnifAssistServiceApi.md#snifAssistServiceGetSnifConfig) | **GET** /api/v3/snif/config | Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership. |
| [**snifAssistServiceGetSnifPolicy**](SnifAssistServiceApi.md#snifAssistServiceGetSnifPolicy) | **GET** /api/v3/snif/policy | Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership. |
| [**snifAssistServicePostSnifFeedback**](SnifAssistServiceApi.md#snifAssistServicePostSnifFeedback) | **POST** /api/v3/snif/feedback | Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service. |
| [**snifAssistServiceTestRegex**](SnifAssistServiceApi.md#snifAssistServiceTestRegex) | **POST** /api/v3/snif/test_regex | Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex. |


<a id="snifAssistServiceGetSnifConfig"></a>
# **snifAssistServiceGetSnifConfig**
> Snifassistv3GetSnifConfigResponse snifAssistServiceGetSnifConfig(tenantId, edgeId, configType, configId, configurationParametersCrc)

Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.SnifAssistServiceApi;

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

    SnifAssistServiceApi apiInstance = new SnifAssistServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | Provide tenant_id.
    String edgeId = "edgeId_example"; // String | Provide edge_id.
    String configType = "configType_example"; // String | Provide configuration type.
    String configId = "configId_example"; // String | Specify config_id provided by configuration service.
    Long configurationParametersCrc = 56L; // Long | Provide CRC value of configuration parameters that sniffer is currently using.
    try {
      Snifassistv3GetSnifConfigResponse result = apiInstance.snifAssistServiceGetSnifConfig(tenantId, edgeId, configType, configId, configurationParametersCrc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnifAssistServiceApi#snifAssistServiceGetSnifConfig");
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
| **tenantId** | **String**| Provide tenant_id. | [optional] |
| **edgeId** | **String**| Provide edge_id. | [optional] |
| **configType** | **String**| Provide configuration type. | [optional] |
| **configId** | **String**| Specify config_id provided by configuration service. | [optional] |
| **configurationParametersCrc** | **Long**| Provide CRC value of configuration parameters that sniffer is currently using. | [optional] |

### Return type

[**Snifassistv3GetSnifConfigResponse**](Snifassistv3GetSnifConfigResponse.md)

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

<a id="snifAssistServiceGetSnifPolicy"></a>
# **snifAssistServiceGetSnifPolicy**
> Snifassistv3StatusResponseBase snifAssistServiceGetSnifPolicy(tenantId, edgeId, policyCrc)

Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.SnifAssistServiceApi;

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

    SnifAssistServiceApi apiInstance = new SnifAssistServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | Specify tenant_id.
    String edgeId = "edgeId_example"; // String | Specify edge_id if known.
    Long policyCrc = 56L; // Long | Provide CRC value of installed policy that sniffer is currently using.
    try {
      Snifassistv3StatusResponseBase result = apiInstance.snifAssistServiceGetSnifPolicy(tenantId, edgeId, policyCrc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnifAssistServiceApi#snifAssistServiceGetSnifPolicy");
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
| **tenantId** | **String**| Specify tenant_id. | [optional] |
| **edgeId** | **String**| Specify edge_id if known. | [optional] |
| **policyCrc** | **Long**| Provide CRC value of installed policy that sniffer is currently using. | [optional] |

### Return type

[**Snifassistv3StatusResponseBase**](Snifassistv3StatusResponseBase.md)

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

<a id="snifAssistServicePostSnifFeedback"></a>
# **snifAssistServicePostSnifFeedback**
> Snifassistv3StatusResponseBase snifAssistServicePostSnifFeedback(snifassistv3PostSnifFeedbackRequest)

Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.SnifAssistServiceApi;

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

    SnifAssistServiceApi apiInstance = new SnifAssistServiceApi(defaultClient);
    Snifassistv3PostSnifFeedbackRequest snifassistv3PostSnifFeedbackRequest = new Snifassistv3PostSnifFeedbackRequest(); // Snifassistv3PostSnifFeedbackRequest | 
    try {
      Snifassistv3StatusResponseBase result = apiInstance.snifAssistServicePostSnifFeedback(snifassistv3PostSnifFeedbackRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnifAssistServiceApi#snifAssistServicePostSnifFeedback");
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
| **snifassistv3PostSnifFeedbackRequest** | [**Snifassistv3PostSnifFeedbackRequest**](Snifassistv3PostSnifFeedbackRequest.md)|  | |

### Return type

[**Snifassistv3StatusResponseBase**](Snifassistv3StatusResponseBase.md)

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

<a id="snifAssistServiceTestRegex"></a>
# **snifAssistServiceTestRegex**
> Snifassistv3StatusResponseBase snifAssistServiceTestRegex(snifassistv3TestRegexRequest)

Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.SnifAssistServiceApi;

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

    SnifAssistServiceApi apiInstance = new SnifAssistServiceApi(defaultClient);
    Snifassistv3TestRegexRequest snifassistv3TestRegexRequest = new Snifassistv3TestRegexRequest(); // Snifassistv3TestRegexRequest | 
    try {
      Snifassistv3StatusResponseBase result = apiInstance.snifAssistServiceTestRegex(snifassistv3TestRegexRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnifAssistServiceApi#snifAssistServiceTestRegex");
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
| **snifassistv3TestRegexRequest** | [**Snifassistv3TestRegexRequest**](Snifassistv3TestRegexRequest.md)|  | |

### Return type

[**Snifassistv3StatusResponseBase**](Snifassistv3StatusResponseBase.md)

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

