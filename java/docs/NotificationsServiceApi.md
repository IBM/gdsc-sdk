# NotificationsServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notificationsServiceCreateTicket**](NotificationsServiceApi.md#notificationsServiceCreateTicket) | **POST** /api/v3/integrations/ticket | Summary: Create ticket Description: Create ticket based on information passed in. |
| [**notificationsServiceGetFolders**](NotificationsServiceApi.md#notificationsServiceGetFolders) | **POST** /api/v3/integrations/folders | Summary: Get folders Description: Get folder for the integration connection provided. |
| [**notificationsServiceGetNotificationFilename**](NotificationsServiceApi.md#notificationsServiceGetNotificationFilename) | **GET** /api/v3/notifications/filename | Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request. |
| [**notificationsServiceGetNotificationRecord**](NotificationsServiceApi.md#notificationsServiceGetNotificationRecord) | **GET** /api/v3/notifications/details/{notification_id} | Summary: Get notification record Description: Return notifications record with the specified ID. |
| [**notificationsServiceGetNotificationRecords**](NotificationsServiceApi.md#notificationsServiceGetNotificationRecords) | **GET** /api/v3/notifications | Summary: Get notification records Description: Return notifications records that match the specified filter. |
| [**notificationsServiceGetTicketStatus**](NotificationsServiceApi.md#notificationsServiceGetTicketStatus) | **GET** /api/v3/integrations/ticket/status | Summary: Get ticket status Description: Get the status of the given ticket |
| [**notificationsServicePostNotificationRecord**](NotificationsServiceApi.md#notificationsServicePostNotificationRecord) | **POST** /api/v3/notifications | Summary: For PostNotificationRecord notification only Description: Sends notification with recipients and returns a status |
| [**notificationsServiceSearchNotificationRecords**](NotificationsServiceApi.md#notificationsServiceSearchNotificationRecords) | **POST** /api/v3/notifications/search | Summary: Search notification records Description: Return notification records using pipeline of filters |
| [**notificationsServiceTestIntegration**](NotificationsServiceApi.md#notificationsServiceTestIntegration) | **POST** /api/v3/integrations/test | Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional. |
| [**notificationsServiceUpdateNotificationRecord**](NotificationsServiceApi.md#notificationsServiceUpdateNotificationRecord) | **PUT** /api/v3/notifications | Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated. |


<a id="notificationsServiceCreateTicket"></a>
# **notificationsServiceCreateTicket**
> Notificationsv3CreateTicketResponse notificationsServiceCreateTicket(notificationsv3CreateTicketRequest)

Summary: Create ticket Description: Create ticket based on information passed in.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.NotificationsServiceApi;

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

    NotificationsServiceApi apiInstance = new NotificationsServiceApi(defaultClient);
    Notificationsv3CreateTicketRequest notificationsv3CreateTicketRequest = new Notificationsv3CreateTicketRequest(); // Notificationsv3CreateTicketRequest | 
    try {
      Notificationsv3CreateTicketResponse result = apiInstance.notificationsServiceCreateTicket(notificationsv3CreateTicketRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsServiceApi#notificationsServiceCreateTicket");
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
| **notificationsv3CreateTicketRequest** | [**Notificationsv3CreateTicketRequest**](Notificationsv3CreateTicketRequest.md)|  | |

### Return type

[**Notificationsv3CreateTicketResponse**](Notificationsv3CreateTicketResponse.md)

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

<a id="notificationsServiceGetFolders"></a>
# **notificationsServiceGetFolders**
> Notificationsv3GetFoldersResponse notificationsServiceGetFolders(notificationsv3GetFoldersRequest)

Summary: Get folders Description: Get folder for the integration connection provided.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.NotificationsServiceApi;

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

    NotificationsServiceApi apiInstance = new NotificationsServiceApi(defaultClient);
    Notificationsv3GetFoldersRequest notificationsv3GetFoldersRequest = new Notificationsv3GetFoldersRequest(); // Notificationsv3GetFoldersRequest | 
    try {
      Notificationsv3GetFoldersResponse result = apiInstance.notificationsServiceGetFolders(notificationsv3GetFoldersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsServiceApi#notificationsServiceGetFolders");
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
| **notificationsv3GetFoldersRequest** | [**Notificationsv3GetFoldersRequest**](Notificationsv3GetFoldersRequest.md)|  | |

### Return type

[**Notificationsv3GetFoldersResponse**](Notificationsv3GetFoldersResponse.md)

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

<a id="notificationsServiceGetNotificationFilename"></a>
# **notificationsServiceGetNotificationFilename**
> Notificationsv3GetNotificationFilenameResponse notificationsServiceGetNotificationFilename(notificationId)

Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.NotificationsServiceApi;

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

    NotificationsServiceApi apiInstance = new NotificationsServiceApi(defaultClient);
    String notificationId = "notificationId_example"; // String | Params are located in the requests context (tenant id, user email, notification id).
    try {
      Notificationsv3GetNotificationFilenameResponse result = apiInstance.notificationsServiceGetNotificationFilename(notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsServiceApi#notificationsServiceGetNotificationFilename");
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
| **notificationId** | **String**| Params are located in the requests context (tenant id, user email, notification id). | [optional] |

### Return type

[**Notificationsv3GetNotificationFilenameResponse**](Notificationsv3GetNotificationFilenameResponse.md)

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

<a id="notificationsServiceGetNotificationRecord"></a>
# **notificationsServiceGetNotificationRecord**
> Notificationsv3GetNotificationRecordResponse notificationsServiceGetNotificationRecord(notificationId)

Summary: Get notification record Description: Return notifications record with the specified ID.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.NotificationsServiceApi;

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

    NotificationsServiceApi apiInstance = new NotificationsServiceApi(defaultClient);
    String notificationId = "notificationId_example"; // String | ID for the record to return.
    try {
      Notificationsv3GetNotificationRecordResponse result = apiInstance.notificationsServiceGetNotificationRecord(notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsServiceApi#notificationsServiceGetNotificationRecord");
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
| **notificationId** | **String**| ID for the record to return. | |

### Return type

[**Notificationsv3GetNotificationRecordResponse**](Notificationsv3GetNotificationRecordResponse.md)

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

<a id="notificationsServiceGetNotificationRecords"></a>
# **notificationsServiceGetNotificationRecords**
> Notificationsv3GetNotificationRecordsResponse notificationsServiceGetNotificationRecords(filterStartTime, filterEndTime, filterState, filterOrigins, filterOriginData, filterLimit, offset, limit, includeFilterCounts)

Summary: Get notification records Description: Return notifications records that match the specified filter.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.NotificationsServiceApi;

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

    NotificationsServiceApi apiInstance = new NotificationsServiceApi(defaultClient);
    OffsetDateTime filterStartTime = OffsetDateTime.now(); // OffsetDateTime | Return records created at this time or later (>=).
    OffsetDateTime filterEndTime = OffsetDateTime.now(); // OffsetDateTime | Return records created before this time (<).
    String filterState = "INCLUDE_ALL"; // String | Only return record that include the specified state.
    List<String> filterOrigins = Arrays.asList(); // List<String> | Only return record that includes the specified origins.
    String filterOriginData = "filterOriginData_example"; // String | Only return record that with the specified origin_data.
    Long filterLimit = 56L; // Long | The max amount of rows to return for this single query.
    Long offset = 56L; // Long | The amount to offset the rows by for pagination.
    Long limit = 56L; // Long | The max amount of rows to return for pagination.
    Boolean includeFilterCounts = true; // Boolean | Computing the filter counts is relatively expensive, only compute when needed.
    try {
      Notificationsv3GetNotificationRecordsResponse result = apiInstance.notificationsServiceGetNotificationRecords(filterStartTime, filterEndTime, filterState, filterOrigins, filterOriginData, filterLimit, offset, limit, includeFilterCounts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsServiceApi#notificationsServiceGetNotificationRecords");
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
| **filterStartTime** | **OffsetDateTime**| Return records created at this time or later (&gt;&#x3D;). | [optional] |
| **filterEndTime** | **OffsetDateTime**| Return records created before this time (&lt;). | [optional] |
| **filterState** | **String**| Only return record that include the specified state. | [optional] [default to INCLUDE_ALL] [enum: INCLUDE_ALL, UNREAD_ONLY, READ_ONLY, COMPLETE_ONLY, NOT_COMPLETE] |
| **filterOrigins** | [**List&lt;String&gt;**](String.md)| Only return record that includes the specified origins. | [optional] |
| **filterOriginData** | **String**| Only return record that with the specified origin_data. | [optional] |
| **filterLimit** | **Long**| The max amount of rows to return for this single query. | [optional] |
| **offset** | **Long**| The amount to offset the rows by for pagination. | [optional] |
| **limit** | **Long**| The max amount of rows to return for pagination. | [optional] |
| **includeFilterCounts** | **Boolean**| Computing the filter counts is relatively expensive, only compute when needed. | [optional] |

### Return type

[**Notificationsv3GetNotificationRecordsResponse**](Notificationsv3GetNotificationRecordsResponse.md)

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

<a id="notificationsServiceGetTicketStatus"></a>
# **notificationsServiceGetTicketStatus**
> Notificationsv3GetTicketStatusResponse notificationsServiceGetTicketStatus(ticketId, integrationId)

Summary: Get ticket status Description: Get the status of the given ticket

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.NotificationsServiceApi;

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

    NotificationsServiceApi apiInstance = new NotificationsServiceApi(defaultClient);
    String ticketId = "ticketId_example"; // String | The ID of the ticket to fetch.
    String integrationId = "integrationId_example"; // String | The ID of the ticketing integration.
    try {
      Notificationsv3GetTicketStatusResponse result = apiInstance.notificationsServiceGetTicketStatus(ticketId, integrationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsServiceApi#notificationsServiceGetTicketStatus");
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
| **ticketId** | **String**| The ID of the ticket to fetch. | [optional] |
| **integrationId** | **String**| The ID of the ticketing integration. | [optional] |

### Return type

[**Notificationsv3GetTicketStatusResponse**](Notificationsv3GetTicketStatusResponse.md)

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

<a id="notificationsServicePostNotificationRecord"></a>
# **notificationsServicePostNotificationRecord**
> Notificationsv3PostNotificationRecordResponse notificationsServicePostNotificationRecord(notificationsv3PostNotificationRecordRequest)

Summary: For PostNotificationRecord notification only Description: Sends notification with recipients and returns a status

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.NotificationsServiceApi;

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

    NotificationsServiceApi apiInstance = new NotificationsServiceApi(defaultClient);
    Notificationsv3PostNotificationRecordRequest notificationsv3PostNotificationRecordRequest = new Notificationsv3PostNotificationRecordRequest(); // Notificationsv3PostNotificationRecordRequest | 
    try {
      Notificationsv3PostNotificationRecordResponse result = apiInstance.notificationsServicePostNotificationRecord(notificationsv3PostNotificationRecordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsServiceApi#notificationsServicePostNotificationRecord");
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
| **notificationsv3PostNotificationRecordRequest** | [**Notificationsv3PostNotificationRecordRequest**](Notificationsv3PostNotificationRecordRequest.md)|  | |

### Return type

[**Notificationsv3PostNotificationRecordResponse**](Notificationsv3PostNotificationRecordResponse.md)

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

<a id="notificationsServiceSearchNotificationRecords"></a>
# **notificationsServiceSearchNotificationRecords**
> Notificationsv3SearchNotificationRecordsResponse notificationsServiceSearchNotificationRecords(notificationsv3SearchNotificationRecordsRequest)

Summary: Search notification records Description: Return notification records using pipeline of filters

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.NotificationsServiceApi;

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

    NotificationsServiceApi apiInstance = new NotificationsServiceApi(defaultClient);
    Notificationsv3SearchNotificationRecordsRequest notificationsv3SearchNotificationRecordsRequest = new Notificationsv3SearchNotificationRecordsRequest(); // Notificationsv3SearchNotificationRecordsRequest | 
    try {
      Notificationsv3SearchNotificationRecordsResponse result = apiInstance.notificationsServiceSearchNotificationRecords(notificationsv3SearchNotificationRecordsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsServiceApi#notificationsServiceSearchNotificationRecords");
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
| **notificationsv3SearchNotificationRecordsRequest** | [**Notificationsv3SearchNotificationRecordsRequest**](Notificationsv3SearchNotificationRecordsRequest.md)|  | |

### Return type

[**Notificationsv3SearchNotificationRecordsResponse**](Notificationsv3SearchNotificationRecordsResponse.md)

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

<a id="notificationsServiceTestIntegration"></a>
# **notificationsServiceTestIntegration**
> Notificationsv3TestIntegrationResponse notificationsServiceTestIntegration(notificationsv3TestIntegrationRequest)

Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.NotificationsServiceApi;

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

    NotificationsServiceApi apiInstance = new NotificationsServiceApi(defaultClient);
    Notificationsv3TestIntegrationRequest notificationsv3TestIntegrationRequest = new Notificationsv3TestIntegrationRequest(); // Notificationsv3TestIntegrationRequest | 
    try {
      Notificationsv3TestIntegrationResponse result = apiInstance.notificationsServiceTestIntegration(notificationsv3TestIntegrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsServiceApi#notificationsServiceTestIntegration");
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
| **notificationsv3TestIntegrationRequest** | [**Notificationsv3TestIntegrationRequest**](Notificationsv3TestIntegrationRequest.md)|  | |

### Return type

[**Notificationsv3TestIntegrationResponse**](Notificationsv3TestIntegrationResponse.md)

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

<a id="notificationsServiceUpdateNotificationRecord"></a>
# **notificationsServiceUpdateNotificationRecord**
> Notificationsv3UpdateNotificationRecordResponse notificationsServiceUpdateNotificationRecord(notificationsv3UpdateNotificationRecordRequest)

Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.NotificationsServiceApi;

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

    NotificationsServiceApi apiInstance = new NotificationsServiceApi(defaultClient);
    Notificationsv3UpdateNotificationRecordRequest notificationsv3UpdateNotificationRecordRequest = new Notificationsv3UpdateNotificationRecordRequest(); // Notificationsv3UpdateNotificationRecordRequest | 
    try {
      Notificationsv3UpdateNotificationRecordResponse result = apiInstance.notificationsServiceUpdateNotificationRecord(notificationsv3UpdateNotificationRecordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsServiceApi#notificationsServiceUpdateNotificationRecord");
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
| **notificationsv3UpdateNotificationRecordRequest** | [**Notificationsv3UpdateNotificationRecordRequest**](Notificationsv3UpdateNotificationRecordRequest.md)|  | |

### Return type

[**Notificationsv3UpdateNotificationRecordResponse**](Notificationsv3UpdateNotificationRecordResponse.md)

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

