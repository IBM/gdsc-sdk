# ibm_gdsc_sdk_saas.RiskAnalyticsDataProcessorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**risk_analytics_data_processor_get_risk_context**](RiskAnalyticsDataProcessorApi.md#risk_analytics_data_processor_get_risk_context) | **GET** /api/v3/risk_events/{risk_id}/context | Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
[**risk_analytics_data_processor_get_risk_predefined_questions**](RiskAnalyticsDataProcessorApi.md#risk_analytics_data_processor_get_risk_predefined_questions) | **GET** /api/v3/risk_events/{risk_id}/questions | Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.


# **risk_analytics_data_processor_get_risk_context**
> Riskanalyticsdataprocessorv3GetRiskContextResponse risk_analytics_data_processor_get_risk_context(risk_id, timezone=timezone)

Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.riskanalyticsdataprocessorv3_get_risk_context_response import Riskanalyticsdataprocessorv3GetRiskContextResponse
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

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.RiskAnalyticsDataProcessorApi(api_client)
    risk_id = 56 # int | Risk id.
    timezone = 'timezone_example' # str | Timezone in IANA format. (optional)

    try:
        # Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
        api_response = api_instance.risk_analytics_data_processor_get_risk_context(risk_id, timezone=timezone)
        print("The response of RiskAnalyticsDataProcessorApi->risk_analytics_data_processor_get_risk_context:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsDataProcessorApi->risk_analytics_data_processor_get_risk_context: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_id** | **int**| Risk id. | 
 **timezone** | **str**| Timezone in IANA format. | [optional] 

### Return type

[**Riskanalyticsdataprocessorv3GetRiskContextResponse**](Riskanalyticsdataprocessorv3GetRiskContextResponse.md)

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

# **risk_analytics_data_processor_get_risk_predefined_questions**
> Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse risk_analytics_data_processor_get_risk_predefined_questions(risk_id)

Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.riskanalyticsdataprocessorv3_get_risk_predefined_questions_response import Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse
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

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.RiskAnalyticsDataProcessorApi(api_client)
    risk_id = 56 # int | Risk id.

    try:
        # Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.
        api_response = api_instance.risk_analytics_data_processor_get_risk_predefined_questions(risk_id)
        print("The response of RiskAnalyticsDataProcessorApi->risk_analytics_data_processor_get_risk_predefined_questions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsDataProcessorApi->risk_analytics_data_processor_get_risk_predefined_questions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_id** | **int**| Risk id. | 

### Return type

[**Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse**](Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse.md)

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

