# ibm_gdsc_sdk_software.OutliersEngineApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**outliers_engine_get_source_statistics**](OutliersEngineApi.md#outliers_engine_get_source_statistics) | **GET** /api/v3/outliers/source/statistics | Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
[**outliers_engine_get_statistics**](OutliersEngineApi.md#outliers_engine_get_statistics) | **GET** /api/v3/outliers/statistics | Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
[**outliers_engine_get_working_hours_periods**](OutliersEngineApi.md#outliers_engine_get_working_hours_periods) | **GET** /api/v3/outliers/working_hours_periods | Summary: Get working hours periods Description: Get a list of the working hours periods.
[**outliers_engine_run_simulator**](OutliersEngineApi.md#outliers_engine_run_simulator) | **POST** /api/v3/outliers/simulator | Summary: Run simulator Description: Run outlier simulator.
[**outliers_engine_update_working_hours_periods**](OutliersEngineApi.md#outliers_engine_update_working_hours_periods) | **PUT** /api/v3/outliers/working_hours_periods | Summary: Update working hours periods Description: Update the working hours periods values.
[**outliers_engine_upload_and_analyze_period**](OutliersEngineApi.md#outliers_engine_upload_and_analyze_period) | **POST** /api/v3/outliers | Summary: Upload and analyze period Description: Run outliers detection on ready periods.
[**outliers_engine_user_clustering**](OutliersEngineApi.md#outliers_engine_user_clustering) | **POST** /api/v3/outliers/clusters | Summary: User clustering Description: Run user-clustering on current sources.


# **outliers_engine_get_source_statistics**
> Outliersenginev3GetSourceStatisticsResponse outliers_engine_get_source_statistics(source_server_ip=source_server_ip, source_database_name=source_database_name, source_db_user=source_db_user, attributes_limit=attributes_limit)

Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.outliersenginev3_get_source_statistics_response import Outliersenginev3GetSourceStatisticsResponse
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
    api_instance = ibm_gdsc_sdk_software.OutliersEngineApi(api_client)
    source_server_ip = 'source_server_ip_example' # str | server ip. (optional)
    source_database_name = 'source_database_name_example' # str | database name. (optional)
    source_db_user = 'source_db_user_example' # str | db user name (optional). (optional)
    attributes_limit = 56 # int | The number of attributes to return for each SourceAttributeType - optional. (optional)

    try:
        # Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
        api_response = api_instance.outliers_engine_get_source_statistics(source_server_ip=source_server_ip, source_database_name=source_database_name, source_db_user=source_db_user, attributes_limit=attributes_limit)
        print("The response of OutliersEngineApi->outliers_engine_get_source_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OutliersEngineApi->outliers_engine_get_source_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source_server_ip** | **str**| server ip. | [optional] 
 **source_database_name** | **str**| database name. | [optional] 
 **source_db_user** | **str**| db user name (optional). | [optional] 
 **attributes_limit** | **int**| The number of attributes to return for each SourceAttributeType - optional. | [optional] 

### Return type

[**Outliersenginev3GetSourceStatisticsResponse**](Outliersenginev3GetSourceStatisticsResponse.md)

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

# **outliers_engine_get_statistics**
> Outliersenginev3StatisticsResponse outliers_engine_get_statistics()

Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.outliersenginev3_statistics_response import Outliersenginev3StatisticsResponse
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
    api_instance = ibm_gdsc_sdk_software.OutliersEngineApi(api_client)

    try:
        # Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
        api_response = api_instance.outliers_engine_get_statistics()
        print("The response of OutliersEngineApi->outliers_engine_get_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OutliersEngineApi->outliers_engine_get_statistics: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Outliersenginev3StatisticsResponse**](Outliersenginev3StatisticsResponse.md)

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

# **outliers_engine_get_working_hours_periods**
> Outliersenginev3GetWorkingHoursPeriodsResponse outliers_engine_get_working_hours_periods()

Summary: Get working hours periods Description: Get a list of the working hours periods.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.outliersenginev3_get_working_hours_periods_response import Outliersenginev3GetWorkingHoursPeriodsResponse
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
    api_instance = ibm_gdsc_sdk_software.OutliersEngineApi(api_client)

    try:
        # Summary: Get working hours periods Description: Get a list of the working hours periods.
        api_response = api_instance.outliers_engine_get_working_hours_periods()
        print("The response of OutliersEngineApi->outliers_engine_get_working_hours_periods:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OutliersEngineApi->outliers_engine_get_working_hours_periods: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Outliersenginev3GetWorkingHoursPeriodsResponse**](Outliersenginev3GetWorkingHoursPeriodsResponse.md)

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

# **outliers_engine_run_simulator**
> RpcStatus outliers_engine_run_simulator(outliersenginev3_run_simulator_request)

Summary: Run simulator Description: Run outlier simulator.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.outliersenginev3_run_simulator_request import Outliersenginev3RunSimulatorRequest
from ibm_gdsc_sdk_software.models.rpc_status import RpcStatus
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
    api_instance = ibm_gdsc_sdk_software.OutliersEngineApi(api_client)
    outliersenginev3_run_simulator_request = ibm_gdsc_sdk_software.Outliersenginev3RunSimulatorRequest() # Outliersenginev3RunSimulatorRequest | 

    try:
        # Summary: Run simulator Description: Run outlier simulator.
        api_response = api_instance.outliers_engine_run_simulator(outliersenginev3_run_simulator_request)
        print("The response of OutliersEngineApi->outliers_engine_run_simulator:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OutliersEngineApi->outliers_engine_run_simulator: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outliersenginev3_run_simulator_request** | [**Outliersenginev3RunSimulatorRequest**](Outliersenginev3RunSimulatorRequest.md)|  | 

### Return type

[**RpcStatus**](RpcStatus.md)

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

# **outliers_engine_update_working_hours_periods**
> Outliersenginev3OutlierResponse outliers_engine_update_working_hours_periods(outliersenginev3_update_working_hours_periods_request)

Summary: Update working hours periods Description: Update the working hours periods values.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.outliersenginev3_outlier_response import Outliersenginev3OutlierResponse
from ibm_gdsc_sdk_software.models.outliersenginev3_update_working_hours_periods_request import Outliersenginev3UpdateWorkingHoursPeriodsRequest
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
    api_instance = ibm_gdsc_sdk_software.OutliersEngineApi(api_client)
    outliersenginev3_update_working_hours_periods_request = ibm_gdsc_sdk_software.Outliersenginev3UpdateWorkingHoursPeriodsRequest() # Outliersenginev3UpdateWorkingHoursPeriodsRequest | 

    try:
        # Summary: Update working hours periods Description: Update the working hours periods values.
        api_response = api_instance.outliers_engine_update_working_hours_periods(outliersenginev3_update_working_hours_periods_request)
        print("The response of OutliersEngineApi->outliers_engine_update_working_hours_periods:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OutliersEngineApi->outliers_engine_update_working_hours_periods: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outliersenginev3_update_working_hours_periods_request** | [**Outliersenginev3UpdateWorkingHoursPeriodsRequest**](Outliersenginev3UpdateWorkingHoursPeriodsRequest.md)|  | 

### Return type

[**Outliersenginev3OutlierResponse**](Outliersenginev3OutlierResponse.md)

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

# **outliers_engine_upload_and_analyze_period**
> RpcStatus outliers_engine_upload_and_analyze_period(body)

Summary: Upload and analyze period Description: Run outliers detection on ready periods.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.rpc_status import RpcStatus
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
    api_instance = ibm_gdsc_sdk_software.OutliersEngineApi(api_client)
    body = None # object | 

    try:
        # Summary: Upload and analyze period Description: Run outliers detection on ready periods.
        api_response = api_instance.outliers_engine_upload_and_analyze_period(body)
        print("The response of OutliersEngineApi->outliers_engine_upload_and_analyze_period:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OutliersEngineApi->outliers_engine_upload_and_analyze_period: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **object**|  | 

### Return type

[**RpcStatus**](RpcStatus.md)

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

# **outliers_engine_user_clustering**
> RpcStatus outliers_engine_user_clustering(body)

Summary: User clustering Description: Run user-clustering on current sources.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.rpc_status import RpcStatus
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
    api_instance = ibm_gdsc_sdk_software.OutliersEngineApi(api_client)
    body = None # object | 

    try:
        # Summary: User clustering Description: Run user-clustering on current sources.
        api_response = api_instance.outliers_engine_user_clustering(body)
        print("The response of OutliersEngineApi->outliers_engine_user_clustering:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OutliersEngineApi->outliers_engine_user_clustering: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **object**|  | 

### Return type

[**RpcStatus**](RpcStatus.md)

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

