# SnifAssistServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**snifAssistServiceTestRegex**](SnifAssistServiceApi.md#snifAssistServiceTestRegex) | **POST** /api/v3/snif/test_regex | Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex. |


<a id="snifAssistServiceTestRegex"></a>
# **snifAssistServiceTestRegex**
> Snifassistv3StatusResponseBase snifAssistServiceTestRegex(snifassistv3TestRegexRequest)

Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.SnifAssistServiceApi;

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

