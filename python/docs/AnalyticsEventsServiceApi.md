# ibm_gdsc_sdk_software.AnalyticsEventsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analytics_events_service_delete_cache_key**](AnalyticsEventsServiceApi.md#analytics_events_service_delete_cache_key) | **DELETE** /api/v3/eventscache/{cache_key} | Summary: Delete cache key Description: Return delete key result message.
[**analytics_events_service_post_qs_advisor_risk**](AnalyticsEventsServiceApi.md#analytics_events_service_post_qs_advisor_risk) | **POST** /api/v3/risk/qs_advisor | Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status


# **analytics_events_service_delete_cache_key**
> Analyticseventsv3DeleteCacheKeyResponse analytics_events_service_delete_cache_key(cache_key, analyticseventsv3_delete_cache_key_request)

Summary: Delete cache key Description: Return delete key result message.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.analyticseventsv3_delete_cache_key_request import Analyticseventsv3DeleteCacheKeyRequest
from ibm_gdsc_sdk_software.models.analyticseventsv3_delete_cache_key_response import Analyticseventsv3DeleteCacheKeyResponse
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
    api_instance = ibm_gdsc_sdk_software.AnalyticsEventsServiceApi(api_client)
    cache_key = 'cache_key_example' # str | The cache key to delete.
    analyticseventsv3_delete_cache_key_request = ibm_gdsc_sdk_software.Analyticseventsv3DeleteCacheKeyRequest() # Analyticseventsv3DeleteCacheKeyRequest | 

    try:
        # Summary: Delete cache key Description: Return delete key result message.
        api_response = api_instance.analytics_events_service_delete_cache_key(cache_key, analyticseventsv3_delete_cache_key_request)
        print("The response of AnalyticsEventsServiceApi->analytics_events_service_delete_cache_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AnalyticsEventsServiceApi->analytics_events_service_delete_cache_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cache_key** | **str**| The cache key to delete. | 
 **analyticseventsv3_delete_cache_key_request** | [**Analyticseventsv3DeleteCacheKeyRequest**](Analyticseventsv3DeleteCacheKeyRequest.md)|  | 

### Return type

[**Analyticseventsv3DeleteCacheKeyResponse**](Analyticseventsv3DeleteCacheKeyResponse.md)

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

# **analytics_events_service_post_qs_advisor_risk**
> Analyticseventsv3PostQSAdvisorRiskResponse analytics_events_service_post_qs_advisor_risk(analyticseventsv3_post_qs_advisor_risk_request)

Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.analyticseventsv3_post_qs_advisor_risk_request import Analyticseventsv3PostQSAdvisorRiskRequest
from ibm_gdsc_sdk_software.models.analyticseventsv3_post_qs_advisor_risk_response import Analyticseventsv3PostQSAdvisorRiskResponse
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
    api_instance = ibm_gdsc_sdk_software.AnalyticsEventsServiceApi(api_client)
    analyticseventsv3_post_qs_advisor_risk_request = ibm_gdsc_sdk_software.Analyticseventsv3PostQSAdvisorRiskRequest() # Analyticseventsv3PostQSAdvisorRiskRequest | 

    try:
        # Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status
        api_response = api_instance.analytics_events_service_post_qs_advisor_risk(analyticseventsv3_post_qs_advisor_risk_request)
        print("The response of AnalyticsEventsServiceApi->analytics_events_service_post_qs_advisor_risk:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AnalyticsEventsServiceApi->analytics_events_service_post_qs_advisor_risk: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analyticseventsv3_post_qs_advisor_risk_request** | [**Analyticseventsv3PostQSAdvisorRiskRequest**](Analyticseventsv3PostQSAdvisorRiskRequest.md)|  | 

### Return type

[**Analyticseventsv3PostQSAdvisorRiskResponse**](Analyticseventsv3PostQSAdvisorRiskResponse.md)

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

