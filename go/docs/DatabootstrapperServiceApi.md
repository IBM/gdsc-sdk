# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DatabootstrapperServiceLoadData**](DatabootstrapperServiceApi.md#DatabootstrapperServiceLoadData) | **Post** /api/v3/databootstrapper/data | Summary: Load data Description: Load data for a tenant.

# **DatabootstrapperServiceLoadData**
> Databootstrapperv3LoadDataResponse DatabootstrapperServiceLoadData(ctx, body)
Summary: Load data Description: Load data for a tenant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Databootstrapperv3LoadDataRequest**](Databootstrapperv3LoadDataRequest.md)|  | 

### Return type

[**Databootstrapperv3LoadDataResponse**](databootstrapperv3LoadDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

