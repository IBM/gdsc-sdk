# \SchedulerServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SchedulerServiceCreateScheduledJob**](SchedulerServiceAPI.md#SchedulerServiceCreateScheduledJob) | **Post** /api/v3/schedules | Summary: Create scheduled job Description: Create a new scheduled job with tasks.
[**SchedulerServiceDeleteScheduledJob**](SchedulerServiceAPI.md#SchedulerServiceDeleteScheduledJob) | **Delete** /api/v3/schedules/{schedule_id} | Summary: Delete scheduled job Description: Delete a single scheduled job.
[**SchedulerServiceGetDependencies**](SchedulerServiceAPI.md#SchedulerServiceGetDependencies) | **Get** /api/v3/schedules/dependencies | Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
[**SchedulerServiceGetDistributionRules**](SchedulerServiceAPI.md#SchedulerServiceGetDistributionRules) | **Get** /api/v3/schedules/distribution_rules | Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can&#39;t be edited if it is used by a scheduled job.
[**SchedulerServiceGetScheduledJobDetails**](SchedulerServiceAPI.md#SchedulerServiceGetScheduledJobDetails) | **Get** /api/v3/schedules/{schedule_id}/details | Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
[**SchedulerServiceGetScheduledJobs**](SchedulerServiceAPI.md#SchedulerServiceGetScheduledJobs) | **Get** /api/v3/schedules | Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
[**SchedulerServiceGetSchedulesByReport**](SchedulerServiceAPI.md#SchedulerServiceGetSchedulesByReport) | **Post** /api/v3/schedules/searchByReport/{report_id} | Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
[**SchedulerServiceGetTags**](SchedulerServiceAPI.md#SchedulerServiceGetTags) | **Get** /api/v3/schedules/tags | Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
[**SchedulerServiceSearchScheduledJobs**](SchedulerServiceAPI.md#SchedulerServiceSearchScheduledJobs) | **Post** /api/v3/schedules/search | Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
[**SchedulerServiceSearchScheduledTaskRuns**](SchedulerServiceAPI.md#SchedulerServiceSearchScheduledTaskRuns) | **Post** /api/v3/schedules/runs/search | Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
[**SchedulerServiceUpdateScheduledJob**](SchedulerServiceAPI.md#SchedulerServiceUpdateScheduledJob) | **Patch** /api/v3/schedules/{schedule_id} | Summary: Update scheduled job Description: Update a single schedule job.



## SchedulerServiceCreateScheduledJob

> Schedulerv3CreateScheduledJobResponse SchedulerServiceCreateScheduledJob(ctx).Schedulerv3CreateScheduledJobRequest(schedulerv3CreateScheduledJobRequest).Execute()

Summary: Create scheduled job Description: Create a new scheduled job with tasks.

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
	schedulerv3CreateScheduledJobRequest := *openapiclient.NewSchedulerv3CreateScheduledJobRequest() // Schedulerv3CreateScheduledJobRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulerServiceAPI.SchedulerServiceCreateScheduledJob(context.Background()).Schedulerv3CreateScheduledJobRequest(schedulerv3CreateScheduledJobRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulerServiceAPI.SchedulerServiceCreateScheduledJob``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulerServiceCreateScheduledJob`: Schedulerv3CreateScheduledJobResponse
	fmt.Fprintf(os.Stdout, "Response from `SchedulerServiceAPI.SchedulerServiceCreateScheduledJob`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSchedulerServiceCreateScheduledJobRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3CreateScheduledJobRequest** | [**Schedulerv3CreateScheduledJobRequest**](Schedulerv3CreateScheduledJobRequest.md) |  | 

### Return type

[**Schedulerv3CreateScheduledJobResponse**](Schedulerv3CreateScheduledJobResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulerServiceDeleteScheduledJob

> Schedulerv3DeleteScheduledJobResponse SchedulerServiceDeleteScheduledJob(ctx, scheduleId).Execute()

Summary: Delete scheduled job Description: Delete a single scheduled job.

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
	scheduleId := "scheduleId_example" // string | Unique ID, required for delete.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulerServiceAPI.SchedulerServiceDeleteScheduledJob(context.Background(), scheduleId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulerServiceAPI.SchedulerServiceDeleteScheduledJob``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulerServiceDeleteScheduledJob`: Schedulerv3DeleteScheduledJobResponse
	fmt.Fprintf(os.Stdout, "Response from `SchedulerServiceAPI.SchedulerServiceDeleteScheduledJob`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**scheduleId** | **string** | Unique ID, required for delete. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSchedulerServiceDeleteScheduledJobRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Schedulerv3DeleteScheduledJobResponse**](Schedulerv3DeleteScheduledJobResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulerServiceGetDependencies

> Schedulerv3GetDependenciesResponse SchedulerServiceGetDependencies(ctx).ConfigType(configType).Execute()

Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use

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
	configType := "configType_example" // string | specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulerServiceAPI.SchedulerServiceGetDependencies(context.Background()).ConfigType(configType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulerServiceAPI.SchedulerServiceGetDependencies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulerServiceGetDependencies`: Schedulerv3GetDependenciesResponse
	fmt.Fprintf(os.Stdout, "Response from `SchedulerServiceAPI.SchedulerServiceGetDependencies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSchedulerServiceGetDependenciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configType** | **string** | specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. | 

### Return type

[**Schedulerv3GetDependenciesResponse**](Schedulerv3GetDependenciesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulerServiceGetDistributionRules

> Schedulerv3GetDistributionRulesResponse SchedulerServiceGetDistributionRules(ctx).Execute()

Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can't be edited if it is used by a scheduled job.

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
	resp, r, err := apiClient.SchedulerServiceAPI.SchedulerServiceGetDistributionRules(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulerServiceAPI.SchedulerServiceGetDistributionRules``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulerServiceGetDistributionRules`: Schedulerv3GetDistributionRulesResponse
	fmt.Fprintf(os.Stdout, "Response from `SchedulerServiceAPI.SchedulerServiceGetDistributionRules`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiSchedulerServiceGetDistributionRulesRequest struct via the builder pattern


### Return type

[**Schedulerv3GetDistributionRulesResponse**](Schedulerv3GetDistributionRulesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulerServiceGetScheduledJobDetails

> Schedulerv3GetScheduledJobResponse SchedulerServiceGetScheduledJobDetails(ctx, scheduleId).Execute()

Summary: Get scheduled job Description: Return a single ScheduledJob in detail.

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
	scheduleId := "scheduleId_example" // string | Used to return a single scheduledjob.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulerServiceAPI.SchedulerServiceGetScheduledJobDetails(context.Background(), scheduleId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulerServiceAPI.SchedulerServiceGetScheduledJobDetails``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulerServiceGetScheduledJobDetails`: Schedulerv3GetScheduledJobResponse
	fmt.Fprintf(os.Stdout, "Response from `SchedulerServiceAPI.SchedulerServiceGetScheduledJobDetails`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**scheduleId** | **string** | Used to return a single scheduledjob. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSchedulerServiceGetScheduledJobDetailsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Schedulerv3GetScheduledJobResponse**](Schedulerv3GetScheduledJobResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulerServiceGetScheduledJobs

> Schedulerv3ScheduledJobSummaryResponse SchedulerServiceGetScheduledJobs(ctx).Offset(offset).Limit(limit).Execute()

Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.

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
	offset := int64(789) // int64 | Optional: the amount to offset the rows by for pagination. (optional)
	limit := int64(789) // int64 | Optional: the max amount of rows to return for pagination. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulerServiceAPI.SchedulerServiceGetScheduledJobs(context.Background()).Offset(offset).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulerServiceAPI.SchedulerServiceGetScheduledJobs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulerServiceGetScheduledJobs`: Schedulerv3ScheduledJobSummaryResponse
	fmt.Fprintf(os.Stdout, "Response from `SchedulerServiceAPI.SchedulerServiceGetScheduledJobs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSchedulerServiceGetScheduledJobsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **int64** | Optional: the amount to offset the rows by for pagination. | 
 **limit** | **int64** | Optional: the max amount of rows to return for pagination. | 

### Return type

[**Schedulerv3ScheduledJobSummaryResponse**](Schedulerv3ScheduledJobSummaryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulerServiceGetSchedulesByReport

> Schedulerv3GetSchedulesByReportResponse SchedulerServiceGetSchedulesByReport(ctx, reportId).Schedulerv3GetSchedulesByReportRequest(schedulerv3GetSchedulesByReportRequest).Execute()

Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.

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
	reportId := "reportId_example" // string | Report ID for the scheduled report.
	schedulerv3GetSchedulesByReportRequest := *openapiclient.NewSchedulerv3GetSchedulesByReportRequest() // Schedulerv3GetSchedulesByReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulerServiceAPI.SchedulerServiceGetSchedulesByReport(context.Background(), reportId).Schedulerv3GetSchedulesByReportRequest(schedulerv3GetSchedulesByReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulerServiceAPI.SchedulerServiceGetSchedulesByReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulerServiceGetSchedulesByReport`: Schedulerv3GetSchedulesByReportResponse
	fmt.Fprintf(os.Stdout, "Response from `SchedulerServiceAPI.SchedulerServiceGetSchedulesByReport`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reportId** | **string** | Report ID for the scheduled report. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSchedulerServiceGetSchedulesByReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **schedulerv3GetSchedulesByReportRequest** | [**Schedulerv3GetSchedulesByReportRequest**](Schedulerv3GetSchedulesByReportRequest.md) |  | 

### Return type

[**Schedulerv3GetSchedulesByReportResponse**](Schedulerv3GetSchedulesByReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulerServiceGetTags

> Schedulerv3GetTagsResponse SchedulerServiceGetTags(ctx).Execute()

Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.

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
	resp, r, err := apiClient.SchedulerServiceAPI.SchedulerServiceGetTags(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulerServiceAPI.SchedulerServiceGetTags``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulerServiceGetTags`: Schedulerv3GetTagsResponse
	fmt.Fprintf(os.Stdout, "Response from `SchedulerServiceAPI.SchedulerServiceGetTags`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiSchedulerServiceGetTagsRequest struct via the builder pattern


### Return type

[**Schedulerv3GetTagsResponse**](Schedulerv3GetTagsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulerServiceSearchScheduledJobs

> Schedulerv3ScheduledJobSummaryResponse SchedulerServiceSearchScheduledJobs(ctx).Schedulerv3SearchScheduledJobsRequest(schedulerv3SearchScheduledJobsRequest).Execute()

Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.

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
	schedulerv3SearchScheduledJobsRequest := *openapiclient.NewSchedulerv3SearchScheduledJobsRequest() // Schedulerv3SearchScheduledJobsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulerServiceAPI.SchedulerServiceSearchScheduledJobs(context.Background()).Schedulerv3SearchScheduledJobsRequest(schedulerv3SearchScheduledJobsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulerServiceAPI.SchedulerServiceSearchScheduledJobs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulerServiceSearchScheduledJobs`: Schedulerv3ScheduledJobSummaryResponse
	fmt.Fprintf(os.Stdout, "Response from `SchedulerServiceAPI.SchedulerServiceSearchScheduledJobs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSchedulerServiceSearchScheduledJobsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3SearchScheduledJobsRequest** | [**Schedulerv3SearchScheduledJobsRequest**](Schedulerv3SearchScheduledJobsRequest.md) |  | 

### Return type

[**Schedulerv3ScheduledJobSummaryResponse**](Schedulerv3ScheduledJobSummaryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulerServiceSearchScheduledTaskRuns

> Schedulerv3SearchScheduledTaskRunsResponse SchedulerServiceSearchScheduledTaskRuns(ctx).Schedulerv3SearchScheduledTaskRunsRequest(schedulerv3SearchScheduledTaskRunsRequest).Execute()

Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status

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
	schedulerv3SearchScheduledTaskRunsRequest := *openapiclient.NewSchedulerv3SearchScheduledTaskRunsRequest() // Schedulerv3SearchScheduledTaskRunsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulerServiceAPI.SchedulerServiceSearchScheduledTaskRuns(context.Background()).Schedulerv3SearchScheduledTaskRunsRequest(schedulerv3SearchScheduledTaskRunsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulerServiceAPI.SchedulerServiceSearchScheduledTaskRuns``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulerServiceSearchScheduledTaskRuns`: Schedulerv3SearchScheduledTaskRunsResponse
	fmt.Fprintf(os.Stdout, "Response from `SchedulerServiceAPI.SchedulerServiceSearchScheduledTaskRuns`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSchedulerServiceSearchScheduledTaskRunsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3SearchScheduledTaskRunsRequest** | [**Schedulerv3SearchScheduledTaskRunsRequest**](Schedulerv3SearchScheduledTaskRunsRequest.md) |  | 

### Return type

[**Schedulerv3SearchScheduledTaskRunsResponse**](Schedulerv3SearchScheduledTaskRunsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulerServiceUpdateScheduledJob

> Schedulerv3UpdateScheduledJobResponse SchedulerServiceUpdateScheduledJob(ctx, scheduleId).Schedulerv3UpdateScheduledJobRequest(schedulerv3UpdateScheduledJobRequest).Execute()

Summary: Update scheduled job Description: Update a single schedule job.

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
	scheduleId := "scheduleId_example" // string | Unique ID, required for update.
	schedulerv3UpdateScheduledJobRequest := *openapiclient.NewSchedulerv3UpdateScheduledJobRequest() // Schedulerv3UpdateScheduledJobRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulerServiceAPI.SchedulerServiceUpdateScheduledJob(context.Background(), scheduleId).Schedulerv3UpdateScheduledJobRequest(schedulerv3UpdateScheduledJobRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulerServiceAPI.SchedulerServiceUpdateScheduledJob``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulerServiceUpdateScheduledJob`: Schedulerv3UpdateScheduledJobResponse
	fmt.Fprintf(os.Stdout, "Response from `SchedulerServiceAPI.SchedulerServiceUpdateScheduledJob`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**scheduleId** | **string** | Unique ID, required for update. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSchedulerServiceUpdateScheduledJobRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **schedulerv3UpdateScheduledJobRequest** | [**Schedulerv3UpdateScheduledJobRequest**](Schedulerv3UpdateScheduledJobRequest.md) |  | 

### Return type

[**Schedulerv3UpdateScheduledJobResponse**](Schedulerv3UpdateScheduledJobResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

