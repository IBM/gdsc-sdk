# ibm_gdsc_sdk_software.RiskAnalyticsMlClassificationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**risk_analytics_ml_classification_reset_model_to_defaults**](RiskAnalyticsMlClassificationApi.md#risk_analytics_ml_classification_reset_model_to_defaults) | **POST** /api/v3/classification/ml/models/reset | Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.


# **risk_analytics_ml_classification_reset_model_to_defaults**
> Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse risk_analytics_ml_classification_reset_model_to_defaults()

Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.riskanalyticsmlclassificationv3_reset_model_to_defaults_response import Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse
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
    api_instance = ibm_gdsc_sdk_software.RiskAnalyticsMlClassificationApi(api_client)

    try:
        # Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.
        api_response = api_instance.risk_analytics_ml_classification_reset_model_to_defaults()
        print("The response of RiskAnalyticsMlClassificationApi->risk_analytics_ml_classification_reset_model_to_defaults:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RiskAnalyticsMlClassificationApi->risk_analytics_ml_classification_reset_model_to_defaults: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse**](Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse.md)

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

