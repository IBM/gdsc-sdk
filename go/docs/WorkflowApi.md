# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**WorkflowCreateCase**](WorkflowApi.md#WorkflowCreateCase) | **Post** /api/v3/cases | Summary: Create case Description: Create single case.
[**WorkflowCreateTask**](WorkflowApi.md#WorkflowCreateTask) | **Post** /api/v3/cases/{case_id}/tasks | Summary: Create task Description: Create single task within a parent case.
[**WorkflowGetCases**](WorkflowApi.md#WorkflowGetCases) | **Get** /api/v3/cases | Summary: Get cases Description: Return all cases requested.
[**WorkflowGetCasesCount**](WorkflowApi.md#WorkflowGetCasesCount) | **Post** /api/v3/cases/count | Summary: Get cases count Description: Get case count.
[**WorkflowGetFilename**](WorkflowApi.md#WorkflowGetFilename) | **Get** /api/v3/cases/{case_id}/tasks/{task_id}/filename | Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
[**WorkflowGetJobsCount**](WorkflowApi.md#WorkflowGetJobsCount) | **Post** /api/v3/cases/{case_id}/jobs/count | Summary: Get jobs count Description: Get jobs count.
[**WorkflowGetReportResult**](WorkflowApi.md#WorkflowGetReportResult) | **Get** /api/v3/cases/{case_id}/tasks/{task_id}/result | Summary: Get report result Description: Return a page of results.
[**WorkflowGetTasks**](WorkflowApi.md#WorkflowGetTasks) | **Get** /api/v3/cases/{case_id}/tasks | Summary: Get tasks Description: Return all tasks requested.
[**WorkflowGetTasksCount**](WorkflowApi.md#WorkflowGetTasksCount) | **Post** /api/v3/cases/{case_id}/tasks/count | Summary: Get cases count Description: Get case count.
[**WorkflowSearchCases**](WorkflowApi.md#WorkflowSearchCases) | **Post** /api/v3/cases/search | Summary: Search cases Description: Return a subset of cases.
[**WorkflowSearchReports**](WorkflowApi.md#WorkflowSearchReports) | **Post** /api/v3/cases/reports | Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
[**WorkflowSearchTasks**](WorkflowApi.md#WorkflowSearchTasks) | **Post** /api/v3/cases/{case_id}/tasks/search | Summary: Search cases Description: Return a subset of cases.
[**WorkflowUpdateCases**](WorkflowApi.md#WorkflowUpdateCases) | **Put** /api/v3/cases | Summary: Update cases Description: Update multiple cases in one request.
[**WorkflowUpdateTasks**](WorkflowApi.md#WorkflowUpdateTasks) | **Put** /api/v3/cases/{case_id}/tasks | Summary: Update tasks Description: Update multiple tasks for the same parent in one request.

# **WorkflowCreateCase**
> Workflowv3CreateCaseResponse WorkflowCreateCase(ctx, body)
Summary: Create case Description: Create single case.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Workflowv3CreateCaseRequest**](Workflowv3CreateCaseRequest.md)|  | 

### Return type

[**Workflowv3CreateCaseResponse**](workflowv3CreateCaseResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowCreateTask**
> Workflowv3CreateTaskResponse WorkflowCreateTask(ctx, body, caseId)
Summary: Create task Description: Create single task within a parent case.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Workflowv3CreateTaskRequest**](Workflowv3CreateTaskRequest.md)|  | 
  **caseId** | **string**| Create tasks with common parent. | 

### Return type

[**Workflowv3CreateTaskResponse**](workflowv3CreateTaskResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowGetCases**
> Workflowv3CaseListResponse WorkflowGetCases(ctx, optional)
Summary: Get cases Description: Return all cases requested.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***WorkflowApiWorkflowGetCasesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a WorkflowApiWorkflowGetCasesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **optional.String**| Optional case_id to get a response of an array of one member. | 
 **sortBy** | **optional.String**| Optional field to sort by | first character determines ascending (&gt;) or descending (&lt;). | 
 **offset** | **optional.Int32**| Optional starting point for the page of data. | 
 **limit** | **optional.Int32**| Optional page size. | 

### Return type

[**Workflowv3CaseListResponse**](workflowv3CaseListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowGetCasesCount**
> Workflowv3GetCasesCountResponse WorkflowGetCasesCount(ctx, body)
Summary: Get cases count Description: Get case count.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Workflowv3GetCasesCountRequest**](Workflowv3GetCasesCountRequest.md)|  | 

### Return type

[**Workflowv3GetCasesCountResponse**](workflowv3GetCasesCountResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowGetFilename**
> Workflowv3GetFilenameResponse WorkflowGetFilename(ctx, caseId, taskId)
Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **caseId** | **string**| Can be \&quot;*\&quot; if JWT token contains the case_id. | 
  **taskId** | **string**| Can be \&quot;*\&quot; if JWT token contains the task_id. | 

### Return type

[**Workflowv3GetFilenameResponse**](workflowv3GetFilenameResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowGetJobsCount**
> Workflowv3GetJobsCountResponse WorkflowGetJobsCount(ctx, body, caseId)
Summary: Get jobs count Description: Get jobs count.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Workflowv3GetJobsCountRequest**](Workflowv3GetJobsCountRequest.md)|  | 
  **caseId** | **string**| Case ID - can be * for all | 

### Return type

[**Workflowv3GetJobsCountResponse**](workflowv3GetJobsCountResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowGetReportResult**
> Workflowv3GetReportResultResponse WorkflowGetReportResult(ctx, caseId, taskId, optional)
Summary: Get report result Description: Return a page of results.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **caseId** | **string**| ID to get the case  (read-only). | 
  **taskId** | **string**| ID to get the task for case(read-only). | 
 **optional** | ***WorkflowApiWorkflowGetReportResultOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a WorkflowApiWorkflowGetReportResultOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **offset** | **optional.Int32**| Optional starting point for the page of data. | 
 **limit** | **optional.Int32**| Optional page size. | 

### Return type

[**Workflowv3GetReportResultResponse**](workflowv3GetReportResultResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowGetTasks**
> Workflowv3TaskListResponse WorkflowGetTasks(ctx, caseId, optional)
Summary: Get tasks Description: Return all tasks requested.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **caseId** | **string**| Mandaroty: The parent case which contains the tasks. | 
 **optional** | ***WorkflowApiWorkflowGetTasksOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a WorkflowApiWorkflowGetTasksOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **taskId** | **optional.String**| Optional: task_id to return an array of one. | 

### Return type

[**Workflowv3TaskListResponse**](workflowv3TaskListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowGetTasksCount**
> Workflowv3GetTasksCountResponse WorkflowGetTasksCount(ctx, body, caseId)
Summary: Get cases count Description: Get case count.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Workflowv3GetTasksCountRequest**](Workflowv3GetTasksCountRequest.md)|  | 
  **caseId** | **string**| Case ID - can be * for all | 

### Return type

[**Workflowv3GetTasksCountResponse**](workflowv3GetTasksCountResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowSearchCases**
> Workflowv3CaseListResponse WorkflowSearchCases(ctx, body)
Summary: Search cases Description: Return a subset of cases.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Workflowv3SearchCasesRequest**](Workflowv3SearchCasesRequest.md)|  | 

### Return type

[**Workflowv3CaseListResponse**](workflowv3CaseListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowSearchReports**
> Workflowv3SearchReportsResponse WorkflowSearchReports(ctx, body)
Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Workflowv3SearchCasesRequest**](Workflowv3SearchCasesRequest.md)|  | 

### Return type

[**Workflowv3SearchReportsResponse**](workflowv3SearchReportsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowSearchTasks**
> Workflowv3TaskListResponse WorkflowSearchTasks(ctx, body, caseId)
Summary: Search cases Description: Return a subset of cases.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Workflowv3SearchTasksRequest**](Workflowv3SearchTasksRequest.md)|  | 
  **caseId** | **string**| Case ID - can be * for all | 

### Return type

[**Workflowv3TaskListResponse**](workflowv3TaskListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowUpdateCases**
> Workflowv3UpdateCasesResponse WorkflowUpdateCases(ctx, body)
Summary: Update cases Description: Update multiple cases in one request.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Workflowv3UpdateCasesRequest**](Workflowv3UpdateCasesRequest.md)|  | 

### Return type

[**Workflowv3UpdateCasesResponse**](workflowv3UpdateCasesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WorkflowUpdateTasks**
> Workflowv3UpdateTasksResponse WorkflowUpdateTasks(ctx, body, caseId)
Summary: Update tasks Description: Update multiple tasks for the same parent in one request.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Workflowv3UpdateTasksRequest**](Workflowv3UpdateTasksRequest.md)|  | 
  **caseId** | **string**| Update tasks belonging to common parent. | 

### Return type

[**Workflowv3UpdateTasksResponse**](workflowv3UpdateTasksResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

