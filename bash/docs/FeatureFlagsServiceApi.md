# FeatureFlagsServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**featureFlagsServiceDeleteFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceDeleteFeatureFlagOverrides) | **DELETE** /api/v3/feature_flags/overrides | Summary: Delete feature Flag overrides
Description: Delete feature Flag overrides from database.
[**featureFlagsServiceGetFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceGetFeatureFlagOverrides) | **GET** /api/v3/feature_flags/overrides | Summary: Get feature Flag overrides
Description: Get feature Flag overrides by Feature Flag Name.
[**featureFlagsServiceGetFeatureFlags**](FeatureFlagsServiceApi.md#featureFlagsServiceGetFeatureFlags) | **GET** /api/v3/feature_flags | Summary: Get feature flags
Description: Get feature flags by Feature Flag Name.
[**featureFlagsServiceUpdateFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceUpdateFeatureFlagOverrides) | **PUT** /api/v3/feature_flags/overrides | Summary: Update feature Flag overrides
Description: Update feature Flag overrides in the database.



## featureFlagsServiceDeleteFeatureFlagOverrides

Summary: Delete feature Flag overrides
Description: Delete feature Flag overrides from database.

### Example

```bash
 featureFlagsServiceDeleteFeatureFlagOverrides  flag_name=value  tenant_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flagName** | **string** | Flag name. | [optional] [default to null]
 **tenantId** | **string** | Optional tenant id. | [optional] [default to null]

### Return type

[**Featureflagsv3DeleteFeatureFlagOverridesResponse**](Featureflagsv3DeleteFeatureFlagOverridesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## featureFlagsServiceGetFeatureFlagOverrides

Summary: Get feature Flag overrides
Description: Get feature Flag overrides by Feature Flag Name.

### Example

```bash
 featureFlagsServiceGetFeatureFlagOverrides  tenant_id=value  Specify as:  flag_names=value1 flag_names=value2 flag_names=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Optional tenant id. | [optional] [default to null]
 **flagNames** | [**array[string]**](string.md) | Optional flag names; if empty then return all flag. | [optional] [default to null]

### Return type

[**Featureflagsv3GetFeatureFlagOverridesResponse**](Featureflagsv3GetFeatureFlagOverridesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## featureFlagsServiceGetFeatureFlags

Summary: Get feature flags
Description: Get feature flags by Feature Flag Name.

### Example

```bash
 featureFlagsServiceGetFeatureFlags  tenant_id=value  Specify as:  flag_names=value1 flag_names=value2 flag_names=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Tenant id. | [optional] [default to null]
 **flagNames** | [**array[string]**](string.md) | Optional flag names; if empty then return all flag. | [optional] [default to null]

### Return type

[**Featureflagsv3GetFeatureFlagsResponse**](Featureflagsv3GetFeatureFlagsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## featureFlagsServiceUpdateFeatureFlagOverrides

Summary: Update feature Flag overrides
Description: Update feature Flag overrides in the database.

### Example

```bash
 featureFlagsServiceUpdateFeatureFlagOverrides
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureflagsv3UpdateFeatureFlagOverridesRequest** | [**Featureflagsv3UpdateFeatureFlagOverridesRequest**](Featureflagsv3UpdateFeatureFlagOverridesRequest.md) |  |

### Return type

[**Featureflagsv3UpdateFeatureFlagOverridesResponse**](Featureflagsv3UpdateFeatureFlagOverridesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

