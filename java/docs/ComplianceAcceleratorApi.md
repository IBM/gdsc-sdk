# ComplianceAcceleratorApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**complianceAcceleratorCreateWorkspace**](ComplianceAcceleratorApi.md#complianceAcceleratorCreateWorkspace) | **POST** /api/v3/compliance/workspace | Summary: Create workspace Description: Create a workspace. |
| [**complianceAcceleratorDeleteComplianceWorkspaces**](ComplianceAcceleratorApi.md#complianceAcceleratorDeleteComplianceWorkspaces) | **DELETE** /api/v3/compliance | Summary: Delete compliance workspaces Description: Delete workspaces. |
| [**complianceAcceleratorGetComplianceInfo**](ComplianceAcceleratorApi.md#complianceAcceleratorGetComplianceInfo) | **GET** /api/v3/compliance | Summary: Get compliance info Description: Return stored compliance data. |
| [**complianceAcceleratorHydrateWorkspace**](ComplianceAcceleratorApi.md#complianceAcceleratorHydrateWorkspace) | **POST** /api/v3/compliance/workspace/hydrate | HydrateWorkspace - Hydrates specified objects within a workspace |
| [**complianceAcceleratorStoreComplianceInfo**](ComplianceAcceleratorApi.md#complianceAcceleratorStoreComplianceInfo) | **POST** /api/v3/compliance | Summary: Store compliance info Description: Store compliance data. |


<a id="complianceAcceleratorCreateWorkspace"></a>
# **complianceAcceleratorCreateWorkspace**
> StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse complianceAcceleratorCreateWorkspace(complianceacceleratorv3CreateWorkspaceRequest)

Summary: Create workspace Description: Create a workspace.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.ComplianceAcceleratorApi;

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

    ComplianceAcceleratorApi apiInstance = new ComplianceAcceleratorApi(defaultClient);
    Complianceacceleratorv3CreateWorkspaceRequest complianceacceleratorv3CreateWorkspaceRequest = new Complianceacceleratorv3CreateWorkspaceRequest(); // Complianceacceleratorv3CreateWorkspaceRequest | 
    try {
      StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse result = apiInstance.complianceAcceleratorCreateWorkspace(complianceacceleratorv3CreateWorkspaceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceAcceleratorApi#complianceAcceleratorCreateWorkspace");
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
| **complianceacceleratorv3CreateWorkspaceRequest** | [**Complianceacceleratorv3CreateWorkspaceRequest**](Complianceacceleratorv3CreateWorkspaceRequest.md)|  | |

### Return type

[**StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse**](StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response.(streaming responses) |  -  |
| **0** | An unexpected error response. |  -  |

<a id="complianceAcceleratorDeleteComplianceWorkspaces"></a>
# **complianceAcceleratorDeleteComplianceWorkspaces**
> Complianceacceleratorv3DeleteComplianceWorkspacesResponse complianceAcceleratorDeleteComplianceWorkspaces(regulations, deleteAll)

Summary: Delete compliance workspaces Description: Delete workspaces.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.ComplianceAcceleratorApi;

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

    ComplianceAcceleratorApi apiInstance = new ComplianceAcceleratorApi(defaultClient);
    List<String> regulations = Arrays.asList(); // List<String> | Id to be deleted.
    Boolean deleteAll = true; // Boolean | if you want to delete a whole configuration.
    try {
      Complianceacceleratorv3DeleteComplianceWorkspacesResponse result = apiInstance.complianceAcceleratorDeleteComplianceWorkspaces(regulations, deleteAll);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceAcceleratorApi#complianceAcceleratorDeleteComplianceWorkspaces");
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
| **regulations** | [**List&lt;String&gt;**](String.md)| Id to be deleted. | [optional] |
| **deleteAll** | **Boolean**| if you want to delete a whole configuration. | [optional] |

### Return type

[**Complianceacceleratorv3DeleteComplianceWorkspacesResponse**](Complianceacceleratorv3DeleteComplianceWorkspacesResponse.md)

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

<a id="complianceAcceleratorGetComplianceInfo"></a>
# **complianceAcceleratorGetComplianceInfo**
> Complianceacceleratorv3GetComplianceInfoResponse complianceAcceleratorGetComplianceInfo(isBrief)

Summary: Get compliance info Description: Return stored compliance data.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.ComplianceAcceleratorApi;

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

    ComplianceAcceleratorApi apiInstance = new ComplianceAcceleratorApi(defaultClient);
    Boolean isBrief = true; // Boolean | gives compliance workspace data without reaching out to other services - meant to be quicker for dashboards.
    try {
      Complianceacceleratorv3GetComplianceInfoResponse result = apiInstance.complianceAcceleratorGetComplianceInfo(isBrief);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceAcceleratorApi#complianceAcceleratorGetComplianceInfo");
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
| **isBrief** | **Boolean**| gives compliance workspace data without reaching out to other services - meant to be quicker for dashboards. | [optional] |

### Return type

[**Complianceacceleratorv3GetComplianceInfoResponse**](Complianceacceleratorv3GetComplianceInfoResponse.md)

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

<a id="complianceAcceleratorHydrateWorkspace"></a>
# **complianceAcceleratorHydrateWorkspace**
> Complianceacceleratorv3HydrateComplianceWorkspacesResponse complianceAcceleratorHydrateWorkspace(complianceacceleratorv3HydrateComplianceWorkspacesRequest)

HydrateWorkspace - Hydrates specified objects within a workspace

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.ComplianceAcceleratorApi;

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

    ComplianceAcceleratorApi apiInstance = new ComplianceAcceleratorApi(defaultClient);
    Complianceacceleratorv3HydrateComplianceWorkspacesRequest complianceacceleratorv3HydrateComplianceWorkspacesRequest = new Complianceacceleratorv3HydrateComplianceWorkspacesRequest(); // Complianceacceleratorv3HydrateComplianceWorkspacesRequest | 
    try {
      Complianceacceleratorv3HydrateComplianceWorkspacesResponse result = apiInstance.complianceAcceleratorHydrateWorkspace(complianceacceleratorv3HydrateComplianceWorkspacesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceAcceleratorApi#complianceAcceleratorHydrateWorkspace");
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
| **complianceacceleratorv3HydrateComplianceWorkspacesRequest** | [**Complianceacceleratorv3HydrateComplianceWorkspacesRequest**](Complianceacceleratorv3HydrateComplianceWorkspacesRequest.md)|  | |

### Return type

[**Complianceacceleratorv3HydrateComplianceWorkspacesResponse**](Complianceacceleratorv3HydrateComplianceWorkspacesResponse.md)

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

<a id="complianceAcceleratorStoreComplianceInfo"></a>
# **complianceAcceleratorStoreComplianceInfo**
> Complianceacceleratorv3StoreComplianceInfoResponse complianceAcceleratorStoreComplianceInfo(complianceacceleratorv3StoreComplianceInfoRequest)

Summary: Store compliance info Description: Store compliance data.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.ComplianceAcceleratorApi;

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

    ComplianceAcceleratorApi apiInstance = new ComplianceAcceleratorApi(defaultClient);
    Complianceacceleratorv3StoreComplianceInfoRequest complianceacceleratorv3StoreComplianceInfoRequest = new Complianceacceleratorv3StoreComplianceInfoRequest(); // Complianceacceleratorv3StoreComplianceInfoRequest | 
    try {
      Complianceacceleratorv3StoreComplianceInfoResponse result = apiInstance.complianceAcceleratorStoreComplianceInfo(complianceacceleratorv3StoreComplianceInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceAcceleratorApi#complianceAcceleratorStoreComplianceInfo");
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
| **complianceacceleratorv3StoreComplianceInfoRequest** | [**Complianceacceleratorv3StoreComplianceInfoRequest**](Complianceacceleratorv3StoreComplianceInfoRequest.md)|  | |

### Return type

[**Complianceacceleratorv3StoreComplianceInfoResponse**](Complianceacceleratorv3StoreComplianceInfoResponse.md)

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

