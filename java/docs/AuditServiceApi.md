# AuditServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**auditServiceGetActivityRecords**](AuditServiceApi.md#auditServiceGetActivityRecords) | **GET** /api/v3/activity | Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \&quot;op1, op2, op3\&quot;. |
| [**auditServicePutDownloadActivityRecord**](AuditServiceApi.md#auditServicePutDownloadActivityRecord) | **POST** /api/v3/activity | Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request. |


<a id="auditServiceGetActivityRecords"></a>
# **auditServiceGetActivityRecords**
> Auditv3GetActivityRecordsResponse auditServiceGetActivityRecords(startTime, endTime, uid, actionTaken, context, changesMade, performedBy, contextDescription, query, offset, limit, filter)

Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \&quot;op1, op2, op3\&quot;.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.AuditServiceApi;

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

    AuditServiceApi apiInstance = new AuditServiceApi(defaultClient);
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | Return records starting at this time (>=).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | Return records ending before this time (<).
    String uid = "uid_example"; // String | Return records with this service/collection id.
    String actionTaken = "actionTaken_example"; // String | Return records matching this operation (CRUD or other action).
    String context = "context_example"; // String | Return records for this service/collection.
    String changesMade = "changesMade_example"; // String | Return records created only for this reason.
    String performedBy = "performedBy_example"; // String | Return records originating with the specified user id.
    String contextDescription = "contextDescription_example"; // String | Return records with this label.
    String query = "query_example"; // String | Return records based on the query.
    Long offset = 56L; // Long | The amount to offset the rows by for pagination.
    Long limit = 56L; // Long | The max amount of rows to return for pagination.
    Boolean filter = true; // Boolean | Return eligable filters if this is true.
    try {
      Auditv3GetActivityRecordsResponse result = apiInstance.auditServiceGetActivityRecords(startTime, endTime, uid, actionTaken, context, changesMade, performedBy, contextDescription, query, offset, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditServiceApi#auditServiceGetActivityRecords");
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
| **startTime** | **OffsetDateTime**| Return records starting at this time (&gt;&#x3D;). | [optional] |
| **endTime** | **OffsetDateTime**| Return records ending before this time (&lt;). | [optional] |
| **uid** | **String**| Return records with this service/collection id. | [optional] |
| **actionTaken** | **String**| Return records matching this operation (CRUD or other action). | [optional] |
| **context** | **String**| Return records for this service/collection. | [optional] |
| **changesMade** | **String**| Return records created only for this reason. | [optional] |
| **performedBy** | **String**| Return records originating with the specified user id. | [optional] |
| **contextDescription** | **String**| Return records with this label. | [optional] |
| **query** | **String**| Return records based on the query. | [optional] |
| **offset** | **Long**| The amount to offset the rows by for pagination. | [optional] |
| **limit** | **Long**| The max amount of rows to return for pagination. | [optional] |
| **filter** | **Boolean**| Return eligable filters if this is true. | [optional] |

### Return type

[**Auditv3GetActivityRecordsResponse**](Auditv3GetActivityRecordsResponse.md)

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

<a id="auditServicePutDownloadActivityRecord"></a>
# **auditServicePutDownloadActivityRecord**
> Auditv3PutActivityRecordResponse auditServicePutDownloadActivityRecord(auditv3PutActivityRecordRequest)

Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.AuditServiceApi;

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

    AuditServiceApi apiInstance = new AuditServiceApi(defaultClient);
    Auditv3PutActivityRecordRequest auditv3PutActivityRecordRequest = new Auditv3PutActivityRecordRequest(); // Auditv3PutActivityRecordRequest | 
    try {
      Auditv3PutActivityRecordResponse result = apiInstance.auditServicePutDownloadActivityRecord(auditv3PutActivityRecordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditServiceApi#auditServicePutDownloadActivityRecord");
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
| **auditv3PutActivityRecordRequest** | [**Auditv3PutActivityRecordRequest**](Auditv3PutActivityRecordRequest.md)|  | |

### Return type

[**Auditv3PutActivityRecordResponse**](Auditv3PutActivityRecordResponse.md)

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

