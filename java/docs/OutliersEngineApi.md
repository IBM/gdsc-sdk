# OutliersEngineApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**outliersEngineGetSourceStatistics**](OutliersEngineApi.md#outliersEngineGetSourceStatistics) | **GET** /api/v3/outliers/source/statistics | Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc. |
| [**outliersEngineGetStatistics**](OutliersEngineApi.md#outliersEngineGetStatistics) | **GET** /api/v3/outliers/statistics | Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods. |
| [**outliersEngineGetWorkingHoursPeriods**](OutliersEngineApi.md#outliersEngineGetWorkingHoursPeriods) | **GET** /api/v3/outliers/working_hours_periods | Summary: Get working hours periods Description: Get a list of the working hours periods. |
| [**outliersEngineRunSimulator**](OutliersEngineApi.md#outliersEngineRunSimulator) | **POST** /api/v3/outliers/simulator | Summary: Run simulator Description: Run outlier simulator. |
| [**outliersEngineUpdateWorkingHoursPeriods**](OutliersEngineApi.md#outliersEngineUpdateWorkingHoursPeriods) | **PUT** /api/v3/outliers/working_hours_periods | Summary: Update working hours periods Description: Update the working hours periods values. |
| [**outliersEngineUploadAndAnalyzePeriod**](OutliersEngineApi.md#outliersEngineUploadAndAnalyzePeriod) | **POST** /api/v3/outliers | Summary: Upload and analyze period Description: Run outliers detection on ready periods. |
| [**outliersEngineUserClustering**](OutliersEngineApi.md#outliersEngineUserClustering) | **POST** /api/v3/outliers/clusters | Summary: User clustering Description: Run user-clustering on current sources. |


<a id="outliersEngineGetSourceStatistics"></a>
# **outliersEngineGetSourceStatistics**
> Outliersenginev3GetSourceStatisticsResponse outliersEngineGetSourceStatistics(sourceServerIp, sourceDatabaseName, sourceDbUser, attributesLimit)

Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.OutliersEngineApi;

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

    OutliersEngineApi apiInstance = new OutliersEngineApi(defaultClient);
    String sourceServerIp = "sourceServerIp_example"; // String | server ip.
    String sourceDatabaseName = "sourceDatabaseName_example"; // String | database name.
    String sourceDbUser = "sourceDbUser_example"; // String | db user name (optional).
    Integer attributesLimit = 56; // Integer | The number of attributes to return for each SourceAttributeType - optional.
    try {
      Outliersenginev3GetSourceStatisticsResponse result = apiInstance.outliersEngineGetSourceStatistics(sourceServerIp, sourceDatabaseName, sourceDbUser, attributesLimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutliersEngineApi#outliersEngineGetSourceStatistics");
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
| **sourceServerIp** | **String**| server ip. | [optional] |
| **sourceDatabaseName** | **String**| database name. | [optional] |
| **sourceDbUser** | **String**| db user name (optional). | [optional] |
| **attributesLimit** | **Integer**| The number of attributes to return for each SourceAttributeType - optional. | [optional] |

### Return type

[**Outliersenginev3GetSourceStatisticsResponse**](Outliersenginev3GetSourceStatisticsResponse.md)

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

<a id="outliersEngineGetStatistics"></a>
# **outliersEngineGetStatistics**
> Outliersenginev3StatisticsResponse outliersEngineGetStatistics()

Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.OutliersEngineApi;

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

    OutliersEngineApi apiInstance = new OutliersEngineApi(defaultClient);
    try {
      Outliersenginev3StatisticsResponse result = apiInstance.outliersEngineGetStatistics();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutliersEngineApi#outliersEngineGetStatistics");
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

[**Outliersenginev3StatisticsResponse**](Outliersenginev3StatisticsResponse.md)

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

<a id="outliersEngineGetWorkingHoursPeriods"></a>
# **outliersEngineGetWorkingHoursPeriods**
> Outliersenginev3GetWorkingHoursPeriodsResponse outliersEngineGetWorkingHoursPeriods()

Summary: Get working hours periods Description: Get a list of the working hours periods.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.OutliersEngineApi;

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

    OutliersEngineApi apiInstance = new OutliersEngineApi(defaultClient);
    try {
      Outliersenginev3GetWorkingHoursPeriodsResponse result = apiInstance.outliersEngineGetWorkingHoursPeriods();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutliersEngineApi#outliersEngineGetWorkingHoursPeriods");
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

[**Outliersenginev3GetWorkingHoursPeriodsResponse**](Outliersenginev3GetWorkingHoursPeriodsResponse.md)

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

<a id="outliersEngineRunSimulator"></a>
# **outliersEngineRunSimulator**
> RpcStatus outliersEngineRunSimulator(outliersenginev3RunSimulatorRequest)

Summary: Run simulator Description: Run outlier simulator.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.OutliersEngineApi;

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

    OutliersEngineApi apiInstance = new OutliersEngineApi(defaultClient);
    Outliersenginev3RunSimulatorRequest outliersenginev3RunSimulatorRequest = new Outliersenginev3RunSimulatorRequest(); // Outliersenginev3RunSimulatorRequest | 
    try {
      RpcStatus result = apiInstance.outliersEngineRunSimulator(outliersenginev3RunSimulatorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutliersEngineApi#outliersEngineRunSimulator");
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
| **outliersenginev3RunSimulatorRequest** | [**Outliersenginev3RunSimulatorRequest**](Outliersenginev3RunSimulatorRequest.md)|  | |

### Return type

[**RpcStatus**](RpcStatus.md)

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

<a id="outliersEngineUpdateWorkingHoursPeriods"></a>
# **outliersEngineUpdateWorkingHoursPeriods**
> Outliersenginev3OutlierResponse outliersEngineUpdateWorkingHoursPeriods(outliersenginev3UpdateWorkingHoursPeriodsRequest)

Summary: Update working hours periods Description: Update the working hours periods values.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.OutliersEngineApi;

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

    OutliersEngineApi apiInstance = new OutliersEngineApi(defaultClient);
    Outliersenginev3UpdateWorkingHoursPeriodsRequest outliersenginev3UpdateWorkingHoursPeriodsRequest = new Outliersenginev3UpdateWorkingHoursPeriodsRequest(); // Outliersenginev3UpdateWorkingHoursPeriodsRequest | 
    try {
      Outliersenginev3OutlierResponse result = apiInstance.outliersEngineUpdateWorkingHoursPeriods(outliersenginev3UpdateWorkingHoursPeriodsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutliersEngineApi#outliersEngineUpdateWorkingHoursPeriods");
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
| **outliersenginev3UpdateWorkingHoursPeriodsRequest** | [**Outliersenginev3UpdateWorkingHoursPeriodsRequest**](Outliersenginev3UpdateWorkingHoursPeriodsRequest.md)|  | |

### Return type

[**Outliersenginev3OutlierResponse**](Outliersenginev3OutlierResponse.md)

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

<a id="outliersEngineUploadAndAnalyzePeriod"></a>
# **outliersEngineUploadAndAnalyzePeriod**
> RpcStatus outliersEngineUploadAndAnalyzePeriod(body)

Summary: Upload and analyze period Description: Run outliers detection on ready periods.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.OutliersEngineApi;

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

    OutliersEngineApi apiInstance = new OutliersEngineApi(defaultClient);
    Object body = null; // Object | 
    try {
      RpcStatus result = apiInstance.outliersEngineUploadAndAnalyzePeriod(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutliersEngineApi#outliersEngineUploadAndAnalyzePeriod");
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
| **body** | **Object**|  | |

### Return type

[**RpcStatus**](RpcStatus.md)

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

<a id="outliersEngineUserClustering"></a>
# **outliersEngineUserClustering**
> RpcStatus outliersEngineUserClustering(body)

Summary: User clustering Description: Run user-clustering on current sources.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.OutliersEngineApi;

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

    OutliersEngineApi apiInstance = new OutliersEngineApi(defaultClient);
    Object body = null; // Object | 
    try {
      RpcStatus result = apiInstance.outliersEngineUserClustering(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutliersEngineApi#outliersEngineUserClustering");
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
| **body** | **Object**|  | |

### Return type

[**RpcStatus**](RpcStatus.md)

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

