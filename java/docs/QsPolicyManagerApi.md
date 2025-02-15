# QsPolicyManagerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**qSPolicyManagerBatchStatusUpdate**](QsPolicyManagerApi.md#qSPolicyManagerBatchStatusUpdate) | **PUT** /api/v3/policy_manager/tickets/status | BatchStatusUpdate - trigger the batch to update the status of the Ticket . |
| [**qSPolicyManagerCreateTicket**](QsPolicyManagerApi.md#qSPolicyManagerCreateTicket) | **POST** /api/v3/policy_manager/ticket | CreateTicket - Create a new Incident . |
| [**qSPolicyManagerFetchFilesfromBuckets**](QsPolicyManagerApi.md#qSPolicyManagerFetchFilesfromBuckets) | **GET** /api/v3/policy_manager/os-files | FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage |
| [**qSPolicyManagerProcessPolicyDimentionRecords**](QsPolicyManagerApi.md#qSPolicyManagerProcessPolicyDimentionRecords) | **POST** /api/v3/policy_manager/policy/process | ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table |
| [**qSPolicyManagerUpdateTicketStatus**](QsPolicyManagerApi.md#qSPolicyManagerUpdateTicketStatus) | **PUT** /api/v3/policy_manager/ticket/status | UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId . |


<a id="qSPolicyManagerBatchStatusUpdate"></a>
# **qSPolicyManagerBatchStatusUpdate**
> Qspmpolicymanagerv3StandardEmptyResponse qSPolicyManagerBatchStatusUpdate(body)

BatchStatusUpdate - trigger the batch to update the status of the Ticket .

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.QsPolicyManagerApi;

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

    QsPolicyManagerApi apiInstance = new QsPolicyManagerApi(defaultClient);
    Object body = null; // Object | 
    try {
      Qspmpolicymanagerv3StandardEmptyResponse result = apiInstance.qSPolicyManagerBatchStatusUpdate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsPolicyManagerApi#qSPolicyManagerBatchStatusUpdate");
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

[**Qspmpolicymanagerv3StandardEmptyResponse**](Qspmpolicymanagerv3StandardEmptyResponse.md)

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

<a id="qSPolicyManagerCreateTicket"></a>
# **qSPolicyManagerCreateTicket**
> Qspmpolicymanagerv3CreateTicketResponse qSPolicyManagerCreateTicket(qspmpolicymanagerv3CreateTicketRequest)

CreateTicket - Create a new Incident .

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.QsPolicyManagerApi;

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

    QsPolicyManagerApi apiInstance = new QsPolicyManagerApi(defaultClient);
    Qspmpolicymanagerv3CreateTicketRequest qspmpolicymanagerv3CreateTicketRequest = new Qspmpolicymanagerv3CreateTicketRequest(); // Qspmpolicymanagerv3CreateTicketRequest | 
    try {
      Qspmpolicymanagerv3CreateTicketResponse result = apiInstance.qSPolicyManagerCreateTicket(qspmpolicymanagerv3CreateTicketRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsPolicyManagerApi#qSPolicyManagerCreateTicket");
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
| **qspmpolicymanagerv3CreateTicketRequest** | [**Qspmpolicymanagerv3CreateTicketRequest**](Qspmpolicymanagerv3CreateTicketRequest.md)|  | |

### Return type

[**Qspmpolicymanagerv3CreateTicketResponse**](Qspmpolicymanagerv3CreateTicketResponse.md)

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

<a id="qSPolicyManagerFetchFilesfromBuckets"></a>
# **qSPolicyManagerFetchFilesfromBuckets**
> Qspmpolicymanagerv3FetchObjectStoreFileResponse qSPolicyManagerFetchFilesfromBuckets()

FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.QsPolicyManagerApi;

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

    QsPolicyManagerApi apiInstance = new QsPolicyManagerApi(defaultClient);
    try {
      Qspmpolicymanagerv3FetchObjectStoreFileResponse result = apiInstance.qSPolicyManagerFetchFilesfromBuckets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsPolicyManagerApi#qSPolicyManagerFetchFilesfromBuckets");
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

[**Qspmpolicymanagerv3FetchObjectStoreFileResponse**](Qspmpolicymanagerv3FetchObjectStoreFileResponse.md)

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

<a id="qSPolicyManagerProcessPolicyDimentionRecords"></a>
# **qSPolicyManagerProcessPolicyDimentionRecords**
> Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse qSPolicyManagerProcessPolicyDimentionRecords(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest)

ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.QsPolicyManagerApi;

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

    QsPolicyManagerApi apiInstance = new QsPolicyManagerApi(defaultClient);
    Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest = new Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest(); // Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest | 
    try {
      Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse result = apiInstance.qSPolicyManagerProcessPolicyDimentionRecords(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsPolicyManagerApi#qSPolicyManagerProcessPolicyDimentionRecords");
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
| **qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest** | [**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest**](Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.md)|  | |

### Return type

[**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse**](Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse.md)

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

<a id="qSPolicyManagerUpdateTicketStatus"></a>
# **qSPolicyManagerUpdateTicketStatus**
> Qspmpolicymanagerv3UpdateTicketStatusResponse qSPolicyManagerUpdateTicketStatus(qspmpolicymanagerv3UpdateTicketStatusRequest)

UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.QsPolicyManagerApi;

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

    QsPolicyManagerApi apiInstance = new QsPolicyManagerApi(defaultClient);
    Qspmpolicymanagerv3UpdateTicketStatusRequest qspmpolicymanagerv3UpdateTicketStatusRequest = new Qspmpolicymanagerv3UpdateTicketStatusRequest(); // Qspmpolicymanagerv3UpdateTicketStatusRequest | 
    try {
      Qspmpolicymanagerv3UpdateTicketStatusResponse result = apiInstance.qSPolicyManagerUpdateTicketStatus(qspmpolicymanagerv3UpdateTicketStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsPolicyManagerApi#qSPolicyManagerUpdateTicketStatus");
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
| **qspmpolicymanagerv3UpdateTicketStatusRequest** | [**Qspmpolicymanagerv3UpdateTicketStatusRequest**](Qspmpolicymanagerv3UpdateTicketStatusRequest.md)|  | |

### Return type

[**Qspmpolicymanagerv3UpdateTicketStatusResponse**](Qspmpolicymanagerv3UpdateTicketStatusResponse.md)

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

