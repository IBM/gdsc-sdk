# ibm_gdsc_sdk_saas.ComplianceAcceleratorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**compliance_accelerator_create_workspace**](ComplianceAcceleratorApi.md#compliance_accelerator_create_workspace) | **POST** /api/v3/compliance/workspace | Summary: Create workspace Description: Create a workspace.
[**compliance_accelerator_delete_compliance_workspaces**](ComplianceAcceleratorApi.md#compliance_accelerator_delete_compliance_workspaces) | **DELETE** /api/v3/compliance | Summary: Delete compliance workspaces Description: Delete workspaces.
[**compliance_accelerator_get_compliance_info**](ComplianceAcceleratorApi.md#compliance_accelerator_get_compliance_info) | **GET** /api/v3/compliance | Summary: Get compliance info Description: Return stored compliance data.
[**compliance_accelerator_hydrate_workspace**](ComplianceAcceleratorApi.md#compliance_accelerator_hydrate_workspace) | **POST** /api/v3/compliance/workspace/hydrate | HydrateWorkspace - Hydrates specified objects within a workspace
[**compliance_accelerator_store_compliance_info**](ComplianceAcceleratorApi.md#compliance_accelerator_store_compliance_info) | **POST** /api/v3/compliance | Summary: Store compliance info Description: Store compliance data.


# **compliance_accelerator_create_workspace**
> StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse compliance_accelerator_create_workspace(complianceacceleratorv3_create_workspace_request)

Summary: Create workspace Description: Create a workspace.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_create_workspace_request import Complianceacceleratorv3CreateWorkspaceRequest
from ibm_gdsc_sdk_saas.models.stream_result_of_complianceacceleratorv3_create_workspace_response import StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse
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
    api_instance = ibm_gdsc_sdk_saas.ComplianceAcceleratorApi(api_client)
    complianceacceleratorv3_create_workspace_request = ibm_gdsc_sdk_saas.Complianceacceleratorv3CreateWorkspaceRequest() # Complianceacceleratorv3CreateWorkspaceRequest | 

    try:
        # Summary: Create workspace Description: Create a workspace.
        api_response = api_instance.compliance_accelerator_create_workspace(complianceacceleratorv3_create_workspace_request)
        print("The response of ComplianceAcceleratorApi->compliance_accelerator_create_workspace:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ComplianceAcceleratorApi->compliance_accelerator_create_workspace: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3_create_workspace_request** | [**Complianceacceleratorv3CreateWorkspaceRequest**](Complianceacceleratorv3CreateWorkspaceRequest.md)|  | 

### Return type

[**StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse**](StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **compliance_accelerator_delete_compliance_workspaces**
> Complianceacceleratorv3DeleteComplianceWorkspacesResponse compliance_accelerator_delete_compliance_workspaces(regulations=regulations, delete_all=delete_all)

Summary: Delete compliance workspaces Description: Delete workspaces.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_delete_compliance_workspaces_response import Complianceacceleratorv3DeleteComplianceWorkspacesResponse
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
    api_instance = ibm_gdsc_sdk_saas.ComplianceAcceleratorApi(api_client)
    regulations = ['regulations_example'] # List[str] | Id to be deleted. (optional)
    delete_all = True # bool | if you want to delete a whole configuration. (optional)

    try:
        # Summary: Delete compliance workspaces Description: Delete workspaces.
        api_response = api_instance.compliance_accelerator_delete_compliance_workspaces(regulations=regulations, delete_all=delete_all)
        print("The response of ComplianceAcceleratorApi->compliance_accelerator_delete_compliance_workspaces:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ComplianceAcceleratorApi->compliance_accelerator_delete_compliance_workspaces: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regulations** | [**List[str]**](str.md)| Id to be deleted. | [optional] 
 **delete_all** | **bool**| if you want to delete a whole configuration. | [optional] 

### Return type

[**Complianceacceleratorv3DeleteComplianceWorkspacesResponse**](Complianceacceleratorv3DeleteComplianceWorkspacesResponse.md)

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

# **compliance_accelerator_get_compliance_info**
> Complianceacceleratorv3GetComplianceInfoResponse compliance_accelerator_get_compliance_info(is_brief=is_brief)

Summary: Get compliance info Description: Return stored compliance data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_get_compliance_info_response import Complianceacceleratorv3GetComplianceInfoResponse
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
    api_instance = ibm_gdsc_sdk_saas.ComplianceAcceleratorApi(api_client)
    is_brief = True # bool | gives compliance workspace data without reaching out to other services - meant to be quicker for dashboards. (optional)

    try:
        # Summary: Get compliance info Description: Return stored compliance data.
        api_response = api_instance.compliance_accelerator_get_compliance_info(is_brief=is_brief)
        print("The response of ComplianceAcceleratorApi->compliance_accelerator_get_compliance_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ComplianceAcceleratorApi->compliance_accelerator_get_compliance_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **is_brief** | **bool**| gives compliance workspace data without reaching out to other services - meant to be quicker for dashboards. | [optional] 

### Return type

[**Complianceacceleratorv3GetComplianceInfoResponse**](Complianceacceleratorv3GetComplianceInfoResponse.md)

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

# **compliance_accelerator_hydrate_workspace**
> Complianceacceleratorv3HydrateComplianceWorkspacesResponse compliance_accelerator_hydrate_workspace(complianceacceleratorv3_hydrate_compliance_workspaces_request)

HydrateWorkspace - Hydrates specified objects within a workspace

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_hydrate_compliance_workspaces_request import Complianceacceleratorv3HydrateComplianceWorkspacesRequest
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_hydrate_compliance_workspaces_response import Complianceacceleratorv3HydrateComplianceWorkspacesResponse
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
    api_instance = ibm_gdsc_sdk_saas.ComplianceAcceleratorApi(api_client)
    complianceacceleratorv3_hydrate_compliance_workspaces_request = ibm_gdsc_sdk_saas.Complianceacceleratorv3HydrateComplianceWorkspacesRequest() # Complianceacceleratorv3HydrateComplianceWorkspacesRequest | 

    try:
        # HydrateWorkspace - Hydrates specified objects within a workspace
        api_response = api_instance.compliance_accelerator_hydrate_workspace(complianceacceleratorv3_hydrate_compliance_workspaces_request)
        print("The response of ComplianceAcceleratorApi->compliance_accelerator_hydrate_workspace:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ComplianceAcceleratorApi->compliance_accelerator_hydrate_workspace: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3_hydrate_compliance_workspaces_request** | [**Complianceacceleratorv3HydrateComplianceWorkspacesRequest**](Complianceacceleratorv3HydrateComplianceWorkspacesRequest.md)|  | 

### Return type

[**Complianceacceleratorv3HydrateComplianceWorkspacesResponse**](Complianceacceleratorv3HydrateComplianceWorkspacesResponse.md)

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

# **compliance_accelerator_store_compliance_info**
> Complianceacceleratorv3StoreComplianceInfoResponse compliance_accelerator_store_compliance_info(complianceacceleratorv3_store_compliance_info_request)

Summary: Store compliance info Description: Store compliance data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_store_compliance_info_request import Complianceacceleratorv3StoreComplianceInfoRequest
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_store_compliance_info_response import Complianceacceleratorv3StoreComplianceInfoResponse
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
    api_instance = ibm_gdsc_sdk_saas.ComplianceAcceleratorApi(api_client)
    complianceacceleratorv3_store_compliance_info_request = ibm_gdsc_sdk_saas.Complianceacceleratorv3StoreComplianceInfoRequest() # Complianceacceleratorv3StoreComplianceInfoRequest | 

    try:
        # Summary: Store compliance info Description: Store compliance data.
        api_response = api_instance.compliance_accelerator_store_compliance_info(complianceacceleratorv3_store_compliance_info_request)
        print("The response of ComplianceAcceleratorApi->compliance_accelerator_store_compliance_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ComplianceAcceleratorApi->compliance_accelerator_store_compliance_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3_store_compliance_info_request** | [**Complianceacceleratorv3StoreComplianceInfoRequest**](Complianceacceleratorv3StoreComplianceInfoRequest.md)|  | 

### Return type

[**Complianceacceleratorv3StoreComplianceInfoResponse**](Complianceacceleratorv3StoreComplianceInfoResponse.md)

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

