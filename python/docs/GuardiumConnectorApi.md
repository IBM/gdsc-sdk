# ibm_gdsc_sdk_software.GuardiumConnectorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**guardium_connector_add_cm**](GuardiumConnectorApi.md#guardium_connector_add_cm) | **POST** /api/v3/central_managers | Summary: Add CM Description: Add a Central Manager to the tenant database.
[**guardium_connector_add_datamarts**](GuardiumConnectorApi.md#guardium_connector_add_datamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts | Description: stores datamarts details from GDP
[**guardium_connector_add_dm_exclusion**](GuardiumConnectorApi.md#guardium_connector_add_dm_exclusion) | **POST** /api/v3/datamarts/exclusion_list | Summary: Add DM exclusion Description: Add datamart to exclusion list.
[**guardium_connector_add_task**](GuardiumConnectorApi.md#guardium_connector_add_task) | **POST** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Add task Description: Add a task to be executed on GDP.
[**guardium_connector_block_user**](GuardiumConnectorApi.md#guardium_connector_block_user) | **POST** /api/v3/block_user | Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
[**guardium_connector_configure_aggregator_export**](GuardiumConnectorApi.md#guardium_connector_configure_aggregator_export) | **PUT** /api/v3/central_managers/{central_manager_id}/aggregator_config_export | Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
[**guardium_connector_configure_collector_export**](GuardiumConnectorApi.md#guardium_connector_configure_collector_export) | **PUT** /api/v3/central_managers/{central_manager_id}/collector_config_export | Summary: Configure collector export Description: Schedule export historical data for collectors.
[**guardium_connector_configure_streaming**](GuardiumConnectorApi.md#guardium_connector_configure_streaming) | **POST** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Configure streaming Description: Enable or disable streaming.
[**guardium_connector_datamart_version_check**](GuardiumConnectorApi.md#guardium_connector_datamart_version_check) | **POST** /api/v3/central_managers/{central_manager_id}/datamart_version | Description: validates if central manager has datamart support for event model
[**guardium_connector_delete_cm**](GuardiumConnectorApi.md#guardium_connector_delete_cm) | **DELETE** /api/v3/central_managers/{central_manager_id} | Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
[**guardium_connector_delete_dm_exclusion**](GuardiumConnectorApi.md#guardium_connector_delete_dm_exclusion) | **DELETE** /api/v3/datamarts/exclusion_list | Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
[**guardium_connector_delete_task**](GuardiumConnectorApi.md#guardium_connector_delete_task) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Delete task Description: Delete a task by central manager id and task id.
[**guardium_connector_delete_tasks**](GuardiumConnectorApi.md#guardium_connector_delete_tasks) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Delete tasks Description: Delete a central manager&#39;s tasks by central manager id.
[**guardium_connector_get_aggregators_config**](GuardiumConnectorApi.md#guardium_connector_get_aggregators_config) | **GET** /api/v3/central_managers/{central_manager_id}/aggregators_config | Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
[**guardium_connector_get_cms**](GuardiumConnectorApi.md#guardium_connector_get_cms) | **GET** /api/v3/central_managers | Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
[**guardium_connector_get_cms_config**](GuardiumConnectorApi.md#guardium_connector_get_cms_config) | **GET** /api/v3/central_managers_config | Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
[**guardium_connector_get_collectors_config**](GuardiumConnectorApi.md#guardium_connector_get_collectors_config) | **GET** /api/v3/central_managers/{central_manager_id}/collectors_config | Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
[**guardium_connector_get_datamarts**](GuardiumConnectorApi.md#guardium_connector_get_datamarts) | **GET** /api/v3/central_managers/{central_manager_id}/datamarts | Description: returns full list of supported datamarts including type (historical or non-historical)
[**guardium_connector_get_dm_exclusion**](GuardiumConnectorApi.md#guardium_connector_get_dm_exclusion) | **GET** /api/v3/datamarts/exclusion_list | Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
[**guardium_connector_get_gdp_policy_info**](GuardiumConnectorApi.md#guardium_connector_get_gdp_policy_info) | **GET** /api/v3/central_managers/{central_manager_id}/policies/info | Summary: Get guardium policy definition Description: returns the policy definition on the cm
[**guardium_connector_get_gdp_policy_summaries**](GuardiumConnectorApi.md#guardium_connector_get_gdp_policy_summaries) | **GET** /api/v3/central_managers/{central_manager_id}/policies/summaries | Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
[**guardium_connector_get_health_info**](GuardiumConnectorApi.md#guardium_connector_get_health_info) | **GET** /api/v3/central_managers/{central_manager_id}/health_info | Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.
[**guardium_connector_get_latest_dm_extraction_profile**](GuardiumConnectorApi.md#guardium_connector_get_latest_dm_extraction_profile) | **GET** /api/v3/central_managers/{central_manager_id}/datamart_extraction_profile | Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium Insights.
[**guardium_connector_get_streaming_status**](GuardiumConnectorApi.md#guardium_connector_get_streaming_status) | **GET** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Get streaming status Description: Return the streaming configuration.
[**guardium_connector_get_sync_dms**](GuardiumConnectorApi.md#guardium_connector_get_sync_dms) | **GET** /api/v3/central_managers/{central_manager_id}/sync | Summary: Get sync DMs Description: Return the list of tasks from a central manager.
[**guardium_connector_get_task_types**](GuardiumConnectorApi.md#guardium_connector_get_task_types) | **GET** /api/v3/central_managers/task_types | Summary: Get task types Description: Return the list of supported task types.
[**guardium_connector_get_tasks**](GuardiumConnectorApi.md#guardium_connector_get_tasks) | **GET** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Get tasks Description: Return the list of tasks from a central manager.
[**guardium_connector_run_gdp_report**](GuardiumConnectorApi.md#guardium_connector_run_gdp_report) | **POST** /api/v3/central_managers/{central_manager_id}/run_report | Summary: Run GDP report Description: Run GDP report.
[**guardium_connector_setup_cm**](GuardiumConnectorApi.md#guardium_connector_setup_cm) | **POST** /api/v3/central_managers/setup | Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium Insights.
[**guardium_connector_setup_datamarts**](GuardiumConnectorApi.md#guardium_connector_setup_datamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts/setup | Description: setup custom datamart execution mode
[**guardium_connector_task_error**](GuardiumConnectorApi.md#guardium_connector_task_error) | **POST** /api/v3/central_managers/{central_manager_id}/tasks/error | Summary: Task error Description: Log error messages from GDP task execution.
[**guardium_connector_test_database_connection**](GuardiumConnectorApi.md#guardium_connector_test_database_connection) | **POST** /api/v3/test_database | Summary: Test database connection Description: Return database connection results.
[**guardium_connector_update_dm_exclusion**](GuardiumConnectorApi.md#guardium_connector_update_dm_exclusion) | **PUT** /api/v3/datamarts/exclusion_list | Summary: Update DM exclusion Description: Update the atamart exclusion list.
[**guardium_connector_update_streaming**](GuardiumConnectorApi.md#guardium_connector_update_streaming) | **PUT** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Update streaming Description: Update streaming status into GI.
[**guardium_connector_update_task**](GuardiumConnectorApi.md#guardium_connector_update_task) | **PUT** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Update task Description: Update a task that gets executed on GDP.


# **guardium_connector_add_cm**
> Guardiumconnectorv3AddCMResponse guardium_connector_add_cm(guardiumconnectorv3_add_cm_request)

Summary: Add CM Description: Add a Central Manager to the tenant database.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_add_cm_request import Guardiumconnectorv3AddCMRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_add_cm_response import Guardiumconnectorv3AddCMResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    guardiumconnectorv3_add_cm_request = ibm_gdsc_sdk_software.Guardiumconnectorv3AddCMRequest() # Guardiumconnectorv3AddCMRequest | 

    try:
        # Summary: Add CM Description: Add a Central Manager to the tenant database.
        api_response = api_instance.guardium_connector_add_cm(guardiumconnectorv3_add_cm_request)
        print("The response of GuardiumConnectorApi->guardium_connector_add_cm:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_add_cm: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3_add_cm_request** | [**Guardiumconnectorv3AddCMRequest**](Guardiumconnectorv3AddCMRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_add_datamarts**
> Guardiumconnectorv3AddDatamartsResponse guardium_connector_add_datamarts(central_manager_id, guardiumconnectorv3_add_datamarts_request)

Description: stores datamarts details from GDP

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_add_datamarts_request import Guardiumconnectorv3AddDatamartsRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_add_datamarts_response import Guardiumconnectorv3AddDatamartsResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | central manager
    guardiumconnectorv3_add_datamarts_request = ibm_gdsc_sdk_software.Guardiumconnectorv3AddDatamartsRequest() # Guardiumconnectorv3AddDatamartsRequest | 

    try:
        # Description: stores datamarts details from GDP
        api_response = api_instance.guardium_connector_add_datamarts(central_manager_id, guardiumconnectorv3_add_datamarts_request)
        print("The response of GuardiumConnectorApi->guardium_connector_add_datamarts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_add_datamarts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| central manager | 
 **guardiumconnectorv3_add_datamarts_request** | [**Guardiumconnectorv3AddDatamartsRequest**](Guardiumconnectorv3AddDatamartsRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_add_dm_exclusion**
> Guardiumconnectorv3AddDmExclusionResponse guardium_connector_add_dm_exclusion(guardiumconnectorv3_add_dm_exclusion_request)

Summary: Add DM exclusion Description: Add datamart to exclusion list.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_add_dm_exclusion_request import Guardiumconnectorv3AddDmExclusionRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_add_dm_exclusion_response import Guardiumconnectorv3AddDmExclusionResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    guardiumconnectorv3_add_dm_exclusion_request = ibm_gdsc_sdk_software.Guardiumconnectorv3AddDmExclusionRequest() # Guardiumconnectorv3AddDmExclusionRequest | 

    try:
        # Summary: Add DM exclusion Description: Add datamart to exclusion list.
        api_response = api_instance.guardium_connector_add_dm_exclusion(guardiumconnectorv3_add_dm_exclusion_request)
        print("The response of GuardiumConnectorApi->guardium_connector_add_dm_exclusion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_add_dm_exclusion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3_add_dm_exclusion_request** | [**Guardiumconnectorv3AddDmExclusionRequest**](Guardiumconnectorv3AddDmExclusionRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_add_task**
> Guardiumconnectorv3AddTaskResponse guardium_connector_add_task(central_manager_id, guardiumconnectorv3_add_task_request)

Summary: Add task Description: Add a task to be executed on GDP.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_add_task_request import Guardiumconnectorv3AddTaskRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_add_task_response import Guardiumconnectorv3AddTaskResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.
    guardiumconnectorv3_add_task_request = ibm_gdsc_sdk_software.Guardiumconnectorv3AddTaskRequest() # Guardiumconnectorv3AddTaskRequest | 

    try:
        # Summary: Add task Description: Add a task to be executed on GDP.
        api_response = api_instance.guardium_connector_add_task(central_manager_id, guardiumconnectorv3_add_task_request)
        print("The response of GuardiumConnectorApi->guardium_connector_add_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_add_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 
 **guardiumconnectorv3_add_task_request** | [**Guardiumconnectorv3AddTaskRequest**](Guardiumconnectorv3AddTaskRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_block_user**
> Guardiumconnectorv3BlockUserResponse guardium_connector_block_user(guardiumconnectorv3_block_user_request)

Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_block_user_request import Guardiumconnectorv3BlockUserRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_block_user_response import Guardiumconnectorv3BlockUserResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    guardiumconnectorv3_block_user_request = ibm_gdsc_sdk_software.Guardiumconnectorv3BlockUserRequest() # Guardiumconnectorv3BlockUserRequest | 

    try:
        # Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
        api_response = api_instance.guardium_connector_block_user(guardiumconnectorv3_block_user_request)
        print("The response of GuardiumConnectorApi->guardium_connector_block_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_block_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3_block_user_request** | [**Guardiumconnectorv3BlockUserRequest**](Guardiumconnectorv3BlockUserRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_configure_aggregator_export**
> Guardiumconnectorv3ConfigureAggregatorExportResponse guardium_connector_configure_aggregator_export(central_manager_id, guardiumconnectorv3_configure_aggregator_export_request)

Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_configure_aggregator_export_request import Guardiumconnectorv3ConfigureAggregatorExportRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_configure_aggregator_export_response import Guardiumconnectorv3ConfigureAggregatorExportResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central Manager ID.
    guardiumconnectorv3_configure_aggregator_export_request = ibm_gdsc_sdk_software.Guardiumconnectorv3ConfigureAggregatorExportRequest() # Guardiumconnectorv3ConfigureAggregatorExportRequest | 

    try:
        # Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
        api_response = api_instance.guardium_connector_configure_aggregator_export(central_manager_id, guardiumconnectorv3_configure_aggregator_export_request)
        print("The response of GuardiumConnectorApi->guardium_connector_configure_aggregator_export:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_configure_aggregator_export: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central Manager ID. | 
 **guardiumconnectorv3_configure_aggregator_export_request** | [**Guardiumconnectorv3ConfigureAggregatorExportRequest**](Guardiumconnectorv3ConfigureAggregatorExportRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_configure_collector_export**
> Guardiumconnectorv3ConfigureCollectorExportResponse guardium_connector_configure_collector_export(central_manager_id, guardiumconnectorv3_configure_collector_export_request)

Summary: Configure collector export Description: Schedule export historical data for collectors.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_configure_collector_export_request import Guardiumconnectorv3ConfigureCollectorExportRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_configure_collector_export_response import Guardiumconnectorv3ConfigureCollectorExportResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central Manager ID.
    guardiumconnectorv3_configure_collector_export_request = ibm_gdsc_sdk_software.Guardiumconnectorv3ConfigureCollectorExportRequest() # Guardiumconnectorv3ConfigureCollectorExportRequest | 

    try:
        # Summary: Configure collector export Description: Schedule export historical data for collectors.
        api_response = api_instance.guardium_connector_configure_collector_export(central_manager_id, guardiumconnectorv3_configure_collector_export_request)
        print("The response of GuardiumConnectorApi->guardium_connector_configure_collector_export:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_configure_collector_export: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central Manager ID. | 
 **guardiumconnectorv3_configure_collector_export_request** | [**Guardiumconnectorv3ConfigureCollectorExportRequest**](Guardiumconnectorv3ConfigureCollectorExportRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_configure_streaming**
> Guardiumconnectorv3ConfigureStreamingResponse guardium_connector_configure_streaming(central_manager_id, guardiumconnectorv3_configure_streaming_request)

Summary: Configure streaming Description: Enable or disable streaming.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_configure_streaming_request import Guardiumconnectorv3ConfigureStreamingRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_configure_streaming_response import Guardiumconnectorv3ConfigureStreamingResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central Manager ID.
    guardiumconnectorv3_configure_streaming_request = ibm_gdsc_sdk_software.Guardiumconnectorv3ConfigureStreamingRequest() # Guardiumconnectorv3ConfigureStreamingRequest | 

    try:
        # Summary: Configure streaming Description: Enable or disable streaming.
        api_response = api_instance.guardium_connector_configure_streaming(central_manager_id, guardiumconnectorv3_configure_streaming_request)
        print("The response of GuardiumConnectorApi->guardium_connector_configure_streaming:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_configure_streaming: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central Manager ID. | 
 **guardiumconnectorv3_configure_streaming_request** | [**Guardiumconnectorv3ConfigureStreamingRequest**](Guardiumconnectorv3ConfigureStreamingRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_datamart_version_check**
> Guardiumconnectorv3DatamartVersionResponse guardium_connector_datamart_version_check(central_manager_id, guardiumconnectorv3_datamart_version_request)

Description: validates if central manager has datamart support for event model

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_datamart_version_request import Guardiumconnectorv3DatamartVersionRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_datamart_version_response import Guardiumconnectorv3DatamartVersionResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central manager
    guardiumconnectorv3_datamart_version_request = ibm_gdsc_sdk_software.Guardiumconnectorv3DatamartVersionRequest() # Guardiumconnectorv3DatamartVersionRequest | 

    try:
        # Description: validates if central manager has datamart support for event model
        api_response = api_instance.guardium_connector_datamart_version_check(central_manager_id, guardiumconnectorv3_datamart_version_request)
        print("The response of GuardiumConnectorApi->guardium_connector_datamart_version_check:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_datamart_version_check: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central manager | 
 **guardiumconnectorv3_datamart_version_request** | [**Guardiumconnectorv3DatamartVersionRequest**](Guardiumconnectorv3DatamartVersionRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_delete_cm**
> Guardiumconnectorv3DeleteCMResponse guardium_connector_delete_cm(central_manager_id, force=force)

Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_delete_cm_response import Guardiumconnectorv3DeleteCMResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central Manager ID.
    force = 56 # int | Flag to force delete CM and associated tasks (0=validate CM is online before deleting, 1=force delete CM). (optional)

    try:
        # Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
        api_response = api_instance.guardium_connector_delete_cm(central_manager_id, force=force)
        print("The response of GuardiumConnectorApi->guardium_connector_delete_cm:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_delete_cm: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central Manager ID. | 
 **force** | **int**| Flag to force delete CM and associated tasks (0&#x3D;validate CM is online before deleting, 1&#x3D;force delete CM). | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_delete_dm_exclusion**
> Guardiumconnectorv3DeleteDmExclusionResponse guardium_connector_delete_dm_exclusion(datamart=datamart)

Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_delete_dm_exclusion_response import Guardiumconnectorv3DeleteDmExclusionResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    datamart = 'datamart_example' # str | Datamart name. (optional)

    try:
        # Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
        api_response = api_instance.guardium_connector_delete_dm_exclusion(datamart=datamart)
        print("The response of GuardiumConnectorApi->guardium_connector_delete_dm_exclusion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_delete_dm_exclusion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datamart** | **str**| Datamart name. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_delete_task**
> Guardiumconnectorv3DeleteTaskResponse guardium_connector_delete_task(central_manager_id, task_id)

Summary: Delete task Description: Delete a task by central manager id and task id.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_delete_task_response import Guardiumconnectorv3DeleteTaskResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.
    task_id = 'task_id_example' # str | ID of task being deleted.

    try:
        # Summary: Delete task Description: Delete a task by central manager id and task id.
        api_response = api_instance.guardium_connector_delete_task(central_manager_id, task_id)
        print("The response of GuardiumConnectorApi->guardium_connector_delete_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_delete_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 
 **task_id** | **str**| ID of task being deleted. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_delete_tasks**
> Guardiumconnectorv3DeleteTasksResponse guardium_connector_delete_tasks(central_manager_id)

Summary: Delete tasks Description: Delete a central manager's tasks by central manager id.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_delete_tasks_response import Guardiumconnectorv3DeleteTasksResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.

    try:
        # Summary: Delete tasks Description: Delete a central manager's tasks by central manager id.
        api_response = api_instance.guardium_connector_delete_tasks(central_manager_id)
        print("The response of GuardiumConnectorApi->guardium_connector_delete_tasks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_delete_tasks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_aggregators_config**
> Guardiumconnectorv3GetAggregatorsConfigResponse guardium_connector_get_aggregators_config(central_manager_id)

Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_aggregators_config_response import Guardiumconnectorv3GetAggregatorsConfigResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central Manager ID.

    try:
        # Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
        api_response = api_instance.guardium_connector_get_aggregators_config(central_manager_id)
        print("The response of GuardiumConnectorApi->guardium_connector_get_aggregators_config:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_aggregators_config: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central Manager ID. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_cms**
> Guardiumconnectorv3GetCMsResponse guardium_connector_get_cms(run_additional_checks=run_additional_checks)

Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_cms_response import Guardiumconnectorv3GetCMsResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    run_additional_checks = True # bool | Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager. (optional)

    try:
        # Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
        api_response = api_instance.guardium_connector_get_cms(run_additional_checks=run_additional_checks)
        print("The response of GuardiumConnectorApi->guardium_connector_get_cms:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_cms: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **run_additional_checks** | **bool**| Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_cms_config**
> Guardiumconnectorv3GetCMsConfigResponse guardium_connector_get_cms_config()

Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_cms_config_response import Guardiumconnectorv3GetCMsConfigResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)

    try:
        # Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
        api_response = api_instance.guardium_connector_get_cms_config()
        print("The response of GuardiumConnectorApi->guardium_connector_get_cms_config:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_cms_config: %s\n" % e)
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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_collectors_config**
> Guardiumconnectorv3GetCollectorsConfigResponse guardium_connector_get_collectors_config(central_manager_id)

Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_collectors_config_response import Guardiumconnectorv3GetCollectorsConfigResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central Manager ID.

    try:
        # Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
        api_response = api_instance.guardium_connector_get_collectors_config(central_manager_id)
        print("The response of GuardiumConnectorApi->guardium_connector_get_collectors_config:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_collectors_config: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central Manager ID. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_datamarts**
> Guardiumconnectorv3GetDatamartsResponse guardium_connector_get_datamarts(central_manager_id)

Description: returns full list of supported datamarts including type (historical or non-historical)

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_datamarts_response import Guardiumconnectorv3GetDatamartsResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | central manager hostname

    try:
        # Description: returns full list of supported datamarts including type (historical or non-historical)
        api_response = api_instance.guardium_connector_get_datamarts(central_manager_id)
        print("The response of GuardiumConnectorApi->guardium_connector_get_datamarts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_datamarts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| central manager hostname | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_dm_exclusion**
> Guardiumconnectorv3GetDmExclusionResponse guardium_connector_get_dm_exclusion()

Summary: Get DM exclusion Description: Return datamarts in the exclusion list.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_dm_exclusion_response import Guardiumconnectorv3GetDmExclusionResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)

    try:
        # Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
        api_response = api_instance.guardium_connector_get_dm_exclusion()
        print("The response of GuardiumConnectorApi->guardium_connector_get_dm_exclusion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_dm_exclusion: %s\n" % e)
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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_gdp_policy_info**
> Guardiumconnectorv3GetPolicyInfoResponse guardium_connector_get_gdp_policy_info(central_manager_id, policy_name=policy_name)

Summary: Get guardium policy definition Description: returns the policy definition on the cm

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_policy_info_response import Guardiumconnectorv3GetPolicyInfoResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central manager hostname
    policy_name = 'policy_name_example' # str | Policy name. (optional)

    try:
        # Summary: Get guardium policy definition Description: returns the policy definition on the cm
        api_response = api_instance.guardium_connector_get_gdp_policy_info(central_manager_id, policy_name=policy_name)
        print("The response of GuardiumConnectorApi->guardium_connector_get_gdp_policy_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_gdp_policy_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central manager hostname | 
 **policy_name** | **str**| Policy name. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_gdp_policy_summaries**
> Guardiumconnectorv3GetPolicySummariesResponse guardium_connector_get_gdp_policy_summaries(central_manager_id)

Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_policy_summaries_response import Guardiumconnectorv3GetPolicySummariesResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central manager hostname

    try:
        # Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
        api_response = api_instance.guardium_connector_get_gdp_policy_summaries(central_manager_id)
        print("The response of GuardiumConnectorApi->guardium_connector_get_gdp_policy_summaries:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_gdp_policy_summaries: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central manager hostname | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_health_info**
> Guardiumconnectorv3GetHealthInfoResponse guardium_connector_get_health_info(central_manager_id, use_fallback=use_fallback)

Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_health_info_response import Guardiumconnectorv3GetHealthInfoResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central Manager ID.
    use_fallback = True # bool | Flag indicating if the older gdp api is to be called in case it doesn't support new api. (optional)

    try:
        # Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.
        api_response = api_instance.guardium_connector_get_health_info(central_manager_id, use_fallback=use_fallback)
        print("The response of GuardiumConnectorApi->guardium_connector_get_health_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_health_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central Manager ID. | 
 **use_fallback** | **bool**| Flag indicating if the older gdp api is to be called in case it doesn&#39;t support new api. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_latest_dm_extraction_profile**
> Guardiumconnectorv3GetLatestDMExtractionProfileResponse guardium_connector_get_latest_dm_extraction_profile(central_manager_id)

Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium Insights.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_latest_dm_extraction_profile_response import Guardiumconnectorv3GetLatestDMExtractionProfileResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central Manager ID.

    try:
        # Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium Insights.
        api_response = api_instance.guardium_connector_get_latest_dm_extraction_profile(central_manager_id)
        print("The response of GuardiumConnectorApi->guardium_connector_get_latest_dm_extraction_profile:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_latest_dm_extraction_profile: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central Manager ID. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_streaming_status**
> Guardiumconnectorv3GetStreamingStatusResponse guardium_connector_get_streaming_status(central_manager_id)

Summary: Get streaming status Description: Return the streaming configuration.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_streaming_status_response import Guardiumconnectorv3GetStreamingStatusResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central Manager ID.

    try:
        # Summary: Get streaming status Description: Return the streaming configuration.
        api_response = api_instance.guardium_connector_get_streaming_status(central_manager_id)
        print("The response of GuardiumConnectorApi->guardium_connector_get_streaming_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_streaming_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central Manager ID. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_sync_dms**
> Guardiumconnectorv3GetSyncDMsResponse guardium_connector_get_sync_dms(central_manager_id)

Summary: Get sync DMs Description: Return the list of tasks from a central manager.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_sync_dms_response import Guardiumconnectorv3GetSyncDMsResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.

    try:
        # Summary: Get sync DMs Description: Return the list of tasks from a central manager.
        api_response = api_instance.guardium_connector_get_sync_dms(central_manager_id)
        print("The response of GuardiumConnectorApi->guardium_connector_get_sync_dms:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_sync_dms: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_task_types**
> Guardiumconnectorv3GetTaskTypesResponse guardium_connector_get_task_types()

Summary: Get task types Description: Return the list of supported task types.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_task_types_response import Guardiumconnectorv3GetTaskTypesResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)

    try:
        # Summary: Get task types Description: Return the list of supported task types.
        api_response = api_instance.guardium_connector_get_task_types()
        print("The response of GuardiumConnectorApi->guardium_connector_get_task_types:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_task_types: %s\n" % e)
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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_get_tasks**
> Guardiumconnectorv3GetTasksResponse guardium_connector_get_tasks(central_manager_id, task_id=task_id, task_type=task_type, key_object=key_object)

Summary: Get tasks Description: Return the list of tasks from a central manager.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_tasks_response import Guardiumconnectorv3GetTasksResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.
    task_id = 'task_id_example' # str | ID of task. (optional)
    task_type = 'task_type_example' # str | Type of task. (optional)
    key_object = 'key_object_example' # str | Key object. (optional)

    try:
        # Summary: Get tasks Description: Return the list of tasks from a central manager.
        api_response = api_instance.guardium_connector_get_tasks(central_manager_id, task_id=task_id, task_type=task_type, key_object=key_object)
        print("The response of GuardiumConnectorApi->guardium_connector_get_tasks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_get_tasks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 
 **task_id** | **str**| ID of task. | [optional] 
 **task_type** | **str**| Type of task. | [optional] 
 **key_object** | **str**| Key object. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_run_gdp_report**
> Guardiumconnectorv3RunGDPReportResponse guardium_connector_run_gdp_report(central_manager_id, guardiumconnectorv3_run_gdp_report_request)

Summary: Run GDP report Description: Run GDP report.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_run_gdp_report_request import Guardiumconnectorv3RunGDPReportRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_run_gdp_report_response import Guardiumconnectorv3RunGDPReportResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central Manager ID.
    guardiumconnectorv3_run_gdp_report_request = ibm_gdsc_sdk_software.Guardiumconnectorv3RunGDPReportRequest() # Guardiumconnectorv3RunGDPReportRequest | 

    try:
        # Summary: Run GDP report Description: Run GDP report.
        api_response = api_instance.guardium_connector_run_gdp_report(central_manager_id, guardiumconnectorv3_run_gdp_report_request)
        print("The response of GuardiumConnectorApi->guardium_connector_run_gdp_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_run_gdp_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central Manager ID. | 
 **guardiumconnectorv3_run_gdp_report_request** | [**Guardiumconnectorv3RunGDPReportRequest**](Guardiumconnectorv3RunGDPReportRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_setup_cm**
> Guardiumconnectorv3SetupCMResponse guardium_connector_setup_cm(guardiumconnectorv3_setup_cm_request)

Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium Insights.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_setup_cm_request import Guardiumconnectorv3SetupCMRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_setup_cm_response import Guardiumconnectorv3SetupCMResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    guardiumconnectorv3_setup_cm_request = ibm_gdsc_sdk_software.Guardiumconnectorv3SetupCMRequest() # Guardiumconnectorv3SetupCMRequest | 

    try:
        # Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium Insights.
        api_response = api_instance.guardium_connector_setup_cm(guardiumconnectorv3_setup_cm_request)
        print("The response of GuardiumConnectorApi->guardium_connector_setup_cm:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_setup_cm: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3_setup_cm_request** | [**Guardiumconnectorv3SetupCMRequest**](Guardiumconnectorv3SetupCMRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_setup_datamarts**
> Guardiumconnectorv3SetupDatamartsResponse guardium_connector_setup_datamarts(central_manager_id, guardiumconnectorv3_setup_datamarts_request)

Description: setup custom datamart execution mode

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_setup_datamarts_request import Guardiumconnectorv3SetupDatamartsRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_setup_datamarts_response import Guardiumconnectorv3SetupDatamartsResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | central manager
    guardiumconnectorv3_setup_datamarts_request = ibm_gdsc_sdk_software.Guardiumconnectorv3SetupDatamartsRequest() # Guardiumconnectorv3SetupDatamartsRequest | 

    try:
        # Description: setup custom datamart execution mode
        api_response = api_instance.guardium_connector_setup_datamarts(central_manager_id, guardiumconnectorv3_setup_datamarts_request)
        print("The response of GuardiumConnectorApi->guardium_connector_setup_datamarts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_setup_datamarts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| central manager | 
 **guardiumconnectorv3_setup_datamarts_request** | [**Guardiumconnectorv3SetupDatamartsRequest**](Guardiumconnectorv3SetupDatamartsRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_task_error**
> Guardiumconnectorv3TaskErrorResponse guardium_connector_task_error(central_manager_id, guardiumconnectorv3_task_error_request)

Summary: Task error Description: Log error messages from GDP task execution.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_task_error_request import Guardiumconnectorv3TaskErrorRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_task_error_response import Guardiumconnectorv3TaskErrorResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.
    guardiumconnectorv3_task_error_request = ibm_gdsc_sdk_software.Guardiumconnectorv3TaskErrorRequest() # Guardiumconnectorv3TaskErrorRequest | 

    try:
        # Summary: Task error Description: Log error messages from GDP task execution.
        api_response = api_instance.guardium_connector_task_error(central_manager_id, guardiumconnectorv3_task_error_request)
        print("The response of GuardiumConnectorApi->guardium_connector_task_error:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_task_error: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 
 **guardiumconnectorv3_task_error_request** | [**Guardiumconnectorv3TaskErrorRequest**](Guardiumconnectorv3TaskErrorRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_test_database_connection**
> Guardiumconnectorv3DatabaseResultResponse guardium_connector_test_database_connection(guardiumconnectorv3_database_connection_string_request)

Summary: Test database connection Description: Return database connection results.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_database_connection_string_request import Guardiumconnectorv3DatabaseConnectionStringRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_database_result_response import Guardiumconnectorv3DatabaseResultResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
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
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    guardiumconnectorv3_database_connection_string_request = ibm_gdsc_sdk_software.Guardiumconnectorv3DatabaseConnectionStringRequest() # Guardiumconnectorv3DatabaseConnectionStringRequest | 

    try:
        # Summary: Test database connection Description: Return database connection results.
        api_response = api_instance.guardium_connector_test_database_connection(guardiumconnectorv3_database_connection_string_request)
        print("The response of GuardiumConnectorApi->guardium_connector_test_database_connection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_test_database_connection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3_database_connection_string_request** | [**Guardiumconnectorv3DatabaseConnectionStringRequest**](Guardiumconnectorv3DatabaseConnectionStringRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_update_dm_exclusion**
> Guardiumconnectorv3UpdateDmExclusionResponse guardium_connector_update_dm_exclusion(guardiumconnectorv3_update_dm_exclusion_request)

Summary: Update DM exclusion Description: Update the atamart exclusion list.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_update_dm_exclusion_request import Guardiumconnectorv3UpdateDmExclusionRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_update_dm_exclusion_response import Guardiumconnectorv3UpdateDmExclusionResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    guardiumconnectorv3_update_dm_exclusion_request = ibm_gdsc_sdk_software.Guardiumconnectorv3UpdateDmExclusionRequest() # Guardiumconnectorv3UpdateDmExclusionRequest | 

    try:
        # Summary: Update DM exclusion Description: Update the atamart exclusion list.
        api_response = api_instance.guardium_connector_update_dm_exclusion(guardiumconnectorv3_update_dm_exclusion_request)
        print("The response of GuardiumConnectorApi->guardium_connector_update_dm_exclusion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_update_dm_exclusion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3_update_dm_exclusion_request** | [**Guardiumconnectorv3UpdateDmExclusionRequest**](Guardiumconnectorv3UpdateDmExclusionRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_update_streaming**
> Guardiumconnectorv3UpdateStreamingResponse guardium_connector_update_streaming(central_manager_id, guardiumconnectorv3_update_streaming_request)

Summary: Update streaming Description: Update streaming status into GI.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_update_streaming_request import Guardiumconnectorv3UpdateStreamingRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_update_streaming_response import Guardiumconnectorv3UpdateStreamingResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.
    guardiumconnectorv3_update_streaming_request = ibm_gdsc_sdk_software.Guardiumconnectorv3UpdateStreamingRequest() # Guardiumconnectorv3UpdateStreamingRequest | 

    try:
        # Summary: Update streaming Description: Update streaming status into GI.
        api_response = api_instance.guardium_connector_update_streaming(central_manager_id, guardiumconnectorv3_update_streaming_request)
        print("The response of GuardiumConnectorApi->guardium_connector_update_streaming:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_update_streaming: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 
 **guardiumconnectorv3_update_streaming_request** | [**Guardiumconnectorv3UpdateStreamingRequest**](Guardiumconnectorv3UpdateStreamingRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guardium_connector_update_task**
> Guardiumconnectorv3UpdateTaskResponse guardium_connector_update_task(central_manager_id, task_id, guardiumconnectorv3_update_task_request)

Summary: Update task Description: Update a task that gets executed on GDP.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_update_task_request import Guardiumconnectorv3UpdateTaskRequest
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_update_task_response import Guardiumconnectorv3UpdateTaskResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.GuardiumConnectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.
    task_id = 'task_id_example' # str | ID of task being updated.
    guardiumconnectorv3_update_task_request = ibm_gdsc_sdk_software.Guardiumconnectorv3UpdateTaskRequest() # Guardiumconnectorv3UpdateTaskRequest | 

    try:
        # Summary: Update task Description: Update a task that gets executed on GDP.
        api_response = api_instance.guardium_connector_update_task(central_manager_id, task_id, guardiumconnectorv3_update_task_request)
        print("The response of GuardiumConnectorApi->guardium_connector_update_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GuardiumConnectorApi->guardium_connector_update_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 
 **task_id** | **str**| ID of task being updated. | 
 **guardiumconnectorv3_update_task_request** | [**Guardiumconnectorv3UpdateTaskRequest**](Guardiumconnectorv3UpdateTaskRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

