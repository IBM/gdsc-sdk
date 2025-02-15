# ibm_gdsc_sdk_software.ThirdPartyVendorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_linked_vendor**](ThirdPartyVendorsApi.md#get_linked_vendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/cloudAccounts | Get additional details of a specific third party vendor
[**get_single_linked_vendor**](ThirdPartyVendorsApi.md#get_single_linked_vendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId} | Get the third party vendors list
[**list_linked_vendor_data_stores**](ThirdPartyVendorsApi.md#list_linked_vendor_data_stores) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/dataStores | Get the data stores associated with a third party vendor
[**list_linked_vendors**](ThirdPartyVendorsApi.md#list_linked_vendors) | **GET** /api/v1/dspm/linkedVendors | Get the summary of a third party vendor
[**list_trusted_assets**](ThirdPartyVendorsApi.md#list_trusted_assets) | **GET** /api/v1/dspm/linkedVendors/trustedAssets | Get a list of all the actual trusted assets


# **get_linked_vendor**
> List[VendorSummary] get_linked_vendor(vendor_id)

Get additional details of a specific third party vendor

Get additional details of a specific third party vendor, such as, customer account details, sensitivities summary, and so on.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.vendor_summary import VendorSummary
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
    api_instance = ibm_gdsc_sdk_software.ThirdPartyVendorsApi(api_client)
    vendor_id = '123456789101' # str | The third party vendor's account ID

    try:
        # Get additional details of a specific third party vendor
        api_response = api_instance.get_linked_vendor(vendor_id)
        print("The response of ThirdPartyVendorsApi->get_linked_vendor:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ThirdPartyVendorsApi->get_linked_vendor: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendor_id** | **str**| The third party vendor&#39;s account ID | 

### Return type

[**List[VendorSummary]**](VendorSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**503** | Service Unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_single_linked_vendor**
> LinkedVendor get_single_linked_vendor(vendor_id)

Get the third party vendors list

Get details about a third party vendor.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.linked_vendor import LinkedVendor
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
    api_instance = ibm_gdsc_sdk_software.ThirdPartyVendorsApi(api_client)
    vendor_id = '123456789101' # str | vendor id

    try:
        # Get the third party vendors list
        api_response = api_instance.get_single_linked_vendor(vendor_id)
        print("The response of ThirdPartyVendorsApi->get_single_linked_vendor:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ThirdPartyVendorsApi->get_single_linked_vendor: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendor_id** | **str**| vendor id | 

### Return type

[**LinkedVendor**](LinkedVendor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_linked_vendor_data_stores**
> ListLinkedVendorDataStores200Response list_linked_vendor_data_stores(vendor_id, filter=filter, sort=sort, page_size=page_size, next_token=next_token)

Get the data stores associated with a third party vendor

Get a list of all the data stores that a third party vendor can access. Find out whether the data stores have sensitivities and which role can access the data stores.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.list_linked_vendor_data_stores200_response import ListLinkedVendorDataStores200Response
from ibm_gdsc_sdk_software.models.list_linked_vendor_data_stores_sort_parameter import ListLinkedVendorDataStoresSortParameter
from ibm_gdsc_sdk_software.models.list_vendor_data_stores_filter_parameter import ListVendorDataStoresFilterParameter
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
    api_instance = ibm_gdsc_sdk_software.ThirdPartyVendorsApi(api_client)
    vendor_id = '123456789101' # str | The third party vendor's account ID
    filter = ibm_gdsc_sdk_software.ListVendorDataStoresFilterParameter() # ListVendorDataStoresFilterParameter |  (optional)
    sort = ibm_gdsc_sdk_software.ListLinkedVendorDataStoresSortParameter() # ListLinkedVendorDataStoresSortParameter |  (optional)
    page_size = 3.4 # float |  (optional)
    next_token = 'next_token_example' # str |  (optional)

    try:
        # Get the data stores associated with a third party vendor
        api_response = api_instance.list_linked_vendor_data_stores(vendor_id, filter=filter, sort=sort, page_size=page_size, next_token=next_token)
        print("The response of ThirdPartyVendorsApi->list_linked_vendor_data_stores:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ThirdPartyVendorsApi->list_linked_vendor_data_stores: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendor_id** | **str**| The third party vendor&#39;s account ID | 
 **filter** | [**ListVendorDataStoresFilterParameter**](.md)|  | [optional] 
 **sort** | [**ListLinkedVendorDataStoresSortParameter**](.md)|  | [optional] 
 **page_size** | **float**|  | [optional] 
 **next_token** | **str**|  | [optional] 

### Return type

[**ListLinkedVendorDataStores200Response**](ListLinkedVendorDataStores200Response.md)

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

# **list_linked_vendors**
> List[LinkedVendor] list_linked_vendors()

Get the summary of a third party vendor

Get a list of all third party vendors associated to your cloud environments (relevant for the cloud environments connected to Guardium DSPM only).

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.linked_vendor import LinkedVendor
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
    api_instance = ibm_gdsc_sdk_software.ThirdPartyVendorsApi(api_client)

    try:
        # Get the summary of a third party vendor
        api_response = api_instance.list_linked_vendors()
        print("The response of ThirdPartyVendorsApi->list_linked_vendors:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ThirdPartyVendorsApi->list_linked_vendors: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[LinkedVendor]**](LinkedVendor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_trusted_assets**
> List[Trustee] list_trusted_assets(filter=filter)

Get a list of all the actual trusted assets

Get a list of roles, buckets or service principles, and their entitled permissions associated to your cloud environments connected to Guardium DSPM.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.list_trustees_filter_parameter import ListTrusteesFilterParameter
from ibm_gdsc_sdk_software.models.trustee import Trustee
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
    api_instance = ibm_gdsc_sdk_software.ThirdPartyVendorsApi(api_client)
    filter = ibm_gdsc_sdk_software.ListTrusteesFilterParameter() # ListTrusteesFilterParameter |  (optional)

    try:
        # Get a list of all the actual trusted assets
        api_response = api_instance.list_trusted_assets(filter=filter)
        print("The response of ThirdPartyVendorsApi->list_trusted_assets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ThirdPartyVendorsApi->list_trusted_assets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListTrusteesFilterParameter**](.md)|  | [optional] 

### Return type

[**List[Trustee]**](Trustee.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

