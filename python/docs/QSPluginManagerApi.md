# ibm_gdsc_sdk_saas.QSPluginManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**q_s_plugin_manager_invoke_app_prov**](QSPluginManagerApi.md#q_s_plugin_manager_invoke_app_prov) | **POST** /api/v3/plugins/{plugin_id}/application | Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
[**q_s_plugin_manager_invoke_explorer_v1**](QSPluginManagerApi.md#q_s_plugin_manager_invoke_explorer_v1) | **POST** /api/v3/plugins/{plugin_id}/explorer | Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
[**q_s_plugin_manager_invoke_explorer_v2**](QSPluginManagerApi.md#q_s_plugin_manager_invoke_explorer_v2) | **POST** /api/v3/plugins/{plugin_id}/explorer/analytics | Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
[**q_s_plugin_manager_invoke_plugin**](QSPluginManagerApi.md#q_s_plugin_manager_invoke_plugin) | **POST** /api/v3/plugins/{plugin_id}/network | Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
[**q_s_plugin_manager_invoke_policy**](QSPluginManagerApi.md#q_s_plugin_manager_invoke_policy) | **POST** /api/v3/plugins/{plugin_id}/policy | Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload


# **q_s_plugin_manager_invoke_app_prov**
> Qspmpluginmanagerv3PluginRS q_s_plugin_manager_invoke_app_prov(plugin_id, qspmpluginmanagerv3_plugin_rq)

Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_plugin_rq import Qspmpluginmanagerv3PluginRQ
from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_plugin_rs import Qspmpluginmanagerv3PluginRS
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
    api_instance = ibm_gdsc_sdk_saas.QSPluginManagerApi(api_client)
    plugin_id = 'plugin_id_example' # str | Unique identifier for the plugin
    qspmpluginmanagerv3_plugin_rq = ibm_gdsc_sdk_saas.Qspmpluginmanagerv3PluginRQ() # Qspmpluginmanagerv3PluginRQ | 

    try:
        # Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
        api_response = api_instance.q_s_plugin_manager_invoke_app_prov(plugin_id, qspmpluginmanagerv3_plugin_rq)
        print("The response of QSPluginManagerApi->q_s_plugin_manager_invoke_app_prov:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSPluginManagerApi->q_s_plugin_manager_invoke_app_prov: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plugin_id** | **str**| Unique identifier for the plugin | 
 **qspmpluginmanagerv3_plugin_rq** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md)|  | 

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

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

# **q_s_plugin_manager_invoke_explorer_v1**
> Qspmpluginmanagerv3PluginRS q_s_plugin_manager_invoke_explorer_v1(plugin_id, qspmpluginmanagerv3_plugin_rq)

Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_plugin_rq import Qspmpluginmanagerv3PluginRQ
from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_plugin_rs import Qspmpluginmanagerv3PluginRS
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
    api_instance = ibm_gdsc_sdk_saas.QSPluginManagerApi(api_client)
    plugin_id = 'plugin_id_example' # str | Unique identifier for the plugin
    qspmpluginmanagerv3_plugin_rq = ibm_gdsc_sdk_saas.Qspmpluginmanagerv3PluginRQ() # Qspmpluginmanagerv3PluginRQ | 

    try:
        # Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
        api_response = api_instance.q_s_plugin_manager_invoke_explorer_v1(plugin_id, qspmpluginmanagerv3_plugin_rq)
        print("The response of QSPluginManagerApi->q_s_plugin_manager_invoke_explorer_v1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSPluginManagerApi->q_s_plugin_manager_invoke_explorer_v1: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plugin_id** | **str**| Unique identifier for the plugin | 
 **qspmpluginmanagerv3_plugin_rq** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md)|  | 

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

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

# **q_s_plugin_manager_invoke_explorer_v2**
> Qspmpluginmanagerv3PluginRS q_s_plugin_manager_invoke_explorer_v2(plugin_id, qspmpluginmanagerv3_plugin_rq)

Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_plugin_rq import Qspmpluginmanagerv3PluginRQ
from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_plugin_rs import Qspmpluginmanagerv3PluginRS
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
    api_instance = ibm_gdsc_sdk_saas.QSPluginManagerApi(api_client)
    plugin_id = 'plugin_id_example' # str | Unique identifier for the plugin
    qspmpluginmanagerv3_plugin_rq = ibm_gdsc_sdk_saas.Qspmpluginmanagerv3PluginRQ() # Qspmpluginmanagerv3PluginRQ | 

    try:
        # Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
        api_response = api_instance.q_s_plugin_manager_invoke_explorer_v2(plugin_id, qspmpluginmanagerv3_plugin_rq)
        print("The response of QSPluginManagerApi->q_s_plugin_manager_invoke_explorer_v2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSPluginManagerApi->q_s_plugin_manager_invoke_explorer_v2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plugin_id** | **str**| Unique identifier for the plugin | 
 **qspmpluginmanagerv3_plugin_rq** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md)|  | 

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

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

# **q_s_plugin_manager_invoke_plugin**
> Qspmpluginmanagerv3PluginRS q_s_plugin_manager_invoke_plugin(plugin_id, qspmpluginmanagerv3_plugin_rq)

Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_plugin_rq import Qspmpluginmanagerv3PluginRQ
from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_plugin_rs import Qspmpluginmanagerv3PluginRS
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
    api_instance = ibm_gdsc_sdk_saas.QSPluginManagerApi(api_client)
    plugin_id = 'plugin_id_example' # str | Unique identifier for the plugin
    qspmpluginmanagerv3_plugin_rq = ibm_gdsc_sdk_saas.Qspmpluginmanagerv3PluginRQ() # Qspmpluginmanagerv3PluginRQ | 

    try:
        # Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
        api_response = api_instance.q_s_plugin_manager_invoke_plugin(plugin_id, qspmpluginmanagerv3_plugin_rq)
        print("The response of QSPluginManagerApi->q_s_plugin_manager_invoke_plugin:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSPluginManagerApi->q_s_plugin_manager_invoke_plugin: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plugin_id** | **str**| Unique identifier for the plugin | 
 **qspmpluginmanagerv3_plugin_rq** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md)|  | 

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

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

# **q_s_plugin_manager_invoke_policy**
> Qspmpluginmanagerv3PolicyPluginRS q_s_plugin_manager_invoke_policy(plugin_id, qspmpluginmanagerv3_policy_plugin_rq)

Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_policy_plugin_rq import Qspmpluginmanagerv3PolicyPluginRQ
from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_policy_plugin_rs import Qspmpluginmanagerv3PolicyPluginRS
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
    api_instance = ibm_gdsc_sdk_saas.QSPluginManagerApi(api_client)
    plugin_id = 'plugin_id_example' # str | Unique identifier for the plugin
    qspmpluginmanagerv3_policy_plugin_rq = ibm_gdsc_sdk_saas.Qspmpluginmanagerv3PolicyPluginRQ() # Qspmpluginmanagerv3PolicyPluginRQ | 

    try:
        # Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload
        api_response = api_instance.q_s_plugin_manager_invoke_policy(plugin_id, qspmpluginmanagerv3_policy_plugin_rq)
        print("The response of QSPluginManagerApi->q_s_plugin_manager_invoke_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSPluginManagerApi->q_s_plugin_manager_invoke_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plugin_id** | **str**| Unique identifier for the plugin | 
 **qspmpluginmanagerv3_policy_plugin_rq** | [**Qspmpluginmanagerv3PolicyPluginRQ**](Qspmpluginmanagerv3PolicyPluginRQ.md)|  | 

### Return type

[**Qspmpluginmanagerv3PolicyPluginRS**](Qspmpluginmanagerv3PolicyPluginRS.md)

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

