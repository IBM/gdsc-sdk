# GuardiumConnectorApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**guardiumConnectorAddCM**](GuardiumConnectorApi.md#guardiumConnectorAddCM) | **POST** /api/v3/central_managers | Summary: Add CM Description: Add a Central Manager to the tenant database. |
| [**guardiumConnectorAddDatamarts**](GuardiumConnectorApi.md#guardiumConnectorAddDatamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts | Description: stores datamarts details from GDP |
| [**guardiumConnectorAddDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorAddDmExclusion) | **POST** /api/v3/datamarts/exclusion_list | Summary: Add DM exclusion Description: Add datamart to exclusion list. |
| [**guardiumConnectorAddTask**](GuardiumConnectorApi.md#guardiumConnectorAddTask) | **POST** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Add task Description: Add a task to be executed on GDP. |
| [**guardiumConnectorBlockUser**](GuardiumConnectorApi.md#guardiumConnectorBlockUser) | **POST** /api/v3/block_user | Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance. |
| [**guardiumConnectorConfigureAggregatorExport**](GuardiumConnectorApi.md#guardiumConnectorConfigureAggregatorExport) | **PUT** /api/v3/central_managers/{central_manager_id}/aggregator_config_export | Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI. |
| [**guardiumConnectorConfigureCollectorExport**](GuardiumConnectorApi.md#guardiumConnectorConfigureCollectorExport) | **PUT** /api/v3/central_managers/{central_manager_id}/collector_config_export | Summary: Configure collector export Description: Schedule export historical data for collectors. |
| [**guardiumConnectorConfigureStreaming**](GuardiumConnectorApi.md#guardiumConnectorConfigureStreaming) | **POST** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Configure streaming Description: Enable or disable streaming. |
| [**guardiumConnectorDatamartVersionCheck**](GuardiumConnectorApi.md#guardiumConnectorDatamartVersionCheck) | **POST** /api/v3/central_managers/{central_manager_id}/datamart_version | Description: validates if central manager has datamart support for event model |
| [**guardiumConnectorDeleteCM**](GuardiumConnectorApi.md#guardiumConnectorDeleteCM) | **DELETE** /api/v3/central_managers/{central_manager_id} | Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP). |
| [**guardiumConnectorDeleteDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorDeleteDmExclusion) | **DELETE** /api/v3/datamarts/exclusion_list | Summary: Delete DM exclusion Description: Delete a datamart from exclusion list. |
| [**guardiumConnectorDeleteTask**](GuardiumConnectorApi.md#guardiumConnectorDeleteTask) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Delete task Description: Delete a task by central manager id and task id. |
| [**guardiumConnectorDeleteTasks**](GuardiumConnectorApi.md#guardiumConnectorDeleteTasks) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Delete tasks Description: Delete a central manager&#39;s tasks by central manager id. |
| [**guardiumConnectorGetAggregatorsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetAggregatorsConfig) | **GET** /api/v3/central_managers/{central_manager_id}/aggregators_config | Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database. |
| [**guardiumConnectorGetCMs**](GuardiumConnectorApi.md#guardiumConnectorGetCMs) | **GET** /api/v3/central_managers | Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing. |
| [**guardiumConnectorGetCMsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetCMsConfig) | **GET** /api/v3/central_managers_config | Summary: Get CMs config Description: Return a list of Central Managers from the tenant database. |
| [**guardiumConnectorGetCollectorsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetCollectorsConfig) | **GET** /api/v3/central_managers/{central_manager_id}/collectors_config | Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database. |
| [**guardiumConnectorGetDatamarts**](GuardiumConnectorApi.md#guardiumConnectorGetDatamarts) | **GET** /api/v3/central_managers/{central_manager_id}/datamarts | Description: returns full list of supported datamarts including type (historical or non-historical) |
| [**guardiumConnectorGetDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorGetDmExclusion) | **GET** /api/v3/datamarts/exclusion_list | Summary: Get DM exclusion Description: Return datamarts in the exclusion list. |
| [**guardiumConnectorGetGdpPolicyInfo**](GuardiumConnectorApi.md#guardiumConnectorGetGdpPolicyInfo) | **GET** /api/v3/central_managers/{central_manager_id}/policies/info | Summary: Get guardium policy definition Description: returns the policy definition on the cm |
| [**guardiumConnectorGetGdpPolicySummaries**](GuardiumConnectorApi.md#guardiumConnectorGetGdpPolicySummaries) | **GET** /api/v3/central_managers/{central_manager_id}/policies/summaries | Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager |
| [**guardiumConnectorGetHealthInfo**](GuardiumConnectorApi.md#guardiumConnectorGetHealthInfo) | **GET** /api/v3/central_managers/{central_manager_id}/health_info | Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers. |
| [**guardiumConnectorGetLatestDMExtractionProfile**](GuardiumConnectorApi.md#guardiumConnectorGetLatestDMExtractionProfile) | **GET** /api/v3/central_managers/{central_manager_id}/datamart_extraction_profile | Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium Insights. |
| [**guardiumConnectorGetStreamingStatus**](GuardiumConnectorApi.md#guardiumConnectorGetStreamingStatus) | **GET** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Get streaming status Description: Return the streaming configuration. |
| [**guardiumConnectorGetSyncDMs**](GuardiumConnectorApi.md#guardiumConnectorGetSyncDMs) | **GET** /api/v3/central_managers/{central_manager_id}/sync | Summary: Get sync DMs Description: Return the list of tasks from a central manager. |
| [**guardiumConnectorGetTaskTypes**](GuardiumConnectorApi.md#guardiumConnectorGetTaskTypes) | **GET** /api/v3/central_managers/task_types | Summary: Get task types Description: Return the list of supported task types. |
| [**guardiumConnectorGetTasks**](GuardiumConnectorApi.md#guardiumConnectorGetTasks) | **GET** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Get tasks Description: Return the list of tasks from a central manager. |
| [**guardiumConnectorRunGDPReport**](GuardiumConnectorApi.md#guardiumConnectorRunGDPReport) | **POST** /api/v3/central_managers/{central_manager_id}/run_report | Summary: Run GDP report Description: Run GDP report. |
| [**guardiumConnectorSetupCM**](GuardiumConnectorApi.md#guardiumConnectorSetupCM) | **POST** /api/v3/central_managers/setup | Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium Insights. |
| [**guardiumConnectorSetupDatamarts**](GuardiumConnectorApi.md#guardiumConnectorSetupDatamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts/setup | Description: setup custom datamart execution mode |
| [**guardiumConnectorTaskError**](GuardiumConnectorApi.md#guardiumConnectorTaskError) | **POST** /api/v3/central_managers/{central_manager_id}/tasks/error | Summary: Task error Description: Log error messages from GDP task execution. |
| [**guardiumConnectorTestDatabaseConnection**](GuardiumConnectorApi.md#guardiumConnectorTestDatabaseConnection) | **POST** /api/v3/test_database | Summary: Test database connection Description: Return database connection results. |
| [**guardiumConnectorUpdateDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorUpdateDmExclusion) | **PUT** /api/v3/datamarts/exclusion_list | Summary: Update DM exclusion Description: Update the atamart exclusion list. |
| [**guardiumConnectorUpdateStreaming**](GuardiumConnectorApi.md#guardiumConnectorUpdateStreaming) | **PUT** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Update streaming Description: Update streaming status into GI. |
| [**guardiumConnectorUpdateTask**](GuardiumConnectorApi.md#guardiumConnectorUpdateTask) | **PUT** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Update task Description: Update a task that gets executed on GDP. |


<a id="guardiumConnectorAddCM"></a>
# **guardiumConnectorAddCM**
> Guardiumconnectorv3AddCMResponse guardiumConnectorAddCM(guardiumconnectorv3AddCMRequest)

Summary: Add CM Description: Add a Central Manager to the tenant database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    Guardiumconnectorv3AddCMRequest guardiumconnectorv3AddCMRequest = new Guardiumconnectorv3AddCMRequest(); // Guardiumconnectorv3AddCMRequest | 
    try {
      Guardiumconnectorv3AddCMResponse result = apiInstance.guardiumConnectorAddCM(guardiumconnectorv3AddCMRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorAddCM");
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
| **guardiumconnectorv3AddCMRequest** | [**Guardiumconnectorv3AddCMRequest**](Guardiumconnectorv3AddCMRequest.md)|  | |

### Return type

[**Guardiumconnectorv3AddCMResponse**](Guardiumconnectorv3AddCMResponse.md)

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

<a id="guardiumConnectorAddDatamarts"></a>
# **guardiumConnectorAddDatamarts**
> Guardiumconnectorv3AddDatamartsResponse guardiumConnectorAddDatamarts(centralManagerId, guardiumconnectorv3AddDatamartsRequest)

Description: stores datamarts details from GDP

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | central manager
    Guardiumconnectorv3AddDatamartsRequest guardiumconnectorv3AddDatamartsRequest = new Guardiumconnectorv3AddDatamartsRequest(); // Guardiumconnectorv3AddDatamartsRequest | 
    try {
      Guardiumconnectorv3AddDatamartsResponse result = apiInstance.guardiumConnectorAddDatamarts(centralManagerId, guardiumconnectorv3AddDatamartsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorAddDatamarts");
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
| **centralManagerId** | **String**| central manager | |
| **guardiumconnectorv3AddDatamartsRequest** | [**Guardiumconnectorv3AddDatamartsRequest**](Guardiumconnectorv3AddDatamartsRequest.md)|  | |

### Return type

[**Guardiumconnectorv3AddDatamartsResponse**](Guardiumconnectorv3AddDatamartsResponse.md)

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

<a id="guardiumConnectorAddDmExclusion"></a>
# **guardiumConnectorAddDmExclusion**
> Guardiumconnectorv3AddDmExclusionResponse guardiumConnectorAddDmExclusion(guardiumconnectorv3AddDmExclusionRequest)

Summary: Add DM exclusion Description: Add datamart to exclusion list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    Guardiumconnectorv3AddDmExclusionRequest guardiumconnectorv3AddDmExclusionRequest = new Guardiumconnectorv3AddDmExclusionRequest(); // Guardiumconnectorv3AddDmExclusionRequest | 
    try {
      Guardiumconnectorv3AddDmExclusionResponse result = apiInstance.guardiumConnectorAddDmExclusion(guardiumconnectorv3AddDmExclusionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorAddDmExclusion");
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
| **guardiumconnectorv3AddDmExclusionRequest** | [**Guardiumconnectorv3AddDmExclusionRequest**](Guardiumconnectorv3AddDmExclusionRequest.md)|  | |

### Return type

[**Guardiumconnectorv3AddDmExclusionResponse**](Guardiumconnectorv3AddDmExclusionResponse.md)

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

<a id="guardiumConnectorAddTask"></a>
# **guardiumConnectorAddTask**
> Guardiumconnectorv3AddTaskResponse guardiumConnectorAddTask(centralManagerId, guardiumconnectorv3AddTaskRequest)

Summary: Add task Description: Add a task to be executed on GDP.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    Guardiumconnectorv3AddTaskRequest guardiumconnectorv3AddTaskRequest = new Guardiumconnectorv3AddTaskRequest(); // Guardiumconnectorv3AddTaskRequest | 
    try {
      Guardiumconnectorv3AddTaskResponse result = apiInstance.guardiumConnectorAddTask(centralManagerId, guardiumconnectorv3AddTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorAddTask");
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
| **centralManagerId** | **String**| ID of central manager. | |
| **guardiumconnectorv3AddTaskRequest** | [**Guardiumconnectorv3AddTaskRequest**](Guardiumconnectorv3AddTaskRequest.md)|  | |

### Return type

[**Guardiumconnectorv3AddTaskResponse**](Guardiumconnectorv3AddTaskResponse.md)

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

<a id="guardiumConnectorBlockUser"></a>
# **guardiumConnectorBlockUser**
> Guardiumconnectorv3BlockUserResponse guardiumConnectorBlockUser(guardiumconnectorv3BlockUserRequest)

Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    Guardiumconnectorv3BlockUserRequest guardiumconnectorv3BlockUserRequest = new Guardiumconnectorv3BlockUserRequest(); // Guardiumconnectorv3BlockUserRequest | 
    try {
      Guardiumconnectorv3BlockUserResponse result = apiInstance.guardiumConnectorBlockUser(guardiumconnectorv3BlockUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorBlockUser");
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
| **guardiumconnectorv3BlockUserRequest** | [**Guardiumconnectorv3BlockUserRequest**](Guardiumconnectorv3BlockUserRequest.md)|  | |

### Return type

[**Guardiumconnectorv3BlockUserResponse**](Guardiumconnectorv3BlockUserResponse.md)

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

<a id="guardiumConnectorConfigureAggregatorExport"></a>
# **guardiumConnectorConfigureAggregatorExport**
> Guardiumconnectorv3ConfigureAggregatorExportResponse guardiumConnectorConfigureAggregatorExport(centralManagerId, guardiumconnectorv3ConfigureAggregatorExportRequest)

Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central Manager ID.
    Guardiumconnectorv3ConfigureAggregatorExportRequest guardiumconnectorv3ConfigureAggregatorExportRequest = new Guardiumconnectorv3ConfigureAggregatorExportRequest(); // Guardiumconnectorv3ConfigureAggregatorExportRequest | 
    try {
      Guardiumconnectorv3ConfigureAggregatorExportResponse result = apiInstance.guardiumConnectorConfigureAggregatorExport(centralManagerId, guardiumconnectorv3ConfigureAggregatorExportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorConfigureAggregatorExport");
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
| **centralManagerId** | **String**| Central Manager ID. | |
| **guardiumconnectorv3ConfigureAggregatorExportRequest** | [**Guardiumconnectorv3ConfigureAggregatorExportRequest**](Guardiumconnectorv3ConfigureAggregatorExportRequest.md)|  | |

### Return type

[**Guardiumconnectorv3ConfigureAggregatorExportResponse**](Guardiumconnectorv3ConfigureAggregatorExportResponse.md)

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

<a id="guardiumConnectorConfigureCollectorExport"></a>
# **guardiumConnectorConfigureCollectorExport**
> Guardiumconnectorv3ConfigureCollectorExportResponse guardiumConnectorConfigureCollectorExport(centralManagerId, guardiumconnectorv3ConfigureCollectorExportRequest)

Summary: Configure collector export Description: Schedule export historical data for collectors.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central Manager ID.
    Guardiumconnectorv3ConfigureCollectorExportRequest guardiumconnectorv3ConfigureCollectorExportRequest = new Guardiumconnectorv3ConfigureCollectorExportRequest(); // Guardiumconnectorv3ConfigureCollectorExportRequest | 
    try {
      Guardiumconnectorv3ConfigureCollectorExportResponse result = apiInstance.guardiumConnectorConfigureCollectorExport(centralManagerId, guardiumconnectorv3ConfigureCollectorExportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorConfigureCollectorExport");
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
| **centralManagerId** | **String**| Central Manager ID. | |
| **guardiumconnectorv3ConfigureCollectorExportRequest** | [**Guardiumconnectorv3ConfigureCollectorExportRequest**](Guardiumconnectorv3ConfigureCollectorExportRequest.md)|  | |

### Return type

[**Guardiumconnectorv3ConfigureCollectorExportResponse**](Guardiumconnectorv3ConfigureCollectorExportResponse.md)

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

<a id="guardiumConnectorConfigureStreaming"></a>
# **guardiumConnectorConfigureStreaming**
> Guardiumconnectorv3ConfigureStreamingResponse guardiumConnectorConfigureStreaming(centralManagerId, guardiumconnectorv3ConfigureStreamingRequest)

Summary: Configure streaming Description: Enable or disable streaming.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central Manager ID.
    Guardiumconnectorv3ConfigureStreamingRequest guardiumconnectorv3ConfigureStreamingRequest = new Guardiumconnectorv3ConfigureStreamingRequest(); // Guardiumconnectorv3ConfigureStreamingRequest | 
    try {
      Guardiumconnectorv3ConfigureStreamingResponse result = apiInstance.guardiumConnectorConfigureStreaming(centralManagerId, guardiumconnectorv3ConfigureStreamingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorConfigureStreaming");
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
| **centralManagerId** | **String**| Central Manager ID. | |
| **guardiumconnectorv3ConfigureStreamingRequest** | [**Guardiumconnectorv3ConfigureStreamingRequest**](Guardiumconnectorv3ConfigureStreamingRequest.md)|  | |

### Return type

[**Guardiumconnectorv3ConfigureStreamingResponse**](Guardiumconnectorv3ConfigureStreamingResponse.md)

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

<a id="guardiumConnectorDatamartVersionCheck"></a>
# **guardiumConnectorDatamartVersionCheck**
> Guardiumconnectorv3DatamartVersionResponse guardiumConnectorDatamartVersionCheck(centralManagerId, guardiumconnectorv3DatamartVersionRequest)

Description: validates if central manager has datamart support for event model

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central manager
    Guardiumconnectorv3DatamartVersionRequest guardiumconnectorv3DatamartVersionRequest = new Guardiumconnectorv3DatamartVersionRequest(); // Guardiumconnectorv3DatamartVersionRequest | 
    try {
      Guardiumconnectorv3DatamartVersionResponse result = apiInstance.guardiumConnectorDatamartVersionCheck(centralManagerId, guardiumconnectorv3DatamartVersionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorDatamartVersionCheck");
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
| **centralManagerId** | **String**| Central manager | |
| **guardiumconnectorv3DatamartVersionRequest** | [**Guardiumconnectorv3DatamartVersionRequest**](Guardiumconnectorv3DatamartVersionRequest.md)|  | |

### Return type

[**Guardiumconnectorv3DatamartVersionResponse**](Guardiumconnectorv3DatamartVersionResponse.md)

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

<a id="guardiumConnectorDeleteCM"></a>
# **guardiumConnectorDeleteCM**
> Guardiumconnectorv3DeleteCMResponse guardiumConnectorDeleteCM(centralManagerId, force)

Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central Manager ID.
    Integer force = 56; // Integer | Flag to force delete CM and associated tasks (0=validate CM is online before deleting, 1=force delete CM).
    try {
      Guardiumconnectorv3DeleteCMResponse result = apiInstance.guardiumConnectorDeleteCM(centralManagerId, force);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorDeleteCM");
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
| **centralManagerId** | **String**| Central Manager ID. | |
| **force** | **Integer**| Flag to force delete CM and associated tasks (0&#x3D;validate CM is online before deleting, 1&#x3D;force delete CM). | [optional] |

### Return type

[**Guardiumconnectorv3DeleteCMResponse**](Guardiumconnectorv3DeleteCMResponse.md)

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

<a id="guardiumConnectorDeleteDmExclusion"></a>
# **guardiumConnectorDeleteDmExclusion**
> Guardiumconnectorv3DeleteDmExclusionResponse guardiumConnectorDeleteDmExclusion(datamart)

Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String datamart = "datamart_example"; // String | Datamart name.
    try {
      Guardiumconnectorv3DeleteDmExclusionResponse result = apiInstance.guardiumConnectorDeleteDmExclusion(datamart);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorDeleteDmExclusion");
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
| **datamart** | **String**| Datamart name. | [optional] |

### Return type

[**Guardiumconnectorv3DeleteDmExclusionResponse**](Guardiumconnectorv3DeleteDmExclusionResponse.md)

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

<a id="guardiumConnectorDeleteTask"></a>
# **guardiumConnectorDeleteTask**
> Guardiumconnectorv3DeleteTaskResponse guardiumConnectorDeleteTask(centralManagerId, taskId)

Summary: Delete task Description: Delete a task by central manager id and task id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    String taskId = "taskId_example"; // String | ID of task being deleted.
    try {
      Guardiumconnectorv3DeleteTaskResponse result = apiInstance.guardiumConnectorDeleteTask(centralManagerId, taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorDeleteTask");
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
| **centralManagerId** | **String**| ID of central manager. | |
| **taskId** | **String**| ID of task being deleted. | |

### Return type

[**Guardiumconnectorv3DeleteTaskResponse**](Guardiumconnectorv3DeleteTaskResponse.md)

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

<a id="guardiumConnectorDeleteTasks"></a>
# **guardiumConnectorDeleteTasks**
> Guardiumconnectorv3DeleteTasksResponse guardiumConnectorDeleteTasks(centralManagerId)

Summary: Delete tasks Description: Delete a central manager&#39;s tasks by central manager id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    try {
      Guardiumconnectorv3DeleteTasksResponse result = apiInstance.guardiumConnectorDeleteTasks(centralManagerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorDeleteTasks");
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
| **centralManagerId** | **String**| ID of central manager. | |

### Return type

[**Guardiumconnectorv3DeleteTasksResponse**](Guardiumconnectorv3DeleteTasksResponse.md)

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

<a id="guardiumConnectorGetAggregatorsConfig"></a>
# **guardiumConnectorGetAggregatorsConfig**
> Guardiumconnectorv3GetAggregatorsConfigResponse guardiumConnectorGetAggregatorsConfig(centralManagerId)

Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central Manager ID.
    try {
      Guardiumconnectorv3GetAggregatorsConfigResponse result = apiInstance.guardiumConnectorGetAggregatorsConfig(centralManagerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetAggregatorsConfig");
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
| **centralManagerId** | **String**| Central Manager ID. | |

### Return type

[**Guardiumconnectorv3GetAggregatorsConfigResponse**](Guardiumconnectorv3GetAggregatorsConfigResponse.md)

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

<a id="guardiumConnectorGetCMs"></a>
# **guardiumConnectorGetCMs**
> Guardiumconnectorv3GetCMsResponse guardiumConnectorGetCMs(runAdditionalChecks)

Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    Boolean runAdditionalChecks = true; // Boolean | Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager.
    try {
      Guardiumconnectorv3GetCMsResponse result = apiInstance.guardiumConnectorGetCMs(runAdditionalChecks);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetCMs");
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
| **runAdditionalChecks** | **Boolean**| Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager. | [optional] |

### Return type

[**Guardiumconnectorv3GetCMsResponse**](Guardiumconnectorv3GetCMsResponse.md)

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

<a id="guardiumConnectorGetCMsConfig"></a>
# **guardiumConnectorGetCMsConfig**
> Guardiumconnectorv3GetCMsConfigResponse guardiumConnectorGetCMsConfig()

Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    try {
      Guardiumconnectorv3GetCMsConfigResponse result = apiInstance.guardiumConnectorGetCMsConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetCMsConfig");
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

[**Guardiumconnectorv3GetCMsConfigResponse**](Guardiumconnectorv3GetCMsConfigResponse.md)

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

<a id="guardiumConnectorGetCollectorsConfig"></a>
# **guardiumConnectorGetCollectorsConfig**
> Guardiumconnectorv3GetCollectorsConfigResponse guardiumConnectorGetCollectorsConfig(centralManagerId)

Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central Manager ID.
    try {
      Guardiumconnectorv3GetCollectorsConfigResponse result = apiInstance.guardiumConnectorGetCollectorsConfig(centralManagerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetCollectorsConfig");
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
| **centralManagerId** | **String**| Central Manager ID. | |

### Return type

[**Guardiumconnectorv3GetCollectorsConfigResponse**](Guardiumconnectorv3GetCollectorsConfigResponse.md)

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

<a id="guardiumConnectorGetDatamarts"></a>
# **guardiumConnectorGetDatamarts**
> Guardiumconnectorv3GetDatamartsResponse guardiumConnectorGetDatamarts(centralManagerId)

Description: returns full list of supported datamarts including type (historical or non-historical)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | central manager hostname
    try {
      Guardiumconnectorv3GetDatamartsResponse result = apiInstance.guardiumConnectorGetDatamarts(centralManagerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetDatamarts");
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
| **centralManagerId** | **String**| central manager hostname | |

### Return type

[**Guardiumconnectorv3GetDatamartsResponse**](Guardiumconnectorv3GetDatamartsResponse.md)

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

<a id="guardiumConnectorGetDmExclusion"></a>
# **guardiumConnectorGetDmExclusion**
> Guardiumconnectorv3GetDmExclusionResponse guardiumConnectorGetDmExclusion()

Summary: Get DM exclusion Description: Return datamarts in the exclusion list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    try {
      Guardiumconnectorv3GetDmExclusionResponse result = apiInstance.guardiumConnectorGetDmExclusion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetDmExclusion");
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

[**Guardiumconnectorv3GetDmExclusionResponse**](Guardiumconnectorv3GetDmExclusionResponse.md)

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

<a id="guardiumConnectorGetGdpPolicyInfo"></a>
# **guardiumConnectorGetGdpPolicyInfo**
> Guardiumconnectorv3GetPolicyInfoResponse guardiumConnectorGetGdpPolicyInfo(centralManagerId, policyName)

Summary: Get guardium policy definition Description: returns the policy definition on the cm

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central manager hostname
    String policyName = "policyName_example"; // String | Policy name.
    try {
      Guardiumconnectorv3GetPolicyInfoResponse result = apiInstance.guardiumConnectorGetGdpPolicyInfo(centralManagerId, policyName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetGdpPolicyInfo");
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
| **centralManagerId** | **String**| Central manager hostname | |
| **policyName** | **String**| Policy name. | [optional] |

### Return type

[**Guardiumconnectorv3GetPolicyInfoResponse**](Guardiumconnectorv3GetPolicyInfoResponse.md)

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

<a id="guardiumConnectorGetGdpPolicySummaries"></a>
# **guardiumConnectorGetGdpPolicySummaries**
> Guardiumconnectorv3GetPolicySummariesResponse guardiumConnectorGetGdpPolicySummaries(centralManagerId)

Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central manager hostname
    try {
      Guardiumconnectorv3GetPolicySummariesResponse result = apiInstance.guardiumConnectorGetGdpPolicySummaries(centralManagerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetGdpPolicySummaries");
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
| **centralManagerId** | **String**| Central manager hostname | |

### Return type

[**Guardiumconnectorv3GetPolicySummariesResponse**](Guardiumconnectorv3GetPolicySummariesResponse.md)

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

<a id="guardiumConnectorGetHealthInfo"></a>
# **guardiumConnectorGetHealthInfo**
> Guardiumconnectorv3GetHealthInfoResponse guardiumConnectorGetHealthInfo(centralManagerId, useFallback)

Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central Manager ID.
    Boolean useFallback = true; // Boolean | Flag indicating if the older gdp api is to be called in case it doesn't support new api.
    try {
      Guardiumconnectorv3GetHealthInfoResponse result = apiInstance.guardiumConnectorGetHealthInfo(centralManagerId, useFallback);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetHealthInfo");
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
| **centralManagerId** | **String**| Central Manager ID. | |
| **useFallback** | **Boolean**| Flag indicating if the older gdp api is to be called in case it doesn&#39;t support new api. | [optional] |

### Return type

[**Guardiumconnectorv3GetHealthInfoResponse**](Guardiumconnectorv3GetHealthInfoResponse.md)

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

<a id="guardiumConnectorGetLatestDMExtractionProfile"></a>
# **guardiumConnectorGetLatestDMExtractionProfile**
> Guardiumconnectorv3GetLatestDMExtractionProfileResponse guardiumConnectorGetLatestDMExtractionProfile(centralManagerId)

Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium Insights.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central Manager ID.
    try {
      Guardiumconnectorv3GetLatestDMExtractionProfileResponse result = apiInstance.guardiumConnectorGetLatestDMExtractionProfile(centralManagerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetLatestDMExtractionProfile");
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
| **centralManagerId** | **String**| Central Manager ID. | |

### Return type

[**Guardiumconnectorv3GetLatestDMExtractionProfileResponse**](Guardiumconnectorv3GetLatestDMExtractionProfileResponse.md)

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

<a id="guardiumConnectorGetStreamingStatus"></a>
# **guardiumConnectorGetStreamingStatus**
> Guardiumconnectorv3GetStreamingStatusResponse guardiumConnectorGetStreamingStatus(centralManagerId)

Summary: Get streaming status Description: Return the streaming configuration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central Manager ID.
    try {
      Guardiumconnectorv3GetStreamingStatusResponse result = apiInstance.guardiumConnectorGetStreamingStatus(centralManagerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetStreamingStatus");
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
| **centralManagerId** | **String**| Central Manager ID. | |

### Return type

[**Guardiumconnectorv3GetStreamingStatusResponse**](Guardiumconnectorv3GetStreamingStatusResponse.md)

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

<a id="guardiumConnectorGetSyncDMs"></a>
# **guardiumConnectorGetSyncDMs**
> Guardiumconnectorv3GetSyncDMsResponse guardiumConnectorGetSyncDMs(centralManagerId)

Summary: Get sync DMs Description: Return the list of tasks from a central manager.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    try {
      Guardiumconnectorv3GetSyncDMsResponse result = apiInstance.guardiumConnectorGetSyncDMs(centralManagerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetSyncDMs");
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
| **centralManagerId** | **String**| ID of central manager. | |

### Return type

[**Guardiumconnectorv3GetSyncDMsResponse**](Guardiumconnectorv3GetSyncDMsResponse.md)

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

<a id="guardiumConnectorGetTaskTypes"></a>
# **guardiumConnectorGetTaskTypes**
> Guardiumconnectorv3GetTaskTypesResponse guardiumConnectorGetTaskTypes()

Summary: Get task types Description: Return the list of supported task types.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    try {
      Guardiumconnectorv3GetTaskTypesResponse result = apiInstance.guardiumConnectorGetTaskTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetTaskTypes");
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

[**Guardiumconnectorv3GetTaskTypesResponse**](Guardiumconnectorv3GetTaskTypesResponse.md)

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

<a id="guardiumConnectorGetTasks"></a>
# **guardiumConnectorGetTasks**
> Guardiumconnectorv3GetTasksResponse guardiumConnectorGetTasks(centralManagerId, taskId, taskType, keyObject)

Summary: Get tasks Description: Return the list of tasks from a central manager.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    String taskId = "taskId_example"; // String | ID of task.
    String taskType = "taskType_example"; // String | Type of task.
    String keyObject = "keyObject_example"; // String | Key object.
    try {
      Guardiumconnectorv3GetTasksResponse result = apiInstance.guardiumConnectorGetTasks(centralManagerId, taskId, taskType, keyObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorGetTasks");
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
| **centralManagerId** | **String**| ID of central manager. | |
| **taskId** | **String**| ID of task. | [optional] |
| **taskType** | **String**| Type of task. | [optional] |
| **keyObject** | **String**| Key object. | [optional] |

### Return type

[**Guardiumconnectorv3GetTasksResponse**](Guardiumconnectorv3GetTasksResponse.md)

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

<a id="guardiumConnectorRunGDPReport"></a>
# **guardiumConnectorRunGDPReport**
> Guardiumconnectorv3RunGDPReportResponse guardiumConnectorRunGDPReport(centralManagerId, guardiumconnectorv3RunGDPReportRequest)

Summary: Run GDP report Description: Run GDP report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central Manager ID.
    Guardiumconnectorv3RunGDPReportRequest guardiumconnectorv3RunGDPReportRequest = new Guardiumconnectorv3RunGDPReportRequest(); // Guardiumconnectorv3RunGDPReportRequest | 
    try {
      Guardiumconnectorv3RunGDPReportResponse result = apiInstance.guardiumConnectorRunGDPReport(centralManagerId, guardiumconnectorv3RunGDPReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorRunGDPReport");
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
| **centralManagerId** | **String**| Central Manager ID. | |
| **guardiumconnectorv3RunGDPReportRequest** | [**Guardiumconnectorv3RunGDPReportRequest**](Guardiumconnectorv3RunGDPReportRequest.md)|  | |

### Return type

[**Guardiumconnectorv3RunGDPReportResponse**](Guardiumconnectorv3RunGDPReportResponse.md)

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

<a id="guardiumConnectorSetupCM"></a>
# **guardiumConnectorSetupCM**
> Guardiumconnectorv3SetupCMResponse guardiumConnectorSetupCM(guardiumconnectorv3SetupCMRequest)

Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium Insights.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    Guardiumconnectorv3SetupCMRequest guardiumconnectorv3SetupCMRequest = new Guardiumconnectorv3SetupCMRequest(); // Guardiumconnectorv3SetupCMRequest | 
    try {
      Guardiumconnectorv3SetupCMResponse result = apiInstance.guardiumConnectorSetupCM(guardiumconnectorv3SetupCMRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorSetupCM");
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
| **guardiumconnectorv3SetupCMRequest** | [**Guardiumconnectorv3SetupCMRequest**](Guardiumconnectorv3SetupCMRequest.md)|  | |

### Return type

[**Guardiumconnectorv3SetupCMResponse**](Guardiumconnectorv3SetupCMResponse.md)

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

<a id="guardiumConnectorSetupDatamarts"></a>
# **guardiumConnectorSetupDatamarts**
> Guardiumconnectorv3SetupDatamartsResponse guardiumConnectorSetupDatamarts(centralManagerId, guardiumconnectorv3SetupDatamartsRequest)

Description: setup custom datamart execution mode

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | central manager
    Guardiumconnectorv3SetupDatamartsRequest guardiumconnectorv3SetupDatamartsRequest = new Guardiumconnectorv3SetupDatamartsRequest(); // Guardiumconnectorv3SetupDatamartsRequest | 
    try {
      Guardiumconnectorv3SetupDatamartsResponse result = apiInstance.guardiumConnectorSetupDatamarts(centralManagerId, guardiumconnectorv3SetupDatamartsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorSetupDatamarts");
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
| **centralManagerId** | **String**| central manager | |
| **guardiumconnectorv3SetupDatamartsRequest** | [**Guardiumconnectorv3SetupDatamartsRequest**](Guardiumconnectorv3SetupDatamartsRequest.md)|  | |

### Return type

[**Guardiumconnectorv3SetupDatamartsResponse**](Guardiumconnectorv3SetupDatamartsResponse.md)

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

<a id="guardiumConnectorTaskError"></a>
# **guardiumConnectorTaskError**
> Guardiumconnectorv3TaskErrorResponse guardiumConnectorTaskError(centralManagerId, guardiumconnectorv3TaskErrorRequest)

Summary: Task error Description: Log error messages from GDP task execution.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    Guardiumconnectorv3TaskErrorRequest guardiumconnectorv3TaskErrorRequest = new Guardiumconnectorv3TaskErrorRequest(); // Guardiumconnectorv3TaskErrorRequest | 
    try {
      Guardiumconnectorv3TaskErrorResponse result = apiInstance.guardiumConnectorTaskError(centralManagerId, guardiumconnectorv3TaskErrorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorTaskError");
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
| **centralManagerId** | **String**| ID of central manager. | |
| **guardiumconnectorv3TaskErrorRequest** | [**Guardiumconnectorv3TaskErrorRequest**](Guardiumconnectorv3TaskErrorRequest.md)|  | |

### Return type

[**Guardiumconnectorv3TaskErrorResponse**](Guardiumconnectorv3TaskErrorResponse.md)

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

<a id="guardiumConnectorTestDatabaseConnection"></a>
# **guardiumConnectorTestDatabaseConnection**
> Guardiumconnectorv3DatabaseResultResponse guardiumConnectorTestDatabaseConnection(guardiumconnectorv3DatabaseConnectionStringRequest)

Summary: Test database connection Description: Return database connection results.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    Guardiumconnectorv3DatabaseConnectionStringRequest guardiumconnectorv3DatabaseConnectionStringRequest = new Guardiumconnectorv3DatabaseConnectionStringRequest(); // Guardiumconnectorv3DatabaseConnectionStringRequest | 
    try {
      Guardiumconnectorv3DatabaseResultResponse result = apiInstance.guardiumConnectorTestDatabaseConnection(guardiumconnectorv3DatabaseConnectionStringRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorTestDatabaseConnection");
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
| **guardiumconnectorv3DatabaseConnectionStringRequest** | [**Guardiumconnectorv3DatabaseConnectionStringRequest**](Guardiumconnectorv3DatabaseConnectionStringRequest.md)|  | |

### Return type

[**Guardiumconnectorv3DatabaseResultResponse**](Guardiumconnectorv3DatabaseResultResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="guardiumConnectorUpdateDmExclusion"></a>
# **guardiumConnectorUpdateDmExclusion**
> Guardiumconnectorv3UpdateDmExclusionResponse guardiumConnectorUpdateDmExclusion(guardiumconnectorv3UpdateDmExclusionRequest)

Summary: Update DM exclusion Description: Update the atamart exclusion list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    Guardiumconnectorv3UpdateDmExclusionRequest guardiumconnectorv3UpdateDmExclusionRequest = new Guardiumconnectorv3UpdateDmExclusionRequest(); // Guardiumconnectorv3UpdateDmExclusionRequest | 
    try {
      Guardiumconnectorv3UpdateDmExclusionResponse result = apiInstance.guardiumConnectorUpdateDmExclusion(guardiumconnectorv3UpdateDmExclusionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorUpdateDmExclusion");
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
| **guardiumconnectorv3UpdateDmExclusionRequest** | [**Guardiumconnectorv3UpdateDmExclusionRequest**](Guardiumconnectorv3UpdateDmExclusionRequest.md)|  | |

### Return type

[**Guardiumconnectorv3UpdateDmExclusionResponse**](Guardiumconnectorv3UpdateDmExclusionResponse.md)

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

<a id="guardiumConnectorUpdateStreaming"></a>
# **guardiumConnectorUpdateStreaming**
> Guardiumconnectorv3UpdateStreamingResponse guardiumConnectorUpdateStreaming(centralManagerId, guardiumconnectorv3UpdateStreamingRequest)

Summary: Update streaming Description: Update streaming status into GI.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    Guardiumconnectorv3UpdateStreamingRequest guardiumconnectorv3UpdateStreamingRequest = new Guardiumconnectorv3UpdateStreamingRequest(); // Guardiumconnectorv3UpdateStreamingRequest | 
    try {
      Guardiumconnectorv3UpdateStreamingResponse result = apiInstance.guardiumConnectorUpdateStreaming(centralManagerId, guardiumconnectorv3UpdateStreamingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorUpdateStreaming");
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
| **centralManagerId** | **String**| ID of central manager. | |
| **guardiumconnectorv3UpdateStreamingRequest** | [**Guardiumconnectorv3UpdateStreamingRequest**](Guardiumconnectorv3UpdateStreamingRequest.md)|  | |

### Return type

[**Guardiumconnectorv3UpdateStreamingResponse**](Guardiumconnectorv3UpdateStreamingResponse.md)

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

<a id="guardiumConnectorUpdateTask"></a>
# **guardiumConnectorUpdateTask**
> Guardiumconnectorv3UpdateTaskResponse guardiumConnectorUpdateTask(centralManagerId, taskId, guardiumconnectorv3UpdateTaskRequest)

Summary: Update task Description: Update a task that gets executed on GDP.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuardiumConnectorApi;

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

    GuardiumConnectorApi apiInstance = new GuardiumConnectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    String taskId = "taskId_example"; // String | ID of task being updated.
    Guardiumconnectorv3UpdateTaskRequest guardiumconnectorv3UpdateTaskRequest = new Guardiumconnectorv3UpdateTaskRequest(); // Guardiumconnectorv3UpdateTaskRequest | 
    try {
      Guardiumconnectorv3UpdateTaskResponse result = apiInstance.guardiumConnectorUpdateTask(centralManagerId, taskId, guardiumconnectorv3UpdateTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuardiumConnectorApi#guardiumConnectorUpdateTask");
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
| **centralManagerId** | **String**| ID of central manager. | |
| **taskId** | **String**| ID of task being updated. | |
| **guardiumconnectorv3UpdateTaskRequest** | [**Guardiumconnectorv3UpdateTaskRequest**](Guardiumconnectorv3UpdateTaskRequest.md)|  | |

### Return type

[**Guardiumconnectorv3UpdateTaskResponse**](Guardiumconnectorv3UpdateTaskResponse.md)

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

