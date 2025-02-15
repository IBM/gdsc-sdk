# ibm_gdsc_sdk_software.PipelineconfigServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pipelineconfig_service_delete_tenant_resources**](PipelineconfigServiceApi.md#pipelineconfig_service_delete_tenant_resources) | **DELETE** /api/v3/resources/{tenant_id}/{resource} | Summary: Delete a tenant resource Description: Delete tenant specific resources such as db2, mongo, postgres and s3.


# **pipelineconfig_service_delete_tenant_resources**
> Pipelineconfigv3DeleteTenantResponse pipelineconfig_service_delete_tenant_resources(tenant_id, resource)

Summary: Delete a tenant resource Description: Delete tenant specific resources such as db2, mongo, postgres and s3.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.pipelineconfigv3_delete_tenant_response import Pipelineconfigv3DeleteTenantResponse
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
    api_instance = ibm_gdsc_sdk_software.PipelineconfigServiceApi(api_client)
    tenant_id = 'tenant_id_example' # str | unique tenant ID
    resource = 'resource_example' # str | resource specifies the specific resource to delete

    try:
        # Summary: Delete a tenant resource Description: Delete tenant specific resources such as db2, mongo, postgres and s3.
        api_response = api_instance.pipelineconfig_service_delete_tenant_resources(tenant_id, resource)
        print("The response of PipelineconfigServiceApi->pipelineconfig_service_delete_tenant_resources:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PipelineconfigServiceApi->pipelineconfig_service_delete_tenant_resources: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| unique tenant ID | 
 **resource** | **str**| resource specifies the specific resource to delete | 

### Return type

[**Pipelineconfigv3DeleteTenantResponse**](Pipelineconfigv3DeleteTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

