# \RiskAnalyticsMlClassificationAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RiskAnalyticsMlClassificationResetModelToDefaults**](RiskAnalyticsMlClassificationAPI.md#RiskAnalyticsMlClassificationResetModelToDefaults) | **Post** /api/v3/classification/ml/models/reset | Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.



## RiskAnalyticsMlClassificationResetModelToDefaults

> Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse RiskAnalyticsMlClassificationResetModelToDefaults(ctx).Execute()

Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.

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
	resp, r, err := apiClient.RiskAnalyticsMlClassificationAPI.RiskAnalyticsMlClassificationResetModelToDefaults(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsMlClassificationAPI.RiskAnalyticsMlClassificationResetModelToDefaults``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsMlClassificationResetModelToDefaults`: Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsMlClassificationAPI.RiskAnalyticsMlClassificationResetModelToDefaults`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsMlClassificationResetModelToDefaultsRequest struct via the builder pattern


### Return type

[**Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse**](Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

