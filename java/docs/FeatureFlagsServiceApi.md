# FeatureFlagsServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**featureFlagsServiceDeleteFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceDeleteFeatureFlagOverrides) | **DELETE** /api/v3/feature_flags/overrides | Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database. |
| [**featureFlagsServiceGetFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceGetFeatureFlagOverrides) | **GET** /api/v3/feature_flags/overrides | Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name. |
| [**featureFlagsServiceGetFeatureFlags**](FeatureFlagsServiceApi.md#featureFlagsServiceGetFeatureFlags) | **GET** /api/v3/feature_flags | Summary: Get feature flags Description: Get feature flags by Feature Flag Name. |
| [**featureFlagsServiceUpdateFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceUpdateFeatureFlagOverrides) | **PUT** /api/v3/feature_flags/overrides | Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database. |


<a id="featureFlagsServiceDeleteFeatureFlagOverrides"></a>
# **featureFlagsServiceDeleteFeatureFlagOverrides**
> Featureflagsv3DeleteFeatureFlagOverridesResponse featureFlagsServiceDeleteFeatureFlagOverrides(flagName, tenantId)

Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.FeatureFlagsServiceApi;

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

    FeatureFlagsServiceApi apiInstance = new FeatureFlagsServiceApi(defaultClient);
    String flagName = "flagName_example"; // String | Flag name.
    String tenantId = "tenantId_example"; // String | Optional tenant id.
    try {
      Featureflagsv3DeleteFeatureFlagOverridesResponse result = apiInstance.featureFlagsServiceDeleteFeatureFlagOverrides(flagName, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsServiceApi#featureFlagsServiceDeleteFeatureFlagOverrides");
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
| **flagName** | **String**| Flag name. | [optional] |
| **tenantId** | **String**| Optional tenant id. | [optional] |

### Return type

[**Featureflagsv3DeleteFeatureFlagOverridesResponse**](Featureflagsv3DeleteFeatureFlagOverridesResponse.md)

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

<a id="featureFlagsServiceGetFeatureFlagOverrides"></a>
# **featureFlagsServiceGetFeatureFlagOverrides**
> Featureflagsv3GetFeatureFlagOverridesResponse featureFlagsServiceGetFeatureFlagOverrides(tenantId, flagNames)

Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.FeatureFlagsServiceApi;

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

    FeatureFlagsServiceApi apiInstance = new FeatureFlagsServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | Optional tenant id.
    List<String> flagNames = Arrays.asList(); // List<String> | Optional flag names; if empty then return all flag.
    try {
      Featureflagsv3GetFeatureFlagOverridesResponse result = apiInstance.featureFlagsServiceGetFeatureFlagOverrides(tenantId, flagNames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsServiceApi#featureFlagsServiceGetFeatureFlagOverrides");
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
| **tenantId** | **String**| Optional tenant id. | [optional] |
| **flagNames** | [**List&lt;String&gt;**](String.md)| Optional flag names; if empty then return all flag. | [optional] |

### Return type

[**Featureflagsv3GetFeatureFlagOverridesResponse**](Featureflagsv3GetFeatureFlagOverridesResponse.md)

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

<a id="featureFlagsServiceGetFeatureFlags"></a>
# **featureFlagsServiceGetFeatureFlags**
> Featureflagsv3GetFeatureFlagsResponse featureFlagsServiceGetFeatureFlags(tenantId, flagNames)

Summary: Get feature flags Description: Get feature flags by Feature Flag Name.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.FeatureFlagsServiceApi;

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

    FeatureFlagsServiceApi apiInstance = new FeatureFlagsServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | Tenant id.
    List<String> flagNames = Arrays.asList(); // List<String> | Optional flag names; if empty then return all flag.
    try {
      Featureflagsv3GetFeatureFlagsResponse result = apiInstance.featureFlagsServiceGetFeatureFlags(tenantId, flagNames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsServiceApi#featureFlagsServiceGetFeatureFlags");
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
| **tenantId** | **String**| Tenant id. | [optional] |
| **flagNames** | [**List&lt;String&gt;**](String.md)| Optional flag names; if empty then return all flag. | [optional] |

### Return type

[**Featureflagsv3GetFeatureFlagsResponse**](Featureflagsv3GetFeatureFlagsResponse.md)

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

<a id="featureFlagsServiceUpdateFeatureFlagOverrides"></a>
# **featureFlagsServiceUpdateFeatureFlagOverrides**
> Featureflagsv3UpdateFeatureFlagOverridesResponse featureFlagsServiceUpdateFeatureFlagOverrides(featureflagsv3UpdateFeatureFlagOverridesRequest)

Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.FeatureFlagsServiceApi;

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

    FeatureFlagsServiceApi apiInstance = new FeatureFlagsServiceApi(defaultClient);
    Featureflagsv3UpdateFeatureFlagOverridesRequest featureflagsv3UpdateFeatureFlagOverridesRequest = new Featureflagsv3UpdateFeatureFlagOverridesRequest(); // Featureflagsv3UpdateFeatureFlagOverridesRequest | 
    try {
      Featureflagsv3UpdateFeatureFlagOverridesResponse result = apiInstance.featureFlagsServiceUpdateFeatureFlagOverrides(featureflagsv3UpdateFeatureFlagOverridesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsServiceApi#featureFlagsServiceUpdateFeatureFlagOverrides");
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
| **featureflagsv3UpdateFeatureFlagOverridesRequest** | [**Featureflagsv3UpdateFeatureFlagOverridesRequest**](Featureflagsv3UpdateFeatureFlagOverridesRequest.md)|  | |

### Return type

[**Featureflagsv3UpdateFeatureFlagOverridesResponse**](Featureflagsv3UpdateFeatureFlagOverridesResponse.md)

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

