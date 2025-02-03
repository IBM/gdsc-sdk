# ReportsRunnerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reportsRunnerGetActiveQueries**](ReportsRunnerApi.md#reportsRunnerGetActiveQueries) | **POST** /api/v3/queries/search | Summary: Get running queries Description: Get queries that are running more than certain time |
| [**reportsRunnerGetAuditDataCount**](ReportsRunnerApi.md#reportsRunnerGetAuditDataCount) | **POST** /api/v3/reports/{report_id}/audit_count | Summary: Get audit data count Description: Get audit data. |
| [**reportsRunnerGetChartData**](ReportsRunnerApi.md#reportsRunnerGetChartData) | **POST** /api/v3/charts/run | Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings. |
| [**reportsRunnerGetChartDatav2**](ReportsRunnerApi.md#reportsRunnerGetChartDatav2) | **POST** /api/v3/flex-charts/run |  |
| [**reportsRunnerGetReportColumnFacet**](ReportsRunnerApi.md#reportsRunnerGetReportColumnFacet) | **POST** /api/v3/reports/facet | Summary: Get report column facet Description: Get counts that is group by values for the selected column. |
| [**reportsRunnerGetReportDataCount**](ReportsRunnerApi.md#reportsRunnerGetReportDataCount) | **POST** /api/v3/reports/count | Summary: Get report data count Description: Get report data. |
| [**reportsRunnerRunAuditReport**](ReportsRunnerApi.md#reportsRunnerRunAuditReport) | **POST** /api/v3/audit/{report_id}/run | Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition. |
| [**reportsRunnerRunReport**](ReportsRunnerApi.md#reportsRunnerRunReport) | **POST** /api/v3/reports/run | Summary: Run report Description: Run report by report ID or by specifying report definition. |
| [**reportsRunnerStopQuery**](ReportsRunnerApi.md#reportsRunnerStopQuery) | **POST** /api/v3/queries/stop | Summary: Stop query Description: Stop a query based on the id |


<a id="reportsRunnerGetActiveQueries"></a>
# **reportsRunnerGetActiveQueries**
> Reportsrunnerv3GetActiveQueriesResponse reportsRunnerGetActiveQueries(reportsrunnerv3GetActiveQueriesRequest)

Summary: Get running queries Description: Get queries that are running more than certain time

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportsRunnerApi;

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

    ReportsRunnerApi apiInstance = new ReportsRunnerApi(defaultClient);
    Reportsrunnerv3GetActiveQueriesRequest reportsrunnerv3GetActiveQueriesRequest = new Reportsrunnerv3GetActiveQueriesRequest(); // Reportsrunnerv3GetActiveQueriesRequest | 
    try {
      Reportsrunnerv3GetActiveQueriesResponse result = apiInstance.reportsRunnerGetActiveQueries(reportsrunnerv3GetActiveQueriesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsRunnerApi#reportsRunnerGetActiveQueries");
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
| **reportsrunnerv3GetActiveQueriesRequest** | [**Reportsrunnerv3GetActiveQueriesRequest**](Reportsrunnerv3GetActiveQueriesRequest.md)|  | |

### Return type

[**Reportsrunnerv3GetActiveQueriesResponse**](Reportsrunnerv3GetActiveQueriesResponse.md)

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

<a id="reportsRunnerGetAuditDataCount"></a>
# **reportsRunnerGetAuditDataCount**
> Reportsrunnerv3GetReportDataCountResponse reportsRunnerGetAuditDataCount(reportId, reportsrunnerv3GetAuditDataCountRequest)

Summary: Get audit data count Description: Get audit data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportsRunnerApi;

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

    ReportsRunnerApi apiInstance = new ReportsRunnerApi(defaultClient);
    String reportId = "reportId_example"; // String | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905).
    Reportsrunnerv3GetAuditDataCountRequest reportsrunnerv3GetAuditDataCountRequest = new Reportsrunnerv3GetAuditDataCountRequest(); // Reportsrunnerv3GetAuditDataCountRequest | 
    try {
      Reportsrunnerv3GetReportDataCountResponse result = apiInstance.reportsRunnerGetAuditDataCount(reportId, reportsrunnerv3GetAuditDataCountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsRunnerApi#reportsRunnerGetAuditDataCount");
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
| **reportId** | **String**| Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). | |
| **reportsrunnerv3GetAuditDataCountRequest** | [**Reportsrunnerv3GetAuditDataCountRequest**](Reportsrunnerv3GetAuditDataCountRequest.md)|  | |

### Return type

[**Reportsrunnerv3GetReportDataCountResponse**](Reportsrunnerv3GetReportDataCountResponse.md)

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

<a id="reportsRunnerGetChartData"></a>
# **reportsRunnerGetChartData**
> Reportsrunnerv3GetChartDataResponse reportsRunnerGetChartData(reportsrunnerv3GetChartDataRequest)

Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportsRunnerApi;

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

    ReportsRunnerApi apiInstance = new ReportsRunnerApi(defaultClient);
    Reportsrunnerv3GetChartDataRequest reportsrunnerv3GetChartDataRequest = new Reportsrunnerv3GetChartDataRequest(); // Reportsrunnerv3GetChartDataRequest | 
    try {
      Reportsrunnerv3GetChartDataResponse result = apiInstance.reportsRunnerGetChartData(reportsrunnerv3GetChartDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsRunnerApi#reportsRunnerGetChartData");
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
| **reportsrunnerv3GetChartDataRequest** | [**Reportsrunnerv3GetChartDataRequest**](Reportsrunnerv3GetChartDataRequest.md)|  | |

### Return type

[**Reportsrunnerv3GetChartDataResponse**](Reportsrunnerv3GetChartDataResponse.md)

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

<a id="reportsRunnerGetChartDatav2"></a>
# **reportsRunnerGetChartDatav2**
> Reportsrunnerv3GetChartDataResponsev2 reportsRunnerGetChartDatav2(reportsrunnerv3GetChartDataRequestv2)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportsRunnerApi;

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

    ReportsRunnerApi apiInstance = new ReportsRunnerApi(defaultClient);
    Reportsrunnerv3GetChartDataRequestv2 reportsrunnerv3GetChartDataRequestv2 = new Reportsrunnerv3GetChartDataRequestv2(); // Reportsrunnerv3GetChartDataRequestv2 | 
    try {
      Reportsrunnerv3GetChartDataResponsev2 result = apiInstance.reportsRunnerGetChartDatav2(reportsrunnerv3GetChartDataRequestv2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsRunnerApi#reportsRunnerGetChartDatav2");
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
| **reportsrunnerv3GetChartDataRequestv2** | [**Reportsrunnerv3GetChartDataRequestv2**](Reportsrunnerv3GetChartDataRequestv2.md)|  | |

### Return type

[**Reportsrunnerv3GetChartDataResponsev2**](Reportsrunnerv3GetChartDataResponsev2.md)

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

<a id="reportsRunnerGetReportColumnFacet"></a>
# **reportsRunnerGetReportColumnFacet**
> Reportsrunnerv3GetReportColumnFacetResponse reportsRunnerGetReportColumnFacet(reportsrunnerv3GetReportColumnFacetRequest)

Summary: Get report column facet Description: Get counts that is group by values for the selected column.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportsRunnerApi;

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

    ReportsRunnerApi apiInstance = new ReportsRunnerApi(defaultClient);
    Reportsrunnerv3GetReportColumnFacetRequest reportsrunnerv3GetReportColumnFacetRequest = new Reportsrunnerv3GetReportColumnFacetRequest(); // Reportsrunnerv3GetReportColumnFacetRequest | 
    try {
      Reportsrunnerv3GetReportColumnFacetResponse result = apiInstance.reportsRunnerGetReportColumnFacet(reportsrunnerv3GetReportColumnFacetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsRunnerApi#reportsRunnerGetReportColumnFacet");
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
| **reportsrunnerv3GetReportColumnFacetRequest** | [**Reportsrunnerv3GetReportColumnFacetRequest**](Reportsrunnerv3GetReportColumnFacetRequest.md)|  | |

### Return type

[**Reportsrunnerv3GetReportColumnFacetResponse**](Reportsrunnerv3GetReportColumnFacetResponse.md)

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

<a id="reportsRunnerGetReportDataCount"></a>
# **reportsRunnerGetReportDataCount**
> Reportsrunnerv3GetReportDataCountResponse reportsRunnerGetReportDataCount(reportsrunnerv3GetReportDataCountRequest)

Summary: Get report data count Description: Get report data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportsRunnerApi;

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

    ReportsRunnerApi apiInstance = new ReportsRunnerApi(defaultClient);
    Reportsrunnerv3GetReportDataCountRequest reportsrunnerv3GetReportDataCountRequest = new Reportsrunnerv3GetReportDataCountRequest(); // Reportsrunnerv3GetReportDataCountRequest | 
    try {
      Reportsrunnerv3GetReportDataCountResponse result = apiInstance.reportsRunnerGetReportDataCount(reportsrunnerv3GetReportDataCountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsRunnerApi#reportsRunnerGetReportDataCount");
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
| **reportsrunnerv3GetReportDataCountRequest** | [**Reportsrunnerv3GetReportDataCountRequest**](Reportsrunnerv3GetReportDataCountRequest.md)|  | |

### Return type

[**Reportsrunnerv3GetReportDataCountResponse**](Reportsrunnerv3GetReportDataCountResponse.md)

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

<a id="reportsRunnerRunAuditReport"></a>
# **reportsRunnerRunAuditReport**
> StreamResultOfReportsrunnerv3RunReportResponse reportsRunnerRunAuditReport(reportId, reportsrunnerv3RunAuditReportRequest)

Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportsRunnerApi;

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

    ReportsRunnerApi apiInstance = new ReportsRunnerApi(defaultClient);
    String reportId = "reportId_example"; // String | The ID of the Report we wish to run (e.g. 000000000000000000000905).
    Reportsrunnerv3RunAuditReportRequest reportsrunnerv3RunAuditReportRequest = new Reportsrunnerv3RunAuditReportRequest(); // Reportsrunnerv3RunAuditReportRequest | 
    try {
      StreamResultOfReportsrunnerv3RunReportResponse result = apiInstance.reportsRunnerRunAuditReport(reportId, reportsrunnerv3RunAuditReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsRunnerApi#reportsRunnerRunAuditReport");
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
| **reportId** | **String**| The ID of the Report we wish to run (e.g. 000000000000000000000905). | |
| **reportsrunnerv3RunAuditReportRequest** | [**Reportsrunnerv3RunAuditReportRequest**](Reportsrunnerv3RunAuditReportRequest.md)|  | |

### Return type

[**StreamResultOfReportsrunnerv3RunReportResponse**](StreamResultOfReportsrunnerv3RunReportResponse.md)

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

<a id="reportsRunnerRunReport"></a>
# **reportsRunnerRunReport**
> StreamResultOfReportsrunnerv3RunReportResponse reportsRunnerRunReport(reportsrunnerv3RunReportRequest)

Summary: Run report Description: Run report by report ID or by specifying report definition.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportsRunnerApi;

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

    ReportsRunnerApi apiInstance = new ReportsRunnerApi(defaultClient);
    Reportsrunnerv3RunReportRequest reportsrunnerv3RunReportRequest = new Reportsrunnerv3RunReportRequest(); // Reportsrunnerv3RunReportRequest | 
    try {
      StreamResultOfReportsrunnerv3RunReportResponse result = apiInstance.reportsRunnerRunReport(reportsrunnerv3RunReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsRunnerApi#reportsRunnerRunReport");
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
| **reportsrunnerv3RunReportRequest** | [**Reportsrunnerv3RunReportRequest**](Reportsrunnerv3RunReportRequest.md)|  | |

### Return type

[**StreamResultOfReportsrunnerv3RunReportResponse**](StreamResultOfReportsrunnerv3RunReportResponse.md)

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

<a id="reportsRunnerStopQuery"></a>
# **reportsRunnerStopQuery**
> Reportsrunnerv3StopQueryResponse reportsRunnerStopQuery(reportsrunnerv3StopQueryRequest)

Summary: Stop query Description: Stop a query based on the id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportsRunnerApi;

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

    ReportsRunnerApi apiInstance = new ReportsRunnerApi(defaultClient);
    Reportsrunnerv3StopQueryRequest reportsrunnerv3StopQueryRequest = new Reportsrunnerv3StopQueryRequest(); // Reportsrunnerv3StopQueryRequest | 
    try {
      Reportsrunnerv3StopQueryResponse result = apiInstance.reportsRunnerStopQuery(reportsrunnerv3StopQueryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsRunnerApi#reportsRunnerStopQuery");
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
| **reportsrunnerv3StopQueryRequest** | [**Reportsrunnerv3StopQueryRequest**](Reportsrunnerv3StopQueryRequest.md)|  | |

### Return type

[**Reportsrunnerv3StopQueryResponse**](Reportsrunnerv3StopQueryResponse.md)

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

