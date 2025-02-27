# ibm_gdsc_sdk_saas.DataMovementsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_actual_flow**](DataMovementsApi.md#get_actual_flow) | **GET** /api/v1/dspm/dataMovements/actualFlows/{id} | Get actual flow by providing its ID
[**get_actual_flows_summary**](DataMovementsApi.md#get_actual_flows_summary) | **GET** /api/v1/dspm/dataMovements/actualFlows/summary | Get summary of actual flows
[**get_potential_flow**](DataMovementsApi.md#get_potential_flow) | **GET** /api/v1/dspm/dataMovements/potentialFlows/{flowId} | Get potential flow by providing its ID
[**get_potential_flow_path**](DataMovementsApi.md#get_potential_flow_path) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths/{flowPathId} | Get potential flow path by providing its ID
[**get_potential_flows_summary**](DataMovementsApi.md#get_potential_flows_summary) | **GET** /api/v1/dspm/dataMovements/potentialFlows/summary | Get summary of potential flows according to the filter applied
[**list_actual_flow_paths**](DataMovementsApi.md#list_actual_flow_paths) | **GET** /api/v1/dspm/dataMovements/actualFlowPaths | Get summary of actual flows according to the filter applied
[**list_actual_flows**](DataMovementsApi.md#list_actual_flows) | **GET** /api/v1/dspm/dataMovements/actualFlows | List actual flows
[**list_potential_flows**](DataMovementsApi.md#list_potential_flows) | **GET** /api/v1/dspm/dataMovements/potentialFlows | List potential flows
[**list_potential_flows_paths**](DataMovementsApi.md#list_potential_flows_paths) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths | List potential flow paths


# **get_actual_flow**
> ActualFlow get_actual_flow(id)

Get actual flow by providing its ID

Get a detailed information about an actual flow by providing its ID.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.actual_flow import ActualFlow
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.DataMovementsApi(api_client)
    id = 'id_example' # str | 

    try:
        # Get actual flow by providing its ID
        api_response = api_instance.get_actual_flow(id)
        print("The response of DataMovementsApi->get_actual_flow:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataMovementsApi->get_actual_flow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**ActualFlow**](ActualFlow.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_actual_flows_summary**
> ActualFlowsSummary get_actual_flows_summary(filter=filter)

Get summary of actual flows

Get a summary of all the actual flows discovered by Guardium DSPM, that is, details about source and destination, and other information.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.actual_flows_summary import ActualFlowsSummary
from ibm_gdsc_sdk_saas.models.list_actual_flows_filter_parameter import ListActualFlowsFilterParameter
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.DataMovementsApi(api_client)
    filter = ibm_gdsc_sdk_saas.ListActualFlowsFilterParameter() # ListActualFlowsFilterParameter |  (optional)

    try:
        # Get summary of actual flows
        api_response = api_instance.get_actual_flows_summary(filter=filter)
        print("The response of DataMovementsApi->get_actual_flows_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataMovementsApi->get_actual_flows_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListActualFlowsFilterParameter**](.md)|  | [optional] 

### Return type

[**ActualFlowsSummary**](ActualFlowsSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_potential_flow**
> PotentialFlow get_potential_flow(flow_id)

Get potential flow by providing its ID

Get a detailed information about a potential flow by providing the flow ID.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.potential_flow import PotentialFlow
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.DataMovementsApi(api_client)
    flow_id = 'ff2b4abe-89f4-62b8-061e-1232456789' # str | 

    try:
        # Get potential flow by providing its ID
        api_response = api_instance.get_potential_flow(flow_id)
        print("The response of DataMovementsApi->get_potential_flow:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataMovementsApi->get_potential_flow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flow_id** | **str**|  | 

### Return type

[**PotentialFlow**](PotentialFlow.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**404** | potential flow not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_potential_flow_path**
> PotentialFlowPath get_potential_flow_path(flow_path_id)

Get potential flow path by providing its ID

Get details of a specific potential flow of data by providing its ID.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.potential_flow_path import PotentialFlowPath
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.DataMovementsApi(api_client)
    flow_path_id = 'ff2b4abe-89f4-62b8-061e-12345678910' # str | 

    try:
        # Get potential flow path by providing its ID
        api_response = api_instance.get_potential_flow_path(flow_path_id)
        print("The response of DataMovementsApi->get_potential_flow_path:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataMovementsApi->get_potential_flow_path: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flow_path_id** | **str**|  | 

### Return type

[**PotentialFlowPath**](PotentialFlowPath.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**404** | potential flow path not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_potential_flows_summary**
> PotentialFlowsSummary get_potential_flows_summary(filter=filter)

Get summary of potential flows according to the filter applied

Get a summary of all the potential flows based on a filter applied.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.potential_flows_filter_options import PotentialFlowsFilterOptions
from ibm_gdsc_sdk_saas.models.potential_flows_summary import PotentialFlowsSummary
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.DataMovementsApi(api_client)
    filter = ibm_gdsc_sdk_saas.PotentialFlowsFilterOptions() # PotentialFlowsFilterOptions |  (optional)

    try:
        # Get summary of potential flows according to the filter applied
        api_response = api_instance.get_potential_flows_summary(filter=filter)
        print("The response of DataMovementsApi->get_potential_flows_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataMovementsApi->get_potential_flows_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**PotentialFlowsFilterOptions**](.md)|  | [optional] 

### Return type

[**PotentialFlowsSummary**](PotentialFlowsSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_actual_flow_paths**
> ListActualFlowPaths200Response list_actual_flow_paths(sort=sort, filter=filter, page_size=page_size, next_token=next_token)

Get summary of actual flows according to the filter applied

Get detailed information about the actual flows according to the filter applied.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.list_actual_flow_paths200_response import ListActualFlowPaths200Response
from ibm_gdsc_sdk_saas.models.list_actual_flow_paths_filter_parameter import ListActualFlowPathsFilterParameter
from ibm_gdsc_sdk_saas.models.list_actual_flow_paths_sort_parameter import ListActualFlowPathsSortParameter
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.DataMovementsApi(api_client)
    sort = ibm_gdsc_sdk_saas.ListActualFlowPathsSortParameter() # ListActualFlowPathsSortParameter |  (optional)
    filter = ibm_gdsc_sdk_saas.ListActualFlowPathsFilterParameter() # ListActualFlowPathsFilterParameter |  (optional)
    page_size = 3.4 # float |  (optional)
    next_token = 'next_token_example' # str |  (optional)

    try:
        # Get summary of actual flows according to the filter applied
        api_response = api_instance.list_actual_flow_paths(sort=sort, filter=filter, page_size=page_size, next_token=next_token)
        print("The response of DataMovementsApi->list_actual_flow_paths:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataMovementsApi->list_actual_flow_paths: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | [**ListActualFlowPathsSortParameter**](.md)|  | [optional] 
 **filter** | [**ListActualFlowPathsFilterParameter**](.md)|  | [optional] 
 **page_size** | **float**|  | [optional] 
 **next_token** | **str**|  | [optional] 

### Return type

[**ListActualFlowPaths200Response**](ListActualFlowPaths200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_actual_flows**
> ListActualFlows200Response list_actual_flows(sort=sort, filter=filter, page_size=page_size, next_token=next_token)

List actual flows

List all the actual flows (based on logs) of users and services across your entire cloud accounts and SasS applications.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.list_actual_flows200_response import ListActualFlows200Response
from ibm_gdsc_sdk_saas.models.list_actual_flows_filter_parameter import ListActualFlowsFilterParameter
from ibm_gdsc_sdk_saas.models.list_actual_flows_sort_parameter import ListActualFlowsSortParameter
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.DataMovementsApi(api_client)
    sort = ibm_gdsc_sdk_saas.ListActualFlowsSortParameter() # ListActualFlowsSortParameter |  (optional)
    filter = ibm_gdsc_sdk_saas.ListActualFlowsFilterParameter() # ListActualFlowsFilterParameter |  (optional)
    page_size = 3.4 # float |  (optional)
    next_token = 'next_token_example' # str |  (optional)

    try:
        # List actual flows
        api_response = api_instance.list_actual_flows(sort=sort, filter=filter, page_size=page_size, next_token=next_token)
        print("The response of DataMovementsApi->list_actual_flows:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataMovementsApi->list_actual_flows: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | [**ListActualFlowsSortParameter**](.md)|  | [optional] 
 **filter** | [**ListActualFlowsFilterParameter**](.md)|  | [optional] 
 **page_size** | **float**|  | [optional] 
 **next_token** | **str**|  | [optional] 

### Return type

[**ListActualFlows200Response**](ListActualFlows200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_potential_flows**
> ListPotentialFlows200Response list_potential_flows(filter=filter, page_size=page_size, next_token=next_token)

List potential flows

List all the potential flows of users and services across your entire cloud accounts and SaaS applications.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.list_potential_flows200_response import ListPotentialFlows200Response
from ibm_gdsc_sdk_saas.models.potential_flows_filter_options import PotentialFlowsFilterOptions
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.DataMovementsApi(api_client)
    filter = ibm_gdsc_sdk_saas.PotentialFlowsFilterOptions() # PotentialFlowsFilterOptions |  (optional)
    page_size = 3.4 # float |  (optional)
    next_token = 'next_token_example' # str |  (optional)

    try:
        # List potential flows
        api_response = api_instance.list_potential_flows(filter=filter, page_size=page_size, next_token=next_token)
        print("The response of DataMovementsApi->list_potential_flows:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataMovementsApi->list_potential_flows: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**PotentialFlowsFilterOptions**](.md)|  | [optional] 
 **page_size** | **float**|  | [optional] 
 **next_token** | **str**|  | [optional] 

### Return type

[**ListPotentialFlows200Response**](ListPotentialFlows200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_potential_flows_paths**
> ListPotentialFlowsPaths200Response list_potential_flows_paths(filter=filter, page_size=page_size, next_token=next_token)

List potential flow paths

List all the potential flow paths based on an applied filter.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.list_potential_flows_paths200_response import ListPotentialFlowsPaths200Response
from ibm_gdsc_sdk_saas.models.potential_flows_paths_filter_options import PotentialFlowsPathsFilterOptions
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.DataMovementsApi(api_client)
    filter = ibm_gdsc_sdk_saas.PotentialFlowsPathsFilterOptions() # PotentialFlowsPathsFilterOptions |  (optional)
    page_size = 3.4 # float |  (optional)
    next_token = 'next_token_example' # str |  (optional)

    try:
        # List potential flow paths
        api_response = api_instance.list_potential_flows_paths(filter=filter, page_size=page_size, next_token=next_token)
        print("The response of DataMovementsApi->list_potential_flows_paths:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataMovementsApi->list_potential_flows_paths: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**PotentialFlowsPathsFilterOptions**](.md)|  | [optional] 
 **page_size** | **float**|  | [optional] 
 **next_token** | **str**|  | [optional] 

### Return type

[**ListPotentialFlowsPaths200Response**](ListPotentialFlowsPaths200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

