# ibm_gdsc_sdk_saas.QSDataManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**q_s_data_manager_get_master_data**](QSDataManagerApi.md#q_s_data_manager_get_master_data) | **GET** /api/v3/datamanager/master-data | Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
[**q_s_data_manager_get_plugin_data**](QSDataManagerApi.md#q_s_data_manager_get_plugin_data) | **GET** /api/v3/datamanager/plugin | Summary: Plugins Details Description: Retrieves All plugins information.
[**q_s_data_manager_register_scan**](QSDataManagerApi.md#q_s_data_manager_register_scan) | **POST** /api/v3/datamanager/scan | Summary: Insert ScanDetails Description: Register new data into scan dimension table.
[**q_s_data_manager_retrieve_scan**](QSDataManagerApi.md#q_s_data_manager_retrieve_scan) | **GET** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.


# **q_s_data_manager_get_master_data**
> Qspmdatamanagerv3MasterDataResponse q_s_data_manager_get_master_data()

Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmdatamanagerv3_master_data_response import Qspmdatamanagerv3MasterDataResponse
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
    api_instance = ibm_gdsc_sdk_saas.QSDataManagerApi(api_client)

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

# **q_s_data_manager_get_plugin_data**
> Qspmdatamanagerv3PluginDataResponse q_s_data_manager_get_plugin_data()

Summary: Plugins Details Description: Retrieves All plugins information.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmdatamanagerv3_plugin_data_response import Qspmdatamanagerv3PluginDataResponse
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
    api_instance = ibm_gdsc_sdk_saas.QSDataManagerApi(api_client)

    try:
        # Summary: Plugins Details Description: Retrieves All plugins information.
        api_response = api_instance.q_s_data_manager_get_plugin_data()
        print("The response of QSDataManagerApi->q_s_data_manager_get_plugin_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSDataManagerApi->q_s_data_manager_get_plugin_data: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Qspmdatamanagerv3PluginDataResponse**](Qspmdatamanagerv3PluginDataResponse.md)

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

# **q_s_data_manager_register_scan**
> Qspmdatamanagerv3ScanResponse q_s_data_manager_register_scan(qspmdatamanagerv3_scan_request)

Summary: Insert ScanDetails Description: Register new data into scan dimension table.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmdatamanagerv3_scan_request import Qspmdatamanagerv3ScanRequest
from ibm_gdsc_sdk_saas.models.qspmdatamanagerv3_scan_response import Qspmdatamanagerv3ScanResponse
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
    api_instance = ibm_gdsc_sdk_saas.QSDataManagerApi(api_client)
    qspmdatamanagerv3_scan_request = ibm_gdsc_sdk_saas.Qspmdatamanagerv3ScanRequest() # Qspmdatamanagerv3ScanRequest | 

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
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmdatamanagerv3_scan_response import Qspmdatamanagerv3ScanResponse
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
    api_instance = ibm_gdsc_sdk_saas.QSDataManagerApi(api_client)
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

