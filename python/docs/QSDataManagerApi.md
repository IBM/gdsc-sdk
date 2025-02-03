# ibm_gdsc_sdk_software.QSDataManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**q_s_data_manager_get_app_data_for_provision_id**](QSDataManagerApi.md#q_s_data_manager_get_app_data_for_provision_id) | **GET** /api/v3/datamanager/application/{provision_id}/data | Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id.
[**q_s_data_manager_get_master_data**](QSDataManagerApi.md#q_s_data_manager_get_master_data) | **GET** /api/v3/datamanager/master-data | Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
[**q_s_data_manager_get_net_loc_dim_data_for_scan_id**](QSDataManagerApi.md#q_s_data_manager_get_net_loc_dim_data_for_scan_id) | **GET** /api/v3/datamanager/network/{scan_id}/data | Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid.
[**q_s_data_manager_insert_all_entities**](QSDataManagerApi.md#q_s_data_manager_insert_all_entities) | **POST** /api/v3/datamanager/all/entities | Summary: Insert Data Description: Insert All Dimension and Fact tables data.
[**q_s_data_manager_register_scan**](QSDataManagerApi.md#q_s_data_manager_register_scan) | **POST** /api/v3/datamanager/scan | Summary: Insert ScanDetails Description: Register new data into scan dimension table.
[**q_s_data_manager_retrieve_scan**](QSDataManagerApi.md#q_s_data_manager_retrieve_scan) | **GET** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
[**q_s_data_manager_search_entity_data**](QSDataManagerApi.md#q_s_data_manager_search_entity_data) | **POST** /api/v3/datamanager/entity/search | Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters
[**q_s_data_manager_update_net_location**](QSDataManagerApi.md#q_s_data_manager_update_net_location) | **PUT** /api/v3/datamanager/network | Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid.


# **q_s_data_manager_get_app_data_for_provision_id**
> Qspmdatamanagerv3AppDataResponse q_s_data_manager_get_app_data_for_provision_id(provision_id)

Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_app_data_response import Qspmdatamanagerv3AppDataResponse
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
    api_instance = ibm_gdsc_sdk_software.QSDataManagerApi(api_client)
    provision_id = 'provision_id_example' # str | Identifier for the provision request

    try:
        # Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id.
        api_response = api_instance.q_s_data_manager_get_app_data_for_provision_id(provision_id)
        print("The response of QSDataManagerApi->q_s_data_manager_get_app_data_for_provision_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSDataManagerApi->q_s_data_manager_get_app_data_for_provision_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provision_id** | **str**| Identifier for the provision request | 

### Return type

[**Qspmdatamanagerv3AppDataResponse**](Qspmdatamanagerv3AppDataResponse.md)

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

# **q_s_data_manager_get_master_data**
> Qspmdatamanagerv3MasterDataResponse q_s_data_manager_get_master_data()

Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_master_data_response import Qspmdatamanagerv3MasterDataResponse
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
    api_instance = ibm_gdsc_sdk_software.QSDataManagerApi(api_client)

    try:
        # Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
        api_response = api_instance.q_s_data_manager_get_master_data()
        print("The response of QSDataManagerApi->q_s_data_manager_get_master_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSDataManagerApi->q_s_data_manager_get_master_data: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Qspmdatamanagerv3MasterDataResponse**](Qspmdatamanagerv3MasterDataResponse.md)

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

# **q_s_data_manager_get_net_loc_dim_data_for_scan_id**
> Qspmdatamanagerv3NetlocDataResponse q_s_data_manager_get_net_loc_dim_data_for_scan_id(scan_id)

Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_netloc_data_response import Qspmdatamanagerv3NetlocDataResponse
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
    api_instance = ibm_gdsc_sdk_software.QSDataManagerApi(api_client)
    scan_id = 'scan_id_example' # str | Identifier for the scan to retrieve netloc data for

    try:
        # Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid.
        api_response = api_instance.q_s_data_manager_get_net_loc_dim_data_for_scan_id(scan_id)
        print("The response of QSDataManagerApi->q_s_data_manager_get_net_loc_dim_data_for_scan_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSDataManagerApi->q_s_data_manager_get_net_loc_dim_data_for_scan_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scan_id** | **str**| Identifier for the scan to retrieve netloc data for | 

### Return type

[**Qspmdatamanagerv3NetlocDataResponse**](Qspmdatamanagerv3NetlocDataResponse.md)

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

# **q_s_data_manager_insert_all_entities**
> object q_s_data_manager_insert_all_entities(qspmdatamanagerv3_insert_entities_request)

Summary: Insert Data Description: Insert All Dimension and Fact tables data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_insert_entities_request import Qspmdatamanagerv3InsertEntitiesRequest
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
    api_instance = ibm_gdsc_sdk_software.QSDataManagerApi(api_client)
    qspmdatamanagerv3_insert_entities_request = ibm_gdsc_sdk_software.Qspmdatamanagerv3InsertEntitiesRequest() # Qspmdatamanagerv3InsertEntitiesRequest | 

    try:
        # Summary: Insert Data Description: Insert All Dimension and Fact tables data.
        api_response = api_instance.q_s_data_manager_insert_all_entities(qspmdatamanagerv3_insert_entities_request)
        print("The response of QSDataManagerApi->q_s_data_manager_insert_all_entities:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSDataManagerApi->q_s_data_manager_insert_all_entities: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3_insert_entities_request** | [**Qspmdatamanagerv3InsertEntitiesRequest**](Qspmdatamanagerv3InsertEntitiesRequest.md)|  | 

### Return type

**object**

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

# **q_s_data_manager_register_scan**
> Qspmdatamanagerv3ScanResponse q_s_data_manager_register_scan(qspmdatamanagerv3_scan_request)

Summary: Insert ScanDetails Description: Register new data into scan dimension table.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_scan_request import Qspmdatamanagerv3ScanRequest
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_scan_response import Qspmdatamanagerv3ScanResponse
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
    api_instance = ibm_gdsc_sdk_software.QSDataManagerApi(api_client)
    qspmdatamanagerv3_scan_request = ibm_gdsc_sdk_software.Qspmdatamanagerv3ScanRequest() # Qspmdatamanagerv3ScanRequest | 

    try:
        # Summary: Insert ScanDetails Description: Register new data into scan dimension table.
        api_response = api_instance.q_s_data_manager_register_scan(qspmdatamanagerv3_scan_request)
        print("The response of QSDataManagerApi->q_s_data_manager_register_scan:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSDataManagerApi->q_s_data_manager_register_scan: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3_scan_request** | [**Qspmdatamanagerv3ScanRequest**](Qspmdatamanagerv3ScanRequest.md)|  | 

### Return type

[**Qspmdatamanagerv3ScanResponse**](Qspmdatamanagerv3ScanResponse.md)

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

# **q_s_data_manager_retrieve_scan**
> Qspmdatamanagerv3ScanResponse q_s_data_manager_retrieve_scan(scan_id)

Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_scan_response import Qspmdatamanagerv3ScanResponse
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
    api_instance = ibm_gdsc_sdk_software.QSDataManagerApi(api_client)
    scan_id = 'scan_id_example' # str | 

    try:
        # Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
        api_response = api_instance.q_s_data_manager_retrieve_scan(scan_id)
        print("The response of QSDataManagerApi->q_s_data_manager_retrieve_scan:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSDataManagerApi->q_s_data_manager_retrieve_scan: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scan_id** | **str**|  | 

### Return type

[**Qspmdatamanagerv3ScanResponse**](Qspmdatamanagerv3ScanResponse.md)

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

# **q_s_data_manager_search_entity_data**
> Qspmdatamanagerv3SearchEntityDataResponse q_s_data_manager_search_entity_data(qspmdatamanagerv3_search_entity_data_request)

Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_search_entity_data_request import Qspmdatamanagerv3SearchEntityDataRequest
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_search_entity_data_response import Qspmdatamanagerv3SearchEntityDataResponse
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
    api_instance = ibm_gdsc_sdk_software.QSDataManagerApi(api_client)
    qspmdatamanagerv3_search_entity_data_request = ibm_gdsc_sdk_software.Qspmdatamanagerv3SearchEntityDataRequest() # Qspmdatamanagerv3SearchEntityDataRequest | 

    try:
        # Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters
        api_response = api_instance.q_s_data_manager_search_entity_data(qspmdatamanagerv3_search_entity_data_request)
        print("The response of QSDataManagerApi->q_s_data_manager_search_entity_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSDataManagerApi->q_s_data_manager_search_entity_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3_search_entity_data_request** | [**Qspmdatamanagerv3SearchEntityDataRequest**](Qspmdatamanagerv3SearchEntityDataRequest.md)|  | 

### Return type

[**Qspmdatamanagerv3SearchEntityDataResponse**](Qspmdatamanagerv3SearchEntityDataResponse.md)

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

# **q_s_data_manager_update_net_location**
> Qspmdatamanagerv3UpdateNetLocResponse q_s_data_manager_update_net_location(qspmdatamanagerv3_update_net_loc_request)

Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_update_net_loc_request import Qspmdatamanagerv3UpdateNetLocRequest
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_update_net_loc_response import Qspmdatamanagerv3UpdateNetLocResponse
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
    api_instance = ibm_gdsc_sdk_software.QSDataManagerApi(api_client)
    qspmdatamanagerv3_update_net_loc_request = ibm_gdsc_sdk_software.Qspmdatamanagerv3UpdateNetLocRequest() # Qspmdatamanagerv3UpdateNetLocRequest | 

    try:
        # Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid.
        api_response = api_instance.q_s_data_manager_update_net_location(qspmdatamanagerv3_update_net_loc_request)
        print("The response of QSDataManagerApi->q_s_data_manager_update_net_location:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSDataManagerApi->q_s_data_manager_update_net_location: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3_update_net_loc_request** | [**Qspmdatamanagerv3UpdateNetLocRequest**](Qspmdatamanagerv3UpdateNetLocRequest.md)|  | 

### Return type

[**Qspmdatamanagerv3UpdateNetLocResponse**](Qspmdatamanagerv3UpdateNetLocResponse.md)

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

