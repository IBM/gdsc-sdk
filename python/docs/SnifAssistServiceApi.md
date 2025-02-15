# ibm_gdsc_sdk_software.SnifAssistServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**snif_assist_service_test_regex**](SnifAssistServiceApi.md#snif_assist_service_test_regex) | **POST** /api/v3/snif/test_regex | Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.


# **snif_assist_service_test_regex**
> Snifassistv3StatusResponseBase snif_assist_service_test_regex(snifassistv3_test_regex_request)

Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.snifassistv3_status_response_base import Snifassistv3StatusResponseBase
from ibm_gdsc_sdk_software.models.snifassistv3_test_regex_request import Snifassistv3TestRegexRequest
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
    api_instance = ibm_gdsc_sdk_software.SnifAssistServiceApi(api_client)
    snifassistv3_test_regex_request = ibm_gdsc_sdk_software.Snifassistv3TestRegexRequest() # Snifassistv3TestRegexRequest | 

    try:
        # Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.
        api_response = api_instance.snif_assist_service_test_regex(snifassistv3_test_regex_request)
        print("The response of SnifAssistServiceApi->snif_assist_service_test_regex:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SnifAssistServiceApi->snif_assist_service_test_regex: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snifassistv3_test_regex_request** | [**Snifassistv3TestRegexRequest**](Snifassistv3TestRegexRequest.md)|  | 

### Return type

[**Snifassistv3StatusResponseBase**](Snifassistv3StatusResponseBase.md)

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

