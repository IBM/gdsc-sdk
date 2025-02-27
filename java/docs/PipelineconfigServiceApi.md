# PipelineconfigServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pipelineconfigServiceDeleteTenantResources**](PipelineconfigServiceApi.md#pipelineconfigServiceDeleteTenantResources) | **DELETE** /api/v3/resources/{tenant_id}/{resource} | Summary: Delete a tenant resource Description: Delete tenant specific resources such as data warehouse, mongo, postgres and s3. |


<a id="pipelineconfigServiceDeleteTenantResources"></a>
# **pipelineconfigServiceDeleteTenantResources**
> Pipelineconfigv3DeleteTenantResponse pipelineconfigServiceDeleteTenantResources(tenantId, resource)

Summary: Delete a tenant resource Description: Delete tenant specific resources such as data warehouse, mongo, postgres and s3.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.PipelineconfigServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PipelineconfigServiceApi apiInstance = new PipelineconfigServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | unique tenant ID
    String resource = "resource_example"; // String | resource specifies the specific resource to delete
    try {
      Pipelineconfigv3DeleteTenantResponse result = apiInstance.pipelineconfigServiceDeleteTenantResources(tenantId, resource);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineconfigServiceApi#pipelineconfigServiceDeleteTenantResources");
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
| **tenantId** | **String**| unique tenant ID | |
| **resource** | **String**| resource specifies the specific resource to delete | |

### Return type

[**Pipelineconfigv3DeleteTenantResponse**](Pipelineconfigv3DeleteTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

