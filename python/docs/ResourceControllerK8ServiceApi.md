# ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resource_controller_k8_service_create_controller**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_controller) | **POST** /api/v3/edge_manager/controllers | CreateController - Add a new controller.
[**resource_controller_k8_service_create_heart_beat**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_heart_beat) | **POST** /api/v3/edge_manager/controllers/{controller_id}/heartbeat | CreateHeartBeat - Create a heartbeat for the controller.
[**resource_controller_k8_service_create_heart_beat_ex**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_heart_beat_ex) | **POST** /api/v3/edge_manager/controllers/{controller_id}/heartbeat_ex | CreateHeartBeatEx - Create a heartbeat for the controller with extended information.
[**resource_controller_k8_service_create_job**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_job) | **POST** /api/v3/edge_manager/jobs | //////////////////////////////////////////////////////////////// Interface to the controllers and apps api in the App-Manager microservice CreateJob - Create a job definition. Files and secrets contained within will also be created.
[**resource_controller_k8_service_create_job_execution**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_job_execution) | **POST** /api/v3/edge_manager/job_executions | CreateJobExecution - Create a job execution.
[**resource_controller_k8_service_create_keypair**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_keypair) | **POST** /api/v3/edge_manager/controllers/{controller_id}/keypair | CreateKeypair - Create a new keypair for the controller.
[**resource_controller_k8_service_delete_controller**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_delete_controller) | **DELETE** /api/v3/edge_manager/controllers/{controller_id} | DeleteController - Delete a controller.
[**resource_controller_k8_service_delete_edge_tenant**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_delete_edge_tenant) | **DELETE** /api/v3/edge_manager/tenants/{tenant_id} | DeleteEdgeTenant - deletes an edge tenant providing edge tenant id
[**resource_controller_k8_service_delete_edge_tenant_request**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_delete_edge_tenant_request) | **DELETE** /api/v3/edges | DeleteEdgeTenantRequest to deletes gi and tnt CR on edge
[**resource_controller_k8_service_delete_job**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_delete_job) | **DELETE** /api/v3/edge_manager/jobs/{job_id} | DeleteJob - Delete a job.
[**resource_controller_k8_service_download_controller_logs**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_download_controller_logs) | **POST** /api/v3/edge_manager/controllers/{controller_id}/logs | DownloadControllerLogs - Download the controller logs for a running controller.
[**resource_controller_k8_service_get_controller_apps**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controller_apps) | **GET** /api/v3/edge_manager/controllers/{controller_id}/apps | GetControllerApps - Get the apps for the given controller.
[**resource_controller_k8_service_get_controller_commands**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controller_commands) | **GET** /api/v3/edge_manager/controllers/{controller_id}/commands | GetControllerCommands - Get the commands for the controller to execute.
[**resource_controller_k8_service_get_controller_jobs**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controller_jobs) | **GET** /api/v3/edge_manager/controllers/{controller_id}/jobs | GetControllerJobs - Get the jobs for the controller to execute.
[**resource_controller_k8_service_get_controller_status**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controller_status) | **GET** /api/v3/edge_manager/controllers/{controller_id}/status | GetControllerStatus - Get the status for the given controller.
[**resource_controller_k8_service_get_controllers**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controllers) | **GET** /api/v3/edge_manager/tenants/{tenant_id}/controllers | GetControllers - Get the controllers for the given tenant.
[**resource_controller_k8_service_get_controllers_with_status**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controllers_with_status) | **GET** /api/v3/edge_manager/tenants/{tenant_id}/controller_status | GetControllersWithStatus - Get the controllers for the given tenant with computed status.
[**resource_controller_k8_service_get_job**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_job) | **GET** /api/v3/edge_manager/jobs/{job_id} | GetJob - Get the job.
[**resource_controller_k8_service_get_job_execution**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_job_execution) | **GET** /api/v3/edge_manager/job_executions/{jobexe_id} | GetJobExecution - Get a job execution.
[**resource_controller_k8_service_get_job_executions**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_job_executions) | **GET** /api/v3/edge_manager/jobs/{job_id}/executions | GetJobExecutions - Get the job executions.
[**resource_controller_k8_service_get_job_status**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_job_status) | **GET** /api/v3/edge_manager/jobs/{job_id}/status | GetJobStatus - Get the job&#39;s status.
[**resource_controller_k8_service_get_tenant_app**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_tenant_app) | **GET** /api/v3/edge_manager/tenants/{tenant_id}/apps/{app_name} | GetTenantApp - Get a specific app for the given tenant.
[**resource_controller_k8_service_get_tenant_apps**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_tenant_apps) | **GET** /api/v3/edge_manager/tenants/{tenant_id}/apps | GetTenantApps - Get the apps for the given tenant.
[**resource_controller_k8_service_get_tenant_jobs**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_tenant_jobs) | **GET** /api/v3/edge_manager/tenants/{tenant_id}/jobs | GetTenantJobs - Get jobs for the given tenant.
[**resource_controller_k8_service_get_version**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_version) | **GET** /api/v3/edge_manager/system/version | GetVersion - Get the system version information for the service.
[**resource_controller_k8_service_install_edge_tenant_request**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_install_edge_tenant_request) | **POST** /api/v3/edges | InstallEdgeTenantRequest to Create gi and tnt CRs on edge
[**resource_controller_k8_service_query_controller_logs**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_query_controller_logs) | **POST** /api/v3/edge_manager/controllers/{controller_id}/logs/query | QueryControllerLogs - Query for the controller logs for a running controller.
[**resource_controller_k8_service_update_command**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_command) | **PUT** /api/v3/edge_manager/commands/{id} | UpdateCommand - Update the command.
[**resource_controller_k8_service_update_controller**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_controller) | **PUT** /api/v3/edge_manager/controllers/{id} | UpdateController - Update an existing controller.
[**resource_controller_k8_service_update_controller_status**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_controller_status) | **PUT** /api/v3/edge_manager/controllers/{id}/status | UpdateControllerStatus - Updates the status for the given controller.
[**resource_controller_k8_service_update_edge_tenant_request**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_edge_tenant_request) | **PATCH** /api/v3/edges/{edge_id} | UpdateEdgeTenantRequest to update gi and tnt CRs on edge
[**resource_controller_k8_service_update_job**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_job) | **PUT** /api/v3/edge_manager/jobs/{id} | UpdateJob - Update a job.
[**resource_controller_k8_service_update_job_execution**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_job_execution) | **PUT** /api/v3/edge_manager/job_executions/{id} | UpdateJobExecution - Update a job execution.
[**resource_controller_k8_service_update_job_status**](ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_job_status) | **PUT** /api/v3/edge_manager/jobs/{job_id}/status | UpdateJobStatus - Updates the status for the given Job.


# **resource_controller_k8_service_create_controller**
> Resourcecontrollerk8v3Controller resource_controller_k8_service_create_controller(resourcecontrollerk8v3_create_controller_request)

CreateController - Add a new controller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller import Resourcecontrollerk8v3Controller
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_create_controller_request import Resourcecontrollerk8v3CreateControllerRequest
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    resourcecontrollerk8v3_create_controller_request = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3CreateControllerRequest() # Resourcecontrollerk8v3CreateControllerRequest | 

    try:
        # CreateController - Add a new controller.
        api_response = api_instance.resource_controller_k8_service_create_controller(resourcecontrollerk8v3_create_controller_request)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_create_controller:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_create_controller: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3_create_controller_request** | [**Resourcecontrollerk8v3CreateControllerRequest**](Resourcecontrollerk8v3CreateControllerRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_create_heart_beat**
> Resourcecontrollerk8v3CreateHeartBeatResponse resource_controller_k8_service_create_heart_beat(controller_id, resourcecontrollerk8v3_create_heart_beat_request)

CreateHeartBeat - Create a heartbeat for the controller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_create_heart_beat_request import Resourcecontrollerk8v3CreateHeartBeatRequest
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_create_heart_beat_response import Resourcecontrollerk8v3CreateHeartBeatResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    controller_id = 'controller_id_example' # str | The ID of the controller to invoke a heartbeat on.
    resourcecontrollerk8v3_create_heart_beat_request = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3CreateHeartBeatRequest() # Resourcecontrollerk8v3CreateHeartBeatRequest | 

    try:
        # CreateHeartBeat - Create a heartbeat for the controller.
        api_response = api_instance.resource_controller_k8_service_create_heart_beat(controller_id, resourcecontrollerk8v3_create_heart_beat_request)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_create_heart_beat:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_create_heart_beat: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller_id** | **str**| The ID of the controller to invoke a heartbeat on. | 
 **resourcecontrollerk8v3_create_heart_beat_request** | [**Resourcecontrollerk8v3CreateHeartBeatRequest**](Resourcecontrollerk8v3CreateHeartBeatRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_create_heart_beat_ex**
> Resourcecontrollerk8v3CreateHeartBeatExResponse resource_controller_k8_service_create_heart_beat_ex(controller_id, resourcecontrollerk8v3_controller_heartbeat)

CreateHeartBeatEx - Create a heartbeat for the controller with extended information.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller_heartbeat import Resourcecontrollerk8v3ControllerHeartbeat
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_create_heart_beat_ex_response import Resourcecontrollerk8v3CreateHeartBeatExResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    controller_id = 'controller_id_example' # str | Optional: controller id
    resourcecontrollerk8v3_controller_heartbeat = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3ControllerHeartbeat() # Resourcecontrollerk8v3ControllerHeartbeat | 

    try:
        # CreateHeartBeatEx - Create a heartbeat for the controller with extended information.
        api_response = api_instance.resource_controller_k8_service_create_heart_beat_ex(controller_id, resourcecontrollerk8v3_controller_heartbeat)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_create_heart_beat_ex:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_create_heart_beat_ex: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller_id** | **str**| Optional: controller id | 
 **resourcecontrollerk8v3_controller_heartbeat** | [**Resourcecontrollerk8v3ControllerHeartbeat**](Resourcecontrollerk8v3ControllerHeartbeat.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_create_job**
> Resourcecontrollerk8v3Job resource_controller_k8_service_create_job(resourcecontrollerk8v3_job)

//////////////////////////////////////////////////////////////// Interface to the controllers and apps api in the App-Manager microservice CreateJob - Create a job definition. Files and secrets contained within will also be created.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_job import Resourcecontrollerk8v3Job
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    resourcecontrollerk8v3_job = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3Job() # Resourcecontrollerk8v3Job | 

    try:
        # //////////////////////////////////////////////////////////////// Interface to the controllers and apps api in the App-Manager microservice CreateJob - Create a job definition. Files and secrets contained within will also be created.
        api_response = api_instance.resource_controller_k8_service_create_job(resourcecontrollerk8v3_job)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_create_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_create_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3_job** | [**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_create_job_execution**
> Resourcecontrollerk8v3JobExecution resource_controller_k8_service_create_job_execution(resourcecontrollerk8v3_job_execution)

CreateJobExecution - Create a job execution.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_job_execution import Resourcecontrollerk8v3JobExecution
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    resourcecontrollerk8v3_job_execution = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3JobExecution() # Resourcecontrollerk8v3JobExecution | 

    try:
        # CreateJobExecution - Create a job execution.
        api_response = api_instance.resource_controller_k8_service_create_job_execution(resourcecontrollerk8v3_job_execution)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_create_job_execution:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_create_job_execution: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3_job_execution** | [**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_create_keypair**
> Resourcecontrollerk8v3CreateKeypairResponse resource_controller_k8_service_create_keypair(controller_id, resourcecontrollerk8v3_create_keypair_request)

CreateKeypair - Create a new keypair for the controller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_create_keypair_request import Resourcecontrollerk8v3CreateKeypairRequest
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_create_keypair_response import Resourcecontrollerk8v3CreateKeypairResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    controller_id = 'controller_id_example' # str | The ID of the controller to get app tests for.
    resourcecontrollerk8v3_create_keypair_request = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3CreateKeypairRequest() # Resourcecontrollerk8v3CreateKeypairRequest | 

    try:
        # CreateKeypair - Create a new keypair for the controller.
        api_response = api_instance.resource_controller_k8_service_create_keypair(controller_id, resourcecontrollerk8v3_create_keypair_request)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_create_keypair:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_create_keypair: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller_id** | **str**| The ID of the controller to get app tests for. | 
 **resourcecontrollerk8v3_create_keypair_request** | [**Resourcecontrollerk8v3CreateKeypairRequest**](Resourcecontrollerk8v3CreateKeypairRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_delete_controller**
> Resourcecontrollerk8v3DeleteControllerResponse resource_controller_k8_service_delete_controller(controller_id, resourcecontrollerk8v3_delete_controller_request)

DeleteController - Delete a controller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_delete_controller_request import Resourcecontrollerk8v3DeleteControllerRequest
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_delete_controller_response import Resourcecontrollerk8v3DeleteControllerResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    controller_id = 'controller_id_example' # str | The ID of the controller to get the status.
    resourcecontrollerk8v3_delete_controller_request = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3DeleteControllerRequest() # Resourcecontrollerk8v3DeleteControllerRequest | 

    try:
        # DeleteController - Delete a controller.
        api_response = api_instance.resource_controller_k8_service_delete_controller(controller_id, resourcecontrollerk8v3_delete_controller_request)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_delete_controller:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_delete_controller: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller_id** | **str**| The ID of the controller to get the status. | 
 **resourcecontrollerk8v3_delete_controller_request** | [**Resourcecontrollerk8v3DeleteControllerRequest**](Resourcecontrollerk8v3DeleteControllerRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_delete_edge_tenant**
> Resourcecontrollerk8v3DeleteEdgeTenantResponse resource_controller_k8_service_delete_edge_tenant(tenant_id, resourcecontrollerk8v3_delete_edge_tenant_request_apphost)

DeleteEdgeTenant - deletes an edge tenant providing edge tenant id

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_delete_edge_tenant_request_apphost import Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_delete_edge_tenant_response import Resourcecontrollerk8v3DeleteEdgeTenantResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | ID of the tenant to delete
    resourcecontrollerk8v3_delete_edge_tenant_request_apphost = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost() # Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost | 

    try:
        # DeleteEdgeTenant - deletes an edge tenant providing edge tenant id
        api_response = api_instance.resource_controller_k8_service_delete_edge_tenant(tenant_id, resourcecontrollerk8v3_delete_edge_tenant_request_apphost)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_delete_edge_tenant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_delete_edge_tenant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| ID of the tenant to delete | 
 **resourcecontrollerk8v3_delete_edge_tenant_request_apphost** | [**Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost**](Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_delete_edge_tenant_request**
> Resourcecontrollerk8v3EdgeResourceResponse resource_controller_k8_service_delete_edge_tenant_request(tenant_id=tenant_id, edge_id=edge_id, edge_name=edge_name)

DeleteEdgeTenantRequest to deletes gi and tnt CR on edge

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_edge_resource_response import Resourcecontrollerk8v3EdgeResourceResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | Tenant ID for the redge request. (optional)
    edge_id = 'edge_id_example' # str | ID of the edge system. (optional)
    edge_name = 'edge_name_example' # str | Edge gateway ID. (optional)

    try:
        # DeleteEdgeTenantRequest to deletes gi and tnt CR on edge
        api_response = api_instance.resource_controller_k8_service_delete_edge_tenant_request(tenant_id=tenant_id, edge_id=edge_id, edge_name=edge_name)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_delete_edge_tenant_request:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_delete_edge_tenant_request: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| Tenant ID for the redge request. | [optional] 
 **edge_id** | **str**| ID of the edge system. | [optional] 
 **edge_name** | **str**| Edge gateway ID. | [optional] 

### Return type

[**Resourcecontrollerk8v3EdgeResourceResponse**](Resourcecontrollerk8v3EdgeResourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_delete_job**
> Resourcecontrollerk8v3DeleteJobResponse resource_controller_k8_service_delete_job(job_id, resourcecontrollerk8v3_delete_job_request)

DeleteJob - Delete a job.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_delete_job_request import Resourcecontrollerk8v3DeleteJobRequest
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_delete_job_response import Resourcecontrollerk8v3DeleteJobResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    job_id = 'job_id_example' # str | ID of the job that needs to be deleted.
    resourcecontrollerk8v3_delete_job_request = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3DeleteJobRequest() # Resourcecontrollerk8v3DeleteJobRequest | 

    try:
        # DeleteJob - Delete a job.
        api_response = api_instance.resource_controller_k8_service_delete_job(job_id, resourcecontrollerk8v3_delete_job_request)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_delete_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_delete_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **str**| ID of the job that needs to be deleted. | 
 **resourcecontrollerk8v3_delete_job_request** | [**Resourcecontrollerk8v3DeleteJobRequest**](Resourcecontrollerk8v3DeleteJobRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_download_controller_logs**
> Resourcecontrollerk8v3DownloadControllerLogsResponse resource_controller_k8_service_download_controller_logs(controller_id, resourcecontrollerk8v3_download_controller_logs_request)

DownloadControllerLogs - Download the controller logs for a running controller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_download_controller_logs_request import Resourcecontrollerk8v3DownloadControllerLogsRequest
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_download_controller_logs_response import Resourcecontrollerk8v3DownloadControllerLogsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    controller_id = 'controller_id_example' # str | The ID of the controller to download logs for.
    resourcecontrollerk8v3_download_controller_logs_request = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3DownloadControllerLogsRequest() # Resourcecontrollerk8v3DownloadControllerLogsRequest | 

    try:
        # DownloadControllerLogs - Download the controller logs for a running controller.
        api_response = api_instance.resource_controller_k8_service_download_controller_logs(controller_id, resourcecontrollerk8v3_download_controller_logs_request)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_download_controller_logs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_download_controller_logs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller_id** | **str**| The ID of the controller to download logs for. | 
 **resourcecontrollerk8v3_download_controller_logs_request** | [**Resourcecontrollerk8v3DownloadControllerLogsRequest**](Resourcecontrollerk8v3DownloadControllerLogsRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_controller_apps**
> Resourcecontrollerk8v3GetControllerAppsResponse resource_controller_k8_service_get_controller_apps(controller_id, modified_since=modified_since)

GetControllerApps - Get the apps for the given controller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_controller_apps_response import Resourcecontrollerk8v3GetControllerAppsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    controller_id = 'controller_id_example' # str | The ID of the controller to get apps for.
    modified_since = 'modified_since_example' # str | Only get the apps if any were modified since the given date. (optional)

    try:
        # GetControllerApps - Get the apps for the given controller.
        api_response = api_instance.resource_controller_k8_service_get_controller_apps(controller_id, modified_since=modified_since)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controller_apps:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controller_apps: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller_id** | **str**| The ID of the controller to get apps for. | 
 **modified_since** | **str**| Only get the apps if any were modified since the given date. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_controller_commands**
> Resourcecontrollerk8v3GetControllerCommandsResponse resource_controller_k8_service_get_controller_commands(controller_id)

GetControllerCommands - Get the commands for the controller to execute.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_controller_commands_response import Resourcecontrollerk8v3GetControllerCommandsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    controller_id = 'controller_id_example' # str | The ID of the controller to get commands for.

    try:
        # GetControllerCommands - Get the commands for the controller to execute.
        api_response = api_instance.resource_controller_k8_service_get_controller_commands(controller_id)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controller_commands:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controller_commands: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller_id** | **str**| The ID of the controller to get commands for. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_controller_jobs**
> Resourcecontrollerk8v3GetControllerJobsResponse resource_controller_k8_service_get_controller_jobs(controller_id, modified_since=modified_since)

GetControllerJobs - Get the jobs for the controller to execute.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_controller_jobs_response import Resourcecontrollerk8v3GetControllerJobsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    controller_id = 'controller_id_example' # str | The ID of the controller to get jobs for.
    modified_since = 'modified_since_example' # str | Optional: Only get the jobs if any were modified since the given date. (optional)

    try:
        # GetControllerJobs - Get the jobs for the controller to execute.
        api_response = api_instance.resource_controller_k8_service_get_controller_jobs(controller_id, modified_since=modified_since)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controller_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controller_jobs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller_id** | **str**| The ID of the controller to get jobs for. | 
 **modified_since** | **str**| Optional: Only get the jobs if any were modified since the given date. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_controller_status**
> Resourcecontrollerk8v3ControllerStatus resource_controller_k8_service_get_controller_status(controller_id)

GetControllerStatus - Get the status for the given controller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller_status import Resourcecontrollerk8v3ControllerStatus
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    controller_id = 'controller_id_example' # str | The ID of the controller to get the status.

    try:
        # GetControllerStatus - Get the status for the given controller.
        api_response = api_instance.resource_controller_k8_service_get_controller_status(controller_id)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controller_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controller_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller_id** | **str**| The ID of the controller to get the status. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_controllers**
> Resourcecontrollerk8v3GetControllersResponse resource_controller_k8_service_get_controllers(tenant_id, want_local=want_local)

GetControllers - Get the controllers for the given tenant.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_controllers_response import Resourcecontrollerk8v3GetControllersResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | The ID of the tenant to get controllers for.
    want_local = True # bool | Used to indicate the caller wants the local controller. (optional)

    try:
        # GetControllers - Get the controllers for the given tenant.
        api_response = api_instance.resource_controller_k8_service_get_controllers(tenant_id, want_local=want_local)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controllers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controllers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| The ID of the tenant to get controllers for. | 
 **want_local** | **bool**| Used to indicate the caller wants the local controller. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_controllers_with_status**
> Resourcecontrollerk8v3GetControllersWithStatusResponse resource_controller_k8_service_get_controllers_with_status(tenant_id, want_local=want_local, controller_id=controller_id)

GetControllersWithStatus - Get the controllers for the given tenant with computed status.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_controllers_with_status_response import Resourcecontrollerk8v3GetControllersWithStatusResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | The ID of the tenant to get controllers for.
    want_local = True # bool | Used to indicate the caller wants the local controller. (optional)
    controller_id = 'controller_id_example' # str | \"ALL\": for getting all controllers; <controller_id>: for getting single controller. (optional)

    try:
        # GetControllersWithStatus - Get the controllers for the given tenant with computed status.
        api_response = api_instance.resource_controller_k8_service_get_controllers_with_status(tenant_id, want_local=want_local, controller_id=controller_id)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controllers_with_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_controllers_with_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| The ID of the tenant to get controllers for. | 
 **want_local** | **bool**| Used to indicate the caller wants the local controller. | [optional] 
 **controller_id** | **str**| \&quot;ALL\&quot;: for getting all controllers; &lt;controller_id&gt;: for getting single controller. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_job**
> Resourcecontrollerk8v3Job resource_controller_k8_service_get_job(job_id, want_secret_values=want_secret_values)

GetJob - Get the job.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_job import Resourcecontrollerk8v3Job
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    job_id = 'job_id_example' # str | The ID of the job to get.
    want_secret_values = True # bool | Optional: True to return secret values, false otherwise. (optional)

    try:
        # GetJob - Get the job.
        api_response = api_instance.resource_controller_k8_service_get_job(job_id, want_secret_values=want_secret_values)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **str**| The ID of the job to get. | 
 **want_secret_values** | **bool**| Optional: True to return secret values, false otherwise. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_job_execution**
> Resourcecontrollerk8v3JobExecution resource_controller_k8_service_get_job_execution(jobexe_id)

GetJobExecution - Get a job execution.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_job_execution import Resourcecontrollerk8v3JobExecution
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    jobexe_id = 'jobexe_id_example' # str | The ID of the job execution to get.

    try:
        # GetJobExecution - Get a job execution.
        api_response = api_instance.resource_controller_k8_service_get_job_execution(jobexe_id)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_job_execution:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_job_execution: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobexe_id** | **str**| The ID of the job execution to get. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_job_executions**
> Resourcecontrollerk8v3GetJobExecutionsResponse resource_controller_k8_service_get_job_executions(job_id)

GetJobExecutions - Get the job executions.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_job_executions_response import Resourcecontrollerk8v3GetJobExecutionsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    job_id = 'job_id_example' # str | The ID of the job to get status.

    try:
        # GetJobExecutions - Get the job executions.
        api_response = api_instance.resource_controller_k8_service_get_job_executions(job_id)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_job_executions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_job_executions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **str**| The ID of the job to get status. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_job_status**
> Resourcecontrollerk8v3JobStatusDTO resource_controller_k8_service_get_job_status(job_id)

GetJobStatus - Get the job's status.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_job_status_dto import Resourcecontrollerk8v3JobStatusDTO
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    job_id = 'job_id_example' # str | The ID of the job to get status.

    try:
        # GetJobStatus - Get the job's status.
        api_response = api_instance.resource_controller_k8_service_get_job_status(job_id)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_job_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_job_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **str**| The ID of the job to get status. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_tenant_app**
> Resourcecontrollerk8v3App resource_controller_k8_service_get_tenant_app(tenant_id, app_name, return_level=return_level)

GetTenantApp - Get a specific app for the given tenant.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_app import Resourcecontrollerk8v3App
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | The ID of the tenant to get apps for.
    app_name = 'app_name_example' # str | The name of the app to get.
    return_level = 'return_level_example' # str | Optional: specify a return level for the data. This will control the amount of data returned. (optional)

    try:
        # GetTenantApp - Get a specific app for the given tenant.
        api_response = api_instance.resource_controller_k8_service_get_tenant_app(tenant_id, app_name, return_level=return_level)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_tenant_app:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_tenant_app: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| The ID of the tenant to get apps for. | 
 **app_name** | **str**| The name of the app to get. | 
 **return_level** | **str**| Optional: specify a return level for the data. This will control the amount of data returned. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_tenant_apps**
> Resourcecontrollerk8v3GetTenantAppsResponse resource_controller_k8_service_get_tenant_apps(tenant_id, return_level=return_level)

GetTenantApps - Get the apps for the given tenant.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_tenant_apps_response import Resourcecontrollerk8v3GetTenantAppsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | The ID of the tenant to get apps for.
    return_level = 'return_level_example' # str | Optional: specify a return level for the data. This will control the amount of data returned. (optional)

    try:
        # GetTenantApps - Get the apps for the given tenant.
        api_response = api_instance.resource_controller_k8_service_get_tenant_apps(tenant_id, return_level=return_level)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_tenant_apps:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_tenant_apps: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| The ID of the tenant to get apps for. | 
 **return_level** | **str**| Optional: specify a return level for the data. This will control the amount of data returned. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_tenant_jobs**
> Resourcecontrollerk8v3GetTenantJobsResponse resource_controller_k8_service_get_tenant_jobs(tenant_id)

GetTenantJobs - Get jobs for the given tenant.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_tenant_jobs_response import Resourcecontrollerk8v3GetTenantJobsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | The ID of the tenant to get jobs for.

    try:
        # GetTenantJobs - Get jobs for the given tenant.
        api_response = api_instance.resource_controller_k8_service_get_tenant_jobs(tenant_id)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_tenant_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_tenant_jobs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| The ID of the tenant to get jobs for. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_get_version**
> Resourcecontrollerk8v3Version resource_controller_k8_service_get_version()

GetVersion - Get the system version information for the service.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_version import Resourcecontrollerk8v3Version
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)

    try:
        # GetVersion - Get the system version information for the service.
        api_response = api_instance.resource_controller_k8_service_get_version()
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_get_version:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_get_version: %s\n" % e)
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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_install_edge_tenant_request**
> Resourcecontrollerk8v3EdgeResourceResponse resource_controller_k8_service_install_edge_tenant_request(resourcecontrollerk8v3_edge_tenant_request)

InstallEdgeTenantRequest to Create gi and tnt CRs on edge

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_edge_resource_response import Resourcecontrollerk8v3EdgeResourceResponse
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_edge_tenant_request import Resourcecontrollerk8v3EdgeTenantRequest
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    resourcecontrollerk8v3_edge_tenant_request = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3EdgeTenantRequest() # Resourcecontrollerk8v3EdgeTenantRequest | 

    try:
        # InstallEdgeTenantRequest to Create gi and tnt CRs on edge
        api_response = api_instance.resource_controller_k8_service_install_edge_tenant_request(resourcecontrollerk8v3_edge_tenant_request)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_install_edge_tenant_request:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_install_edge_tenant_request: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3_edge_tenant_request** | [**Resourcecontrollerk8v3EdgeTenantRequest**](Resourcecontrollerk8v3EdgeTenantRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_query_controller_logs**
> Resourcecontrollerk8v3QueryControllerLogsResponse resource_controller_k8_service_query_controller_logs(controller_id, resourcecontrollerk8v3_query_controller_logs_request)

QueryControllerLogs - Query for the controller logs for a running controller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_query_controller_logs_request import Resourcecontrollerk8v3QueryControllerLogsRequest
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_query_controller_logs_response import Resourcecontrollerk8v3QueryControllerLogsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    controller_id = 'controller_id_example' # str | The ID of the controller to get logs for.
    resourcecontrollerk8v3_query_controller_logs_request = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3QueryControllerLogsRequest() # Resourcecontrollerk8v3QueryControllerLogsRequest | 

    try:
        # QueryControllerLogs - Query for the controller logs for a running controller.
        api_response = api_instance.resource_controller_k8_service_query_controller_logs(controller_id, resourcecontrollerk8v3_query_controller_logs_request)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_query_controller_logs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_query_controller_logs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller_id** | **str**| The ID of the controller to get logs for. | 
 **resourcecontrollerk8v3_query_controller_logs_request** | [**Resourcecontrollerk8v3QueryControllerLogsRequest**](Resourcecontrollerk8v3QueryControllerLogsRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_update_command**
> Resourcecontrollerk8v3ControllerCommand resource_controller_k8_service_update_command(id, resourcecontrollerk8v3_controller_command)

UpdateCommand - Update the command.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller_command import Resourcecontrollerk8v3ControllerCommand
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    id = 'id_example' # str | The ID of the command.
    resourcecontrollerk8v3_controller_command = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3ControllerCommand() # Resourcecontrollerk8v3ControllerCommand | 

    try:
        # UpdateCommand - Update the command.
        api_response = api_instance.resource_controller_k8_service_update_command(id, resourcecontrollerk8v3_controller_command)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_update_command:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_update_command: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the command. | 
 **resourcecontrollerk8v3_controller_command** | [**Resourcecontrollerk8v3ControllerCommand**](Resourcecontrollerk8v3ControllerCommand.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_update_controller**
> Resourcecontrollerk8v3Controller resource_controller_k8_service_update_controller(id, resourcecontrollerk8v3_controller)

UpdateController - Update an existing controller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller import Resourcecontrollerk8v3Controller
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    id = 'id_example' # str | Optional: The internal ID of the controller.
    resourcecontrollerk8v3_controller = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3Controller() # Resourcecontrollerk8v3Controller | 

    try:
        # UpdateController - Update an existing controller.
        api_response = api_instance.resource_controller_k8_service_update_controller(id, resourcecontrollerk8v3_controller)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_update_controller:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_update_controller: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Optional: The internal ID of the controller. | 
 **resourcecontrollerk8v3_controller** | [**Resourcecontrollerk8v3Controller**](Resourcecontrollerk8v3Controller.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_update_controller_status**
> Resourcecontrollerk8v3ControllerStatus resource_controller_k8_service_update_controller_status(id, resourcecontrollerk8v3_controller_status)

UpdateControllerStatus - Updates the status for the given controller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller_status import Resourcecontrollerk8v3ControllerStatus
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    id = 'id_example' # str | The internal ID of the controller.
    resourcecontrollerk8v3_controller_status = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3ControllerStatus() # Resourcecontrollerk8v3ControllerStatus | 

    try:
        # UpdateControllerStatus - Updates the status for the given controller.
        api_response = api_instance.resource_controller_k8_service_update_controller_status(id, resourcecontrollerk8v3_controller_status)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_update_controller_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_update_controller_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The internal ID of the controller. | 
 **resourcecontrollerk8v3_controller_status** | [**Resourcecontrollerk8v3ControllerStatus**](Resourcecontrollerk8v3ControllerStatus.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_update_edge_tenant_request**
> Resourcecontrollerk8v3EdgeResourceResponse resource_controller_k8_service_update_edge_tenant_request(edge_id, resourcecontrollerk8v3_edge_tenant_request)

UpdateEdgeTenantRequest to update gi and tnt CRs on edge

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_edge_resource_response import Resourcecontrollerk8v3EdgeResourceResponse
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_edge_tenant_request import Resourcecontrollerk8v3EdgeTenantRequest
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    edge_id = 'edge_id_example' # str | ID of the edge system
    resourcecontrollerk8v3_edge_tenant_request = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3EdgeTenantRequest() # Resourcecontrollerk8v3EdgeTenantRequest | 

    try:
        # UpdateEdgeTenantRequest to update gi and tnt CRs on edge
        api_response = api_instance.resource_controller_k8_service_update_edge_tenant_request(edge_id, resourcecontrollerk8v3_edge_tenant_request)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_update_edge_tenant_request:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_update_edge_tenant_request: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edge_id** | **str**| ID of the edge system | 
 **resourcecontrollerk8v3_edge_tenant_request** | [**Resourcecontrollerk8v3EdgeTenantRequest**](Resourcecontrollerk8v3EdgeTenantRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_update_job**
> Resourcecontrollerk8v3Job resource_controller_k8_service_update_job(id, resourcecontrollerk8v3_job)

UpdateJob - Update a job.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_job import Resourcecontrollerk8v3Job
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    id = 'id_example' # str | The ID of the job.
    resourcecontrollerk8v3_job = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3Job() # Resourcecontrollerk8v3Job | 

    try:
        # UpdateJob - Update a job.
        api_response = api_instance.resource_controller_k8_service_update_job(id, resourcecontrollerk8v3_job)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_update_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_update_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the job. | 
 **resourcecontrollerk8v3_job** | [**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_update_job_execution**
> Resourcecontrollerk8v3JobExecution resource_controller_k8_service_update_job_execution(id, resourcecontrollerk8v3_update_job_execution_request)

UpdateJobExecution - Update a job execution.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_job_execution import Resourcecontrollerk8v3JobExecution
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_update_job_execution_request import Resourcecontrollerk8v3UpdateJobExecutionRequest
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    id = 'id_example' # str | The ID of the job execution to update.
    resourcecontrollerk8v3_update_job_execution_request = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3UpdateJobExecutionRequest() # Resourcecontrollerk8v3UpdateJobExecutionRequest | 

    try:
        # UpdateJobExecution - Update a job execution.
        api_response = api_instance.resource_controller_k8_service_update_job_execution(id, resourcecontrollerk8v3_update_job_execution_request)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_update_job_execution:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_update_job_execution: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the job execution to update. | 
 **resourcecontrollerk8v3_update_job_execution_request** | [**Resourcecontrollerk8v3UpdateJobExecutionRequest**](Resourcecontrollerk8v3UpdateJobExecutionRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resource_controller_k8_service_update_job_status**
> Resourcecontrollerk8v3JobStatusDTO resource_controller_k8_service_update_job_status(job_id, resourcecontrollerk8v3_update_job_status_request)

UpdateJobStatus - Updates the status for the given Job.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_job_status_dto import Resourcecontrollerk8v3JobStatusDTO
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_update_job_status_request import Resourcecontrollerk8v3UpdateJobStatusRequest
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ResourceControllerK8ServiceApi(api_client)
    job_id = 'job_id_example' # str | The ID of the job to get status.
    resourcecontrollerk8v3_update_job_status_request = ibm_gdsc_sdk_saas.Resourcecontrollerk8v3UpdateJobStatusRequest() # Resourcecontrollerk8v3UpdateJobStatusRequest | 

    try:
        # UpdateJobStatus - Updates the status for the given Job.
        api_response = api_instance.resource_controller_k8_service_update_job_status(job_id, resourcecontrollerk8v3_update_job_status_request)
        print("The response of ResourceControllerK8ServiceApi->resource_controller_k8_service_update_job_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourceControllerK8ServiceApi->resource_controller_k8_service_update_job_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **str**| The ID of the job to get status. | 
 **resourcecontrollerk8v3_update_job_status_request** | [**Resourcecontrollerk8v3UpdateJobStatusRequest**](Resourcecontrollerk8v3UpdateJobStatusRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

