# AnalyticsEventsServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyticsEventsServiceDeleteCacheKey**](AnalyticsEventsServiceApi.md#analyticsEventsServiceDeleteCacheKey) | **DELETE** /api/v3/eventscache/{cache_key} | Summary: Delete cache key Description: Return delete key result message. |
| [**analyticsEventsServicePostQSAdvisorRisk**](AnalyticsEventsServiceApi.md#analyticsEventsServicePostQSAdvisorRisk) | **POST** /api/v3/risk/qs_advisor | Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status |


<a id="analyticsEventsServiceDeleteCacheKey"></a>
# **analyticsEventsServiceDeleteCacheKey**
> Analyticseventsv3DeleteCacheKeyResponse analyticsEventsServiceDeleteCacheKey(cacheKey, analyticseventsv3DeleteCacheKeyRequest)

Summary: Delete cache key Description: Return delete key result message.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnalyticsEventsServiceApi;

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

    AnalyticsEventsServiceApi apiInstance = new AnalyticsEventsServiceApi(defaultClient);
    String cacheKey = "cacheKey_example"; // String | The cache key to delete.
    Analyticseventsv3DeleteCacheKeyRequest analyticseventsv3DeleteCacheKeyRequest = new Analyticseventsv3DeleteCacheKeyRequest(); // Analyticseventsv3DeleteCacheKeyRequest | 
    try {
      Analyticseventsv3DeleteCacheKeyResponse result = apiInstance.analyticsEventsServiceDeleteCacheKey(cacheKey, analyticseventsv3DeleteCacheKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsEventsServiceApi#analyticsEventsServiceDeleteCacheKey");
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
| **cacheKey** | **String**| The cache key to delete. | |
| **analyticseventsv3DeleteCacheKeyRequest** | [**Analyticseventsv3DeleteCacheKeyRequest**](Analyticseventsv3DeleteCacheKeyRequest.md)|  | |

### Return type

[**Analyticseventsv3DeleteCacheKeyResponse**](Analyticseventsv3DeleteCacheKeyResponse.md)

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

<a id="analyticsEventsServicePostQSAdvisorRisk"></a>
# **analyticsEventsServicePostQSAdvisorRisk**
> Analyticseventsv3PostQSAdvisorRiskResponse analyticsEventsServicePostQSAdvisorRisk(analyticseventsv3PostQSAdvisorRiskRequest)

Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnalyticsEventsServiceApi;

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

    AnalyticsEventsServiceApi apiInstance = new AnalyticsEventsServiceApi(defaultClient);
    Analyticseventsv3PostQSAdvisorRiskRequest analyticseventsv3PostQSAdvisorRiskRequest = new Analyticseventsv3PostQSAdvisorRiskRequest(); // Analyticseventsv3PostQSAdvisorRiskRequest | 
    try {
      Analyticseventsv3PostQSAdvisorRiskResponse result = apiInstance.analyticsEventsServicePostQSAdvisorRisk(analyticseventsv3PostQSAdvisorRiskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsEventsServiceApi#analyticsEventsServicePostQSAdvisorRisk");
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
| **analyticseventsv3PostQSAdvisorRiskRequest** | [**Analyticseventsv3PostQSAdvisorRiskRequest**](Analyticseventsv3PostQSAdvisorRiskRequest.md)|  | |

### Return type

[**Analyticseventsv3PostQSAdvisorRiskResponse**](Analyticseventsv3PostQSAdvisorRiskResponse.md)

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

