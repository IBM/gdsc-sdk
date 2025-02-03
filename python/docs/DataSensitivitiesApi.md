# ibm_gdsc_sdk_software.DataSensitivitiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_sensitivities_summary**](DataSensitivitiesApi.md#get_sensitivities_summary) | **GET** /api/v1/dspm/sensitivities/summary | Get the summary of sensitivities
[**get_sensitivity**](DataSensitivitiesApi.md#get_sensitivity) | **GET** /api/v1/dspm/sensitivities/{sensitivityId} | Get sensitivity details by providing its ID
[**list_sensitivities**](DataSensitivitiesApi.md#list_sensitivities) | **GET** /api/v1/dspm/sensitivities | List sensitivities


# **get_sensitivities_summary**
> SensitivitiesSummary get_sensitivities_summary(filter=filter)

Get the summary of sensitivities

Get a summarised information about all sensitivities classified by Guardium Insights SaaS DSPM.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.list_sensitivities_filter_parameter import ListSensitivitiesFilterParameter
from ibm_gdsc_sdk_software.models.sensitivities_summary import SensitivitiesSummary
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
    api_instance = ibm_gdsc_sdk_software.DataSensitivitiesApi(api_client)
    filter = ibm_gdsc_sdk_software.ListSensitivitiesFilterParameter() # ListSensitivitiesFilterParameter |  (optional)

    try:
        # Get the summary of sensitivities
        api_response = api_instance.get_sensitivities_summary(filter=filter)
        print("The response of DataSensitivitiesApi->get_sensitivities_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataSensitivitiesApi->get_sensitivities_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListSensitivitiesFilterParameter**](.md)|  | [optional] 

### Return type

[**SensitivitiesSummary**](SensitivitiesSummary.md)

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

# **get_sensitivity**
> Sensitivity get_sensitivity(sensitivity_id)

Get sensitivity details by providing its ID

Get details of a sensitivity by providing its ID.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.sensitivity import Sensitivity
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
    api_instance = ibm_gdsc_sdk_software.DataSensitivitiesApi(api_client)
    sensitivity_id = 'sensitivity_id_example' # str | 

    try:
        # Get sensitivity details by providing its ID
        api_response = api_instance.get_sensitivity(sensitivity_id)
        print("The response of DataSensitivitiesApi->get_sensitivity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataSensitivitiesApi->get_sensitivity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensitivity_id** | **str**|  | 

### Return type

[**Sensitivity**](Sensitivity.md)

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

# **list_sensitivities**
> ListSensitivities200Response list_sensitivities(filter=filter, sort=sort, page_size=page_size, next_token=next_token)

List sensitivities

Get a list of all the sensitivities based on an applied filter.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.last_seen_sort_schema import LastSeenSortSchema
from ibm_gdsc_sdk_software.models.list_sensitivities200_response import ListSensitivities200Response
from ibm_gdsc_sdk_software.models.list_sensitivities_filter_parameter import ListSensitivitiesFilterParameter
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
    api_instance = ibm_gdsc_sdk_software.DataSensitivitiesApi(api_client)
    filter = ibm_gdsc_sdk_software.ListSensitivitiesFilterParameter() # ListSensitivitiesFilterParameter |  (optional)
    sort = ibm_gdsc_sdk_software.LastSeenSortSchema() # LastSeenSortSchema |  (optional)
    page_size = 3.4 # float |  (optional)
    next_token = 'next_token_example' # str |  (optional)

    try:
        # List sensitivities
        api_response = api_instance.list_sensitivities(filter=filter, sort=sort, page_size=page_size, next_token=next_token)
        print("The response of DataSensitivitiesApi->list_sensitivities:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataSensitivitiesApi->list_sensitivities: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListSensitivitiesFilterParameter**](.md)|  | [optional] 
 **sort** | [**LastSeenSortSchema**](.md)|  | [optional] 
 **page_size** | **float**|  | [optional] 
 **next_token** | **str**|  | [optional] 

### Return type

[**ListSensitivities200Response**](ListSensitivities200Response.md)

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

