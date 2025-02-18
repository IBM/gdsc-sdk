# ResourceControllerK8ServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resourceControllerK8ServiceCreateController**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateController) | **POST** /api/v3/app_manager/controllers | CreateController - Add a new controller. |
| [**resourceControllerK8ServiceCreateHeartBeat**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateHeartBeat) | **POST** /api/v3/app_manager/controllers/{controller_id}/heartbeat | CreateHeartBeat - Create a heartbeat for the controller. |
| [**resourceControllerK8ServiceCreateHeartBeatEx**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateHeartBeatEx) | **POST** /api/v3/app_manager/controllers/{controller_id}/heartbeat_ex | CreateHeartBeatEx - Create a heartbeat for the controller with extended information. |
| [**resourceControllerK8ServiceCreateJob**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateJob) | **POST** /api/v3/app_manager/jobs | //////////////////////////////////////////////////////////////// Interface to the controllers and apps api in the App-Manager microservice CreateJob - Create a job definition. Files and secrets contained within will also be created. |
| [**resourceControllerK8ServiceCreateJobExecution**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateJobExecution) | **POST** /api/v3/app_manager/job_executions | CreateJobExecution - Create a job execution. |
| [**resourceControllerK8ServiceCreateKeypair**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateKeypair) | **POST** /api/v3/app_manager/controllers/{controller_id}/keypair | CreateKeypair - Create a new keypair for the controller. |
| [**resourceControllerK8ServiceDeleteController**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceDeleteController) | **DELETE** /api/v3/app_manager/controllers/{controller_id} | DeleteController - Delete a controller. |
| [**resourceControllerK8ServiceDeleteEdgeTenant**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceDeleteEdgeTenant) | **DELETE** /api/v3/app_manager/tenants/{tenant_id} | DeleteEdgeTenant - deletes an edge tenant providing edge tenant id |
| [**resourceControllerK8ServiceDeleteEdgeTenantRequest**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceDeleteEdgeTenantRequest) | **DELETE** /api/v3/edgegateways/{tenant_id} | DeleteEdgeTenantRequest to deletes gi and tnt CR on edge |
| [**resourceControllerK8ServiceDeleteJob**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceDeleteJob) | **DELETE** /api/v3/app_manager/jobs/{job_id} | DeleteJob - Delete a job. |
| [**resourceControllerK8ServiceDownloadControllerLogs**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceDownloadControllerLogs) | **POST** /api/v3/app_manager/controllers/{controller_id}/logs | DownloadControllerLogs - Download the controller logs for a running controller. |
| [**resourceControllerK8ServiceGetControllerApps**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllerApps) | **GET** /api/v3/app_manager/controllers/{controller_id}/apps | GetControllerApps - Get the apps for the given controller. |
| [**resourceControllerK8ServiceGetControllerCommands**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllerCommands) | **GET** /api/v3/app_manager/controllers/{controller_id}/commands | GetControllerCommands - Get the commands for the controller to execute. |
| [**resourceControllerK8ServiceGetControllerJobs**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllerJobs) | **GET** /api/v3/app_manager/controllers/{controller_id}/jobs | GetControllerJobs - Get the jobs for the controller to execute. |
| [**resourceControllerK8ServiceGetControllerStatus**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllerStatus) | **GET** /api/v3/app_manager/controllers/{controller_id}/status | GetControllerStatus - Get the status for the given controller. |
| [**resourceControllerK8ServiceGetControllers**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllers) | **GET** /api/v3/app_manager/tenants/{tenant_id}/controllers | GetControllers - Get the controllers for the given tenant. |
| [**resourceControllerK8ServiceGetControllersWithStatus**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllersWithStatus) | **GET** /api/v3/app_manager/tenants/{tenant_id}/controller_status | GetControllersWithStatus - Get the controllers for the given tenant with computed status. |
| [**resourceControllerK8ServiceGetJob**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetJob) | **GET** /api/v3/app_manager/jobs/{job_id} | GetJob - Get the job. |
| [**resourceControllerK8ServiceGetJobExecution**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetJobExecution) | **GET** /api/v3/app_manager/job_executions/{jobexe_id} | GetJobExecution - Get a job execution. |
| [**resourceControllerK8ServiceGetJobExecutions**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetJobExecutions) | **GET** /api/v3/app_manager/jobs/{job_id}/executions | GetJobExecutions - Get the job executions. |
| [**resourceControllerK8ServiceGetJobStatus**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetJobStatus) | **GET** /api/v3/app_manager/jobs/{job_id}/status | GetJobStatus - Get the job&#39;s status. |
| [**resourceControllerK8ServiceGetTenantApp**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetTenantApp) | **GET** /api/v3/app_manager/tenants/{tenant_id}/apps/{app_name} | GetTenantApp - Get a specific app for the given tenant. |
| [**resourceControllerK8ServiceGetTenantApps**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetTenantApps) | **GET** /api/v3/app_manager/tenants/{tenant_id}/apps | GetTenantApps - Get the apps for the given tenant. |
| [**resourceControllerK8ServiceGetTenantJobs**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetTenantJobs) | **GET** /api/v3/app_manager/tenants/{tenant_id}/jobs | GetTenantJobs - Get jobs for the given tenant. |
| [**resourceControllerK8ServiceGetVersion**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetVersion) | **GET** /api/v3/app_manager/system/version | GetVersion - Get the system version information for the service. |
| [**resourceControllerK8ServiceInstallEdgeTenantRequest**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceInstallEdgeTenantRequest) | **POST** /api/v3/edgegateways | InstallEdgeTenantRequest to Create/update gi and tnt CRs on edge |
| [**resourceControllerK8ServiceQueryControllerLogs**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceQueryControllerLogs) | **POST** /api/v3/app_manager/controllers/{controller_id}/logs/query | QueryControllerLogs - Query for the controller logs for a running controller. |
| [**resourceControllerK8ServiceUpdateCommand**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateCommand) | **PUT** /api/v3/app_manager/commands/{id} | UpdateCommand - Update the command. |
| [**resourceControllerK8ServiceUpdateController**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateController) | **PUT** /api/v3/app_manager/controllers/{id} | UpdateController - Update an existing controller. |
| [**resourceControllerK8ServiceUpdateControllerStatus**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateControllerStatus) | **PUT** /api/v3/app_manager/controllers/{id}/status | UpdateControllerStatus - Updates the status for the given controller. |
| [**resourceControllerK8ServiceUpdateJob**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateJob) | **PUT** /api/v3/app_manager/jobs/{id} | UpdateJob - Update a job. |
| [**resourceControllerK8ServiceUpdateJobExecution**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateJobExecution) | **PUT** /api/v3/app_manager/job_executions/{id} | UpdateJobExecution - Update a job execution. |
| [**resourceControllerK8ServiceUpdateJobStatus**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateJobStatus) | **PUT** /api/v3/app_manager/jobs/{job_id}/status | UpdateJobStatus - Updates the status for the given Job. |


<a id="resourceControllerK8ServiceCreateController"></a>
# **resourceControllerK8ServiceCreateController**
> Resourcecontrollerk8v3Controller resourceControllerK8ServiceCreateController(resourcecontrollerk8v3CreateControllerRequest)

CreateController - Add a new controller.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    Resourcecontrollerk8v3CreateControllerRequest resourcecontrollerk8v3CreateControllerRequest = new Resourcecontrollerk8v3CreateControllerRequest(); // Resourcecontrollerk8v3CreateControllerRequest | 
    try {
      Resourcecontrollerk8v3Controller result = apiInstance.resourceControllerK8ServiceCreateController(resourcecontrollerk8v3CreateControllerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceCreateController");
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
| **resourcecontrollerk8v3CreateControllerRequest** | [**Resourcecontrollerk8v3CreateControllerRequest**](Resourcecontrollerk8v3CreateControllerRequest.md)|  | |

### Return type

[**Resourcecontrollerk8v3Controller**](Resourcecontrollerk8v3Controller.md)

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

<a id="resourceControllerK8ServiceCreateHeartBeat"></a>
# **resourceControllerK8ServiceCreateHeartBeat**
> Resourcecontrollerk8v3CreateHeartBeatResponse resourceControllerK8ServiceCreateHeartBeat(controllerId, resourcecontrollerk8v3CreateHeartBeatRequest)

CreateHeartBeat - Create a heartbeat for the controller.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String controllerId = "controllerId_example"; // String | The ID of the controller to invoke a heartbeat on.
    Resourcecontrollerk8v3CreateHeartBeatRequest resourcecontrollerk8v3CreateHeartBeatRequest = new Resourcecontrollerk8v3CreateHeartBeatRequest(); // Resourcecontrollerk8v3CreateHeartBeatRequest | 
    try {
      Resourcecontrollerk8v3CreateHeartBeatResponse result = apiInstance.resourceControllerK8ServiceCreateHeartBeat(controllerId, resourcecontrollerk8v3CreateHeartBeatRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceCreateHeartBeat");
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
| **controllerId** | **String**| The ID of the controller to invoke a heartbeat on. | |
| **resourcecontrollerk8v3CreateHeartBeatRequest** | [**Resourcecontrollerk8v3CreateHeartBeatRequest**](Resourcecontrollerk8v3CreateHeartBeatRequest.md)|  | |

### Return type

[**Resourcecontrollerk8v3CreateHeartBeatResponse**](Resourcecontrollerk8v3CreateHeartBeatResponse.md)

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

<a id="resourceControllerK8ServiceCreateHeartBeatEx"></a>
# **resourceControllerK8ServiceCreateHeartBeatEx**
> Resourcecontrollerk8v3CreateHeartBeatExResponse resourceControllerK8ServiceCreateHeartBeatEx(controllerId, resourcecontrollerk8v3ControllerHeartbeat)

CreateHeartBeatEx - Create a heartbeat for the controller with extended information.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String controllerId = "controllerId_example"; // String | Optional: controller id
    Resourcecontrollerk8v3ControllerHeartbeat resourcecontrollerk8v3ControllerHeartbeat = new Resourcecontrollerk8v3ControllerHeartbeat(); // Resourcecontrollerk8v3ControllerHeartbeat | 
    try {
      Resourcecontrollerk8v3CreateHeartBeatExResponse result = apiInstance.resourceControllerK8ServiceCreateHeartBeatEx(controllerId, resourcecontrollerk8v3ControllerHeartbeat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceCreateHeartBeatEx");
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
| **controllerId** | **String**| Optional: controller id | |
| **resourcecontrollerk8v3ControllerHeartbeat** | [**Resourcecontrollerk8v3ControllerHeartbeat**](Resourcecontrollerk8v3ControllerHeartbeat.md)|  | |

### Return type

[**Resourcecontrollerk8v3CreateHeartBeatExResponse**](Resourcecontrollerk8v3CreateHeartBeatExResponse.md)

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

<a id="resourceControllerK8ServiceCreateJob"></a>
# **resourceControllerK8ServiceCreateJob**
> Resourcecontrollerk8v3Job resourceControllerK8ServiceCreateJob(resourcecontrollerk8v3Job)

//////////////////////////////////////////////////////////////// Interface to the controllers and apps api in the App-Manager microservice CreateJob - Create a job definition. Files and secrets contained within will also be created.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    Resourcecontrollerk8v3Job resourcecontrollerk8v3Job = new Resourcecontrollerk8v3Job(); // Resourcecontrollerk8v3Job | 
    try {
      Resourcecontrollerk8v3Job result = apiInstance.resourceControllerK8ServiceCreateJob(resourcecontrollerk8v3Job);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceCreateJob");
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
| **resourcecontrollerk8v3Job** | [**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)|  | |

### Return type

[**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)

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

<a id="resourceControllerK8ServiceCreateJobExecution"></a>
# **resourceControllerK8ServiceCreateJobExecution**
> Resourcecontrollerk8v3JobExecution resourceControllerK8ServiceCreateJobExecution(resourcecontrollerk8v3JobExecution)

CreateJobExecution - Create a job execution.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    Resourcecontrollerk8v3JobExecution resourcecontrollerk8v3JobExecution = new Resourcecontrollerk8v3JobExecution(); // Resourcecontrollerk8v3JobExecution | 
    try {
      Resourcecontrollerk8v3JobExecution result = apiInstance.resourceControllerK8ServiceCreateJobExecution(resourcecontrollerk8v3JobExecution);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceCreateJobExecution");
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
| **resourcecontrollerk8v3JobExecution** | [**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md)|  | |

### Return type

[**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md)

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

<a id="resourceControllerK8ServiceCreateKeypair"></a>
# **resourceControllerK8ServiceCreateKeypair**
> Resourcecontrollerk8v3CreateKeypairResponse resourceControllerK8ServiceCreateKeypair(controllerId, resourcecontrollerk8v3CreateKeypairRequest)

CreateKeypair - Create a new keypair for the controller.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String controllerId = "controllerId_example"; // String | The ID of the controller to get app tests for.
    Resourcecontrollerk8v3CreateKeypairRequest resourcecontrollerk8v3CreateKeypairRequest = new Resourcecontrollerk8v3CreateKeypairRequest(); // Resourcecontrollerk8v3CreateKeypairRequest | 
    try {
      Resourcecontrollerk8v3CreateKeypairResponse result = apiInstance.resourceControllerK8ServiceCreateKeypair(controllerId, resourcecontrollerk8v3CreateKeypairRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceCreateKeypair");
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
| **controllerId** | **String**| The ID of the controller to get app tests for. | |
| **resourcecontrollerk8v3CreateKeypairRequest** | [**Resourcecontrollerk8v3CreateKeypairRequest**](Resourcecontrollerk8v3CreateKeypairRequest.md)|  | |

### Return type

[**Resourcecontrollerk8v3CreateKeypairResponse**](Resourcecontrollerk8v3CreateKeypairResponse.md)

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

<a id="resourceControllerK8ServiceDeleteController"></a>
# **resourceControllerK8ServiceDeleteController**
> Resourcecontrollerk8v3DeleteControllerResponse resourceControllerK8ServiceDeleteController(controllerId, resourcecontrollerk8v3DeleteControllerRequest)

DeleteController - Delete a controller.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String controllerId = "controllerId_example"; // String | The ID of the controller to get the status.
    Resourcecontrollerk8v3DeleteControllerRequest resourcecontrollerk8v3DeleteControllerRequest = new Resourcecontrollerk8v3DeleteControllerRequest(); // Resourcecontrollerk8v3DeleteControllerRequest | 
    try {
      Resourcecontrollerk8v3DeleteControllerResponse result = apiInstance.resourceControllerK8ServiceDeleteController(controllerId, resourcecontrollerk8v3DeleteControllerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceDeleteController");
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
| **controllerId** | **String**| The ID of the controller to get the status. | |
| **resourcecontrollerk8v3DeleteControllerRequest** | [**Resourcecontrollerk8v3DeleteControllerRequest**](Resourcecontrollerk8v3DeleteControllerRequest.md)|  | |

### Return type

[**Resourcecontrollerk8v3DeleteControllerResponse**](Resourcecontrollerk8v3DeleteControllerResponse.md)

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

<a id="resourceControllerK8ServiceDeleteEdgeTenant"></a>
# **resourceControllerK8ServiceDeleteEdgeTenant**
> Resourcecontrollerk8v3DeleteEdgeTenantResponse resourceControllerK8ServiceDeleteEdgeTenant(tenantId, resourcecontrollerk8v3DeleteEdgeTenantRequestApphost)

DeleteEdgeTenant - deletes an edge tenant providing edge tenant id

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | ID of the tenant to delete
    Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost resourcecontrollerk8v3DeleteEdgeTenantRequestApphost = new Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost(); // Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost | 
    try {
      Resourcecontrollerk8v3DeleteEdgeTenantResponse result = apiInstance.resourceControllerK8ServiceDeleteEdgeTenant(tenantId, resourcecontrollerk8v3DeleteEdgeTenantRequestApphost);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceDeleteEdgeTenant");
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
| **tenantId** | **String**| ID of the tenant to delete | |
| **resourcecontrollerk8v3DeleteEdgeTenantRequestApphost** | [**Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost**](Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost.md)|  | |

### Return type

[**Resourcecontrollerk8v3DeleteEdgeTenantResponse**](Resourcecontrollerk8v3DeleteEdgeTenantResponse.md)

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

<a id="resourceControllerK8ServiceDeleteEdgeTenantRequest"></a>
# **resourceControllerK8ServiceDeleteEdgeTenantRequest**
> Resourcecontrollerk8v3EdgeResourceResponse resourceControllerK8ServiceDeleteEdgeTenantRequest(tenantId, resourcecontrollerk8v3EdgeTenantRequest)

DeleteEdgeTenantRequest to deletes gi and tnt CR on edge

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | Tenant ID for the redge request
    Resourcecontrollerk8v3EdgeTenantRequest resourcecontrollerk8v3EdgeTenantRequest = new Resourcecontrollerk8v3EdgeTenantRequest(); // Resourcecontrollerk8v3EdgeTenantRequest | 
    try {
      Resourcecontrollerk8v3EdgeResourceResponse result = apiInstance.resourceControllerK8ServiceDeleteEdgeTenantRequest(tenantId, resourcecontrollerk8v3EdgeTenantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceDeleteEdgeTenantRequest");
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
| **tenantId** | **String**| Tenant ID for the redge request | |
| **resourcecontrollerk8v3EdgeTenantRequest** | [**Resourcecontrollerk8v3EdgeTenantRequest**](Resourcecontrollerk8v3EdgeTenantRequest.md)|  | |

### Return type

[**Resourcecontrollerk8v3EdgeResourceResponse**](Resourcecontrollerk8v3EdgeResourceResponse.md)

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

<a id="resourceControllerK8ServiceDeleteJob"></a>
# **resourceControllerK8ServiceDeleteJob**
> Resourcecontrollerk8v3DeleteJobResponse resourceControllerK8ServiceDeleteJob(jobId, resourcecontrollerk8v3DeleteJobRequest)

DeleteJob - Delete a job.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String jobId = "jobId_example"; // String | ID of the job that needs to be deleted.
    Resourcecontrollerk8v3DeleteJobRequest resourcecontrollerk8v3DeleteJobRequest = new Resourcecontrollerk8v3DeleteJobRequest(); // Resourcecontrollerk8v3DeleteJobRequest | 
    try {
      Resourcecontrollerk8v3DeleteJobResponse result = apiInstance.resourceControllerK8ServiceDeleteJob(jobId, resourcecontrollerk8v3DeleteJobRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceDeleteJob");
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
| **jobId** | **String**| ID of the job that needs to be deleted. | |
| **resourcecontrollerk8v3DeleteJobRequest** | [**Resourcecontrollerk8v3DeleteJobRequest**](Resourcecontrollerk8v3DeleteJobRequest.md)|  | |

### Return type

[**Resourcecontrollerk8v3DeleteJobResponse**](Resourcecontrollerk8v3DeleteJobResponse.md)

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

<a id="resourceControllerK8ServiceDownloadControllerLogs"></a>
# **resourceControllerK8ServiceDownloadControllerLogs**
> Resourcecontrollerk8v3DownloadControllerLogsResponse resourceControllerK8ServiceDownloadControllerLogs(controllerId, resourcecontrollerk8v3DownloadControllerLogsRequest)

DownloadControllerLogs - Download the controller logs for a running controller.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String controllerId = "controllerId_example"; // String | The ID of the controller to download logs for.
    Resourcecontrollerk8v3DownloadControllerLogsRequest resourcecontrollerk8v3DownloadControllerLogsRequest = new Resourcecontrollerk8v3DownloadControllerLogsRequest(); // Resourcecontrollerk8v3DownloadControllerLogsRequest | 
    try {
      Resourcecontrollerk8v3DownloadControllerLogsResponse result = apiInstance.resourceControllerK8ServiceDownloadControllerLogs(controllerId, resourcecontrollerk8v3DownloadControllerLogsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceDownloadControllerLogs");
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
| **controllerId** | **String**| The ID of the controller to download logs for. | |
| **resourcecontrollerk8v3DownloadControllerLogsRequest** | [**Resourcecontrollerk8v3DownloadControllerLogsRequest**](Resourcecontrollerk8v3DownloadControllerLogsRequest.md)|  | |

### Return type

[**Resourcecontrollerk8v3DownloadControllerLogsResponse**](Resourcecontrollerk8v3DownloadControllerLogsResponse.md)

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

<a id="resourceControllerK8ServiceGetControllerApps"></a>
# **resourceControllerK8ServiceGetControllerApps**
> Resourcecontrollerk8v3GetControllerAppsResponse resourceControllerK8ServiceGetControllerApps(controllerId, modifiedSince)

GetControllerApps - Get the apps for the given controller.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String controllerId = "controllerId_example"; // String | The ID of the controller to get apps for.
    String modifiedSince = "modifiedSince_example"; // String | Only get the apps if any were modified since the given date.
    try {
      Resourcecontrollerk8v3GetControllerAppsResponse result = apiInstance.resourceControllerK8ServiceGetControllerApps(controllerId, modifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetControllerApps");
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
| **controllerId** | **String**| The ID of the controller to get apps for. | |
| **modifiedSince** | **String**| Only get the apps if any were modified since the given date. | [optional] |

### Return type

[**Resourcecontrollerk8v3GetControllerAppsResponse**](Resourcecontrollerk8v3GetControllerAppsResponse.md)

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

<a id="resourceControllerK8ServiceGetControllerCommands"></a>
# **resourceControllerK8ServiceGetControllerCommands**
> Resourcecontrollerk8v3GetControllerCommandsResponse resourceControllerK8ServiceGetControllerCommands(controllerId)

GetControllerCommands - Get the commands for the controller to execute.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String controllerId = "controllerId_example"; // String | The ID of the controller to get commands for.
    try {
      Resourcecontrollerk8v3GetControllerCommandsResponse result = apiInstance.resourceControllerK8ServiceGetControllerCommands(controllerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetControllerCommands");
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
| **controllerId** | **String**| The ID of the controller to get commands for. | |

### Return type

[**Resourcecontrollerk8v3GetControllerCommandsResponse**](Resourcecontrollerk8v3GetControllerCommandsResponse.md)

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

<a id="resourceControllerK8ServiceGetControllerJobs"></a>
# **resourceControllerK8ServiceGetControllerJobs**
> Resourcecontrollerk8v3GetControllerJobsResponse resourceControllerK8ServiceGetControllerJobs(controllerId, modifiedSince)

GetControllerJobs - Get the jobs for the controller to execute.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String controllerId = "controllerId_example"; // String | The ID of the controller to get jobs for.
    String modifiedSince = "modifiedSince_example"; // String | Optional: Only get the jobs if any were modified since the given date.
    try {
      Resourcecontrollerk8v3GetControllerJobsResponse result = apiInstance.resourceControllerK8ServiceGetControllerJobs(controllerId, modifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetControllerJobs");
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
| **controllerId** | **String**| The ID of the controller to get jobs for. | |
| **modifiedSince** | **String**| Optional: Only get the jobs if any were modified since the given date. | [optional] |

### Return type

[**Resourcecontrollerk8v3GetControllerJobsResponse**](Resourcecontrollerk8v3GetControllerJobsResponse.md)

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

<a id="resourceControllerK8ServiceGetControllerStatus"></a>
# **resourceControllerK8ServiceGetControllerStatus**
> Resourcecontrollerk8v3ControllerStatus resourceControllerK8ServiceGetControllerStatus(controllerId)

GetControllerStatus - Get the status for the given controller.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String controllerId = "controllerId_example"; // String | The ID of the controller to get the status.
    try {
      Resourcecontrollerk8v3ControllerStatus result = apiInstance.resourceControllerK8ServiceGetControllerStatus(controllerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetControllerStatus");
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
| **controllerId** | **String**| The ID of the controller to get the status. | |

### Return type

[**Resourcecontrollerk8v3ControllerStatus**](Resourcecontrollerk8v3ControllerStatus.md)

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

<a id="resourceControllerK8ServiceGetControllers"></a>
# **resourceControllerK8ServiceGetControllers**
> Resourcecontrollerk8v3GetControllersResponse resourceControllerK8ServiceGetControllers(tenantId, wantLocal)

GetControllers - Get the controllers for the given tenant.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | The ID of the tenant to get controllers for.
    Boolean wantLocal = true; // Boolean | Used to indicate the caller wants the local controller.
    try {
      Resourcecontrollerk8v3GetControllersResponse result = apiInstance.resourceControllerK8ServiceGetControllers(tenantId, wantLocal);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetControllers");
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
| **tenantId** | **String**| The ID of the tenant to get controllers for. | |
| **wantLocal** | **Boolean**| Used to indicate the caller wants the local controller. | [optional] |

### Return type

[**Resourcecontrollerk8v3GetControllersResponse**](Resourcecontrollerk8v3GetControllersResponse.md)

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

<a id="resourceControllerK8ServiceGetControllersWithStatus"></a>
# **resourceControllerK8ServiceGetControllersWithStatus**
> Resourcecontrollerk8v3GetControllersWithStatusResponse resourceControllerK8ServiceGetControllersWithStatus(tenantId, wantLocal, controllerId)

GetControllersWithStatus - Get the controllers for the given tenant with computed status.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | The ID of the tenant to get controllers for.
    Boolean wantLocal = true; // Boolean | Used to indicate the caller wants the local controller.
    String controllerId = "controllerId_example"; // String | \"ALL\": for getting all controllers; <controller_id>: for getting single controller.
    try {
      Resourcecontrollerk8v3GetControllersWithStatusResponse result = apiInstance.resourceControllerK8ServiceGetControllersWithStatus(tenantId, wantLocal, controllerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetControllersWithStatus");
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
| **tenantId** | **String**| The ID of the tenant to get controllers for. | |
| **wantLocal** | **Boolean**| Used to indicate the caller wants the local controller. | [optional] |
| **controllerId** | **String**| \&quot;ALL\&quot;: for getting all controllers; &lt;controller_id&gt;: for getting single controller. | [optional] |

### Return type

[**Resourcecontrollerk8v3GetControllersWithStatusResponse**](Resourcecontrollerk8v3GetControllersWithStatusResponse.md)

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

<a id="resourceControllerK8ServiceGetJob"></a>
# **resourceControllerK8ServiceGetJob**
> Resourcecontrollerk8v3Job resourceControllerK8ServiceGetJob(jobId, wantSecretValues)

GetJob - Get the job.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String jobId = "jobId_example"; // String | The ID of the job to get.
    Boolean wantSecretValues = true; // Boolean | Optional: True to return secret values, false otherwise.
    try {
      Resourcecontrollerk8v3Job result = apiInstance.resourceControllerK8ServiceGetJob(jobId, wantSecretValues);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetJob");
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
| **jobId** | **String**| The ID of the job to get. | |
| **wantSecretValues** | **Boolean**| Optional: True to return secret values, false otherwise. | [optional] |

### Return type

[**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)

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

<a id="resourceControllerK8ServiceGetJobExecution"></a>
# **resourceControllerK8ServiceGetJobExecution**
> Resourcecontrollerk8v3JobExecution resourceControllerK8ServiceGetJobExecution(jobexeId)

GetJobExecution - Get a job execution.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String jobexeId = "jobexeId_example"; // String | The ID of the job execution to get.
    try {
      Resourcecontrollerk8v3JobExecution result = apiInstance.resourceControllerK8ServiceGetJobExecution(jobexeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetJobExecution");
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
| **jobexeId** | **String**| The ID of the job execution to get. | |

### Return type

[**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md)

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

<a id="resourceControllerK8ServiceGetJobExecutions"></a>
# **resourceControllerK8ServiceGetJobExecutions**
> Resourcecontrollerk8v3GetJobExecutionsResponse resourceControllerK8ServiceGetJobExecutions(jobId)

GetJobExecutions - Get the job executions.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String jobId = "jobId_example"; // String | The ID of the job to get status.
    try {
      Resourcecontrollerk8v3GetJobExecutionsResponse result = apiInstance.resourceControllerK8ServiceGetJobExecutions(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetJobExecutions");
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
| **jobId** | **String**| The ID of the job to get status. | |

### Return type

[**Resourcecontrollerk8v3GetJobExecutionsResponse**](Resourcecontrollerk8v3GetJobExecutionsResponse.md)

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

<a id="resourceControllerK8ServiceGetJobStatus"></a>
# **resourceControllerK8ServiceGetJobStatus**
> Resourcecontrollerk8v3JobStatusDTO resourceControllerK8ServiceGetJobStatus(jobId)

GetJobStatus - Get the job&#39;s status.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String jobId = "jobId_example"; // String | The ID of the job to get status.
    try {
      Resourcecontrollerk8v3JobStatusDTO result = apiInstance.resourceControllerK8ServiceGetJobStatus(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetJobStatus");
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
| **jobId** | **String**| The ID of the job to get status. | |

### Return type

[**Resourcecontrollerk8v3JobStatusDTO**](Resourcecontrollerk8v3JobStatusDTO.md)

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

<a id="resourceControllerK8ServiceGetTenantApp"></a>
# **resourceControllerK8ServiceGetTenantApp**
> Resourcecontrollerk8v3App resourceControllerK8ServiceGetTenantApp(tenantId, appName, returnLevel)

GetTenantApp - Get a specific app for the given tenant.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | The ID of the tenant to get apps for.
    String appName = "appName_example"; // String | The name of the app to get.
    String returnLevel = "returnLevel_example"; // String | Optional: specify a return level for the data. This will control the amount of data returned.
    try {
      Resourcecontrollerk8v3App result = apiInstance.resourceControllerK8ServiceGetTenantApp(tenantId, appName, returnLevel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetTenantApp");
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
| **tenantId** | **String**| The ID of the tenant to get apps for. | |
| **appName** | **String**| The name of the app to get. | |
| **returnLevel** | **String**| Optional: specify a return level for the data. This will control the amount of data returned. | [optional] |

### Return type

[**Resourcecontrollerk8v3App**](Resourcecontrollerk8v3App.md)

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

<a id="resourceControllerK8ServiceGetTenantApps"></a>
# **resourceControllerK8ServiceGetTenantApps**
> Resourcecontrollerk8v3GetTenantAppsResponse resourceControllerK8ServiceGetTenantApps(tenantId, returnLevel)

GetTenantApps - Get the apps for the given tenant.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | The ID of the tenant to get apps for.
    String returnLevel = "returnLevel_example"; // String | Optional: specify a return level for the data. This will control the amount of data returned.
    try {
      Resourcecontrollerk8v3GetTenantAppsResponse result = apiInstance.resourceControllerK8ServiceGetTenantApps(tenantId, returnLevel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetTenantApps");
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
| **tenantId** | **String**| The ID of the tenant to get apps for. | |
| **returnLevel** | **String**| Optional: specify a return level for the data. This will control the amount of data returned. | [optional] |

### Return type

[**Resourcecontrollerk8v3GetTenantAppsResponse**](Resourcecontrollerk8v3GetTenantAppsResponse.md)

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

<a id="resourceControllerK8ServiceGetTenantJobs"></a>
# **resourceControllerK8ServiceGetTenantJobs**
> Resourcecontrollerk8v3GetTenantJobsResponse resourceControllerK8ServiceGetTenantJobs(tenantId)

GetTenantJobs - Get jobs for the given tenant.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String tenantId = "tenantId_example"; // String | The ID of the tenant to get jobs for.
    try {
      Resourcecontrollerk8v3GetTenantJobsResponse result = apiInstance.resourceControllerK8ServiceGetTenantJobs(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetTenantJobs");
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
| **tenantId** | **String**| The ID of the tenant to get jobs for. | |

### Return type

[**Resourcecontrollerk8v3GetTenantJobsResponse**](Resourcecontrollerk8v3GetTenantJobsResponse.md)

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

<a id="resourceControllerK8ServiceGetVersion"></a>
# **resourceControllerK8ServiceGetVersion**
> Resourcecontrollerk8v3Version resourceControllerK8ServiceGetVersion()

GetVersion - Get the system version information for the service.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    try {
      Resourcecontrollerk8v3Version result = apiInstance.resourceControllerK8ServiceGetVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceGetVersion");
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

[**Resourcecontrollerk8v3Version**](Resourcecontrollerk8v3Version.md)

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

<a id="resourceControllerK8ServiceInstallEdgeTenantRequest"></a>
# **resourceControllerK8ServiceInstallEdgeTenantRequest**
> Resourcecontrollerk8v3EdgeResourceResponse resourceControllerK8ServiceInstallEdgeTenantRequest(resourcecontrollerk8v3EdgeTenantRequest)

InstallEdgeTenantRequest to Create/update gi and tnt CRs on edge

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    Resourcecontrollerk8v3EdgeTenantRequest resourcecontrollerk8v3EdgeTenantRequest = new Resourcecontrollerk8v3EdgeTenantRequest(); // Resourcecontrollerk8v3EdgeTenantRequest | 
    try {
      Resourcecontrollerk8v3EdgeResourceResponse result = apiInstance.resourceControllerK8ServiceInstallEdgeTenantRequest(resourcecontrollerk8v3EdgeTenantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceInstallEdgeTenantRequest");
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
| **resourcecontrollerk8v3EdgeTenantRequest** | [**Resourcecontrollerk8v3EdgeTenantRequest**](Resourcecontrollerk8v3EdgeTenantRequest.md)|  | |

### Return type

[**Resourcecontrollerk8v3EdgeResourceResponse**](Resourcecontrollerk8v3EdgeResourceResponse.md)

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

<a id="resourceControllerK8ServiceQueryControllerLogs"></a>
# **resourceControllerK8ServiceQueryControllerLogs**
> Resourcecontrollerk8v3QueryControllerLogsResponse resourceControllerK8ServiceQueryControllerLogs(controllerId, resourcecontrollerk8v3QueryControllerLogsRequest)

QueryControllerLogs - Query for the controller logs for a running controller.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String controllerId = "controllerId_example"; // String | The ID of the controller to get logs for.
    Resourcecontrollerk8v3QueryControllerLogsRequest resourcecontrollerk8v3QueryControllerLogsRequest = new Resourcecontrollerk8v3QueryControllerLogsRequest(); // Resourcecontrollerk8v3QueryControllerLogsRequest | 
    try {
      Resourcecontrollerk8v3QueryControllerLogsResponse result = apiInstance.resourceControllerK8ServiceQueryControllerLogs(controllerId, resourcecontrollerk8v3QueryControllerLogsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceQueryControllerLogs");
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
| **controllerId** | **String**| The ID of the controller to get logs for. | |
| **resourcecontrollerk8v3QueryControllerLogsRequest** | [**Resourcecontrollerk8v3QueryControllerLogsRequest**](Resourcecontrollerk8v3QueryControllerLogsRequest.md)|  | |

### Return type

[**Resourcecontrollerk8v3QueryControllerLogsResponse**](Resourcecontrollerk8v3QueryControllerLogsResponse.md)

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

<a id="resourceControllerK8ServiceUpdateCommand"></a>
# **resourceControllerK8ServiceUpdateCommand**
> Resourcecontrollerk8v3ControllerCommand resourceControllerK8ServiceUpdateCommand(id, resourcecontrollerk8v3ControllerCommand)

UpdateCommand - Update the command.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String id = "id_example"; // String | The ID of the command.
    Resourcecontrollerk8v3ControllerCommand resourcecontrollerk8v3ControllerCommand = new Resourcecontrollerk8v3ControllerCommand(); // Resourcecontrollerk8v3ControllerCommand | 
    try {
      Resourcecontrollerk8v3ControllerCommand result = apiInstance.resourceControllerK8ServiceUpdateCommand(id, resourcecontrollerk8v3ControllerCommand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceUpdateCommand");
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
| **id** | **String**| The ID of the command. | |
| **resourcecontrollerk8v3ControllerCommand** | [**Resourcecontrollerk8v3ControllerCommand**](Resourcecontrollerk8v3ControllerCommand.md)|  | |

### Return type

[**Resourcecontrollerk8v3ControllerCommand**](Resourcecontrollerk8v3ControllerCommand.md)

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

<a id="resourceControllerK8ServiceUpdateController"></a>
# **resourceControllerK8ServiceUpdateController**
> Resourcecontrollerk8v3Controller resourceControllerK8ServiceUpdateController(id, resourcecontrollerk8v3Controller)

UpdateController - Update an existing controller.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String id = "id_example"; // String | Optional: The internal ID of the controller.
    Resourcecontrollerk8v3Controller resourcecontrollerk8v3Controller = new Resourcecontrollerk8v3Controller(); // Resourcecontrollerk8v3Controller | 
    try {
      Resourcecontrollerk8v3Controller result = apiInstance.resourceControllerK8ServiceUpdateController(id, resourcecontrollerk8v3Controller);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceUpdateController");
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
| **id** | **String**| Optional: The internal ID of the controller. | |
| **resourcecontrollerk8v3Controller** | [**Resourcecontrollerk8v3Controller**](Resourcecontrollerk8v3Controller.md)|  | |

### Return type

[**Resourcecontrollerk8v3Controller**](Resourcecontrollerk8v3Controller.md)

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

<a id="resourceControllerK8ServiceUpdateControllerStatus"></a>
# **resourceControllerK8ServiceUpdateControllerStatus**
> Resourcecontrollerk8v3ControllerStatus resourceControllerK8ServiceUpdateControllerStatus(id, resourcecontrollerk8v3ControllerStatus)

UpdateControllerStatus - Updates the status for the given controller.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String id = "id_example"; // String | The internal ID of the controller.
    Resourcecontrollerk8v3ControllerStatus resourcecontrollerk8v3ControllerStatus = new Resourcecontrollerk8v3ControllerStatus(); // Resourcecontrollerk8v3ControllerStatus | 
    try {
      Resourcecontrollerk8v3ControllerStatus result = apiInstance.resourceControllerK8ServiceUpdateControllerStatus(id, resourcecontrollerk8v3ControllerStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceUpdateControllerStatus");
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
| **id** | **String**| The internal ID of the controller. | |
| **resourcecontrollerk8v3ControllerStatus** | [**Resourcecontrollerk8v3ControllerStatus**](Resourcecontrollerk8v3ControllerStatus.md)|  | |

### Return type

[**Resourcecontrollerk8v3ControllerStatus**](Resourcecontrollerk8v3ControllerStatus.md)

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

<a id="resourceControllerK8ServiceUpdateJob"></a>
# **resourceControllerK8ServiceUpdateJob**
> Resourcecontrollerk8v3Job resourceControllerK8ServiceUpdateJob(id, resourcecontrollerk8v3Job)

UpdateJob - Update a job.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String id = "id_example"; // String | The ID of the job.
    Resourcecontrollerk8v3Job resourcecontrollerk8v3Job = new Resourcecontrollerk8v3Job(); // Resourcecontrollerk8v3Job | 
    try {
      Resourcecontrollerk8v3Job result = apiInstance.resourceControllerK8ServiceUpdateJob(id, resourcecontrollerk8v3Job);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceUpdateJob");
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
| **id** | **String**| The ID of the job. | |
| **resourcecontrollerk8v3Job** | [**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)|  | |

### Return type

[**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)

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

<a id="resourceControllerK8ServiceUpdateJobExecution"></a>
# **resourceControllerK8ServiceUpdateJobExecution**
> Resourcecontrollerk8v3JobExecution resourceControllerK8ServiceUpdateJobExecution(id, resourcecontrollerk8v3UpdateJobExecutionRequest)

UpdateJobExecution - Update a job execution.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String id = "id_example"; // String | The ID of the job execution to update.
    Resourcecontrollerk8v3UpdateJobExecutionRequest resourcecontrollerk8v3UpdateJobExecutionRequest = new Resourcecontrollerk8v3UpdateJobExecutionRequest(); // Resourcecontrollerk8v3UpdateJobExecutionRequest | 
    try {
      Resourcecontrollerk8v3JobExecution result = apiInstance.resourceControllerK8ServiceUpdateJobExecution(id, resourcecontrollerk8v3UpdateJobExecutionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceUpdateJobExecution");
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
| **id** | **String**| The ID of the job execution to update. | |
| **resourcecontrollerk8v3UpdateJobExecutionRequest** | [**Resourcecontrollerk8v3UpdateJobExecutionRequest**](Resourcecontrollerk8v3UpdateJobExecutionRequest.md)|  | |

### Return type

[**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md)

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

<a id="resourceControllerK8ServiceUpdateJobStatus"></a>
# **resourceControllerK8ServiceUpdateJobStatus**
> Resourcecontrollerk8v3JobStatusDTO resourceControllerK8ServiceUpdateJobStatus(jobId, resourcecontrollerk8v3UpdateJobStatusRequest)

UpdateJobStatus - Updates the status for the given Job.

### Example
```java
// Import classes:
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.auth.*;
import com.ibm.gdsc.sdk.models.*;
import com.ibm.gdsc.sdk.api.ResourceControllerK8ServiceApi;

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

    ResourceControllerK8ServiceApi apiInstance = new ResourceControllerK8ServiceApi(defaultClient);
    String jobId = "jobId_example"; // String | The ID of the job to get status.
    Resourcecontrollerk8v3UpdateJobStatusRequest resourcecontrollerk8v3UpdateJobStatusRequest = new Resourcecontrollerk8v3UpdateJobStatusRequest(); // Resourcecontrollerk8v3UpdateJobStatusRequest | 
    try {
      Resourcecontrollerk8v3JobStatusDTO result = apiInstance.resourceControllerK8ServiceUpdateJobStatus(jobId, resourcecontrollerk8v3UpdateJobStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceControllerK8ServiceApi#resourceControllerK8ServiceUpdateJobStatus");
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
| **jobId** | **String**| The ID of the job to get status. | |
| **resourcecontrollerk8v3UpdateJobStatusRequest** | [**Resourcecontrollerk8v3UpdateJobStatusRequest**](Resourcecontrollerk8v3UpdateJobStatusRequest.md)|  | |

### Return type

[**Resourcecontrollerk8v3JobStatusDTO**](Resourcecontrollerk8v3JobStatusDTO.md)

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

