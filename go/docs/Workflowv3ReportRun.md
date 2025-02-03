# Workflowv3ReportRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateEnd** | [**time.Time**](time.Time.md) | When the job finished. | [optional] [default to null]
**DateStart** | [**time.Time**](time.Time.md) | When the job started. | [optional] [default to null]
**Detail** | **string** | Job status detail. | [optional] [default to null]
**QueryFrom** | **string** | Absolute value of the runtime parameter for time period (time from). | [optional] [default to null]
**QueryTo** | **string** | Absolute value of the runtime parameter for time period (time to). | [optional] [default to null]
**ReportFilters** | [***Reportsv3ReportFilterBrackets**](reportsv3ReportFilterBrackets.md) |  | [optional] [default to null]
**ReportId** | **string** | Report ID. | [optional] [default to null]
**ReportName** | **string** | Report name. | [optional] [default to null]
**ReportResultFileName** | **string** | The report result file name. | [optional] [default to null]
**RunId** | **string** | The identifier of the run. | [optional] [default to null]
**ScheduledJobId** | **string** | The ScheduledJob identifier. | [optional] [default to null]
**ScheduledJobName** | **string** | The ScheduledJob name identifier. | [optional] [default to null]
**ScheduledTaskId** | **string** | The task within the ScheduledJob. | [optional] [default to null]
**ScheduledTaskType** | [***Schedulerv3TaskType**](schedulerv3TaskType.md) |  | [optional] [default to null]
**Status** | **int32** | Job status. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

