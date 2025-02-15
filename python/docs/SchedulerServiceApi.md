# ibm_gdsc_sdk_software.SchedulerServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**scheduler_service_create_scheduled_job**](SchedulerServiceApi.md#scheduler_service_create_scheduled_job) | **POST** /api/v3/schedules | Summary: Create scheduled job Description: Create a new scheduled job with tasks.
[**scheduler_service_delete_scheduled_job**](SchedulerServiceApi.md#scheduler_service_delete_scheduled_job) | **DELETE** /api/v3/schedules/{schedule_id} | Summary: Delete scheduled job Description: Delete a single scheduled job.
[**scheduler_service_get_dependencies**](SchedulerServiceApi.md#scheduler_service_get_dependencies) | **GET** /api/v3/schedules/dependencies | Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
[**scheduler_service_get_distribution_rules**](SchedulerServiceApi.md#scheduler_service_get_distribution_rules) | **GET** /api/v3/schedules/distribution_rules | Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can&#39;t be edited if it is used by a scheduled job.
[**scheduler_service_get_scheduled_job_details**](SchedulerServiceApi.md#scheduler_service_get_scheduled_job_details) | **GET** /api/v3/schedules/{schedule_id}/details | Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
[**scheduler_service_get_scheduled_jobs**](SchedulerServiceApi.md#scheduler_service_get_scheduled_jobs) | **GET** /api/v3/schedules | Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
[**scheduler_service_get_schedules_by_report**](SchedulerServiceApi.md#scheduler_service_get_schedules_by_report) | **POST** /api/v3/schedules/searchByReport/{report_id} | Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
[**scheduler_service_get_tags**](SchedulerServiceApi.md#scheduler_service_get_tags) | **GET** /api/v3/schedules/tags | Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
[**scheduler_service_search_scheduled_jobs**](SchedulerServiceApi.md#scheduler_service_search_scheduled_jobs) | **POST** /api/v3/schedules/search | Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
[**scheduler_service_search_scheduled_task_runs**](SchedulerServiceApi.md#scheduler_service_search_scheduled_task_runs) | **POST** /api/v3/schedules/runs/search | Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
[**scheduler_service_update_scheduled_job**](SchedulerServiceApi.md#scheduler_service_update_scheduled_job) | **PATCH** /api/v3/schedules/{schedule_id} | Summary: Update scheduled job Description: Update a single schedule job.


# **scheduler_service_create_scheduled_job**
> Schedulerv3CreateScheduledJobResponse scheduler_service_create_scheduled_job(schedulerv3_create_scheduled_job_request)

Summary: Create scheduled job Description: Create a new scheduled job with tasks.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.schedulerv3_create_scheduled_job_request import Schedulerv3CreateScheduledJobRequest
from ibm_gdsc_sdk_software.models.schedulerv3_create_scheduled_job_response import Schedulerv3CreateScheduledJobResponse
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
    api_instance = ibm_gdsc_sdk_software.SchedulerServiceApi(api_client)
    schedulerv3_create_scheduled_job_request = ibm_gdsc_sdk_software.Schedulerv3CreateScheduledJobRequest() # Schedulerv3CreateScheduledJobRequest | 

    try:
        # Summary: Create scheduled job Description: Create a new scheduled job with tasks.
        api_response = api_instance.scheduler_service_create_scheduled_job(schedulerv3_create_scheduled_job_request)
        print("The response of SchedulerServiceApi->scheduler_service_create_scheduled_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulerServiceApi->scheduler_service_create_scheduled_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3_create_scheduled_job_request** | [**Schedulerv3CreateScheduledJobRequest**](Schedulerv3CreateScheduledJobRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scheduler_service_delete_scheduled_job**
> Schedulerv3DeleteScheduledJobResponse scheduler_service_delete_scheduled_job(schedule_id)

Summary: Delete scheduled job Description: Delete a single scheduled job.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.schedulerv3_delete_scheduled_job_response import Schedulerv3DeleteScheduledJobResponse
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
    api_instance = ibm_gdsc_sdk_software.SchedulerServiceApi(api_client)
    schedule_id = 'schedule_id_example' # str | Unique ID, required for delete.

    try:
        # Summary: Delete scheduled job Description: Delete a single scheduled job.
        api_response = api_instance.scheduler_service_delete_scheduled_job(schedule_id)
        print("The response of SchedulerServiceApi->scheduler_service_delete_scheduled_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulerServiceApi->scheduler_service_delete_scheduled_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule_id** | **str**| Unique ID, required for delete. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scheduler_service_get_dependencies**
> Schedulerv3GetDependenciesResponse scheduler_service_get_dependencies(config_type=config_type)

Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.schedulerv3_get_dependencies_response import Schedulerv3GetDependenciesResponse
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
    api_instance = ibm_gdsc_sdk_software.SchedulerServiceApi(api_client)
    config_type = 'config_type_example' # str | specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. (optional)

    try:
        # Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
        api_response = api_instance.scheduler_service_get_dependencies(config_type=config_type)
        print("The response of SchedulerServiceApi->scheduler_service_get_dependencies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulerServiceApi->scheduler_service_get_dependencies: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config_type** | **str**| specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scheduler_service_get_distribution_rules**
> Schedulerv3GetDistributionRulesResponse scheduler_service_get_distribution_rules()

Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can't be edited if it is used by a scheduled job.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.schedulerv3_get_distribution_rules_response import Schedulerv3GetDistributionRulesResponse
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
    api_instance = ibm_gdsc_sdk_software.SchedulerServiceApi(api_client)

    try:
        # Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can't be edited if it is used by a scheduled job.
        api_response = api_instance.scheduler_service_get_distribution_rules()
        print("The response of SchedulerServiceApi->scheduler_service_get_distribution_rules:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulerServiceApi->scheduler_service_get_distribution_rules: %s\n" % e)
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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scheduler_service_get_scheduled_job_details**
> Schedulerv3GetScheduledJobResponse scheduler_service_get_scheduled_job_details(schedule_id)

Summary: Get scheduled job Description: Return a single ScheduledJob in detail.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.schedulerv3_get_scheduled_job_response import Schedulerv3GetScheduledJobResponse
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
    api_instance = ibm_gdsc_sdk_software.SchedulerServiceApi(api_client)
    schedule_id = 'schedule_id_example' # str | Used to return a single scheduledjob.

    try:
        # Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
        api_response = api_instance.scheduler_service_get_scheduled_job_details(schedule_id)
        print("The response of SchedulerServiceApi->scheduler_service_get_scheduled_job_details:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulerServiceApi->scheduler_service_get_scheduled_job_details: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule_id** | **str**| Used to return a single scheduledjob. | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scheduler_service_get_scheduled_jobs**
> Schedulerv3ScheduledJobSummaryResponse scheduler_service_get_scheduled_jobs(offset=offset, limit=limit)

Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.schedulerv3_scheduled_job_summary_response import Schedulerv3ScheduledJobSummaryResponse
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
    api_instance = ibm_gdsc_sdk_software.SchedulerServiceApi(api_client)
    offset = 56 # int | Optional: the amount to offset the rows by for pagination. (optional)
    limit = 56 # int | Optional: the max amount of rows to return for pagination. (optional)

    try:
        # Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
        api_response = api_instance.scheduler_service_get_scheduled_jobs(offset=offset, limit=limit)
        print("The response of SchedulerServiceApi->scheduler_service_get_scheduled_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulerServiceApi->scheduler_service_get_scheduled_jobs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **int**| Optional: the amount to offset the rows by for pagination. | [optional] 
 **limit** | **int**| Optional: the max amount of rows to return for pagination. | [optional] 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scheduler_service_get_schedules_by_report**
> Schedulerv3GetSchedulesByReportResponse scheduler_service_get_schedules_by_report(report_id, schedulerv3_get_schedules_by_report_request)

Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.schedulerv3_get_schedules_by_report_request import Schedulerv3GetSchedulesByReportRequest
from ibm_gdsc_sdk_software.models.schedulerv3_get_schedules_by_report_response import Schedulerv3GetSchedulesByReportResponse
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
    api_instance = ibm_gdsc_sdk_software.SchedulerServiceApi(api_client)
    report_id = 'report_id_example' # str | Report ID for the scheduled report.
    schedulerv3_get_schedules_by_report_request = ibm_gdsc_sdk_software.Schedulerv3GetSchedulesByReportRequest() # Schedulerv3GetSchedulesByReportRequest | 

    try:
        # Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
        api_response = api_instance.scheduler_service_get_schedules_by_report(report_id, schedulerv3_get_schedules_by_report_request)
        print("The response of SchedulerServiceApi->scheduler_service_get_schedules_by_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulerServiceApi->scheduler_service_get_schedules_by_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **str**| Report ID for the scheduled report. | 
 **schedulerv3_get_schedules_by_report_request** | [**Schedulerv3GetSchedulesByReportRequest**](Schedulerv3GetSchedulesByReportRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scheduler_service_get_tags**
> Schedulerv3GetTagsResponse scheduler_service_get_tags()

Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.schedulerv3_get_tags_response import Schedulerv3GetTagsResponse
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
    api_instance = ibm_gdsc_sdk_software.SchedulerServiceApi(api_client)

    try:
        # Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
        api_response = api_instance.scheduler_service_get_tags()
        print("The response of SchedulerServiceApi->scheduler_service_get_tags:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulerServiceApi->scheduler_service_get_tags: %s\n" % e)
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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scheduler_service_search_scheduled_jobs**
> Schedulerv3ScheduledJobSummaryResponse scheduler_service_search_scheduled_jobs(schedulerv3_search_scheduled_jobs_request)

Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.schedulerv3_scheduled_job_summary_response import Schedulerv3ScheduledJobSummaryResponse
from ibm_gdsc_sdk_software.models.schedulerv3_search_scheduled_jobs_request import Schedulerv3SearchScheduledJobsRequest
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
    api_instance = ibm_gdsc_sdk_software.SchedulerServiceApi(api_client)
    schedulerv3_search_scheduled_jobs_request = ibm_gdsc_sdk_software.Schedulerv3SearchScheduledJobsRequest() # Schedulerv3SearchScheduledJobsRequest | 

    try:
        # Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
        api_response = api_instance.scheduler_service_search_scheduled_jobs(schedulerv3_search_scheduled_jobs_request)
        print("The response of SchedulerServiceApi->scheduler_service_search_scheduled_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulerServiceApi->scheduler_service_search_scheduled_jobs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3_search_scheduled_jobs_request** | [**Schedulerv3SearchScheduledJobsRequest**](Schedulerv3SearchScheduledJobsRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scheduler_service_search_scheduled_task_runs**
> Schedulerv3SearchScheduledTaskRunsResponse scheduler_service_search_scheduled_task_runs(schedulerv3_search_scheduled_task_runs_request)

Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.schedulerv3_search_scheduled_task_runs_request import Schedulerv3SearchScheduledTaskRunsRequest
from ibm_gdsc_sdk_software.models.schedulerv3_search_scheduled_task_runs_response import Schedulerv3SearchScheduledTaskRunsResponse
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
    api_instance = ibm_gdsc_sdk_software.SchedulerServiceApi(api_client)
    schedulerv3_search_scheduled_task_runs_request = ibm_gdsc_sdk_software.Schedulerv3SearchScheduledTaskRunsRequest() # Schedulerv3SearchScheduledTaskRunsRequest | 

    try:
        # Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
        api_response = api_instance.scheduler_service_search_scheduled_task_runs(schedulerv3_search_scheduled_task_runs_request)
        print("The response of SchedulerServiceApi->scheduler_service_search_scheduled_task_runs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulerServiceApi->scheduler_service_search_scheduled_task_runs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3_search_scheduled_task_runs_request** | [**Schedulerv3SearchScheduledTaskRunsRequest**](Schedulerv3SearchScheduledTaskRunsRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scheduler_service_update_scheduled_job**
> Schedulerv3UpdateScheduledJobResponse scheduler_service_update_scheduled_job(schedule_id, schedulerv3_update_scheduled_job_request)

Summary: Update scheduled job Description: Update a single schedule job.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.schedulerv3_update_scheduled_job_request import Schedulerv3UpdateScheduledJobRequest
from ibm_gdsc_sdk_software.models.schedulerv3_update_scheduled_job_response import Schedulerv3UpdateScheduledJobResponse
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
    api_instance = ibm_gdsc_sdk_software.SchedulerServiceApi(api_client)
    schedule_id = 'schedule_id_example' # str | Unique ID, required for update.
    schedulerv3_update_scheduled_job_request = ibm_gdsc_sdk_software.Schedulerv3UpdateScheduledJobRequest() # Schedulerv3UpdateScheduledJobRequest | 

    try:
        # Summary: Update scheduled job Description: Update a single schedule job.
        api_response = api_instance.scheduler_service_update_scheduled_job(schedule_id, schedulerv3_update_scheduled_job_request)
        print("The response of SchedulerServiceApi->scheduler_service_update_scheduled_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulerServiceApi->scheduler_service_update_scheduled_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule_id** | **str**| Unique ID, required for update. | 
 **schedulerv3_update_scheduled_job_request** | [**Schedulerv3UpdateScheduledJobRequest**](Schedulerv3UpdateScheduledJobRequest.md)|  | 

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
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

