# ibm_gdsc_sdk_software.DatamartProcessorServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**datamart_processor_service_get_datamart_info**](DatamartProcessorServiceApi.md#datamart_processor_service_get_datamart_info) | **GET** /api/v3/datamarts/info | Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
[**datamart_processor_service_get_datamarts**](DatamartProcessorServiceApi.md#datamart_processor_service_get_datamarts) | **GET** /api/v3/datamarts | Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
[**datamart_processor_service_get_earliest_start_time**](DatamartProcessorServiceApi.md#datamart_processor_service_get_earliest_start_time) | **GET** /api/v3/datamarts/earliest_start_time | Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
[**datamart_processor_service_send_all_complete_files_to_queue**](DatamartProcessorServiceApi.md#datamart_processor_service_send_all_complete_files_to_queue) | **POST** /api/v3/datamarts/repush_files | 
[**datamart_processor_service_store_extraction_logs**](DatamartProcessorServiceApi.md#datamart_processor_service_store_extraction_logs) | **POST** /api/v3/datamarts/{request_id}/dm_extraction_logs | Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
[**upload_datamart**](DatamartProcessorServiceApi.md#upload_datamart) | **POST** /api/v3/datamarts/upload | Summary: Upload datamart Description: Upload datamart file for ingestion.


# **datamart_processor_service_get_datamart_info**
> Datamartprocessorv3GetDatamartInfoResponse datamart_processor_service_get_datamart_info(ingestion_id=ingestion_id)

Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.datamartprocessorv3_get_datamart_info_response import Datamartprocessorv3GetDatamartInfoResponse
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
    api_instance = ibm_gdsc_sdk_software.DatamartProcessorServiceApi(api_client)
    ingestion_id = 'ingestion_id_example' # str | Ingestion id. (optional)

    try:
        # Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
        api_response = api_instance.datamart_processor_service_get_datamart_info(ingestion_id=ingestion_id)
        print("The response of DatamartProcessorServiceApi->datamart_processor_service_get_datamart_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatamartProcessorServiceApi->datamart_processor_service_get_datamart_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingestion_id** | **str**| Ingestion id. | [optional] 

### Return type

[**Datamartprocessorv3GetDatamartInfoResponse**](Datamartprocessorv3GetDatamartInfoResponse.md)

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

# **datamart_processor_service_get_datamarts**
> Datamartprocessorv3GetDatamartResponse datamart_processor_service_get_datamarts(period_start=period_start, period_end=period_end)

Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.datamartprocessorv3_get_datamart_response import Datamartprocessorv3GetDatamartResponse
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
    api_instance = ibm_gdsc_sdk_software.DatamartProcessorServiceApi(api_client)
    period_start = '2013-10-20T19:20:30+01:00' # datetime | Data starting time period in UTC. (optional)
    period_end = '2013-10-20T19:20:30+01:00' # datetime | Data ending time period in UTC. (optional)

    try:
        # Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
        api_response = api_instance.datamart_processor_service_get_datamarts(period_start=period_start, period_end=period_end)
        print("The response of DatamartProcessorServiceApi->datamart_processor_service_get_datamarts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatamartProcessorServiceApi->datamart_processor_service_get_datamarts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **period_start** | **datetime**| Data starting time period in UTC. | [optional] 
 **period_end** | **datetime**| Data ending time period in UTC. | [optional] 

### Return type

[**Datamartprocessorv3GetDatamartResponse**](Datamartprocessorv3GetDatamartResponse.md)

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

# **datamart_processor_service_get_earliest_start_time**
> Datamartprocessorv3GetEarliestStartTimeResponse datamart_processor_service_get_earliest_start_time()

Summary: Get rarliest start time Description: Return the earliest time period of data available in database.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.datamartprocessorv3_get_earliest_start_time_response import Datamartprocessorv3GetEarliestStartTimeResponse
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
    api_instance = ibm_gdsc_sdk_software.DatamartProcessorServiceApi(api_client)

    try:
        # Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
        api_response = api_instance.datamart_processor_service_get_earliest_start_time()
        print("The response of DatamartProcessorServiceApi->datamart_processor_service_get_earliest_start_time:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatamartProcessorServiceApi->datamart_processor_service_get_earliest_start_time: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Datamartprocessorv3GetEarliestStartTimeResponse**](Datamartprocessorv3GetEarliestStartTimeResponse.md)

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

# **datamart_processor_service_send_all_complete_files_to_queue**
> Datamartprocessorv3StatusResponseBase datamart_processor_service_send_all_complete_files_to_queue(body)



### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.datamartprocessorv3_status_response_base import Datamartprocessorv3StatusResponseBase
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
    api_instance = ibm_gdsc_sdk_software.DatamartProcessorServiceApi(api_client)
    body = None # object | 

    try:
        api_response = api_instance.datamart_processor_service_send_all_complete_files_to_queue(body)
        print("The response of DatamartProcessorServiceApi->datamart_processor_service_send_all_complete_files_to_queue:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatamartProcessorServiceApi->datamart_processor_service_send_all_complete_files_to_queue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **object**|  | 

### Return type

[**Datamartprocessorv3StatusResponseBase**](Datamartprocessorv3StatusResponseBase.md)

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

# **datamart_processor_service_store_extraction_logs**
> Datamartprocessorv3DMExtractionLogsResponse datamart_processor_service_store_extraction_logs(request_id, datamartprocessorv3_dm_extraction_logs_request)

Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.datamartprocessorv3_dm_extraction_logs_request import Datamartprocessorv3DMExtractionLogsRequest
from ibm_gdsc_sdk_software.models.datamartprocessorv3_dm_extraction_logs_response import Datamartprocessorv3DMExtractionLogsResponse
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
    api_instance = ibm_gdsc_sdk_software.DatamartProcessorServiceApi(api_client)
    request_id = 'request_id_example' # str | Request id which co-relates to request.
    datamartprocessorv3_dm_extraction_logs_request = ibm_gdsc_sdk_software.Datamartprocessorv3DMExtractionLogsRequest() # Datamartprocessorv3DMExtractionLogsRequest | 

    try:
        # Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
        api_response = api_instance.datamart_processor_service_store_extraction_logs(request_id, datamartprocessorv3_dm_extraction_logs_request)
        print("The response of DatamartProcessorServiceApi->datamart_processor_service_store_extraction_logs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatamartProcessorServiceApi->datamart_processor_service_store_extraction_logs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_id** | **str**| Request id which co-relates to request. | 
 **datamartprocessorv3_dm_extraction_logs_request** | [**Datamartprocessorv3DMExtractionLogsRequest**](Datamartprocessorv3DMExtractionLogsRequest.md)|  | 

### Return type

[**Datamartprocessorv3DMExtractionLogsResponse**](Datamartprocessorv3DMExtractionLogsResponse.md)

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

# **upload_datamart**
> upload_datamart(file)

Summary: Upload datamart Description: Upload datamart file for ingestion.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
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
    api_instance = ibm_gdsc_sdk_software.DatamartProcessorServiceApi(api_client)
    file = None # bytearray | The file to upload.

    try:
        # Summary: Upload datamart Description: Upload datamart file for ingestion.
        api_instance.upload_datamart(file)
    except Exception as e:
        print("Exception when calling DatamartProcessorServiceApi->upload_datamart: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **bytearray**| The file to upload. | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

