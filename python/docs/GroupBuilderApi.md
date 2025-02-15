# ibm_gdsc_sdk_software.GroupBuilderApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**group_builder_cancel_import_group**](GroupBuilderApi.md#group_builder_cancel_import_group) | **DELETE** /api/v3/groups_import | Summary: Cancel import group Description: Cancel import refresh for selected groups.
[**group_builder_create_group**](GroupBuilderApi.md#group_builder_create_group) | **POST** /api/v3/groups | Summary: Create group Description: Create new groups.
[**group_builder_delete_group**](GroupBuilderApi.md#group_builder_delete_group) | **DELETE** /api/v3/groups | Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
[**group_builder_edit_group**](GroupBuilderApi.md#group_builder_edit_group) | **PATCH** /api/v3/groups/{group_id} | Summary: Edit group Description: Add or delete group members.
[**group_builder_export_group**](GroupBuilderApi.md#group_builder_export_group) | **POST** /api/v3/groups_export | Summary: Export group Description: Export group content to a file based on a group ID.
[**group_builder_get_group_details**](GroupBuilderApi.md#group_builder_get_group_details) | **GET** /api/v3/groups/{group_id} | Summary: Get group details Description: Get details of group specified by group ID.
[**group_builder_get_group_members**](GroupBuilderApi.md#group_builder_get_group_members) | **POST** /api/v3/groups/search | Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
[**group_builder_get_group_sync_mapping**](GroupBuilderApi.md#group_builder_get_group_sync_mapping) | **GET** /api/v3/groups/mappings/sync | Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.
[**group_builder_get_group_type_mapping**](GroupBuilderApi.md#group_builder_get_group_type_mapping) | **GET** /api/v3/groups-mappings | Summary: Get group type mapping Description: Get insights to gdp group types mapping.
[**group_builder_get_group_types**](GroupBuilderApi.md#group_builder_get_group_types) | **GET** /api/v3/group_types | Summary: Get group types Description: Get a list of available group types.
[**group_builder_get_groups**](GroupBuilderApi.md#group_builder_get_groups) | **GET** /api/v3/groups | Summary: Get groups Description: Get a list of imported group members.
[**group_builder_get_import_groups**](GroupBuilderApi.md#group_builder_get_import_groups) | **GET** /api/v3/groups_import | Summary: Get import groups Description: Get unsynchronized groups from a central manager.
[**group_builder_import_group**](GroupBuilderApi.md#group_builder_import_group) | **POST** /api/v3/groups_import | Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
[**group_builder_refresh_groups**](GroupBuilderApi.md#group_builder_refresh_groups) | **POST** /api/v3/groups/refresh | Summary: Refresh groups Description: Refresh tenants selected imported groups.
[**group_builder_reset_groups**](GroupBuilderApi.md#group_builder_reset_groups) | **POST** /api/v3/groups/reset | Summary: Reset groups Description: Resets tenants selected predefined groups.
[**group_builder_store_group_members_gdp**](GroupBuilderApi.md#group_builder_store_group_members_gdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups/members | Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
[**group_builder_store_groups_gdp**](GroupBuilderApi.md#group_builder_store_groups_gdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups | Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)


# **group_builder_cancel_import_group**
> Groupbuilderv3CancelGroupImportResponse group_builder_cancel_import_group(group_ids=group_ids)

Summary: Cancel import group Description: Cancel import refresh for selected groups.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_cancel_group_import_response import Groupbuilderv3CancelGroupImportResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    group_ids = [56] # List[int] | Group IDs to delete. (optional)

    try:
        # Summary: Cancel import group Description: Cancel import refresh for selected groups.
        api_response = api_instance.group_builder_cancel_import_group(group_ids=group_ids)
        print("The response of GroupBuilderApi->group_builder_cancel_import_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_cancel_import_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_ids** | [**List[int]**](int.md)| Group IDs to delete. | [optional] 

### Return type

[**Groupbuilderv3CancelGroupImportResponse**](Groupbuilderv3CancelGroupImportResponse.md)

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

# **group_builder_create_group**
> Groupbuilderv3CreateGroupResponse group_builder_create_group(groupbuilderv3_create_group_request)

Summary: Create group Description: Create new groups.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_create_group_request import Groupbuilderv3CreateGroupRequest
from ibm_gdsc_sdk_software.models.groupbuilderv3_create_group_response import Groupbuilderv3CreateGroupResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    groupbuilderv3_create_group_request = ibm_gdsc_sdk_software.Groupbuilderv3CreateGroupRequest() # Groupbuilderv3CreateGroupRequest | 

    try:
        # Summary: Create group Description: Create new groups.
        api_response = api_instance.group_builder_create_group(groupbuilderv3_create_group_request)
        print("The response of GroupBuilderApi->group_builder_create_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_create_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3_create_group_request** | [**Groupbuilderv3CreateGroupRequest**](Groupbuilderv3CreateGroupRequest.md)|  | 

### Return type

[**Groupbuilderv3CreateGroupResponse**](Groupbuilderv3CreateGroupResponse.md)

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

# **group_builder_delete_group**
> Groupbuilderv3DeleteGroupResponse group_builder_delete_group(group_ids=group_ids)

Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_delete_group_response import Groupbuilderv3DeleteGroupResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    group_ids = [56] # List[int] | Group IDs to delete. (optional)

    try:
        # Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
        api_response = api_instance.group_builder_delete_group(group_ids=group_ids)
        print("The response of GroupBuilderApi->group_builder_delete_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_delete_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_ids** | [**List[int]**](int.md)| Group IDs to delete. | [optional] 

### Return type

[**Groupbuilderv3DeleteGroupResponse**](Groupbuilderv3DeleteGroupResponse.md)

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

# **group_builder_edit_group**
> Groupbuilderv3EditGroupResponse group_builder_edit_group(group_id, groupbuilderv3_edit_group_request)

Summary: Edit group Description: Add or delete group members.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_edit_group_request import Groupbuilderv3EditGroupRequest
from ibm_gdsc_sdk_software.models.groupbuilderv3_edit_group_response import Groupbuilderv3EditGroupResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    group_id = 56 # int | Group ID.
    groupbuilderv3_edit_group_request = ibm_gdsc_sdk_software.Groupbuilderv3EditGroupRequest() # Groupbuilderv3EditGroupRequest | 

    try:
        # Summary: Edit group Description: Add or delete group members.
        api_response = api_instance.group_builder_edit_group(group_id, groupbuilderv3_edit_group_request)
        print("The response of GroupBuilderApi->group_builder_edit_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_edit_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **int**| Group ID. | 
 **groupbuilderv3_edit_group_request** | [**Groupbuilderv3EditGroupRequest**](Groupbuilderv3EditGroupRequest.md)|  | 

### Return type

[**Groupbuilderv3EditGroupResponse**](Groupbuilderv3EditGroupResponse.md)

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

# **group_builder_export_group**
> Groupbuilderv3GetExportGroupResponse group_builder_export_group(groupbuilderv3_get_export_group_request)

Summary: Export group Description: Export group content to a file based on a group ID.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_export_group_request import Groupbuilderv3GetExportGroupRequest
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_export_group_response import Groupbuilderv3GetExportGroupResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    groupbuilderv3_get_export_group_request = ibm_gdsc_sdk_software.Groupbuilderv3GetExportGroupRequest() # Groupbuilderv3GetExportGroupRequest | 

    try:
        # Summary: Export group Description: Export group content to a file based on a group ID.
        api_response = api_instance.group_builder_export_group(groupbuilderv3_get_export_group_request)
        print("The response of GroupBuilderApi->group_builder_export_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_export_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3_get_export_group_request** | [**Groupbuilderv3GetExportGroupRequest**](Groupbuilderv3GetExportGroupRequest.md)|  | 

### Return type

[**Groupbuilderv3GetExportGroupResponse**](Groupbuilderv3GetExportGroupResponse.md)

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

# **group_builder_get_group_details**
> Groupbuilderv3GetGroupDetailResponse group_builder_get_group_details(group_id, filter=filter, order=order)

Summary: Get group details Description: Get details of group specified by group ID.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_group_detail_response import Groupbuilderv3GetGroupDetailResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    group_id = 56 # int | Group ID.
    filter = 'filter_example' # str | Filter by group member name. (optional)
    order = 'order_example' # str | Order by ascending (ASC) or descending (DESC). (optional)

    try:
        # Summary: Get group details Description: Get details of group specified by group ID.
        api_response = api_instance.group_builder_get_group_details(group_id, filter=filter, order=order)
        print("The response of GroupBuilderApi->group_builder_get_group_details:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_get_group_details: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **int**| Group ID. | 
 **filter** | **str**| Filter by group member name. | [optional] 
 **order** | **str**| Order by ascending (ASC) or descending (DESC). | [optional] 

### Return type

[**Groupbuilderv3GetGroupDetailResponse**](Groupbuilderv3GetGroupDetailResponse.md)

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

# **group_builder_get_group_members**
> Groupbuilderv3GetGroupMembersResponse group_builder_get_group_members(groupbuilderv3_get_group_members_request)

Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_group_members_request import Groupbuilderv3GetGroupMembersRequest
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_group_members_response import Groupbuilderv3GetGroupMembersResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    groupbuilderv3_get_group_members_request = ibm_gdsc_sdk_software.Groupbuilderv3GetGroupMembersRequest() # Groupbuilderv3GetGroupMembersRequest | 

    try:
        # Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
        api_response = api_instance.group_builder_get_group_members(groupbuilderv3_get_group_members_request)
        print("The response of GroupBuilderApi->group_builder_get_group_members:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_get_group_members: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3_get_group_members_request** | [**Groupbuilderv3GetGroupMembersRequest**](Groupbuilderv3GetGroupMembersRequest.md)|  | 

### Return type

[**Groupbuilderv3GetGroupMembersResponse**](Groupbuilderv3GetGroupMembersResponse.md)

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

# **group_builder_get_group_sync_mapping**
> Groupbuilderv3GetGroupSyncMappingResponse group_builder_get_group_sync_mapping(central_manager_id=central_manager_id)

Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_group_sync_mapping_response import Groupbuilderv3GetGroupSyncMappingResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central manager. (optional)

    try:
        # Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.
        api_response = api_instance.group_builder_get_group_sync_mapping(central_manager_id=central_manager_id)
        print("The response of GroupBuilderApi->group_builder_get_group_sync_mapping:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_get_group_sync_mapping: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central manager. | [optional] 

### Return type

[**Groupbuilderv3GetGroupSyncMappingResponse**](Groupbuilderv3GetGroupSyncMappingResponse.md)

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

# **group_builder_get_group_type_mapping**
> Groupbuilderv3GetGroupTypeMappingResponse group_builder_get_group_type_mapping()

Summary: Get group type mapping Description: Get insights to gdp group types mapping.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_group_type_mapping_response import Groupbuilderv3GetGroupTypeMappingResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)

    try:
        # Summary: Get group type mapping Description: Get insights to gdp group types mapping.
        api_response = api_instance.group_builder_get_group_type_mapping()
        print("The response of GroupBuilderApi->group_builder_get_group_type_mapping:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_get_group_type_mapping: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Groupbuilderv3GetGroupTypeMappingResponse**](Groupbuilderv3GetGroupTypeMappingResponse.md)

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

# **group_builder_get_group_types**
> Groupbuilderv3GetGroupTypesResponse group_builder_get_group_types()

Summary: Get group types Description: Get a list of available group types.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_group_types_response import Groupbuilderv3GetGroupTypesResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)

    try:
        # Summary: Get group types Description: Get a list of available group types.
        api_response = api_instance.group_builder_get_group_types()
        print("The response of GroupBuilderApi->group_builder_get_group_types:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_get_group_types: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Groupbuilderv3GetGroupTypesResponse**](Groupbuilderv3GetGroupTypesResponse.md)

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

# **group_builder_get_groups**
> Groupbuilderv3GetGroupsResponse group_builder_get_groups(do_not_include_member_count=do_not_include_member_count, only_full_access=only_full_access, non_nested=non_nested)

Summary: Get groups Description: Get a list of imported group members.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_groups_response import Groupbuilderv3GetGroupsResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    do_not_include_member_count = True # bool | Return group names, ID's, type ID's, nested bool, and tuple count only if the flag is true. (optional)
    only_full_access = True # bool | Only return groups that user has full-access to. (optional)
    non_nested = True # bool | Only return non-nested groups. (optional)

    try:
        # Summary: Get groups Description: Get a list of imported group members.
        api_response = api_instance.group_builder_get_groups(do_not_include_member_count=do_not_include_member_count, only_full_access=only_full_access, non_nested=non_nested)
        print("The response of GroupBuilderApi->group_builder_get_groups:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_get_groups: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **do_not_include_member_count** | **bool**| Return group names, ID&#39;s, type ID&#39;s, nested bool, and tuple count only if the flag is true. | [optional] 
 **only_full_access** | **bool**| Only return groups that user has full-access to. | [optional] 
 **non_nested** | **bool**| Only return non-nested groups. | [optional] 

### Return type

[**Groupbuilderv3GetGroupsResponse**](Groupbuilderv3GetGroupsResponse.md)

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

# **group_builder_get_import_groups**
> Groupbuilderv3GetImportGroupsResponse group_builder_get_import_groups(central_manager_id=central_manager_id)

Summary: Get import groups Description: Get unsynchronized groups from a central manager.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_import_groups_response import Groupbuilderv3GetImportGroupsResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | Central manager host name. (optional)

    try:
        # Summary: Get import groups Description: Get unsynchronized groups from a central manager.
        api_response = api_instance.group_builder_get_import_groups(central_manager_id=central_manager_id)
        print("The response of GroupBuilderApi->group_builder_get_import_groups:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_get_import_groups: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| Central manager host name. | [optional] 

### Return type

[**Groupbuilderv3GetImportGroupsResponse**](Groupbuilderv3GetImportGroupsResponse.md)

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

# **group_builder_import_group**
> Groupbuilderv3ImportGroupResponse group_builder_import_group(groupbuilderv3_import_group_request)

Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_import_group_request import Groupbuilderv3ImportGroupRequest
from ibm_gdsc_sdk_software.models.groupbuilderv3_import_group_response import Groupbuilderv3ImportGroupResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    groupbuilderv3_import_group_request = ibm_gdsc_sdk_software.Groupbuilderv3ImportGroupRequest() # Groupbuilderv3ImportGroupRequest | 

    try:
        # Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
        api_response = api_instance.group_builder_import_group(groupbuilderv3_import_group_request)
        print("The response of GroupBuilderApi->group_builder_import_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_import_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3_import_group_request** | [**Groupbuilderv3ImportGroupRequest**](Groupbuilderv3ImportGroupRequest.md)|  | 

### Return type

[**Groupbuilderv3ImportGroupResponse**](Groupbuilderv3ImportGroupResponse.md)

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

# **group_builder_refresh_groups**
> Groupbuilderv3RefreshGroupsResponse group_builder_refresh_groups(groupbuilderv3_refresh_groups_request)

Summary: Refresh groups Description: Refresh tenants selected imported groups.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_refresh_groups_request import Groupbuilderv3RefreshGroupsRequest
from ibm_gdsc_sdk_software.models.groupbuilderv3_refresh_groups_response import Groupbuilderv3RefreshGroupsResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    groupbuilderv3_refresh_groups_request = ibm_gdsc_sdk_software.Groupbuilderv3RefreshGroupsRequest() # Groupbuilderv3RefreshGroupsRequest | 

    try:
        # Summary: Refresh groups Description: Refresh tenants selected imported groups.
        api_response = api_instance.group_builder_refresh_groups(groupbuilderv3_refresh_groups_request)
        print("The response of GroupBuilderApi->group_builder_refresh_groups:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_refresh_groups: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3_refresh_groups_request** | [**Groupbuilderv3RefreshGroupsRequest**](Groupbuilderv3RefreshGroupsRequest.md)|  | 

### Return type

[**Groupbuilderv3RefreshGroupsResponse**](Groupbuilderv3RefreshGroupsResponse.md)

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

# **group_builder_reset_groups**
> Groupbuilderv3ResetGroupsResponse group_builder_reset_groups(groupbuilderv3_reset_groups_request)

Summary: Reset groups Description: Resets tenants selected predefined groups.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_reset_groups_request import Groupbuilderv3ResetGroupsRequest
from ibm_gdsc_sdk_software.models.groupbuilderv3_reset_groups_response import Groupbuilderv3ResetGroupsResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    groupbuilderv3_reset_groups_request = ibm_gdsc_sdk_software.Groupbuilderv3ResetGroupsRequest() # Groupbuilderv3ResetGroupsRequest | 

    try:
        # Summary: Reset groups Description: Resets tenants selected predefined groups.
        api_response = api_instance.group_builder_reset_groups(groupbuilderv3_reset_groups_request)
        print("The response of GroupBuilderApi->group_builder_reset_groups:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_reset_groups: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3_reset_groups_request** | [**Groupbuilderv3ResetGroupsRequest**](Groupbuilderv3ResetGroupsRequest.md)|  | 

### Return type

[**Groupbuilderv3ResetGroupsResponse**](Groupbuilderv3ResetGroupsResponse.md)

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

# **group_builder_store_group_members_gdp**
> Groupbuilderv3StoreGroupMembersGdpResponse group_builder_store_group_members_gdp(central_manager_id, groupbuilderv3_store_group_members_gdp_request)

Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_store_group_members_gdp_request import Groupbuilderv3StoreGroupMembersGdpRequest
from ibm_gdsc_sdk_software.models.groupbuilderv3_store_group_members_gdp_response import Groupbuilderv3StoreGroupMembersGdpResponse
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.
    groupbuilderv3_store_group_members_gdp_request = ibm_gdsc_sdk_software.Groupbuilderv3StoreGroupMembersGdpRequest() # Groupbuilderv3StoreGroupMembersGdpRequest | 

    try:
        # Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
        api_response = api_instance.group_builder_store_group_members_gdp(central_manager_id, groupbuilderv3_store_group_members_gdp_request)
        print("The response of GroupBuilderApi->group_builder_store_group_members_gdp:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_store_group_members_gdp: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 
 **groupbuilderv3_store_group_members_gdp_request** | [**Groupbuilderv3StoreGroupMembersGdpRequest**](Groupbuilderv3StoreGroupMembersGdpRequest.md)|  | 

### Return type

[**Groupbuilderv3StoreGroupMembersGdpResponse**](Groupbuilderv3StoreGroupMembersGdpResponse.md)

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

# **group_builder_store_groups_gdp**
> Groupbuilderv3GetGroupsResponseGdp group_builder_store_groups_gdp(central_manager_id, groupbuilderv3_get_groups_request_gdp)

Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_groups_request_gdp import Groupbuilderv3GetGroupsRequestGdp
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_groups_response_gdp import Groupbuilderv3GetGroupsResponseGdp
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
    api_instance = ibm_gdsc_sdk_software.GroupBuilderApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.
    groupbuilderv3_get_groups_request_gdp = ibm_gdsc_sdk_software.Groupbuilderv3GetGroupsRequestGdp() # Groupbuilderv3GetGroupsRequestGdp | 

    try:
        # Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)
        api_response = api_instance.group_builder_store_groups_gdp(central_manager_id, groupbuilderv3_get_groups_request_gdp)
        print("The response of GroupBuilderApi->group_builder_store_groups_gdp:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupBuilderApi->group_builder_store_groups_gdp: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 
 **groupbuilderv3_get_groups_request_gdp** | [**Groupbuilderv3GetGroupsRequestGdp**](Groupbuilderv3GetGroupsRequestGdp.md)|  | 

### Return type

[**Groupbuilderv3GetGroupsResponseGdp**](Groupbuilderv3GetGroupsResponseGdp.md)

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

