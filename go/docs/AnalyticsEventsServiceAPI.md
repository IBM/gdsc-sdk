# \AnalyticsEventsServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnalyticsEventsServiceDeleteCacheKey**](AnalyticsEventsServiceAPI.md#AnalyticsEventsServiceDeleteCacheKey) | **Delete** /api/v3/eventscache/{cache_key} | Summary: Delete cache key Description: Return delete key result message.
[**AnalyticsEventsServicePostQSAdvisorRisk**](AnalyticsEventsServiceAPI.md#AnalyticsEventsServicePostQSAdvisorRisk) | **Post** /api/v3/risk/qs_advisor | Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status



## AnalyticsEventsServiceDeleteCacheKey

> Analyticseventsv3DeleteCacheKeyResponse AnalyticsEventsServiceDeleteCacheKey(ctx, cacheKey).Analyticseventsv3DeleteCacheKeyRequest(analyticseventsv3DeleteCacheKeyRequest).Execute()

Summary: Delete cache key Description: Return delete key result message.

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
	cacheKey := "cacheKey_example" // string | The cache key to delete.
	analyticseventsv3DeleteCacheKeyRequest := *openapiclient.NewAnalyticseventsv3DeleteCacheKeyRequest() // Analyticseventsv3DeleteCacheKeyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AnalyticsEventsServiceAPI.AnalyticsEventsServiceDeleteCacheKey(context.Background(), cacheKey).Analyticseventsv3DeleteCacheKeyRequest(analyticseventsv3DeleteCacheKeyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AnalyticsEventsServiceAPI.AnalyticsEventsServiceDeleteCacheKey``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AnalyticsEventsServiceDeleteCacheKey`: Analyticseventsv3DeleteCacheKeyResponse
	fmt.Fprintf(os.Stdout, "Response from `AnalyticsEventsServiceAPI.AnalyticsEventsServiceDeleteCacheKey`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**cacheKey** | **string** | The cache key to delete. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAnalyticsEventsServiceDeleteCacheKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **analyticseventsv3DeleteCacheKeyRequest** | [**Analyticseventsv3DeleteCacheKeyRequest**](Analyticseventsv3DeleteCacheKeyRequest.md) |  | 

### Return type

[**Analyticseventsv3DeleteCacheKeyResponse**](Analyticseventsv3DeleteCacheKeyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AnalyticsEventsServicePostQSAdvisorRisk

> Analyticseventsv3PostQSAdvisorRiskResponse AnalyticsEventsServicePostQSAdvisorRisk(ctx).Analyticseventsv3PostQSAdvisorRiskRequest(analyticseventsv3PostQSAdvisorRiskRequest).Execute()

Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status

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
	analyticseventsv3PostQSAdvisorRiskRequest := *openapiclient.NewAnalyticseventsv3PostQSAdvisorRiskRequest() // Analyticseventsv3PostQSAdvisorRiskRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AnalyticsEventsServiceAPI.AnalyticsEventsServicePostQSAdvisorRisk(context.Background()).Analyticseventsv3PostQSAdvisorRiskRequest(analyticseventsv3PostQSAdvisorRiskRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AnalyticsEventsServiceAPI.AnalyticsEventsServicePostQSAdvisorRisk``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AnalyticsEventsServicePostQSAdvisorRisk`: Analyticseventsv3PostQSAdvisorRiskResponse
	fmt.Fprintf(os.Stdout, "Response from `AnalyticsEventsServiceAPI.AnalyticsEventsServicePostQSAdvisorRisk`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAnalyticsEventsServicePostQSAdvisorRiskRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analyticseventsv3PostQSAdvisorRiskRequest** | [**Analyticseventsv3PostQSAdvisorRiskRequest**](Analyticseventsv3PostQSAdvisorRiskRequest.md) |  | 

### Return type

[**Analyticseventsv3PostQSAdvisorRiskResponse**](Analyticseventsv3PostQSAdvisorRiskResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

