# SchedulerServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**schedulerServiceCreateScheduledJob**](SchedulerServiceApi.md#schedulerServiceCreateScheduledJob) | **POST** /api/v3/schedules | Summary: Create scheduled job Description: Create a new scheduled job with tasks. |
| [**schedulerServiceDeleteScheduledJob**](SchedulerServiceApi.md#schedulerServiceDeleteScheduledJob) | **DELETE** /api/v3/schedules/{schedule_id} | Summary: Delete scheduled job Description: Delete a single scheduled job. |
| [**schedulerServiceGetDependencies**](SchedulerServiceApi.md#schedulerServiceGetDependencies) | **GET** /api/v3/schedules/dependencies | Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use |
| [**schedulerServiceGetDistributionRules**](SchedulerServiceApi.md#schedulerServiceGetDistributionRules) | **GET** /api/v3/schedules/distribution_rules | Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can&#39;t be edited if it is used by a scheduled job. |
| [**schedulerServiceGetScheduledJobDetails**](SchedulerServiceApi.md#schedulerServiceGetScheduledJobDetails) | **GET** /api/v3/schedules/{schedule_id}/details | Summary: Get scheduled job Description: Return a single ScheduledJob in detail. |
| [**schedulerServiceGetScheduledJobs**](SchedulerServiceApi.md#schedulerServiceGetScheduledJobs) | **GET** /api/v3/schedules | Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks. |
| [**schedulerServiceGetSchedulesByReport**](SchedulerServiceApi.md#schedulerServiceGetSchedulesByReport) | **POST** /api/v3/schedules/searchByReport/{report_id} | Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled. |
| [**schedulerServiceGetTags**](SchedulerServiceApi.md#schedulerServiceGetTags) | **GET** /api/v3/schedules/tags | Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs. |
| [**schedulerServiceSearchScheduledJobs**](SchedulerServiceApi.md#schedulerServiceSearchScheduledJobs) | **POST** /api/v3/schedules/search | Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks. |
| [**schedulerServiceSearchScheduledTaskRuns**](SchedulerServiceApi.md#schedulerServiceSearchScheduledTaskRuns) | **POST** /api/v3/schedules/runs/search | Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status |
| [**schedulerServiceUpdateScheduledJob**](SchedulerServiceApi.md#schedulerServiceUpdateScheduledJob) | **PATCH** /api/v3/schedules/{schedule_id} | Summary: Update scheduled job Description: Update a single schedule job. |


<a id="schedulerServiceCreateScheduledJob"></a>
# **schedulerServiceCreateScheduledJob**
> Schedulerv3CreateScheduledJobResponse schedulerServiceCreateScheduledJob(schedulerv3CreateScheduledJobRequest)

Summary: Create scheduled job Description: Create a new scheduled job with tasks.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulerServiceApi;

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

    SchedulerServiceApi apiInstance = new SchedulerServiceApi(defaultClient);
    Schedulerv3CreateScheduledJobRequest schedulerv3CreateScheduledJobRequest = new Schedulerv3CreateScheduledJobRequest(); // Schedulerv3CreateScheduledJobRequest | 
    try {
      Schedulerv3CreateScheduledJobResponse result = apiInstance.schedulerServiceCreateScheduledJob(schedulerv3CreateScheduledJobRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerServiceApi#schedulerServiceCreateScheduledJob");
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
| **schedulerv3CreateScheduledJobRequest** | [**Schedulerv3CreateScheduledJobRequest**](Schedulerv3CreateScheduledJobRequest.md)|  | |

### Return type

[**Schedulerv3CreateScheduledJobResponse**](Schedulerv3CreateScheduledJobResponse.md)

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

<a id="schedulerServiceDeleteScheduledJob"></a>
# **schedulerServiceDeleteScheduledJob**
> Schedulerv3DeleteScheduledJobResponse schedulerServiceDeleteScheduledJob(scheduleId)

Summary: Delete scheduled job Description: Delete a single scheduled job.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulerServiceApi;

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

    SchedulerServiceApi apiInstance = new SchedulerServiceApi(defaultClient);
    String scheduleId = "scheduleId_example"; // String | Unique ID, required for delete.
    try {
      Schedulerv3DeleteScheduledJobResponse result = apiInstance.schedulerServiceDeleteScheduledJob(scheduleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerServiceApi#schedulerServiceDeleteScheduledJob");
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
| **scheduleId** | **String**| Unique ID, required for delete. | |

### Return type

[**Schedulerv3DeleteScheduledJobResponse**](Schedulerv3DeleteScheduledJobResponse.md)

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

<a id="schedulerServiceGetDependencies"></a>
# **schedulerServiceGetDependencies**
> Schedulerv3GetDependenciesResponse schedulerServiceGetDependencies(configType)

Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulerServiceApi;

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

    SchedulerServiceApi apiInstance = new SchedulerServiceApi(defaultClient);
    String configType = "configType_example"; // String | specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc.
    try {
      Schedulerv3GetDependenciesResponse result = apiInstance.schedulerServiceGetDependencies(configType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerServiceApi#schedulerServiceGetDependencies");
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
| **configType** | **String**| specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. | [optional] |

### Return type

[**Schedulerv3GetDependenciesResponse**](Schedulerv3GetDependenciesResponse.md)

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

<a id="schedulerServiceGetDistributionRules"></a>
# **schedulerServiceGetDistributionRules**
> Schedulerv3GetDistributionRulesResponse schedulerServiceGetDistributionRules()

Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can&#39;t be edited if it is used by a scheduled job.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulerServiceApi;

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

    SchedulerServiceApi apiInstance = new SchedulerServiceApi(defaultClient);
    try {
      Schedulerv3GetDistributionRulesResponse result = apiInstance.schedulerServiceGetDistributionRules();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerServiceApi#schedulerServiceGetDistributionRules");
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

[**Schedulerv3GetDistributionRulesResponse**](Schedulerv3GetDistributionRulesResponse.md)

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

<a id="schedulerServiceGetScheduledJobDetails"></a>
# **schedulerServiceGetScheduledJobDetails**
> Schedulerv3GetScheduledJobResponse schedulerServiceGetScheduledJobDetails(scheduleId)

Summary: Get scheduled job Description: Return a single ScheduledJob in detail.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulerServiceApi;

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

    SchedulerServiceApi apiInstance = new SchedulerServiceApi(defaultClient);
    String scheduleId = "scheduleId_example"; // String | Used to return a single scheduledjob.
    try {
      Schedulerv3GetScheduledJobResponse result = apiInstance.schedulerServiceGetScheduledJobDetails(scheduleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerServiceApi#schedulerServiceGetScheduledJobDetails");
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
| **scheduleId** | **String**| Used to return a single scheduledjob. | |

### Return type

[**Schedulerv3GetScheduledJobResponse**](Schedulerv3GetScheduledJobResponse.md)

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

<a id="schedulerServiceGetScheduledJobs"></a>
# **schedulerServiceGetScheduledJobs**
> Schedulerv3ScheduledJobSummaryResponse schedulerServiceGetScheduledJobs(offset, limit)

Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulerServiceApi;

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

    SchedulerServiceApi apiInstance = new SchedulerServiceApi(defaultClient);
    Long offset = 56L; // Long | Optional: the amount to offset the rows by for pagination.
    Long limit = 56L; // Long | Optional: the max amount of rows to return for pagination.
    try {
      Schedulerv3ScheduledJobSummaryResponse result = apiInstance.schedulerServiceGetScheduledJobs(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerServiceApi#schedulerServiceGetScheduledJobs");
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
| **offset** | **Long**| Optional: the amount to offset the rows by for pagination. | [optional] |
| **limit** | **Long**| Optional: the max amount of rows to return for pagination. | [optional] |

### Return type

[**Schedulerv3ScheduledJobSummaryResponse**](Schedulerv3ScheduledJobSummaryResponse.md)

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

<a id="schedulerServiceGetSchedulesByReport"></a>
# **schedulerServiceGetSchedulesByReport**
> Schedulerv3GetSchedulesByReportResponse schedulerServiceGetSchedulesByReport(reportId, schedulerv3GetSchedulesByReportRequest)

Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulerServiceApi;

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

    SchedulerServiceApi apiInstance = new SchedulerServiceApi(defaultClient);
    String reportId = "reportId_example"; // String | Report ID for the scheduled report.
    Schedulerv3GetSchedulesByReportRequest schedulerv3GetSchedulesByReportRequest = new Schedulerv3GetSchedulesByReportRequest(); // Schedulerv3GetSchedulesByReportRequest | 
    try {
      Schedulerv3GetSchedulesByReportResponse result = apiInstance.schedulerServiceGetSchedulesByReport(reportId, schedulerv3GetSchedulesByReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerServiceApi#schedulerServiceGetSchedulesByReport");
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
| **reportId** | **String**| Report ID for the scheduled report. | |
| **schedulerv3GetSchedulesByReportRequest** | [**Schedulerv3GetSchedulesByReportRequest**](Schedulerv3GetSchedulesByReportRequest.md)|  | |

### Return type

[**Schedulerv3GetSchedulesByReportResponse**](Schedulerv3GetSchedulesByReportResponse.md)

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

<a id="schedulerServiceGetTags"></a>
# **schedulerServiceGetTags**
> Schedulerv3GetTagsResponse schedulerServiceGetTags()

Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulerServiceApi;

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

    SchedulerServiceApi apiInstance = new SchedulerServiceApi(defaultClient);
    try {
      Schedulerv3GetTagsResponse result = apiInstance.schedulerServiceGetTags();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerServiceApi#schedulerServiceGetTags");
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

[**Schedulerv3GetTagsResponse**](Schedulerv3GetTagsResponse.md)

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

<a id="schedulerServiceSearchScheduledJobs"></a>
# **schedulerServiceSearchScheduledJobs**
> Schedulerv3ScheduledJobSummaryResponse schedulerServiceSearchScheduledJobs(schedulerv3SearchScheduledJobsRequest)

Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulerServiceApi;

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

    SchedulerServiceApi apiInstance = new SchedulerServiceApi(defaultClient);
    Schedulerv3SearchScheduledJobsRequest schedulerv3SearchScheduledJobsRequest = new Schedulerv3SearchScheduledJobsRequest(); // Schedulerv3SearchScheduledJobsRequest | 
    try {
      Schedulerv3ScheduledJobSummaryResponse result = apiInstance.schedulerServiceSearchScheduledJobs(schedulerv3SearchScheduledJobsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerServiceApi#schedulerServiceSearchScheduledJobs");
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
| **schedulerv3SearchScheduledJobsRequest** | [**Schedulerv3SearchScheduledJobsRequest**](Schedulerv3SearchScheduledJobsRequest.md)|  | |

### Return type

[**Schedulerv3ScheduledJobSummaryResponse**](Schedulerv3ScheduledJobSummaryResponse.md)

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

<a id="schedulerServiceSearchScheduledTaskRuns"></a>
# **schedulerServiceSearchScheduledTaskRuns**
> Schedulerv3SearchScheduledTaskRunsResponse schedulerServiceSearchScheduledTaskRuns(schedulerv3SearchScheduledTaskRunsRequest)

Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulerServiceApi;

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

    SchedulerServiceApi apiInstance = new SchedulerServiceApi(defaultClient);
    Schedulerv3SearchScheduledTaskRunsRequest schedulerv3SearchScheduledTaskRunsRequest = new Schedulerv3SearchScheduledTaskRunsRequest(); // Schedulerv3SearchScheduledTaskRunsRequest | 
    try {
      Schedulerv3SearchScheduledTaskRunsResponse result = apiInstance.schedulerServiceSearchScheduledTaskRuns(schedulerv3SearchScheduledTaskRunsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerServiceApi#schedulerServiceSearchScheduledTaskRuns");
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
| **schedulerv3SearchScheduledTaskRunsRequest** | [**Schedulerv3SearchScheduledTaskRunsRequest**](Schedulerv3SearchScheduledTaskRunsRequest.md)|  | |

### Return type

[**Schedulerv3SearchScheduledTaskRunsResponse**](Schedulerv3SearchScheduledTaskRunsResponse.md)

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

<a id="schedulerServiceUpdateScheduledJob"></a>
# **schedulerServiceUpdateScheduledJob**
> Schedulerv3UpdateScheduledJobResponse schedulerServiceUpdateScheduledJob(scheduleId, schedulerv3UpdateScheduledJobRequest)

Summary: Update scheduled job Description: Update a single schedule job.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulerServiceApi;

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

    SchedulerServiceApi apiInstance = new SchedulerServiceApi(defaultClient);
    String scheduleId = "scheduleId_example"; // String | Unique ID, required for update.
    Schedulerv3UpdateScheduledJobRequest schedulerv3UpdateScheduledJobRequest = new Schedulerv3UpdateScheduledJobRequest(); // Schedulerv3UpdateScheduledJobRequest | 
    try {
      Schedulerv3UpdateScheduledJobResponse result = apiInstance.schedulerServiceUpdateScheduledJob(scheduleId, schedulerv3UpdateScheduledJobRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerServiceApi#schedulerServiceUpdateScheduledJob");
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
| **scheduleId** | **String**| Unique ID, required for update. | |
| **schedulerv3UpdateScheduledJobRequest** | [**Schedulerv3UpdateScheduledJobRequest**](Schedulerv3UpdateScheduledJobRequest.md)|  | |

### Return type

[**Schedulerv3UpdateScheduledJobResponse**](Schedulerv3UpdateScheduledJobResponse.md)

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

