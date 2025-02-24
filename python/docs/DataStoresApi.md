# ibm_gdsc_sdk_saas.DataStoresApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_data_store**](DataStoresApi.md#get_data_store) | **GET** /api/v1/dspm/dataStores/{dataStoreId} | Get a data store by its ID
[**get_data_stores_summary**](DataStoresApi.md#get_data_stores_summary) | **GET** /api/v1/dspm/dataStores/summary | Get summary of data stores
[**list_all_data_stores_labels**](DataStoresApi.md#list_all_data_stores_labels) | **GET** /api/v1/dspm/dataStores/labels | List labels of data stores.
[**list_data_stores**](DataStoresApi.md#list_data_stores) | **GET** /api/v1/dspm/dataStores | List data stores
[**list_data_stores_cloud_tags_keys**](DataStoresApi.md#list_data_stores_cloud_tags_keys) | **GET** /api/v1/dspm/dataStores/cloudTags/keys | List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
[**list_data_stores_cloud_tags_values**](DataStoresApi.md#list_data_stores_cloud_tags_values) | **GET** /api/v1/dspm/dataStores/cloudTags/values | List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
[**list_data_stores_names**](DataStoresApi.md#list_data_stores_names) | **GET** /api/v1/dspm/dataStores/filters/name | List name of filterable data stores
[**rescan_data_store**](DataStoresApi.md#rescan_data_store) | **POST** /api/v1/dspm/dataStores/rescan | Post data store rescan request
[**set_data_store_label**](DataStoresApi.md#set_data_store_label) | **PUT** /api/v1/dspm/dataStores/{dataStoreId}/labels | Label a data store with an existing or new label
[**update_datastore_custodian**](DataStoresApi.md#update_datastore_custodian) | **POST** /api/v1/dspm/dataStores/custodian | Update the name of a Data store custodian


# **get_data_store**
> DataStore get_data_store(data_store_id)

Get a data store by its ID

Get details of a specific data store by its ID.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.data_store import DataStore
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
    api_instance = ibm_gdsc_sdk_saas.DataStoresApi(api_client)
    data_store_id = 'arn:aws:s3::123456789101:mys3-prod' # str | ID of the data store

    try:
        # Get a data store by its ID
        api_response = api_instance.get_data_store(data_store_id)
        print("The response of DataStoresApi->get_data_store:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataStoresApi->get_data_store: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_store_id** | **str**| ID of the data store | 

### Return type

[**DataStore**](DataStore.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_data_stores_summary**
> DataStoresSummary get_data_stores_summary(filter=filter)

Get summary of data stores

Get a summary of all the data stores, that is, name of data resources, types of data stores, and other information.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.data_stores_summary import DataStoresSummary
from ibm_gdsc_sdk_saas.models.list_data_stores_filter_parameter import ListDataStoresFilterParameter
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
    api_instance = ibm_gdsc_sdk_saas.DataStoresApi(api_client)
    filter = ibm_gdsc_sdk_saas.ListDataStoresFilterParameter() # ListDataStoresFilterParameter |  (optional)

    try:
        # Get summary of data stores
        api_response = api_instance.get_data_stores_summary(filter=filter)
        print("The response of DataStoresApi->get_data_stores_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataStoresApi->get_data_stores_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListDataStoresFilterParameter**](.md)|  | [optional] 

### Return type

[**DataStoresSummary**](DataStoresSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_all_data_stores_labels**
> List[str] list_all_data_stores_labels(prefix=prefix, max_results=max_results)

List labels of data stores.

Get a list of all the labels of custom data stores.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
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
    api_instance = ibm_gdsc_sdk_saas.DataStoresApi(api_client)
    prefix = 'test' # str | Prefix of data store label (optional)
    max_results = 10 # float |  (optional)

    try:
        # List labels of data stores.
        api_response = api_instance.list_all_data_stores_labels(prefix=prefix, max_results=max_results)
        print("The response of DataStoresApi->list_all_data_stores_labels:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataStoresApi->list_all_data_stores_labels: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **str**| Prefix of data store label | [optional] 
 **max_results** | **float**|  | [optional] 

### Return type

**List[str]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_data_stores**
> ListDataStores200Response list_data_stores(filter=filter, sort=sort, page_size=page_size, next_token=next_token)

List data stores

List all data stores discovered by Guardium DSPM.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.list_data_stores200_response import ListDataStores200Response
from ibm_gdsc_sdk_saas.models.list_data_stores_filter_parameter import ListDataStoresFilterParameter
from ibm_gdsc_sdk_saas.models.list_data_stores_sort_parameter import ListDataStoresSortParameter
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
    api_instance = ibm_gdsc_sdk_saas.DataStoresApi(api_client)
    filter = ibm_gdsc_sdk_saas.ListDataStoresFilterParameter() # ListDataStoresFilterParameter |  (optional)
    sort = ibm_gdsc_sdk_saas.ListDataStoresSortParameter() # ListDataStoresSortParameter |  (optional)
    page_size = 3.4 # float |  (optional)
    next_token = 'next_token_example' # str |  (optional)

    try:
        # List data stores
        api_response = api_instance.list_data_stores(filter=filter, sort=sort, page_size=page_size, next_token=next_token)
        print("The response of DataStoresApi->list_data_stores:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataStoresApi->list_data_stores: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListDataStoresFilterParameter**](.md)|  | [optional] 
 **sort** | [**ListDataStoresSortParameter**](.md)|  | [optional] 
 **page_size** | **float**|  | [optional] 
 **next_token** | **str**|  | [optional] 

### Return type

[**ListDataStores200Response**](ListDataStores200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_data_stores_cloud_tags_keys**
> List[str] list_data_stores_cloud_tags_keys(prefix, max_results=max_results)

List the cloud tag keys of data stores that can be filtered on the basis of prefixes.

Get a list of the available cloud tag keys of data stores that can be filtered on the basis of prefixes.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
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
    api_instance = ibm_gdsc_sdk_saas.DataStoresApi(api_client)
    prefix = 'environment' # str | Prefix of cloud tag key
    max_results = 10 # float |  (optional)

    try:
        # List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
        api_response = api_instance.list_data_stores_cloud_tags_keys(prefix, max_results=max_results)
        print("The response of DataStoresApi->list_data_stores_cloud_tags_keys:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataStoresApi->list_data_stores_cloud_tags_keys: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **str**| Prefix of cloud tag key | 
 **max_results** | **float**|  | [optional] 

### Return type

**List[str]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_data_stores_cloud_tags_values**
> List[str] list_data_stores_cloud_tags_values(prefix, tag_key, max_results=max_results)

List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.

Get a list of the available cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
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
    api_instance = ibm_gdsc_sdk_saas.DataStoresApi(api_client)
    prefix = 'comp' # str | Prefix of cloud tag value
    tag_key = 'Production' # str | 
    max_results = 10 # float |  (optional)

    try:
        # List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
        api_response = api_instance.list_data_stores_cloud_tags_values(prefix, tag_key, max_results=max_results)
        print("The response of DataStoresApi->list_data_stores_cloud_tags_values:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataStoresApi->list_data_stores_cloud_tags_values: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **str**| Prefix of cloud tag value | 
 **tag_key** | **str**|  | 
 **max_results** | **float**|  | [optional] 

### Return type

**List[str]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_data_stores_names**
> List[str] list_data_stores_names(prefix)

List name of filterable data stores

Lists the data stores that can be filtered or classified.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
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
    api_instance = ibm_gdsc_sdk_saas.DataStoresApi(api_client)
    prefix = 'polar' # str | Prefix of data store name

    try:
        # List name of filterable data stores
        api_response = api_instance.list_data_stores_names(prefix)
        print("The response of DataStoresApi->list_data_stores_names:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataStoresApi->list_data_stores_names: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **str**| Prefix of data store name | 

### Return type

**List[str]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rescan_data_store**
> rescan_data_store(rescan_data_store_request)

Post data store rescan request

Post the request for a data store rescan.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.rescan_data_store_request import RescanDataStoreRequest
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
    api_instance = ibm_gdsc_sdk_saas.DataStoresApi(api_client)
    rescan_data_store_request = ibm_gdsc_sdk_saas.RescanDataStoreRequest() # RescanDataStoreRequest | 

    try:
        # Post data store rescan request
        api_instance.rescan_data_store(rescan_data_store_request)
    except Exception as e:
        print("Exception when calling DataStoresApi->rescan_data_store: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rescan_data_store_request** | [**RescanDataStoreRequest**](RescanDataStoreRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_data_store_label**
> set_data_store_label(data_store_id, set_data_store_label_request)

Label a data store with an existing or new label

Add or update a custom label for a data store.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.set_data_store_label_request import SetDataStoreLabelRequest
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
    api_instance = ibm_gdsc_sdk_saas.DataStoresApi(api_client)
    data_store_id = 'arn:aws:s3::123456789101:mys3-prod' # str | Data store ID
    set_data_store_label_request = ibm_gdsc_sdk_saas.SetDataStoreLabelRequest() # SetDataStoreLabelRequest | 

    try:
        # Label a data store with an existing or new label
        api_instance.set_data_store_label(data_store_id, set_data_store_label_request)
    except Exception as e:
        print("Exception when calling DataStoresApi->set_data_store_label: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_store_id** | **str**| Data store ID | 
 **set_data_store_label_request** | [**SetDataStoreLabelRequest**](SetDataStoreLabelRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_datastore_custodian**
> UpdateDatastoreCustodian200Response update_datastore_custodian(update_custodian_body)

Update the name of a Data store custodian

Add or update the name of a specific data store.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.update_custodian_body import UpdateCustodianBody
from ibm_gdsc_sdk_saas.models.update_datastore_custodian200_response import UpdateDatastoreCustodian200Response
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
    api_instance = ibm_gdsc_sdk_saas.DataStoresApi(api_client)
    update_custodian_body = ibm_gdsc_sdk_saas.UpdateCustodianBody() # UpdateCustodianBody | 

    try:
        # Update the name of a Data store custodian
        api_response = api_instance.update_datastore_custodian(update_custodian_body)
        print("The response of DataStoresApi->update_datastore_custodian:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataStoresApi->update_datastore_custodian: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_custodian_body** | [**UpdateCustodianBody**](UpdateCustodianBody.md)|  | 

### Return type

[**UpdateDatastoreCustodian200Response**](UpdateDatastoreCustodian200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

