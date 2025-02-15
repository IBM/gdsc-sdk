# ibm_gdsc_sdk_software.RiskAnalyticsControllerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**risk_analytics_controller_enable_disable_risk_event_feedback**](RiskAnalyticsControllerApi.md#risk_analytics_controller_enable_disable_risk_event_feedback) | **PUT** /api/v3/risk_feedback/status | Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
[**risk_analytics_controller_enable_disable_risk_event_process**](RiskAnalyticsControllerApi.md#risk_analytics_controller_enable_disable_risk_event_process) | **PUT** /api/v3/risk_process/status | Summary: Enable disable risk event process Description: Enable or disable the risk event process.
[**risk_analytics_controller_get_all_classifications_list**](RiskAnalyticsControllerApi.md#risk_analytics_controller_get_all_classifications_list) | **GET** /api/v3/risk_events/classifications | Summary: Get all classifications Description: Get all possible classifications for a risk event.
[**risk_analytics_controller_get_risk_event_classifications_list**](RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_classifications_list) | **GET** /api/v3/risk_events/feedback/{risk_id} | Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.
[**risk_analytics_controller_get_risk_event_data_for_summarization**](RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_data_for_summarization) | **GET** /api/v3/risk_events/summarization/data/{risk_id} | Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
[**risk_analytics_controller_get_risk_event_details**](RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_details) | **GET** /api/v3/risk_events/details/{risk_id} | Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
[**risk_analytics_controller_get_risk_event_process_status**](RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_process_status) | **GET** /api/v3/risk_process/status | Summary: Get risk event process status Description: Get the risk event process status.
[**risk_analytics_controller_get_risk_event_row**](RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_row) | **GET** /api/v3/risk_events | Summary: Get risk event row Description: Return a list of risk events.
[**risk_analytics_controller_get_risk_event_vulnerability_assessment_details**](RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_vulnerability_assessment_details) | **PUT** /api/v3/risk_events/va/{risk_id} | Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
[**risk_analytics_controller_get_risk_feedback**](RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_feedback) | **GET** /api/v3/risk_events/feedback | Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
[**risk_analytics_controller_get_risk_observation_details**](RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_observation_details) | **GET** /api/v3/risk_events/observations | Summary: Get risk observation details Description: Return details of a single risk observation.
[**risk_analytics_controller_get_user_ui_settings**](RiskAnalyticsControllerApi.md#risk_analytics_controller_get_user_ui_settings) | **GET** /api/v3/risk_events/user_ui_settings | Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
[**risk_analytics_controller_risk_event_tuning**](RiskAnalyticsControllerApi.md#risk_analytics_controller_risk_event_tuning) | **PUT** /api/v3/risk_events/tuning | Summary: Risk event tuning Description: Perform tuning risk event actions.
[**risk_analytics_controller_set_risk_event_status**](RiskAnalyticsControllerApi.md#risk_analytics_controller_set_risk_event_status) | **PUT** /api/v3/risk_events/status | Summary: Set risk event status Description: Update the risk status and justification.
[**risk_analytics_controller_set_user_ui_settings**](RiskAnalyticsControllerApi.md#risk_analytics_controller_set_user_ui_settings) | **PUT** /api/v3/risk_events/user_ui_settings | Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium.
[**risk_analytics_controller_update_risk_feedback**](RiskAnalyticsControllerApi.md#risk_analytics_controller_update_risk_feedback) | **PUT** /api/v3/risk_events/feedback | Summary: Update risk feedback Description: Provide feedback for one or more risk events


# **risk_analytics_controller_enable_disable_risk_event_feedback**
> Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse risk_analytics_controller_enable_disable_risk_event_feedback(riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request)

Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request import Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_enable_disable_risk_event_feedback_response import Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request = ibm_gdsc_sdk_software.Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest() # Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest | 

    try:
        # Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
        api_response = api_instance.risk_analytics_controller_enable_disable_risk_event_feedback(riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_enable_disable_risk_event_feedback:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_enable_disable_risk_event_feedback: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request** | [**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest**](Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse**](Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse.md)

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

# **risk_analytics_controller_enable_disable_risk_event_process**
> Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse risk_analytics_controller_enable_disable_risk_event_process(riskanalyticscontrollerv3_enable_disable_risk_event_process_request)

Summary: Enable disable risk event process Description: Enable or disable the risk event process.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_enable_disable_risk_event_process_request import Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_enable_disable_risk_event_process_response import Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    riskanalyticscontrollerv3_enable_disable_risk_event_process_request = ibm_gdsc_sdk_software.Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest() # Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest | 

    try:
        # Summary: Enable disable risk event process Description: Enable or disable the risk event process.
        api_response = api_instance.risk_analytics_controller_enable_disable_risk_event_process(riskanalyticscontrollerv3_enable_disable_risk_event_process_request)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_enable_disable_risk_event_process:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_enable_disable_risk_event_process: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3_enable_disable_risk_event_process_request** | [**Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest**](Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse**](Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse.md)

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

# **risk_analytics_controller_get_all_classifications_list**
> Riskanalyticscontrollerv3GetAllClassificationsListResponse risk_analytics_controller_get_all_classifications_list()

Summary: Get all classifications Description: Get all possible classifications for a risk event.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_all_classifications_list_response import Riskanalyticscontrollerv3GetAllClassificationsListResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)

    try:
        # Summary: Get all classifications Description: Get all possible classifications for a risk event.
        api_response = api_instance.risk_analytics_controller_get_all_classifications_list()
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_get_all_classifications_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_get_all_classifications_list: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetAllClassificationsListResponse**](Riskanalyticscontrollerv3GetAllClassificationsListResponse.md)

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

# **risk_analytics_controller_get_risk_event_classifications_list**
> Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse risk_analytics_controller_get_risk_event_classifications_list(risk_id)

Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_risk_event_classifications_list_response import Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    risk_id = 56 # int | Risk id

    try:
        # Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.
        api_response = api_instance.risk_analytics_controller_get_risk_event_classifications_list(risk_id)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_classifications_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_classifications_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_id** | **int**| Risk id | 

### Return type

[**Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse**](Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse.md)

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

# **risk_analytics_controller_get_risk_event_data_for_summarization**
> Riskanalyticscontrollerv3RiskEventSummarizationDataResponse risk_analytics_controller_get_risk_event_data_for_summarization(risk_id, include_indicators=include_indicators, num_findings_limit=num_findings_limit)

Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_risk_event_summarization_data_response import Riskanalyticscontrollerv3RiskEventSummarizationDataResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    risk_id = 56 # int | Risk ID
    include_indicators = True # bool | Indicates whether to include indicators in the response or not. (optional)
    num_findings_limit = 56 # int | Max number of hours to get for the risk. (optional)

    try:
        # Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
        api_response = api_instance.risk_analytics_controller_get_risk_event_data_for_summarization(risk_id, include_indicators=include_indicators, num_findings_limit=num_findings_limit)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_data_for_summarization:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_data_for_summarization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_id** | **int**| Risk ID | 
 **include_indicators** | **bool**| Indicates whether to include indicators in the response or not. | [optional] 
 **num_findings_limit** | **int**| Max number of hours to get for the risk. | [optional] 

### Return type

[**Riskanalyticscontrollerv3RiskEventSummarizationDataResponse**](Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.md)

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

# **risk_analytics_controller_get_risk_event_details**
> Riskanalyticscontrollerv3GetRiskEventDetailsResponse risk_analytics_controller_get_risk_event_details(risk_id)

Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_risk_event_details_response import Riskanalyticscontrollerv3GetRiskEventDetailsResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    risk_id = 56 # int | Risk id.

    try:
        # Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
        api_response = api_instance.risk_analytics_controller_get_risk_event_details(risk_id)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_details:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_details: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_id** | **int**| Risk id. | 

### Return type

[**Riskanalyticscontrollerv3GetRiskEventDetailsResponse**](Riskanalyticscontrollerv3GetRiskEventDetailsResponse.md)

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

# **risk_analytics_controller_get_risk_event_process_status**
> Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse risk_analytics_controller_get_risk_event_process_status()

Summary: Get risk event process status Description: Get the risk event process status.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_risk_event_process_status_response import Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)

    try:
        # Summary: Get risk event process status Description: Get the risk event process status.
        api_response = api_instance.risk_analytics_controller_get_risk_event_process_status()
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_process_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_process_status: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse**](Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.md)

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

# **risk_analytics_controller_get_risk_event_row**
> Riskanalyticscontrollerv3GetRiskEventRowResponse risk_analytics_controller_get_risk_event_row(status=status, date_from=date_from, date_to=date_to, pivot_type=pivot_type, pivot_id=pivot_id, pivot_db_user=pivot_db_user, pivot_database=pivot_database, pivot_server_ip=pivot_server_ip, pivot_os_user=pivot_os_user, pivot_database_source_field=pivot_database_source_field)

Summary: Get risk event row Description: Return a list of risk events.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_risk_event_row_response import Riskanalyticscontrollerv3GetRiskEventRowResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    status = 'UNDEFINED_STATUS' # str | Status to retrieve only the status events, blank to retrieve all. (optional) (default to 'UNDEFINED_STATUS')
    date_from = '2013-10-20T19:20:30+01:00' # datetime | The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ. (optional)
    date_to = '2013-10-20T19:20:30+01:00' # datetime | The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ. (optional)
    pivot_type = 'UNDEFINED_PIVOT_TYPE' # str | Pivot type - enum. (optional) (default to 'UNDEFINED_PIVOT_TYPE')
    pivot_id = 'pivot_id_example' # str | Pivot id -  all pivot fields separated by semicolon. (optional)
    pivot_db_user = 'pivot_db_user_example' # str | Optional db_user - if pivot is db user. (optional)
    pivot_database = 'pivot_database_example' # str | Optional database - if pivot is db user / database. (optional)
    pivot_server_ip = 'pivot_server_ip_example' # str | Optional server_ip - if pivot is db user / database. (optional)
    pivot_os_user = 'pivot_os_user_example' # str | Optional os_user - if pivot is os user. (optional)
    pivot_database_source_field = 'UNDEFINED' # str | Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database. (optional) (default to 'UNDEFINED')

    try:
        # Summary: Get risk event row Description: Return a list of risk events.
        api_response = api_instance.risk_analytics_controller_get_risk_event_row(status=status, date_from=date_from, date_to=date_to, pivot_type=pivot_type, pivot_id=pivot_id, pivot_db_user=pivot_db_user, pivot_database=pivot_database, pivot_server_ip=pivot_server_ip, pivot_os_user=pivot_os_user, pivot_database_source_field=pivot_database_source_field)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_row:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_row: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **str**| Status to retrieve only the status events, blank to retrieve all. | [optional] [default to &#39;UNDEFINED_STATUS&#39;]
 **date_from** | **datetime**| The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ. | [optional] 
 **date_to** | **datetime**| The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ. | [optional] 
 **pivot_type** | **str**| Pivot type - enum. | [optional] [default to &#39;UNDEFINED_PIVOT_TYPE&#39;]
 **pivot_id** | **str**| Pivot id -  all pivot fields separated by semicolon. | [optional] 
 **pivot_db_user** | **str**| Optional db_user - if pivot is db user. | [optional] 
 **pivot_database** | **str**| Optional database - if pivot is db user / database. | [optional] 
 **pivot_server_ip** | **str**| Optional server_ip - if pivot is db user / database. | [optional] 
 **pivot_os_user** | **str**| Optional os_user - if pivot is os user. | [optional] 
 **pivot_database_source_field** | **str**| Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database. | [optional] [default to &#39;UNDEFINED&#39;]

### Return type

[**Riskanalyticscontrollerv3GetRiskEventRowResponse**](Riskanalyticscontrollerv3GetRiskEventRowResponse.md)

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

# **risk_analytics_controller_get_risk_event_vulnerability_assessment_details**
> Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse risk_analytics_controller_get_risk_event_vulnerability_assessment_details(risk_id)

Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_risk_event_vulnerability_assessment_details_response import Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    risk_id = 56 # int | Risk ID

    try:
        # Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
        api_response = api_instance.risk_analytics_controller_get_risk_event_vulnerability_assessment_details(risk_id)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_vulnerability_assessment_details:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_event_vulnerability_assessment_details: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_id** | **int**| Risk ID | 

### Return type

[**Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse**](Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse.md)

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

# **risk_analytics_controller_get_risk_feedback**
> Riskanalyticscontrollerv3GetRiskFeedbackResponse risk_analytics_controller_get_risk_feedback()

Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_risk_feedback_response import Riskanalyticscontrollerv3GetRiskFeedbackResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)

    try:
        # Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
        api_response = api_instance.risk_analytics_controller_get_risk_feedback()
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_feedback:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_feedback: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetRiskFeedbackResponse**](Riskanalyticscontrollerv3GetRiskFeedbackResponse.md)

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

# **risk_analytics_controller_get_risk_observation_details**
> Riskanalyticscontrollerv3GetRiskObservationDetailsResponse risk_analytics_controller_get_risk_observation_details(lead_feature_id=lead_feature_id, observation_type=observation_type)

Summary: Get risk observation details Description: Return details of a single risk observation.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_risk_observation_details_response import Riskanalyticscontrollerv3GetRiskObservationDetailsResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    lead_feature_id = 56 # int | Lead feature id. (optional)
    observation_type = 'UNDEFINED_OBSERVATION_TYPE' # str | Observation type. (optional) (default to 'UNDEFINED_OBSERVATION_TYPE')

    try:
        # Summary: Get risk observation details Description: Return details of a single risk observation.
        api_response = api_instance.risk_analytics_controller_get_risk_observation_details(lead_feature_id=lead_feature_id, observation_type=observation_type)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_observation_details:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_get_risk_observation_details: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lead_feature_id** | **int**| Lead feature id. | [optional] 
 **observation_type** | **str**| Observation type. | [optional] [default to &#39;UNDEFINED_OBSERVATION_TYPE&#39;]

### Return type

[**Riskanalyticscontrollerv3GetRiskObservationDetailsResponse**](Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.md)

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

# **risk_analytics_controller_get_user_ui_settings**
> Riskanalyticscontrollerv3GetUserUISettingsResponse risk_analytics_controller_get_user_ui_settings()

Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_user_ui_settings_response import Riskanalyticscontrollerv3GetUserUISettingsResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)

    try:
        # Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
        api_response = api_instance.risk_analytics_controller_get_user_ui_settings()
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_get_user_ui_settings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_get_user_ui_settings: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetUserUISettingsResponse**](Riskanalyticscontrollerv3GetUserUISettingsResponse.md)

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

# **risk_analytics_controller_risk_event_tuning**
> Riskanalyticscontrollerv3RiskEventTuningResponse risk_analytics_controller_risk_event_tuning(riskanalyticscontrollerv3_risk_event_tuning_request)

Summary: Risk event tuning Description: Perform tuning risk event actions.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_risk_event_tuning_request import Riskanalyticscontrollerv3RiskEventTuningRequest
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_risk_event_tuning_response import Riskanalyticscontrollerv3RiskEventTuningResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    riskanalyticscontrollerv3_risk_event_tuning_request = ibm_gdsc_sdk_software.Riskanalyticscontrollerv3RiskEventTuningRequest() # Riskanalyticscontrollerv3RiskEventTuningRequest | 

    try:
        # Summary: Risk event tuning Description: Perform tuning risk event actions.
        api_response = api_instance.risk_analytics_controller_risk_event_tuning(riskanalyticscontrollerv3_risk_event_tuning_request)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_risk_event_tuning:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_risk_event_tuning: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3_risk_event_tuning_request** | [**Riskanalyticscontrollerv3RiskEventTuningRequest**](Riskanalyticscontrollerv3RiskEventTuningRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3RiskEventTuningResponse**](Riskanalyticscontrollerv3RiskEventTuningResponse.md)

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

# **risk_analytics_controller_set_risk_event_status**
> Riskanalyticscontrollerv3SetRiskEventStatusResponse risk_analytics_controller_set_risk_event_status(riskanalyticscontrollerv3_set_risk_event_status_request)

Summary: Set risk event status Description: Update the risk status and justification.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_set_risk_event_status_request import Riskanalyticscontrollerv3SetRiskEventStatusRequest
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_set_risk_event_status_response import Riskanalyticscontrollerv3SetRiskEventStatusResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    riskanalyticscontrollerv3_set_risk_event_status_request = ibm_gdsc_sdk_software.Riskanalyticscontrollerv3SetRiskEventStatusRequest() # Riskanalyticscontrollerv3SetRiskEventStatusRequest | 

    try:
        # Summary: Set risk event status Description: Update the risk status and justification.
        api_response = api_instance.risk_analytics_controller_set_risk_event_status(riskanalyticscontrollerv3_set_risk_event_status_request)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_set_risk_event_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_set_risk_event_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3_set_risk_event_status_request** | [**Riskanalyticscontrollerv3SetRiskEventStatusRequest**](Riskanalyticscontrollerv3SetRiskEventStatusRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3SetRiskEventStatusResponse**](Riskanalyticscontrollerv3SetRiskEventStatusResponse.md)

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

# **risk_analytics_controller_set_user_ui_settings**
> Riskanalyticscontrollerv3SetUserUISettingsResponse risk_analytics_controller_set_user_ui_settings(riskanalyticscontrollerv3_set_user_ui_settings_request)

Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_set_user_ui_settings_request import Riskanalyticscontrollerv3SetUserUISettingsRequest
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_set_user_ui_settings_response import Riskanalyticscontrollerv3SetUserUISettingsResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    riskanalyticscontrollerv3_set_user_ui_settings_request = ibm_gdsc_sdk_software.Riskanalyticscontrollerv3SetUserUISettingsRequest() # Riskanalyticscontrollerv3SetUserUISettingsRequest | 

    try:
        # Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium.
        api_response = api_instance.risk_analytics_controller_set_user_ui_settings(riskanalyticscontrollerv3_set_user_ui_settings_request)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_set_user_ui_settings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_set_user_ui_settings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3_set_user_ui_settings_request** | [**Riskanalyticscontrollerv3SetUserUISettingsRequest**](Riskanalyticscontrollerv3SetUserUISettingsRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3SetUserUISettingsResponse**](Riskanalyticscontrollerv3SetUserUISettingsResponse.md)

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

# **risk_analytics_controller_update_risk_feedback**
> Riskanalyticscontrollerv3UpdateRiskFeedbackResponse risk_analytics_controller_update_risk_feedback(riskanalyticscontrollerv3_update_risk_feedback_request)

Summary: Update risk feedback Description: Provide feedback for one or more risk events

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_update_risk_feedback_request import Riskanalyticscontrollerv3UpdateRiskFeedbackRequest
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_update_risk_feedback_response import Riskanalyticscontrollerv3UpdateRiskFeedbackResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsControllerApi(api_client)
    riskanalyticscontrollerv3_update_risk_feedback_request = ibm_gdsc_sdk_software.Riskanalyticscontrollerv3UpdateRiskFeedbackRequest() # Riskanalyticscontrollerv3UpdateRiskFeedbackRequest | 

    try:
        # Summary: Update risk feedback Description: Provide feedback for one or more risk events
        api_response = api_instance.risk_analytics_controller_update_risk_feedback(riskanalyticscontrollerv3_update_risk_feedback_request)
        print("The response of RiskAnalyticsControllerApi->risk_analytics_controller_update_risk_feedback:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsControllerApi->risk_analytics_controller_update_risk_feedback: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3_update_risk_feedback_request** | [**Riskanalyticscontrollerv3UpdateRiskFeedbackRequest**](Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3UpdateRiskFeedbackResponse**](Riskanalyticscontrollerv3UpdateRiskFeedbackResponse.md)

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

