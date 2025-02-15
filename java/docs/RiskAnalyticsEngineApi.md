# RiskAnalyticsEngineApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**riskAnalyticsEngineGetLeadGeneratorConfig**](RiskAnalyticsEngineApi.md#riskAnalyticsEngineGetLeadGeneratorConfig) | **GET** /api/v3/risk/lead_generator | Summary: Get lead generator config Description: Retrieve the configuration of a lead generator. |
| [**riskAnalyticsEngineUpdateLeadGeneratorConfig**](RiskAnalyticsEngineApi.md#riskAnalyticsEngineUpdateLeadGeneratorConfig) | **PUT** /api/v3/risk/lead_generator | Summary: Update lead generator config Description: Update the configuration of a leads generator. |


<a id="riskAnalyticsEngineGetLeadGeneratorConfig"></a>
# **riskAnalyticsEngineGetLeadGeneratorConfig**
> Riskanalyticsenginev3GetLeadGeneratorConfigResponse riskAnalyticsEngineGetLeadGeneratorConfig()

Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.RiskAnalyticsEngineApi;

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

    RiskAnalyticsEngineApi apiInstance = new RiskAnalyticsEngineApi(defaultClient);
    try {
      Riskanalyticsenginev3GetLeadGeneratorConfigResponse result = apiInstance.riskAnalyticsEngineGetLeadGeneratorConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsEngineApi#riskAnalyticsEngineGetLeadGeneratorConfig");
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

[**Riskanalyticsenginev3GetLeadGeneratorConfigResponse**](Riskanalyticsenginev3GetLeadGeneratorConfigResponse.md)

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

<a id="riskAnalyticsEngineUpdateLeadGeneratorConfig"></a>
# **riskAnalyticsEngineUpdateLeadGeneratorConfig**
> Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse riskAnalyticsEngineUpdateLeadGeneratorConfig(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest)

Summary: Update lead generator config Description: Update the configuration of a leads generator.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.RiskAnalyticsEngineApi;

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

    RiskAnalyticsEngineApi apiInstance = new RiskAnalyticsEngineApi(defaultClient);
    Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest riskanalyticsenginev3UpdateLeadGeneratorConfigRequest = new Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest(); // Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest | 
    try {
      Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse result = apiInstance.riskAnalyticsEngineUpdateLeadGeneratorConfig(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsEngineApi#riskAnalyticsEngineUpdateLeadGeneratorConfig");
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
| **riskanalyticsenginev3UpdateLeadGeneratorConfigRequest** | [**Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest**](Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest.md)|  | |

### Return type

[**Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse**](Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse.md)

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

