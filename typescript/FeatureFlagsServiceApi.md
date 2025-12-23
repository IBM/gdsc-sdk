# .FeatureFlagsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**featureFlagsServiceDeleteFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceDeleteFeatureFlagOverrides) | **DELETE** /api/v3/feature_flags/overrides | Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
[**featureFlagsServiceGetFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceGetFeatureFlagOverrides) | **GET** /api/v3/feature_flags/overrides | Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
[**featureFlagsServiceGetFeatureFlags**](FeatureFlagsServiceApi.md#featureFlagsServiceGetFeatureFlags) | **GET** /api/v3/feature_flags | Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
[**featureFlagsServiceUpdateFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceUpdateFeatureFlagOverrides) | **PUT** /api/v3/feature_flags/overrides | Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.


# **featureFlagsServiceDeleteFeatureFlagOverrides**
> Featureflagsv3DeleteFeatureFlagOverridesResponse featureFlagsServiceDeleteFeatureFlagOverrides()


### Example


```typescript
import { createConfiguration, FeatureFlagsServiceApi } from '';
import type { FeatureFlagsServiceApiFeatureFlagsServiceDeleteFeatureFlagOverridesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FeatureFlagsServiceApi(configuration);

const request: FeatureFlagsServiceApiFeatureFlagsServiceDeleteFeatureFlagOverridesRequest = {
    // Flag name. (optional)
  flagName: "flag_name_example",
    // Optional tenant id. (optional)
  tenantId: "tenant_id_example",
};

const data = await apiInstance.featureFlagsServiceDeleteFeatureFlagOverrides(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flagName** | [**string**] | Flag name. | (optional) defaults to undefined
 **tenantId** | [**string**] | Optional tenant id. | (optional) defaults to undefined


### Return type

**Featureflagsv3DeleteFeatureFlagOverridesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **featureFlagsServiceGetFeatureFlagOverrides**
> Featureflagsv3GetFeatureFlagOverridesResponse featureFlagsServiceGetFeatureFlagOverrides()


### Example


```typescript
import { createConfiguration, FeatureFlagsServiceApi } from '';
import type { FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagOverridesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FeatureFlagsServiceApi(configuration);

const request: FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagOverridesRequest = {
    // Optional tenant id. (optional)
  tenantId: "tenant_id_example",
    // Optional flag names; if empty then return all flag. (optional)
  flagNames: [
    "flag_names_example",
  ],
};

const data = await apiInstance.featureFlagsServiceGetFeatureFlagOverrides(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Optional tenant id. | (optional) defaults to undefined
 **flagNames** | **Array&lt;string&gt;** | Optional flag names; if empty then return all flag. | (optional) defaults to undefined


### Return type

**Featureflagsv3GetFeatureFlagOverridesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **featureFlagsServiceGetFeatureFlags**
> Featureflagsv3GetFeatureFlagsResponse featureFlagsServiceGetFeatureFlags()


### Example


```typescript
import { createConfiguration, FeatureFlagsServiceApi } from '';
import type { FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FeatureFlagsServiceApi(configuration);

const request: FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagsRequest = {
    // Tenant id. (optional)
  tenantId: "tenant_id_example",
    // Optional flag names; if empty then return all flag. (optional)
  flagNames: [
    "flag_names_example",
  ],
};

const data = await apiInstance.featureFlagsServiceGetFeatureFlags(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Tenant id. | (optional) defaults to undefined
 **flagNames** | **Array&lt;string&gt;** | Optional flag names; if empty then return all flag. | (optional) defaults to undefined


### Return type

**Featureflagsv3GetFeatureFlagsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **featureFlagsServiceUpdateFeatureFlagOverrides**
> Featureflagsv3UpdateFeatureFlagOverridesResponse featureFlagsServiceUpdateFeatureFlagOverrides(featureflagsv3UpdateFeatureFlagOverridesRequest)


### Example


```typescript
import { createConfiguration, FeatureFlagsServiceApi } from '';
import type { FeatureFlagsServiceApiFeatureFlagsServiceUpdateFeatureFlagOverridesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FeatureFlagsServiceApi(configuration);

const request: FeatureFlagsServiceApiFeatureFlagsServiceUpdateFeatureFlagOverridesRequest = {
  
  featureflagsv3UpdateFeatureFlagOverridesRequest: {
    featureFlag: {
      flagName: "flagName_example",
      isEnabled: true,
      value: "value_example",
    },
    tenantId: "tenantId_example",
  },
};

const data = await apiInstance.featureFlagsServiceUpdateFeatureFlagOverrides(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureflagsv3UpdateFeatureFlagOverridesRequest** | **Featureflagsv3UpdateFeatureFlagOverridesRequest**|  |


### Return type

**Featureflagsv3UpdateFeatureFlagOverridesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


