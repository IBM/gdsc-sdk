# ibm_gdsc_sdk_software.AuthServerServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auth_server_service_create_oauth_client**](AuthServerServiceApi.md#auth_server_service_create_oauth_client) | **POST** /api/v3/oauth/clients | Summary: Create Oauth client Description: Create/register new Oauth client.
[**auth_server_service_delete_oauth_client**](AuthServerServiceApi.md#auth_server_service_delete_oauth_client) | **DELETE** /api/v3/oauth/clients/{client_id} | Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
[**auth_server_service_get_access_token**](AuthServerServiceApi.md#auth_server_service_get_access_token) | **GET** /api/v3/oauth/token | Summary: Get access token Description: Get access token from passed clientId and secret.
[**auth_server_service_get_oauth_client**](AuthServerServiceApi.md#auth_server_service_get_oauth_client) | **GET** /api/v3/oauth/clients/{client_id} | Summary: Get Oauth client Description: Get registered Oauth client by clientId.
[**auth_server_service_get_user**](AuthServerServiceApi.md#auth_server_service_get_user) | **GET** /api/v3/auth/user | Summary: Get user Description: Get user.
[**auth_server_service_list_oauth_client**](AuthServerServiceApi.md#auth_server_service_list_oauth_client) | **GET** /api/v3/oauth/clients | Summary: List Oauth client Description: List all registered Oauth client.


# **auth_server_service_create_oauth_client**
> AuthserverCreateOauthClientResponse auth_server_service_create_oauth_client(authserver_create_oauth_client_request)

Summary: Create Oauth client Description: Create/register new Oauth client.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.authserver_create_oauth_client_request import AuthserverCreateOauthClientRequest
from ibm_gdsc_sdk_software.models.authserver_create_oauth_client_response import AuthserverCreateOauthClientResponse
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
    api_instance = ibm_gdsc_sdk_software.AuthServerServiceApi(api_client)
    authserver_create_oauth_client_request = ibm_gdsc_sdk_software.AuthserverCreateOauthClientRequest() # AuthserverCreateOauthClientRequest | 

    try:
        # Summary: Create Oauth client Description: Create/register new Oauth client.
        api_response = api_instance.auth_server_service_create_oauth_client(authserver_create_oauth_client_request)
        print("The response of AuthServerServiceApi->auth_server_service_create_oauth_client:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthServerServiceApi->auth_server_service_create_oauth_client: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authserver_create_oauth_client_request** | [**AuthserverCreateOauthClientRequest**](AuthserverCreateOauthClientRequest.md)|  | 

### Return type

[**AuthserverCreateOauthClientResponse**](AuthserverCreateOauthClientResponse.md)

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

# **auth_server_service_delete_oauth_client**
> object auth_server_service_delete_oauth_client(client_id)

Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.

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
    api_instance = ibm_gdsc_sdk_software.AuthServerServiceApi(api_client)
    client_id = 'client_id_example' # str | ClientID of registered OAuth.

    try:
        # Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
        api_response = api_instance.auth_server_service_delete_oauth_client(client_id)
        print("The response of AuthServerServiceApi->auth_server_service_delete_oauth_client:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthServerServiceApi->auth_server_service_delete_oauth_client: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| ClientID of registered OAuth. | 

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

# **auth_server_service_get_access_token**
> AuthserverGetAccessTokenResponse auth_server_service_get_access_token()

Summary: Get access token Description: Get access token from passed clientId and secret.

### Example

* Basic Authentication (BasicAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.authserver_get_access_token_response import AuthserverGetAccessTokenResponse
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

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.AuthServerServiceApi(api_client)

    try:
        # Summary: Get access token Description: Get access token from passed clientId and secret.
        api_response = api_instance.auth_server_service_get_access_token()
        print("The response of AuthServerServiceApi->auth_server_service_get_access_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthServerServiceApi->auth_server_service_get_access_token: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthserverGetAccessTokenResponse**](AuthserverGetAccessTokenResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **auth_server_service_get_oauth_client**
> AuthserverGetOauthClientResponse auth_server_service_get_oauth_client(client_id)

Summary: Get Oauth client Description: Get registered Oauth client by clientId.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.authserver_get_oauth_client_response import AuthserverGetOauthClientResponse
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
    api_instance = ibm_gdsc_sdk_software.AuthServerServiceApi(api_client)
    client_id = 'client_id_example' # str | ClientID of registered OAuth.

    try:
        # Summary: Get Oauth client Description: Get registered Oauth client by clientId.
        api_response = api_instance.auth_server_service_get_oauth_client(client_id)
        print("The response of AuthServerServiceApi->auth_server_service_get_oauth_client:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthServerServiceApi->auth_server_service_get_oauth_client: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| ClientID of registered OAuth. | 

### Return type

[**AuthserverGetOauthClientResponse**](AuthserverGetOauthClientResponse.md)

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

# **auth_server_service_get_user**
> AuthserverGetUserResponse auth_server_service_get_user()

Summary: Get user Description: Get user.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.authserver_get_user_response import AuthserverGetUserResponse
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
    api_instance = ibm_gdsc_sdk_software.AuthServerServiceApi(api_client)

    try:
        # Summary: Get user Description: Get user.
        api_response = api_instance.auth_server_service_get_user()
        print("The response of AuthServerServiceApi->auth_server_service_get_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthServerServiceApi->auth_server_service_get_user: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthserverGetUserResponse**](AuthserverGetUserResponse.md)

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

# **auth_server_service_list_oauth_client**
> AuthserverListOauthClientResponse auth_server_service_list_oauth_client()

Summary: List Oauth client Description: List all registered Oauth client.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.authserver_list_oauth_client_response import AuthserverListOauthClientResponse
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
    api_instance = ibm_gdsc_sdk_software.AuthServerServiceApi(api_client)

    try:
        # Summary: List Oauth client Description: List all registered Oauth client.
        api_response = api_instance.auth_server_service_list_oauth_client()
        print("The response of AuthServerServiceApi->auth_server_service_list_oauth_client:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthServerServiceApi->auth_server_service_list_oauth_client: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthserverListOauthClientResponse**](AuthserverListOauthClientResponse.md)

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

