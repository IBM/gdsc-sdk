# ibm_gdsc_sdk_saas.SnifAssistServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**snif_assist_service_get_snif_config**](SnifAssistServiceApi.md#snif_assist_service_get_snif_config) | **GET** /api/v3/snif/config | Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership.
[**snif_assist_service_get_snif_policy**](SnifAssistServiceApi.md#snif_assist_service_get_snif_policy) | **GET** /api/v3/snif/policy | Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership.
[**snif_assist_service_post_snif_feedback**](SnifAssistServiceApi.md#snif_assist_service_post_snif_feedback) | **POST** /api/v3/snif/feedback | Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service.
[**snif_assist_service_test_regex**](SnifAssistServiceApi.md#snif_assist_service_test_regex) | **POST** /api/v3/snif/test_regex | Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.


# **snif_assist_service_get_snif_config**
> Snifassistv3GetSnifConfigResponse snif_assist_service_get_snif_config(tenant_id=tenant_id, edge_id=edge_id, config_type=config_type, config_id=config_id, configuration_parameters_crc=configuration_parameters_crc)

Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.snifassistv3_get_snif_config_response import Snifassistv3GetSnifConfigResponse
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
    api_instance = ibm_gdsc_sdk_saas.SnifAssistServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | Provide tenant_id. (optional)
    edge_id = 'edge_id_example' # str | Provide edge_id. (optional)
    config_type = 'config_type_example' # str | Provide configuration type. (optional)
    config_id = 'config_id_example' # str | Specify config_id provided by configuration service. (optional)
    configuration_parameters_crc = 56 # int | Provide CRC value of configuration parameters that sniffer is currently using. (optional)

    try:
        # Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership.
        api_response = api_instance.snif_assist_service_get_snif_config(tenant_id=tenant_id, edge_id=edge_id, config_type=config_type, config_id=config_id, configuration_parameters_crc=configuration_parameters_crc)
        print("The response of SnifAssistServiceApi->snif_assist_service_get_snif_config:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SnifAssistServiceApi->snif_assist_service_get_snif_config: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| Provide tenant_id. | [optional] 
 **edge_id** | **str**| Provide edge_id. | [optional] 
 **config_type** | **str**| Provide configuration type. | [optional] 
 **config_id** | **str**| Specify config_id provided by configuration service. | [optional] 
 **configuration_parameters_crc** | **int**| Provide CRC value of configuration parameters that sniffer is currently using. | [optional] 

### Return type

[**Snifassistv3GetSnifConfigResponse**](Snifassistv3GetSnifConfigResponse.md)

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

# **snif_assist_service_get_snif_policy**
> Snifassistv3StatusResponseBase snif_assist_service_get_snif_policy(tenant_id=tenant_id, edge_id=edge_id, policy_crc=policy_crc)

Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.snifassistv3_status_response_base import Snifassistv3StatusResponseBase
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
    api_instance = ibm_gdsc_sdk_saas.SnifAssistServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | Specify tenant_id. (optional)
    edge_id = 'edge_id_example' # str | Specify edge_id if known. (optional)
    policy_crc = 56 # int | Provide CRC value of installed policy that sniffer is currently using. (optional)

    try:
        # Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership.
        api_response = api_instance.snif_assist_service_get_snif_policy(tenant_id=tenant_id, edge_id=edge_id, policy_crc=policy_crc)
        print("The response of SnifAssistServiceApi->snif_assist_service_get_snif_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SnifAssistServiceApi->snif_assist_service_get_snif_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| Specify tenant_id. | [optional] 
 **edge_id** | **str**| Specify edge_id if known. | [optional] 
 **policy_crc** | **int**| Provide CRC value of installed policy that sniffer is currently using. | [optional] 

### Return type

[**Snifassistv3StatusResponseBase**](Snifassistv3StatusResponseBase.md)

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

# **snif_assist_service_post_snif_feedback**
> Snifassistv3StatusResponseBase snif_assist_service_post_snif_feedback(snifassistv3_post_snif_feedback_request)

Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.snifassistv3_post_snif_feedback_request import Snifassistv3PostSnifFeedbackRequest
from ibm_gdsc_sdk_saas.models.snifassistv3_status_response_base import Snifassistv3StatusResponseBase
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
    api_instance = ibm_gdsc_sdk_saas.SnifAssistServiceApi(api_client)
    snifassistv3_post_snif_feedback_request = ibm_gdsc_sdk_saas.Snifassistv3PostSnifFeedbackRequest() # Snifassistv3PostSnifFeedbackRequest | 

    try:
        # Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service.
        api_response = api_instance.snif_assist_service_post_snif_feedback(snifassistv3_post_snif_feedback_request)
        print("The response of SnifAssistServiceApi->snif_assist_service_post_snif_feedback:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SnifAssistServiceApi->snif_assist_service_post_snif_feedback: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snifassistv3_post_snif_feedback_request** | [**Snifassistv3PostSnifFeedbackRequest**](Snifassistv3PostSnifFeedbackRequest.md)|  | 

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

# **snif_assist_service_test_regex**
> Snifassistv3StatusResponseBase snif_assist_service_test_regex(snifassistv3_test_regex_request)

Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.snifassistv3_status_response_base import Snifassistv3StatusResponseBase
from ibm_gdsc_sdk_saas.models.snifassistv3_test_regex_request import Snifassistv3TestRegexRequest
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
    api_instance = ibm_gdsc_sdk_saas.SnifAssistServiceApi(api_client)
    snifassistv3_test_regex_request = ibm_gdsc_sdk_saas.Snifassistv3TestRegexRequest() # Snifassistv3TestRegexRequest | 

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

