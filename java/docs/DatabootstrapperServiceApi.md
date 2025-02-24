# DatabootstrapperServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**databootstrapperServiceLoadData**](DatabootstrapperServiceApi.md#databootstrapperServiceLoadData) | **POST** /api/v3/databootstrapper/data | Summary: Load data Description: Load data for a tenant. |


<a id="databootstrapperServiceLoadData"></a>
# **databootstrapperServiceLoadData**
> Databootstrapperv3LoadDataResponse databootstrapperServiceLoadData(databootstrapperv3LoadDataRequest)

Summary: Load data Description: Load data for a tenant.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DatabootstrapperServiceApi;

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

    DatabootstrapperServiceApi apiInstance = new DatabootstrapperServiceApi(defaultClient);
    Databootstrapperv3LoadDataRequest databootstrapperv3LoadDataRequest = new Databootstrapperv3LoadDataRequest(); // Databootstrapperv3LoadDataRequest | 
    try {
      Databootstrapperv3LoadDataResponse result = apiInstance.databootstrapperServiceLoadData(databootstrapperv3LoadDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabootstrapperServiceApi#databootstrapperServiceLoadData");
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
| **databootstrapperv3LoadDataRequest** | [**Databootstrapperv3LoadDataRequest**](Databootstrapperv3LoadDataRequest.md)|  | |

### Return type

[**Databootstrapperv3LoadDataResponse**](Databootstrapperv3LoadDataResponse.md)

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

