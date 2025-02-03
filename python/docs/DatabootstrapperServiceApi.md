# ibm_gdsc_sdk_software.DatabootstrapperServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**databootstrapper_service_load_data**](DatabootstrapperServiceApi.md#databootstrapper_service_load_data) | **POST** /api/v3/databootstrapper/data | Summary: Load data Description: Load data for a tenant.


# **databootstrapper_service_load_data**
> Databootstrapperv3LoadDataResponse databootstrapper_service_load_data(databootstrapperv3_load_data_request)

Summary: Load data Description: Load data for a tenant.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.databootstrapperv3_load_data_request import Databootstrapperv3LoadDataRequest
from ibm_gdsc_sdk_software.models.databootstrapperv3_load_data_response import Databootstrapperv3LoadDataResponse
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
    api_instance = ibm_gdsc_sdk_software.DatabootstrapperServiceApi(api_client)
    databootstrapperv3_load_data_request = ibm_gdsc_sdk_software.Databootstrapperv3LoadDataRequest() # Databootstrapperv3LoadDataRequest | 

    try:
        # Summary: Load data Description: Load data for a tenant.
        api_response = api_instance.databootstrapper_service_load_data(databootstrapperv3_load_data_request)
        print("The response of DatabootstrapperServiceApi->databootstrapper_service_load_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatabootstrapperServiceApi->databootstrapper_service_load_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **databootstrapperv3_load_data_request** | [**Databootstrapperv3LoadDataRequest**](Databootstrapperv3LoadDataRequest.md)|  | 

### Return type

[**Databootstrapperv3LoadDataResponse**](Databootstrapperv3LoadDataResponse.md)

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

