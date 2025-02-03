# ibm_gdsc_sdk_software.EcosystemServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ecosystem_service_create_dataset**](EcosystemServiceApi.md#ecosystem_service_create_dataset) | **POST** /api/v3/integrations/datasets | Summary: Create dataset Description: Save a definition in the database.
[**ecosystem_service_data_insert**](EcosystemServiceApi.md#ecosystem_service_data_insert) | **POST** /api/v3/integrations/datasets/{dataset_name} | Summary: Data insert Description: Process Data received from webhook API and insert.
[**ecosystem_service_delete_datasets**](EcosystemServiceApi.md#ecosystem_service_delete_datasets) | **DELETE** /api/v3/integrations/datasets | Summary: Delete datasets Description: Delete an array of datasets.
[**ecosystem_service_get_dataset_data**](EcosystemServiceApi.md#ecosystem_service_get_dataset_data) | **GET** /api/v3/integrations/datasets/{dataset_name}/data | Summary: Get dataset data Description: Return data report for a given dataset.
[**ecosystem_service_get_dataset_detail**](EcosystemServiceApi.md#ecosystem_service_get_dataset_detail) | **GET** /api/v3/integrations/datasets/{dataset_name}/details | Summary: Get dataset detail Description: Return detail on a dataset definition.
[**ecosystem_service_get_datasets**](EcosystemServiceApi.md#ecosystem_service_get_datasets) | **GET** /api/v3/integrations/datasets | Summary: Get datasets Description: Return dataset list that matches the specified filter.
[**ecosystem_service_get_purgable_rows**](EcosystemServiceApi.md#ecosystem_service_get_purgable_rows) | **POST** /api/v3/integrations/purge | Summary: Get purgable rows Description: Check the number of rows that can be purged.
[**ecosystem_service_purge_data**](EcosystemServiceApi.md#ecosystem_service_purge_data) | **DELETE** /api/v3/integrations/datasets/data | Summary: Purge data Description: Purge data.


# **ecosystem_service_create_dataset**
> Ecosystemv3CreateDatasetResponse ecosystem_service_create_dataset(ecosystemv3_create_dataset_request)

Summary: Create dataset Description: Save a definition in the database.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.ecosystemv3_create_dataset_request import Ecosystemv3CreateDatasetRequest
from ibm_gdsc_sdk_software.models.ecosystemv3_create_dataset_response import Ecosystemv3CreateDatasetResponse
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
    api_instance = ibm_gdsc_sdk_software.EcosystemServiceApi(api_client)
    ecosystemv3_create_dataset_request = ibm_gdsc_sdk_software.Ecosystemv3CreateDatasetRequest() # Ecosystemv3CreateDatasetRequest | 

    try:
        # Summary: Create dataset Description: Save a definition in the database.
        api_response = api_instance.ecosystem_service_create_dataset(ecosystemv3_create_dataset_request)
        print("The response of EcosystemServiceApi->ecosystem_service_create_dataset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EcosystemServiceApi->ecosystem_service_create_dataset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3_create_dataset_request** | [**Ecosystemv3CreateDatasetRequest**](Ecosystemv3CreateDatasetRequest.md)|  | 

### Return type

[**Ecosystemv3CreateDatasetResponse**](Ecosystemv3CreateDatasetResponse.md)

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

# **ecosystem_service_data_insert**
> Ecosystemv3DataInsertResponse ecosystem_service_data_insert(dataset_name, ecosystemv3_data_insert_request)

Summary: Data insert Description: Process Data received from webhook API and insert.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.ecosystemv3_data_insert_request import Ecosystemv3DataInsertRequest
from ibm_gdsc_sdk_software.models.ecosystemv3_data_insert_response import Ecosystemv3DataInsertResponse
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
    api_instance = ibm_gdsc_sdk_software.EcosystemServiceApi(api_client)
    dataset_name = 'dataset_name_example' # str | Data set target name.
    ecosystemv3_data_insert_request = ibm_gdsc_sdk_software.Ecosystemv3DataInsertRequest() # Ecosystemv3DataInsertRequest | 

    try:
        # Summary: Data insert Description: Process Data received from webhook API and insert.
        api_response = api_instance.ecosystem_service_data_insert(dataset_name, ecosystemv3_data_insert_request)
        print("The response of EcosystemServiceApi->ecosystem_service_data_insert:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EcosystemServiceApi->ecosystem_service_data_insert: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_name** | **str**| Data set target name. | 
 **ecosystemv3_data_insert_request** | [**Ecosystemv3DataInsertRequest**](Ecosystemv3DataInsertRequest.md)|  | 

### Return type

[**Ecosystemv3DataInsertResponse**](Ecosystemv3DataInsertResponse.md)

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

# **ecosystem_service_delete_datasets**
> Ecosystemv3DeleteDatasetsResponse ecosystem_service_delete_datasets(dataset_names=dataset_names)

Summary: Delete datasets Description: Delete an array of datasets.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.ecosystemv3_delete_datasets_response import Ecosystemv3DeleteDatasetsResponse
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
    api_instance = ibm_gdsc_sdk_software.EcosystemServiceApi(api_client)
    dataset_names = ['dataset_names_example'] # List[str] | Name of the dataset, required field. (optional)

    try:
        # Summary: Delete datasets Description: Delete an array of datasets.
        api_response = api_instance.ecosystem_service_delete_datasets(dataset_names=dataset_names)
        print("The response of EcosystemServiceApi->ecosystem_service_delete_datasets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EcosystemServiceApi->ecosystem_service_delete_datasets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_names** | [**List[str]**](str.md)| Name of the dataset, required field. | [optional] 

### Return type

[**Ecosystemv3DeleteDatasetsResponse**](Ecosystemv3DeleteDatasetsResponse.md)

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

# **ecosystem_service_get_dataset_data**
> Ecosystemv3GetDatasetDataResponse ecosystem_service_get_dataset_data(dataset_name, offset=offset, limit=limit, return_header=return_header, var_field=var_field, value=value, sort_field=sort_field, sort_order=sort_order)

Summary: Get dataset data Description: Return data report for a given dataset.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.ecosystemv3_get_dataset_data_response import Ecosystemv3GetDatasetDataResponse
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
    api_instance = ibm_gdsc_sdk_software.EcosystemServiceApi(api_client)
    dataset_name = 'dataset_name_example' # str | Name of the dataset.
    offset = 56 # int | The amount to offset the rows by for pagination. (optional)
    limit = 56 # int | The max amount of rows to return for pagination. (optional)
    return_header = True # bool | If needs to return header information. It is for pagination. The first page needs header, the rest doesn't need. (optional)
    var_field = 'var_field_example' # str | Search field. (optional)
    value = 'value_example' # str | Search value. (optional)
    sort_field = 'sort_field_example' # str | Field to sort. (optional)
    sort_order = 'NONE' # str | Sort order. (optional) (default to 'NONE')

    try:
        # Summary: Get dataset data Description: Return data report for a given dataset.
        api_response = api_instance.ecosystem_service_get_dataset_data(dataset_name, offset=offset, limit=limit, return_header=return_header, var_field=var_field, value=value, sort_field=sort_field, sort_order=sort_order)
        print("The response of EcosystemServiceApi->ecosystem_service_get_dataset_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EcosystemServiceApi->ecosystem_service_get_dataset_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_name** | **str**| Name of the dataset. | 
 **offset** | **int**| The amount to offset the rows by for pagination. | [optional] 
 **limit** | **int**| The max amount of rows to return for pagination. | [optional] 
 **return_header** | **bool**| If needs to return header information. It is for pagination. The first page needs header, the rest doesn&#39;t need. | [optional] 
 **var_field** | **str**| Search field. | [optional] 
 **value** | **str**| Search value. | [optional] 
 **sort_field** | **str**| Field to sort. | [optional] 
 **sort_order** | **str**| Sort order. | [optional] [default to &#39;NONE&#39;]

### Return type

[**Ecosystemv3GetDatasetDataResponse**](Ecosystemv3GetDatasetDataResponse.md)

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

# **ecosystem_service_get_dataset_detail**
> Ecosystemv3GetDatasetDetailResponse ecosystem_service_get_dataset_detail(dataset_name)

Summary: Get dataset detail Description: Return detail on a dataset definition.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.ecosystemv3_get_dataset_detail_response import Ecosystemv3GetDatasetDetailResponse
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
    api_instance = ibm_gdsc_sdk_software.EcosystemServiceApi(api_client)
    dataset_name = 'dataset_name_example' # str | Name of the dataset.

    try:
        # Summary: Get dataset detail Description: Return detail on a dataset definition.
        api_response = api_instance.ecosystem_service_get_dataset_detail(dataset_name)
        print("The response of EcosystemServiceApi->ecosystem_service_get_dataset_detail:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EcosystemServiceApi->ecosystem_service_get_dataset_detail: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_name** | **str**| Name of the dataset. | 

### Return type

[**Ecosystemv3GetDatasetDetailResponse**](Ecosystemv3GetDatasetDetailResponse.md)

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

# **ecosystem_service_get_datasets**
> Ecosystemv3GetDatasetsResponse ecosystem_service_get_datasets(filter_start_time=filter_start_time, filter_end_time=filter_end_time, filter_dataset_names=filter_dataset_names, offset=offset, limit=limit, include_filter_counts=include_filter_counts)

Summary: Get datasets Description: Return dataset list that matches the specified filter.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.ecosystemv3_get_datasets_response import Ecosystemv3GetDatasetsResponse
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
    api_instance = ibm_gdsc_sdk_software.EcosystemServiceApi(api_client)
    filter_start_time = '2013-10-20T19:20:30+01:00' # datetime | Return datasets created at this time or later (>=). (optional)
    filter_end_time = '2013-10-20T19:20:30+01:00' # datetime | Return datasets created before this time (<). (optional)
    filter_dataset_names = ['filter_dataset_names_example'] # List[str] | The state filter groups commonly paired states. Only returns records that include the specified names. (optional)
    offset = 56 # int | The amount to offset the rows by for pagination. (optional)
    limit = 56 # int | The max amount of rows to return for pagination. (optional)
    include_filter_counts = True # bool | Computing the filter counts is relatively expensive, only compute when needed. (optional)

    try:
        # Summary: Get datasets Description: Return dataset list that matches the specified filter.
        api_response = api_instance.ecosystem_service_get_datasets(filter_start_time=filter_start_time, filter_end_time=filter_end_time, filter_dataset_names=filter_dataset_names, offset=offset, limit=limit, include_filter_counts=include_filter_counts)
        print("The response of EcosystemServiceApi->ecosystem_service_get_datasets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EcosystemServiceApi->ecosystem_service_get_datasets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter_start_time** | **datetime**| Return datasets created at this time or later (&gt;&#x3D;). | [optional] 
 **filter_end_time** | **datetime**| Return datasets created before this time (&lt;). | [optional] 
 **filter_dataset_names** | [**List[str]**](str.md)| The state filter groups commonly paired states. Only returns records that include the specified names. | [optional] 
 **offset** | **int**| The amount to offset the rows by for pagination. | [optional] 
 **limit** | **int**| The max amount of rows to return for pagination. | [optional] 
 **include_filter_counts** | **bool**| Computing the filter counts is relatively expensive, only compute when needed. | [optional] 

### Return type

[**Ecosystemv3GetDatasetsResponse**](Ecosystemv3GetDatasetsResponse.md)

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

# **ecosystem_service_get_purgable_rows**
> Ecosystemv3GetPurgableRowsResponse ecosystem_service_get_purgable_rows(ecosystemv3_get_purgable_rows_request)

Summary: Get purgable rows Description: Check the number of rows that can be purged.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.ecosystemv3_get_purgable_rows_request import Ecosystemv3GetPurgableRowsRequest
from ibm_gdsc_sdk_software.models.ecosystemv3_get_purgable_rows_response import Ecosystemv3GetPurgableRowsResponse
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
    api_instance = ibm_gdsc_sdk_software.EcosystemServiceApi(api_client)
    ecosystemv3_get_purgable_rows_request = ibm_gdsc_sdk_software.Ecosystemv3GetPurgableRowsRequest() # Ecosystemv3GetPurgableRowsRequest | 

    try:
        # Summary: Get purgable rows Description: Check the number of rows that can be purged.
        api_response = api_instance.ecosystem_service_get_purgable_rows(ecosystemv3_get_purgable_rows_request)
        print("The response of EcosystemServiceApi->ecosystem_service_get_purgable_rows:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EcosystemServiceApi->ecosystem_service_get_purgable_rows: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3_get_purgable_rows_request** | [**Ecosystemv3GetPurgableRowsRequest**](Ecosystemv3GetPurgableRowsRequest.md)|  | 

### Return type

[**Ecosystemv3GetPurgableRowsResponse**](Ecosystemv3GetPurgableRowsResponse.md)

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

# **ecosystem_service_purge_data**
> Ecosystemv3PurgeDataResponse ecosystem_service_purge_data(dataset_names=dataset_names)

Summary: Purge data Description: Purge data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.ecosystemv3_purge_data_response import Ecosystemv3PurgeDataResponse
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
    api_instance = ibm_gdsc_sdk_software.EcosystemServiceApi(api_client)
    dataset_names = ['dataset_names_example'] # List[str] | Name of the datasets, required field. (optional)

    try:
        # Summary: Purge data Description: Purge data.
        api_response = api_instance.ecosystem_service_purge_data(dataset_names=dataset_names)
        print("The response of EcosystemServiceApi->ecosystem_service_purge_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EcosystemServiceApi->ecosystem_service_purge_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_names** | [**List[str]**](str.md)| Name of the datasets, required field. | [optional] 

### Return type

[**Ecosystemv3PurgeDataResponse**](Ecosystemv3PurgeDataResponse.md)

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

