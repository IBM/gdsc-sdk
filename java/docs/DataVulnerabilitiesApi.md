# DataVulnerabilitiesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#addVulnerabilityStatusComment) | **POST** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments | Add vulnerability status comment |
| [**getVulnerabilitiesSummary**](DataVulnerabilitiesApi.md#getVulnerabilitiesSummary) | **GET** /api/v1/dspm/vulnerabilities/summary | Get vulnerabilities summary |
| [**getVulnerability**](DataVulnerabilitiesApi.md#getVulnerability) | **GET** /api/v1/dspm/vulnerabilities/{vulnerabilityId} | Get vulnerability details by ID |
| [**listVulnerabilities**](DataVulnerabilitiesApi.md#listVulnerabilities) | **GET** /api/v1/dspm/vulnerabilities | List vulnerabilities based on an applied filter |
| [**listVulnerabilitiesByDataStore**](DataVulnerabilitiesApi.md#listVulnerabilitiesByDataStore) | **GET** /api/v1/dspm/vulnerabilities/byDataStore | List vulnerabilities of data stores |
| [**removeVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#removeVulnerabilityStatusComment) | **DELETE** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Delete vulnerability status comment |
| [**setVulnerabilityStatus**](DataVulnerabilitiesApi.md#setVulnerabilityStatus) | **POST** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses | Set status of a vulnerability |
| [**updateVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#updateVulnerabilityStatusComment) | **PUT** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Set vulnerability status |


<a id="addVulnerabilityStatusComment"></a>
# **addVulnerabilityStatusComment**
> VulnerabilityStatus addVulnerabilityStatusComment(vulnerabilityId, statusId, addCommentBody)

Add vulnerability status comment

Add or update the status comment of a vulnerability status to keep track of the workflow progress.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataVulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataVulnerabilitiesApi apiInstance = new DataVulnerabilitiesApi(defaultClient);
    String vulnerabilityId = "384cd426-b187-438a-affc-e12b323f5890"; // String | 
    String statusId = "statusId_example"; // String | 
    AddCommentBody addCommentBody = new AddCommentBody(); // AddCommentBody | 
    try {
      VulnerabilityStatus result = apiInstance.addVulnerabilityStatusComment(vulnerabilityId, statusId, addCommentBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataVulnerabilitiesApi#addVulnerabilityStatusComment");
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
| **vulnerabilityId** | **String**|  | |
| **statusId** | **String**|  | |
| **addCommentBody** | [**AddCommentBody**](AddCommentBody.md)|  | |

### Return type

[**VulnerabilityStatus**](VulnerabilityStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getVulnerabilitiesSummary"></a>
# **getVulnerabilitiesSummary**
> VulnerabilitiesSummary getVulnerabilitiesSummary(filter)

Get vulnerabilities summary

Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility&#39;s type, threat, status, and so on.&lt;BR&gt;&lt;B&gt;Note:&lt;/B&gt; Filter needs to be HTML Encoded.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataVulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataVulnerabilitiesApi apiInstance = new DataVulnerabilitiesApi(defaultClient);
    VulnerabilitiesFilterOptions filter = new VulnerabilitiesFilterOptions(); // VulnerabilitiesFilterOptions | 
    try {
      VulnerabilitiesSummary result = apiInstance.getVulnerabilitiesSummary(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataVulnerabilitiesApi#getVulnerabilitiesSummary");
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
| **filter** | [**VulnerabilitiesFilterOptions**](.md)|  | [optional] |

### Return type

[**VulnerabilitiesSummary**](VulnerabilitiesSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getVulnerability"></a>
# **getVulnerability**
> Vulnerability getVulnerability(vulnerabilityId)

Get vulnerability details by ID

Get vulnerability details by providing its ID.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataVulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataVulnerabilitiesApi apiInstance = new DataVulnerabilitiesApi(defaultClient);
    String vulnerabilityId = "384cd426-b187-438a-affc-e12b323f5890"; // String | 
    try {
      Vulnerability result = apiInstance.getVulnerability(vulnerabilityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataVulnerabilitiesApi#getVulnerability");
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
| **vulnerabilityId** | **String**|  | |

### Return type

[**Vulnerability**](Vulnerability.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="listVulnerabilities"></a>
# **listVulnerabilities**
> ListVulnerabilities200Response listVulnerabilities(filter, sort, pageSize, nextToken)

List vulnerabilities based on an applied filter

Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.&lt;BR&gt;&lt;B&gt;Note:&lt;/B&gt; Filter needs to be HTML encoded.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataVulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataVulnerabilitiesApi apiInstance = new DataVulnerabilitiesApi(defaultClient);
    VulnerabilitiesFilterOptions filter = new VulnerabilitiesFilterOptions(); // VulnerabilitiesFilterOptions | 
    ListVulnerabilitiesSortParameter sort = new ListVulnerabilitiesSortParameter(); // ListVulnerabilitiesSortParameter | 
    BigDecimal pageSize = new BigDecimal(78); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      ListVulnerabilities200Response result = apiInstance.listVulnerabilities(filter, sort, pageSize, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataVulnerabilitiesApi#listVulnerabilities");
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
| **filter** | [**VulnerabilitiesFilterOptions**](.md)|  | [optional] |
| **sort** | [**ListVulnerabilitiesSortParameter**](.md)|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **nextToken** | **String**|  | [optional] |

### Return type

[**ListVulnerabilities200Response**](ListVulnerabilities200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="listVulnerabilitiesByDataStore"></a>
# **listVulnerabilitiesByDataStore**
> ListVulnerabilitiesByDataStore200Response listVulnerabilitiesByDataStore(filter, sort, pageSize, nextToken)

List vulnerabilities of data stores

Get a list of all the vulnerabilities of data stores.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataVulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataVulnerabilitiesApi apiInstance = new DataVulnerabilitiesApi(defaultClient);
    VulnerabilitiesByDataStoreFilterOptions filter = new VulnerabilitiesByDataStoreFilterOptions(); // VulnerabilitiesByDataStoreFilterOptions | 
    ListVulnerabilitiesByDataStoreSortParameter sort = new ListVulnerabilitiesByDataStoreSortParameter(); // ListVulnerabilitiesByDataStoreSortParameter | 
    BigDecimal pageSize = new BigDecimal(78); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      ListVulnerabilitiesByDataStore200Response result = apiInstance.listVulnerabilitiesByDataStore(filter, sort, pageSize, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataVulnerabilitiesApi#listVulnerabilitiesByDataStore");
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
| **filter** | [**VulnerabilitiesByDataStoreFilterOptions**](.md)|  | [optional] |
| **sort** | [**ListVulnerabilitiesByDataStoreSortParameter**](.md)|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **nextToken** | **String**|  | [optional] |

### Return type

[**ListVulnerabilitiesByDataStore200Response**](ListVulnerabilitiesByDataStore200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="removeVulnerabilityStatusComment"></a>
# **removeVulnerabilityStatusComment**
> removeVulnerabilityStatusComment(vulnerabilityId, statusId, commentId)

Delete vulnerability status comment

Delete a status comment of a vulnerability status.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataVulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataVulnerabilitiesApi apiInstance = new DataVulnerabilitiesApi(defaultClient);
    String vulnerabilityId = "384cd426-b187-438a-affc-e12b323f5890"; // String | 
    String statusId = "statusId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    try {
      apiInstance.removeVulnerabilityStatusComment(vulnerabilityId, statusId, commentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataVulnerabilitiesApi#removeVulnerabilityStatusComment");
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
| **vulnerabilityId** | **String**|  | |
| **statusId** | **String**|  | |
| **commentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setVulnerabilityStatus"></a>
# **setVulnerabilityStatus**
> VulnerabilityStatus setVulnerabilityStatus(vulnerabilityId, setVulnerabilityStatusRequest)

Set status of a vulnerability

Add or update the status of a vulnerability to track its progress.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataVulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataVulnerabilitiesApi apiInstance = new DataVulnerabilitiesApi(defaultClient);
    String vulnerabilityId = "vulnerabilityId_example"; // String | 
    SetVulnerabilityStatusRequest setVulnerabilityStatusRequest = new SetVulnerabilityStatusRequest(); // SetVulnerabilityStatusRequest | 
    try {
      VulnerabilityStatus result = apiInstance.setVulnerabilityStatus(vulnerabilityId, setVulnerabilityStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataVulnerabilitiesApi#setVulnerabilityStatus");
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
| **vulnerabilityId** | **String**|  | |
| **setVulnerabilityStatusRequest** | [**SetVulnerabilityStatusRequest**](SetVulnerabilityStatusRequest.md)|  | |

### Return type

[**VulnerabilityStatus**](VulnerabilityStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateVulnerabilityStatusComment"></a>
# **updateVulnerabilityStatusComment**
> VulnerabilityStatusComment updateVulnerabilityStatusComment(vulnerabilityId, statusId, commentId, updateCommentBody)

Set vulnerability status

Set a vulnerability status of a vulnerability.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataVulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataVulnerabilitiesApi apiInstance = new DataVulnerabilitiesApi(defaultClient);
    String vulnerabilityId = "384cd426-b187-438a-affc-e12b323f5890"; // String | 
    String statusId = "statusId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    UpdateCommentBody updateCommentBody = new UpdateCommentBody(); // UpdateCommentBody | 
    try {
      VulnerabilityStatusComment result = apiInstance.updateVulnerabilityStatusComment(vulnerabilityId, statusId, commentId, updateCommentBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataVulnerabilitiesApi#updateVulnerabilityStatusComment");
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
| **vulnerabilityId** | **String**|  | |
| **statusId** | **String**|  | |
| **commentId** | **String**|  | |
| **updateCommentBody** | [**UpdateCommentBody**](UpdateCommentBody.md)|  | |

### Return type

[**VulnerabilityStatusComment**](VulnerabilityStatusComment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

