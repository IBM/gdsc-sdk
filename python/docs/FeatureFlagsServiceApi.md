# ibm_gdsc_sdk_software.FeatureFlagsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**feature_flags_service_delete_feature_flag_overrides**](FeatureFlagsServiceApi.md#feature_flags_service_delete_feature_flag_overrides) | **DELETE** /api/v3/feature_flags/overrides | Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
[**feature_flags_service_get_feature_flag_overrides**](FeatureFlagsServiceApi.md#feature_flags_service_get_feature_flag_overrides) | **GET** /api/v3/feature_flags/overrides | Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
[**feature_flags_service_get_feature_flags**](FeatureFlagsServiceApi.md#feature_flags_service_get_feature_flags) | **GET** /api/v3/feature_flags | Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
[**feature_flags_service_update_feature_flag_overrides**](FeatureFlagsServiceApi.md#feature_flags_service_update_feature_flag_overrides) | **PUT** /api/v3/feature_flags/overrides | Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.


# **feature_flags_service_delete_feature_flag_overrides**
> Featureflagsv3DeleteFeatureFlagOverridesResponse feature_flags_service_delete_feature_flag_overrides(flag_name=flag_name, tenant_id=tenant_id)

Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.featureflagsv3_delete_feature_flag_overrides_response import Featureflagsv3DeleteFeatureFlagOverridesResponse
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
    api_instance = ibm_gdsc_sdk_software.FeatureFlagsServiceApi(api_client)
    flag_name = 'flag_name_example' # str | Flag name. (optional)
    tenant_id = 'tenant_id_example' # str | Optional tenant id. (optional)

    try:
        # Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
        api_response = api_instance.feature_flags_service_delete_feature_flag_overrides(flag_name=flag_name, tenant_id=tenant_id)
        print("The response of FeatureFlagsServiceApi->feature_flags_service_delete_feature_flag_overrides:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FeatureFlagsServiceApi->feature_flags_service_delete_feature_flag_overrides: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flag_name** | **str**| Flag name. | [optional] 
 **tenant_id** | **str**| Optional tenant id. | [optional] 

### Return type

[**Featureflagsv3DeleteFeatureFlagOverridesResponse**](Featureflagsv3DeleteFeatureFlagOverridesResponse.md)

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

# **feature_flags_service_get_feature_flag_overrides**
> Featureflagsv3GetFeatureFlagOverridesResponse feature_flags_service_get_feature_flag_overrides(tenant_id=tenant_id, flag_names=flag_names)

Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.featureflagsv3_get_feature_flag_overrides_response import Featureflagsv3GetFeatureFlagOverridesResponse
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
    api_instance = ibm_gdsc_sdk_software.FeatureFlagsServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | Optional tenant id. (optional)
    flag_names = ['flag_names_example'] # List[str] | Optional flag names; if empty then return all flag. (optional)

    try:
        # Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
        api_response = api_instance.feature_flags_service_get_feature_flag_overrides(tenant_id=tenant_id, flag_names=flag_names)
        print("The response of FeatureFlagsServiceApi->feature_flags_service_get_feature_flag_overrides:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FeatureFlagsServiceApi->feature_flags_service_get_feature_flag_overrides: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| Optional tenant id. | [optional] 
 **flag_names** | [**List[str]**](str.md)| Optional flag names; if empty then return all flag. | [optional] 

### Return type

[**Featureflagsv3GetFeatureFlagOverridesResponse**](Featureflagsv3GetFeatureFlagOverridesResponse.md)

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

# **feature_flags_service_get_feature_flags**
> Featureflagsv3GetFeatureFlagsResponse feature_flags_service_get_feature_flags(tenant_id=tenant_id, flag_names=flag_names)

Summary: Get feature flags Description: Get feature flags by Feature Flag Name.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.featureflagsv3_get_feature_flags_response import Featureflagsv3GetFeatureFlagsResponse
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
    api_instance = ibm_gdsc_sdk_software.FeatureFlagsServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | Tenant id. (optional)
    flag_names = ['flag_names_example'] # List[str] | Optional flag names; if empty then return all flag. (optional)

    try:
        # Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
        api_response = api_instance.feature_flags_service_get_feature_flags(tenant_id=tenant_id, flag_names=flag_names)
        print("The response of FeatureFlagsServiceApi->feature_flags_service_get_feature_flags:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FeatureFlagsServiceApi->feature_flags_service_get_feature_flags: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| Tenant id. | [optional] 
 **flag_names** | [**List[str]**](str.md)| Optional flag names; if empty then return all flag. | [optional] 

### Return type

[**Featureflagsv3GetFeatureFlagsResponse**](Featureflagsv3GetFeatureFlagsResponse.md)

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

# **feature_flags_service_update_feature_flag_overrides**
> Featureflagsv3UpdateFeatureFlagOverridesResponse feature_flags_service_update_feature_flag_overrides(featureflagsv3_update_feature_flag_overrides_request)

Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.featureflagsv3_update_feature_flag_overrides_request import Featureflagsv3UpdateFeatureFlagOverridesRequest
from ibm_gdsc_sdk_software.models.featureflagsv3_update_feature_flag_overrides_response import Featureflagsv3UpdateFeatureFlagOverridesResponse
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
    api_instance = ibm_gdsc_sdk_software.FeatureFlagsServiceApi(api_client)
    featureflagsv3_update_feature_flag_overrides_request = ibm_gdsc_sdk_software.Featureflagsv3UpdateFeatureFlagOverridesRequest() # Featureflagsv3UpdateFeatureFlagOverridesRequest | 

    try:
        # Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.
        api_response = api_instance.feature_flags_service_update_feature_flag_overrides(featureflagsv3_update_feature_flag_overrides_request)
        print("The response of FeatureFlagsServiceApi->feature_flags_service_update_feature_flag_overrides:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FeatureFlagsServiceApi->feature_flags_service_update_feature_flag_overrides: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureflagsv3_update_feature_flag_overrides_request** | [**Featureflagsv3UpdateFeatureFlagOverridesRequest**](Featureflagsv3UpdateFeatureFlagOverridesRequest.md)|  | 

### Return type

[**Featureflagsv3UpdateFeatureFlagOverridesResponse**](Featureflagsv3UpdateFeatureFlagOverridesResponse.md)

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

