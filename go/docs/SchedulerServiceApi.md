# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SchedulerServiceCreateScheduledJob**](SchedulerServiceApi.md#SchedulerServiceCreateScheduledJob) | **Post** /api/v3/schedules | Summary: Create scheduled job Description: Create a new scheduled job with tasks.
[**SchedulerServiceDeleteScheduledJob**](SchedulerServiceApi.md#SchedulerServiceDeleteScheduledJob) | **Delete** /api/v3/schedules/{schedule_id} | Summary: Delete scheduled job Description: Delete a single scheduled job.
[**SchedulerServiceGetDependencies**](SchedulerServiceApi.md#SchedulerServiceGetDependencies) | **Get** /api/v3/schedules/dependencies | Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
[**SchedulerServiceGetDistributionRules**](SchedulerServiceApi.md#SchedulerServiceGetDistributionRules) | **Get** /api/v3/schedules/distribution_rules | Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can&#x27;t be edited if it is used by a scheduled job.
[**SchedulerServiceGetScheduledJobDetails**](SchedulerServiceApi.md#SchedulerServiceGetScheduledJobDetails) | **Get** /api/v3/schedules/{schedule_id}/details | Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
[**SchedulerServiceGetScheduledJobs**](SchedulerServiceApi.md#SchedulerServiceGetScheduledJobs) | **Get** /api/v3/schedules | Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
[**SchedulerServiceGetSchedulesByReport**](SchedulerServiceApi.md#SchedulerServiceGetSchedulesByReport) | **Post** /api/v3/schedules/searchByReport/{report_id} | Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
[**SchedulerServiceGetTags**](SchedulerServiceApi.md#SchedulerServiceGetTags) | **Get** /api/v3/schedules/tags | Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
[**SchedulerServiceSearchScheduledJobs**](SchedulerServiceApi.md#SchedulerServiceSearchScheduledJobs) | **Post** /api/v3/schedules/search | Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
[**SchedulerServiceSearchScheduledTaskRuns**](SchedulerServiceApi.md#SchedulerServiceSearchScheduledTaskRuns) | **Post** /api/v3/schedules/runs/search | Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
[**SchedulerServiceUpdateScheduledJob**](SchedulerServiceApi.md#SchedulerServiceUpdateScheduledJob) | **Patch** /api/v3/schedules/{schedule_id} | Summary: Update scheduled job Description: Update a single schedule job.

# **SchedulerServiceCreateScheduledJob**
> Schedulerv3CreateScheduledJobResponse SchedulerServiceCreateScheduledJob(ctx, body)
Summary: Create scheduled job Description: Create a new scheduled job with tasks.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Schedulerv3CreateScheduledJobRequest**](Schedulerv3CreateScheduledJobRequest.md)|  | 

### Return type

[**Schedulerv3CreateScheduledJobResponse**](schedulerv3CreateScheduledJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulerServiceDeleteScheduledJob**
> Schedulerv3DeleteScheduledJobResponse SchedulerServiceDeleteScheduledJob(ctx, scheduleId)
Summary: Delete scheduled job Description: Delete a single scheduled job.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **scheduleId** | **string**| Unique ID, required for delete. | 

### Return type

[**Schedulerv3DeleteScheduledJobResponse**](schedulerv3DeleteScheduledJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulerServiceGetDependencies**
> Schedulerv3GetDependenciesResponse SchedulerServiceGetDependencies(ctx, optional)
Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***SchedulerServiceApiSchedulerServiceGetDependenciesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a SchedulerServiceApiSchedulerServiceGetDependenciesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configType** | **optional.String**| specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. | 

### Return type

[**Schedulerv3GetDependenciesResponse**](schedulerv3GetDependenciesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulerServiceGetDistributionRules**
> Schedulerv3GetDistributionRulesResponse SchedulerServiceGetDistributionRules(ctx, )
Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can't be edited if it is used by a scheduled job.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Schedulerv3GetDistributionRulesResponse**](schedulerv3GetDistributionRulesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulerServiceGetScheduledJobDetails**
> Schedulerv3GetScheduledJobResponse SchedulerServiceGetScheduledJobDetails(ctx, scheduleId)
Summary: Get scheduled job Description: Return a single ScheduledJob in detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **scheduleId** | **string**| Used to return a single scheduledjob. | 

### Return type

[**Schedulerv3GetScheduledJobResponse**](schedulerv3GetScheduledJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulerServiceGetScheduledJobs**
> Schedulerv3ScheduledJobSummaryResponse SchedulerServiceGetScheduledJobs(ctx, optional)
Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***SchedulerServiceApiSchedulerServiceGetScheduledJobsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a SchedulerServiceApiSchedulerServiceGetScheduledJobsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **optional.Int64**| Optional: the amount to offset the rows by for pagination. | 
 **limit** | **optional.Int64**| Optional: the max amount of rows to return for pagination. | 

### Return type

[**Schedulerv3ScheduledJobSummaryResponse**](schedulerv3ScheduledJobSummaryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulerServiceGetSchedulesByReport**
> Schedulerv3GetSchedulesByReportResponse SchedulerServiceGetSchedulesByReport(ctx, body, reportId)
Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Schedulerv3GetSchedulesByReportRequest**](Schedulerv3GetSchedulesByReportRequest.md)|  | 
  **reportId** | **string**| Report ID for the scheduled report. | 

### Return type

[**Schedulerv3GetSchedulesByReportResponse**](schedulerv3GetSchedulesByReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulerServiceGetTags**
> Schedulerv3GetTagsResponse SchedulerServiceGetTags(ctx, )
Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Schedulerv3GetTagsResponse**](schedulerv3GetTagsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulerServiceSearchScheduledJobs**
> Schedulerv3ScheduledJobSummaryResponse SchedulerServiceSearchScheduledJobs(ctx, body)
Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Schedulerv3SearchScheduledJobsRequest**](Schedulerv3SearchScheduledJobsRequest.md)|  | 

### Return type

[**Schedulerv3ScheduledJobSummaryResponse**](schedulerv3ScheduledJobSummaryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulerServiceSearchScheduledTaskRuns**
> Schedulerv3SearchScheduledTaskRunsResponse SchedulerServiceSearchScheduledTaskRuns(ctx, body)
Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Schedulerv3SearchScheduledTaskRunsRequest**](Schedulerv3SearchScheduledTaskRunsRequest.md)|  | 

### Return type

[**Schedulerv3SearchScheduledTaskRunsResponse**](schedulerv3SearchScheduledTaskRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulerServiceUpdateScheduledJob**
> Schedulerv3UpdateScheduledJobResponse SchedulerServiceUpdateScheduledJob(ctx, body, scheduleId)
Summary: Update scheduled job Description: Update a single schedule job.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Schedulerv3UpdateScheduledJobRequest**](Schedulerv3UpdateScheduledJobRequest.md)|  | 
  **scheduleId** | **string**| Unique ID, required for update. | 

### Return type

[**Schedulerv3UpdateScheduledJobResponse**](schedulerv3UpdateScheduledJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

