# \WorkflowAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**WorkflowCreateCase**](WorkflowAPI.md#WorkflowCreateCase) | **Post** /api/v3/cases | Summary: Create case Description: Create single case.
[**WorkflowCreateTask**](WorkflowAPI.md#WorkflowCreateTask) | **Post** /api/v3/cases/{case_id}/tasks | Summary: Create task Description: Create single task within a parent case.
[**WorkflowGetCases**](WorkflowAPI.md#WorkflowGetCases) | **Get** /api/v3/cases | Summary: Get cases Description: Return all cases requested.
[**WorkflowGetCasesCount**](WorkflowAPI.md#WorkflowGetCasesCount) | **Post** /api/v3/cases/count | Summary: Get cases count Description: Get case count.
[**WorkflowGetFilename**](WorkflowAPI.md#WorkflowGetFilename) | **Get** /api/v3/cases/{case_id}/tasks/{task_id}/filename | Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
[**WorkflowGetJobsCount**](WorkflowAPI.md#WorkflowGetJobsCount) | **Post** /api/v3/cases/{case_id}/jobs/count | Summary: Get jobs count Description: Get jobs count.
[**WorkflowGetReportResult**](WorkflowAPI.md#WorkflowGetReportResult) | **Get** /api/v3/cases/{case_id}/tasks/{task_id}/result | Summary: Get report result Description: Return a page of results.
[**WorkflowGetTasks**](WorkflowAPI.md#WorkflowGetTasks) | **Get** /api/v3/cases/{case_id}/tasks | Summary: Get tasks Description: Return all tasks requested.
[**WorkflowGetTasksCount**](WorkflowAPI.md#WorkflowGetTasksCount) | **Post** /api/v3/cases/{case_id}/tasks/count | Summary: Get cases count Description: Get case count.
[**WorkflowSearchCases**](WorkflowAPI.md#WorkflowSearchCases) | **Post** /api/v3/cases/search | Summary: Search cases Description: Return a subset of cases.
[**WorkflowSearchReports**](WorkflowAPI.md#WorkflowSearchReports) | **Post** /api/v3/cases/reports | Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
[**WorkflowSearchTasks**](WorkflowAPI.md#WorkflowSearchTasks) | **Post** /api/v3/cases/{case_id}/tasks/search | Summary: Search cases Description: Return a subset of cases.
[**WorkflowUpdateCases**](WorkflowAPI.md#WorkflowUpdateCases) | **Put** /api/v3/cases | Summary: Update cases Description: Update multiple cases in one request.
[**WorkflowUpdateTasks**](WorkflowAPI.md#WorkflowUpdateTasks) | **Put** /api/v3/cases/{case_id}/tasks | Summary: Update tasks Description: Update multiple tasks for the same parent in one request.



## WorkflowCreateCase

> Workflowv3CreateCaseResponse WorkflowCreateCase(ctx).Workflowv3CreateCaseRequest(workflowv3CreateCaseRequest).Execute()

Summary: Create case Description: Create single case.

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
	workflowv3CreateCaseRequest := *openapiclient.NewWorkflowv3CreateCaseRequest() // Workflowv3CreateCaseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowCreateCase(context.Background()).Workflowv3CreateCaseRequest(workflowv3CreateCaseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowCreateCase``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowCreateCase`: Workflowv3CreateCaseResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowCreateCase`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowCreateCaseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3CreateCaseRequest** | [**Workflowv3CreateCaseRequest**](Workflowv3CreateCaseRequest.md) |  | 

### Return type

[**Workflowv3CreateCaseResponse**](Workflowv3CreateCaseResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowCreateTask

> Workflowv3CreateTaskResponse WorkflowCreateTask(ctx, caseId).Workflowv3CreateTaskRequest(workflowv3CreateTaskRequest).Execute()

Summary: Create task Description: Create single task within a parent case.

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
	caseId := "caseId_example" // string | Create tasks with common parent.
	workflowv3CreateTaskRequest := *openapiclient.NewWorkflowv3CreateTaskRequest() // Workflowv3CreateTaskRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowCreateTask(context.Background(), caseId).Workflowv3CreateTaskRequest(workflowv3CreateTaskRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowCreateTask``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowCreateTask`: Workflowv3CreateTaskResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowCreateTask`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**caseId** | **string** | Create tasks with common parent. | 

### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowCreateTaskRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **workflowv3CreateTaskRequest** | [**Workflowv3CreateTaskRequest**](Workflowv3CreateTaskRequest.md) |  | 

### Return type

[**Workflowv3CreateTaskResponse**](Workflowv3CreateTaskResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowGetCases

> Workflowv3CaseListResponse WorkflowGetCases(ctx).CaseId(caseId).SortBy(sortBy).Offset(offset).Limit(limit).Execute()

Summary: Get cases Description: Return all cases requested.

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
	caseId := "caseId_example" // string | Optional case_id to get a response of an array of one member. (optional)
	sortBy := "sortBy_example" // string | Optional field to sort by | first character determines ascending (>) or descending (<). (optional)
	offset := int32(56) // int32 | Optional starting point for the page of data. (optional)
	limit := int32(56) // int32 | Optional page size. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowGetCases(context.Background()).CaseId(caseId).SortBy(sortBy).Offset(offset).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowGetCases``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowGetCases`: Workflowv3CaseListResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowGetCases`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowGetCasesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **string** | Optional case_id to get a response of an array of one member. | 
 **sortBy** | **string** | Optional field to sort by | first character determines ascending (&gt;) or descending (&lt;). | 
 **offset** | **int32** | Optional starting point for the page of data. | 
 **limit** | **int32** | Optional page size. | 

### Return type

[**Workflowv3CaseListResponse**](Workflowv3CaseListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowGetCasesCount

> Workflowv3GetCasesCountResponse WorkflowGetCasesCount(ctx).Workflowv3GetCasesCountRequest(workflowv3GetCasesCountRequest).Execute()

Summary: Get cases count Description: Get case count.

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
	workflowv3GetCasesCountRequest := *openapiclient.NewWorkflowv3GetCasesCountRequest() // Workflowv3GetCasesCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowGetCasesCount(context.Background()).Workflowv3GetCasesCountRequest(workflowv3GetCasesCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowGetCasesCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowGetCasesCount`: Workflowv3GetCasesCountResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowGetCasesCount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowGetCasesCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3GetCasesCountRequest** | [**Workflowv3GetCasesCountRequest**](Workflowv3GetCasesCountRequest.md) |  | 

### Return type

[**Workflowv3GetCasesCountResponse**](Workflowv3GetCasesCountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowGetFilename

> Workflowv3GetFilenameResponse WorkflowGetFilename(ctx, caseId, taskId).Execute()

Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.

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
	caseId := "caseId_example" // string | Can be \"*\" if JWT token contains the case_id.
	taskId := "taskId_example" // string | Can be \"*\" if JWT token contains the task_id.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowGetFilename(context.Background(), caseId, taskId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowGetFilename``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowGetFilename`: Workflowv3GetFilenameResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowGetFilename`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**caseId** | **string** | Can be \&quot;*\&quot; if JWT token contains the case_id. | 
**taskId** | **string** | Can be \&quot;*\&quot; if JWT token contains the task_id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowGetFilenameRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Workflowv3GetFilenameResponse**](Workflowv3GetFilenameResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowGetJobsCount

> Workflowv3GetJobsCountResponse WorkflowGetJobsCount(ctx, caseId).Workflowv3GetJobsCountRequest(workflowv3GetJobsCountRequest).Execute()

Summary: Get jobs count Description: Get jobs count.

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
	caseId := "caseId_example" // string | Case ID - can be * for all
	workflowv3GetJobsCountRequest := *openapiclient.NewWorkflowv3GetJobsCountRequest() // Workflowv3GetJobsCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowGetJobsCount(context.Background(), caseId).Workflowv3GetJobsCountRequest(workflowv3GetJobsCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowGetJobsCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowGetJobsCount`: Workflowv3GetJobsCountResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowGetJobsCount`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**caseId** | **string** | Case ID - can be * for all | 

### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowGetJobsCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **workflowv3GetJobsCountRequest** | [**Workflowv3GetJobsCountRequest**](Workflowv3GetJobsCountRequest.md) |  | 

### Return type

[**Workflowv3GetJobsCountResponse**](Workflowv3GetJobsCountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowGetReportResult

> Workflowv3GetReportResultResponse WorkflowGetReportResult(ctx, caseId, taskId).Offset(offset).Limit(limit).Execute()

Summary: Get report result Description: Return a page of results.

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
	caseId := "caseId_example" // string | ID to get the case  (read-only).
	taskId := "taskId_example" // string | ID to get the task for case(read-only).
	offset := int32(56) // int32 | Optional starting point for the page of data. (optional)
	limit := int32(56) // int32 | Optional page size. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowGetReportResult(context.Background(), caseId, taskId).Offset(offset).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowGetReportResult``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowGetReportResult`: Workflowv3GetReportResultResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowGetReportResult`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**caseId** | **string** | ID to get the case  (read-only). | 
**taskId** | **string** | ID to get the task for case(read-only). | 

### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowGetReportResultRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **offset** | **int32** | Optional starting point for the page of data. | 
 **limit** | **int32** | Optional page size. | 

### Return type

[**Workflowv3GetReportResultResponse**](Workflowv3GetReportResultResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowGetTasks

> Workflowv3TaskListResponse WorkflowGetTasks(ctx, caseId).TaskId(taskId).Execute()

Summary: Get tasks Description: Return all tasks requested.

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
	caseId := "caseId_example" // string | Mandaroty: The parent case which contains the tasks.
	taskId := "taskId_example" // string | Optional: task_id to return an array of one. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowGetTasks(context.Background(), caseId).TaskId(taskId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowGetTasks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowGetTasks`: Workflowv3TaskListResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowGetTasks`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**caseId** | **string** | Mandaroty: The parent case which contains the tasks. | 

### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowGetTasksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **taskId** | **string** | Optional: task_id to return an array of one. | 

### Return type

[**Workflowv3TaskListResponse**](Workflowv3TaskListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowGetTasksCount

> Workflowv3GetTasksCountResponse WorkflowGetTasksCount(ctx, caseId).Workflowv3GetTasksCountRequest(workflowv3GetTasksCountRequest).Execute()

Summary: Get cases count Description: Get case count.

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
	caseId := "caseId_example" // string | Case ID - can be * for all
	workflowv3GetTasksCountRequest := *openapiclient.NewWorkflowv3GetTasksCountRequest() // Workflowv3GetTasksCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowGetTasksCount(context.Background(), caseId).Workflowv3GetTasksCountRequest(workflowv3GetTasksCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowGetTasksCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowGetTasksCount`: Workflowv3GetTasksCountResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowGetTasksCount`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**caseId** | **string** | Case ID - can be * for all | 

### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowGetTasksCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **workflowv3GetTasksCountRequest** | [**Workflowv3GetTasksCountRequest**](Workflowv3GetTasksCountRequest.md) |  | 

### Return type

[**Workflowv3GetTasksCountResponse**](Workflowv3GetTasksCountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowSearchCases

> Workflowv3CaseListResponse WorkflowSearchCases(ctx).Workflowv3SearchCasesRequest(workflowv3SearchCasesRequest).Execute()

Summary: Search cases Description: Return a subset of cases.

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
	workflowv3SearchCasesRequest := *openapiclient.NewWorkflowv3SearchCasesRequest() // Workflowv3SearchCasesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowSearchCases(context.Background()).Workflowv3SearchCasesRequest(workflowv3SearchCasesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowSearchCases``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowSearchCases`: Workflowv3CaseListResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowSearchCases`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowSearchCasesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3SearchCasesRequest** | [**Workflowv3SearchCasesRequest**](Workflowv3SearchCasesRequest.md) |  | 

### Return type

[**Workflowv3CaseListResponse**](Workflowv3CaseListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowSearchReports

> Workflowv3SearchReportsResponse WorkflowSearchReports(ctx).Workflowv3SearchCasesRequest(workflowv3SearchCasesRequest).Execute()

Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks

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
	workflowv3SearchCasesRequest := *openapiclient.NewWorkflowv3SearchCasesRequest() // Workflowv3SearchCasesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowSearchReports(context.Background()).Workflowv3SearchCasesRequest(workflowv3SearchCasesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowSearchReports``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowSearchReports`: Workflowv3SearchReportsResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowSearchReports`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowSearchReportsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3SearchCasesRequest** | [**Workflowv3SearchCasesRequest**](Workflowv3SearchCasesRequest.md) |  | 

### Return type

[**Workflowv3SearchReportsResponse**](Workflowv3SearchReportsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowSearchTasks

> Workflowv3TaskListResponse WorkflowSearchTasks(ctx, caseId).Workflowv3SearchTasksRequest(workflowv3SearchTasksRequest).Execute()

Summary: Search cases Description: Return a subset of cases.

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
	caseId := "caseId_example" // string | Case ID - can be * for all
	workflowv3SearchTasksRequest := *openapiclient.NewWorkflowv3SearchTasksRequest() // Workflowv3SearchTasksRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowSearchTasks(context.Background(), caseId).Workflowv3SearchTasksRequest(workflowv3SearchTasksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowSearchTasks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowSearchTasks`: Workflowv3TaskListResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowSearchTasks`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**caseId** | **string** | Case ID - can be * for all | 

### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowSearchTasksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **workflowv3SearchTasksRequest** | [**Workflowv3SearchTasksRequest**](Workflowv3SearchTasksRequest.md) |  | 

### Return type

[**Workflowv3TaskListResponse**](Workflowv3TaskListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowUpdateCases

> Workflowv3UpdateCasesResponse WorkflowUpdateCases(ctx).Workflowv3UpdateCasesRequest(workflowv3UpdateCasesRequest).Execute()

Summary: Update cases Description: Update multiple cases in one request.

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
	workflowv3UpdateCasesRequest := *openapiclient.NewWorkflowv3UpdateCasesRequest() // Workflowv3UpdateCasesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowUpdateCases(context.Background()).Workflowv3UpdateCasesRequest(workflowv3UpdateCasesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowUpdateCases``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowUpdateCases`: Workflowv3UpdateCasesResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowUpdateCases`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowUpdateCasesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3UpdateCasesRequest** | [**Workflowv3UpdateCasesRequest**](Workflowv3UpdateCasesRequest.md) |  | 

### Return type

[**Workflowv3UpdateCasesResponse**](Workflowv3UpdateCasesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowUpdateTasks

> Workflowv3UpdateTasksResponse WorkflowUpdateTasks(ctx, caseId).Workflowv3UpdateTasksRequest(workflowv3UpdateTasksRequest).Execute()

Summary: Update tasks Description: Update multiple tasks for the same parent in one request.

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
	caseId := "caseId_example" // string | Update tasks belonging to common parent.
	workflowv3UpdateTasksRequest := *openapiclient.NewWorkflowv3UpdateTasksRequest() // Workflowv3UpdateTasksRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowAPI.WorkflowUpdateTasks(context.Background(), caseId).Workflowv3UpdateTasksRequest(workflowv3UpdateTasksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowAPI.WorkflowUpdateTasks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WorkflowUpdateTasks`: Workflowv3UpdateTasksResponse
	fmt.Fprintf(os.Stdout, "Response from `WorkflowAPI.WorkflowUpdateTasks`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**caseId** | **string** | Update tasks belonging to common parent. | 

### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowUpdateTasksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **workflowv3UpdateTasksRequest** | [**Workflowv3UpdateTasksRequest**](Workflowv3UpdateTasksRequest.md) |  | 

### Return type

[**Workflowv3UpdateTasksResponse**](Workflowv3UpdateTasksResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

