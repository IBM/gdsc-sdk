# ibm_gdsc_sdk_software.TenantuserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tenantuser_create_api_key**](TenantuserApi.md#tenantuser_create_api_key) | **POST** /api/v3/apikeys | Summary: Create API key Description: Create API Key.
[**tenantuser_delete_api_key**](TenantuserApi.md#tenantuser_delete_api_key) | **DELETE** /api/v3/apikeys/{id} | Summary: Delete API key Description: Delete APIKey Document based on the document id.
[**tenantuser_delete_role**](TenantuserApi.md#tenantuser_delete_role) | **DELETE** /api/v3/roles/{role_id} | Summary: Delete role Description: Delete a role.
[**tenantuser_get_api_keys**](TenantuserApi.md#tenantuser_get_api_keys) | **GET** /api/v3/apikeys | Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
[**tenantuser_get_current_user**](TenantuserApi.md#tenantuser_get_current_user) | **GET** /api/v3/currentuser | Summary: Get current user Description: Return the currently authenticated user.
[**tenantuser_get_privilege**](TenantuserApi.md#tenantuser_get_privilege) | **GET** /api/v3/privileges/{privilege.privilege_id} | Summary: Get privilege Description: Return privilege.
[**tenantuser_get_privileges**](TenantuserApi.md#tenantuser_get_privileges) | **GET** /api/v3/privileges | Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
[**tenantuser_get_role**](TenantuserApi.md#tenantuser_get_role) | **GET** /api/v3/roles/{role_id} | Summary: Get role Description: Return single role.
[**tenantuser_get_roles**](TenantuserApi.md#tenantuser_get_roles) | **GET** /api/v3/roles | Summary: Get roles Description: Return all roles without privileges.
[**tenantuser_get_user**](TenantuserApi.md#tenantuser_get_user) | **GET** /api/v3/users/user/{user_id} | Summary: Get user Description: Return full user for specified user_id.
[**tenantuser_get_user_names**](TenantuserApi.md#tenantuser_get_user_names) | **POST** /api/v3/users/names | Summary: Get user names Description: Get user names.
[**tenantuser_get_user_tenant**](TenantuserApi.md#tenantuser_get_user_tenant) | **GET** /api/v3/users/tenant/{user_id} | Summary: Get user tenant Description: Return the user plus tenant information.
[**tenantuser_post_privileges_bulk**](TenantuserApi.md#tenantuser_post_privileges_bulk) | **POST** /api/v3/privileges | Summary: Post privileges bulk Description: Perform bulk user add preivilege.
[**tenantuser_post_role**](TenantuserApi.md#tenantuser_post_role) | **POST** /api/v3/roles | Summary: Post role Description: Create a new role.
[**tenantuser_update_privilege**](TenantuserApi.md#tenantuser_update_privilege) | **PATCH** /api/v3/privileges/{privilege_id} | Summary: Update privilege Description: Update privilege.
[**tenantuser_update_privileges_role_bulk**](TenantuserApi.md#tenantuser_update_privileges_role_bulk) | **PATCH** /api/v3/privileges | Summary: Update privileges role bulk Description: Perform bulk user update role.
[**tenantuser_update_role**](TenantuserApi.md#tenantuser_update_role) | **PATCH** /api/v3/roles/{role_id} | Summary: Update role Description: Update single role.
[**tenantuser_update_user_role_bulk**](TenantuserApi.md#tenantuser_update_user_role_bulk) | **PATCH** /api/v3/users/role | Summary: Update user role bulk Description: Perform bulk user add or remove role.


# **tenantuser_create_api_key**
> Tenantuserv3CreateApiKeyResponse tenantuser_create_api_key(tenantuserv3_create_api_key_request)

Summary: Create API key Description: Create API Key.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_create_api_key_request import Tenantuserv3CreateApiKeyRequest
from ibm_gdsc_sdk_software.models.tenantuserv3_create_api_key_response import Tenantuserv3CreateApiKeyResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    tenantuserv3_create_api_key_request = ibm_gdsc_sdk_software.Tenantuserv3CreateApiKeyRequest() # Tenantuserv3CreateApiKeyRequest | 

    try:
        # Summary: Create API key Description: Create API Key.
        api_response = api_instance.tenantuser_create_api_key(tenantuserv3_create_api_key_request)
        print("The response of TenantuserApi->tenantuser_create_api_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_create_api_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3_create_api_key_request** | [**Tenantuserv3CreateApiKeyRequest**](Tenantuserv3CreateApiKeyRequest.md)|  | 

### Return type

[**Tenantuserv3CreateApiKeyResponse**](Tenantuserv3CreateApiKeyResponse.md)

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

# **tenantuser_delete_api_key**
> object tenantuser_delete_api_key(id)

Summary: Delete API key Description: Delete APIKey Document based on the document id.

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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    id = 'id_example' # str | Apikey id.

    try:
        # Summary: Delete API key Description: Delete APIKey Document based on the document id.
        api_response = api_instance.tenantuser_delete_api_key(id)
        print("The response of TenantuserApi->tenantuser_delete_api_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_delete_api_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Apikey id. | 

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

# **tenantuser_delete_role**
> object tenantuser_delete_role(role_id)

Summary: Delete role Description: Delete a role.

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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    role_id = 'role_id_example' # str | ID or role deleted.

    try:
        # Summary: Delete role Description: Delete a role.
        api_response = api_instance.tenantuser_delete_role(role_id)
        print("The response of TenantuserApi->tenantuser_delete_role:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_delete_role: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role_id** | **str**| ID or role deleted. | 

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

# **tenantuser_get_api_keys**
> Tenantuserv3GetApiKeysResponse tenantuser_get_api_keys()

Summary: Get API keys Description: Get all APIKeys base on a tenant ID.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_get_api_keys_response import Tenantuserv3GetApiKeysResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)

    try:
        # Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
        api_response = api_instance.tenantuser_get_api_keys()
        print("The response of TenantuserApi->tenantuser_get_api_keys:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_get_api_keys: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetApiKeysResponse**](Tenantuserv3GetApiKeysResponse.md)

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

# **tenantuser_get_current_user**
> Tenantuserv3GetCurrentUserResponse tenantuser_get_current_user()

Summary: Get current user Description: Return the currently authenticated user.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_get_current_user_response import Tenantuserv3GetCurrentUserResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)

    try:
        # Summary: Get current user Description: Return the currently authenticated user.
        api_response = api_instance.tenantuser_get_current_user()
        print("The response of TenantuserApi->tenantuser_get_current_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_get_current_user: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetCurrentUserResponse**](Tenantuserv3GetCurrentUserResponse.md)

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

# **tenantuser_get_privilege**
> Tenantuserv3GetPrivilegeResponse tenantuser_get_privilege(privilege_privilege_id, privilege_type=privilege_type)

Summary: Get privilege Description: Return privilege.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_get_privilege_response import Tenantuserv3GetPrivilegeResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    privilege_privilege_id = 'privilege_privilege_id_example' # str | Privilege ID.
    privilege_type = 'privilege_type_example' # str | Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. (optional)

    try:
        # Summary: Get privilege Description: Return privilege.
        api_response = api_instance.tenantuser_get_privilege(privilege_privilege_id, privilege_type=privilege_type)
        print("The response of TenantuserApi->tenantuser_get_privilege:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_get_privilege: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilege_privilege_id** | **str**| Privilege ID. | 
 **privilege_type** | **str**| Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. | [optional] 

### Return type

[**Tenantuserv3GetPrivilegeResponse**](Tenantuserv3GetPrivilegeResponse.md)

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

# **tenantuser_get_privileges**
> Tenantuserv3GetPrivilegesResponse tenantuser_get_privileges(roles=roles, type=type)

Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_get_privileges_response import Tenantuserv3GetPrivilegesResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    roles = ['roles_example'] # List[str] | If empty, will return all privileges. (optional)
    type = 'type_example' # str | Type of privilege to return: group, page, permission, report, restapi, etc. (optional)

    try:
        # Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
        api_response = api_instance.tenantuser_get_privileges(roles=roles, type=type)
        print("The response of TenantuserApi->tenantuser_get_privileges:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_get_privileges: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roles** | [**List[str]**](str.md)| If empty, will return all privileges. | [optional] 
 **type** | **str**| Type of privilege to return: group, page, permission, report, restapi, etc. | [optional] 

### Return type

[**Tenantuserv3GetPrivilegesResponse**](Tenantuserv3GetPrivilegesResponse.md)

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

# **tenantuser_get_role**
> Tenantuserv3Role tenantuser_get_role(role_id)

Summary: Get role Description: Return single role.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_role import Tenantuserv3Role
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    role_id = 'role_id_example' # str | ID of role to be returned.

    try:
        # Summary: Get role Description: Return single role.
        api_response = api_instance.tenantuser_get_role(role_id)
        print("The response of TenantuserApi->tenantuser_get_role:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_get_role: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role_id** | **str**| ID of role to be returned. | 

### Return type

[**Tenantuserv3Role**](Tenantuserv3Role.md)

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

# **tenantuser_get_roles**
> Tenantuserv3GetRolesResponse tenantuser_get_roles()

Summary: Get roles Description: Return all roles without privileges.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_get_roles_response import Tenantuserv3GetRolesResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)

    try:
        # Summary: Get roles Description: Return all roles without privileges.
        api_response = api_instance.tenantuser_get_roles()
        print("The response of TenantuserApi->tenantuser_get_roles:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_get_roles: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Tenantuserv3GetRolesResponse**](Tenantuserv3GetRolesResponse.md)

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

# **tenantuser_get_user**
> Tenantuserv3GetUserResponse tenantuser_get_user(user_id)

Summary: Get user Description: Return full user for specified user_id.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_get_user_response import Tenantuserv3GetUserResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    user_id = 'user_id_example' # str | User id defaults to the current user or specify \"current\" or an actual user id.

    try:
        # Summary: Get user Description: Return full user for specified user_id.
        api_response = api_instance.tenantuser_get_user(user_id)
        print("The response of TenantuserApi->tenantuser_get_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_get_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | 

### Return type

[**Tenantuserv3GetUserResponse**](Tenantuserv3GetUserResponse.md)

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

# **tenantuser_get_user_names**
> Tenantuserv3GetUserNamesResponse tenantuser_get_user_names(tenantuserv3_get_user_names_request)

Summary: Get user names Description: Get user names.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_get_user_names_request import Tenantuserv3GetUserNamesRequest
from ibm_gdsc_sdk_software.models.tenantuserv3_get_user_names_response import Tenantuserv3GetUserNamesResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    tenantuserv3_get_user_names_request = ibm_gdsc_sdk_software.Tenantuserv3GetUserNamesRequest() # Tenantuserv3GetUserNamesRequest | 

    try:
        # Summary: Get user names Description: Get user names.
        api_response = api_instance.tenantuser_get_user_names(tenantuserv3_get_user_names_request)
        print("The response of TenantuserApi->tenantuser_get_user_names:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_get_user_names: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3_get_user_names_request** | [**Tenantuserv3GetUserNamesRequest**](Tenantuserv3GetUserNamesRequest.md)|  | 

### Return type

[**Tenantuserv3GetUserNamesResponse**](Tenantuserv3GetUserNamesResponse.md)

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

# **tenantuser_get_user_tenant**
> Tenantuserv3GetUserTenantResponse tenantuser_get_user_tenant(user_id)

Summary: Get user tenant Description: Return the user plus tenant information.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_get_user_tenant_response import Tenantuserv3GetUserTenantResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    user_id = 'user_id_example' # str | User id defaults to the current user or specify \"current\" or an actual user id.

    try:
        # Summary: Get user tenant Description: Return the user plus tenant information.
        api_response = api_instance.tenantuser_get_user_tenant(user_id)
        print("The response of TenantuserApi->tenantuser_get_user_tenant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_get_user_tenant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | 

### Return type

[**Tenantuserv3GetUserTenantResponse**](Tenantuserv3GetUserTenantResponse.md)

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

# **tenantuser_post_privileges_bulk**
> Tenantuserv3PostPrivilegesBulkResponse tenantuser_post_privileges_bulk(tenantuserv3_post_privileges_bulk_request)

Summary: Post privileges bulk Description: Perform bulk user add preivilege.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_post_privileges_bulk_request import Tenantuserv3PostPrivilegesBulkRequest
from ibm_gdsc_sdk_software.models.tenantuserv3_post_privileges_bulk_response import Tenantuserv3PostPrivilegesBulkResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    tenantuserv3_post_privileges_bulk_request = ibm_gdsc_sdk_software.Tenantuserv3PostPrivilegesBulkRequest() # Tenantuserv3PostPrivilegesBulkRequest | 

    try:
        # Summary: Post privileges bulk Description: Perform bulk user add preivilege.
        api_response = api_instance.tenantuser_post_privileges_bulk(tenantuserv3_post_privileges_bulk_request)
        print("The response of TenantuserApi->tenantuser_post_privileges_bulk:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_post_privileges_bulk: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3_post_privileges_bulk_request** | [**Tenantuserv3PostPrivilegesBulkRequest**](Tenantuserv3PostPrivilegesBulkRequest.md)|  | 

### Return type

[**Tenantuserv3PostPrivilegesBulkResponse**](Tenantuserv3PostPrivilegesBulkResponse.md)

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

# **tenantuser_post_role**
> Tenantuserv3PostRoleResponse tenantuser_post_role(tenantuserv3_post_role_request)

Summary: Post role Description: Create a new role.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_post_role_request import Tenantuserv3PostRoleRequest
from ibm_gdsc_sdk_software.models.tenantuserv3_post_role_response import Tenantuserv3PostRoleResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    tenantuserv3_post_role_request = ibm_gdsc_sdk_software.Tenantuserv3PostRoleRequest() # Tenantuserv3PostRoleRequest | 

    try:
        # Summary: Post role Description: Create a new role.
        api_response = api_instance.tenantuser_post_role(tenantuserv3_post_role_request)
        print("The response of TenantuserApi->tenantuser_post_role:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_post_role: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3_post_role_request** | [**Tenantuserv3PostRoleRequest**](Tenantuserv3PostRoleRequest.md)|  | 

### Return type

[**Tenantuserv3PostRoleResponse**](Tenantuserv3PostRoleResponse.md)

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

# **tenantuser_update_privilege**
> Tenantuserv3UpdatePrivilegeResponse tenantuser_update_privilege(privilege_id, tenantuserv3_update_privilege_request)

Summary: Update privilege Description: Update privilege.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_update_privilege_request import Tenantuserv3UpdatePrivilegeRequest
from ibm_gdsc_sdk_software.models.tenantuserv3_update_privilege_response import Tenantuserv3UpdatePrivilegeResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    privilege_id = 'privilege_id_example' # str | Permanent id of the privilege to be updated or created.
    tenantuserv3_update_privilege_request = ibm_gdsc_sdk_software.Tenantuserv3UpdatePrivilegeRequest() # Tenantuserv3UpdatePrivilegeRequest | 

    try:
        # Summary: Update privilege Description: Update privilege.
        api_response = api_instance.tenantuser_update_privilege(privilege_id, tenantuserv3_update_privilege_request)
        print("The response of TenantuserApi->tenantuser_update_privilege:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_update_privilege: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilege_id** | **str**| Permanent id of the privilege to be updated or created. | 
 **tenantuserv3_update_privilege_request** | [**Tenantuserv3UpdatePrivilegeRequest**](Tenantuserv3UpdatePrivilegeRequest.md)|  | 

### Return type

[**Tenantuserv3UpdatePrivilegeResponse**](Tenantuserv3UpdatePrivilegeResponse.md)

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

# **tenantuser_update_privileges_role_bulk**
> Tenantuserv3UpdatePrivilegesBulkResponse tenantuser_update_privileges_role_bulk(tenantuserv3_update_privileges_bulk_request)

Summary: Update privileges role bulk Description: Perform bulk user update role.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_update_privileges_bulk_request import Tenantuserv3UpdatePrivilegesBulkRequest
from ibm_gdsc_sdk_software.models.tenantuserv3_update_privileges_bulk_response import Tenantuserv3UpdatePrivilegesBulkResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    tenantuserv3_update_privileges_bulk_request = ibm_gdsc_sdk_software.Tenantuserv3UpdatePrivilegesBulkRequest() # Tenantuserv3UpdatePrivilegesBulkRequest | 

    try:
        # Summary: Update privileges role bulk Description: Perform bulk user update role.
        api_response = api_instance.tenantuser_update_privileges_role_bulk(tenantuserv3_update_privileges_bulk_request)
        print("The response of TenantuserApi->tenantuser_update_privileges_role_bulk:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_update_privileges_role_bulk: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3_update_privileges_bulk_request** | [**Tenantuserv3UpdatePrivilegesBulkRequest**](Tenantuserv3UpdatePrivilegesBulkRequest.md)|  | 

### Return type

[**Tenantuserv3UpdatePrivilegesBulkResponse**](Tenantuserv3UpdatePrivilegesBulkResponse.md)

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

# **tenantuser_update_role**
> Tenantuserv3UpdateRoleResponse tenantuser_update_role(role_id, tenantuserv3_update_role_request)

Summary: Update role Description: Update single role.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_update_role_request import Tenantuserv3UpdateRoleRequest
from ibm_gdsc_sdk_software.models.tenantuserv3_update_role_response import Tenantuserv3UpdateRoleResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    role_id = 'role_id_example' # str | Permanent id of the role.
    tenantuserv3_update_role_request = ibm_gdsc_sdk_software.Tenantuserv3UpdateRoleRequest() # Tenantuserv3UpdateRoleRequest | 

    try:
        # Summary: Update role Description: Update single role.
        api_response = api_instance.tenantuser_update_role(role_id, tenantuserv3_update_role_request)
        print("The response of TenantuserApi->tenantuser_update_role:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_update_role: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role_id** | **str**| Permanent id of the role. | 
 **tenantuserv3_update_role_request** | [**Tenantuserv3UpdateRoleRequest**](Tenantuserv3UpdateRoleRequest.md)|  | 

### Return type

[**Tenantuserv3UpdateRoleResponse**](Tenantuserv3UpdateRoleResponse.md)

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

# **tenantuser_update_user_role_bulk**
> Tenantuserv3UpdateUserRoleBulkResponse tenantuser_update_user_role_bulk(tenantuserv3_update_user_role_bulk_request)

Summary: Update user role bulk Description: Perform bulk user add or remove role.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.tenantuserv3_update_user_role_bulk_request import Tenantuserv3UpdateUserRoleBulkRequest
from ibm_gdsc_sdk_software.models.tenantuserv3_update_user_role_bulk_response import Tenantuserv3UpdateUserRoleBulkResponse
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
    api_instance = ibm_gdsc_sdk_software.TenantuserApi(api_client)
    tenantuserv3_update_user_role_bulk_request = ibm_gdsc_sdk_software.Tenantuserv3UpdateUserRoleBulkRequest() # Tenantuserv3UpdateUserRoleBulkRequest | 

    try:
        # Summary: Update user role bulk Description: Perform bulk user add or remove role.
        api_response = api_instance.tenantuser_update_user_role_bulk(tenantuserv3_update_user_role_bulk_request)
        print("The response of TenantuserApi->tenantuser_update_user_role_bulk:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TenantuserApi->tenantuser_update_user_role_bulk: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3_update_user_role_bulk_request** | [**Tenantuserv3UpdateUserRoleBulkRequest**](Tenantuserv3UpdateUserRoleBulkRequest.md)|  | 

### Return type

[**Tenantuserv3UpdateUserRoleBulkResponse**](Tenantuserv3UpdateUserRoleBulkResponse.md)

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

