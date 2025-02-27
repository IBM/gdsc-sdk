# ibm_gdsc_sdk_saas.RiskAnalyticsEngineApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**risk_analytics_engine_get_lead_generator_config**](RiskAnalyticsEngineApi.md#risk_analytics_engine_get_lead_generator_config) | **GET** /api/v3/risk/lead_generator | Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
[**risk_analytics_engine_update_lead_generator_config**](RiskAnalyticsEngineApi.md#risk_analytics_engine_update_lead_generator_config) | **PUT** /api/v3/risk/lead_generator | Summary: Update lead generator config Description: Update the configuration of a leads generator.


# **risk_analytics_engine_get_lead_generator_config**
> Riskanalyticsenginev3GetLeadGeneratorConfigResponse risk_analytics_engine_get_lead_generator_config()

Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_get_lead_generator_config_response import Riskanalyticsenginev3GetLeadGeneratorConfigResponse
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
    api_instance = ibm_gdsc_sdk_saas.RiskAnalyticsEngineApi(api_client)

    try:
        # Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
        api_response = api_instance.risk_analytics_engine_get_lead_generator_config()
        print("The response of RiskAnalyticsEngineApi->risk_analytics_engine_get_lead_generator_config:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsEngineApi->risk_analytics_engine_get_lead_generator_config: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Riskanalyticsenginev3GetLeadGeneratorConfigResponse**](Riskanalyticsenginev3GetLeadGeneratorConfigResponse.md)

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

# **risk_analytics_engine_update_lead_generator_config**
> Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse risk_analytics_engine_update_lead_generator_config(riskanalyticsenginev3_update_lead_generator_config_request)

Summary: Update lead generator config Description: Update the configuration of a leads generator.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_update_lead_generator_config_request import Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_update_lead_generator_config_response import Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse
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
    api_instance = ibm_gdsc_sdk_saas.RiskAnalyticsEngineApi(api_client)
    riskanalyticsenginev3_update_lead_generator_config_request = ibm_gdsc_sdk_saas.Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest() # Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest | 

    try:
        # Summary: Update lead generator config Description: Update the configuration of a leads generator.
        api_response = api_instance.risk_analytics_engine_update_lead_generator_config(riskanalyticsenginev3_update_lead_generator_config_request)
        print("The response of RiskAnalyticsEngineApi->risk_analytics_engine_update_lead_generator_config:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsEngineApi->risk_analytics_engine_update_lead_generator_config: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticsenginev3_update_lead_generator_config_request** | [**Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest**](Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest.md)|  | 

### Return type

[**Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse**](Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse.md)

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

