# \RiskAnalyticsEngineAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RiskAnalyticsEngineGetLeadGeneratorConfig**](RiskAnalyticsEngineAPI.md#RiskAnalyticsEngineGetLeadGeneratorConfig) | **Get** /api/v3/risk/lead_generator | Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
[**RiskAnalyticsEngineUpdateLeadGeneratorConfig**](RiskAnalyticsEngineAPI.md#RiskAnalyticsEngineUpdateLeadGeneratorConfig) | **Put** /api/v3/risk/lead_generator | Summary: Update lead generator config Description: Update the configuration of a leads generator.



## RiskAnalyticsEngineGetLeadGeneratorConfig

> Riskanalyticsenginev3GetLeadGeneratorConfigResponse RiskAnalyticsEngineGetLeadGeneratorConfig(ctx).Execute()

Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsEngineAPI.RiskAnalyticsEngineGetLeadGeneratorConfig(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsEngineAPI.RiskAnalyticsEngineGetLeadGeneratorConfig``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsEngineGetLeadGeneratorConfig`: Riskanalyticsenginev3GetLeadGeneratorConfigResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsEngineAPI.RiskAnalyticsEngineGetLeadGeneratorConfig`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsEngineGetLeadGeneratorConfigRequest struct via the builder pattern


### Return type

[**Riskanalyticsenginev3GetLeadGeneratorConfigResponse**](Riskanalyticsenginev3GetLeadGeneratorConfigResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsEngineUpdateLeadGeneratorConfig

> Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse RiskAnalyticsEngineUpdateLeadGeneratorConfig(ctx).Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest).Execute()

Summary: Update lead generator config Description: Update the configuration of a leads generator.

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
	riskanalyticsenginev3UpdateLeadGeneratorConfigRequest := *openapiclient.NewRiskanalyticsenginev3UpdateLeadGeneratorConfigRequest() // Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsEngineAPI.RiskAnalyticsEngineUpdateLeadGeneratorConfig(context.Background()).Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsEngineAPI.RiskAnalyticsEngineUpdateLeadGeneratorConfig``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsEngineUpdateLeadGeneratorConfig`: Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsEngineAPI.RiskAnalyticsEngineUpdateLeadGeneratorConfig`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsEngineUpdateLeadGeneratorConfigRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticsenginev3UpdateLeadGeneratorConfigRequest** | [**Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest**](Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest.md) |  | 

### Return type

[**Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse**](Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

