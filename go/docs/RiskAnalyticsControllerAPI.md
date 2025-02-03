# \RiskAnalyticsControllerAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RiskAnalyticsControllerEnableDisableRiskEventFeedback**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerEnableDisableRiskEventFeedback) | **Put** /api/v3/risk_feedback/status | Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
[**RiskAnalyticsControllerEnableDisableRiskEventProcess**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerEnableDisableRiskEventProcess) | **Put** /api/v3/risk_process/status | Summary: Enable disable risk event process Description: Enable or disable the risk event process.
[**RiskAnalyticsControllerGetAllClassificationsList**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerGetAllClassificationsList) | **Get** /api/v3/risk_events/classifications | Summary: Get all classifications Description: Get all possible classifications for a risk event.
[**RiskAnalyticsControllerGetRiskEventClassificationsList**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerGetRiskEventClassificationsList) | **Get** /api/v3/risk_events/feedback/{risk_id} | Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.
[**RiskAnalyticsControllerGetRiskEventDataForSummarization**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerGetRiskEventDataForSummarization) | **Get** /api/v3/risk_events/summarization/data/{risk_id} | Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
[**RiskAnalyticsControllerGetRiskEventDetails**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerGetRiskEventDetails) | **Get** /api/v3/risk_events/details/{risk_id} | Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
[**RiskAnalyticsControllerGetRiskEventProcessStatus**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerGetRiskEventProcessStatus) | **Get** /api/v3/risk_process/status | Summary: Get risk event process status Description: Get the risk event process status.
[**RiskAnalyticsControllerGetRiskEventRow**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerGetRiskEventRow) | **Get** /api/v3/risk_events | Summary: Get risk event row Description: Return a list of risk events.
[**RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails) | **Put** /api/v3/risk_events/va/{risk_id} | Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
[**RiskAnalyticsControllerGetRiskFeedback**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerGetRiskFeedback) | **Get** /api/v3/risk_events/feedback | Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
[**RiskAnalyticsControllerGetRiskObservationDetails**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerGetRiskObservationDetails) | **Get** /api/v3/risk_events/observations | Summary: Get risk observation details Description: Return details of a single risk observation.
[**RiskAnalyticsControllerGetUserUISettings**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerGetUserUISettings) | **Get** /api/v3/risk_events/user_ui_settings | Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
[**RiskAnalyticsControllerRiskEventTuning**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerRiskEventTuning) | **Put** /api/v3/risk_events/tuning | Summary: Risk event tuning Description: Perform tuning risk event actions.
[**RiskAnalyticsControllerSetRiskEventStatus**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerSetRiskEventStatus) | **Put** /api/v3/risk_events/status | Summary: Set risk event status Description: Update the risk status and justification.
[**RiskAnalyticsControllerSetUserUISettings**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerSetUserUISettings) | **Put** /api/v3/risk_events/user_ui_settings | Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium Insights. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium Insights.
[**RiskAnalyticsControllerUpdateRiskFeedback**](RiskAnalyticsControllerAPI.md#RiskAnalyticsControllerUpdateRiskFeedback) | **Put** /api/v3/risk_events/feedback | Summary: Update risk feedback Description: Provide feedback for one or more risk events



## RiskAnalyticsControllerEnableDisableRiskEventFeedback

> Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse RiskAnalyticsControllerEnableDisableRiskEventFeedback(ctx).Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest).Execute()

Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.

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
	riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest := *openapiclient.NewRiskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest() // Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerEnableDisableRiskEventFeedback(context.Background()).Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerEnableDisableRiskEventFeedback``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerEnableDisableRiskEventFeedback`: Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerEnableDisableRiskEventFeedback`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerEnableDisableRiskEventFeedbackRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest** | [**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest**](Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest.md) |  | 

### Return type

[**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse**](Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerEnableDisableRiskEventProcess

> Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse RiskAnalyticsControllerEnableDisableRiskEventProcess(ctx).Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest).Execute()

Summary: Enable disable risk event process Description: Enable or disable the risk event process.

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
	riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest := *openapiclient.NewRiskanalyticscontrollerv3EnableDisableRiskEventProcessRequest() // Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerEnableDisableRiskEventProcess(context.Background()).Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerEnableDisableRiskEventProcess``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerEnableDisableRiskEventProcess`: Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerEnableDisableRiskEventProcess`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerEnableDisableRiskEventProcessRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest** | [**Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest**](Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest.md) |  | 

### Return type

[**Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse**](Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerGetAllClassificationsList

> Riskanalyticscontrollerv3GetAllClassificationsListResponse RiskAnalyticsControllerGetAllClassificationsList(ctx).Execute()

Summary: Get all classifications Description: Get all possible classifications for a risk event.

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
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetAllClassificationsList(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetAllClassificationsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerGetAllClassificationsList`: Riskanalyticscontrollerv3GetAllClassificationsListResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetAllClassificationsList`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerGetAllClassificationsListRequest struct via the builder pattern


### Return type

[**Riskanalyticscontrollerv3GetAllClassificationsListResponse**](Riskanalyticscontrollerv3GetAllClassificationsListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerGetRiskEventClassificationsList

> Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse RiskAnalyticsControllerGetRiskEventClassificationsList(ctx, riskId).Execute()

Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.

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
	riskId := int32(56) // int32 | Risk id

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventClassificationsList(context.Background(), riskId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventClassificationsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerGetRiskEventClassificationsList`: Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventClassificationsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**riskId** | **int32** | Risk id | 

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerGetRiskEventClassificationsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse**](Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerGetRiskEventDataForSummarization

> Riskanalyticscontrollerv3RiskEventSummarizationDataResponse RiskAnalyticsControllerGetRiskEventDataForSummarization(ctx, riskId).IncludeIndicators(includeIndicators).NumFindingsLimit(numFindingsLimit).Execute()

Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data

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
	riskId := int32(56) // int32 | Risk ID
	includeIndicators := true // bool | Indicates whether to include indicators in the response or not. (optional)
	numFindingsLimit := int32(56) // int32 | Max number of hours to get for the risk. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventDataForSummarization(context.Background(), riskId).IncludeIndicators(includeIndicators).NumFindingsLimit(numFindingsLimit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventDataForSummarization``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerGetRiskEventDataForSummarization`: Riskanalyticscontrollerv3RiskEventSummarizationDataResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventDataForSummarization`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**riskId** | **int32** | Risk ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerGetRiskEventDataForSummarizationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **includeIndicators** | **bool** | Indicates whether to include indicators in the response or not. | 
 **numFindingsLimit** | **int32** | Max number of hours to get for the risk. | 

### Return type

[**Riskanalyticscontrollerv3RiskEventSummarizationDataResponse**](Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerGetRiskEventDetails

> Riskanalyticscontrollerv3GetRiskEventDetailsResponse RiskAnalyticsControllerGetRiskEventDetails(ctx, riskId).Execute()

Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.

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
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventDetails(context.Background(), riskId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventDetails``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerGetRiskEventDetails`: Riskanalyticscontrollerv3GetRiskEventDetailsResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventDetails`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**riskId** | **int32** | Risk id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerGetRiskEventDetailsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Riskanalyticscontrollerv3GetRiskEventDetailsResponse**](Riskanalyticscontrollerv3GetRiskEventDetailsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerGetRiskEventProcessStatus

> Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse RiskAnalyticsControllerGetRiskEventProcessStatus(ctx).Execute()

Summary: Get risk event process status Description: Get the risk event process status.

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
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventProcessStatus(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventProcessStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerGetRiskEventProcessStatus`: Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventProcessStatus`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerGetRiskEventProcessStatusRequest struct via the builder pattern


### Return type

[**Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse**](Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerGetRiskEventRow

> Riskanalyticscontrollerv3GetRiskEventRowResponse RiskAnalyticsControllerGetRiskEventRow(ctx).Status(status).DateFrom(dateFrom).DateTo(dateTo).PivotType(pivotType).PivotId(pivotId).PivotDbUser(pivotDbUser).PivotDatabase(pivotDatabase).PivotServerIp(pivotServerIp).PivotOsUser(pivotOsUser).PivotDatabaseSourceField(pivotDatabaseSourceField).Execute()

Summary: Get risk event row Description: Return a list of risk events.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	status := "status_example" // string | Status to retrieve only the status events, blank to retrieve all. (optional) (default to "UNDEFINED_STATUS")
	dateFrom := time.Now() // time.Time | The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ. (optional)
	dateTo := time.Now() // time.Time | The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ. (optional)
	pivotType := "pivotType_example" // string | Pivot type - enum. (optional) (default to "UNDEFINED_PIVOT_TYPE")
	pivotId := "pivotId_example" // string | Pivot id -  all pivot fields separated by semicolon. (optional)
	pivotDbUser := "pivotDbUser_example" // string | Optional db_user - if pivot is db user. (optional)
	pivotDatabase := "pivotDatabase_example" // string | Optional database - if pivot is db user / database. (optional)
	pivotServerIp := "pivotServerIp_example" // string | Optional server_ip - if pivot is db user / database. (optional)
	pivotOsUser := "pivotOsUser_example" // string | Optional os_user - if pivot is os user. (optional)
	pivotDatabaseSourceField := "pivotDatabaseSourceField_example" // string | Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database. (optional) (default to "UNDEFINED")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventRow(context.Background()).Status(status).DateFrom(dateFrom).DateTo(dateTo).PivotType(pivotType).PivotId(pivotId).PivotDbUser(pivotDbUser).PivotDatabase(pivotDatabase).PivotServerIp(pivotServerIp).PivotOsUser(pivotOsUser).PivotDatabaseSourceField(pivotDatabaseSourceField).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventRow``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerGetRiskEventRow`: Riskanalyticscontrollerv3GetRiskEventRowResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventRow`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerGetRiskEventRowRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **string** | Status to retrieve only the status events, blank to retrieve all. | [default to &quot;UNDEFINED_STATUS&quot;]
 **dateFrom** | **time.Time** | The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ. | 
 **dateTo** | **time.Time** | The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ. | 
 **pivotType** | **string** | Pivot type - enum. | [default to &quot;UNDEFINED_PIVOT_TYPE&quot;]
 **pivotId** | **string** | Pivot id -  all pivot fields separated by semicolon. | 
 **pivotDbUser** | **string** | Optional db_user - if pivot is db user. | 
 **pivotDatabase** | **string** | Optional database - if pivot is db user / database. | 
 **pivotServerIp** | **string** | Optional server_ip - if pivot is db user / database. | 
 **pivotOsUser** | **string** | Optional os_user - if pivot is os user. | 
 **pivotDatabaseSourceField** | **string** | Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database. | [default to &quot;UNDEFINED&quot;]

### Return type

[**Riskanalyticscontrollerv3GetRiskEventRowResponse**](Riskanalyticscontrollerv3GetRiskEventRowResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails

> Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(ctx, riskId).Execute()

Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user

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
	riskId := int32(56) // int32 | Risk ID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(context.Background(), riskId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails`: Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**riskId** | **int32** | Risk ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetailsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse**](Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerGetRiskFeedback

> Riskanalyticscontrollerv3GetRiskFeedbackResponse RiskAnalyticsControllerGetRiskFeedback(ctx).Execute()

Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.

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
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskFeedback(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskFeedback``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerGetRiskFeedback`: Riskanalyticscontrollerv3GetRiskFeedbackResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskFeedback`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerGetRiskFeedbackRequest struct via the builder pattern


### Return type

[**Riskanalyticscontrollerv3GetRiskFeedbackResponse**](Riskanalyticscontrollerv3GetRiskFeedbackResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerGetRiskObservationDetails

> Riskanalyticscontrollerv3GetRiskObservationDetailsResponse RiskAnalyticsControllerGetRiskObservationDetails(ctx).LeadFeatureId(leadFeatureId).ObservationType(observationType).Execute()

Summary: Get risk observation details Description: Return details of a single risk observation.

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
	leadFeatureId := int32(56) // int32 | Lead feature id. (optional)
	observationType := "observationType_example" // string | Observation type. (optional) (default to "UNDEFINED_OBSERVATION_TYPE")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskObservationDetails(context.Background()).LeadFeatureId(leadFeatureId).ObservationType(observationType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskObservationDetails``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerGetRiskObservationDetails`: Riskanalyticscontrollerv3GetRiskObservationDetailsResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetRiskObservationDetails`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerGetRiskObservationDetailsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadFeatureId** | **int32** | Lead feature id. | 
 **observationType** | **string** | Observation type. | [default to &quot;UNDEFINED_OBSERVATION_TYPE&quot;]

### Return type

[**Riskanalyticscontrollerv3GetRiskObservationDetailsResponse**](Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerGetUserUISettings

> Riskanalyticscontrollerv3GetUserUISettingsResponse RiskAnalyticsControllerGetUserUISettings(ctx).Execute()

Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.

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
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetUserUISettings(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetUserUISettings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerGetUserUISettings`: Riskanalyticscontrollerv3GetUserUISettingsResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerGetUserUISettings`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerGetUserUISettingsRequest struct via the builder pattern


### Return type

[**Riskanalyticscontrollerv3GetUserUISettingsResponse**](Riskanalyticscontrollerv3GetUserUISettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerRiskEventTuning

> Riskanalyticscontrollerv3RiskEventTuningResponse RiskAnalyticsControllerRiskEventTuning(ctx).Riskanalyticscontrollerv3RiskEventTuningRequest(riskanalyticscontrollerv3RiskEventTuningRequest).Execute()

Summary: Risk event tuning Description: Perform tuning risk event actions.

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
	riskanalyticscontrollerv3RiskEventTuningRequest := *openapiclient.NewRiskanalyticscontrollerv3RiskEventTuningRequest() // Riskanalyticscontrollerv3RiskEventTuningRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerRiskEventTuning(context.Background()).Riskanalyticscontrollerv3RiskEventTuningRequest(riskanalyticscontrollerv3RiskEventTuningRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerRiskEventTuning``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerRiskEventTuning`: Riskanalyticscontrollerv3RiskEventTuningResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerRiskEventTuning`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerRiskEventTuningRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3RiskEventTuningRequest** | [**Riskanalyticscontrollerv3RiskEventTuningRequest**](Riskanalyticscontrollerv3RiskEventTuningRequest.md) |  | 

### Return type

[**Riskanalyticscontrollerv3RiskEventTuningResponse**](Riskanalyticscontrollerv3RiskEventTuningResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerSetRiskEventStatus

> Riskanalyticscontrollerv3SetRiskEventStatusResponse RiskAnalyticsControllerSetRiskEventStatus(ctx).Riskanalyticscontrollerv3SetRiskEventStatusRequest(riskanalyticscontrollerv3SetRiskEventStatusRequest).Execute()

Summary: Set risk event status Description: Update the risk status and justification.

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
	riskanalyticscontrollerv3SetRiskEventStatusRequest := *openapiclient.NewRiskanalyticscontrollerv3SetRiskEventStatusRequest() // Riskanalyticscontrollerv3SetRiskEventStatusRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerSetRiskEventStatus(context.Background()).Riskanalyticscontrollerv3SetRiskEventStatusRequest(riskanalyticscontrollerv3SetRiskEventStatusRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerSetRiskEventStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerSetRiskEventStatus`: Riskanalyticscontrollerv3SetRiskEventStatusResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerSetRiskEventStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerSetRiskEventStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3SetRiskEventStatusRequest** | [**Riskanalyticscontrollerv3SetRiskEventStatusRequest**](Riskanalyticscontrollerv3SetRiskEventStatusRequest.md) |  | 

### Return type

[**Riskanalyticscontrollerv3SetRiskEventStatusResponse**](Riskanalyticscontrollerv3SetRiskEventStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerSetUserUISettings

> Riskanalyticscontrollerv3SetUserUISettingsResponse RiskAnalyticsControllerSetUserUISettings(ctx).Riskanalyticscontrollerv3SetUserUISettingsRequest(riskanalyticscontrollerv3SetUserUISettingsRequest).Execute()

Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium Insights. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium Insights.

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
	riskanalyticscontrollerv3SetUserUISettingsRequest := *openapiclient.NewRiskanalyticscontrollerv3SetUserUISettingsRequest() // Riskanalyticscontrollerv3SetUserUISettingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerSetUserUISettings(context.Background()).Riskanalyticscontrollerv3SetUserUISettingsRequest(riskanalyticscontrollerv3SetUserUISettingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerSetUserUISettings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerSetUserUISettings`: Riskanalyticscontrollerv3SetUserUISettingsResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerSetUserUISettings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerSetUserUISettingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3SetUserUISettingsRequest** | [**Riskanalyticscontrollerv3SetUserUISettingsRequest**](Riskanalyticscontrollerv3SetUserUISettingsRequest.md) |  | 

### Return type

[**Riskanalyticscontrollerv3SetUserUISettingsResponse**](Riskanalyticscontrollerv3SetUserUISettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RiskAnalyticsControllerUpdateRiskFeedback

> Riskanalyticscontrollerv3UpdateRiskFeedbackResponse RiskAnalyticsControllerUpdateRiskFeedback(ctx).Riskanalyticscontrollerv3UpdateRiskFeedbackRequest(riskanalyticscontrollerv3UpdateRiskFeedbackRequest).Execute()

Summary: Update risk feedback Description: Provide feedback for one or more risk events

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
	riskanalyticscontrollerv3UpdateRiskFeedbackRequest := *openapiclient.NewRiskanalyticscontrollerv3UpdateRiskFeedbackRequest() // Riskanalyticscontrollerv3UpdateRiskFeedbackRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RiskAnalyticsControllerAPI.RiskAnalyticsControllerUpdateRiskFeedback(context.Background()).Riskanalyticscontrollerv3UpdateRiskFeedbackRequest(riskanalyticscontrollerv3UpdateRiskFeedbackRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RiskAnalyticsControllerAPI.RiskAnalyticsControllerUpdateRiskFeedback``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RiskAnalyticsControllerUpdateRiskFeedback`: Riskanalyticscontrollerv3UpdateRiskFeedbackResponse
	fmt.Fprintf(os.Stdout, "Response from `RiskAnalyticsControllerAPI.RiskAnalyticsControllerUpdateRiskFeedback`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRiskAnalyticsControllerUpdateRiskFeedbackRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3UpdateRiskFeedbackRequest** | [**Riskanalyticscontrollerv3UpdateRiskFeedbackRequest**](Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.md) |  | 

### Return type

[**Riskanalyticscontrollerv3UpdateRiskFeedbackResponse**](Riskanalyticscontrollerv3UpdateRiskFeedbackResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

