# \RiskAnalyticsDataProcessorAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RiskAnalyticsDataProcessorGetRiskContext**](RiskAnalyticsDataProcessorAPI.md#RiskAnalyticsDataProcessorGetRiskContext) | **Get** /api/v3/risk_events/context/{risk_id} | Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
[**RiskAnalyticsDataProcessorGetRiskPredefinedQuestions**](RiskAnalyticsDataProcessorAPI.md#RiskAnalyticsDataProcessorGetRiskPredefinedQuestions) | **Get** /api/v3/risk_events/{risk_id}/questions | Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.



## RiskAnalyticsDataProcessorGetRiskContext

> Riskanalyticsdataprocessorv3GetRiskContextResponse RiskAnalyticsDataProcessorGetRiskContext(ctx, riskId).Timezone(timezone).Execute()

Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.

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
	riskId := int32(56) // int32 | Risk id.
	timezone := "timezone_example" // string | Timezone in IANA format. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsDataProcessorAPI.RiskAnalyticsDataProcessorGetRiskContext(context.Background(), riskId).Timezone(timezone).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsDataProcessorAPI.RiskAnalyticsDataProcessorGetRiskContext``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsDataProcessorGetRiskContext`: Riskanalyticsdataprocessorv3GetRiskContextResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsDataProcessorAPI.RiskAnalyticsDataProcessorGetRiskContext`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**riskId** | **int32** | Risk id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsDataProcessorGetRiskContextRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **timezone** | **string** | Timezone in IANA format. | 

### Return type

[**Riskanalyticsdataprocessorv3GetRiskContextResponse**](Riskanalyticsdataprocessorv3GetRiskContextResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsDataProcessorGetRiskPredefinedQuestions

> Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse RiskAnalyticsDataProcessorGetRiskPredefinedQuestions(ctx, riskId).Execute()

Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.

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
	riskId := int32(56) // int32 | Risk id.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsDataProcessorAPI.RiskAnalyticsDataProcessorGetRiskPredefinedQuestions(context.Background(), riskId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsDataProcessorAPI.RiskAnalyticsDataProcessorGetRiskPredefinedQuestions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsDataProcessorGetRiskPredefinedQuestions`: Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsDataProcessorAPI.RiskAnalyticsDataProcessorGetRiskPredefinedQuestions`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**riskId** | **int32** | Risk id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsDataProcessorGetRiskPredefinedQuestionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse**](Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

