# ibm_gdsc_sdk_saas.WorkflowApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workflow_create_case**](WorkflowApi.md#workflow_create_case) | **POST** /api/v3/cases | Summary: Create case Description: Create single case.
[**workflow_create_product_entity**](WorkflowApi.md#workflow_create_product_entity) | **POST** /api/v3/workflow/productentities | Summary: Create product entity Description: Create single product entity.
[**workflow_create_task**](WorkflowApi.md#workflow_create_task) | **POST** /api/v3/cases/{case_id}/tasks | Summary: Create task Description: Create single task within a parent case.
[**workflow_create_workflow_event**](WorkflowApi.md#workflow_create_workflow_event) | **POST** /api/v3/workflow/event | Summary: Post event for processing by workflow rules Description: Find matching workflow rule and run it
[**workflow_delete_product_entity**](WorkflowApi.md#workflow_delete_product_entity) | **DELETE** /api/v3/workflow/productentities/{entity_id} | Summary: Delete a product entity Description: Delete a single product entity.
[**workflow_get_cases**](WorkflowApi.md#workflow_get_cases) | **GET** /api/v3/cases | Summary: Get cases Description: Return all cases requested.
[**workflow_get_cases_count**](WorkflowApi.md#workflow_get_cases_count) | **POST** /api/v3/cases/count | Summary: Get cases count Description: Get case count.
[**workflow_get_filename**](WorkflowApi.md#workflow_get_filename) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/filename | Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
[**workflow_get_jobs_count**](WorkflowApi.md#workflow_get_jobs_count) | **POST** /api/v3/cases/{case_id}/jobs/count | Summary: Get jobs count Description: Get jobs count.
[**workflow_get_product_entities**](WorkflowApi.md#workflow_get_product_entities) | **GET** /api/v3/workflow/productentities | Summary: Get products and their associated event entities Description: Return a list of integrated products and their associated event entities
[**workflow_get_product_entity**](WorkflowApi.md#workflow_get_product_entity) | **GET** /api/v3/workflow/productentities/{entity_id} | Summary: Get event entity field names, field labels, and field data types Description: Return a list of fields similar to report headers
[**workflow_get_report_result**](WorkflowApi.md#workflow_get_report_result) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/result | Summary: Get report result Description: Return a page of results.
[**workflow_get_tasks**](WorkflowApi.md#workflow_get_tasks) | **GET** /api/v3/cases/{case_id}/tasks | Summary: Get tasks Description: Return all tasks requested.
[**workflow_get_tasks_count**](WorkflowApi.md#workflow_get_tasks_count) | **POST** /api/v3/cases/{case_id}/tasks/count | Summary: Get cases count Description: Get case count.
[**workflow_search_cases**](WorkflowApi.md#workflow_search_cases) | **POST** /api/v3/cases/search | Summary: Search cases Description: Return a subset of cases.
[**workflow_search_reports**](WorkflowApi.md#workflow_search_reports) | **POST** /api/v3/cases/reports | Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
[**workflow_search_tasks**](WorkflowApi.md#workflow_search_tasks) | **POST** /api/v3/cases/{case_id}/tasks/search | Summary: Search cases Description: Return a subset of cases.
[**workflow_update_cases**](WorkflowApi.md#workflow_update_cases) | **PUT** /api/v3/cases | Summary: Update cases Description: Update multiple cases in one request.
[**workflow_update_product_entity**](WorkflowApi.md#workflow_update_product_entity) | **PUT** /api/v3/workflow/productentities/{entity_id} | Summary: Update a product entity Description: Update a single product entity.
[**workflow_update_tasks**](WorkflowApi.md#workflow_update_tasks) | **PUT** /api/v3/cases/{case_id}/tasks | Summary: Update tasks Description: Update multiple tasks for the same parent in one request.


# **workflow_create_case**
> Workflowv3CreateCaseResponse workflow_create_case(workflowv3_create_case_request)

Summary: Create case Description: Create single case.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_create_case_request import Workflowv3CreateCaseRequest
from ibm_gdsc_sdk_saas.models.workflowv3_create_case_response import Workflowv3CreateCaseResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    workflowv3_create_case_request = ibm_gdsc_sdk_saas.Workflowv3CreateCaseRequest() # Workflowv3CreateCaseRequest | 

    try:
        # Summary: Create case Description: Create single case.
        api_response = api_instance.workflow_create_case(workflowv3_create_case_request)
        print("The response of WorkflowApi->workflow_create_case:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_create_case: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3_create_case_request** | [**Workflowv3CreateCaseRequest**](Workflowv3CreateCaseRequest.md)|  | 

### Return type

[**Workflowv3CreateCaseResponse**](Workflowv3CreateCaseResponse.md)

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

# **workflow_create_product_entity**
> Workflowv3CreateProductEntityResponse workflow_create_product_entity(workflowv3_product_entity)

Summary: Create product entity Description: Create single product entity.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_create_product_entity_response import Workflowv3CreateProductEntityResponse
from ibm_gdsc_sdk_saas.models.workflowv3_product_entity import Workflowv3ProductEntity
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    workflowv3_product_entity = ibm_gdsc_sdk_saas.Workflowv3ProductEntity() # Workflowv3ProductEntity | 

    try:
        # Summary: Create product entity Description: Create single product entity.
        api_response = api_instance.workflow_create_product_entity(workflowv3_product_entity)
        print("The response of WorkflowApi->workflow_create_product_entity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_create_product_entity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3_product_entity** | [**Workflowv3ProductEntity**](Workflowv3ProductEntity.md)|  | 

### Return type

[**Workflowv3CreateProductEntityResponse**](Workflowv3CreateProductEntityResponse.md)

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

# **workflow_create_task**
> Workflowv3CreateTaskResponse workflow_create_task(case_id, workflowv3_create_task_request)

Summary: Create task Description: Create single task within a parent case.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_create_task_request import Workflowv3CreateTaskRequest
from ibm_gdsc_sdk_saas.models.workflowv3_create_task_response import Workflowv3CreateTaskResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    case_id = 'case_id_example' # str | Create tasks with common parent.
    workflowv3_create_task_request = ibm_gdsc_sdk_saas.Workflowv3CreateTaskRequest() # Workflowv3CreateTaskRequest | 

    try:
        # Summary: Create task Description: Create single task within a parent case.
        api_response = api_instance.workflow_create_task(case_id, workflowv3_create_task_request)
        print("The response of WorkflowApi->workflow_create_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_create_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **case_id** | **str**| Create tasks with common parent. | 
 **workflowv3_create_task_request** | [**Workflowv3CreateTaskRequest**](Workflowv3CreateTaskRequest.md)|  | 

### Return type

[**Workflowv3CreateTaskResponse**](Workflowv3CreateTaskResponse.md)

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

# **workflow_create_workflow_event**
> Workflowv3WorkflowEventResponse workflow_create_workflow_event(workflowv3_workflow_event)

Summary: Post event for processing by workflow rules Description: Find matching workflow rule and run it

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_workflow_event import Workflowv3WorkflowEvent
from ibm_gdsc_sdk_saas.models.workflowv3_workflow_event_response import Workflowv3WorkflowEventResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    workflowv3_workflow_event = ibm_gdsc_sdk_saas.Workflowv3WorkflowEvent() # Workflowv3WorkflowEvent | 

    try:
        # Summary: Post event for processing by workflow rules Description: Find matching workflow rule and run it
        api_response = api_instance.workflow_create_workflow_event(workflowv3_workflow_event)
        print("The response of WorkflowApi->workflow_create_workflow_event:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_create_workflow_event: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3_workflow_event** | [**Workflowv3WorkflowEvent**](Workflowv3WorkflowEvent.md)|  | 

### Return type

[**Workflowv3WorkflowEventResponse**](Workflowv3WorkflowEventResponse.md)

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

# **workflow_delete_product_entity**
> Workflowv3DeleteProductEntityResponse workflow_delete_product_entity(entity_id)

Summary: Delete a product entity Description: Delete a single product entity.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_delete_product_entity_response import Workflowv3DeleteProductEntityResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    entity_id = 'entity_id_example' # str | Unique id for the product entity

    try:
        # Summary: Delete a product entity Description: Delete a single product entity.
        api_response = api_instance.workflow_delete_product_entity(entity_id)
        print("The response of WorkflowApi->workflow_delete_product_entity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_delete_product_entity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_id** | **str**| Unique id for the product entity | 

### Return type

[**Workflowv3DeleteProductEntityResponse**](Workflowv3DeleteProductEntityResponse.md)

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

# **workflow_get_cases**
> Workflowv3CaseListResponse workflow_get_cases(case_id=case_id, sort_by=sort_by, offset=offset, limit=limit)

Summary: Get cases Description: Return all cases requested.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_case_list_response import Workflowv3CaseListResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    case_id = 'case_id_example' # str | Optional case_id to get a response of an array of one member. (optional)
    sort_by = 'sort_by_example' # str | Optional field to sort by | first character determines ascending (>) or descending (<). (optional)
    offset = 56 # int | Optional starting point for the page of data. (optional)
    limit = 56 # int | Optional page size. (optional)

    try:
        # Summary: Get cases Description: Return all cases requested.
        api_response = api_instance.workflow_get_cases(case_id=case_id, sort_by=sort_by, offset=offset, limit=limit)
        print("The response of WorkflowApi->workflow_get_cases:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_get_cases: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **case_id** | **str**| Optional case_id to get a response of an array of one member. | [optional] 
 **sort_by** | **str**| Optional field to sort by | first character determines ascending (&gt;) or descending (&lt;). | [optional] 
 **offset** | **int**| Optional starting point for the page of data. | [optional] 
 **limit** | **int**| Optional page size. | [optional] 

### Return type

[**Workflowv3CaseListResponse**](Workflowv3CaseListResponse.md)

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

# **workflow_get_cases_count**
> Workflowv3GetCasesCountResponse workflow_get_cases_count(workflowv3_get_cases_count_request)

Summary: Get cases count Description: Get case count.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_get_cases_count_request import Workflowv3GetCasesCountRequest
from ibm_gdsc_sdk_saas.models.workflowv3_get_cases_count_response import Workflowv3GetCasesCountResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    workflowv3_get_cases_count_request = ibm_gdsc_sdk_saas.Workflowv3GetCasesCountRequest() # Workflowv3GetCasesCountRequest | 

    try:
        # Summary: Get cases count Description: Get case count.
        api_response = api_instance.workflow_get_cases_count(workflowv3_get_cases_count_request)
        print("The response of WorkflowApi->workflow_get_cases_count:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_get_cases_count: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3_get_cases_count_request** | [**Workflowv3GetCasesCountRequest**](Workflowv3GetCasesCountRequest.md)|  | 

### Return type

[**Workflowv3GetCasesCountResponse**](Workflowv3GetCasesCountResponse.md)

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

# **workflow_get_filename**
> Workflowv3GetFilenameResponse workflow_get_filename(case_id, task_id)

Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_get_filename_response import Workflowv3GetFilenameResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    case_id = 'case_id_example' # str | Can be \"*\" if JWT token contains the case_id.
    task_id = 'task_id_example' # str | Can be \"*\" if JWT token contains the task_id.

    try:
        # Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
        api_response = api_instance.workflow_get_filename(case_id, task_id)
        print("The response of WorkflowApi->workflow_get_filename:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_get_filename: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **case_id** | **str**| Can be \&quot;*\&quot; if JWT token contains the case_id. | 
 **task_id** | **str**| Can be \&quot;*\&quot; if JWT token contains the task_id. | 

### Return type

[**Workflowv3GetFilenameResponse**](Workflowv3GetFilenameResponse.md)

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

# **workflow_get_jobs_count**
> Workflowv3GetJobsCountResponse workflow_get_jobs_count(case_id, workflowv3_get_jobs_count_request)

Summary: Get jobs count Description: Get jobs count.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_get_jobs_count_request import Workflowv3GetJobsCountRequest
from ibm_gdsc_sdk_saas.models.workflowv3_get_jobs_count_response import Workflowv3GetJobsCountResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    case_id = 'case_id_example' # str | Case ID - can be * for all
    workflowv3_get_jobs_count_request = ibm_gdsc_sdk_saas.Workflowv3GetJobsCountRequest() # Workflowv3GetJobsCountRequest | 

    try:
        # Summary: Get jobs count Description: Get jobs count.
        api_response = api_instance.workflow_get_jobs_count(case_id, workflowv3_get_jobs_count_request)
        print("The response of WorkflowApi->workflow_get_jobs_count:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_get_jobs_count: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **case_id** | **str**| Case ID - can be * for all | 
 **workflowv3_get_jobs_count_request** | [**Workflowv3GetJobsCountRequest**](Workflowv3GetJobsCountRequest.md)|  | 

### Return type

[**Workflowv3GetJobsCountResponse**](Workflowv3GetJobsCountResponse.md)

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

# **workflow_get_product_entities**
> Workflowv3GetProductEntitiesResponse workflow_get_product_entities(offset=offset, limit=limit)

Summary: Get products and their associated event entities Description: Return a list of integrated products and their associated event entities

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_get_product_entities_response import Workflowv3GetProductEntitiesResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    offset = 56 # int | Optional starting point for the page of data. (optional)
    limit = 56 # int | Optional page size. (optional)

    try:
        # Summary: Get products and their associated event entities Description: Return a list of integrated products and their associated event entities
        api_response = api_instance.workflow_get_product_entities(offset=offset, limit=limit)
        print("The response of WorkflowApi->workflow_get_product_entities:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_get_product_entities: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **int**| Optional starting point for the page of data. | [optional] 
 **limit** | **int**| Optional page size. | [optional] 

### Return type

[**Workflowv3GetProductEntitiesResponse**](Workflowv3GetProductEntitiesResponse.md)

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

# **workflow_get_product_entity**
> Workflowv3ProductEntity workflow_get_product_entity(entity_id)

Summary: Get event entity field names, field labels, and field data types Description: Return a list of fields similar to report headers

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_product_entity import Workflowv3ProductEntity
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    entity_id = 'entity_id_example' # str | Unique id for the product entity

    try:
        # Summary: Get event entity field names, field labels, and field data types Description: Return a list of fields similar to report headers
        api_response = api_instance.workflow_get_product_entity(entity_id)
        print("The response of WorkflowApi->workflow_get_product_entity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_get_product_entity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_id** | **str**| Unique id for the product entity | 

### Return type

[**Workflowv3ProductEntity**](Workflowv3ProductEntity.md)

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

# **workflow_get_report_result**
> Workflowv3GetReportResultResponse workflow_get_report_result(case_id, task_id, offset=offset, limit=limit)

Summary: Get report result Description: Return a page of results.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_get_report_result_response import Workflowv3GetReportResultResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    case_id = 'case_id_example' # str | ID to get the case  (read-only).
    task_id = 'task_id_example' # str | ID to get the task for case(read-only).
    offset = 56 # int | Optional starting point for the page of data. (optional)
    limit = 56 # int | Optional page size. (optional)

    try:
        # Summary: Get report result Description: Return a page of results.
        api_response = api_instance.workflow_get_report_result(case_id, task_id, offset=offset, limit=limit)
        print("The response of WorkflowApi->workflow_get_report_result:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_get_report_result: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **case_id** | **str**| ID to get the case  (read-only). | 
 **task_id** | **str**| ID to get the task for case(read-only). | 
 **offset** | **int**| Optional starting point for the page of data. | [optional] 
 **limit** | **int**| Optional page size. | [optional] 

### Return type

[**Workflowv3GetReportResultResponse**](Workflowv3GetReportResultResponse.md)

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

# **workflow_get_tasks**
> Workflowv3TaskListResponse workflow_get_tasks(case_id, task_id=task_id)

Summary: Get tasks Description: Return all tasks requested.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_task_list_response import Workflowv3TaskListResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    case_id = 'case_id_example' # str | Mandaroty: The parent case which contains the tasks.
    task_id = 'task_id_example' # str | Optional: task_id to return an array of one. (optional)

    try:
        # Summary: Get tasks Description: Return all tasks requested.
        api_response = api_instance.workflow_get_tasks(case_id, task_id=task_id)
        print("The response of WorkflowApi->workflow_get_tasks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_get_tasks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **case_id** | **str**| Mandaroty: The parent case which contains the tasks. | 
 **task_id** | **str**| Optional: task_id to return an array of one. | [optional] 

### Return type

[**Workflowv3TaskListResponse**](Workflowv3TaskListResponse.md)

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

# **workflow_get_tasks_count**
> Workflowv3GetTasksCountResponse workflow_get_tasks_count(case_id, workflowv3_get_tasks_count_request)

Summary: Get cases count Description: Get case count.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_get_tasks_count_request import Workflowv3GetTasksCountRequest
from ibm_gdsc_sdk_saas.models.workflowv3_get_tasks_count_response import Workflowv3GetTasksCountResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    case_id = 'case_id_example' # str | Case ID - can be * for all
    workflowv3_get_tasks_count_request = ibm_gdsc_sdk_saas.Workflowv3GetTasksCountRequest() # Workflowv3GetTasksCountRequest | 

    try:
        # Summary: Get cases count Description: Get case count.
        api_response = api_instance.workflow_get_tasks_count(case_id, workflowv3_get_tasks_count_request)
        print("The response of WorkflowApi->workflow_get_tasks_count:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_get_tasks_count: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **case_id** | **str**| Case ID - can be * for all | 
 **workflowv3_get_tasks_count_request** | [**Workflowv3GetTasksCountRequest**](Workflowv3GetTasksCountRequest.md)|  | 

### Return type

[**Workflowv3GetTasksCountResponse**](Workflowv3GetTasksCountResponse.md)

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

# **workflow_search_cases**
> Workflowv3CaseListResponse workflow_search_cases(workflowv3_search_cases_request)

Summary: Search cases Description: Return a subset of cases.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_case_list_response import Workflowv3CaseListResponse
from ibm_gdsc_sdk_saas.models.workflowv3_search_cases_request import Workflowv3SearchCasesRequest
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    workflowv3_search_cases_request = ibm_gdsc_sdk_saas.Workflowv3SearchCasesRequest() # Workflowv3SearchCasesRequest | 

    try:
        # Summary: Search cases Description: Return a subset of cases.
        api_response = api_instance.workflow_search_cases(workflowv3_search_cases_request)
        print("The response of WorkflowApi->workflow_search_cases:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_search_cases: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3_search_cases_request** | [**Workflowv3SearchCasesRequest**](Workflowv3SearchCasesRequest.md)|  | 

### Return type

[**Workflowv3CaseListResponse**](Workflowv3CaseListResponse.md)

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

# **workflow_search_reports**
> Workflowv3SearchReportsResponse workflow_search_reports(workflowv3_search_cases_request)

Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_search_cases_request import Workflowv3SearchCasesRequest
from ibm_gdsc_sdk_saas.models.workflowv3_search_reports_response import Workflowv3SearchReportsResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    workflowv3_search_cases_request = ibm_gdsc_sdk_saas.Workflowv3SearchCasesRequest() # Workflowv3SearchCasesRequest | 

    try:
        # Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
        api_response = api_instance.workflow_search_reports(workflowv3_search_cases_request)
        print("The response of WorkflowApi->workflow_search_reports:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_search_reports: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3_search_cases_request** | [**Workflowv3SearchCasesRequest**](Workflowv3SearchCasesRequest.md)|  | 

### Return type

[**Workflowv3SearchReportsResponse**](Workflowv3SearchReportsResponse.md)

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

# **workflow_search_tasks**
> Workflowv3TaskListResponse workflow_search_tasks(case_id, workflowv3_search_tasks_request)

Summary: Search cases Description: Return a subset of cases.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_search_tasks_request import Workflowv3SearchTasksRequest
from ibm_gdsc_sdk_saas.models.workflowv3_task_list_response import Workflowv3TaskListResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    case_id = 'case_id_example' # str | Case ID - can be * for all
    workflowv3_search_tasks_request = ibm_gdsc_sdk_saas.Workflowv3SearchTasksRequest() # Workflowv3SearchTasksRequest | 

    try:
        # Summary: Search cases Description: Return a subset of cases.
        api_response = api_instance.workflow_search_tasks(case_id, workflowv3_search_tasks_request)
        print("The response of WorkflowApi->workflow_search_tasks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_search_tasks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **case_id** | **str**| Case ID - can be * for all | 
 **workflowv3_search_tasks_request** | [**Workflowv3SearchTasksRequest**](Workflowv3SearchTasksRequest.md)|  | 

### Return type

[**Workflowv3TaskListResponse**](Workflowv3TaskListResponse.md)

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

# **workflow_update_cases**
> Workflowv3UpdateCasesResponse workflow_update_cases(workflowv3_update_cases_request)

Summary: Update cases Description: Update multiple cases in one request.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_update_cases_request import Workflowv3UpdateCasesRequest
from ibm_gdsc_sdk_saas.models.workflowv3_update_cases_response import Workflowv3UpdateCasesResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    workflowv3_update_cases_request = ibm_gdsc_sdk_saas.Workflowv3UpdateCasesRequest() # Workflowv3UpdateCasesRequest | 

    try:
        # Summary: Update cases Description: Update multiple cases in one request.
        api_response = api_instance.workflow_update_cases(workflowv3_update_cases_request)
        print("The response of WorkflowApi->workflow_update_cases:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_update_cases: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3_update_cases_request** | [**Workflowv3UpdateCasesRequest**](Workflowv3UpdateCasesRequest.md)|  | 

### Return type

[**Workflowv3UpdateCasesResponse**](Workflowv3UpdateCasesResponse.md)

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

# **workflow_update_product_entity**
> Workflowv3UpdateProductEntityResponse workflow_update_product_entity(entity_id, workflowv3_update_product_entity_request)

Summary: Update a product entity Description: Update a single product entity.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_update_product_entity_request import Workflowv3UpdateProductEntityRequest
from ibm_gdsc_sdk_saas.models.workflowv3_update_product_entity_response import Workflowv3UpdateProductEntityResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    entity_id = 'entity_id_example' # str | Unique Entity id, required for update.
    workflowv3_update_product_entity_request = ibm_gdsc_sdk_saas.Workflowv3UpdateProductEntityRequest() # Workflowv3UpdateProductEntityRequest | 

    try:
        # Summary: Update a product entity Description: Update a single product entity.
        api_response = api_instance.workflow_update_product_entity(entity_id, workflowv3_update_product_entity_request)
        print("The response of WorkflowApi->workflow_update_product_entity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_update_product_entity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_id** | **str**| Unique Entity id, required for update. | 
 **workflowv3_update_product_entity_request** | [**Workflowv3UpdateProductEntityRequest**](Workflowv3UpdateProductEntityRequest.md)|  | 

### Return type

[**Workflowv3UpdateProductEntityResponse**](Workflowv3UpdateProductEntityResponse.md)

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

# **workflow_update_tasks**
> Workflowv3UpdateTasksResponse workflow_update_tasks(case_id, workflowv3_update_tasks_request)

Summary: Update tasks Description: Update multiple tasks for the same parent in one request.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.workflowv3_update_tasks_request import Workflowv3UpdateTasksRequest
from ibm_gdsc_sdk_saas.models.workflowv3_update_tasks_response import Workflowv3UpdateTasksResponse
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
    api_instance = ibm_gdsc_sdk_saas.WorkflowApi(api_client)
    case_id = 'case_id_example' # str | Update tasks belonging to common parent.
    workflowv3_update_tasks_request = ibm_gdsc_sdk_saas.Workflowv3UpdateTasksRequest() # Workflowv3UpdateTasksRequest | 

    try:
        # Summary: Update tasks Description: Update multiple tasks for the same parent in one request.
        api_response = api_instance.workflow_update_tasks(case_id, workflowv3_update_tasks_request)
        print("The response of WorkflowApi->workflow_update_tasks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowApi->workflow_update_tasks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **case_id** | **str**| Update tasks belonging to common parent. | 
 **workflowv3_update_tasks_request** | [**Workflowv3UpdateTasksRequest**](Workflowv3UpdateTasksRequest.md)|  | 

### Return type

[**Workflowv3UpdateTasksResponse**](Workflowv3UpdateTasksResponse.md)

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

