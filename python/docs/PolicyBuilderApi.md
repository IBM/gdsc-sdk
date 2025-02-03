# ibm_gdsc_sdk_software.PolicyBuilderApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**policy_builder_clone_policy**](PolicyBuilderApi.md#policy_builder_clone_policy) | **POST** /api/v3/policies/clone/{policy_id} | Summary: Clone policy Description: Clone a policy.
[**policy_builder_create_policy**](PolicyBuilderApi.md#policy_builder_create_policy) | **POST** /api/v3/policies | Summary: Create policy Description: Create Policy returns response code and message.
[**policy_builder_delete_gdp_sync_entry**](PolicyBuilderApi.md#policy_builder_delete_gdp_sync_entry) | **DELETE** /api/v3/policies/sync_entry | Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
[**policy_builder_delete_policies**](PolicyBuilderApi.md#policy_builder_delete_policies) | **DELETE** /api/v3/policies | Summary: Delete policies Description: Delete Policy returns response code and message.
[**policy_builder_get_gdp_policy_meta_data**](PolicyBuilderApi.md#policy_builder_get_gdp_policy_meta_data) | **GET** /api/v3/policies/metadata_list | Summary: Get GDP policy summary information Description: Get GDP&#39;s CM&#39;s policy summary from mogodb
[**policy_builder_get_policies**](PolicyBuilderApi.md#policy_builder_get_policies) | **GET** /api/v3/policies | Summary: Get policies Description: Return a list of policies to the caller.
[**policy_builder_get_policy_details**](PolicyBuilderApi.md#policy_builder_get_policy_details) | **GET** /api/v3/policies/{policy_id}/details | Summary: Get policy details Description: Return a list of rules inside the policy.
[**policy_builder_get_policy_names_from_rule_ids**](PolicyBuilderApi.md#policy_builder_get_policy_names_from_rule_ids) | **POST** /api/v3/policies/policy_names | Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
[**policy_builder_get_policy_sync_list**](PolicyBuilderApi.md#policy_builder_get_policy_sync_list) | **GET** /api/v3/policies/sync_list | Summary: Get list of synced polices Description: Returns the list and status of sync entries
[**policy_builder_get_receivers**](PolicyBuilderApi.md#policy_builder_get_receivers) | **GET** /api/v3/policies/receivers | Summary: Get receivers Description: Get all the receivers associated with actions.
[**policy_builder_get_rule_metadata**](PolicyBuilderApi.md#policy_builder_get_rule_metadata) | **GET** /api/v3/rules/metadata | Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
[**policy_builder_insert_gdp_policy**](PolicyBuilderApi.md#policy_builder_insert_gdp_policy) | **POST** /api/v3/policies/sync_entry | Summary: Insert GDP policy sync entry Description: Inserts GDP policy&#39;s name into sync collection
[**policy_builder_insert_gdp_policy_meta_data**](PolicyBuilderApi.md#policy_builder_insert_gdp_policy_meta_data) | **POST** /api/v3/central_managers/{central_manager_id}/policies/policy_metadata | Summary: Insert gdp policy summaries Description: Inserts GDP&#39;s CM&#39;s policy summary information into mogodb. (This API is called from GDP only)
[**policy_builder_install_policies**](PolicyBuilderApi.md#policy_builder_install_policies) | **PUT** /api/v3/policies/install | Summary: Install policies Description: Activate Policies request performs activations.
[**policy_builder_integration_check**](PolicyBuilderApi.md#policy_builder_integration_check) | **GET** /api/v3/policies/integration_check/{integration_id} | Summary: Integration check Description: Check if integration id is being used in policies.
[**policy_builder_policies_groups**](PolicyBuilderApi.md#policy_builder_policies_groups) | **GET** /api/v3/policies/groups | Summary: Policies groups Description: Get policy groups.
[**policy_builder_rule_validation**](PolicyBuilderApi.md#policy_builder_rule_validation) | **POST** /api/v3/rules/validate | Summary: Rule validation Description: Validate a rule parameters and actions.
[**policy_builder_store_policies_gdp**](PolicyBuilderApi.md#policy_builder_store_policies_gdp) | **POST** /api/v3/policies/{central_manager_id} | Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)


# **policy_builder_clone_policy**
> Policybuilderv3StandardCRUDResponse policy_builder_clone_policy(policy_id, policybuilderv3_clone_policy_request)

Summary: Clone policy Description: Clone a policy.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_clone_policy_request import Policybuilderv3ClonePolicyRequest
from ibm_gdsc_sdk_software.models.policybuilderv3_standard_crud_response import Policybuilderv3StandardCRUDResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    policy_id = 'policy_id_example' # str | Policy id that needs to be cloned.
    policybuilderv3_clone_policy_request = ibm_gdsc_sdk_software.Policybuilderv3ClonePolicyRequest() # Policybuilderv3ClonePolicyRequest | 

    try:
        # Summary: Clone policy Description: Clone a policy.
        api_response = api_instance.policy_builder_clone_policy(policy_id, policybuilderv3_clone_policy_request)
        print("The response of PolicyBuilderApi->policy_builder_clone_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_clone_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policy_id** | **str**| Policy id that needs to be cloned. | 
 **policybuilderv3_clone_policy_request** | [**Policybuilderv3ClonePolicyRequest**](Policybuilderv3ClonePolicyRequest.md)|  | 

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

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

# **policy_builder_create_policy**
> Policybuilderv3CreateUpdatePolicyResponse policy_builder_create_policy(policybuilderv3_create_update_policy_request)

Summary: Create policy Description: Create Policy returns response code and message.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_create_update_policy_request import Policybuilderv3CreateUpdatePolicyRequest
from ibm_gdsc_sdk_software.models.policybuilderv3_create_update_policy_response import Policybuilderv3CreateUpdatePolicyResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    policybuilderv3_create_update_policy_request = ibm_gdsc_sdk_software.Policybuilderv3CreateUpdatePolicyRequest() # Policybuilderv3CreateUpdatePolicyRequest | 

    try:
        # Summary: Create policy Description: Create Policy returns response code and message.
        api_response = api_instance.policy_builder_create_policy(policybuilderv3_create_update_policy_request)
        print("The response of PolicyBuilderApi->policy_builder_create_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_create_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3_create_update_policy_request** | [**Policybuilderv3CreateUpdatePolicyRequest**](Policybuilderv3CreateUpdatePolicyRequest.md)|  | 

### Return type

[**Policybuilderv3CreateUpdatePolicyResponse**](Policybuilderv3CreateUpdatePolicyResponse.md)

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

# **policy_builder_delete_gdp_sync_entry**
> Policybuilderv3DeleteGdpPolicySyncResponse policy_builder_delete_gdp_sync_entry(sync_ids=sync_ids)

Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_delete_gdp_policy_sync_response import Policybuilderv3DeleteGdpPolicySyncResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    sync_ids = ['sync_ids_example'] # List[str] | Policy sync entry id to delete from sync. (optional)

    try:
        # Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
        api_response = api_instance.policy_builder_delete_gdp_sync_entry(sync_ids=sync_ids)
        print("The response of PolicyBuilderApi->policy_builder_delete_gdp_sync_entry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_delete_gdp_sync_entry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sync_ids** | [**List[str]**](str.md)| Policy sync entry id to delete from sync. | [optional] 

### Return type

[**Policybuilderv3DeleteGdpPolicySyncResponse**](Policybuilderv3DeleteGdpPolicySyncResponse.md)

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

# **policy_builder_delete_policies**
> Policybuilderv3StandardCRUDResponse policy_builder_delete_policies(policy_ids=policy_ids)

Summary: Delete policies Description: Delete Policy returns response code and message.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_standard_crud_response import Policybuilderv3StandardCRUDResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    policy_ids = ['policy_ids_example'] # List[str] | Policy ids. (optional)

    try:
        # Summary: Delete policies Description: Delete Policy returns response code and message.
        api_response = api_instance.policy_builder_delete_policies(policy_ids=policy_ids)
        print("The response of PolicyBuilderApi->policy_builder_delete_policies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_delete_policies: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policy_ids** | [**List[str]**](str.md)| Policy ids. | [optional] 

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

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

# **policy_builder_get_gdp_policy_meta_data**
> Policybuilderv3GetGdpPolicyMetaDataResponse policy_builder_get_gdp_policy_meta_data()

Summary: Get GDP policy summary information Description: Get GDP's CM's policy summary from mogodb

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_get_gdp_policy_meta_data_response import Policybuilderv3GetGdpPolicyMetaDataResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)

    try:
        # Summary: Get GDP policy summary information Description: Get GDP's CM's policy summary from mogodb
        api_response = api_instance.policy_builder_get_gdp_policy_meta_data()
        print("The response of PolicyBuilderApi->policy_builder_get_gdp_policy_meta_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_get_gdp_policy_meta_data: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Policybuilderv3GetGdpPolicyMetaDataResponse**](Policybuilderv3GetGdpPolicyMetaDataResponse.md)

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

# **policy_builder_get_policies**
> Policybuilderv3GetPoliciesResponse policy_builder_get_policies()

Summary: Get policies Description: Return a list of policies to the caller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_get_policies_response import Policybuilderv3GetPoliciesResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)

    try:
        # Summary: Get policies Description: Return a list of policies to the caller.
        api_response = api_instance.policy_builder_get_policies()
        print("The response of PolicyBuilderApi->policy_builder_get_policies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_get_policies: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Policybuilderv3GetPoliciesResponse**](Policybuilderv3GetPoliciesResponse.md)

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

# **policy_builder_get_policy_details**
> Policybuilderv3GetPolicyDetailsResponse policy_builder_get_policy_details(policy_id)

Summary: Get policy details Description: Return a list of rules inside the policy.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_get_policy_details_response import Policybuilderv3GetPolicyDetailsResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    policy_id = 'policy_id_example' # str | Policy id.

    try:
        # Summary: Get policy details Description: Return a list of rules inside the policy.
        api_response = api_instance.policy_builder_get_policy_details(policy_id)
        print("The response of PolicyBuilderApi->policy_builder_get_policy_details:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_get_policy_details: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policy_id** | **str**| Policy id. | 

### Return type

[**Policybuilderv3GetPolicyDetailsResponse**](Policybuilderv3GetPolicyDetailsResponse.md)

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

# **policy_builder_get_policy_names_from_rule_ids**
> Policybuilderv3GetPolicyNamesFromRuleIDsResponse policy_builder_get_policy_names_from_rule_ids(policybuilderv3_get_policy_names_from_rule_ids_request)

Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_get_policy_names_from_rule_ids_request import Policybuilderv3GetPolicyNamesFromRuleIDsRequest
from ibm_gdsc_sdk_software.models.policybuilderv3_get_policy_names_from_rule_ids_response import Policybuilderv3GetPolicyNamesFromRuleIDsResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    policybuilderv3_get_policy_names_from_rule_ids_request = ibm_gdsc_sdk_software.Policybuilderv3GetPolicyNamesFromRuleIDsRequest() # Policybuilderv3GetPolicyNamesFromRuleIDsRequest | 

    try:
        # Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
        api_response = api_instance.policy_builder_get_policy_names_from_rule_ids(policybuilderv3_get_policy_names_from_rule_ids_request)
        print("The response of PolicyBuilderApi->policy_builder_get_policy_names_from_rule_ids:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_get_policy_names_from_rule_ids: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3_get_policy_names_from_rule_ids_request** | [**Policybuilderv3GetPolicyNamesFromRuleIDsRequest**](Policybuilderv3GetPolicyNamesFromRuleIDsRequest.md)|  | 

### Return type

[**Policybuilderv3GetPolicyNamesFromRuleIDsResponse**](Policybuilderv3GetPolicyNamesFromRuleIDsResponse.md)

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

# **policy_builder_get_policy_sync_list**
> Policybuilderv3GetPolicySyncListResponse policy_builder_get_policy_sync_list()

Summary: Get list of synced polices Description: Returns the list and status of sync entries

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_get_policy_sync_list_response import Policybuilderv3GetPolicySyncListResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)

    try:
        # Summary: Get list of synced polices Description: Returns the list and status of sync entries
        api_response = api_instance.policy_builder_get_policy_sync_list()
        print("The response of PolicyBuilderApi->policy_builder_get_policy_sync_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_get_policy_sync_list: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Policybuilderv3GetPolicySyncListResponse**](Policybuilderv3GetPolicySyncListResponse.md)

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

# **policy_builder_get_receivers**
> Policybuilderv3GetReceiversResponse policy_builder_get_receivers(action_id=action_id, validate_cache=validate_cache)

Summary: Get receivers Description: Get all the receivers associated with actions.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_get_receivers_response import Policybuilderv3GetReceiversResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    action_id = ['action_id_example'] # List[str] | Action id. (optional)
    validate_cache = True # bool | Flag that indicates if cache needs to be validated. (optional)

    try:
        # Summary: Get receivers Description: Get all the receivers associated with actions.
        api_response = api_instance.policy_builder_get_receivers(action_id=action_id, validate_cache=validate_cache)
        print("The response of PolicyBuilderApi->policy_builder_get_receivers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_get_receivers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action_id** | [**List[str]**](str.md)| Action id. | [optional] 
 **validate_cache** | **bool**| Flag that indicates if cache needs to be validated. | [optional] 

### Return type

[**Policybuilderv3GetReceiversResponse**](Policybuilderv3GetReceiversResponse.md)

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

# **policy_builder_get_rule_metadata**
> Policybuilderv3RuleMetadataResponse policy_builder_get_rule_metadata(rule_type=rule_type)

Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_rule_metadata_response import Policybuilderv3RuleMetadataResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    rule_type = 'ACCESS' # str | Rule type integer to indicate rule type. (optional) (default to 'ACCESS')

    try:
        # Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
        api_response = api_instance.policy_builder_get_rule_metadata(rule_type=rule_type)
        print("The response of PolicyBuilderApi->policy_builder_get_rule_metadata:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_get_rule_metadata: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rule_type** | **str**| Rule type integer to indicate rule type. | [optional] [default to &#39;ACCESS&#39;]

### Return type

[**Policybuilderv3RuleMetadataResponse**](Policybuilderv3RuleMetadataResponse.md)

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

# **policy_builder_insert_gdp_policy**
> Policybuilderv3InsertGdpPolicySyncResponse policy_builder_insert_gdp_policy(policybuilderv3_insert_gdp_policy_sync_request)

Summary: Insert GDP policy sync entry Description: Inserts GDP policy's name into sync collection

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_insert_gdp_policy_sync_request import Policybuilderv3InsertGdpPolicySyncRequest
from ibm_gdsc_sdk_software.models.policybuilderv3_insert_gdp_policy_sync_response import Policybuilderv3InsertGdpPolicySyncResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    policybuilderv3_insert_gdp_policy_sync_request = ibm_gdsc_sdk_software.Policybuilderv3InsertGdpPolicySyncRequest() # Policybuilderv3InsertGdpPolicySyncRequest | 

    try:
        # Summary: Insert GDP policy sync entry Description: Inserts GDP policy's name into sync collection
        api_response = api_instance.policy_builder_insert_gdp_policy(policybuilderv3_insert_gdp_policy_sync_request)
        print("The response of PolicyBuilderApi->policy_builder_insert_gdp_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_insert_gdp_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3_insert_gdp_policy_sync_request** | [**Policybuilderv3InsertGdpPolicySyncRequest**](Policybuilderv3InsertGdpPolicySyncRequest.md)|  | 

### Return type

[**Policybuilderv3InsertGdpPolicySyncResponse**](Policybuilderv3InsertGdpPolicySyncResponse.md)

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

# **policy_builder_insert_gdp_policy_meta_data**
> Policybuilderv3InsertGdpPolicyMetaDataResponse policy_builder_insert_gdp_policy_meta_data(central_manager_id, policybuilderv3_insert_gdp_policy_meta_data_request)

Summary: Insert gdp policy summaries Description: Inserts GDP's CM's policy summary information into mogodb. (This API is called from GDP only)

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_insert_gdp_policy_meta_data_request import Policybuilderv3InsertGdpPolicyMetaDataRequest
from ibm_gdsc_sdk_software.models.policybuilderv3_insert_gdp_policy_meta_data_response import Policybuilderv3InsertGdpPolicyMetaDataResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.
    policybuilderv3_insert_gdp_policy_meta_data_request = ibm_gdsc_sdk_software.Policybuilderv3InsertGdpPolicyMetaDataRequest() # Policybuilderv3InsertGdpPolicyMetaDataRequest | 

    try:
        # Summary: Insert gdp policy summaries Description: Inserts GDP's CM's policy summary information into mogodb. (This API is called from GDP only)
        api_response = api_instance.policy_builder_insert_gdp_policy_meta_data(central_manager_id, policybuilderv3_insert_gdp_policy_meta_data_request)
        print("The response of PolicyBuilderApi->policy_builder_insert_gdp_policy_meta_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_insert_gdp_policy_meta_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 
 **policybuilderv3_insert_gdp_policy_meta_data_request** | [**Policybuilderv3InsertGdpPolicyMetaDataRequest**](Policybuilderv3InsertGdpPolicyMetaDataRequest.md)|  | 

### Return type

[**Policybuilderv3InsertGdpPolicyMetaDataResponse**](Policybuilderv3InsertGdpPolicyMetaDataResponse.md)

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

# **policy_builder_install_policies**
> Policybuilderv3StatusResponseBase policy_builder_install_policies(policybuilderv3_install_policies_request)

Summary: Install policies Description: Activate Policies request performs activations.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_install_policies_request import Policybuilderv3InstallPoliciesRequest
from ibm_gdsc_sdk_software.models.policybuilderv3_status_response_base import Policybuilderv3StatusResponseBase
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    policybuilderv3_install_policies_request = ibm_gdsc_sdk_software.Policybuilderv3InstallPoliciesRequest() # Policybuilderv3InstallPoliciesRequest | 

    try:
        # Summary: Install policies Description: Activate Policies request performs activations.
        api_response = api_instance.policy_builder_install_policies(policybuilderv3_install_policies_request)
        print("The response of PolicyBuilderApi->policy_builder_install_policies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_install_policies: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3_install_policies_request** | [**Policybuilderv3InstallPoliciesRequest**](Policybuilderv3InstallPoliciesRequest.md)|  | 

### Return type

[**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md)

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

# **policy_builder_integration_check**
> Policybuilderv3GetIntegrationCheckResponse policy_builder_integration_check(integration_id, template_id=template_id)

Summary: Integration check Description: Check if integration id is being used in policies.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_get_integration_check_response import Policybuilderv3GetIntegrationCheckResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    integration_id = 'integration_id_example' # str | Integration Id to check if it is being used in policies.
    template_id = 'template_id_example' # str | Template Id to check if it is being used in policies. (optional)

    try:
        # Summary: Integration check Description: Check if integration id is being used in policies.
        api_response = api_instance.policy_builder_integration_check(integration_id, template_id=template_id)
        print("The response of PolicyBuilderApi->policy_builder_integration_check:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_integration_check: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_id** | **str**| Integration Id to check if it is being used in policies. | 
 **template_id** | **str**| Template Id to check if it is being used in policies. | [optional] 

### Return type

[**Policybuilderv3GetIntegrationCheckResponse**](Policybuilderv3GetIntegrationCheckResponse.md)

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

# **policy_builder_policies_groups**
> Policybuilderv3GetPoliciesGroupsResponse policy_builder_policies_groups(group_ids=group_ids)

Summary: Policies groups Description: Get policy groups.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_get_policies_groups_response import Policybuilderv3GetPoliciesGroupsResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    group_ids = ['group_ids_example'] # List[str] | Group ids to check if they are being used in policies. (optional)

    try:
        # Summary: Policies groups Description: Get policy groups.
        api_response = api_instance.policy_builder_policies_groups(group_ids=group_ids)
        print("The response of PolicyBuilderApi->policy_builder_policies_groups:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_policies_groups: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_ids** | [**List[str]**](str.md)| Group ids to check if they are being used in policies. | [optional] 

### Return type

[**Policybuilderv3GetPoliciesGroupsResponse**](Policybuilderv3GetPoliciesGroupsResponse.md)

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

# **policy_builder_rule_validation**
> Policybuilderv3StandardCRUDResponse policy_builder_rule_validation(policybuilderv3_get_rule_validation_request)

Summary: Rule validation Description: Validate a rule parameters and actions.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_get_rule_validation_request import Policybuilderv3GetRuleValidationRequest
from ibm_gdsc_sdk_software.models.policybuilderv3_standard_crud_response import Policybuilderv3StandardCRUDResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    policybuilderv3_get_rule_validation_request = ibm_gdsc_sdk_software.Policybuilderv3GetRuleValidationRequest() # Policybuilderv3GetRuleValidationRequest | 

    try:
        # Summary: Rule validation Description: Validate a rule parameters and actions.
        api_response = api_instance.policy_builder_rule_validation(policybuilderv3_get_rule_validation_request)
        print("The response of PolicyBuilderApi->policy_builder_rule_validation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_rule_validation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3_get_rule_validation_request** | [**Policybuilderv3GetRuleValidationRequest**](Policybuilderv3GetRuleValidationRequest.md)|  | 

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

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

# **policy_builder_store_policies_gdp**
> Policybuilderv3StorePolicyGdpResponse policy_builder_store_policies_gdp(central_manager_id, policybuilderv3_store_policy_gdp_request)

Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.policybuilderv3_store_policy_gdp_request import Policybuilderv3StorePolicyGdpRequest
from ibm_gdsc_sdk_software.models.policybuilderv3_store_policy_gdp_response import Policybuilderv3StorePolicyGdpResponse
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
    api_instance = ibm_gdsc_sdk_software.PolicyBuilderApi(api_client)
    central_manager_id = 'central_manager_id_example' # str | ID of central manager.
    policybuilderv3_store_policy_gdp_request = ibm_gdsc_sdk_software.Policybuilderv3StorePolicyGdpRequest() # Policybuilderv3StorePolicyGdpRequest | 

    try:
        # Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)
        api_response = api_instance.policy_builder_store_policies_gdp(central_manager_id, policybuilderv3_store_policy_gdp_request)
        print("The response of PolicyBuilderApi->policy_builder_store_policies_gdp:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PolicyBuilderApi->policy_builder_store_policies_gdp: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **central_manager_id** | **str**| ID of central manager. | 
 **policybuilderv3_store_policy_gdp_request** | [**Policybuilderv3StorePolicyGdpRequest**](Policybuilderv3StorePolicyGdpRequest.md)|  | 

### Return type

[**Policybuilderv3StorePolicyGdpResponse**](Policybuilderv3StorePolicyGdpResponse.md)

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

