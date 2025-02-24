# ibm_gdsc_sdk_saas.EdgeSchedulerServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**edge_scheduler_service_get_edge_query_status**](EdgeSchedulerServiceApi.md#edge_scheduler_service_get_edge_query_status) | **GET** /api/v3/edges/{edge_id}/query/status | Summary: Get edge query status Description: Get the status of a queued edge query
[**edge_scheduler_service_monitoring_pending_request_for_edge_query**](EdgeSchedulerServiceApi.md#edge_scheduler_service_monitoring_pending_request_for_edge_query) | **GET** /api/v3/edges/query | Summary: Monitor for a pending edge query request Description: monitor edge query pending request
[**edge_scheduler_service_schedule_edge_query**](EdgeSchedulerServiceApi.md#edge_scheduler_service_schedule_edge_query) | **POST** /api/v3/edges/{edge_id}/query/schedule | Summary: Schedule an edge query  Description: Schedule an edge query via data warehouse queue


# **edge_scheduler_service_get_edge_query_status**
> Edgeschedulerv3GetEdgeQueryStatusResponse edge_scheduler_service_get_edge_query_status(edge_id, edge_result_report_id=edge_result_report_id)

Summary: Get edge query status Description: Get the status of a queued edge query

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.edgeschedulerv3_get_edge_query_status_response import Edgeschedulerv3GetEdgeQueryStatusResponse
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
    api_instance = ibm_gdsc_sdk_saas.EdgeSchedulerServiceApi(api_client)
    edge_id = 'edge_id_example' # str | the id of the edge
    edge_result_report_id = 'edge_result_report_id_example' # str | the id of the UC report being queried for. (optional)

    try:
        # Summary: Get edge query status Description: Get the status of a queued edge query
        api_response = api_instance.edge_scheduler_service_get_edge_query_status(edge_id, edge_result_report_id=edge_result_report_id)
        print("The response of EdgeSchedulerServiceApi->edge_scheduler_service_get_edge_query_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EdgeSchedulerServiceApi->edge_scheduler_service_get_edge_query_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edge_id** | **str**| the id of the edge | 
 **edge_result_report_id** | **str**| the id of the UC report being queried for. | [optional] 

### Return type

[**Edgeschedulerv3GetEdgeQueryStatusResponse**](Edgeschedulerv3GetEdgeQueryStatusResponse.md)

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

# **edge_scheduler_service_monitoring_pending_request_for_edge_query**
> StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse edge_scheduler_service_monitoring_pending_request_for_edge_query(client_id=client_id)

Summary: Monitor for a pending edge query request Description: monitor edge query pending request

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.stream_result_of_edgeschedulerv3_monitoring_pending_request_for_edge_query_response import StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse
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
    api_instance = ibm_gdsc_sdk_saas.EdgeSchedulerServiceApi(api_client)
    client_id = 'client_id_example' # str | edge client id to monitor edge query requests for. (optional)

    try:
        # Summary: Monitor for a pending edge query request Description: monitor edge query pending request
        api_response = api_instance.edge_scheduler_service_monitoring_pending_request_for_edge_query(client_id=client_id)
        print("The response of EdgeSchedulerServiceApi->edge_scheduler_service_monitoring_pending_request_for_edge_query:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EdgeSchedulerServiceApi->edge_scheduler_service_monitoring_pending_request_for_edge_query: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| edge client id to monitor edge query requests for. | [optional] 

### Return type

[**StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse**](StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **edge_scheduler_service_schedule_edge_query**
> Edgeschedulerv3ScheduleEdgeQueryResponse edge_scheduler_service_schedule_edge_query(edge_id, edgeschedulerv3_schedule_edge_query_request)

Summary: Schedule an edge query  Description: Schedule an edge query via data warehouse queue

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.edgeschedulerv3_schedule_edge_query_request import Edgeschedulerv3ScheduleEdgeQueryRequest
from ibm_gdsc_sdk_saas.models.edgeschedulerv3_schedule_edge_query_response import Edgeschedulerv3ScheduleEdgeQueryResponse
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
    api_instance = ibm_gdsc_sdk_saas.EdgeSchedulerServiceApi(api_client)
    edge_id = 'edge_id_example' # str | the id of the edge
    edgeschedulerv3_schedule_edge_query_request = ibm_gdsc_sdk_saas.Edgeschedulerv3ScheduleEdgeQueryRequest() # Edgeschedulerv3ScheduleEdgeQueryRequest | 

    try:
        # Summary: Schedule an edge query  Description: Schedule an edge query via data warehouse queue
        api_response = api_instance.edge_scheduler_service_schedule_edge_query(edge_id, edgeschedulerv3_schedule_edge_query_request)
        print("The response of EdgeSchedulerServiceApi->edge_scheduler_service_schedule_edge_query:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EdgeSchedulerServiceApi->edge_scheduler_service_schedule_edge_query: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edge_id** | **str**| the id of the edge | 
 **edgeschedulerv3_schedule_edge_query_request** | [**Edgeschedulerv3ScheduleEdgeQueryRequest**](Edgeschedulerv3ScheduleEdgeQueryRequest.md)|  | 

### Return type

[**Edgeschedulerv3ScheduleEdgeQueryResponse**](Edgeschedulerv3ScheduleEdgeQueryResponse.md)

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

