# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ComplianceAcceleratorCreateWorkspace**](ComplianceAcceleratorApi.md#ComplianceAcceleratorCreateWorkspace) | **Post** /api/v3/compliance/workspace | Summary: Create workspace Description: Create a workspace.
[**ComplianceAcceleratorDeleteComplianceWorkspaces**](ComplianceAcceleratorApi.md#ComplianceAcceleratorDeleteComplianceWorkspaces) | **Delete** /api/v3/compliance | Summary: Delete compliance workspaces Description: Delete workspaces.
[**ComplianceAcceleratorGetComplianceInfo**](ComplianceAcceleratorApi.md#ComplianceAcceleratorGetComplianceInfo) | **Get** /api/v3/compliance | Summary: Get compliance info Description: Return stored compliance data.
[**ComplianceAcceleratorHydrateWorkspace**](ComplianceAcceleratorApi.md#ComplianceAcceleratorHydrateWorkspace) | **Post** /api/v3/compliance/workspace/hydrate | HydrateWorkspace - Hydrates specified objects within a workspace
[**ComplianceAcceleratorStoreComplianceInfo**](ComplianceAcceleratorApi.md#ComplianceAcceleratorStoreComplianceInfo) | **Post** /api/v3/compliance | Summary: Store compliance info Description: Store compliance data.

# **ComplianceAcceleratorCreateWorkspace**
> StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse ComplianceAcceleratorCreateWorkspace(ctx, body)
Summary: Create workspace Description: Create a workspace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Complianceacceleratorv3CreateWorkspaceRequest**](Complianceacceleratorv3CreateWorkspaceRequest.md)|  | 

### Return type

[**StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse**](Stream result of complianceacceleratorv3CreateWorkspaceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ComplianceAcceleratorDeleteComplianceWorkspaces**
> Complianceacceleratorv3DeleteComplianceWorkspacesResponse ComplianceAcceleratorDeleteComplianceWorkspaces(ctx, optional)
Summary: Delete compliance workspaces Description: Delete workspaces.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ComplianceAcceleratorApiComplianceAcceleratorDeleteComplianceWorkspacesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ComplianceAcceleratorApiComplianceAcceleratorDeleteComplianceWorkspacesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regulations** | [**optional.Interface of []string**](string.md)| Id to be deleted. | 
 **deleteAll** | **optional.Bool**| if you want to delete a whole configuration. | 

### Return type

[**Complianceacceleratorv3DeleteComplianceWorkspacesResponse**](complianceacceleratorv3DeleteComplianceWorkspacesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ComplianceAcceleratorGetComplianceInfo**
> Complianceacceleratorv3GetComplianceInfoResponse ComplianceAcceleratorGetComplianceInfo(ctx, )
Summary: Get compliance info Description: Return stored compliance data.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Complianceacceleratorv3GetComplianceInfoResponse**](complianceacceleratorv3GetComplianceInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ComplianceAcceleratorHydrateWorkspace**
> Complianceacceleratorv3HydrateComplianceWorkspacesResponse ComplianceAcceleratorHydrateWorkspace(ctx, body)
HydrateWorkspace - Hydrates specified objects within a workspace

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Complianceacceleratorv3HydrateComplianceWorkspacesRequest**](Complianceacceleratorv3HydrateComplianceWorkspacesRequest.md)|  | 

### Return type

[**Complianceacceleratorv3HydrateComplianceWorkspacesResponse**](complianceacceleratorv3HydrateComplianceWorkspacesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ComplianceAcceleratorStoreComplianceInfo**
> Complianceacceleratorv3StoreComplianceInfoResponse ComplianceAcceleratorStoreComplianceInfo(ctx, body)
Summary: Store compliance info Description: Store compliance data.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Complianceacceleratorv3StoreComplianceInfoRequest**](Complianceacceleratorv3StoreComplianceInfoRequest.md)|  | 

### Return type

[**Complianceacceleratorv3StoreComplianceInfoResponse**](complianceacceleratorv3StoreComplianceInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

