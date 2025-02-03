# RiskAnalyticsMlClassificationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**riskAnalyticsMlClassificationResetModelToDefaults**](RiskAnalyticsMlClassificationApi.md#riskAnalyticsMlClassificationResetModelToDefaults) | **POST** /api/v3/classification/ml/models/reset | Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible. |


<a id="riskAnalyticsMlClassificationResetModelToDefaults"></a>
# **riskAnalyticsMlClassificationResetModelToDefaults**
> Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse riskAnalyticsMlClassificationResetModelToDefaults()

Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RiskAnalyticsMlClassificationApi;

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

    RiskAnalyticsMlClassificationApi apiInstance = new RiskAnalyticsMlClassificationApi(defaultClient);
    try {
      Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse result = apiInstance.riskAnalyticsMlClassificationResetModelToDefaults();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsMlClassificationApi#riskAnalyticsMlClassificationResetModelToDefaults");
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

[**Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse**](Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse.md)

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

