# DatamartProcessorServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**datamartProcessorServiceGetDatamartInfo**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetDatamartInfo) | **GET** /api/v3/datamarts/info | Summary: Get datamarts Description: Return a list of files inside a datamart to the caller. |
| [**datamartProcessorServiceGetDatamarts**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetDatamarts) | **GET** /api/v3/datamarts | Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller. |
| [**datamartProcessorServiceGetEarliestStartTime**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetEarliestStartTime) | **GET** /api/v3/datamarts/earliest_start_time | Summary: Get rarliest start time Description: Return the earliest time period of data available in database. |
| [**datamartProcessorServiceSendAllCompleteFilesToQueue**](DatamartProcessorServiceApi.md#datamartProcessorServiceSendAllCompleteFilesToQueue) | **POST** /api/v3/datamarts/repush_files |  |
| [**datamartProcessorServiceStoreExtractionLogs**](DatamartProcessorServiceApi.md#datamartProcessorServiceStoreExtractionLogs) | **POST** /api/v3/datamarts/{request_id}/dm_extraction_logs | Summary: Store extraction logs Description: Store the datamart extraction logs inside GI. |
| [**uploadDatamart**](DatamartProcessorServiceApi.md#uploadDatamart) | **POST** /api/v3/datamarts/upload | Summary: Upload datamart Description: Upload datamart file for ingestion. |


<a id="datamartProcessorServiceGetDatamartInfo"></a>
# **datamartProcessorServiceGetDatamartInfo**
> Datamartprocessorv3GetDatamartInfoResponse datamartProcessorServiceGetDatamartInfo(ingestionId)

Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatamartProcessorServiceApi;

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

    DatamartProcessorServiceApi apiInstance = new DatamartProcessorServiceApi(defaultClient);
    String ingestionId = "ingestionId_example"; // String | Ingestion id.
    try {
      Datamartprocessorv3GetDatamartInfoResponse result = apiInstance.datamartProcessorServiceGetDatamartInfo(ingestionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatamartProcessorServiceApi#datamartProcessorServiceGetDatamartInfo");
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
| **ingestionId** | **String**| Ingestion id. | [optional] |

### Return type

[**Datamartprocessorv3GetDatamartInfoResponse**](Datamartprocessorv3GetDatamartInfoResponse.md)

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

<a id="datamartProcessorServiceGetDatamarts"></a>
# **datamartProcessorServiceGetDatamarts**
> Datamartprocessorv3GetDatamartResponse datamartProcessorServiceGetDatamarts(periodStart, periodEnd)

Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatamartProcessorServiceApi;

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

    DatamartProcessorServiceApi apiInstance = new DatamartProcessorServiceApi(defaultClient);
    OffsetDateTime periodStart = OffsetDateTime.now(); // OffsetDateTime | Data starting time period in UTC.
    OffsetDateTime periodEnd = OffsetDateTime.now(); // OffsetDateTime | Data ending time period in UTC.
    try {
      Datamartprocessorv3GetDatamartResponse result = apiInstance.datamartProcessorServiceGetDatamarts(periodStart, periodEnd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatamartProcessorServiceApi#datamartProcessorServiceGetDatamarts");
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
| **periodStart** | **OffsetDateTime**| Data starting time period in UTC. | [optional] |
| **periodEnd** | **OffsetDateTime**| Data ending time period in UTC. | [optional] |

### Return type

[**Datamartprocessorv3GetDatamartResponse**](Datamartprocessorv3GetDatamartResponse.md)

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

<a id="datamartProcessorServiceGetEarliestStartTime"></a>
# **datamartProcessorServiceGetEarliestStartTime**
> Datamartprocessorv3GetEarliestStartTimeResponse datamartProcessorServiceGetEarliestStartTime()

Summary: Get rarliest start time Description: Return the earliest time period of data available in database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatamartProcessorServiceApi;

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

    DatamartProcessorServiceApi apiInstance = new DatamartProcessorServiceApi(defaultClient);
    try {
      Datamartprocessorv3GetEarliestStartTimeResponse result = apiInstance.datamartProcessorServiceGetEarliestStartTime();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatamartProcessorServiceApi#datamartProcessorServiceGetEarliestStartTime");
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

[**Datamartprocessorv3GetEarliestStartTimeResponse**](Datamartprocessorv3GetEarliestStartTimeResponse.md)

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

<a id="datamartProcessorServiceSendAllCompleteFilesToQueue"></a>
# **datamartProcessorServiceSendAllCompleteFilesToQueue**
> Datamartprocessorv3StatusResponseBase datamartProcessorServiceSendAllCompleteFilesToQueue(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatamartProcessorServiceApi;

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

    DatamartProcessorServiceApi apiInstance = new DatamartProcessorServiceApi(defaultClient);
    Object body = null; // Object | 
    try {
      Datamartprocessorv3StatusResponseBase result = apiInstance.datamartProcessorServiceSendAllCompleteFilesToQueue(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatamartProcessorServiceApi#datamartProcessorServiceSendAllCompleteFilesToQueue");
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

[**Datamartprocessorv3StatusResponseBase**](Datamartprocessorv3StatusResponseBase.md)

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

<a id="datamartProcessorServiceStoreExtractionLogs"></a>
# **datamartProcessorServiceStoreExtractionLogs**
> Datamartprocessorv3DMExtractionLogsResponse datamartProcessorServiceStoreExtractionLogs(requestId, datamartprocessorv3DMExtractionLogsRequest)

Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatamartProcessorServiceApi;

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

    DatamartProcessorServiceApi apiInstance = new DatamartProcessorServiceApi(defaultClient);
    String requestId = "requestId_example"; // String | Request id which co-relates to request.
    Datamartprocessorv3DMExtractionLogsRequest datamartprocessorv3DMExtractionLogsRequest = new Datamartprocessorv3DMExtractionLogsRequest(); // Datamartprocessorv3DMExtractionLogsRequest | 
    try {
      Datamartprocessorv3DMExtractionLogsResponse result = apiInstance.datamartProcessorServiceStoreExtractionLogs(requestId, datamartprocessorv3DMExtractionLogsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatamartProcessorServiceApi#datamartProcessorServiceStoreExtractionLogs");
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
| **requestId** | **String**| Request id which co-relates to request. | |
| **datamartprocessorv3DMExtractionLogsRequest** | [**Datamartprocessorv3DMExtractionLogsRequest**](Datamartprocessorv3DMExtractionLogsRequest.md)|  | |

### Return type

[**Datamartprocessorv3DMExtractionLogsResponse**](Datamartprocessorv3DMExtractionLogsResponse.md)

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

<a id="uploadDatamart"></a>
# **uploadDatamart**
> uploadDatamart(_file)

Summary: Upload datamart Description: Upload datamart file for ingestion.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatamartProcessorServiceApi;

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

    DatamartProcessorServiceApi apiInstance = new DatamartProcessorServiceApi(defaultClient);
    File _file = new File("/path/to/file"); // File | The file to upload.
    try {
      apiInstance.uploadDatamart(_file);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatamartProcessorServiceApi#uploadDatamart");
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
| **_file** | **File**| The file to upload. | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **0** | An unexpected error response. |  -  |

