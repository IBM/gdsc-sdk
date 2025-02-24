# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FeatureFlagsServiceDeleteFeatureFlagOverrides**](FeatureFlagsServiceApi.md#FeatureFlagsServiceDeleteFeatureFlagOverrides) | **Delete** /api/v3/feature_flags/overrides | Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
[**FeatureFlagsServiceGetFeatureFlagOverrides**](FeatureFlagsServiceApi.md#FeatureFlagsServiceGetFeatureFlagOverrides) | **Get** /api/v3/feature_flags/overrides | Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
[**FeatureFlagsServiceGetFeatureFlags**](FeatureFlagsServiceApi.md#FeatureFlagsServiceGetFeatureFlags) | **Get** /api/v3/feature_flags | Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
[**FeatureFlagsServiceUpdateFeatureFlagOverrides**](FeatureFlagsServiceApi.md#FeatureFlagsServiceUpdateFeatureFlagOverrides) | **Put** /api/v3/feature_flags/overrides | Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.

# **FeatureFlagsServiceDeleteFeatureFlagOverrides**
> Featureflagsv3DeleteFeatureFlagOverridesResponse FeatureFlagsServiceDeleteFeatureFlagOverrides(ctx, optional)
Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***FeatureFlagsServiceApiFeatureFlagsServiceDeleteFeatureFlagOverridesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a FeatureFlagsServiceApiFeatureFlagsServiceDeleteFeatureFlagOverridesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flagName** | **optional.String**| Flag name. | 
 **tenantId** | **optional.String**| Optional tenant id. | 

### Return type

[**Featureflagsv3DeleteFeatureFlagOverridesResponse**](featureflagsv3DeleteFeatureFlagOverridesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FeatureFlagsServiceGetFeatureFlagOverrides**
> Featureflagsv3GetFeatureFlagOverridesResponse FeatureFlagsServiceGetFeatureFlagOverrides(ctx, optional)
Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagOverridesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagOverridesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **optional.String**| Optional tenant id. | 
 **flagNames** | [**optional.Interface of []string**](string.md)| Optional flag names; if empty then return all flag. | 

### Return type

[**Featureflagsv3GetFeatureFlagOverridesResponse**](featureflagsv3GetFeatureFlagOverridesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FeatureFlagsServiceGetFeatureFlags**
> Featureflagsv3GetFeatureFlagsResponse FeatureFlagsServiceGetFeatureFlags(ctx, optional)
Summary: Get feature flags Description: Get feature flags by Feature Flag Name.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **optional.String**| Tenant id. | 
 **flagNames** | [**optional.Interface of []string**](string.md)| Optional flag names; if empty then return all flag. | 

### Return type

[**Featureflagsv3GetFeatureFlagsResponse**](featureflagsv3GetFeatureFlagsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FeatureFlagsServiceUpdateFeatureFlagOverrides**
> Featureflagsv3UpdateFeatureFlagOverridesResponse FeatureFlagsServiceUpdateFeatureFlagOverrides(ctx, body)
Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Featureflagsv3UpdateFeatureFlagOverridesRequest**](Featureflagsv3UpdateFeatureFlagOverridesRequest.md)|  | 

### Return type

[**Featureflagsv3UpdateFeatureFlagOverridesResponse**](featureflagsv3UpdateFeatureFlagOverridesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

