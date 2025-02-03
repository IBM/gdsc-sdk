# DataMovementsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getActualFlow**](DataMovementsApi.md#getActualFlow) | **GET** /api/v1/dspm/dataMovements/actualFlows/{id} | Get actual flow by providing its ID |
| [**getActualFlowsSummary**](DataMovementsApi.md#getActualFlowsSummary) | **GET** /api/v1/dspm/dataMovements/actualFlows/summary | Get summary of actual flows |
| [**getPotentialFlow**](DataMovementsApi.md#getPotentialFlow) | **GET** /api/v1/dspm/dataMovements/potentialFlows/{flowId} | Get potential flow by providing its ID |
| [**getPotentialFlowPath**](DataMovementsApi.md#getPotentialFlowPath) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths/{flowPathId} | Get potential flow path by providing its ID |
| [**getPotentialFlowsSummary**](DataMovementsApi.md#getPotentialFlowsSummary) | **GET** /api/v1/dspm/dataMovements/potentialFlows/summary | Get summary of potential flows according to the filter applied |
| [**listActualFlowPaths**](DataMovementsApi.md#listActualFlowPaths) | **GET** /api/v1/dspm/dataMovements/actualFlowPaths | Get summary of actual flows according to the filter applied |
| [**listActualFlows**](DataMovementsApi.md#listActualFlows) | **GET** /api/v1/dspm/dataMovements/actualFlows | List actual flows |
| [**listPotentialFlows**](DataMovementsApi.md#listPotentialFlows) | **GET** /api/v1/dspm/dataMovements/potentialFlows | List potential flows |
| [**listPotentialFlowsPaths**](DataMovementsApi.md#listPotentialFlowsPaths) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths | List potential flow paths |


<a id="getActualFlow"></a>
# **getActualFlow**
> ActualFlow getActualFlow(id)

Get actual flow by providing its ID

Get a detailed information about an actual flow by providing its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataMovementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataMovementsApi apiInstance = new DataMovementsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ActualFlow result = apiInstance.getActualFlow(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataMovementsApi#getActualFlow");
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
| **id** | **String**|  | |

### Return type

[**ActualFlow**](ActualFlow.md)

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

<a id="getActualFlowsSummary"></a>
# **getActualFlowsSummary**
> ActualFlowsSummary getActualFlowsSummary(filter)

Get summary of actual flows

Get a summary of all the actual flows discovered by Guardium Insights SaaS DSPM, that is, details about source and destination, and other information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataMovementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataMovementsApi apiInstance = new DataMovementsApi(defaultClient);
    ListActualFlowsFilterParameter filter = new ListActualFlowsFilterParameter(); // ListActualFlowsFilterParameter | 
    try {
      ActualFlowsSummary result = apiInstance.getActualFlowsSummary(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataMovementsApi#getActualFlowsSummary");
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
| **filter** | [**ListActualFlowsFilterParameter**](.md)|  | [optional] |

### Return type

[**ActualFlowsSummary**](ActualFlowsSummary.md)

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

<a id="getPotentialFlow"></a>
# **getPotentialFlow**
> PotentialFlow getPotentialFlow(flowId)

Get potential flow by providing its ID

Get a detailed information about a potential flow by providing the flow ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataMovementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataMovementsApi apiInstance = new DataMovementsApi(defaultClient);
    String flowId = "ff2b4abe-89f4-62b8-061e-1232456789"; // String | 
    try {
      PotentialFlow result = apiInstance.getPotentialFlow(flowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataMovementsApi#getPotentialFlow");
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
| **flowId** | **String**|  | |

### Return type

[**PotentialFlow**](PotentialFlow.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **404** | potential flow not found |  -  |

<a id="getPotentialFlowPath"></a>
# **getPotentialFlowPath**
> PotentialFlowPath getPotentialFlowPath(flowPathId)

Get potential flow path by providing its ID

Get details of a specific potential flow of data by providing its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataMovementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataMovementsApi apiInstance = new DataMovementsApi(defaultClient);
    String flowPathId = "ff2b4abe-89f4-62b8-061e-12345678910"; // String | 
    try {
      PotentialFlowPath result = apiInstance.getPotentialFlowPath(flowPathId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataMovementsApi#getPotentialFlowPath");
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
| **flowPathId** | **String**|  | |

### Return type

[**PotentialFlowPath**](PotentialFlowPath.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **404** | potential flow path not found |  -  |

<a id="getPotentialFlowsSummary"></a>
# **getPotentialFlowsSummary**
> PotentialFlowsSummary getPotentialFlowsSummary(filter)

Get summary of potential flows according to the filter applied

Get a summary of all the potential flows based on a filter applied.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataMovementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataMovementsApi apiInstance = new DataMovementsApi(defaultClient);
    PotentialFlowsFilterOptions filter = new PotentialFlowsFilterOptions(); // PotentialFlowsFilterOptions | 
    try {
      PotentialFlowsSummary result = apiInstance.getPotentialFlowsSummary(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataMovementsApi#getPotentialFlowsSummary");
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
| **filter** | [**PotentialFlowsFilterOptions**](.md)|  | [optional] |

### Return type

[**PotentialFlowsSummary**](PotentialFlowsSummary.md)

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

<a id="listActualFlowPaths"></a>
# **listActualFlowPaths**
> ListActualFlowPaths200Response listActualFlowPaths(sort, filter, pageSize, nextToken)

Get summary of actual flows according to the filter applied

Get detailed information about the actual flows according to the filter applied.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataMovementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataMovementsApi apiInstance = new DataMovementsApi(defaultClient);
    ListActualFlowPathsSortParameter sort = new ListActualFlowPathsSortParameter(); // ListActualFlowPathsSortParameter | 
    ListActualFlowPathsFilterParameter filter = new ListActualFlowPathsFilterParameter(); // ListActualFlowPathsFilterParameter | 
    BigDecimal pageSize = new BigDecimal(78); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      ListActualFlowPaths200Response result = apiInstance.listActualFlowPaths(sort, filter, pageSize, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataMovementsApi#listActualFlowPaths");
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
| **sort** | [**ListActualFlowPathsSortParameter**](.md)|  | [optional] |
| **filter** | [**ListActualFlowPathsFilterParameter**](.md)|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **nextToken** | **String**|  | [optional] |

### Return type

[**ListActualFlowPaths200Response**](ListActualFlowPaths200Response.md)

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

<a id="listActualFlows"></a>
# **listActualFlows**
> ListActualFlows200Response listActualFlows(sort, filter, pageSize, nextToken)

List actual flows

List all the actual flows (based on logs) of users and services across your entire cloud accounts and SasS applications.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataMovementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataMovementsApi apiInstance = new DataMovementsApi(defaultClient);
    ListActualFlowsSortParameter sort = new ListActualFlowsSortParameter(); // ListActualFlowsSortParameter | 
    ListActualFlowsFilterParameter filter = new ListActualFlowsFilterParameter(); // ListActualFlowsFilterParameter | 
    BigDecimal pageSize = new BigDecimal(78); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      ListActualFlows200Response result = apiInstance.listActualFlows(sort, filter, pageSize, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataMovementsApi#listActualFlows");
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
| **sort** | [**ListActualFlowsSortParameter**](.md)|  | [optional] |
| **filter** | [**ListActualFlowsFilterParameter**](.md)|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **nextToken** | **String**|  | [optional] |

### Return type

[**ListActualFlows200Response**](ListActualFlows200Response.md)

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

<a id="listPotentialFlows"></a>
# **listPotentialFlows**
> ListPotentialFlows200Response listPotentialFlows(filter, pageSize, nextToken)

List potential flows

List all the potential flows of users and services across your entire cloud accounts and SaaS applications.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataMovementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataMovementsApi apiInstance = new DataMovementsApi(defaultClient);
    PotentialFlowsFilterOptions filter = new PotentialFlowsFilterOptions(); // PotentialFlowsFilterOptions | 
    BigDecimal pageSize = new BigDecimal(78); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      ListPotentialFlows200Response result = apiInstance.listPotentialFlows(filter, pageSize, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataMovementsApi#listPotentialFlows");
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
| **filter** | [**PotentialFlowsFilterOptions**](.md)|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **nextToken** | **String**|  | [optional] |

### Return type

[**ListPotentialFlows200Response**](ListPotentialFlows200Response.md)

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

<a id="listPotentialFlowsPaths"></a>
# **listPotentialFlowsPaths**
> ListPotentialFlowsPaths200Response listPotentialFlowsPaths(filter, pageSize, nextToken)

List potential flow paths

List all the potential flow paths based on an applied filter.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataMovementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataMovementsApi apiInstance = new DataMovementsApi(defaultClient);
    PotentialFlowsPathsFilterOptions filter = new PotentialFlowsPathsFilterOptions(); // PotentialFlowsPathsFilterOptions | 
    BigDecimal pageSize = new BigDecimal(78); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      ListPotentialFlowsPaths200Response result = apiInstance.listPotentialFlowsPaths(filter, pageSize, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataMovementsApi#listPotentialFlowsPaths");
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
| **filter** | [**PotentialFlowsPathsFilterOptions**](.md)|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **nextToken** | **String**|  | [optional] |

### Return type

[**ListPotentialFlowsPaths200Response**](ListPotentialFlowsPaths200Response.md)

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

