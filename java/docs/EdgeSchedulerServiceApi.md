# EdgeSchedulerServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeSchedulerServiceGetEdgeQueryStatus**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceGetEdgeQueryStatus) | **GET** /api/v3/edge/query/status | Summary: Get edge query status Description: Get the status of a queued edge query |
| [**edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery) | **POST** /api/v3/edge/query | Summary: Create workspace Description: monitor edge query pending request |
| [**edgeSchedulerServiceScheduleEdgeQuery**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceScheduleEdgeQuery) | **POST** /api/v3/edge/query/schedule | Summary: Schedule an edge query  Description: Schedule an edge query via db2 queue |


<a id="edgeSchedulerServiceGetEdgeQueryStatus"></a>
# **edgeSchedulerServiceGetEdgeQueryStatus**
> Edgeschedulerv3GetEdgeQueryStatusResponse edgeSchedulerServiceGetEdgeQueryStatus(edgeId, edgeResultReportId)

Summary: Get edge query status Description: Get the status of a queued edge query

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.EdgeSchedulerServiceApi;

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

    EdgeSchedulerServiceApi apiInstance = new EdgeSchedulerServiceApi(defaultClient);
    String edgeId = "edgeId_example"; // String | the id of the edge.
    String edgeResultReportId = "edgeResultReportId_example"; // String | the id of the UC report being queried for.
    try {
      Edgeschedulerv3GetEdgeQueryStatusResponse result = apiInstance.edgeSchedulerServiceGetEdgeQueryStatus(edgeId, edgeResultReportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeSchedulerServiceApi#edgeSchedulerServiceGetEdgeQueryStatus");
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
| **edgeId** | **String**| the id of the edge. | [optional] |
| **edgeResultReportId** | **String**| the id of the UC report being queried for. | [optional] |

### Return type

[**Edgeschedulerv3GetEdgeQueryStatusResponse**](Edgeschedulerv3GetEdgeQueryStatusResponse.md)

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

<a id="edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery"></a>
# **edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery**
> StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery(edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest)

Summary: Create workspace Description: monitor edge query pending request

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.EdgeSchedulerServiceApi;

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

    EdgeSchedulerServiceApi apiInstance = new EdgeSchedulerServiceApi(defaultClient);
    Edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest = new Edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest(); // Edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest | 
    try {
      StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse result = apiInstance.edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery(edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeSchedulerServiceApi#edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery");
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
| **edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest** | [**Edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest**](Edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest.md)|  | |

### Return type

[**StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse**](StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.md)

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

<a id="edgeSchedulerServiceScheduleEdgeQuery"></a>
# **edgeSchedulerServiceScheduleEdgeQuery**
> Edgeschedulerv3ScheduleEdgeQueryResponse edgeSchedulerServiceScheduleEdgeQuery(edgeschedulerv3ScheduleEdgeQueryRequest)

Summary: Schedule an edge query  Description: Schedule an edge query via db2 queue

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.EdgeSchedulerServiceApi;

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

    EdgeSchedulerServiceApi apiInstance = new EdgeSchedulerServiceApi(defaultClient);
    Edgeschedulerv3ScheduleEdgeQueryRequest edgeschedulerv3ScheduleEdgeQueryRequest = new Edgeschedulerv3ScheduleEdgeQueryRequest(); // Edgeschedulerv3ScheduleEdgeQueryRequest | 
    try {
      Edgeschedulerv3ScheduleEdgeQueryResponse result = apiInstance.edgeSchedulerServiceScheduleEdgeQuery(edgeschedulerv3ScheduleEdgeQueryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeSchedulerServiceApi#edgeSchedulerServiceScheduleEdgeQuery");
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
| **edgeschedulerv3ScheduleEdgeQueryRequest** | [**Edgeschedulerv3ScheduleEdgeQueryRequest**](Edgeschedulerv3ScheduleEdgeQueryRequest.md)|  | |

### Return type

[**Edgeschedulerv3ScheduleEdgeQueryResponse**](Edgeschedulerv3ScheduleEdgeQueryResponse.md)

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

