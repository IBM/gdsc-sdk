# PipelineconfigServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**pipelineconfigServiceDeleteTenantResources**](PipelineconfigServiceApi.md#pipelineconfigServiceDeleteTenantResources) | **DELETE** /api/v3/resources/{tenant_id}/{resource} | Summary: Delete a tenant resource
Description: Delete tenant specific resources such as db2, mongo, postgres and s3.



## pipelineconfigServiceDeleteTenantResources

Summary: Delete a tenant resource
Description: Delete tenant specific resources such as db2, mongo, postgres and s3.

### Example

```bash
 pipelineconfigServiceDeleteTenantResources tenant_id=value resource=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | unique tenant ID | [default to null]
 **resource** | **string** | resource specifies the specific resource to delete | [default to null]

### Return type

[**Pipelineconfigv3DeleteTenantResponse**](Pipelineconfigv3DeleteTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

