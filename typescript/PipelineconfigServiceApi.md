# .PipelineconfigServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pipelineconfigServiceDeleteTenantResources**](PipelineconfigServiceApi.md#pipelineconfigServiceDeleteTenantResources) | **DELETE** /api/v3/resources/{tenant_id}/{resource} | Summary: Delete a tenant resource Description: Delete tenant specific resources such as data warehouse, mongo, postgres and s3.


# **pipelineconfigServiceDeleteTenantResources**
> Pipelineconfigv3DeleteTenantResponse pipelineconfigServiceDeleteTenantResources()


### Example


```typescript
import { createConfiguration, PipelineconfigServiceApi } from '';
import type { PipelineconfigServiceApiPipelineconfigServiceDeleteTenantResourcesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PipelineconfigServiceApi(configuration);

const request: PipelineconfigServiceApiPipelineconfigServiceDeleteTenantResourcesRequest = {
    // unique tenant ID
  tenantId: "tenant_id_example",
    // resource specifies the specific resource to delete
  resource: "resource_example",
};

const data = await apiInstance.pipelineconfigServiceDeleteTenantResources(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | unique tenant ID | defaults to undefined
 **resource** | [**string**] | resource specifies the specific resource to delete | defaults to undefined


### Return type

**Pipelineconfigv3DeleteTenantResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


