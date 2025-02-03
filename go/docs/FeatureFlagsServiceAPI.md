# \FeatureFlagsServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FeatureFlagsServiceDeleteFeatureFlagOverrides**](FeatureFlagsServiceAPI.md#FeatureFlagsServiceDeleteFeatureFlagOverrides) | **Delete** /api/v3/feature_flags/overrides | Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
[**FeatureFlagsServiceGetFeatureFlagOverrides**](FeatureFlagsServiceAPI.md#FeatureFlagsServiceGetFeatureFlagOverrides) | **Get** /api/v3/feature_flags/overrides | Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
[**FeatureFlagsServiceGetFeatureFlags**](FeatureFlagsServiceAPI.md#FeatureFlagsServiceGetFeatureFlags) | **Get** /api/v3/feature_flags | Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
[**FeatureFlagsServiceUpdateFeatureFlagOverrides**](FeatureFlagsServiceAPI.md#FeatureFlagsServiceUpdateFeatureFlagOverrides) | **Put** /api/v3/feature_flags/overrides | Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.



## FeatureFlagsServiceDeleteFeatureFlagOverrides

> Featureflagsv3DeleteFeatureFlagOverridesResponse FeatureFlagsServiceDeleteFeatureFlagOverrides(ctx).FlagName(flagName).TenantId(tenantId).Execute()

Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	flagName := "flagName_example" // string | Flag name. (optional)
	tenantId := "tenantId_example" // string | Optional tenant id. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FeatureFlagsServiceAPI.FeatureFlagsServiceDeleteFeatureFlagOverrides(context.Background()).FlagName(flagName).TenantId(tenantId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FeatureFlagsServiceAPI.FeatureFlagsServiceDeleteFeatureFlagOverrides``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeatureFlagsServiceDeleteFeatureFlagOverrides`: Featureflagsv3DeleteFeatureFlagOverridesResponse
	fmt.Fprintf(os.Stdout, "Response from `FeatureFlagsServiceAPI.FeatureFlagsServiceDeleteFeatureFlagOverrides`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFeatureFlagsServiceDeleteFeatureFlagOverridesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flagName** | **string** | Flag name. | 
 **tenantId** | **string** | Optional tenant id. | 

### Return type

[**Featureflagsv3DeleteFeatureFlagOverridesResponse**](Featureflagsv3DeleteFeatureFlagOverridesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeatureFlagsServiceGetFeatureFlagOverrides

> Featureflagsv3GetFeatureFlagOverridesResponse FeatureFlagsServiceGetFeatureFlagOverrides(ctx).TenantId(tenantId).FlagNames(flagNames).Execute()

Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	tenantId := "tenantId_example" // string | Optional tenant id. (optional)
	flagNames := []string{"Inner_example"} // []string | Optional flag names; if empty then return all flag. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FeatureFlagsServiceAPI.FeatureFlagsServiceGetFeatureFlagOverrides(context.Background()).TenantId(tenantId).FlagNames(flagNames).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FeatureFlagsServiceAPI.FeatureFlagsServiceGetFeatureFlagOverrides``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeatureFlagsServiceGetFeatureFlagOverrides`: Featureflagsv3GetFeatureFlagOverridesResponse
	fmt.Fprintf(os.Stdout, "Response from `FeatureFlagsServiceAPI.FeatureFlagsServiceGetFeatureFlagOverrides`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFeatureFlagsServiceGetFeatureFlagOverridesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Optional tenant id. | 
 **flagNames** | **[]string** | Optional flag names; if empty then return all flag. | 

### Return type

[**Featureflagsv3GetFeatureFlagOverridesResponse**](Featureflagsv3GetFeatureFlagOverridesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeatureFlagsServiceGetFeatureFlags

> Featureflagsv3GetFeatureFlagsResponse FeatureFlagsServiceGetFeatureFlags(ctx).TenantId(tenantId).FlagNames(flagNames).Execute()

Summary: Get feature flags Description: Get feature flags by Feature Flag Name.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	tenantId := "tenantId_example" // string | Tenant id. (optional)
	flagNames := []string{"Inner_example"} // []string | Optional flag names; if empty then return all flag. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FeatureFlagsServiceAPI.FeatureFlagsServiceGetFeatureFlags(context.Background()).TenantId(tenantId).FlagNames(flagNames).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FeatureFlagsServiceAPI.FeatureFlagsServiceGetFeatureFlags``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeatureFlagsServiceGetFeatureFlags`: Featureflagsv3GetFeatureFlagsResponse
	fmt.Fprintf(os.Stdout, "Response from `FeatureFlagsServiceAPI.FeatureFlagsServiceGetFeatureFlags`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFeatureFlagsServiceGetFeatureFlagsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Tenant id. | 
 **flagNames** | **[]string** | Optional flag names; if empty then return all flag. | 

### Return type

[**Featureflagsv3GetFeatureFlagsResponse**](Featureflagsv3GetFeatureFlagsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeatureFlagsServiceUpdateFeatureFlagOverrides

> Featureflagsv3UpdateFeatureFlagOverridesResponse FeatureFlagsServiceUpdateFeatureFlagOverrides(ctx).Featureflagsv3UpdateFeatureFlagOverridesRequest(featureflagsv3UpdateFeatureFlagOverridesRequest).Execute()

Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	featureflagsv3UpdateFeatureFlagOverridesRequest := *openapiclient.NewFeatureflagsv3UpdateFeatureFlagOverridesRequest() // Featureflagsv3UpdateFeatureFlagOverridesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FeatureFlagsServiceAPI.FeatureFlagsServiceUpdateFeatureFlagOverrides(context.Background()).Featureflagsv3UpdateFeatureFlagOverridesRequest(featureflagsv3UpdateFeatureFlagOverridesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FeatureFlagsServiceAPI.FeatureFlagsServiceUpdateFeatureFlagOverrides``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeatureFlagsServiceUpdateFeatureFlagOverrides`: Featureflagsv3UpdateFeatureFlagOverridesResponse
	fmt.Fprintf(os.Stdout, "Response from `FeatureFlagsServiceAPI.FeatureFlagsServiceUpdateFeatureFlagOverrides`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFeatureFlagsServiceUpdateFeatureFlagOverridesRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

