# ComplianceAcceleratorApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**complianceAcceleratorCreateWorkspace**](ComplianceAcceleratorApi.md#complianceAcceleratorCreateWorkspace) | **POST** /api/v3/compliance/workspace | Summary: Create workspace
Description: Create a workspace.
[**complianceAcceleratorDeleteComplianceWorkspaces**](ComplianceAcceleratorApi.md#complianceAcceleratorDeleteComplianceWorkspaces) | **DELETE** /api/v3/compliance | Summary: Delete compliance workspaces
Description: Delete workspaces.
[**complianceAcceleratorGetComplianceInfo**](ComplianceAcceleratorApi.md#complianceAcceleratorGetComplianceInfo) | **GET** /api/v3/compliance | Summary: Get compliance info
Description: Return stored compliance data.
[**complianceAcceleratorHydrateWorkspace**](ComplianceAcceleratorApi.md#complianceAcceleratorHydrateWorkspace) | **POST** /api/v3/compliance/workspace/hydrate | HydrateWorkspace - Hydrates specified objects within a workspace
[**complianceAcceleratorStoreComplianceInfo**](ComplianceAcceleratorApi.md#complianceAcceleratorStoreComplianceInfo) | **POST** /api/v3/compliance | Summary: Store compliance info
Description: Store compliance data.



## complianceAcceleratorCreateWorkspace

Summary: Create workspace
Description: Create a workspace.

### Example

```bash
 complianceAcceleratorCreateWorkspace
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3CreateWorkspaceRequest** | [**Complianceacceleratorv3CreateWorkspaceRequest**](Complianceacceleratorv3CreateWorkspaceRequest.md) |  |

### Return type

[**StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse**](StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## complianceAcceleratorDeleteComplianceWorkspaces

Summary: Delete compliance workspaces
Description: Delete workspaces.

### Example

```bash
 complianceAcceleratorDeleteComplianceWorkspaces  Specify as:  regulations=value1 regulations=value2 regulations=...  deleteAll=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regulations** | [**array[string]**](string.md) | Id to be deleted. | [optional] [default to null]
 **deleteAll** | **boolean** | if you want to delete a whole configuration. | [optional] [default to null]

### Return type

[**Complianceacceleratorv3DeleteComplianceWorkspacesResponse**](Complianceacceleratorv3DeleteComplianceWorkspacesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## complianceAcceleratorGetComplianceInfo

Summary: Get compliance info
Description: Return stored compliance data.

### Example

```bash
 complianceAcceleratorGetComplianceInfo  is_brief=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isBrief** | **boolean** | gives compliance workspace data without reaching out to other services - meant to be quicker for dashboards. | [optional] [default to null]

### Return type

[**Complianceacceleratorv3GetComplianceInfoResponse**](Complianceacceleratorv3GetComplianceInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## complianceAcceleratorHydrateWorkspace

HydrateWorkspace - Hydrates specified objects within a workspace

### Example

```bash
 complianceAcceleratorHydrateWorkspace
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3HydrateComplianceWorkspacesRequest** | [**Complianceacceleratorv3HydrateComplianceWorkspacesRequest**](Complianceacceleratorv3HydrateComplianceWorkspacesRequest.md) |  |

### Return type

[**Complianceacceleratorv3HydrateComplianceWorkspacesResponse**](Complianceacceleratorv3HydrateComplianceWorkspacesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## complianceAcceleratorStoreComplianceInfo

Summary: Store compliance info
Description: Store compliance data.

### Example

```bash
 complianceAcceleratorStoreComplianceInfo
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3StoreComplianceInfoRequest** | [**Complianceacceleratorv3StoreComplianceInfoRequest**](Complianceacceleratorv3StoreComplianceInfoRequest.md) |  |

### Return type

[**Complianceacceleratorv3StoreComplianceInfoResponse**](Complianceacceleratorv3StoreComplianceInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

