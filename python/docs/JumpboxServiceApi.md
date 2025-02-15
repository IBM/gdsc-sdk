# ibm_gdsc_sdk_software.JumpboxServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jumpbox_service_authorize**](JumpboxServiceApi.md#jumpbox_service_authorize) | **POST** /api/v3/authorization | Summary: Authorize Description: Authenticate a user and return a JWT.
[**jumpbox_service_delete_tenant**](JumpboxServiceApi.md#jumpbox_service_delete_tenant) | **DELETE** /api/v3/tenants/{tenant_id} | Summary: Delete tenant Description: Delete a tenant.
[**jumpbox_service_delete_user**](JumpboxServiceApi.md#jumpbox_service_delete_user) | **DELETE** /api/v3/users/{user_id} | Summary: Delete user Description: Delete the user.
[**jumpbox_service_get_tenant**](JumpboxServiceApi.md#jumpbox_service_get_tenant) | **GET** /api/v3/tenants/{tenant_id} | Summary: Get tenant Description: Get a tenant.
[**jumpbox_service_get_tenants**](JumpboxServiceApi.md#jumpbox_service_get_tenants) | **GET** /api/v3/tenants | Summary: Get tenants Description: Get all tenant base on UID.
[**jumpbox_service_get_users**](JumpboxServiceApi.md#jumpbox_service_get_users) | **GET** /api/v3/users | Summary: Get users Description: Get all users base on a tenantID.
[**jumpbox_service_post_tenants**](JumpboxServiceApi.md#jumpbox_service_post_tenants) | **POST** /api/v3/tenants | Summary: Post tenants Description: Create a tenant.
[**jumpbox_service_post_users**](JumpboxServiceApi.md#jumpbox_service_post_users) | **POST** /api/v3/users | Summary: Post users Description: Create users.
[**jumpbox_service_search_users**](JumpboxServiceApi.md#jumpbox_service_search_users) | **POST** /api/v3/users/search | Summary: Search users Description: Search for all users matching the provided string.
[**jumpbox_service_test_user**](JumpboxServiceApi.md#jumpbox_service_test_user) | **POST** /api/v3/users/test | Summary: Test user Description: Test a user lookup to a given LDAP.
[**jumpbox_service_update_tenant**](JumpboxServiceApi.md#jumpbox_service_update_tenant) | **PATCH** /api/v3/tenants/{tenant_id} | Summary: Update tenant Description: Update a tenant.
[**jumpbox_service_update_users**](JumpboxServiceApi.md#jumpbox_service_update_users) | **PATCH** /api/v3/users | Summary: Update users Description: Update an array of users.


# **jumpbox_service_authorize**
> Jumpboxv3AuthorizeResponse jumpbox_service_authorize(jumpboxv3_authorize_request)

Summary: Authorize Description: Authenticate a user and return a JWT.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.jumpboxv3_authorize_request import Jumpboxv3AuthorizeRequest
from ibm_gdsc_sdk_software.models.jumpboxv3_authorize_response import Jumpboxv3AuthorizeResponse
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
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    jumpboxv3_authorize_request = ibm_gdsc_sdk_software.Jumpboxv3AuthorizeRequest() # Jumpboxv3AuthorizeRequest | 

    try:
        # Summary: Authorize Description: Authenticate a user and return a JWT.
        api_response = api_instance.jumpbox_service_authorize(jumpboxv3_authorize_request)
        print("The response of JumpboxServiceApi->jumpbox_service_authorize:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_authorize: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3_authorize_request** | [**Jumpboxv3AuthorizeRequest**](Jumpboxv3AuthorizeRequest.md)|  | 

### Return type

[**Jumpboxv3AuthorizeResponse**](Jumpboxv3AuthorizeResponse.md)

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

# **jumpbox_service_delete_tenant**
> object jumpbox_service_delete_tenant(tenant_id, is_permanent_delete=is_permanent_delete, var_async=var_async)

Summary: Delete tenant Description: Delete a tenant.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | Tenant id.
    is_permanent_delete = True # bool | Delete tenant permanently if true. (optional)
    var_async = True # bool | Async. (optional)

    try:
        # Summary: Delete tenant Description: Delete a tenant.
        api_response = api_instance.jumpbox_service_delete_tenant(tenant_id, is_permanent_delete=is_permanent_delete, var_async=var_async)
        print("The response of JumpboxServiceApi->jumpbox_service_delete_tenant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_delete_tenant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| Tenant id. | 
 **is_permanent_delete** | **bool**| Delete tenant permanently if true. | [optional] 
 **var_async** | **bool**| Async. | [optional] 

### Return type

**object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jumpbox_service_delete_user**
> object jumpbox_service_delete_user(user_id)

Summary: Delete user Description: Delete the user.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
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
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    user_id = 'user_id_example' # str | The user id.

    try:
        # Summary: Delete user Description: Delete the user.
        api_response = api_instance.jumpbox_service_delete_user(user_id)
        print("The response of JumpboxServiceApi->jumpbox_service_delete_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_delete_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| The user id. | 

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

# **jumpbox_service_get_tenant**
> Jumpboxv3GetTenantResponse jumpbox_service_get_tenant(tenant_id, include_inactive=include_inactive, include_not_ready=include_not_ready)

Summary: Get tenant Description: Get a tenant.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.jumpboxv3_get_tenant_response import Jumpboxv3GetTenantResponse
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | Tenant id.
    include_inactive = True # bool | Include inactive. (optional)
    include_not_ready = True # bool | Include tenants that are not ready(are in state of being created or deleted). (optional)

    try:
        # Summary: Get tenant Description: Get a tenant.
        api_response = api_instance.jumpbox_service_get_tenant(tenant_id, include_inactive=include_inactive, include_not_ready=include_not_ready)
        print("The response of JumpboxServiceApi->jumpbox_service_get_tenant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_get_tenant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| Tenant id. | 
 **include_inactive** | **bool**| Include inactive. | [optional] 
 **include_not_ready** | **bool**| Include tenants that are not ready(are in state of being created or deleted). | [optional] 

### Return type

[**Jumpboxv3GetTenantResponse**](Jumpboxv3GetTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jumpbox_service_get_tenants**
> Jumpboxv3GetTenantsResponse jumpbox_service_get_tenants(uid=uid, external_id=external_id, include_inactive=include_inactive, include_not_ready=include_not_ready)

Summary: Get tenants Description: Get all tenant base on UID.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.jumpboxv3_get_tenants_response import Jumpboxv3GetTenantsResponse
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
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    uid = 'uid_example' # str | Email. (optional)
    external_id = 'external_id_example' # str | External id. (optional)
    include_inactive = True # bool | Include inactive. (optional)
    include_not_ready = True # bool | Include tenants that are not ready(are in state of being created or deleted). (optional)

    try:
        # Summary: Get tenants Description: Get all tenant base on UID.
        api_response = api_instance.jumpbox_service_get_tenants(uid=uid, external_id=external_id, include_inactive=include_inactive, include_not_ready=include_not_ready)
        print("The response of JumpboxServiceApi->jumpbox_service_get_tenants:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_get_tenants: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **str**| Email. | [optional] 
 **external_id** | **str**| External id. | [optional] 
 **include_inactive** | **bool**| Include inactive. | [optional] 
 **include_not_ready** | **bool**| Include tenants that are not ready(are in state of being created or deleted). | [optional] 

### Return type

[**Jumpboxv3GetTenantsResponse**](Jumpboxv3GetTenantsResponse.md)

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

# **jumpbox_service_get_users**
> Tenantuserv3GetUsersResponse jumpbox_service_get_users(uid=uid)

Summary: Get users Description: Get all users base on a tenantID.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_get_users_response import Tenantuserv3GetUsersResponse
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
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    uid = 'uid_example' # str | Email. (optional)

    try:
        # Summary: Get users Description: Get all users base on a tenantID.
        api_response = api_instance.jumpbox_service_get_users(uid=uid)
        print("The response of JumpboxServiceApi->jumpbox_service_get_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_get_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **str**| Email. | [optional] 

### Return type

[**Tenantuserv3GetUsersResponse**](Tenantuserv3GetUsersResponse.md)

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

# **jumpbox_service_post_tenants**
> Jumpboxv3PostTenantsResponse jumpbox_service_post_tenants(jumpboxv3_post_tenants_request)

Summary: Post tenants Description: Create a tenant.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.jumpboxv3_post_tenants_request import Jumpboxv3PostTenantsRequest
from ibm_gdsc_sdk_software.models.jumpboxv3_post_tenants_response import Jumpboxv3PostTenantsResponse
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
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    jumpboxv3_post_tenants_request = ibm_gdsc_sdk_software.Jumpboxv3PostTenantsRequest() # Jumpboxv3PostTenantsRequest | 

    try:
        # Summary: Post tenants Description: Create a tenant.
        api_response = api_instance.jumpbox_service_post_tenants(jumpboxv3_post_tenants_request)
        print("The response of JumpboxServiceApi->jumpbox_service_post_tenants:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_post_tenants: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3_post_tenants_request** | [**Jumpboxv3PostTenantsRequest**](Jumpboxv3PostTenantsRequest.md)|  | 

### Return type

[**Jumpboxv3PostTenantsResponse**](Jumpboxv3PostTenantsResponse.md)

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

# **jumpbox_service_post_users**
> Jumpboxv3PostUsersBulkResponse jumpbox_service_post_users(jumpboxv3_post_users_bulk_request)

Summary: Post users Description: Create users.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.jumpboxv3_post_users_bulk_request import Jumpboxv3PostUsersBulkRequest
from ibm_gdsc_sdk_software.models.jumpboxv3_post_users_bulk_response import Jumpboxv3PostUsersBulkResponse
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
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    jumpboxv3_post_users_bulk_request = ibm_gdsc_sdk_software.Jumpboxv3PostUsersBulkRequest() # Jumpboxv3PostUsersBulkRequest | 

    try:
        # Summary: Post users Description: Create users.
        api_response = api_instance.jumpbox_service_post_users(jumpboxv3_post_users_bulk_request)
        print("The response of JumpboxServiceApi->jumpbox_service_post_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_post_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3_post_users_bulk_request** | [**Jumpboxv3PostUsersBulkRequest**](Jumpboxv3PostUsersBulkRequest.md)|  | 

### Return type

[**Jumpboxv3PostUsersBulkResponse**](Jumpboxv3PostUsersBulkResponse.md)

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

# **jumpbox_service_search_users**
> Jumpboxv3SearchUsersResponse jumpbox_service_search_users(jumpboxv3_search_users_request)

Summary: Search users Description: Search for all users matching the provided string.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.jumpboxv3_search_users_request import Jumpboxv3SearchUsersRequest
from ibm_gdsc_sdk_software.models.jumpboxv3_search_users_response import Jumpboxv3SearchUsersResponse
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
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    jumpboxv3_search_users_request = ibm_gdsc_sdk_software.Jumpboxv3SearchUsersRequest() # Jumpboxv3SearchUsersRequest | 

    try:
        # Summary: Search users Description: Search for all users matching the provided string.
        api_response = api_instance.jumpbox_service_search_users(jumpboxv3_search_users_request)
        print("The response of JumpboxServiceApi->jumpbox_service_search_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_search_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3_search_users_request** | [**Jumpboxv3SearchUsersRequest**](Jumpboxv3SearchUsersRequest.md)|  | 

### Return type

[**Jumpboxv3SearchUsersResponse**](Jumpboxv3SearchUsersResponse.md)

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

# **jumpbox_service_test_user**
> Jumpboxv3TestUserResponse jumpbox_service_test_user(jumpboxv3_test_user_request)

Summary: Test user Description: Test a user lookup to a given LDAP.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.jumpboxv3_test_user_request import Jumpboxv3TestUserRequest
from ibm_gdsc_sdk_software.models.jumpboxv3_test_user_response import Jumpboxv3TestUserResponse
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
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    jumpboxv3_test_user_request = ibm_gdsc_sdk_software.Jumpboxv3TestUserRequest() # Jumpboxv3TestUserRequest | 

    try:
        # Summary: Test user Description: Test a user lookup to a given LDAP.
        api_response = api_instance.jumpbox_service_test_user(jumpboxv3_test_user_request)
        print("The response of JumpboxServiceApi->jumpbox_service_test_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_test_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3_test_user_request** | [**Jumpboxv3TestUserRequest**](Jumpboxv3TestUserRequest.md)|  | 

### Return type

[**Jumpboxv3TestUserResponse**](Jumpboxv3TestUserResponse.md)

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

# **jumpbox_service_update_tenant**
> Jumpboxv3UpdateTenantResponse jumpbox_service_update_tenant(tenant_id, jumpboxv3_update_tenant_request)

Summary: Update tenant Description: Update a tenant.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.jumpboxv3_update_tenant_request import Jumpboxv3UpdateTenantRequest
from ibm_gdsc_sdk_software.models.jumpboxv3_update_tenant_response import Jumpboxv3UpdateTenantResponse
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | Tenant id.
    jumpboxv3_update_tenant_request = ibm_gdsc_sdk_software.Jumpboxv3UpdateTenantRequest() # Jumpboxv3UpdateTenantRequest | 

    try:
        # Summary: Update tenant Description: Update a tenant.
        api_response = api_instance.jumpbox_service_update_tenant(tenant_id, jumpboxv3_update_tenant_request)
        print("The response of JumpboxServiceApi->jumpbox_service_update_tenant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_update_tenant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| Tenant id. | 
 **jumpboxv3_update_tenant_request** | [**Jumpboxv3UpdateTenantRequest**](Jumpboxv3UpdateTenantRequest.md)|  | 

### Return type

[**Jumpboxv3UpdateTenantResponse**](Jumpboxv3UpdateTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jumpbox_service_update_users**
> Jumpboxv3UpdateUsersBulkResponse jumpbox_service_update_users(jumpboxv3_update_users_bulk_request)

Summary: Update users Description: Update an array of users.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.jumpboxv3_update_users_bulk_request import Jumpboxv3UpdateUsersBulkRequest
from ibm_gdsc_sdk_software.models.jumpboxv3_update_users_bulk_response import Jumpboxv3UpdateUsersBulkResponse
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
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    jumpboxv3_update_users_bulk_request = ibm_gdsc_sdk_software.Jumpboxv3UpdateUsersBulkRequest() # Jumpboxv3UpdateUsersBulkRequest | 

    try:
        # Summary: Update users Description: Update an array of users.
        api_response = api_instance.jumpbox_service_update_users(jumpboxv3_update_users_bulk_request)
        print("The response of JumpboxServiceApi->jumpbox_service_update_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_update_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3_update_users_bulk_request** | [**Jumpboxv3UpdateUsersBulkRequest**](Jumpboxv3UpdateUsersBulkRequest.md)|  | 

### Return type

[**Jumpboxv3UpdateUsersBulkResponse**](Jumpboxv3UpdateUsersBulkResponse.md)

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

