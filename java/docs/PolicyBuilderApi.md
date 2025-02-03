# PolicyBuilderApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**policyBuilderClonePolicy**](PolicyBuilderApi.md#policyBuilderClonePolicy) | **POST** /api/v3/policies/clone/{policy_id} | Summary: Clone policy Description: Clone a policy. |
| [**policyBuilderCreatePolicy**](PolicyBuilderApi.md#policyBuilderCreatePolicy) | **POST** /api/v3/policies | Summary: Create policy Description: Create Policy returns response code and message. |
| [**policyBuilderDeleteGdpSyncEntry**](PolicyBuilderApi.md#policyBuilderDeleteGdpSyncEntry) | **DELETE** /api/v3/policies/sync_entry | Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection |
| [**policyBuilderDeletePolicies**](PolicyBuilderApi.md#policyBuilderDeletePolicies) | **DELETE** /api/v3/policies | Summary: Delete policies Description: Delete Policy returns response code and message. |
| [**policyBuilderGetGdpPolicyMetaData**](PolicyBuilderApi.md#policyBuilderGetGdpPolicyMetaData) | **GET** /api/v3/policies/metadata_list | Summary: Get GDP policy summary information Description: Get GDP&#39;s CM&#39;s policy summary from mogodb |
| [**policyBuilderGetPolicies**](PolicyBuilderApi.md#policyBuilderGetPolicies) | **GET** /api/v3/policies | Summary: Get policies Description: Return a list of policies to the caller. |
| [**policyBuilderGetPolicyDetails**](PolicyBuilderApi.md#policyBuilderGetPolicyDetails) | **GET** /api/v3/policies/{policy_id}/details | Summary: Get policy details Description: Return a list of rules inside the policy. |
| [**policyBuilderGetPolicyNamesFromRuleIDs**](PolicyBuilderApi.md#policyBuilderGetPolicyNamesFromRuleIDs) | **POST** /api/v3/policies/policy_names | Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID. |
| [**policyBuilderGetPolicySyncList**](PolicyBuilderApi.md#policyBuilderGetPolicySyncList) | **GET** /api/v3/policies/sync_list | Summary: Get list of synced polices Description: Returns the list and status of sync entries |
| [**policyBuilderGetReceivers**](PolicyBuilderApi.md#policyBuilderGetReceivers) | **GET** /api/v3/policies/receivers | Summary: Get receivers Description: Get all the receivers associated with actions. |
| [**policyBuilderGetRuleMetadata**](PolicyBuilderApi.md#policyBuilderGetRuleMetadata) | **GET** /api/v3/rules/metadata | Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller. |
| [**policyBuilderInsertGdpPolicy**](PolicyBuilderApi.md#policyBuilderInsertGdpPolicy) | **POST** /api/v3/policies/sync_entry | Summary: Insert GDP policy sync entry Description: Inserts GDP policy&#39;s name into sync collection |
| [**policyBuilderInsertGdpPolicyMetaData**](PolicyBuilderApi.md#policyBuilderInsertGdpPolicyMetaData) | **POST** /api/v3/central_managers/{central_manager_id}/policies/policy_metadata | Summary: Insert gdp policy summaries Description: Inserts GDP&#39;s CM&#39;s policy summary information into mogodb. (This API is called from GDP only) |
| [**policyBuilderInstallPolicies**](PolicyBuilderApi.md#policyBuilderInstallPolicies) | **PUT** /api/v3/policies/install | Summary: Install policies Description: Activate Policies request performs activations. |
| [**policyBuilderIntegrationCheck**](PolicyBuilderApi.md#policyBuilderIntegrationCheck) | **GET** /api/v3/policies/integration_check/{integration_id} | Summary: Integration check Description: Check if integration id is being used in policies. |
| [**policyBuilderPoliciesGroups**](PolicyBuilderApi.md#policyBuilderPoliciesGroups) | **GET** /api/v3/policies/groups | Summary: Policies groups Description: Get policy groups. |
| [**policyBuilderRuleValidation**](PolicyBuilderApi.md#policyBuilderRuleValidation) | **POST** /api/v3/rules/validate | Summary: Rule validation Description: Validate a rule parameters and actions. |
| [**policyBuilderStorePoliciesGdp**](PolicyBuilderApi.md#policyBuilderStorePoliciesGdp) | **POST** /api/v3/policies/{central_manager_id} | Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only) |


<a id="policyBuilderClonePolicy"></a>
# **policyBuilderClonePolicy**
> Policybuilderv3StandardCRUDResponse policyBuilderClonePolicy(policyId, policybuilderv3ClonePolicyRequest)

Summary: Clone policy Description: Clone a policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    String policyId = "policyId_example"; // String | Policy id that needs to be cloned.
    Policybuilderv3ClonePolicyRequest policybuilderv3ClonePolicyRequest = new Policybuilderv3ClonePolicyRequest(); // Policybuilderv3ClonePolicyRequest | 
    try {
      Policybuilderv3StandardCRUDResponse result = apiInstance.policyBuilderClonePolicy(policyId, policybuilderv3ClonePolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderClonePolicy");
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
| **policyId** | **String**| Policy id that needs to be cloned. | |
| **policybuilderv3ClonePolicyRequest** | [**Policybuilderv3ClonePolicyRequest**](Policybuilderv3ClonePolicyRequest.md)|  | |

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

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

<a id="policyBuilderCreatePolicy"></a>
# **policyBuilderCreatePolicy**
> Policybuilderv3CreateUpdatePolicyResponse policyBuilderCreatePolicy(policybuilderv3CreateUpdatePolicyRequest)

Summary: Create policy Description: Create Policy returns response code and message.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    Policybuilderv3CreateUpdatePolicyRequest policybuilderv3CreateUpdatePolicyRequest = new Policybuilderv3CreateUpdatePolicyRequest(); // Policybuilderv3CreateUpdatePolicyRequest | 
    try {
      Policybuilderv3CreateUpdatePolicyResponse result = apiInstance.policyBuilderCreatePolicy(policybuilderv3CreateUpdatePolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderCreatePolicy");
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
| **policybuilderv3CreateUpdatePolicyRequest** | [**Policybuilderv3CreateUpdatePolicyRequest**](Policybuilderv3CreateUpdatePolicyRequest.md)|  | |

### Return type

[**Policybuilderv3CreateUpdatePolicyResponse**](Policybuilderv3CreateUpdatePolicyResponse.md)

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

<a id="policyBuilderDeleteGdpSyncEntry"></a>
# **policyBuilderDeleteGdpSyncEntry**
> Policybuilderv3DeleteGdpPolicySyncResponse policyBuilderDeleteGdpSyncEntry(syncIds)

Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    List<String> syncIds = Arrays.asList(); // List<String> | Policy sync entry id to delete from sync.
    try {
      Policybuilderv3DeleteGdpPolicySyncResponse result = apiInstance.policyBuilderDeleteGdpSyncEntry(syncIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderDeleteGdpSyncEntry");
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
| **syncIds** | [**List&lt;String&gt;**](String.md)| Policy sync entry id to delete from sync. | [optional] |

### Return type

[**Policybuilderv3DeleteGdpPolicySyncResponse**](Policybuilderv3DeleteGdpPolicySyncResponse.md)

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

<a id="policyBuilderDeletePolicies"></a>
# **policyBuilderDeletePolicies**
> Policybuilderv3StandardCRUDResponse policyBuilderDeletePolicies(policyIds)

Summary: Delete policies Description: Delete Policy returns response code and message.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    List<String> policyIds = Arrays.asList(); // List<String> | Policy ids.
    try {
      Policybuilderv3StandardCRUDResponse result = apiInstance.policyBuilderDeletePolicies(policyIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderDeletePolicies");
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
| **policyIds** | [**List&lt;String&gt;**](String.md)| Policy ids. | [optional] |

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

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

<a id="policyBuilderGetGdpPolicyMetaData"></a>
# **policyBuilderGetGdpPolicyMetaData**
> Policybuilderv3GetGdpPolicyMetaDataResponse policyBuilderGetGdpPolicyMetaData()

Summary: Get GDP policy summary information Description: Get GDP&#39;s CM&#39;s policy summary from mogodb

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    try {
      Policybuilderv3GetGdpPolicyMetaDataResponse result = apiInstance.policyBuilderGetGdpPolicyMetaData();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderGetGdpPolicyMetaData");
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

[**Policybuilderv3GetGdpPolicyMetaDataResponse**](Policybuilderv3GetGdpPolicyMetaDataResponse.md)

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

<a id="policyBuilderGetPolicies"></a>
# **policyBuilderGetPolicies**
> Policybuilderv3GetPoliciesResponse policyBuilderGetPolicies()

Summary: Get policies Description: Return a list of policies to the caller.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    try {
      Policybuilderv3GetPoliciesResponse result = apiInstance.policyBuilderGetPolicies();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderGetPolicies");
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

[**Policybuilderv3GetPoliciesResponse**](Policybuilderv3GetPoliciesResponse.md)

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

<a id="policyBuilderGetPolicyDetails"></a>
# **policyBuilderGetPolicyDetails**
> Policybuilderv3GetPolicyDetailsResponse policyBuilderGetPolicyDetails(policyId)

Summary: Get policy details Description: Return a list of rules inside the policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    String policyId = "policyId_example"; // String | Policy id.
    try {
      Policybuilderv3GetPolicyDetailsResponse result = apiInstance.policyBuilderGetPolicyDetails(policyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderGetPolicyDetails");
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
| **policyId** | **String**| Policy id. | |

### Return type

[**Policybuilderv3GetPolicyDetailsResponse**](Policybuilderv3GetPolicyDetailsResponse.md)

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

<a id="policyBuilderGetPolicyNamesFromRuleIDs"></a>
# **policyBuilderGetPolicyNamesFromRuleIDs**
> Policybuilderv3GetPolicyNamesFromRuleIDsResponse policyBuilderGetPolicyNamesFromRuleIDs(policybuilderv3GetPolicyNamesFromRuleIDsRequest)

Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    Policybuilderv3GetPolicyNamesFromRuleIDsRequest policybuilderv3GetPolicyNamesFromRuleIDsRequest = new Policybuilderv3GetPolicyNamesFromRuleIDsRequest(); // Policybuilderv3GetPolicyNamesFromRuleIDsRequest | 
    try {
      Policybuilderv3GetPolicyNamesFromRuleIDsResponse result = apiInstance.policyBuilderGetPolicyNamesFromRuleIDs(policybuilderv3GetPolicyNamesFromRuleIDsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderGetPolicyNamesFromRuleIDs");
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
| **policybuilderv3GetPolicyNamesFromRuleIDsRequest** | [**Policybuilderv3GetPolicyNamesFromRuleIDsRequest**](Policybuilderv3GetPolicyNamesFromRuleIDsRequest.md)|  | |

### Return type

[**Policybuilderv3GetPolicyNamesFromRuleIDsResponse**](Policybuilderv3GetPolicyNamesFromRuleIDsResponse.md)

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

<a id="policyBuilderGetPolicySyncList"></a>
# **policyBuilderGetPolicySyncList**
> Policybuilderv3GetPolicySyncListResponse policyBuilderGetPolicySyncList()

Summary: Get list of synced polices Description: Returns the list and status of sync entries

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    try {
      Policybuilderv3GetPolicySyncListResponse result = apiInstance.policyBuilderGetPolicySyncList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderGetPolicySyncList");
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

[**Policybuilderv3GetPolicySyncListResponse**](Policybuilderv3GetPolicySyncListResponse.md)

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

<a id="policyBuilderGetReceivers"></a>
# **policyBuilderGetReceivers**
> Policybuilderv3GetReceiversResponse policyBuilderGetReceivers(actionId, validateCache)

Summary: Get receivers Description: Get all the receivers associated with actions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    List<String> actionId = Arrays.asList(); // List<String> | Action id.
    Boolean validateCache = true; // Boolean | Flag that indicates if cache needs to be validated.
    try {
      Policybuilderv3GetReceiversResponse result = apiInstance.policyBuilderGetReceivers(actionId, validateCache);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderGetReceivers");
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
| **actionId** | [**List&lt;String&gt;**](String.md)| Action id. | [optional] |
| **validateCache** | **Boolean**| Flag that indicates if cache needs to be validated. | [optional] |

### Return type

[**Policybuilderv3GetReceiversResponse**](Policybuilderv3GetReceiversResponse.md)

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

<a id="policyBuilderGetRuleMetadata"></a>
# **policyBuilderGetRuleMetadata**
> Policybuilderv3RuleMetadataResponse policyBuilderGetRuleMetadata(ruleType)

Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    String ruleType = "ACCESS"; // String | Rule type integer to indicate rule type.
    try {
      Policybuilderv3RuleMetadataResponse result = apiInstance.policyBuilderGetRuleMetadata(ruleType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderGetRuleMetadata");
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
| **ruleType** | **String**| Rule type integer to indicate rule type. | [optional] [default to ACCESS] [enum: ACCESS, EXCEPTION, RESULT_SET] |

### Return type

[**Policybuilderv3RuleMetadataResponse**](Policybuilderv3RuleMetadataResponse.md)

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

<a id="policyBuilderInsertGdpPolicy"></a>
# **policyBuilderInsertGdpPolicy**
> Policybuilderv3InsertGdpPolicySyncResponse policyBuilderInsertGdpPolicy(policybuilderv3InsertGdpPolicySyncRequest)

Summary: Insert GDP policy sync entry Description: Inserts GDP policy&#39;s name into sync collection

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    Policybuilderv3InsertGdpPolicySyncRequest policybuilderv3InsertGdpPolicySyncRequest = new Policybuilderv3InsertGdpPolicySyncRequest(); // Policybuilderv3InsertGdpPolicySyncRequest | 
    try {
      Policybuilderv3InsertGdpPolicySyncResponse result = apiInstance.policyBuilderInsertGdpPolicy(policybuilderv3InsertGdpPolicySyncRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderInsertGdpPolicy");
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
| **policybuilderv3InsertGdpPolicySyncRequest** | [**Policybuilderv3InsertGdpPolicySyncRequest**](Policybuilderv3InsertGdpPolicySyncRequest.md)|  | |

### Return type

[**Policybuilderv3InsertGdpPolicySyncResponse**](Policybuilderv3InsertGdpPolicySyncResponse.md)

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

<a id="policyBuilderInsertGdpPolicyMetaData"></a>
# **policyBuilderInsertGdpPolicyMetaData**
> Policybuilderv3InsertGdpPolicyMetaDataResponse policyBuilderInsertGdpPolicyMetaData(centralManagerId, policybuilderv3InsertGdpPolicyMetaDataRequest)

Summary: Insert gdp policy summaries Description: Inserts GDP&#39;s CM&#39;s policy summary information into mogodb. (This API is called from GDP only)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    Policybuilderv3InsertGdpPolicyMetaDataRequest policybuilderv3InsertGdpPolicyMetaDataRequest = new Policybuilderv3InsertGdpPolicyMetaDataRequest(); // Policybuilderv3InsertGdpPolicyMetaDataRequest | 
    try {
      Policybuilderv3InsertGdpPolicyMetaDataResponse result = apiInstance.policyBuilderInsertGdpPolicyMetaData(centralManagerId, policybuilderv3InsertGdpPolicyMetaDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderInsertGdpPolicyMetaData");
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
| **centralManagerId** | **String**| ID of central manager. | |
| **policybuilderv3InsertGdpPolicyMetaDataRequest** | [**Policybuilderv3InsertGdpPolicyMetaDataRequest**](Policybuilderv3InsertGdpPolicyMetaDataRequest.md)|  | |

### Return type

[**Policybuilderv3InsertGdpPolicyMetaDataResponse**](Policybuilderv3InsertGdpPolicyMetaDataResponse.md)

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

<a id="policyBuilderInstallPolicies"></a>
# **policyBuilderInstallPolicies**
> Policybuilderv3StatusResponseBase policyBuilderInstallPolicies(policybuilderv3InstallPoliciesRequest)

Summary: Install policies Description: Activate Policies request performs activations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    Policybuilderv3InstallPoliciesRequest policybuilderv3InstallPoliciesRequest = new Policybuilderv3InstallPoliciesRequest(); // Policybuilderv3InstallPoliciesRequest | 
    try {
      Policybuilderv3StatusResponseBase result = apiInstance.policyBuilderInstallPolicies(policybuilderv3InstallPoliciesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderInstallPolicies");
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
| **policybuilderv3InstallPoliciesRequest** | [**Policybuilderv3InstallPoliciesRequest**](Policybuilderv3InstallPoliciesRequest.md)|  | |

### Return type

[**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md)

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

<a id="policyBuilderIntegrationCheck"></a>
# **policyBuilderIntegrationCheck**
> Policybuilderv3GetIntegrationCheckResponse policyBuilderIntegrationCheck(integrationId, templateId)

Summary: Integration check Description: Check if integration id is being used in policies.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    String integrationId = "integrationId_example"; // String | Integration Id to check if it is being used in policies.
    String templateId = "templateId_example"; // String | Template Id to check if it is being used in policies.
    try {
      Policybuilderv3GetIntegrationCheckResponse result = apiInstance.policyBuilderIntegrationCheck(integrationId, templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderIntegrationCheck");
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
| **integrationId** | **String**| Integration Id to check if it is being used in policies. | |
| **templateId** | **String**| Template Id to check if it is being used in policies. | [optional] |

### Return type

[**Policybuilderv3GetIntegrationCheckResponse**](Policybuilderv3GetIntegrationCheckResponse.md)

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

<a id="policyBuilderPoliciesGroups"></a>
# **policyBuilderPoliciesGroups**
> Policybuilderv3GetPoliciesGroupsResponse policyBuilderPoliciesGroups(groupIds)

Summary: Policies groups Description: Get policy groups.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    List<String> groupIds = Arrays.asList(); // List<String> | Group ids to check if they are being used in policies.
    try {
      Policybuilderv3GetPoliciesGroupsResponse result = apiInstance.policyBuilderPoliciesGroups(groupIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderPoliciesGroups");
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
| **groupIds** | [**List&lt;String&gt;**](String.md)| Group ids to check if they are being used in policies. | [optional] |

### Return type

[**Policybuilderv3GetPoliciesGroupsResponse**](Policybuilderv3GetPoliciesGroupsResponse.md)

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

<a id="policyBuilderRuleValidation"></a>
# **policyBuilderRuleValidation**
> Policybuilderv3StandardCRUDResponse policyBuilderRuleValidation(policybuilderv3GetRuleValidationRequest)

Summary: Rule validation Description: Validate a rule parameters and actions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    Policybuilderv3GetRuleValidationRequest policybuilderv3GetRuleValidationRequest = new Policybuilderv3GetRuleValidationRequest(); // Policybuilderv3GetRuleValidationRequest | 
    try {
      Policybuilderv3StandardCRUDResponse result = apiInstance.policyBuilderRuleValidation(policybuilderv3GetRuleValidationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderRuleValidation");
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
| **policybuilderv3GetRuleValidationRequest** | [**Policybuilderv3GetRuleValidationRequest**](Policybuilderv3GetRuleValidationRequest.md)|  | |

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

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

<a id="policyBuilderStorePoliciesGdp"></a>
# **policyBuilderStorePoliciesGdp**
> Policybuilderv3StorePolicyGdpResponse policyBuilderStorePoliciesGdp(centralManagerId, policybuilderv3StorePolicyGdpRequest)

Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyBuilderApi;

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

    PolicyBuilderApi apiInstance = new PolicyBuilderApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    Policybuilderv3StorePolicyGdpRequest policybuilderv3StorePolicyGdpRequest = new Policybuilderv3StorePolicyGdpRequest(); // Policybuilderv3StorePolicyGdpRequest | 
    try {
      Policybuilderv3StorePolicyGdpResponse result = apiInstance.policyBuilderStorePoliciesGdp(centralManagerId, policybuilderv3StorePolicyGdpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyBuilderApi#policyBuilderStorePoliciesGdp");
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
| **centralManagerId** | **String**| ID of central manager. | |
| **policybuilderv3StorePolicyGdpRequest** | [**Policybuilderv3StorePolicyGdpRequest**](Policybuilderv3StorePolicyGdpRequest.md)|  | |

### Return type

[**Policybuilderv3StorePolicyGdpResponse**](Policybuilderv3StorePolicyGdpResponse.md)

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

