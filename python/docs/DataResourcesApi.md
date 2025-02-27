# ibm_gdsc_sdk_saas.DataResourcesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_data_resource**](DataResourcesApi.md#get_data_resource) | **GET** /api/v1/dspm/dataResources/{dataResourceId} | Get a specific data resource by its ID
[**get_data_resources_summary**](DataResourcesApi.md#get_data_resources_summary) | **GET** /api/v1/dspm/dataResources/summary | Data resources summary
[**list_data_resources**](DataResourcesApi.md#list_data_resources) | **GET** /api/v1/dspm/dataResources | List data resources that match a given filter
[**list_data_resources_names**](DataResourcesApi.md#list_data_resources_names) | **GET** /api/v1/dspm/dataResources/names | List names of data resources
[**remove_resource**](DataResourcesApi.md#remove_resource) | **DELETE** /api/v1/dspm/dataResources/{dataResourceId}/removeResource | Remove resource from DSPM
[**update_resource_review_status**](DataResourcesApi.md#update_resource_review_status) | **PUT** /api/v1/dspm/dataResources/{dataResourceId}/reviewed | Set review status of a data resource


# **get_data_resource**
> DataResource get_data_resource(data_resource_id)

Get a specific data resource by its ID

Get additional details on a specific data resource by providing its ID.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.data_resource import DataResource
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
    api_instance = ibm_gdsc_sdk_saas.DataResourcesApi(api_client)
    data_resource_id = 'arn:aws:s3::12345678910:polar-security-corplex.xlsx' # str | Data resource ID

    try:
        # Get a specific data resource by its ID
        api_response = api_instance.get_data_resource(data_resource_id)
        print("The response of DataResourcesApi->get_data_resource:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataResourcesApi->get_data_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_resource_id** | **str**| Data resource ID | 

### Return type

[**DataResource**](DataResource.md)

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

# **get_data_resources_summary**
> DataResourcesSummary get_data_resources_summary(data_store_id=data_store_id, filter=filter)

Data resources summary

Get a summary of all the data resource, that is, number of data resources, types of data resources, and other information.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.data_resources_summary import DataResourcesSummary
from ibm_gdsc_sdk_saas.models.list_data_resources_filter_parameter import ListDataResourcesFilterParameter
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
    api_instance = ibm_gdsc_sdk_saas.DataResourcesApi(api_client)
    data_store_id = 'arn:aws:s3::123456789101:mys3-prod' # str | Data store id (optional)
    filter = ibm_gdsc_sdk_saas.ListDataResourcesFilterParameter() # ListDataResourcesFilterParameter |  (optional)

    try:
        # Data resources summary
        api_response = api_instance.get_data_resources_summary(data_store_id=data_store_id, filter=filter)
        print("The response of DataResourcesApi->get_data_resources_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataResourcesApi->get_data_resources_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_store_id** | **str**| Data store id | [optional] 
 **filter** | [**ListDataResourcesFilterParameter**](.md)|  | [optional] 

### Return type

[**DataResourcesSummary**](DataResourcesSummary.md)

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

# **list_data_resources**
> ListDataResources200Response list_data_resources(data_store_id=data_store_id, filter=filter, sort=sort, page_size=page_size, next_token=next_token)

List data resources that match a given filter

Get a list of data resources based on the filter applied. You can filter by data store ID, data resource ID, data resource name, and more.<BR><B>Note:</B> Filter needs to be HTML encoded.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.list_data_resources200_response import ListDataResources200Response
from ibm_gdsc_sdk_saas.models.list_data_resources_filter_parameter import ListDataResourcesFilterParameter
from ibm_gdsc_sdk_saas.models.list_data_resources_sort_parameter import ListDataResourcesSortParameter
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
    api_instance = ibm_gdsc_sdk_saas.DataResourcesApi(api_client)
    data_store_id = 'arn:aws:s3::123456789101:mys3-prod' # str |  (optional)
    filter = ibm_gdsc_sdk_saas.ListDataResourcesFilterParameter() # ListDataResourcesFilterParameter |  (optional)
    sort = ibm_gdsc_sdk_saas.ListDataResourcesSortParameter() # ListDataResourcesSortParameter |  (optional)
    page_size = 3.4 # float |  (optional)
    next_token = 'next_token_example' # str |  (optional)

    try:
        # List data resources that match a given filter
        api_response = api_instance.list_data_resources(data_store_id=data_store_id, filter=filter, sort=sort, page_size=page_size, next_token=next_token)
        print("The response of DataResourcesApi->list_data_resources:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataResourcesApi->list_data_resources: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_store_id** | **str**|  | [optional] 
 **filter** | [**ListDataResourcesFilterParameter**](.md)|  | [optional] 
 **sort** | [**ListDataResourcesSortParameter**](.md)|  | [optional] 
 **page_size** | **float**|  | [optional] 
 **next_token** | **str**|  | [optional] 

### Return type

[**ListDataResources200Response**](ListDataResources200Response.md)

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

# **list_data_resources_names**
> List[str] list_data_resources_names(prefix, data_store_id=data_store_id)

List names of data resources

List and filter data resources by their names

### Example

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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.DataResourcesApi(api_client)
    prefix = 'check' # str | Prefix of data resource name
    data_store_id = 'arn:aws:s3::123456789101:mys3-prod' # str |  (optional)

    try:
        # List names of data resources
        api_response = api_instance.list_data_resources_names(prefix, data_store_id=data_store_id)
        print("The response of DataResourcesApi->list_data_resources_names:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataResourcesApi->list_data_resources_names: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **str**| Prefix of data resource name | 
 **data_store_id** | **str**|  | [optional] 

### Return type

**List[str]**

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

# **remove_resource**
> RemoveResource200Response remove_resource(data_resource_id, data_store_id)

Remove resource from DSPM

Removes a resource, with all its sensitivities, from Guardium DSPM dashboard. This action does not remove the resource from the resource's source environment.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.remove_resource200_response import RemoveResource200Response
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
    api_instance = ibm_gdsc_sdk_saas.DataResourcesApi(api_client)
    data_resource_id = 'arn:aws:s3::12345678910:polar-security-corplex.xlsx' # str | Data resource ID
    data_store_id = 'arn:aws:s3::123456789101:mys3-prod' # str | Data store ID

    try:
        # Remove resource from DSPM
        api_response = api_instance.remove_resource(data_resource_id, data_store_id)
        print("The response of DataResourcesApi->remove_resource:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataResourcesApi->remove_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_resource_id** | **str**| Data resource ID | 
 **data_store_id** | **str**| Data store ID | 

### Return type

[**RemoveResource200Response**](RemoveResource200Response.md)

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

# **update_resource_review_status**
> UpdateResourceReviewStatus200Response update_resource_review_status(data_resource_id, update_resource_review_body)

Set review status of a data resource

Set the review status of a specific data resource in a specific data store.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.update_resource_review_body import UpdateResourceReviewBody
from ibm_gdsc_sdk_saas.models.update_resource_review_status200_response import UpdateResourceReviewStatus200Response
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
    api_instance = ibm_gdsc_sdk_saas.DataResourcesApi(api_client)
    data_resource_id = 'data_resource_id_example' # str | Data resource id
    update_resource_review_body = ibm_gdsc_sdk_saas.UpdateResourceReviewBody() # UpdateResourceReviewBody | 

    try:
        # Set review status of a data resource
        api_response = api_instance.update_resource_review_status(data_resource_id, update_resource_review_body)
        print("The response of DataResourcesApi->update_resource_review_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataResourcesApi->update_resource_review_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_resource_id** | **str**| Data resource id | 
 **update_resource_review_body** | [**UpdateResourceReviewBody**](UpdateResourceReviewBody.md)|  | 

### Return type

[**UpdateResourceReviewStatus200Response**](UpdateResourceReviewStatus200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

