# ibm_gdsc_sdk_saas.ConnectionsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connections_service_create_connections_accounts**](ConnectionsServiceApi.md#connections_service_create_connections_accounts) | **POST** /api/v3/connections/accounts | Summary: Create Connections accounts Description: Create Connections acccounts.
[**connections_service_create_connections_configs**](ConnectionsServiceApi.md#connections_service_create_connections_configs) | **POST** /api/v3/connections/configs | Summary: Create connections configs Description: Create Connection config by connection type.
[**connections_service_create_plugin**](ConnectionsServiceApi.md#connections_service_create_plugin) | **POST** /api/v3/connections/plugins | Summary: Create plugin Description: Create UC generic plugin
[**connections_service_create_settings**](ConnectionsServiceApi.md#connections_service_create_settings) | **POST** /api/v3/connections/settings | Summary: Create settings Description: Create Settings.
[**connections_service_delete_connections_accounts**](ConnectionsServiceApi.md#connections_service_delete_connections_accounts) | **DELETE** /api/v3/connections/accounts/{account_id} | Summary: Delete Connections accounts Description: Delete Connections acccounts.
[**connections_service_delete_connections_configs**](ConnectionsServiceApi.md#connections_service_delete_connections_configs) | **DELETE** /api/v3/connections/configs/{connection_id} | Summary: Delete connections configs Description: Delete Connection config by connection id.
[**connections_service_delete_connector**](ConnectionsServiceApi.md#connections_service_delete_connector) | **DELETE** /api/v3/connections/{connection_id} | Summary: Delete connector Description: Delete a Connection.
[**connections_service_delete_plugin**](ConnectionsServiceApi.md#connections_service_delete_plugin) | **DELETE** /api/v3/connections/plugins/{id} | Summary: Delete plugin. Description: Delete plugin.
[**connections_service_generate_package**](ConnectionsServiceApi.md#connections_service_generate_package) | **PUT** /api/v3/connections/plugins/{id}/package | Summary: Generate package. Description: Generate package.
[**connections_service_get_banner_state**](ConnectionsServiceApi.md#connections_service_get_banner_state) | **GET** /api/v3/connections/banner | Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.
[**connections_service_get_connections_accounts**](ConnectionsServiceApi.md#connections_service_get_connections_accounts) | **GET** /api/v3/connections/accounts | Summary: Get Connections accounts Description: Get Connections acccounts.
[**connections_service_get_connections_configs**](ConnectionsServiceApi.md#connections_service_get_connections_configs) | **GET** /api/v3/connections/configs | Summary: Get connections configs Description: Get Connection config by connection type.
[**connections_service_get_connections_with_filters**](ConnectionsServiceApi.md#connections_service_get_connections_with_filters) | **POST** /api/v3/connections | Summary: Get connections with filters Description: Get connections with filters.
[**connections_service_get_connectors_summary**](ConnectionsServiceApi.md#connections_service_get_connectors_summary) | **GET** /api/v3/connections/summary | Summary: Get connectors summary Description: Get a summary of Connectors.
[**connections_service_get_data_sources**](ConnectionsServiceApi.md#connections_service_get_data_sources) | **GET** /api/v3/connections/datasources | Summary: Get data sources Description: Get a list of data sources.
[**connections_service_get_guard_record_fields**](ConnectionsServiceApi.md#connections_service_get_guard_record_fields) | **GET** /api/v3/connections/fields | Summary: Get list of guard record fields.  Description: Get list of guard record fields.
[**connections_service_get_headers**](ConnectionsServiceApi.md#connections_service_get_headers) | **GET** /api/v3/connections/headers | Summary: Get headers Description: Get a list of Headers.
[**connections_service_get_plugins**](ConnectionsServiceApi.md#connections_service_get_plugins) | **GET** /api/v3/connections/plugins | Summary: Get plugins  Description: Get custom universal connector plugins
[**connections_service_get_settings**](ConnectionsServiceApi.md#connections_service_get_settings) | **GET** /api/v3/connections/settings | Summary: Get settings Description: Get a list of Settings.
[**connections_service_partial_update_connectors**](ConnectionsServiceApi.md#connections_service_partial_update_connectors) | **PATCH** /api/v3/connections | Summary: Partial update connectors Description: Partial update of Connectors.
[**connections_service_post_stap_command**](ConnectionsServiceApi.md#connections_service_post_stap_command) | **POST** /api/v3/stap/commands | Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.
[**connections_service_update_banner_state**](ConnectionsServiceApi.md#connections_service_update_banner_state) | **PUT** /api/v3/connections/banner | Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.
[**connections_service_update_connections_accounts**](ConnectionsServiceApi.md#connections_service_update_connections_accounts) | **PUT** /api/v3/connections/accounts | Summary: Update Connections accounts Description: Update Connections acccounts.
[**connections_service_update_connections_configs**](ConnectionsServiceApi.md#connections_service_update_connections_configs) | **PATCH** /api/v3/connections/configs | Summary: Update connections configs Description: Update Connection config by connection id.
[**connections_service_update_connectors**](ConnectionsServiceApi.md#connections_service_update_connectors) | **PUT** /api/v3/connections | Summary: Update connectors Description: Update a list of Connectors.
[**connections_service_update_plugin**](ConnectionsServiceApi.md#connections_service_update_plugin) | **PUT** /api/v3/connections/plugins/{id} | Summary: Update plugin. Description: Update plugin.
[**connections_service_update_settings**](ConnectionsServiceApi.md#connections_service_update_settings) | **PUT** /api/v3/connections/settings | Summary: Update settings Description: Update Settings.
[**connections_service_validate_aws_connection**](ConnectionsServiceApi.md#connections_service_validate_aws_connection) | **POST** /api/v3/connections/validate/aws | Summary: Validate an AWS connection. Description: Validate an AWS connection.
[**connections_service_validate_azure_connection**](ConnectionsServiceApi.md#connections_service_validate_azure_connection) | **POST** /api/v3/connections/validate/azure | Summary: Validate an Azure connection. Description: Validate an Azure connection.
[**connections_service_validate_gcp_connection**](ConnectionsServiceApi.md#connections_service_validate_gcp_connection) | **POST** /api/v3/connections/validate/gcp | Summary: Validate a GCP connection. Description: Validate a GCP connection.


# **connections_service_create_connections_accounts**
> Connectionsv3CreateConnectionsAccountsResponse connections_service_create_connections_accounts(connectionsv3_create_connections_accounts_request)

Summary: Create Connections accounts Description: Create Connections acccounts.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_create_connections_accounts_request import Connectionsv3CreateConnectionsAccountsRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_create_connections_accounts_response import Connectionsv3CreateConnectionsAccountsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_create_connections_accounts_request = ibm_gdsc_sdk_saas.Connectionsv3CreateConnectionsAccountsRequest() # Connectionsv3CreateConnectionsAccountsRequest | 

    try:
        # Summary: Create Connections accounts Description: Create Connections acccounts.
        api_response = api_instance.connections_service_create_connections_accounts(connectionsv3_create_connections_accounts_request)
        print("The response of ConnectionsServiceApi->connections_service_create_connections_accounts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_create_connections_accounts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_create_connections_accounts_request** | [**Connectionsv3CreateConnectionsAccountsRequest**](Connectionsv3CreateConnectionsAccountsRequest.md)|  | 

### Return type

[**Connectionsv3CreateConnectionsAccountsResponse**](Connectionsv3CreateConnectionsAccountsResponse.md)

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

# **connections_service_create_connections_configs**
> Connectionsv3CreateConnectionsConfigsResponse connections_service_create_connections_configs(connectionsv3_create_connections_configs_request)

Summary: Create connections configs Description: Create Connection config by connection type.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_create_connections_configs_request import Connectionsv3CreateConnectionsConfigsRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_create_connections_configs_response import Connectionsv3CreateConnectionsConfigsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_create_connections_configs_request = ibm_gdsc_sdk_saas.Connectionsv3CreateConnectionsConfigsRequest() # Connectionsv3CreateConnectionsConfigsRequest | 

    try:
        # Summary: Create connections configs Description: Create Connection config by connection type.
        api_response = api_instance.connections_service_create_connections_configs(connectionsv3_create_connections_configs_request)
        print("The response of ConnectionsServiceApi->connections_service_create_connections_configs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_create_connections_configs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_create_connections_configs_request** | [**Connectionsv3CreateConnectionsConfigsRequest**](Connectionsv3CreateConnectionsConfigsRequest.md)|  | 

### Return type

[**Connectionsv3CreateConnectionsConfigsResponse**](Connectionsv3CreateConnectionsConfigsResponse.md)

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

# **connections_service_create_plugin**
> Connectionsv3CreatePluginResponse connections_service_create_plugin(connectionsv3_create_plugin_request)

Summary: Create plugin Description: Create UC generic plugin

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_create_plugin_request import Connectionsv3CreatePluginRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_create_plugin_response import Connectionsv3CreatePluginResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_create_plugin_request = ibm_gdsc_sdk_saas.Connectionsv3CreatePluginRequest() # Connectionsv3CreatePluginRequest | 

    try:
        # Summary: Create plugin Description: Create UC generic plugin
        api_response = api_instance.connections_service_create_plugin(connectionsv3_create_plugin_request)
        print("The response of ConnectionsServiceApi->connections_service_create_plugin:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_create_plugin: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_create_plugin_request** | [**Connectionsv3CreatePluginRequest**](Connectionsv3CreatePluginRequest.md)|  | 

### Return type

[**Connectionsv3CreatePluginResponse**](Connectionsv3CreatePluginResponse.md)

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

# **connections_service_create_settings**
> object connections_service_create_settings(connectionsv3_create_settings_request)

Summary: Create settings Description: Create Settings.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_create_settings_request import Connectionsv3CreateSettingsRequest
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_create_settings_request = ibm_gdsc_sdk_saas.Connectionsv3CreateSettingsRequest() # Connectionsv3CreateSettingsRequest | 

    try:
        # Summary: Create settings Description: Create Settings.
        api_response = api_instance.connections_service_create_settings(connectionsv3_create_settings_request)
        print("The response of ConnectionsServiceApi->connections_service_create_settings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_create_settings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_create_settings_request** | [**Connectionsv3CreateSettingsRequest**](Connectionsv3CreateSettingsRequest.md)|  | 

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

# **connections_service_delete_connections_accounts**
> Connectionsv3DeleteConnectionsAccountsResponse connections_service_delete_connections_accounts(account_id)

Summary: Delete Connections accounts Description: Delete Connections acccounts.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_delete_connections_accounts_response import Connectionsv3DeleteConnectionsAccountsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    account_id = 'account_id_example' # str | Account id.

    try:
        # Summary: Delete Connections accounts Description: Delete Connections acccounts.
        api_response = api_instance.connections_service_delete_connections_accounts(account_id)
        print("The response of ConnectionsServiceApi->connections_service_delete_connections_accounts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_delete_connections_accounts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**| Account id. | 

### Return type

[**Connectionsv3DeleteConnectionsAccountsResponse**](Connectionsv3DeleteConnectionsAccountsResponse.md)

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

# **connections_service_delete_connections_configs**
> Connectionsv3DeleteConnectionsConfigsResponse connections_service_delete_connections_configs(connection_id)

Summary: Delete connections configs Description: Delete Connection config by connection id.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_delete_connections_configs_response import Connectionsv3DeleteConnectionsConfigsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connection_id = 'connection_id_example' # str | Connection id.

    try:
        # Summary: Delete connections configs Description: Delete Connection config by connection id.
        api_response = api_instance.connections_service_delete_connections_configs(connection_id)
        print("The response of ConnectionsServiceApi->connections_service_delete_connections_configs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_delete_connections_configs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connection_id** | **str**| Connection id. | 

### Return type

[**Connectionsv3DeleteConnectionsConfigsResponse**](Connectionsv3DeleteConnectionsConfigsResponse.md)

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

# **connections_service_delete_connector**
> object connections_service_delete_connector(connection_id)

Summary: Delete connector Description: Delete a Connection.

### Example

* Basic Authentication (BasicAuth):
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connection_id = 'connection_id_example' # str | The connection id

    try:
        # Summary: Delete connector Description: Delete a Connection.
        api_response = api_instance.connections_service_delete_connector(connection_id)
        print("The response of ConnectionsServiceApi->connections_service_delete_connector:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_delete_connector: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connection_id** | **str**| The connection id | 

### Return type

**object**

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

# **connections_service_delete_plugin**
> Connectionsv3DeletePluginResponse connections_service_delete_plugin(id)

Summary: Delete plugin. Description: Delete plugin.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_delete_plugin_response import Connectionsv3DeletePluginResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    id = 'id_example' # str | plugin id

    try:
        # Summary: Delete plugin. Description: Delete plugin.
        api_response = api_instance.connections_service_delete_plugin(id)
        print("The response of ConnectionsServiceApi->connections_service_delete_plugin:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_delete_plugin: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| plugin id | 

### Return type

[**Connectionsv3DeletePluginResponse**](Connectionsv3DeletePluginResponse.md)

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

# **connections_service_generate_package**
> Connectionsv3GeneratePackageResponse connections_service_generate_package(id, connectionsv3_generate_package_request)

Summary: Generate package. Description: Generate package.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_generate_package_request import Connectionsv3GeneratePackageRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_generate_package_response import Connectionsv3GeneratePackageResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    id = 'id_example' # str | id
    connectionsv3_generate_package_request = ibm_gdsc_sdk_saas.Connectionsv3GeneratePackageRequest() # Connectionsv3GeneratePackageRequest | 

    try:
        # Summary: Generate package. Description: Generate package.
        api_response = api_instance.connections_service_generate_package(id, connectionsv3_generate_package_request)
        print("The response of ConnectionsServiceApi->connections_service_generate_package:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_generate_package: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| id | 
 **connectionsv3_generate_package_request** | [**Connectionsv3GeneratePackageRequest**](Connectionsv3GeneratePackageRequest.md)|  | 

### Return type

[**Connectionsv3GeneratePackageResponse**](Connectionsv3GeneratePackageResponse.md)

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

# **connections_service_get_banner_state**
> Connectionsv3GetBannerStateResponse connections_service_get_banner_state()

Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_get_banner_state_response import Connectionsv3GetBannerStateResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)

    try:
        # Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.
        api_response = api_instance.connections_service_get_banner_state()
        print("The response of ConnectionsServiceApi->connections_service_get_banner_state:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_get_banner_state: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetBannerStateResponse**](Connectionsv3GetBannerStateResponse.md)

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

# **connections_service_get_connections_accounts**
> Connectionsv3GetConnectionsAccountsResponse connections_service_get_connections_accounts(account_id=account_id, access_key=access_key)

Summary: Get Connections accounts Description: Get Connections acccounts.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_get_connections_accounts_response import Connectionsv3GetConnectionsAccountsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    account_id = 'account_id_example' # str | Optional: account id. (optional)
    access_key = 'access_key_example' # str | Optional: acccount access key. (optional)

    try:
        # Summary: Get Connections accounts Description: Get Connections acccounts.
        api_response = api_instance.connections_service_get_connections_accounts(account_id=account_id, access_key=access_key)
        print("The response of ConnectionsServiceApi->connections_service_get_connections_accounts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_get_connections_accounts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**| Optional: account id. | [optional] 
 **access_key** | **str**| Optional: acccount access key. | [optional] 

### Return type

[**Connectionsv3GetConnectionsAccountsResponse**](Connectionsv3GetConnectionsAccountsResponse.md)

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

# **connections_service_get_connections_configs**
> Connectionsv3GetConnectionsConfigsResponse connections_service_get_connections_configs(type=type, connection_id=connection_id)

Summary: Get connections configs Description: Get Connection config by connection type.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_get_connections_configs_response import Connectionsv3GetConnectionsConfigsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    type = UNDEFINED_TYPE # str | The type of connector. (optional) (default to UNDEFINED_TYPE)
    connection_id = 'connection_id_example' # str | Optional: if connection id did not provide then return all connections. (optional)

    try:
        # Summary: Get connections configs Description: Get Connection config by connection type.
        api_response = api_instance.connections_service_get_connections_configs(type=type, connection_id=connection_id)
        print("The response of ConnectionsServiceApi->connections_service_get_connections_configs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_get_connections_configs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| The type of connector. | [optional] [default to UNDEFINED_TYPE]
 **connection_id** | **str**| Optional: if connection id did not provide then return all connections. | [optional] 

### Return type

[**Connectionsv3GetConnectionsConfigsResponse**](Connectionsv3GetConnectionsConfigsResponse.md)

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

# **connections_service_get_connections_with_filters**
> Connectionsv3GetConnectionsWithFiltersResponse connections_service_get_connections_with_filters(connectionsv3_get_connections_with_filters_request)

Summary: Get connections with filters Description: Get connections with filters.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_get_connections_with_filters_request import Connectionsv3GetConnectionsWithFiltersRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_get_connections_with_filters_response import Connectionsv3GetConnectionsWithFiltersResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_get_connections_with_filters_request = ibm_gdsc_sdk_saas.Connectionsv3GetConnectionsWithFiltersRequest() # Connectionsv3GetConnectionsWithFiltersRequest | 

    try:
        # Summary: Get connections with filters Description: Get connections with filters.
        api_response = api_instance.connections_service_get_connections_with_filters(connectionsv3_get_connections_with_filters_request)
        print("The response of ConnectionsServiceApi->connections_service_get_connections_with_filters:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_get_connections_with_filters: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_get_connections_with_filters_request** | [**Connectionsv3GetConnectionsWithFiltersRequest**](Connectionsv3GetConnectionsWithFiltersRequest.md)|  | 

### Return type

[**Connectionsv3GetConnectionsWithFiltersResponse**](Connectionsv3GetConnectionsWithFiltersResponse.md)

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

# **connections_service_get_connectors_summary**
> Connectionsv3GetConnectorsSummaryResponse connections_service_get_connectors_summary()

Summary: Get connectors summary Description: Get a summary of Connectors.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_get_connectors_summary_response import Connectionsv3GetConnectorsSummaryResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)

    try:
        # Summary: Get connectors summary Description: Get a summary of Connectors.
        api_response = api_instance.connections_service_get_connectors_summary()
        print("The response of ConnectionsServiceApi->connections_service_get_connectors_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_get_connectors_summary: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetConnectorsSummaryResponse**](Connectionsv3GetConnectorsSummaryResponse.md)

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

# **connections_service_get_data_sources**
> Connectionsv3GetDataSourcesResponse connections_service_get_data_sources()

Summary: Get data sources Description: Get a list of data sources.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_get_data_sources_response import Connectionsv3GetDataSourcesResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)

    try:
        # Summary: Get data sources Description: Get a list of data sources.
        api_response = api_instance.connections_service_get_data_sources()
        print("The response of ConnectionsServiceApi->connections_service_get_data_sources:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_get_data_sources: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetDataSourcesResponse**](Connectionsv3GetDataSourcesResponse.md)

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

# **connections_service_get_guard_record_fields**
> Connectionsv3GetGuardRecordFieldsResponse connections_service_get_guard_record_fields()

Summary: Get list of guard record fields.  Description: Get list of guard record fields.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_get_guard_record_fields_response import Connectionsv3GetGuardRecordFieldsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)

    try:
        # Summary: Get list of guard record fields.  Description: Get list of guard record fields.
        api_response = api_instance.connections_service_get_guard_record_fields()
        print("The response of ConnectionsServiceApi->connections_service_get_guard_record_fields:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_get_guard_record_fields: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetGuardRecordFieldsResponse**](Connectionsv3GetGuardRecordFieldsResponse.md)

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

# **connections_service_get_headers**
> Connectionsv3GetHeadersResponse connections_service_get_headers()

Summary: Get headers Description: Get a list of Headers.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_get_headers_response import Connectionsv3GetHeadersResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)

    try:
        # Summary: Get headers Description: Get a list of Headers.
        api_response = api_instance.connections_service_get_headers()
        print("The response of ConnectionsServiceApi->connections_service_get_headers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_get_headers: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetHeadersResponse**](Connectionsv3GetHeadersResponse.md)

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

# **connections_service_get_plugins**
> Connectionsv3GetPluginsResponse connections_service_get_plugins(id=id)

Summary: Get plugins  Description: Get custom universal connector plugins

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_get_plugins_response import Connectionsv3GetPluginsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    id = 'id_example' # str | Optional: if no plug-in id is provided, returns list of all plug-ins. (optional)

    try:
        # Summary: Get plugins  Description: Get custom universal connector plugins
        api_response = api_instance.connections_service_get_plugins(id=id)
        print("The response of ConnectionsServiceApi->connections_service_get_plugins:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_get_plugins: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Optional: if no plug-in id is provided, returns list of all plug-ins. | [optional] 

### Return type

[**Connectionsv3GetPluginsResponse**](Connectionsv3GetPluginsResponse.md)

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

# **connections_service_get_settings**
> Connectionsv3GetSettingsResponse connections_service_get_settings()

Summary: Get settings Description: Get a list of Settings.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_get_settings_response import Connectionsv3GetSettingsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)

    try:
        # Summary: Get settings Description: Get a list of Settings.
        api_response = api_instance.connections_service_get_settings()
        print("The response of ConnectionsServiceApi->connections_service_get_settings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_get_settings: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Connectionsv3GetSettingsResponse**](Connectionsv3GetSettingsResponse.md)

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

# **connections_service_partial_update_connectors**
> Connectionsv3PartialUpdateConnectorsResponse connections_service_partial_update_connectors(connectionsv3_partial_update_connectors_request)

Summary: Partial update connectors Description: Partial update of Connectors.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_partial_update_connectors_request import Connectionsv3PartialUpdateConnectorsRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_partial_update_connectors_response import Connectionsv3PartialUpdateConnectorsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_partial_update_connectors_request = ibm_gdsc_sdk_saas.Connectionsv3PartialUpdateConnectorsRequest() # Connectionsv3PartialUpdateConnectorsRequest | 

    try:
        # Summary: Partial update connectors Description: Partial update of Connectors.
        api_response = api_instance.connections_service_partial_update_connectors(connectionsv3_partial_update_connectors_request)
        print("The response of ConnectionsServiceApi->connections_service_partial_update_connectors:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_partial_update_connectors: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_partial_update_connectors_request** | [**Connectionsv3PartialUpdateConnectorsRequest**](Connectionsv3PartialUpdateConnectorsRequest.md)|  | 

### Return type

[**Connectionsv3PartialUpdateConnectorsResponse**](Connectionsv3PartialUpdateConnectorsResponse.md)

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

# **connections_service_post_stap_command**
> Connectionsv3StatusResponseBase connections_service_post_stap_command(connectionsv3_stap_command_request)

Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_stap_command_request import Connectionsv3StapCommandRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_status_response_base import Connectionsv3StatusResponseBase
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_stap_command_request = ibm_gdsc_sdk_saas.Connectionsv3StapCommandRequest() # Connectionsv3StapCommandRequest | 

    try:
        # Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.
        api_response = api_instance.connections_service_post_stap_command(connectionsv3_stap_command_request)
        print("The response of ConnectionsServiceApi->connections_service_post_stap_command:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_post_stap_command: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_stap_command_request** | [**Connectionsv3StapCommandRequest**](Connectionsv3StapCommandRequest.md)|  | 

### Return type

[**Connectionsv3StatusResponseBase**](Connectionsv3StatusResponseBase.md)

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

# **connections_service_update_banner_state**
> Connectionsv3UpdateBannerStateResponse connections_service_update_banner_state(connectionsv3_update_banner_state_request)

Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_update_banner_state_request import Connectionsv3UpdateBannerStateRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_update_banner_state_response import Connectionsv3UpdateBannerStateResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_update_banner_state_request = ibm_gdsc_sdk_saas.Connectionsv3UpdateBannerStateRequest() # Connectionsv3UpdateBannerStateRequest | 

    try:
        # Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.
        api_response = api_instance.connections_service_update_banner_state(connectionsv3_update_banner_state_request)
        print("The response of ConnectionsServiceApi->connections_service_update_banner_state:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_update_banner_state: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_update_banner_state_request** | [**Connectionsv3UpdateBannerStateRequest**](Connectionsv3UpdateBannerStateRequest.md)|  | 

### Return type

[**Connectionsv3UpdateBannerStateResponse**](Connectionsv3UpdateBannerStateResponse.md)

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

# **connections_service_update_connections_accounts**
> Connectionsv3UpdateConnectionsAccountsResponse connections_service_update_connections_accounts(connectionsv3_update_connections_accounts_request)

Summary: Update Connections accounts Description: Update Connections acccounts.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_update_connections_accounts_request import Connectionsv3UpdateConnectionsAccountsRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_update_connections_accounts_response import Connectionsv3UpdateConnectionsAccountsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_update_connections_accounts_request = ibm_gdsc_sdk_saas.Connectionsv3UpdateConnectionsAccountsRequest() # Connectionsv3UpdateConnectionsAccountsRequest | 

    try:
        # Summary: Update Connections accounts Description: Update Connections acccounts.
        api_response = api_instance.connections_service_update_connections_accounts(connectionsv3_update_connections_accounts_request)
        print("The response of ConnectionsServiceApi->connections_service_update_connections_accounts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_update_connections_accounts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_update_connections_accounts_request** | [**Connectionsv3UpdateConnectionsAccountsRequest**](Connectionsv3UpdateConnectionsAccountsRequest.md)|  | 

### Return type

[**Connectionsv3UpdateConnectionsAccountsResponse**](Connectionsv3UpdateConnectionsAccountsResponse.md)

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

# **connections_service_update_connections_configs**
> Connectionsv3UpdateConnectionsConfigsResponse connections_service_update_connections_configs(connectionsv3_update_connections_configs_request)

Summary: Update connections configs Description: Update Connection config by connection id.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_update_connections_configs_request import Connectionsv3UpdateConnectionsConfigsRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_update_connections_configs_response import Connectionsv3UpdateConnectionsConfigsResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_update_connections_configs_request = ibm_gdsc_sdk_saas.Connectionsv3UpdateConnectionsConfigsRequest() # Connectionsv3UpdateConnectionsConfigsRequest | 

    try:
        # Summary: Update connections configs Description: Update Connection config by connection id.
        api_response = api_instance.connections_service_update_connections_configs(connectionsv3_update_connections_configs_request)
        print("The response of ConnectionsServiceApi->connections_service_update_connections_configs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_update_connections_configs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_update_connections_configs_request** | [**Connectionsv3UpdateConnectionsConfigsRequest**](Connectionsv3UpdateConnectionsConfigsRequest.md)|  | 

### Return type

[**Connectionsv3UpdateConnectionsConfigsResponse**](Connectionsv3UpdateConnectionsConfigsResponse.md)

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

# **connections_service_update_connectors**
> object connections_service_update_connectors(connectionsv3_update_connectors_request)

Summary: Update connectors Description: Update a list of Connectors.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_update_connectors_request import Connectionsv3UpdateConnectorsRequest
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_update_connectors_request = ibm_gdsc_sdk_saas.Connectionsv3UpdateConnectorsRequest() # Connectionsv3UpdateConnectorsRequest | 

    try:
        # Summary: Update connectors Description: Update a list of Connectors.
        api_response = api_instance.connections_service_update_connectors(connectionsv3_update_connectors_request)
        print("The response of ConnectionsServiceApi->connections_service_update_connectors:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_update_connectors: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_update_connectors_request** | [**Connectionsv3UpdateConnectorsRequest**](Connectionsv3UpdateConnectorsRequest.md)|  | 

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

# **connections_service_update_plugin**
> Connectionsv3UpdatePluginResponse connections_service_update_plugin(id, connectionsv3_update_plugin_request)

Summary: Update plugin. Description: Update plugin.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_update_plugin_request import Connectionsv3UpdatePluginRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_update_plugin_response import Connectionsv3UpdatePluginResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    id = 'id_example' # str | id
    connectionsv3_update_plugin_request = ibm_gdsc_sdk_saas.Connectionsv3UpdatePluginRequest() # Connectionsv3UpdatePluginRequest | 

    try:
        # Summary: Update plugin. Description: Update plugin.
        api_response = api_instance.connections_service_update_plugin(id, connectionsv3_update_plugin_request)
        print("The response of ConnectionsServiceApi->connections_service_update_plugin:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_update_plugin: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| id | 
 **connectionsv3_update_plugin_request** | [**Connectionsv3UpdatePluginRequest**](Connectionsv3UpdatePluginRequest.md)|  | 

### Return type

[**Connectionsv3UpdatePluginResponse**](Connectionsv3UpdatePluginResponse.md)

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

# **connections_service_update_settings**
> object connections_service_update_settings(connectionsv3_update_settings_request)

Summary: Update settings Description: Update Settings.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_update_settings_request import Connectionsv3UpdateSettingsRequest
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_update_settings_request = ibm_gdsc_sdk_saas.Connectionsv3UpdateSettingsRequest() # Connectionsv3UpdateSettingsRequest | 

    try:
        # Summary: Update settings Description: Update Settings.
        api_response = api_instance.connections_service_update_settings(connectionsv3_update_settings_request)
        print("The response of ConnectionsServiceApi->connections_service_update_settings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_update_settings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_update_settings_request** | [**Connectionsv3UpdateSettingsRequest**](Connectionsv3UpdateSettingsRequest.md)|  | 

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

# **connections_service_validate_aws_connection**
> Connectionsv3ValidateConnectionResponse connections_service_validate_aws_connection(connectionsv3_validate_aws_connection_request)

Summary: Validate an AWS connection. Description: Validate an AWS connection.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_validate_aws_connection_request import Connectionsv3ValidateAwsConnectionRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_validate_connection_response import Connectionsv3ValidateConnectionResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_validate_aws_connection_request = ibm_gdsc_sdk_saas.Connectionsv3ValidateAwsConnectionRequest() # Connectionsv3ValidateAwsConnectionRequest | 

    try:
        # Summary: Validate an AWS connection. Description: Validate an AWS connection.
        api_response = api_instance.connections_service_validate_aws_connection(connectionsv3_validate_aws_connection_request)
        print("The response of ConnectionsServiceApi->connections_service_validate_aws_connection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_validate_aws_connection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_validate_aws_connection_request** | [**Connectionsv3ValidateAwsConnectionRequest**](Connectionsv3ValidateAwsConnectionRequest.md)|  | 

### Return type

[**Connectionsv3ValidateConnectionResponse**](Connectionsv3ValidateConnectionResponse.md)

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

# **connections_service_validate_azure_connection**
> Connectionsv3ValidateConnectionResponse connections_service_validate_azure_connection(connectionsv3_validate_azure_connection_request)

Summary: Validate an Azure connection. Description: Validate an Azure connection.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_validate_azure_connection_request import Connectionsv3ValidateAzureConnectionRequest
from ibm_gdsc_sdk_saas.models.connectionsv3_validate_connection_response import Connectionsv3ValidateConnectionResponse
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_validate_azure_connection_request = ibm_gdsc_sdk_saas.Connectionsv3ValidateAzureConnectionRequest() # Connectionsv3ValidateAzureConnectionRequest | 

    try:
        # Summary: Validate an Azure connection. Description: Validate an Azure connection.
        api_response = api_instance.connections_service_validate_azure_connection(connectionsv3_validate_azure_connection_request)
        print("The response of ConnectionsServiceApi->connections_service_validate_azure_connection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_validate_azure_connection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_validate_azure_connection_request** | [**Connectionsv3ValidateAzureConnectionRequest**](Connectionsv3ValidateAzureConnectionRequest.md)|  | 

### Return type

[**Connectionsv3ValidateConnectionResponse**](Connectionsv3ValidateConnectionResponse.md)

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

# **connections_service_validate_gcp_connection**
> Connectionsv3ValidateConnectionResponse connections_service_validate_gcp_connection(connectionsv3_validate_gcp_connection_request)

Summary: Validate a GCP connection. Description: Validate a GCP connection.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.connectionsv3_validate_connection_response import Connectionsv3ValidateConnectionResponse
from ibm_gdsc_sdk_saas.models.connectionsv3_validate_gcp_connection_request import Connectionsv3ValidateGcpConnectionRequest
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
    api_instance = ibm_gdsc_sdk_saas.ConnectionsServiceApi(api_client)
    connectionsv3_validate_gcp_connection_request = ibm_gdsc_sdk_saas.Connectionsv3ValidateGcpConnectionRequest() # Connectionsv3ValidateGcpConnectionRequest | 

    try:
        # Summary: Validate a GCP connection. Description: Validate a GCP connection.
        api_response = api_instance.connections_service_validate_gcp_connection(connectionsv3_validate_gcp_connection_request)
        print("The response of ConnectionsServiceApi->connections_service_validate_gcp_connection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConnectionsServiceApi->connections_service_validate_gcp_connection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3_validate_gcp_connection_request** | [**Connectionsv3ValidateGcpConnectionRequest**](Connectionsv3ValidateGcpConnectionRequest.md)|  | 

### Return type

[**Connectionsv3ValidateConnectionResponse**](Connectionsv3ValidateConnectionResponse.md)

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

