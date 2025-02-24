# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PipelineconfigServiceDeleteTenantResources**](PipelineconfigServiceApi.md#PipelineconfigServiceDeleteTenantResources) | **Delete** /api/v3/resources/{tenant_id}/{resource} | Summary: Delete a tenant resource Description: Delete tenant specific resources such as db2, mongo, postgres and s3.

# **PipelineconfigServiceDeleteTenantResources**
> Pipelineconfigv3DeleteTenantResponse PipelineconfigServiceDeleteTenantResources(ctx, tenantId, resource)
Summary: Delete a tenant resource Description: Delete tenant specific resources such as db2, mongo, postgres and s3.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **tenantId** | **string**| unique tenant ID | 
  **resource** | **string**| resource specifies the specific resource to delete | 

### Return type

[**Pipelineconfigv3DeleteTenantResponse**](pipelineconfigv3DeleteTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

