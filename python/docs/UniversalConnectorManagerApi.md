# ibm_gdsc_sdk_software.UniversalConnectorManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**universal_connector_manager_get_certificate**](UniversalConnectorManagerApi.md#universal_connector_manager_get_certificate) | **GET** /api/v3/certificates | Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in Guardium Insights.
[**universal_connector_manager_get_connectors**](UniversalConnectorManagerApi.md#universal_connector_manager_get_connectors) | **GET** /api/v3/connectors | Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
[**universal_connector_manager_list_connections_summary**](UniversalConnectorManagerApi.md#universal_connector_manager_list_connections_summary) | **GET** /api/v3/universal_connections | Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
[**universal_connector_manager_plugins_list**](UniversalConnectorManagerApi.md#universal_connector_manager_plugins_list) | **GET** /api/v3/plugins | Summary: Plugins list Description: List of all universal connector plugins.
[**universal_connector_manager_upload_plugin**](UniversalConnectorManagerApi.md#universal_connector_manager_upload_plugin) | **POST** /api/v3/plugins | Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.


# **universal_connector_manager_get_certificate**
> Universalconnectormanagerv3FileResponse universal_connector_manager_get_certificate()

Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in Guardium Insights.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_file_response import Universalconnectormanagerv3FileResponse
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
    api_instance = ibm_gdsc_sdk_software.UniversalConnectorManagerApi(api_client)

    try:
        # Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in Guardium Insights.
        api_response = api_instance.universal_connector_manager_get_certificate()
        print("The response of UniversalConnectorManagerApi->universal_connector_manager_get_certificate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UniversalConnectorManagerApi->universal_connector_manager_get_certificate: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3FileResponse**](Universalconnectormanagerv3FileResponse.md)

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

# **universal_connector_manager_get_connectors**
> Universalconnectormanagerv3GetConnectorsResponse universal_connector_manager_get_connectors()

Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_get_connectors_response import Universalconnectormanagerv3GetConnectorsResponse
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
    api_instance = ibm_gdsc_sdk_software.UniversalConnectorManagerApi(api_client)

    try:
        # Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
        api_response = api_instance.universal_connector_manager_get_connectors()
        print("The response of UniversalConnectorManagerApi->universal_connector_manager_get_connectors:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UniversalConnectorManagerApi->universal_connector_manager_get_connectors: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3GetConnectorsResponse**](Universalconnectormanagerv3GetConnectorsResponse.md)

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

# **universal_connector_manager_list_connections_summary**
> Universalconnectormanagerv3ListConnectionsResponse universal_connector_manager_list_connections_summary()

Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_list_connections_response import Universalconnectormanagerv3ListConnectionsResponse
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
    api_instance = ibm_gdsc_sdk_software.UniversalConnectorManagerApi(api_client)

    try:
        # Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
        api_response = api_instance.universal_connector_manager_list_connections_summary()
        print("The response of UniversalConnectorManagerApi->universal_connector_manager_list_connections_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UniversalConnectorManagerApi->universal_connector_manager_list_connections_summary: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3ListConnectionsResponse**](Universalconnectormanagerv3ListConnectionsResponse.md)

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

# **universal_connector_manager_plugins_list**
> Universalconnectormanagerv3PluginsListResponse universal_connector_manager_plugins_list()

Summary: Plugins list Description: List of all universal connector plugins.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_plugins_list_response import Universalconnectormanagerv3PluginsListResponse
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
    api_instance = ibm_gdsc_sdk_software.UniversalConnectorManagerApi(api_client)

    try:
        # Summary: Plugins list Description: List of all universal connector plugins.
        api_response = api_instance.universal_connector_manager_plugins_list()
        print("The response of UniversalConnectorManagerApi->universal_connector_manager_plugins_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UniversalConnectorManagerApi->universal_connector_manager_plugins_list: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Universalconnectormanagerv3PluginsListResponse**](Universalconnectormanagerv3PluginsListResponse.md)

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

# **universal_connector_manager_upload_plugin**
> RpcStatus universal_connector_manager_upload_plugin(universalconnectormanagerv3_upload_plugin_request)

Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.rpc_status import RpcStatus
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_upload_plugin_request import Universalconnectormanagerv3UploadPluginRequest
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
    api_instance = ibm_gdsc_sdk_software.UniversalConnectorManagerApi(api_client)
    universalconnectormanagerv3_upload_plugin_request = ibm_gdsc_sdk_software.Universalconnectormanagerv3UploadPluginRequest() # Universalconnectormanagerv3UploadPluginRequest | 

    try:
        # Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.
        api_response = api_instance.universal_connector_manager_upload_plugin(universalconnectormanagerv3_upload_plugin_request)
        print("The response of UniversalConnectorManagerApi->universal_connector_manager_upload_plugin:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UniversalConnectorManagerApi->universal_connector_manager_upload_plugin: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **universalconnectormanagerv3_upload_plugin_request** | [**Universalconnectormanagerv3UploadPluginRequest**](Universalconnectormanagerv3UploadPluginRequest.md)|  | 

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

