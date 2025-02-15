# RiskAnalyticsDataProcessorApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**riskAnalyticsDataProcessorGetRiskContext**](RiskAnalyticsDataProcessorApi.md#riskAnalyticsDataProcessorGetRiskContext) | **GET** /api/v3/risk_events/context/{risk_id} | Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions. |
| [**riskAnalyticsDataProcessorGetRiskPredefinedQuestions**](RiskAnalyticsDataProcessorApi.md#riskAnalyticsDataProcessorGetRiskPredefinedQuestions) | **GET** /api/v3/risk_events/{risk_id}/questions | Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations. |


<a id="riskAnalyticsDataProcessorGetRiskContext"></a>
# **riskAnalyticsDataProcessorGetRiskContext**
> Riskanalyticsdataprocessorv3GetRiskContextResponse riskAnalyticsDataProcessorGetRiskContext(riskId, timezone)

Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.RiskAnalyticsDataProcessorApi;

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

    RiskAnalyticsDataProcessorApi apiInstance = new RiskAnalyticsDataProcessorApi(defaultClient);
    Integer riskId = 56; // Integer | Risk id.
    String timezone = "timezone_example"; // String | Timezone in IANA format.
    try {
      Riskanalyticsdataprocessorv3GetRiskContextResponse result = apiInstance.riskAnalyticsDataProcessorGetRiskContext(riskId, timezone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsDataProcessorApi#riskAnalyticsDataProcessorGetRiskContext");
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
| **riskId** | **Integer**| Risk id. | |
| **timezone** | **String**| Timezone in IANA format. | [optional] |

### Return type

[**Riskanalyticsdataprocessorv3GetRiskContextResponse**](Riskanalyticsdataprocessorv3GetRiskContextResponse.md)

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

<a id="riskAnalyticsDataProcessorGetRiskPredefinedQuestions"></a>
# **riskAnalyticsDataProcessorGetRiskPredefinedQuestions**
> Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse riskAnalyticsDataProcessorGetRiskPredefinedQuestions(riskId)

Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.RiskAnalyticsDataProcessorApi;

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

    RiskAnalyticsDataProcessorApi apiInstance = new RiskAnalyticsDataProcessorApi(defaultClient);
    Integer riskId = 56; // Integer | Risk id.
    try {
      Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse result = apiInstance.riskAnalyticsDataProcessorGetRiskPredefinedQuestions(riskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsDataProcessorApi#riskAnalyticsDataProcessorGetRiskPredefinedQuestions");
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
| **riskId** | **Integer**| Risk id. | |

### Return type

[**Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse**](Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse.md)

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

