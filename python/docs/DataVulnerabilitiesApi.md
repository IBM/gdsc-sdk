# ibm_gdsc_sdk_software.DataVulnerabilitiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_vulnerability_status_comment**](DataVulnerabilitiesApi.md#add_vulnerability_status_comment) | **POST** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments | Add vulnerability status comment
[**get_vulnerabilities_summary**](DataVulnerabilitiesApi.md#get_vulnerabilities_summary) | **GET** /api/v1/dspm/vulnerabilities/summary | Get vulnerabilities summary
[**get_vulnerability**](DataVulnerabilitiesApi.md#get_vulnerability) | **GET** /api/v1/dspm/vulnerabilities/{vulnerabilityId} | Get vulnerability details by ID
[**list_vulnerabilities**](DataVulnerabilitiesApi.md#list_vulnerabilities) | **GET** /api/v1/dspm/vulnerabilities | List vulnerabilities based on an applied filter
[**list_vulnerabilities_by_data_store**](DataVulnerabilitiesApi.md#list_vulnerabilities_by_data_store) | **GET** /api/v1/dspm/vulnerabilities/byDataStore | List vulnerabilities of data stores
[**remove_vulnerability_status_comment**](DataVulnerabilitiesApi.md#remove_vulnerability_status_comment) | **DELETE** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Delete vulnerability status comment
[**set_vulnerability_status**](DataVulnerabilitiesApi.md#set_vulnerability_status) | **POST** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses | Set status of a vulnerability
[**update_vulnerability_status_comment**](DataVulnerabilitiesApi.md#update_vulnerability_status_comment) | **PUT** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Set vulnerability status


# **add_vulnerability_status_comment**
> VulnerabilityStatus add_vulnerability_status_comment(vulnerability_id, status_id, add_comment_body)

Add vulnerability status comment

Add or update the status comment of a vulnerability status to keep track of the workflow progress.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.add_comment_body import AddCommentBody
from ibm_gdsc_sdk_software.models.vulnerability_status import VulnerabilityStatus
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
    api_instance = ibm_gdsc_sdk_software.DataVulnerabilitiesApi(api_client)
    vulnerability_id = '384cd426-b187-438a-affc-e12b323f5890' # str | 
    status_id = 'status_id_example' # str | 
    add_comment_body = ibm_gdsc_sdk_software.AddCommentBody() # AddCommentBody | 

    try:
        # Add vulnerability status comment
        api_response = api_instance.add_vulnerability_status_comment(vulnerability_id, status_id, add_comment_body)
        print("The response of DataVulnerabilitiesApi->add_vulnerability_status_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataVulnerabilitiesApi->add_vulnerability_status_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerability_id** | **str**|  | 
 **status_id** | **str**|  | 
 **add_comment_body** | [**AddCommentBody**](AddCommentBody.md)|  | 

### Return type

[**VulnerabilityStatus**](VulnerabilityStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vulnerabilities_summary**
> VulnerabilitiesSummary get_vulnerabilities_summary(filter=filter)

Get vulnerabilities summary

Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility's type, threat, status, and so on.<BR><B>Note:</B> Filter needs to be HTML Encoded.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.vulnerabilities_filter_options import VulnerabilitiesFilterOptions
from ibm_gdsc_sdk_software.models.vulnerabilities_summary import VulnerabilitiesSummary
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
    api_instance = ibm_gdsc_sdk_software.DataVulnerabilitiesApi(api_client)
    filter = ibm_gdsc_sdk_software.VulnerabilitiesFilterOptions() # VulnerabilitiesFilterOptions |  (optional)

    try:
        # Get vulnerabilities summary
        api_response = api_instance.get_vulnerabilities_summary(filter=filter)
        print("The response of DataVulnerabilitiesApi->get_vulnerabilities_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataVulnerabilitiesApi->get_vulnerabilities_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**VulnerabilitiesFilterOptions**](.md)|  | [optional] 

### Return type

[**VulnerabilitiesSummary**](VulnerabilitiesSummary.md)

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

# **get_vulnerability**
> Vulnerability get_vulnerability(vulnerability_id)

Get vulnerability details by ID

Get vulnerability details by providing its ID.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.vulnerability import Vulnerability
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
    api_instance = ibm_gdsc_sdk_software.DataVulnerabilitiesApi(api_client)
    vulnerability_id = '384cd426-b187-438a-affc-e12b323f5890' # str | 

    try:
        # Get vulnerability details by ID
        api_response = api_instance.get_vulnerability(vulnerability_id)
        print("The response of DataVulnerabilitiesApi->get_vulnerability:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataVulnerabilitiesApi->get_vulnerability: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerability_id** | **str**|  | 

### Return type

[**Vulnerability**](Vulnerability.md)

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

# **list_vulnerabilities**
> ListVulnerabilities200Response list_vulnerabilities(filter=filter, sort=sort, page_size=page_size, next_token=next_token)

List vulnerabilities based on an applied filter

Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.<BR><B>Note:</B> Filter needs to be HTML encoded.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.list_vulnerabilities200_response import ListVulnerabilities200Response
from ibm_gdsc_sdk_software.models.list_vulnerabilities_sort_parameter import ListVulnerabilitiesSortParameter
from ibm_gdsc_sdk_software.models.vulnerabilities_filter_options import VulnerabilitiesFilterOptions
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
    api_instance = ibm_gdsc_sdk_software.DataVulnerabilitiesApi(api_client)
    filter = ibm_gdsc_sdk_software.VulnerabilitiesFilterOptions() # VulnerabilitiesFilterOptions |  (optional)
    sort = ibm_gdsc_sdk_software.ListVulnerabilitiesSortParameter() # ListVulnerabilitiesSortParameter |  (optional)
    page_size = 3.4 # float |  (optional)
    next_token = 'next_token_example' # str |  (optional)

    try:
        # List vulnerabilities based on an applied filter
        api_response = api_instance.list_vulnerabilities(filter=filter, sort=sort, page_size=page_size, next_token=next_token)
        print("The response of DataVulnerabilitiesApi->list_vulnerabilities:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataVulnerabilitiesApi->list_vulnerabilities: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**VulnerabilitiesFilterOptions**](.md)|  | [optional] 
 **sort** | [**ListVulnerabilitiesSortParameter**](.md)|  | [optional] 
 **page_size** | **float**|  | [optional] 
 **next_token** | **str**|  | [optional] 

### Return type

[**ListVulnerabilities200Response**](ListVulnerabilities200Response.md)

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

# **list_vulnerabilities_by_data_store**
> ListVulnerabilitiesByDataStore200Response list_vulnerabilities_by_data_store(filter=filter, sort=sort, page_size=page_size, next_token=next_token)

List vulnerabilities of data stores

Get a list of all the vulnerabilities of data stores.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.list_vulnerabilities_by_data_store200_response import ListVulnerabilitiesByDataStore200Response
from ibm_gdsc_sdk_software.models.list_vulnerabilities_by_data_store_sort_parameter import ListVulnerabilitiesByDataStoreSortParameter
from ibm_gdsc_sdk_software.models.vulnerabilities_by_data_store_filter_options import VulnerabilitiesByDataStoreFilterOptions
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
    api_instance = ibm_gdsc_sdk_software.DataVulnerabilitiesApi(api_client)
    filter = ibm_gdsc_sdk_software.VulnerabilitiesByDataStoreFilterOptions() # VulnerabilitiesByDataStoreFilterOptions |  (optional)
    sort = ibm_gdsc_sdk_software.ListVulnerabilitiesByDataStoreSortParameter() # ListVulnerabilitiesByDataStoreSortParameter |  (optional)
    page_size = 3.4 # float |  (optional)
    next_token = 'next_token_example' # str |  (optional)

    try:
        # List vulnerabilities of data stores
        api_response = api_instance.list_vulnerabilities_by_data_store(filter=filter, sort=sort, page_size=page_size, next_token=next_token)
        print("The response of DataVulnerabilitiesApi->list_vulnerabilities_by_data_store:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataVulnerabilitiesApi->list_vulnerabilities_by_data_store: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**VulnerabilitiesByDataStoreFilterOptions**](.md)|  | [optional] 
 **sort** | [**ListVulnerabilitiesByDataStoreSortParameter**](.md)|  | [optional] 
 **page_size** | **float**|  | [optional] 
 **next_token** | **str**|  | [optional] 

### Return type

[**ListVulnerabilitiesByDataStore200Response**](ListVulnerabilitiesByDataStore200Response.md)

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

# **remove_vulnerability_status_comment**
> remove_vulnerability_status_comment(vulnerability_id, status_id, comment_id)

Delete vulnerability status comment

Delete a status comment of a vulnerability status.

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
    api_instance = ibm_gdsc_sdk_software.DataVulnerabilitiesApi(api_client)
    vulnerability_id = '384cd426-b187-438a-affc-e12b323f5890' # str | 
    status_id = 'status_id_example' # str | 
    comment_id = 'comment_id_example' # str | 

    try:
        # Delete vulnerability status comment
        api_instance.remove_vulnerability_status_comment(vulnerability_id, status_id, comment_id)
    except Exception as e:
        print("Exception when calling DataVulnerabilitiesApi->remove_vulnerability_status_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerability_id** | **str**|  | 
 **status_id** | **str**|  | 
 **comment_id** | **str**|  | 

### Return type

void (empty response body)

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

# **set_vulnerability_status**
> VulnerabilityStatus set_vulnerability_status(vulnerability_id, set_vulnerability_status_request)

Set status of a vulnerability

Add or update the status of a vulnerability to track its progress.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.set_vulnerability_status_request import SetVulnerabilityStatusRequest
from ibm_gdsc_sdk_software.models.vulnerability_status import VulnerabilityStatus
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
    api_instance = ibm_gdsc_sdk_software.DataVulnerabilitiesApi(api_client)
    vulnerability_id = 'vulnerability_id_example' # str | 
    set_vulnerability_status_request = ibm_gdsc_sdk_software.SetVulnerabilityStatusRequest() # SetVulnerabilityStatusRequest | 

    try:
        # Set status of a vulnerability
        api_response = api_instance.set_vulnerability_status(vulnerability_id, set_vulnerability_status_request)
        print("The response of DataVulnerabilitiesApi->set_vulnerability_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataVulnerabilitiesApi->set_vulnerability_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerability_id** | **str**|  | 
 **set_vulnerability_status_request** | [**SetVulnerabilityStatusRequest**](SetVulnerabilityStatusRequest.md)|  | 

### Return type

[**VulnerabilityStatus**](VulnerabilityStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_vulnerability_status_comment**
> VulnerabilityStatusComment update_vulnerability_status_comment(vulnerability_id, status_id, comment_id, update_comment_body)

Set vulnerability status

Set a vulnerability status of a vulnerability.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.update_comment_body import UpdateCommentBody
from ibm_gdsc_sdk_software.models.vulnerability_status_comment import VulnerabilityStatusComment
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
    api_instance = ibm_gdsc_sdk_software.DataVulnerabilitiesApi(api_client)
    vulnerability_id = '384cd426-b187-438a-affc-e12b323f5890' # str | 
    status_id = 'status_id_example' # str | 
    comment_id = 'comment_id_example' # str | 
    update_comment_body = ibm_gdsc_sdk_software.UpdateCommentBody() # UpdateCommentBody | 

    try:
        # Set vulnerability status
        api_response = api_instance.update_vulnerability_status_comment(vulnerability_id, status_id, comment_id, update_comment_body)
        print("The response of DataVulnerabilitiesApi->update_vulnerability_status_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataVulnerabilitiesApi->update_vulnerability_status_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerability_id** | **str**|  | 
 **status_id** | **str**|  | 
 **comment_id** | **str**|  | 
 **update_comment_body** | [**UpdateCommentBody**](UpdateCommentBody.md)|  | 

### Return type

[**VulnerabilityStatusComment**](VulnerabilityStatusComment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

