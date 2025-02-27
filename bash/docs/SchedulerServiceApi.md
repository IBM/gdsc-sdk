# SchedulerServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulerServiceCreateScheduledJob**](SchedulerServiceApi.md#schedulerServiceCreateScheduledJob) | **POST** /api/v3/schedules | Summary: Create scheduled job
Description: Create a new scheduled job with tasks.
[**schedulerServiceDeleteScheduledJob**](SchedulerServiceApi.md#schedulerServiceDeleteScheduledJob) | **DELETE** /api/v3/schedules/{schedule_id} | Summary: Delete scheduled job
Description: Delete a single scheduled job.
[**schedulerServiceGetDependencies**](SchedulerServiceApi.md#schedulerServiceGetDependencies) | **GET** /api/v3/schedules/dependencies | Summary: Get dependencies
Description: returns IDs of distribution rules, response templates, or processing rules that are in use
[**schedulerServiceGetDistributionRules**](SchedulerServiceApi.md#schedulerServiceGetDistributionRules) | **GET** /api/v3/schedules/distribution_rules | Summary: Get distribution rules
Description: Return a list of distribution rule IDs that are used by the scheduler
Distribution rules can&#39;t be edited if it is used by a scheduled job.
[**schedulerServiceGetScheduledJobDetails**](SchedulerServiceApi.md#schedulerServiceGetScheduledJobDetails) | **GET** /api/v3/schedules/{schedule_id}/details | Summary: Get scheduled job
Description: Return a single ScheduledJob in detail.
[**schedulerServiceGetScheduledJobs**](SchedulerServiceApi.md#schedulerServiceGetScheduledJobs) | **GET** /api/v3/schedules | Summary: Get scheduled jobs
Description: Return a list of scheduled jobs and the linked tasks.
[**schedulerServiceGetSchedulesByReport**](SchedulerServiceApi.md#schedulerServiceGetSchedulesByReport) | **POST** /api/v3/schedules/searchByReport/{report_id} | Summary: Get schedules by report
Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
[**schedulerServiceGetTags**](SchedulerServiceApi.md#schedulerServiceGetTags) | **GET** /api/v3/schedules/tags | Summary: Get tags
Description: Return an array of all the unique tags from scheduled jobs.
[**schedulerServiceSearchScheduledJobs**](SchedulerServiceApi.md#schedulerServiceSearchScheduledJobs) | **POST** /api/v3/schedules/search | Summary: Search scheduled jobs
Description: Return a filtered list of scheduled jobs and the linked tasks.
[**schedulerServiceSearchScheduledTaskRuns**](SchedulerServiceApi.md#schedulerServiceSearchScheduledTaskRuns) | **POST** /api/v3/schedules/runs/search | Summary: Search scheduled task runs
Description: Return a list of scheduled task run, start date, end date, status
[**schedulerServiceUpdateScheduledJob**](SchedulerServiceApi.md#schedulerServiceUpdateScheduledJob) | **PATCH** /api/v3/schedules/{schedule_id} | Summary: Update scheduled job
Description: Update a single schedule job.



## schedulerServiceCreateScheduledJob

Summary: Create scheduled job
Description: Create a new scheduled job with tasks.

### Example

```bash
 schedulerServiceCreateScheduledJob
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulerServiceDeleteScheduledJob

Summary: Delete scheduled job
Description: Delete a single scheduled job.

### Example

```bash
 schedulerServiceDeleteScheduledJob schedule_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **string** | Unique ID, required for delete. | [default to null]

### Return type

[**Schedulerv3DeleteScheduledJobResponse**](Schedulerv3DeleteScheduledJobResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulerServiceGetDependencies

Summary: Get dependencies
Description: returns IDs of distribution rules, response templates, or processing rules that are in use

### Example

```bash
 schedulerServiceGetDependencies  config_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configType** | **string** | specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. | [optional] [default to null]

### Return type

[**Schedulerv3GetDependenciesResponse**](Schedulerv3GetDependenciesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulerServiceGetDistributionRules

Summary: Get distribution rules
Description: Return a list of distribution rule IDs that are used by the scheduler
Distribution rules can't be edited if it is used by a scheduled job.

### Example

```bash
 schedulerServiceGetDistributionRules
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Schedulerv3GetDistributionRulesResponse**](Schedulerv3GetDistributionRulesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulerServiceGetScheduledJobDetails

Summary: Get scheduled job
Description: Return a single ScheduledJob in detail.

### Example

```bash
 schedulerServiceGetScheduledJobDetails schedule_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **string** | Used to return a single scheduledjob. | [default to null]

### Return type

[**Schedulerv3GetScheduledJobResponse**](Schedulerv3GetScheduledJobResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulerServiceGetScheduledJobs

Summary: Get scheduled jobs
Description: Return a list of scheduled jobs and the linked tasks.

### Example

```bash
 schedulerServiceGetScheduledJobs  Offset=value  Limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **integer** | Optional: the amount to offset the rows by for pagination. | [optional] [default to null]
 **limit** | **integer** | Optional: the max amount of rows to return for pagination. | [optional] [default to null]

### Return type

[**Schedulerv3ScheduledJobSummaryResponse**](Schedulerv3ScheduledJobSummaryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulerServiceGetSchedulesByReport

Summary: Get schedules by report
Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.

### Example

```bash
 schedulerServiceGetSchedulesByReport report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | Report ID for the scheduled report. | [default to null]
 **schedulerv3GetSchedulesByReportRequest** | [**Schedulerv3GetSchedulesByReportRequest**](Schedulerv3GetSchedulesByReportRequest.md) |  |

### Return type

[**Schedulerv3GetSchedulesByReportResponse**](Schedulerv3GetSchedulesByReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulerServiceGetTags

Summary: Get tags
Description: Return an array of all the unique tags from scheduled jobs.

### Example

```bash
 schedulerServiceGetTags
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Schedulerv3GetTagsResponse**](Schedulerv3GetTagsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulerServiceSearchScheduledJobs

Summary: Search scheduled jobs
Description: Return a filtered list of scheduled jobs and the linked tasks.

### Example

```bash
 schedulerServiceSearchScheduledJobs
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulerServiceSearchScheduledTaskRuns

Summary: Search scheduled task runs
Description: Return a list of scheduled task run, start date, end date, status

### Example

```bash
 schedulerServiceSearchScheduledTaskRuns
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulerServiceUpdateScheduledJob

Summary: Update scheduled job
Description: Update a single schedule job.

### Example

```bash
 schedulerServiceUpdateScheduledJob schedule_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **string** | Unique ID, required for update. | [default to null]
 **schedulerv3UpdateScheduledJobRequest** | [**Schedulerv3UpdateScheduledJobRequest**](Schedulerv3UpdateScheduledJobRequest.md) |  |

### Return type

[**Schedulerv3UpdateScheduledJobResponse**](Schedulerv3UpdateScheduledJobResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

