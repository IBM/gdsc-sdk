# ibm_gdsc_sdk_saas.HealthCollectorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**health_collector_get_data_warehouse_usage**](HealthCollectorApi.md#health_collector_get_data_warehouse_usage) | **GET** /api/v3/metrics/warehouse/{type} | Summary: Get data warehouse usage info Description: Get information from data warehouse related to usage
[**health_collector_get_gdp_health_info**](HealthCollectorApi.md#health_collector_get_gdp_health_info) | **GET** /api/v3/health | Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
[**health_collector_get_historical_health_info**](HealthCollectorApi.md#health_collector_get_historical_health_info) | **GET** /api/v3/health/history | Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
[**health_collector_get_object_storage_usage**](HealthCollectorApi.md#health_collector_get_object_storage_usage) | **GET** /api/v3/metrics/object_storage/{type} | Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
[**health_collector_get_pod_restarts**](HealthCollectorApi.md#health_collector_get_pod_restarts) | **GET** /api/v3/metrics/pods/{type} | Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
[**health_collector_get_pvc_usage**](HealthCollectorApi.md#health_collector_get_pvc_usage) | **GET** /api/v3/metrics/pvc/{type} | Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
[**health_collector_get_streams_ingestion**](HealthCollectorApi.md#health_collector_get_streams_ingestion) | **GET** /api/v3/metrics/streams/{type} | Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
[**health_collector_get_top_gdp_collectors**](HealthCollectorApi.md#health_collector_get_top_gdp_collectors) | **GET** /api/v3/metrics/collectors/{type} | Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
[**health_collector_store_health_info**](HealthCollectorApi.md#health_collector_store_health_info) | **POST** /api/v3/health/central_managers/{central_manager_id}/health_info | Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)


# **health_collector_get_data_warehouse_usage**
> Healthcollectorv3GetDataWarehouseUsageResponse health_collector_get_data_warehouse_usage(type, start_time=start_time, end_time=end_time)

Summary: Get data warehouse usage info Description: Get information from data warehouse related to usage

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.healthcollectorv3_get_data_warehouse_usage_response import Healthcollectorv3GetDataWarehouseUsageResponse
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
    api_instance = ibm_gdsc_sdk_saas.HealthCollectorApi(api_client)
    type = 'type_example' # str | The type of metric to retrieve
    start_time = '2013-10-20T19:20:30+01:00' # datetime | The start time from which the data needs to be calculated. (optional)
    end_time = '2013-10-20T19:20:30+01:00' # datetime | The end time from which the data needs to be calculated. (optional)

    try:
        # Summary: Get data warehouse usage info Description: Get information from data warehouse related to usage
        api_response = api_instance.health_collector_get_data_warehouse_usage(type, start_time=start_time, end_time=end_time)
        print("The response of HealthCollectorApi->health_collector_get_data_warehouse_usage:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HealthCollectorApi->health_collector_get_data_warehouse_usage: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| The type of metric to retrieve | 
 **start_time** | **datetime**| The start time from which the data needs to be calculated. | [optional] 
 **end_time** | **datetime**| The end time from which the data needs to be calculated. | [optional] 

### Return type

[**Healthcollectorv3GetDataWarehouseUsageResponse**](Healthcollectorv3GetDataWarehouseUsageResponse.md)

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

# **health_collector_get_gdp_health_info**
> Healthcollectorv3GetGDPHealthInfoResponse health_collector_get_gdp_health_info()

Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.healthcollectorv3_get_gdp_health_info_response import Healthcollectorv3GetGDPHealthInfoResponse
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
    api_instance = ibm_gdsc_sdk_saas.HealthCollectorApi(api_client)

    try:
        # Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
        api_response = api_instance.health_collector_get_gdp_health_info()
        print("The response of HealthCollectorApi->health_collector_get_gdp_health_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HealthCollectorApi->health_collector_get_gdp_health_info: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Healthcollectorv3GetGDPHealthInfoResponse**](Healthcollectorv3GetGDPHealthInfoResponse.md)

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

# **health_collector_get_historical_health_info**
> Healthcollectorv3GetHistoricalHealthInfoResponse health_collector_get_historical_health_info(unit=unit, cm_id=cm_id, start_time=start_time, end_time=end_time)

Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.healthcollectorv3_get_historical_health_info_response import Healthcollectorv3GetHistoricalHealthInfoResponse
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
    api_instance = ibm_gdsc_sdk_saas.HealthCollectorApi(api_client)
    unit = 'UNKNOWN_UNIT' # str | Type of unit for which data needs to be retrieved. (optional) (default to 'UNKNOWN_UNIT')
    cm_id = 'cm_id_example' # str | Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved. (optional)
    start_time = '2013-10-20T19:20:30+01:00' # datetime | The start time from which the data needs to be calculated. (optional)
    end_time = '2013-10-20T19:20:30+01:00' # datetime | The end time from which the data needs to be calculated. (optional)

    try:
        # Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
        api_response = api_instance.health_collector_get_historical_health_info(unit=unit, cm_id=cm_id, start_time=start_time, end_time=end_time)
        print("The response of HealthCollectorApi->health_collector_get_historical_health_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HealthCollectorApi->health_collector_get_historical_health_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unit** | **str**| Type of unit for which data needs to be retrieved. | [optional] [default to &#39;UNKNOWN_UNIT&#39;]
 **cm_id** | **str**| Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved. | [optional] 
 **start_time** | **datetime**| The start time from which the data needs to be calculated. | [optional] 
 **end_time** | **datetime**| The end time from which the data needs to be calculated. | [optional] 

### Return type

[**Healthcollectorv3GetHistoricalHealthInfoResponse**](Healthcollectorv3GetHistoricalHealthInfoResponse.md)

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

# **health_collector_get_object_storage_usage**
> Healthcollectorv3GetObjectStorageUsageResponse health_collector_get_object_storage_usage(type, start_time=start_time, end_time=end_time)

Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.healthcollectorv3_get_object_storage_usage_response import Healthcollectorv3GetObjectStorageUsageResponse
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
    api_instance = ibm_gdsc_sdk_saas.HealthCollectorApi(api_client)
    type = 'type_example' # str | The type of metric to retrieve
    start_time = '2013-10-20T19:20:30+01:00' # datetime | The start time from which the data needs to be calculated. (optional)
    end_time = '2013-10-20T19:20:30+01:00' # datetime | The end time from which the data needs to be calculated. (optional)

    try:
        # Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
        api_response = api_instance.health_collector_get_object_storage_usage(type, start_time=start_time, end_time=end_time)
        print("The response of HealthCollectorApi->health_collector_get_object_storage_usage:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HealthCollectorApi->health_collector_get_object_storage_usage: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| The type of metric to retrieve | 
 **start_time** | **datetime**| The start time from which the data needs to be calculated. | [optional] 
 **end_time** | **datetime**| The end time from which the data needs to be calculated. | [optional] 

### Return type

[**Healthcollectorv3GetObjectStorageUsageResponse**](Healthcollectorv3GetObjectStorageUsageResponse.md)

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

# **health_collector_get_pod_restarts**
> Healthcollectorv3GetPodRestartsResponse health_collector_get_pod_restarts(type, start_time=start_time, end_time=end_time)

Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.healthcollectorv3_get_pod_restarts_response import Healthcollectorv3GetPodRestartsResponse
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
    api_instance = ibm_gdsc_sdk_saas.HealthCollectorApi(api_client)
    type = 'type_example' # str | The type of metric to retrieve
    start_time = '2013-10-20T19:20:30+01:00' # datetime | The start time from which the data needs to be calculated. (optional)
    end_time = '2013-10-20T19:20:30+01:00' # datetime | The end time from which the data needs to be calculated. (optional)

    try:
        # Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
        api_response = api_instance.health_collector_get_pod_restarts(type, start_time=start_time, end_time=end_time)
        print("The response of HealthCollectorApi->health_collector_get_pod_restarts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HealthCollectorApi->health_collector_get_pod_restarts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| The type of metric to retrieve | 
 **start_time** | **datetime**| The start time from which the data needs to be calculated. | [optional] 
 **end_time** | **datetime**| The end time from which the data needs to be calculated. | [optional] 

### Return type

[**Healthcollectorv3GetPodRestartsResponse**](Healthcollectorv3GetPodRestartsResponse.md)

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

# **health_collector_get_pvc_usage**
> Healthcollectorv3GetPVCUsageResponse health_collector_get_pvc_usage(type, start_time=start_time, end_time=end_time)

Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.healthcollectorv3_get_pvc_usage_response import Healthcollectorv3GetPVCUsageResponse
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
    api_instance = ibm_gdsc_sdk_saas.HealthCollectorApi(api_client)
    type = 'type_example' # str | The type of metric to retrieve
    start_time = '2013-10-20T19:20:30+01:00' # datetime | The start time from which the data needs to be calculated. (optional)
    end_time = '2013-10-20T19:20:30+01:00' # datetime | The end time from which the data needs to be calculated. (optional)

    try:
        # Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
        api_response = api_instance.health_collector_get_pvc_usage(type, start_time=start_time, end_time=end_time)
        print("The response of HealthCollectorApi->health_collector_get_pvc_usage:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HealthCollectorApi->health_collector_get_pvc_usage: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| The type of metric to retrieve | 
 **start_time** | **datetime**| The start time from which the data needs to be calculated. | [optional] 
 **end_time** | **datetime**| The end time from which the data needs to be calculated. | [optional] 

### Return type

[**Healthcollectorv3GetPVCUsageResponse**](Healthcollectorv3GetPVCUsageResponse.md)

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

# **health_collector_get_streams_ingestion**
> Healthcollectorv3GetStreamsIngestionResponse health_collector_get_streams_ingestion(type, start_time=start_time, end_time=end_time)

Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.healthcollectorv3_get_streams_ingestion_response import Healthcollectorv3GetStreamsIngestionResponse
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
    api_instance = ibm_gdsc_sdk_saas.HealthCollectorApi(api_client)
    type = 'type_example' # str | The type of metric to retrieve
    start_time = '2013-10-20T19:20:30+01:00' # datetime | The start time from which the data needs to be calculated. (optional)
    end_time = '2013-10-20T19:20:30+01:00' # datetime | The end time from which the data needs to be calculated. (optional)

    try:
        # Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
        api_response = api_instance.health_collector_get_streams_ingestion(type, start_time=start_time, end_time=end_time)
        print("The response of HealthCollectorApi->health_collector_get_streams_ingestion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HealthCollectorApi->health_collector_get_streams_ingestion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| The type of metric to retrieve | 
 **start_time** | **datetime**| The start time from which the data needs to be calculated. | [optional] 
 **end_time** | **datetime**| The end time from which the data needs to be calculated. | [optional] 

### Return type

[**Healthcollectorv3GetStreamsIngestionResponse**](Healthcollectorv3GetStreamsIngestionResponse.md)

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

# **health_collector_get_top_gdp_collectors**
> Healthcollectorv3GetTopGDPCollectorsResponse health_collector_get_top_gdp_collectors(type, start_time=start_time, end_time=end_time)

Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.healthcollectorv3_get_top_gdp_collectors_response import Healthcollectorv3GetTopGDPCollectorsResponse
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
    api_instance = ibm_gdsc_sdk_saas.HealthCollectorApi(api_client)
    type = 'type_example' # str | The type of metric to retrieve
    start_time = '2013-10-20T19:20:30+01:00' # datetime | The start time from which the data needs to be calculated. (optional)
    end_time = '2013-10-20T19:20:30+01:00' # datetime | The end time from which the data needs to be calculated. (optional)

    try:
        # Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
        api_response = api_instance.health_collector_get_top_gdp_collectors(type, start_time=start_time, end_time=end_time)
        print("The response of HealthCollectorApi->health_collector_get_top_gdp_collectors:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HealthCollectorApi->health_collector_get_top_gdp_collectors: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| The type of metric to retrieve | 
 **start_time** | **datetime**| The start time from which the data needs to be calculated. | [optional] 
 **end_time** | **datetime**| The end time from which the data needs to be calculated. | [optional] 

### Return type

[**Healthcollectorv3GetTopGDPCollectorsResponse**](Healthcollectorv3GetTopGDPCollectorsResponse.md)

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

# **health_collector_store_health_info**
> Healthcollectorv3StoreHealthInfoResponse health_collector_store_health_info(central_manager_id, healthcollectorv3_store_health_info_request)

Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.healthcollectorv3_store_health_info_request import Healthcollectorv3StoreHealthInfoRequest
from ibm_gdsc_sdk_saas.models.healthcollectorv3_store_health_info_response import Healthcollectorv3StoreHealthInfoResponse
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
    api_instance = ibm_gdsc_sdk_saas.HealthCollectorApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.
    healthcollectorv3_store_health_info_request = ibm_gdsc_sdk_saas.Healthcollectorv3StoreHealthInfoRequest() # Healthcollectorv3StoreHealthInfoRequest | 

    try:
        # Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)
        api_response = api_instance.health_collector_store_health_info(central_manager_id, healthcollectorv3_store_health_info_request)
        print("The response of HealthCollectorApi->health_collector_store_health_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HealthCollectorApi->health_collector_store_health_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 
 **healthcollectorv3_store_health_info_request** | [**Healthcollectorv3StoreHealthInfoRequest**](Healthcollectorv3StoreHealthInfoRequest.md)|  | 

### Return type

[**Healthcollectorv3StoreHealthInfoResponse**](Healthcollectorv3StoreHealthInfoResponse.md)

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

